package io.datajek.spring.basics.movie_recommender_system.logic;

import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String [] recommendMovies (String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
