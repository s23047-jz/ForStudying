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
    public partial class CourseForm : Form
    {
        CourseService courseService = new CourseService();
        public CourseForm()
        {
            InitializeComponent();
        }
        private void showData()
        {
            DataGridView_course.DataSource = courseService.getCourseList(new MySqlCommand("SELECT * FROM `course`"));
        }

        private void button_add_Click(object sender, EventArgs e)
        {
            if((textBox_courseName.Text == "") || (textBox_courseHours.Text == ""))
            {
                MessageBox.Show("Empty boxes!", "Field Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                string courseName = textBox_courseName.Text;
                int courseHours = Convert.ToInt32(textBox_courseHours.Text);
                string courseDescription = textBox_courseDescription.Text;

                if(courseService.intertCourse(courseName, courseHours, courseDescription))
                {
                    showData();
                    button_clear.PerformClick();
                    MessageBox.Show("Added course", "Add Course", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("Something went wrong", "Error Add Course", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void button_clear_Click(object sender, EventArgs e)
        {
            textBox_courseName.Clear();
            textBox_courseHours.Clear();
            textBox_courseDescription.Clear();
        }

        private void CourseForm_Load(object sender, EventArgs e)
        {
            showData();
        }
    }
}
