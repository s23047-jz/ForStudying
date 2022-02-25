using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using MySql.Data.MySqlClient;

namespace StudentSystem
{
    public partial class RegisterForm : Form
    {
        StudentClass studentClass = new StudentClass();
        public RegisterForm()
        {
            InitializeComponent();
        }

        private void button_upload_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Filter = "Select Photo(*.jpg;*.png;*.gif)|*.jpg;*.png;*.gif";

            if(openFileDialog.ShowDialog() == DialogResult.OK)
                pictureBox_studentImg.Image = Image.FromFile(openFileDialog.FileName);

        }

        private void button_add_Click(object sender, EventArgs e)
        {
            string firstName = textBox_firstName.Text;
            string lastName = textBox_lastName.Text;
            DateTime birthDate = dateTimePicker1.Value;
            string phone = textBox_phone.Text;
            string address = textBox_address.Text;
            string gender = radioButton_male.Checked ? "Male" : "Female";
            MemoryStream memoryStream = new MemoryStream();
            pictureBox_studentImg.Image.Save(memoryStream, pictureBox_studentImg.Image.RawFormat);
            byte[] img = memoryStream.ToArray();

            int bornYear = dateTimePicker1.Value.Year;
            int this_year = DateTime.Now.Year;
            if((this_year-bornYear)<10 || (this_year - bornYear) > 100)
            {
                MessageBox.Show("The student age must be between 10 and 100", "Invalid Birthdate", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if(verifyBoxes())
            {
                try
                {
                    if (studentClass.insertStudent(firstName, lastName, birthDate, gender, phone, address, img))
                    {
                        showTable();
                        MessageBox.Show("New Student Added", "Add Student", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                }catch (Exception ex) {
                    MessageBox.Show(ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            else
            {
                MessageBox.Show("Empty field", "Add Student", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        bool verifyBoxes()
        {
            if((textBox_firstName.Text == "") || (textBox_lastName.Text == "") || (textBox_phone.Text == "") || (textBox_address.Text == "") || (pictureBox_studentImg.Image == null))
            {
                return false;
            }else
            {
                return true;
            }
        }

        private void button_clear_Click(object sender, EventArgs e)
        {
            textBox_firstName.Clear();
            textBox_lastName.Clear();
            textBox_phone.Clear();
            textBox_address.Clear();
            pictureBox_studentImg.Image = null;

        }
        public void showTable()
        {
            DataGridView_student.DataSource = studentClass.getStudentList(new MySqlCommand("SELECT * FROM `student`"));
            DataGridViewImageColumn dataGridViewImageColumn = new DataGridViewImageColumn();
            dataGridViewImageColumn = (DataGridViewImageColumn)DataGridView_student.Columns[7];
            dataGridViewImageColumn.ImageLayout = DataGridViewImageCellLayout.Stretch;
        }

        private void RegisterForm_Load_1(object sender, EventArgs e)
        {
            showTable();
        }

        private void textBox_phone_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
