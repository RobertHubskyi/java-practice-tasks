package org.example.Module_12_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {
    private String title;
    private int duration;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Фільм: " + title + ", тривалість: " + duration;
    }

    public static void main(String[] args) {
        Map<String, List<Movie>> movie = new HashMap<>();

        movie.putIfAbsent("Drama", new ArrayList<>());
        movie.get("Drama").add(new Movie("The Shawshank Redemption", 142));
        movie.get("Drama").add(new Movie("Forrest Gump", 144));
        movie.get("Drama").add(new Movie("A Beautiful mind", 135));

        movie.putIfAbsent("Comedy", new ArrayList<>());
        movie.get("Comedy").add(new Movie("The Mask", 101));
        movie.get("Comedy").add(new Movie("Home Alone", 103));
        movie.get("Comedy").add(new Movie("SuperBad", 113));

        movie.putIfAbsent("Action", new ArrayList<>());
        movie.get("Action").add(new Movie("John Wick", 101));
        movie.get("Action").add(new Movie("Mad Max: Fury Road", 120));
        movie.get("Action").add(new Movie("Die Hard",132));

        for (Map.Entry<String, List<Movie>> entry : movie.entrySet()){
            System.out.println("Категорія: " + entry.getKey());
            for (Movie movie1 : entry.getValue()){
                System.out.println(" - " + movie1);
            }
        }

        for (Map.Entry<String, List<Movie>> entry : movie.entrySet()){
            int total = 0;
            for (Movie movie1 : entry.getValue()){
                total += movie1.getDuration();
            }

            System.out.println("Загальна тривалість фільмів у жанрі: " + entry.getKey()
                    + ": " + total + " хв");
        }
    }
}
