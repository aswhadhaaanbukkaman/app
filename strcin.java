import java.io.*;
import java.util.Scanner;
class strcin
{
public static void main(String str[])
{
Scanner read=new Scanner(System.in);
String s=read.nextLine();
String st[]=s.split("");
int n[]=new int[st.length];
for(int i=0;i<st.length;i++)
{
 n[i]=Integer.parseInt(st[i]);
 }
 for(int i=0;i<st.length;i++)
{
 System.out.print(n[i]);
 
 }
 
 }
 }
 
