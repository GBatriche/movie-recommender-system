package io.datajek.spring.basics.movie_recommender_system;
import java.util.Arrays;

import io.datajek.spring.basics.movie_recommender_system.logic.ContentBasedFilter;
import io.datajek.spring.basics.movie_recommender_system.logic.RecommenderImplementation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));

    }
}