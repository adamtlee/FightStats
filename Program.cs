using System;
using System.IO;
using System.Reflection;

namespace fightstats
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = Path.Combine(Environment.CurrentDirectory, @"data\", "fightstatsdata.csv");

            try
            {
                if (File.Exists(path))
                {
                    Console.WriteLine("File exists"); 
                }

                using (StreamReader sr = new StreamReader(path))
                {
                    while (sr.Peek() >= 0)
                    {
                        Console.WriteLine(sr.ReadLine());
                    }
                }
            } 
            catch (Exception e)
            {
                Console.WriteLine("The process failed: {0}", e.ToString());
            }
        }
    }
}
