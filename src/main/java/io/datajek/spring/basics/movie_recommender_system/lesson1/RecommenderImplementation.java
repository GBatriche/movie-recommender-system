package io.datajek.spring.basics.movie_recommender_system.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        CollaborativeFilter filter = new CollaborativeFilter();
        String[] results =
                filter.getRecommendations("Finding Dory");
        return results;
    }
}
