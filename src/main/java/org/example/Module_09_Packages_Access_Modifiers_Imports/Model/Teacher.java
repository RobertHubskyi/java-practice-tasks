package org.example.Module_09_Packages_Access_Modifiers_Imports.Model;

public class Teacher {
    protected String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void printSubject(){
        System.out.println("Предмет: " + subject);
    }
}
