using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PanchoMidtermExam2
{
    public partial class Form1: Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals("Red", StringComparison.OrdinalIgnoreCase))
            {
                output.Text = "STOP";
            }
            else if (textBox1.Text.Equals("Green", StringComparison.OrdinalIgnoreCase))
            {
                if (textBox2.Text.Equals("true", StringComparison.OrdinalIgnoreCase))
                {
                    output.Text = "STOP";
                }
                else
                {
                    output.Text = "GO";
                }
            }
            else if (textBox1.Text.Equals("Yellow", StringComparison.OrdinalIgnoreCase))
            {
                if (textBox3.Text.Equals("true", StringComparison.OrdinalIgnoreCase))
                {
                    output.Text = "STOP";
                }
                else
                {
                    output.Text = "SLOW DOWN";
                }
            }

            /*hides the visibility of the textboxes and labels
            textBox1.Visible = false;
            textBox2.Visible = false;
            textBox3.Visible = false;

            label2.Visible = false;
            label3.Visible = false;
            label4.Visible = false;*/
        }

        private void output_Click(object sender, EventArgs e)
        {

        }
    }
}
