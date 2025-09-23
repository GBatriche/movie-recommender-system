package io.datajek.spring.basics.movie_recommender_system.lesson1;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation() {
        super();
        this.filter = filter;
    }
    public String [] recommendMovies (String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
    }
