package io.datajek.spring.basics.movie_recommender_system.lesson1;
public class ContentBasedFilter implements Filter{
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}