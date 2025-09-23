package io.datajek.spring.basics.movie_recommender_system;
import java.util.Arrays;

import io.datajek.spring.basics.movie_recommender_system.logic.ContentBasedFilter;
import io.datajek.spring.basics.movie_recommender_system.logic.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }
}