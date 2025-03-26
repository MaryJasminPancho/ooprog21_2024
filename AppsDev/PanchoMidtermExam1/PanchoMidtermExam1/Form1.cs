using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PanchoMidtermExam1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int score1 = Convert.ToInt32(textBox1.Text);
            int score2 = Convert.ToInt32(textBox2.Text);
            int score3 = Convert.ToInt32(textBox3.Text);

            if(score1<0 || score1>100 || score2<0 || score2>100 || score3<0 || score3>100)
            {
                label2.Text = "Invalid Score";
                return;
            }

            int[] scores = { score1, score2, score3 };
            Array.Sort(scores);

            int sum = scores[1] + scores[2];

            if (sum >= 180)
            {
                label2.Text = "A";
            }
            else if (sum >= 160 && sum <= 179)
            {
                label2.Text = "B";
            }
            else if (sum >= 140 && sum <= 159)
            {
                label2.Text = "C";
            }
            else if (sum >= 120 && sum <= 139)
            {
                label2.Text = "D";
            }
            else
            {
                label2.Text = "F";
            }
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}