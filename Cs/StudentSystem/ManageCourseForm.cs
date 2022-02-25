using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace StudentSystem
{
    public partial class ManageCourseForm : Form
    {
        CourseService courseService = new CourseService();
        public ManageCourseForm()
        {
            InitializeComponent();
        }

        private void showData()
        {
            DataGridView_course.DataSource = courseService.getCourseList(new MySqlCommand("SELECT * FROM `course`"));
        }
        private void ManageCourse_Load(object sender, EventArgs e)
        {
            showData();
        }

        private void button_clean_Click(object sender, EventArgs e)
        {
            textBox_courseId.Clear();
            textBox_courseName.Clear();
            textBox_courseHours.Clear();
            textBox_courseDescription.Clear();
        }

        private void button_update_Click(object sender, EventArgs e)
        {
            if((textBox_courseName.Text == "") || (textBox_courseHours.Text == "") || (textBox_courseId.Text.Equals("")))
            {
                MessageBox.Show("Empty box!", "Field Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                int id = Convert.ToInt32(textBox_courseId.Text);
                string courseName = textBox_courseName.Text;
                int courseHours = Convert.ToInt32(textBox_courseHours.Text);
                string description = textBox_courseDescription.Text;

                if(courseService.updateCourse(id, courseName, courseHours, description))
                {
                    showData();
                    button_clean.PerformClick();
                    MessageBox.Show("Course was updated", "Update Course", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("Couse was not updated", "Update Course Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private bool verifyId()
        {
            if(textBox_courseId.Text.Equals(""))
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        private void button_delete_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(textBox_courseId.Text);

            if (verifyId())
            {
                try
                {
                    if (courseService.deleteCourse(id))
                    {
                        showData();
                        MessageBox.Show("Course deleted", "Delete Course", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            else
            {
                MessageBox.Show("Empty field", "Delete Course Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        private void DataGridView_course_Click(object sender, EventArgs e)
        {
            textBox_courseId.Text = DataGridView_course.CurrentRow.Cells[0].Value.ToString();
            textBox_courseName.Text = DataGridView_course.CurrentRow.Cells[1].Value.ToString();
            textBox_courseHours.Text = DataGridView_course.CurrentRow.Cells[2].Value.ToString();
            textBox_courseDescription.Text = DataGridView_course.CurrentRow.Cells[3].Value.ToString();
        }

        private void button_search_Click(object sender, EventArgs e)
        {
            DataGridView_course.DataSource = courseService.getCourseList(new MySqlCommand("SELECT * FROM `course` WHERE CONCAT(`CourseName`) LIKE '%" + textBox_search.Text + "%'"));
            textBox_search.Clear();
        }
    }
}
