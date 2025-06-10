package org.example.Module_08_Classes_And_Objects_Deep;

public class SeasonActivity {
    public enum Season{
        SPRING("Цвітуть квіти"),
        SUMMER("Купаємося"),
        AUTUMN("Жовтіє листя"),
        WINTER("Катаємось на санях");

        private final String activity;

        Season(String activity) {
            this.activity = activity;
        }

        public String getActivity() {
            return activity;
        }
    }


    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println("Пора року: " + season + " - " + season.activity);
        }
    }
}
