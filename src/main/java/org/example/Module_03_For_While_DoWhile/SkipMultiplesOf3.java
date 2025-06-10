package org.example.Module_03_For_While_DoWhile;

public class SkipMultiplesOf3 {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;

            }
            System.out.println("Числа які не діляться на 3: " + i);
        }
    }
}
