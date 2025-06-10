package org.example.Module_11_Advanced_OOP;

public class PrintService {
    public void printAll(PrintAble[] documents) {
        for (PrintAble doc : documents){
            doc.print();
        }
    }


}
