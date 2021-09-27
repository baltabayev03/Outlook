package com.company;

public class Main {

    public static void main(String[] args) {
        Outlook outlook= new Outlook();
        Student abay= new Student("Abay");
        Student maksat= new Student("Maksat");
        Mail m= new Mail("Maksat","Maksat@mail.ru","Your enrollment verification was finished!");

        outlook.Attach(abay);
        outlook.Attach(maksat);

        outlook.addMail(m);
    }
}
