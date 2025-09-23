package io.datajek.spring.basics.movie_recommender_system.logic;

public interface Filter {
    public String[] getRecommendations(String movie);
}