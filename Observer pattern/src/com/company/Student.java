package com.company;
import java.util.ArrayList;
public class Student implements Observer{
    String name;
    public Student(String name){
        this.name=name;
    }
    public void checkMail(ArrayList<Mail> m)
    {
        for(int i=0; i<m.size(); i++)
        {
            if(name.compareTo(m.get(i).receiverName)==0)
                System.out.println(name+ ": "+ m.get(i).letter);
        }
    }
    public void update(Object obj)
    {
        if (obj instanceof Outlook)
        {
            Outlook ou=(Outlook) obj;
            checkMail(ou.getState());
        }
    }
}

