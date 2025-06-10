package org.example.Module_09_Packages_Access_Modifiers_Imports.App;

import org.example.Module_09_Packages_Access_Modifiers_Imports.Model.Document;
import org.example.Module_09_Packages_Access_Modifiers_Imports.Model.Teacher;
import org.example.Module_09_Packages_Access_Modifiers_Imports.Model.User;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Math");
        teacher.printSubject();
       // teacher.subject;
    }
}
