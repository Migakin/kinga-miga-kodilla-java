package com.kodilla.testing.forum.statistics;


import java.util.ArrayList;

public class CalculateStatistics {
    private Statistics statistics;
    private ArrayList<Integer> statisticsResults = new ArrayList<Integer>();

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
    public int getUsersNumber(){
        int usersNumber = statistics.usersNames().size();
        return usersNumber;
    }

    public int getPostsNumber(){
        int postsNumber = statistics.postsCount();
        return postsNumber;
    }

    public int getCommentsNumber(){
        int commentsNumber = statistics.commentsCount();
        return commentsNumber;
    }

    public int getAveragePostsPerUser(){
        int averagePostsPerUser = getPostsNumber()/getUsersNumber();
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser(){
        int averageCommentsPerUser = getCommentsNumber()/getUsersNumber();
        return averageCommentsPerUser;
    }

     public int getAverageCommentsPerPost(){
        int averageCommentsPerPost = getPostsNumber()/getCommentsNumber();
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        int usersNumber = getUsersNumber();
        int postsNumber = getPostsNumber();
        int commentsNumber = getCommentsNumber();
        int averagePostsPerUser = getAveragePostsPerUser();
        int averageCommentsPerUser = getAverageCommentsPerUser();
        int averageCommentsPerPost = getAverageCommentsPerPost();


        statisticsResults.add(usersNumber);
        statisticsResults.add(postsNumber);
        statisticsResults.add(commentsNumber);
        statisticsResults.add(averagePostsPerUser);
        statisticsResults.add(averageCommentsPerUser);
        statisticsResults.add(averageCommentsPerPost);
    }

    public ArrayList<Integer> getStatisticsResults() {
        return statisticsResults;
    }
}
