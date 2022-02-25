using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;
using System.Data;

namespace StudentSystem
{
    internal class CourseService
    {
        DBconnect connect = new DBconnect();

        public bool intertCourse(string courseName, int courseHours, string courseDescription)
        {
            MySqlCommand command = new MySqlCommand("INSERT INTO `course` (`CourseName`, `CourseHours`, `Description`) VALUES(@cName, @cHours, @cDesc)", connect.getconnection);

            command.Parameters.Add("@cName", MySqlDbType.VarChar).Value = courseName;
            command.Parameters.Add("@cHours", MySqlDbType.Int32).Value = courseHours;
            command.Parameters.Add("@cDesc", MySqlDbType.Text).Value = courseDescription;

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
        public DataTable getCourseList(MySqlCommand mySqlCommand)
        {
            mySqlCommand.Connection = connect.getconnection;
            MySqlDataAdapter dataAdapter = new MySqlDataAdapter(mySqlCommand);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            return dataTable;
        }

        public bool updateCourse(int id, string courseName, int courseHours, string courseDescription)
        {
            MySqlCommand command = new MySqlCommand("UPDATE `course` SET `CourseName`=@cn,`CourseHours`=@ch,`Description`=@cd WHERE `Id`=@id", connect.getconnection);

            command.Parameters.Add("@id", MySqlDbType.Int32).Value = id;
            command.Parameters.Add("@cn", MySqlDbType.VarChar).Value = courseName;
            command.Parameters.Add("@ch", MySqlDbType.Int32).Value = courseHours;
            command.Parameters.Add("@cd", MySqlDbType.VarChar).Value = courseDescription;

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

        public bool deleteCourse(int id)
        {
            MySqlCommand command = new MySqlCommand("DELETE FROM `course` WHERE `Id`=@id", connect.getconnection);

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
