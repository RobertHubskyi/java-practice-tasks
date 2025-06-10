package org.example.Module_11_Advanced_OOP;

public interface PlayAble {
    void play();

    public static void main(String[] args) {
        PlayAble[] music = {
                new Piano(),
                new Guitar()
        };

        for (PlayAble playAble : music){
            playAble.play();
        }
    }
}
