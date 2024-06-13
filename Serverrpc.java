import java.io.*;
import java.net.*;
import java.util.*;
class Serverrpc
{
public static void main(String args[])
{
try
{
ServerSocket obj=new ServerSocket(140);
while(true)
{
Socket obj1=obj.accept();
DataInputStream din=new DataInputStream(obj1.getInputStream());
DataOutputStream dout=new DataOutputStream(obj1.getOutputStream());
String str=din.readLine();
Process p=Runtime.getRuntime().exec(str);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}