import java.io.*;
import java.util.*;
import java.util.Scanner;
public class PosNeg 
{
    public static void main(String args[]) 
    { 
        if(args.length>0)
        {
          int pos=Integer.parseInt(args[0]);
         int neg=Integer.parseInt(args[0]);
            if(pos>0)
            {
                System.out.println("positive number");
            }
            else if(neg<0)
            {
                System.out.println("negative number");
            }
            else
            {
                System.out.println("either positive nor negative");
            }
        }
        else
        {
            System.out.println("enter the number");
        }
    }
}