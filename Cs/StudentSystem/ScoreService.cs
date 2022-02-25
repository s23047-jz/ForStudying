using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentSystem
{
    internal class ScoreService
    {
        DBconnect connect = new DBconnect();


        public DataTable getScoreList(MySqlCommand command)
        {
            command.Connection = connect.getconnection;
            MySqlDataAdapter dataAdapter = new MySqlDataAdapter(command);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            return dataTable;
        }

        public bool intertScore(int stdId, string cName, double score, string desc)
        {
            //INSERT INTO `score`(`Id`, `CourseName`, `Score`, `Description`) VALUES (@stdId, @cName, @score, @Description)
            MySqlCommand command = new MySqlCommand("INSERT INTO `score`(`Id`, `CourseName`, `Score`, `Description`) VALUES (@stdId, @cName, @score, @desc)", connect.getconnection);

            command.Parameters.Add("@stdId", MySqlDbType.Int32).Value = stdId;
            command.Parameters.Add("@cName", MySqlDbType.VarChar).Value = cName;
            command.Parameters.Add("@score", MySqlDbType.Double).Value = score;
            command.Parameters.Add("@desc", MySqlDbType.Text).Value = desc;

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
