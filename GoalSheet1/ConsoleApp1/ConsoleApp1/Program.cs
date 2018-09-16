using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{

    public class CItem
    {
        protected int m_count;
        public string m_name;
        public CItem(int count, string name)
        {
            m_count = count;
            m_name = name;
        }

        public static int run()
        {
            
            return 11;
        }
        public virtual int hide()
        {
            return 12;
        }
    }
    public class CArmour : CItem
    {
        public CArmour(int count, string name)
            :base(count, name)
        {

        }

        public virtual int hide()
        {
            return 15;
        }
    }

    public class App
    {
        public void Run()
        {

        }

    }

    public class Program
    {
        CArmour armour;
        CItem item = new CItem(15, "GFF");


        public static void Main(string[] args)
        {
            CItem poop = new CItem(10, "turd");
            CArmour pencil = new CArmour(1, "my lucky pencil");

            int i = CItem.run();
            int f = pencil.hide();

            
        }
    }
}
