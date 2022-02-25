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
using DGVPrinterHelper;

namespace StudentSystem
{
    public partial class PrintStudent : Form
    {
        StudentClass studentClass = new StudentClass();
        DGVPrinter dgvPrinter = new DGVPrinter();
        public PrintStudent()
        {
            InitializeComponent();
        }

        public void showData(MySqlCommand mySqlCommand)
        {
            DataGridView_student.ReadOnly = true;
            DataGridViewImageColumn dataGridViewImageColumn = new DataGridViewImageColumn();
            DataGridView_student.DataSource = studentClass.getList(mySqlCommand);

            dataGridViewImageColumn = (DataGridViewImageColumn)DataGridView_student.Columns[7];
            dataGridViewImageColumn.ImageLayout = DataGridViewImageCellLayout.Zoom;
        }

        private void button_print_Click(object sender, EventArgs e)
        {
            dgvPrinter.Title = "Student List";
            dgvPrinter.SubTitle = string.Format("Date: {0}", DateTime.Now.Date);
            dgvPrinter.SubTitleFormatFlags = StringFormatFlags.LineLimit | StringFormatFlags.NoClip;
            dgvPrinter.PageNumbers = true;
            dgvPrinter.PageNumberInHeader = false;
            dgvPrinter.PorportionalColumns = false;
            dgvPrinter.HeaderCellAlignment = StringAlignment.Near;
            dgvPrinter.Footer = "foxlearn";
            dgvPrinter.FooterSpacing = 15;
            dgvPrinter.printDocument.DefaultPageSettings.Landscape = true;
            dgvPrinter.PrintDataGridView(DataGridView_student);
        }

        private void PrintStudent_Load(object sender, EventArgs e)
        {
            showData(new MySqlCommand("SELECT * FROM `student`"));
        }

        private void button_search_Click(object sender, EventArgs e)
        {
            string selectQuery;
            if (radioButton_all.Checked)
            {
                selectQuery = "SELECT * FROM `student`";
            }
            else if (radioButton_male.Checked)
            {
                selectQuery = "SELECT * FROM `student` WHERE `Gender`='Male'";
            }
            else
            {
                selectQuery = "SELECT * FROM `student` WHERE `Gender`='Female'";
            }
            showData(new MySqlCommand(selectQuery));
        }
    }
}
