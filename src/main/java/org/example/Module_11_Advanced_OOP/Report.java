package org.example.Module_11_Advanced_OOP;

public class Report implements PrintAble {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Сьогодні була написана стаття: " + title + ", заголовок: " + content);
    }
}
