package com.thinking.machines.hr.util;
import java.io.*;
public class Keyboard
{

private BufferedReader bufferedReader;

//default constructor
public Keyboard()
{
this.bufferedReader=new BufferedReader(new InputStreamReader(System.in));
}
//getString method
public String getString()
{
String s;
try
{
s=bufferedReader.readLine();
}catch(IOException ioException)
{
s="";
}
return s;
}
//getCharacter method
public char getCharacter()
{
return getString().charAt(0);
}
//getInt method
public int getInt()
{
int i;
try
{
i=Integer.parseInt(getString());
}catch(NumberFormatException numberFormatException)
{
i=0;
}
return i;
}
//getShort method
public short getShort()
{
short s;
try
{
s=Short.parseShort(getString());
}catch(NumberFormatException numberFormatException)
{
s=0;
}
return s;
}
//getLong method
public long getLong()
{
long x;
try
{
x=Long.parseLong(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}
//getByte method
public byte getByte()
{
byte x;
try
{
x=Byte.parseByte(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}
//getDouble method
public double getDouble()
{
double x;
try
{
x=Double.parseDouble(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}
//getFloat method
public float getFloat()
{
float x;
try
{
x=Float.parseFloat(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}
//getBoolean method
public boolean getBoolean()
{
boolean x;
try
{
x=Boolean.parseBoolean(getString());
}catch(NumberFormatException nfe)
{
x=false;
}
return x;
}


}
