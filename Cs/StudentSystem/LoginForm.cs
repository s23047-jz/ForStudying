using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentSystem
{
    public partial class LoginForm : Form
    {
        DBconnect connect = new DBconnect();
        StudentClass studentClass = new StudentClass();
        public LoginForm()
        {
            InitializeComponent();
        }

        public DataTable getUsers(MySqlCommand mySqlCommand)
        {
            mySqlCommand.Connection = connect.getconnection;
            MySqlDataAdapter dataAdapter = new MySqlDataAdapter(mySqlCommand);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            return dataTable;
        }

        private void button_exit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button_login_Click(object sender, EventArgs e)
        {
            if(textBox_userName.Text == "" || textBox_userPassword.Text == "")
            {
                MessageBox.Show("Empty values", "Field error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                string userName = textBox_userName.Text;
                string userPassword = textBox_userPassword.Text;

                DataTable table = getUsers(new MySqlCommand("SELECT * FROM `users` WHERE `UserName` = '" + userName + "' AND `UserPassword` = '" + userPassword + "'"));
                if (table.Rows.Count > 0)
                {
                    MainForm mainForm = new MainForm();
                    this.Hide();
                    mainForm.Show();
                }
                else
                {
                    MessageBox.Show("Wrong username or password", "Wrong data", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }
    }
}
