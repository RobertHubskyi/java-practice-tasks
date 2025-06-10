package org.example.Module_02_Comditional_Statements;

public class EntryPermission {
    public static void main(String[] args) {
        int age = 17;
        boolean hasParent = true;

        if (age >= 18 || (age >= 16 && hasParent)) {
            System.out.println("Вхід дозволено");
        } else {
            System.out.println("Вхід заборонено");
        }
    }
}
