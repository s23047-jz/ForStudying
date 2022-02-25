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
    public partial class ManageStudentForm : Form
    {
        StudentClass studentClass = new StudentClass();
        public ManageStudentForm()
        {
            InitializeComponent();
        }

        private void ManageStudentForm_Load(object sender, EventArgs e)
        {
            showTable();
        }

        public void showTable()
        {
            DataGridView_student.DataSource = studentClass.getStudentList(new MySqlCommand("SELECT * FROM `student`"));
            DataGridViewImageColumn dataGridViewImageColumn = new DataGridViewImageColumn();
            dataGridViewImageColumn = (DataGridViewImageColumn)DataGridView_student.Columns[7];
            dataGridViewImageColumn.ImageLayout = DataGridViewImageCellLayout.Stretch;
        }

        //Wyswietla baze student
        private void DataGridView_student_Click(object sender, EventArgs e)
        {
            textBox_studentId.Text = DataGridView_student.CurrentRow.Cells[0].Value.ToString();
            textBox_firstName.Text = DataGridView_student.CurrentRow.Cells[1].Value.ToString();
            textBox_lastName.Text = DataGridView_student.CurrentRow.Cells[2].Value.ToString();

            dateTimePicker1.Value = (DateTime)DataGridView_student.CurrentRow.Cells[3].Value;
            if (DataGridView_student.CurrentRow.Cells[4].Value.ToString() == "Male")
                radioButton_male.Checked = true;

            textBox_phone.Text = DataGridView_student.CurrentRow.Cells[5].Value.ToString();
            textBox_address.Text = DataGridView_student.CurrentRow.Cells[6].Value.ToString();
            byte[] img = (byte[])DataGridView_student.CurrentRow.Cells[7].Value;
            MemoryStream memStream = new MemoryStream(img);
            pictureBox_studentImg.Image = Image.FromStream(memStream);
        }

        private void button_clean_Click(object sender, EventArgs e)
        {
            textBox_studentId.Clear();
            textBox_firstName.Clear();
            textBox_lastName.Clear();
            textBox_phone.Clear();
            textBox_address.Clear();
            pictureBox_studentImg.Image = null;
            radioButton_male.Checked = true;
            dateTimePicker1.Value=DateTime.Now;
        }

        private void button_upload_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Filter = "Select Photo(*.jpg;*.png;*.gif)|*.jpg;*.png;*.gif";

            if (openFileDialog.ShowDialog() == DialogResult.OK)
                pictureBox_studentImg.Image = Image.FromFile(openFileDialog.FileName);
        }

        private void button_search_Click(object sender, EventArgs e)
        {
            DataGridView_student.DataSource = studentClass.searchStudent(textBox_search.Text);
            DataGridViewImageColumn dataGridViewImageColumn = new DataGridViewImageColumn();
            dataGridViewImageColumn = (DataGridViewImageColumn)DataGridView_student.Columns[7];
            dataGridViewImageColumn.ImageLayout = DataGridViewImageCellLayout.Stretch;
        }
        bool verifyBoxes()
        {
            if ((textBox_firstName.Text == "") || (textBox_lastName.Text == "") || 
                (textBox_phone.Text == "") || (textBox_address.Text == "") || 
                (pictureBox_studentImg.Image == null))
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        private void button_update_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(textBox_studentId.Text);
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
            if ((this_year - bornYear) < 10 || (this_year - bornYear) > 100)
            {
                MessageBox.Show("The student age must be between 10 and 100", "Invalid Birthdate", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (verifyBoxes())
            {
                try
                {
                    if (studentClass.updateStudent(id, firstName, lastName, birthDate, gender, phone, address, img))
                    {
                        showTable();
                        MessageBox.Show("Student data was updated", "Update Student", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            else
            {
                MessageBox.Show("Empty field", "Update Student", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        private void button_delete_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(textBox_studentId.Text);

            if (verifyBoxes())
            {
                try
                {
                    if (studentClass.deleteStudent(id));
                    {
                        showTable();
                        MessageBox.Show("Student deleted", "Delete Student", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            else
            {
                MessageBox.Show("Empty field", "Delete Student", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }

        }
    }
}
