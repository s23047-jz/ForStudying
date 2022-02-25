namespace StudentSystem
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel_slide = new System.Windows.Forms.Panel();
            this.panel_courseSubMenu = new System.Windows.Forms.Panel();
            this.button_manageCourse = new System.Windows.Forms.Button();
            this.button_newCourse = new System.Windows.Forms.Button();
            this.button_score = new System.Windows.Forms.Button();
            this.button_std = new System.Windows.Forms.Button();
            this.panel_scoreSubMenu = new System.Windows.Forms.Panel();
            this.button_managePrint = new System.Windows.Forms.Button();
            this.button_manageScore = new System.Windows.Forms.Button();
            this.button_newScore = new System.Windows.Forms.Button();
            this.button_course = new System.Windows.Forms.Button();
            this.panel_stdSubMenu = new System.Windows.Forms.Panel();
            this.button_stdPrint = new System.Windows.Forms.Button();
            this.button_manageStudent = new System.Windows.Forms.Button();
            this.button_registration = new System.Windows.Forms.Button();
            this.panel_logo = new System.Windows.Forms.Panel();
            this.label_Logo = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.label_totalFemaleStudents = new System.Windows.Forms.Label();
            this.label_totalMaleStudents = new System.Windows.Forms.Label();
            this.label_totalStudents = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label_role = new System.Windows.Forms.Label();
            this.label_user = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.label7 = new System.Windows.Forms.Label();
            this.panel_main = new System.Windows.Forms.Panel();
            this.panel_slide.SuspendLayout();
            this.panel_courseSubMenu.SuspendLayout();
            this.panel_scoreSubMenu.SuspendLayout();
            this.panel_stdSubMenu.SuspendLayout();
            this.panel_logo.SuspendLayout();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.panel3.SuspendLayout();
            this.panel_main.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel_slide
            // 
            this.panel_slide.AutoScroll = true;
            this.panel_slide.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(24)))), ((int)(((byte)(30)))), ((int)(((byte)(54)))));
            this.panel_slide.Controls.Add(this.panel_courseSubMenu);
            this.panel_slide.Controls.Add(this.button_score);
            this.panel_slide.Controls.Add(this.button_std);
            this.panel_slide.Controls.Add(this.panel_scoreSubMenu);
            this.panel_slide.Controls.Add(this.button_course);
            this.panel_slide.Controls.Add(this.panel_stdSubMenu);
            this.panel_slide.Controls.Add(this.panel_logo);
            this.panel_slide.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel_slide.Location = new System.Drawing.Point(0, 0);
            this.panel_slide.Name = "panel_slide";
            this.panel_slide.Size = new System.Drawing.Size(186, 653);
            this.panel_slide.TabIndex = 0;
            this.panel_slide.Paint += new System.Windows.Forms.PaintEventHandler(this.panel_slide_Paint);
            // 
            // panel_courseSubMenu
            // 
            this.panel_courseSubMenu.Controls.Add(this.button_manageCourse);
            this.panel_courseSubMenu.Controls.Add(this.button_newCourse);
            this.panel_courseSubMenu.Location = new System.Drawing.Point(1, 402);
            this.panel_courseSubMenu.Name = "panel_courseSubMenu";
            this.panel_courseSubMenu.Size = new System.Drawing.Size(179, 120);
            this.panel_courseSubMenu.TabIndex = 10;
            // 
            // button_manageCourse
            // 
            this.button_manageCourse.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_manageCourse.FlatAppearance.BorderSize = 0;
            this.button_manageCourse.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_manageCourse.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_manageCourse.ForeColor = System.Drawing.Color.White;
            this.button_manageCourse.Location = new System.Drawing.Point(0, 50);
            this.button_manageCourse.Name = "button_manageCourse";
            this.button_manageCourse.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_manageCourse.Size = new System.Drawing.Size(179, 50);
            this.button_manageCourse.TabIndex = 1;
            this.button_manageCourse.Text = "Manage Course";
            this.button_manageCourse.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_manageCourse.UseVisualStyleBackColor = true;
            this.button_manageCourse.Click += new System.EventHandler(this.button_manageCourse_Click_1);
            // 
            // button_newCourse
            // 
            this.button_newCourse.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_newCourse.FlatAppearance.BorderSize = 0;
            this.button_newCourse.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_newCourse.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_newCourse.ForeColor = System.Drawing.Color.White;
            this.button_newCourse.Location = new System.Drawing.Point(0, 0);
            this.button_newCourse.Name = "button_newCourse";
            this.button_newCourse.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_newCourse.Size = new System.Drawing.Size(179, 50);
            this.button_newCourse.TabIndex = 0;
            this.button_newCourse.Text = "New Course";
            this.button_newCourse.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_newCourse.UseVisualStyleBackColor = true;
            this.button_newCourse.Click += new System.EventHandler(this.button_newCourse_Click_1);
            // 
            // button_score
            // 
            this.button_score.FlatAppearance.BorderSize = 0;
            this.button_score.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_score.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_score.ForeColor = System.Drawing.Color.White;
            this.button_score.Location = new System.Drawing.Point(-3, 528);
            this.button_score.Name = "button_score";
            this.button_score.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.button_score.Size = new System.Drawing.Size(180, 64);
            this.button_score.TabIndex = 9;
            this.button_score.Text = "Score";
            this.button_score.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_score.UseVisualStyleBackColor = true;
            this.button_score.Click += new System.EventHandler(this.button_score_Click);
            // 
            // button_std
            // 
            this.button_std.FlatAppearance.BorderSize = 0;
            this.button_std.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_std.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_std.ForeColor = System.Drawing.Color.White;
            this.button_std.Location = new System.Drawing.Point(-3, 81);
            this.button_std.Name = "button_std";
            this.button_std.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.button_std.Size = new System.Drawing.Size(180, 64);
            this.button_std.TabIndex = 8;
            this.button_std.Text = "Student";
            this.button_std.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_std.UseVisualStyleBackColor = true;
            this.button_std.Click += new System.EventHandler(this.button_std_Click);
            // 
            // panel_scoreSubMenu
            // 
            this.panel_scoreSubMenu.Controls.Add(this.button_managePrint);
            this.panel_scoreSubMenu.Controls.Add(this.button_manageScore);
            this.panel_scoreSubMenu.Controls.Add(this.button_newScore);
            this.panel_scoreSubMenu.Location = new System.Drawing.Point(1, 598);
            this.panel_scoreSubMenu.Name = "panel_scoreSubMenu";
            this.panel_scoreSubMenu.Size = new System.Drawing.Size(180, 163);
            this.panel_scoreSubMenu.TabIndex = 6;
            // 
            // button_managePrint
            // 
            this.button_managePrint.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_managePrint.FlatAppearance.BorderSize = 0;
            this.button_managePrint.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_managePrint.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_managePrint.ForeColor = System.Drawing.Color.White;
            this.button_managePrint.Location = new System.Drawing.Point(0, 100);
            this.button_managePrint.Name = "button_managePrint";
            this.button_managePrint.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_managePrint.Size = new System.Drawing.Size(180, 50);
            this.button_managePrint.TabIndex = 3;
            this.button_managePrint.Text = "Print";
            this.button_managePrint.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_managePrint.UseVisualStyleBackColor = true;
            this.button_managePrint.Click += new System.EventHandler(this.button_managePrint_Click);
            // 
            // button_manageScore
            // 
            this.button_manageScore.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_manageScore.FlatAppearance.BorderSize = 0;
            this.button_manageScore.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_manageScore.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_manageScore.ForeColor = System.Drawing.Color.White;
            this.button_manageScore.Location = new System.Drawing.Point(0, 50);
            this.button_manageScore.Name = "button_manageScore";
            this.button_manageScore.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_manageScore.Size = new System.Drawing.Size(180, 50);
            this.button_manageScore.TabIndex = 1;
            this.button_manageScore.Text = "Manage Score";
            this.button_manageScore.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_manageScore.UseVisualStyleBackColor = true;
            this.button_manageScore.Click += new System.EventHandler(this.button_manageScore_Click);
            // 
            // button_newScore
            // 
            this.button_newScore.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_newScore.FlatAppearance.BorderSize = 0;
            this.button_newScore.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_newScore.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_newScore.ForeColor = System.Drawing.Color.White;
            this.button_newScore.Location = new System.Drawing.Point(0, 0);
            this.button_newScore.Name = "button_newScore";
            this.button_newScore.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_newScore.Size = new System.Drawing.Size(180, 50);
            this.button_newScore.TabIndex = 0;
            this.button_newScore.Text = "New Score";
            this.button_newScore.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_newScore.UseVisualStyleBackColor = true;
            this.button_newScore.Click += new System.EventHandler(this.button_newScore_Click);
            // 
            // button_course
            // 
            this.button_course.FlatAppearance.BorderSize = 0;
            this.button_course.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_course.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_course.ForeColor = System.Drawing.Color.White;
            this.button_course.Location = new System.Drawing.Point(1, 329);
            this.button_course.Name = "button_course";
            this.button_course.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.button_course.Size = new System.Drawing.Size(179, 67);
            this.button_course.TabIndex = 3;
            this.button_course.Text = "Course";
            this.button_course.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_course.UseVisualStyleBackColor = true;
            this.button_course.Click += new System.EventHandler(this.button_course_Click);
            // 
            // panel_stdSubMenu
            // 
            this.panel_stdSubMenu.Controls.Add(this.button_stdPrint);
            this.panel_stdSubMenu.Controls.Add(this.button_manageStudent);
            this.panel_stdSubMenu.Controls.Add(this.button_registration);
            this.panel_stdSubMenu.Location = new System.Drawing.Point(0, 160);
            this.panel_stdSubMenu.Name = "panel_stdSubMenu";
            this.panel_stdSubMenu.Size = new System.Drawing.Size(180, 163);
            this.panel_stdSubMenu.TabIndex = 1;
            // 
            // button_stdPrint
            // 
            this.button_stdPrint.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_stdPrint.FlatAppearance.BorderSize = 0;
            this.button_stdPrint.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_stdPrint.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_stdPrint.ForeColor = System.Drawing.Color.White;
            this.button_stdPrint.Location = new System.Drawing.Point(0, 100);
            this.button_stdPrint.Name = "button_stdPrint";
            this.button_stdPrint.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_stdPrint.Size = new System.Drawing.Size(180, 50);
            this.button_stdPrint.TabIndex = 3;
            this.button_stdPrint.Text = "Print";
            this.button_stdPrint.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_stdPrint.UseVisualStyleBackColor = true;
            this.button_stdPrint.Click += new System.EventHandler(this.button_stdPrint_Click);
            // 
            // button_manageStudent
            // 
            this.button_manageStudent.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_manageStudent.FlatAppearance.BorderSize = 0;
            this.button_manageStudent.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_manageStudent.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F);
            this.button_manageStudent.ForeColor = System.Drawing.Color.White;
            this.button_manageStudent.Location = new System.Drawing.Point(0, 50);
            this.button_manageStudent.Name = "button_manageStudent";
            this.button_manageStudent.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_manageStudent.Size = new System.Drawing.Size(180, 50);
            this.button_manageStudent.TabIndex = 1;
            this.button_manageStudent.Text = "Manage Student";
            this.button_manageStudent.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_manageStudent.UseVisualStyleBackColor = true;
            this.button_manageStudent.Click += new System.EventHandler(this.button_manageStudent_Click);
            // 
            // button_registration
            // 
            this.button_registration.Dock = System.Windows.Forms.DockStyle.Top;
            this.button_registration.FlatAppearance.BorderSize = 0;
            this.button_registration.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_registration.Font = new System.Drawing.Font("Microsoft JhengHei UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_registration.ForeColor = System.Drawing.Color.White;
            this.button_registration.Location = new System.Drawing.Point(0, 0);
            this.button_registration.Name = "button_registration";
            this.button_registration.Padding = new System.Windows.Forms.Padding(35, 0, 0, 0);
            this.button_registration.Size = new System.Drawing.Size(180, 50);
            this.button_registration.TabIndex = 0;
            this.button_registration.Text = "Registration";
            this.button_registration.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button_registration.UseVisualStyleBackColor = true;
            this.button_registration.Click += new System.EventHandler(this.button_registration_Click);
            // 
            // panel_logo
            // 
            this.panel_logo.Controls.Add(this.label_Logo);
            this.panel_logo.Location = new System.Drawing.Point(0, 0);
            this.panel_logo.Name = "panel_logo";
            this.panel_logo.Size = new System.Drawing.Size(177, 59);
            this.panel_logo.TabIndex = 0;
            // 
            // label_Logo
            // 
            this.label_Logo.AutoSize = true;
            this.label_Logo.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label_Logo.Font = new System.Drawing.Font("MV Boli", 27.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_Logo.ForeColor = System.Drawing.SystemColors.Control;
            this.label_Logo.Location = new System.Drawing.Point(47, 5);
            this.label_Logo.Name = "label_Logo";
            this.label_Logo.Size = new System.Drawing.Size(82, 51);
            this.label_Logo.TabIndex = 0;
            this.label_Logo.Text = "JZ";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.label8);
            this.panel1.Controls.Add(this.label9);
            this.panel1.Controls.Add(this.label6);
            this.panel1.Controls.Add(this.comboBox1);
            this.panel1.Controls.Add(this.label_totalFemaleStudents);
            this.panel1.Controls.Add(this.label_totalMaleStudents);
            this.panel1.Controls.Add(this.label_totalStudents);
            this.panel1.Location = new System.Drawing.Point(0, 578);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(962, 69);
            this.panel1.TabIndex = 4;
            // 
            // label8
            // 
            this.label8.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label8.ForeColor = System.Drawing.SystemColors.Control;
            this.label8.Location = new System.Drawing.Point(856, 44);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(66, 20);
            this.label8.TabIndex = 7;
            this.label8.Text = "Female:";
            // 
            // label9
            // 
            this.label9.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label9.ForeColor = System.Drawing.SystemColors.Control;
            this.label9.Location = new System.Drawing.Point(738, 44);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(47, 20);
            this.label9.TabIndex = 6;
            this.label9.Text = "Male:";
            // 
            // label6
            // 
            this.label6.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label6.ForeColor = System.Drawing.SystemColors.Control;
            this.label6.Location = new System.Drawing.Point(671, 6);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(114, 24);
            this.label6.TabIndex = 5;
            this.label6.Text = "Select class:";
            // 
            // comboBox1
            // 
            this.comboBox1.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(791, 9);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(131, 21);
            this.comboBox1.TabIndex = 4;
            // 
            // label_totalFemaleStudents
            // 
            this.label_totalFemaleStudents.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label_totalFemaleStudents.AutoSize = true;
            this.label_totalFemaleStudents.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label_totalFemaleStudents.ForeColor = System.Drawing.SystemColors.Control;
            this.label_totalFemaleStudents.Location = new System.Drawing.Point(124, 44);
            this.label_totalFemaleStudents.Name = "label_totalFemaleStudents";
            this.label_totalFemaleStudents.Size = new System.Drawing.Size(66, 20);
            this.label_totalFemaleStudents.TabIndex = 3;
            this.label_totalFemaleStudents.Text = "Female:";
            // 
            // label_totalMaleStudents
            // 
            this.label_totalMaleStudents.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label_totalMaleStudents.AutoSize = true;
            this.label_totalMaleStudents.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label_totalMaleStudents.ForeColor = System.Drawing.SystemColors.Control;
            this.label_totalMaleStudents.Location = new System.Drawing.Point(13, 44);
            this.label_totalMaleStudents.Name = "label_totalMaleStudents";
            this.label_totalMaleStudents.Size = new System.Drawing.Size(47, 20);
            this.label_totalMaleStudents.TabIndex = 2;
            this.label_totalMaleStudents.Text = "Male:";
            // 
            // label_totalStudents
            // 
            this.label_totalStudents.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label_totalStudents.AutoSize = true;
            this.label_totalStudents.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F);
            this.label_totalStudents.ForeColor = System.Drawing.SystemColors.Control;
            this.label_totalStudents.Location = new System.Drawing.Point(12, 9);
            this.label_totalStudents.Name = "label_totalStudents";
            this.label_totalStudents.Size = new System.Drawing.Size(104, 26);
            this.label_totalStudents.TabIndex = 1;
            this.label_totalStudents.Text = "Students:";
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.pictureBox1);
            this.panel2.Controls.Add(this.label_role);
            this.panel2.Controls.Add(this.label_user);
            this.panel2.Controls.Add(this.label2);
            this.panel2.Controls.Add(this.label1);
            this.panel2.Location = new System.Drawing.Point(3, 34);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(962, 79);
            this.panel2.TabIndex = 5;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Anchor = System.Windows.Forms.AnchorStyles.Right;
            this.pictureBox1.Image = global::StudentSystem.Properties.Resources.student_wektor_rysunek_ilustracja_clipart_wektorowy_csp39911907;
            this.pictureBox1.Location = new System.Drawing.Point(849, 3);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(100, 73);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 4;
            this.pictureBox1.TabStop = false;
            // 
            // label_role
            // 
            this.label_role.AutoSize = true;
            this.label_role.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label_role.ForeColor = System.Drawing.SystemColors.Control;
            this.label_role.Location = new System.Drawing.Point(135, 47);
            this.label_role.Name = "label_role";
            this.label_role.Size = new System.Drawing.Size(42, 20);
            this.label_role.TabIndex = 3;
            this.label_role.Text = "Role";
            // 
            // label_user
            // 
            this.label_user.AutoSize = true;
            this.label_user.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F);
            this.label_user.ForeColor = System.Drawing.SystemColors.Control;
            this.label_user.Location = new System.Drawing.Point(134, 11);
            this.label_user.Name = "label_user";
            this.label_user.Size = new System.Drawing.Size(58, 26);
            this.label_user.TabIndex = 2;
            this.label_user.Text = "User";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label2.ForeColor = System.Drawing.SystemColors.Control;
            this.label2.Location = new System.Drawing.Point(36, 46);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(50, 20);
            this.label2.TabIndex = 1;
            this.label2.Text = "Role: ";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F);
            this.label1.ForeColor = System.Drawing.SystemColors.Control;
            this.label1.Location = new System.Drawing.Point(3, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(116, 26);
            this.label1.TabIndex = 0;
            this.label1.Text = "Welcome: ";
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.label7);
            this.panel3.Location = new System.Drawing.Point(3, 3);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(959, 33);
            this.panel3.TabIndex = 6;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label7.ForeColor = System.Drawing.Color.Violet;
            this.label7.Location = new System.Drawing.Point(13, 4);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(290, 24);
            this.label7.TabIndex = 0;
            this.label7.Text = "Welcome in management system";
            // 
            // panel_main
            // 
            this.panel_main.Controls.Add(this.panel2);
            this.panel_main.Controls.Add(this.panel1);
            this.panel_main.Controls.Add(this.panel3);
            this.panel_main.Location = new System.Drawing.Point(183, 0);
            this.panel_main.Name = "panel_main";
            this.panel_main.Size = new System.Drawing.Size(968, 650);
            this.panel_main.TabIndex = 7;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.ClientSize = new System.Drawing.Size(1150, 653);
            this.Controls.Add(this.panel_main);
            this.Controls.Add(this.panel_slide);
            this.ForeColor = System.Drawing.Color.White;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.MinimumSize = new System.Drawing.Size(1150, 650);
            this.Name = "MainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Student/Course Manager";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.panel_slide.ResumeLayout(false);
            this.panel_courseSubMenu.ResumeLayout(false);
            this.panel_scoreSubMenu.ResumeLayout(false);
            this.panel_stdSubMenu.ResumeLayout(false);
            this.panel_logo.ResumeLayout(false);
            this.panel_logo.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.panel_main.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel_slide;
        private System.Windows.Forms.Panel panel_stdSubMenu;
        private System.Windows.Forms.Button button_stdPrint;
        private System.Windows.Forms.Button button_manageStudent;
        private System.Windows.Forms.Button button_registration;
        private System.Windows.Forms.Panel panel_logo;
        private System.Windows.Forms.Panel panel_scoreSubMenu;
        private System.Windows.Forms.Button button_managePrint;
        private System.Windows.Forms.Button button_manageScore;
        private System.Windows.Forms.Button button_newScore;
        private System.Windows.Forms.Button button_course;
        private System.Windows.Forms.Button button_std;
        private System.Windows.Forms.Button button_score;
        private System.Windows.Forms.Panel panel_courseSubMenu;
        private System.Windows.Forms.Button button_manageCourse;
        private System.Windows.Forms.Button button_newCourse;
        private System.Windows.Forms.Label label_Logo;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Label label_totalFemaleStudents;
        private System.Windows.Forms.Label label_totalMaleStudents;
        private System.Windows.Forms.Label label_totalStudents;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label_role;
        private System.Windows.Forms.Label label_user;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Panel panel_main;
    }
}

