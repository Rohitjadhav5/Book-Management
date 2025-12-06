package mypkg;
import java.io.*;
import mypkg.Util;
public class Account implements Serializable
{
    int no;
    double bal;
    boolean state;
    public Account()
    {
        no=0;
        bal=0.0;
        nm=new String();
        state=true;
    }
    public String toString()
    {
        String s="Account No:"+no+"\nName:"+nm+"\nBalance:"+bal+"\nState:"+state;
        return s;
    }
    public void display()
    {
        Util.display(toString());
    }
    public void setData(int n)
    {
        no=n;
        nm=Util.sInput("Name");
        bal=Util.dInput("Balance");
        state=true;
    }
    public int getNo()
    {
        return no;
    }
    public int getName()
    {
        return nm;
    }
    public int getBalance()
    {
        return bal;
    }
    public int getState()
    {
        return state;
    }
    public void delete()
    {
        state=false;
    }
}