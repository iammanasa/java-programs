import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Pattern 
{
       public static void main(String args[])
             {
                  if(args.length>0)
                    {
                    int n=Integer.parseInt(args[0]);
                   
                  for(int i=1;i<=n;i++)
                  {
                      for(int j=1;j<=i;j++)
                      {
                          System.out.print("* ");
                      }
                                        System.out.println("   ");

                  }
             }
             else
             {
                 System.out.println("enter any number");
             }
}
}