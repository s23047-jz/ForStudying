namespace StudentSystem
{
    partial class ManageCourseForm
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle4 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle5 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle6 = new System.Windows.Forms.DataGridViewCellStyle();
            this.textBox_courseId = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.button_search = new System.Windows.Forms.Button();
            this.textBox_search = new System.Windows.Forms.TextBox();
            this.button_clean = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label7 = new System.Windows.Forms.Label();
            this.button_delete = new System.Windows.Forms.Button();
            this.button_update = new System.Windows.Forms.Button();
            this.DataGridView_course = new Guna.UI2.WinForms.Guna2DataGridView();
            this.label6 = new System.Windows.Forms.Label();
            this.textBox_courseDescription = new System.Windows.Forms.TextBox();
            this.textBox_courseName = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.textBox_courseHours = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.DataGridView_course)).BeginInit();
            this.SuspendLayout();
            // 
            // textBox_courseId
            // 
            this.textBox_courseId.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.textBox_courseId.Location = new System.Drawing.Point(230, 439);
            this.textBox_courseId.MaxLength = 11;
            this.textBox_courseId.Name = "textBox_courseId";
            this.textBox_courseId.Size = new System.Drawing.Size(54, 20);
            this.textBox_courseId.TabIndex = 66;
            // 
            // label8
            // 
            this.label8.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label8.ForeColor = System.Drawing.Color.White;
            this.label8.Location = new System.Drawing.Point(226, 412);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(30, 24);
            this.label8.TabIndex = 65;
            this.label8.Text = "Id:";
            // 
            // button_search
            // 
            this.button_search.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.button_search.BackColor = System.Drawing.Color.Gold;
            this.button_search.FlatAppearance.BorderSize = 0;
            this.button_search.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_search.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.button_search.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.button_search.Location = new System.Drawing.Point(12, 80);
            this.button_search.Name = "button_search";
            this.button_search.Size = new System.Drawing.Size(75, 29);
            this.button_search.TabIndex = 64;
            this.button_search.Text = "Search";
            this.button_search.UseVisualStyleBackColor = false;
            this.button_search.Click += new System.EventHandler(this.button_search_Click);
            // 
            // textBox_search
            // 
            this.textBox_search.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.textBox_search.Location = new System.Drawing.Point(93, 86);
            this.textBox_search.Name = "textBox_search";
            this.textBox_search.Size = new System.Drawing.Size(131, 20);
            this.textBox_search.TabIndex = 63;
            // 
            // button_clean
            // 
            this.button_clean.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.button_clean.BackColor = System.Drawing.Color.Orange;
            this.button_clean.FlatAppearance.BorderSize = 0;
            this.button_clean.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_clean.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.button_clean.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.button_clean.Location = new System.Drawing.Point(802, 505);
            this.button_clean.Name = "button_clean";
            this.button_clean.Size = new System.Drawing.Size(75, 29);
            this.button_clean.TabIndex = 62;
            this.button_clean.Text = "Clean";
            this.button_clean.UseVisualStyleBackColor = false;
            this.button_clean.Click += new System.EventHandler(this.button_clean_Click);
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(41)))), ((int)(((byte)(73)))));
            this.panel1.Controls.Add(this.label7);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(898, 58);
            this.panel1.TabIndex = 61;
            // 
            // label7
            // 
            this.label7.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.ForeColor = System.Drawing.Color.AliceBlue;
            this.label7.Location = new System.Drawing.Point(364, 19);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(178, 25);
            this.label7.TabIndex = 0;
            this.label7.Text = "Manage Course";
            // 
            // button_delete
            // 
            this.button_delete.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.button_delete.BackColor = System.Drawing.Color.IndianRed;
            this.button_delete.FlatAppearance.BorderSize = 0;
            this.button_delete.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_delete.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.button_delete.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.button_delete.Location = new System.Drawing.Point(802, 540);
            this.button_delete.Name = "button_delete";
            this.button_delete.Size = new System.Drawing.Size(75, 29);
            this.button_delete.TabIndex = 58;
            this.button_delete.Text = "Delete";
            this.button_delete.UseVisualStyleBackColor = false;
            this.button_delete.Click += new System.EventHandler(this.button_delete_Click);
            // 
            // button_update
            // 
            this.button_update.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.button_update.BackColor = System.Drawing.Color.DodgerBlue;
            this.button_update.FlatAppearance.BorderSize = 0;
            this.button_update.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_update.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.button_update.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.button_update.Location = new System.Drawing.Point(802, 577);
            this.button_update.Name = "button_update";
            this.button_update.Size = new System.Drawing.Size(75, 29);
            this.button_update.TabIndex = 57;
            this.button_update.Text = "Update";
            this.button_update.UseVisualStyleBackColor = false;
            this.button_update.Click += new System.EventHandler(this.button_update_Click);
            // 
            // DataGridView_course
            // 
            this.DataGridView_course.AllowUserToAddRows = false;
            this.DataGridView_course.AllowUserToDeleteRows = false;
            dataGridViewCellStyle4.BackColor = System.Drawing.Color.White;
            this.DataGridView_course.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle4;
            this.DataGridView_course.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.DataGridView_course.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.DataGridView_course.BackgroundColor = System.Drawing.Color.White;
            this.DataGridView_course.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.DataGridView_course.CellBorderStyle = System.Windows.Forms.DataGridViewCellBorderStyle.SingleHorizontal;
            this.DataGridView_course.ColumnHeadersBorderStyle = System.Windows.Forms.DataGridViewHeaderBorderStyle.None;
            dataGridViewCellStyle5.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle5.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(100)))), ((int)(((byte)(88)))), ((int)(((byte)(255)))));
            dataGridViewCellStyle5.Font = new System.Drawing.Font("Segoe UI", 10.5F);
            dataGridViewCellStyle5.ForeColor = System.Drawing.Color.White;
            dataGridViewCellStyle5.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle5.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle5.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.DataGridView_course.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle5;
            this.DataGridView_course.ColumnHeadersHeight = 30;
            dataGridViewCellStyle6.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle6.BackColor = System.Drawing.Color.White;
            dataGridViewCellStyle6.Font = new System.Drawing.Font("Segoe UI", 10.5F);
            dataGridViewCellStyle6.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            dataGridViewCellStyle6.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(231)))), ((int)(((byte)(229)))), ((int)(((byte)(255)))));
            dataGridViewCellStyle6.SelectionForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(71)))), ((int)(((byte)(69)))), ((int)(((byte)(94)))));
            dataGridViewCellStyle6.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.DataGridView_course.DefaultCellStyle = dataGridViewCellStyle6;
            this.DataGridView_course.EnableHeadersVisualStyles = false;
            this.DataGridView_course.GridColor = System.Drawing.Color.FromArgb(((int)(((byte)(231)))), ((int)(((byte)(229)))), ((int)(((byte)(255)))));
            this.DataGridView_course.Location = new System.Drawing.Point(12, 115);
            this.DataGridView_course.Name = "DataGridView_course";
            this.DataGridView_course.RowHeadersVisible = false;
            this.DataGridView_course.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.DataGridView_course.Size = new System.Drawing.Size(874, 294);
            this.DataGridView_course.TabIndex = 43;
            this.DataGridView_course.ThemeStyle.AlternatingRowsStyle.BackColor = System.Drawing.Color.White;
            this.DataGridView_course.ThemeStyle.AlternatingRowsStyle.Font = null;
            this.DataGridView_course.ThemeStyle.AlternatingRowsStyle.ForeColor = System.Drawing.Color.Empty;
            this.DataGridView_course.ThemeStyle.AlternatingRowsStyle.SelectionBackColor = System.Drawing.Color.Empty;
            this.DataGridView_course.ThemeStyle.AlternatingRowsStyle.SelectionForeColor = System.Drawing.Color.Empty;
            this.DataGridView_course.ThemeStyle.BackColor = System.Drawing.Color.White;
            this.DataGridView_course.ThemeStyle.GridColor = System.Drawing.Color.FromArgb(((int)(((byte)(231)))), ((int)(((byte)(229)))), ((int)(((byte)(255)))));
            this.DataGridView_course.ThemeStyle.HeaderStyle.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(100)))), ((int)(((byte)(88)))), ((int)(((byte)(255)))));
            this.DataGridView_course.ThemeStyle.HeaderStyle.BorderStyle = System.Windows.Forms.DataGridViewHeaderBorderStyle.None;
            this.DataGridView_course.ThemeStyle.HeaderStyle.Font = new System.Drawing.Font("Segoe UI", 10.5F);
            this.DataGridView_course.ThemeStyle.HeaderStyle.ForeColor = System.Drawing.Color.White;
            this.DataGridView_course.ThemeStyle.HeaderStyle.HeaightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.EnableResizing;
            this.DataGridView_course.ThemeStyle.HeaderStyle.Height = 30;
            this.DataGridView_course.ThemeStyle.ReadOnly = false;
            this.DataGridView_course.ThemeStyle.RowsStyle.BackColor = System.Drawing.Color.White;
            this.DataGridView_course.ThemeStyle.RowsStyle.BorderStyle = System.Windows.Forms.DataGridViewCellBorderStyle.SingleHorizontal;
            this.DataGridView_course.ThemeStyle.RowsStyle.Font = new System.Drawing.Font("Segoe UI", 10.5F);
            this.DataGridView_course.ThemeStyle.RowsStyle.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(71)))), ((int)(((byte)(69)))), ((int)(((byte)(94)))));
            this.DataGridView_course.ThemeStyle.RowsStyle.Height = 22;
            this.DataGridView_course.ThemeStyle.RowsStyle.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(231)))), ((int)(((byte)(229)))), ((int)(((byte)(255)))));
            this.DataGridView_course.ThemeStyle.RowsStyle.SelectionForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(71)))), ((int)(((byte)(69)))), ((int)(((byte)(94)))));
            this.DataGridView_course.Click += new System.EventHandler(this.DataGridView_course_Click);
            // 
            // label6
            // 
            this.label6.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label6.ForeColor = System.Drawing.Color.White;
            this.label6.Location = new System.Drawing.Point(12, 515);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(109, 24);
            this.label6.TabIndex = 72;
            this.label6.Text = "Descirption:";
            // 
            // textBox_courseDescription
            // 
            this.textBox_courseDescription.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.textBox_courseDescription.Location = new System.Drawing.Point(12, 542);
            this.textBox_courseDescription.Multiline = true;
            this.textBox_courseDescription.Name = "textBox_courseDescription";
            this.textBox_courseDescription.Size = new System.Drawing.Size(531, 57);
            this.textBox_courseDescription.TabIndex = 71;
            // 
            // textBox_courseName
            // 
            this.textBox_courseName.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.textBox_courseName.Location = new System.Drawing.Point(12, 439);
            this.textBox_courseName.Name = "textBox_courseName";
            this.textBox_courseName.Size = new System.Drawing.Size(147, 20);
            this.textBox_courseName.TabIndex = 70;
            // 
            // label2
            // 
            this.label2.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(12, 409);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(132, 24);
            this.label2.TabIndex = 69;
            this.label2.Text = "Course Name:";
            // 
            // textBox_courseHours
            // 
            this.textBox_courseHours.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.textBox_courseHours.Location = new System.Drawing.Point(12, 492);
            this.textBox_courseHours.Name = "textBox_courseHours";
            this.textBox_courseHours.Size = new System.Drawing.Size(147, 20);
            this.textBox_courseHours.TabIndex = 68;
            // 
            // label1
            // 
            this.label1.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(15, 465);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(66, 24);
            this.label1.TabIndex = 67;
            this.label1.Text = "Hours:";
            // 
            // ManageCourseForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(51)))), ((int)(((byte)(73)))));
            this.ClientSize = new System.Drawing.Size(898, 611);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.textBox_courseDescription);
            this.Controls.Add(this.textBox_courseName);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textBox_courseHours);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBox_courseId);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.button_search);
            this.Controls.Add(this.textBox_search);
            this.Controls.Add(this.button_clean);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.button_delete);
            this.Controls.Add(this.button_update);
            this.Controls.Add(this.DataGridView_course);
            this.Name = "ManageCourseForm";
            this.Text = "ManageCourse";
            this.Load += new System.EventHandler(this.ManageCourse_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.DataGridView_course)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox_courseId;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Button button_search;
        private System.Windows.Forms.TextBox textBox_search;
        private System.Windows.Forms.Button button_clean;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button button_delete;
        private System.Windows.Forms.Button button_update;
        private Guna.UI2.WinForms.Guna2DataGridView DataGridView_course;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox textBox_courseDescription;
        private System.Windows.Forms.TextBox textBox_courseName;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox textBox_courseHours;
        private System.Windows.Forms.Label label1;
    }
}