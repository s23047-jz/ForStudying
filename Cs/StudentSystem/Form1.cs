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
    public partial class MainForm : Form
    {
        StudentClass studentClass = new StudentClass();
        public MainForm()
        {
            InitializeComponent();
            customizeDesign();
        }

        private void panel_slide_Paint(object sender, PaintEventArgs e)
        {
            
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            studentCount();
        }

        private void studentCount()
        {
            label_totalStudents.Text = "Students : " + studentClass.totalStudent();
            label_totalMaleStudents.Text = "Male : " + studentClass.totalMaleStudent();
            label_totalFemaleStudents.Text = "Female : " + studentClass.totalFemaleStudent();
        }

        
        private void customizeDesign()
        {
            panel_stdSubMenu.Visible = false;
            panel_courseSubMenu.Visible = false;
            panel_scoreSubMenu.Visible = false;
        }
        private void hideSubMenu()
        {
            if (panel_stdSubMenu.Visible == true)
                panel_stdSubMenu.Visible = false;              
            if (panel_courseSubMenu.Visible == true)
                panel_courseSubMenu.Visible = false;
            if (panel_scoreSubMenu.Visible == true)
                panel_scoreSubMenu.Visible = false;
        }
        private void showSubMenu(Panel subMenu)
        {
            if (subMenu.Visible == false)
            {
                hideSubMenu();
                subMenu.Visible = true;
            }else
            {
                subMenu.Visible = false;
            }
        }

        private void button_std_Click(object sender, EventArgs e)
        {
            showSubMenu(panel_stdSubMenu);
        }

        private void button_registration_Click(object sender, EventArgs e)
        {
            openChildForm(new RegisterForm());
            hideSubMenu();
        }

        private void button_manageStudent_Click(object sender, EventArgs e)
        {
            openChildForm(new ManageStudentForm());
            hideSubMenu();
        }

        private void button_status_Click(object sender, EventArgs e)
        {
            hideSubMenu();
        }

        private void button_stdPrint_Click(object sender, EventArgs e)
        {
            openChildForm(new PrintStudent());
            hideSubMenu();
        }

        private void button_course_Click(object sender, EventArgs e)
        {
            showSubMenu(panel_courseSubMenu);
        }

        private void button_newCourse_Click_1(object sender, EventArgs e)
        {
            openChildForm(new CourseForm());
            hideSubMenu();
        }

        private void button_manageCourse_Click_1(object sender, EventArgs e)
        {
            openChildForm(new ManageCourseForm());
            hideSubMenu();
        }

        private void button_coursePrint_Click_1(object sender, EventArgs e)
        {
            hideSubMenu();
        }
        private void button_score_Click(object sender, EventArgs e)
        {
            showSubMenu(panel_scoreSubMenu);
        }

        private void button_newScore_Click(object sender, EventArgs e)
        {
            openChildForm(new NewScoreForm());
            hideSubMenu();
        }

        private void button_manageScore_Click(object sender, EventArgs e)
        {
            hideSubMenu();
        }

        private void button_managePrint_Click(object sender, EventArgs e)
        {
            hideSubMenu();
        }

        private void label_role_Click(object sender, EventArgs e)
        {

        }
        private Form activeForm = null;
        private void openChildForm(Form childForm)
        {
            if (activeForm != null)
                activeForm.Close();
            activeForm = childForm;
            childForm.TopLevel = false;
            childForm.FormBorderStyle = FormBorderStyle.None;
            childForm.Dock = DockStyle.Fill;
            panel_main.Controls.Add(childForm);
            panel_main.Tag = childForm;
            childForm.BringToFront();
            childForm.Show();
        }
    }
}
