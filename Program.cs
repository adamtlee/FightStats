using System;
using System.Collections.Generic;
using System.IO;
using System.Reflection;

namespace fightstats
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = Path.Combine(Environment.CurrentDirectory, @"data\", "fightstatsdata.csv");
            
            var Athletes = new List<Athlete>()
            {
                new Athlete(){
                    Team = "Independent",
                    Name = "Bruce Lee",
                    Win = 100,
                    Loss = 0,
                    Draw = 0,
                    NoContest = 0
                    
                }
            };

            Console.WriteLine("Athlete in the List");
           
           foreach (Athlete athlete in Athletes)
           {
               Console.WriteLine("Team: " + athlete.Team);
               Console.WriteLine("Name: " + athlete.Name);
               Console.WriteLine("Win: " + athlete.Win);
               Console.WriteLine("Loss: " + athlete.Loss);
               Console.WriteLine("Draw: " + athlete.Draw);
               Console.WriteLine("No Contest: " + athlete.NoContest);
           }
            
            Console.WriteLine();
            try
            {
                if (File.Exists(path))
                {
                    Console.WriteLine("File exists"); 
                }

                using (StreamReader sr = new StreamReader(path))
                {
                    Console.WriteLine("Athletes in the CSV File: ");
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
