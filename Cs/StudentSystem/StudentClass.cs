using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;
using System.Data;

namespace StudentSystem
{
    internal class StudentClass
    {
        DBconnect connect = new DBconnect();

        public bool insertStudent(string firstName, string lastName, DateTime birthDate, string gender, string phone, string address, byte[] img)
        {
            MySqlCommand command = new MySqlCommand("INSERT INTO `student` (`FirstName`, `LastName`, `Birthdate`, `Gender`, `Phone`, `Address`, `Photo`) VALUES(@fn, @ln, @bd, @gd, @ph, @adr, @img)", connect.getconnection);
            
            command.Parameters.Add("@fn", MySqlDbType.VarChar).Value = firstName;
            command.Parameters.Add("@ln", MySqlDbType.VarChar).Value = lastName;
            command.Parameters.Add("@bd", MySqlDbType.Date).Value = birthDate;
            command.Parameters.Add("@gd", MySqlDbType.VarChar).Value = gender;
            command.Parameters.Add("@ph", MySqlDbType.VarChar).Value = phone;
            command.Parameters.Add("@adr", MySqlDbType.VarChar).Value = address;
            command.Parameters.Add("@img", MySqlDbType.Blob).Value = img;

            connect.openConnect();
            if(command.ExecuteNonQuery() == 1)
            {
                connect.closeConnect();
                return true;
            }else
            {
                connect.closeConnect();
                return false;
            }
        }
        public DataTable getStudentList(MySqlCommand command)
        {
            command.Connection = connect.getconnection;
            MySqlDataAdapter dataAdapter = new MySqlDataAdapter(command);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            return dataTable;
        }
        public string exeCount(string query)
        {
            MySqlCommand mySqlCommand = new MySqlCommand(query, connect.getconnection);
            connect.openConnect();
            string count = mySqlCommand.ExecuteScalar().ToString();
            connect.closeConnect();
            return count;
        }
        public string totalStudent()
        {
            return exeCount("SELECT COUNT(*) FROM `student`");
        }
        public string totalMaleStudent()
        {
            return exeCount("SELECT COUNT(*) FROM `student` WHERE `Gender` = 'Male'");
        }
        public string totalFemaleStudent()
        {
            return exeCount("SELECT COUNT(*) FROM `student` WHERE `Gender` = 'Female'");
        }
        public DataTable searchStudent(string searchData)
        {
            MySqlCommand mySqlCommand = new MySqlCommand("SELECT * FROM `student` WHERE CONCAT(`FirstName`, `LastName`, `Address`) LIKE '%"+ searchData + "%'", connect.getconnection);
            MySqlDataAdapter dataAdapter = new MySqlDataAdapter(mySqlCommand);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            return dataTable;
        }
        public bool updateStudent(int id, string firstName, string lastName, DateTime birthDate, string gender, string phone, string address, byte[] img)
        {
            MySqlCommand command = new MySqlCommand("UPDATE `student` SET `FirstName`=@fn,`LastName`=@ln,`Birthdate`=@bd,`Gender`=@gd,`Phone`=@ph,`Address`=@adr,`Photo`=@img WHERE `Id`=@id", connect.getconnection);

            command.Parameters.Add("@id", MySqlDbType.Int32).Value = id;
            command.Parameters.Add("@fn", MySqlDbType.VarChar).Value = firstName;
            command.Parameters.Add("@ln", MySqlDbType.VarChar).Value = lastName;
            command.Parameters.Add("@bd", MySqlDbType.Date).Value = birthDate;
            command.Parameters.Add("@gd", MySqlDbType.VarChar).Value = gender;
            command.Parameters.Add("@ph", MySqlDbType.VarChar).Value = phone;
            command.Parameters.Add("@adr", MySqlDbType.VarChar).Value = address;
            command.Parameters.Add("@img", MySqlDbType.Blob).Value = img;

            connect.openConnect();
            if (command.ExecuteNonQuery() == 1)
            {
                connect.closeConnect();
                return true;
            }
            else
            {
                connect.closeConnect();
                return false;
            }
        }
        public DataTable getList(MySqlCommand mySqlCommand)
        {
            mySqlCommand.Connection = connect.getconnection;
            MySqlDataAdapter dataAdapter = new MySqlDataAdapter(mySqlCommand);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            return dataTable;
        }
        public bool deleteStudent(int id)
        {
            MySqlCommand command = new MySqlCommand("DELETE FROM `student` WHERE `Id`=@id", connect.getconnection);

            command.Parameters.Add("@id", MySqlDbType.Int32).Value = id;

            connect.openConnect();
            if (command.ExecuteNonQuery() == 1)
            {
                connect.closeConnect();
                return true;
            }
            else
            {
                connect.closeConnect();
                return false;
            }
        }
    }
}
