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
    public partial class NewScoreForm : Form
    {
        CourseService courseService = new CourseService();
        StudentClass studentClass = new StudentClass();
        ScoreService scoreService = new ScoreService();
        public NewScoreForm()
        {
            InitializeComponent();
        }

        private void showScoreList()
        {
            DataGridView_score.DataSource = scoreService.getScoreList(new MySqlCommand("SELECT * FROM `score`"));
        }

        private void NewScoreForm_Load(object sender, EventArgs e)
        {
            comboBox_selectCourse.DataSource = courseService.getCourseList(new MySqlCommand("SELECT * FROM `course`"));
            comboBox_selectCourse.DisplayMember = "CourseName";
            comboBox_selectCourse.ValueMember = "CourseName";

            DataGridView_student.DataSource = studentClass.getList(new MySqlCommand("SELECT `Id`, `FirstName`, `LastName` FROM `student`"));
            showScoreList();
        }

        private void button_clear_Click(object sender, EventArgs e)
        {
            textBox_scoreStdId.Clear();
            textBox_scoreDescription.Clear();
            textBox_score.Clear();
            comboBox_selectCourse.SelectedIndex = 0;
        }

        private void button_add_Click(object sender, EventArgs e)
        {
            if ((textBox_scoreStdId.Text == "") || (textBox_score.Text == "") || (comboBox_selectCourse.SelectedItem == null))
            {
                MessageBox.Show("Empty boxes!", "Field Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                int stdId = Convert.ToInt32(textBox_scoreStdId.Text);
                string courseName = comboBox_selectCourse.SelectedText;
                double score = Convert.ToDouble(textBox_score.Text);
                string courseDescription = textBox_scoreDescription.Text;

                if (scoreService.intertScore(stdId, courseName, score, courseDescription))
                {
                    showScoreList();
                    button_clear.PerformClick();
                    MessageBox.Show("Added Score", "Add Score", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("Something went wrong", "Error Add Course", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void DataGridView_student_Click(object sender, EventArgs e)
        {
            textBox_scoreStdId.Text = DataGridView_student.CurrentRow.Cells[0].Value.ToString();
        }
    }
}
