package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    @Test
    public void  testCalculateStatisticAveragePostsPerUserMock(){
    //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        List<String>forumUsersNames = new ArrayList<String>();
        forumUsersNames.add("Jan Kowalski");
        forumUsersNames.add("Anna Kwaiatkowska");
        forumUsersNames.add("Marian Zalewski");
        forumUsersNames.add("Katarzyna Lewandowska");
        forumUsersNames.add("Urszula Piekarska");

        int postsNumber = 0;
        int commentsNumber = 1;

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = forumStats.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(0, averagePostsPerUser);
    }
    @Test
    public void  testCalculateStatisticAveragePostsPerUser1000Mock(){ // when posts = 1000
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        List<String>forumUsersNames = new ArrayList<String>();
        forumUsersNames.add("Jan Kowalski");
        forumUsersNames.add("Anna Kwaiatkowska");
        forumUsersNames.add("Marian Zalewski");
        forumUsersNames.add("Katarzyna Lewandowska");
        forumUsersNames.add("Urszula Piekarska");

        int postsNumber = 1000;
        int commentsNumber = 1;

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = forumStats.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(200, averagePostsPerUser);
    }
    @Test
    public void  testCalculateStatisticAverageCommentsPerUserMock(){  //when comments = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        List<String>forumUsersNames = new ArrayList<String>();
        forumUsersNames.add("Jan Kowalski");
        forumUsersNames.add("Anna Kwaiatkowska");
        forumUsersNames.add("Marian Zalewski");
        forumUsersNames.add("Katarzyna Lewandowska");
        forumUsersNames.add("Urszula Piekarska");

        int commentsNumber = 0;
        int postsNumber = 1;


        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(0, averageCommentsPerUser);
    }

    @Test
    public void  testCalculateStatisticAverageCommentsPerPostWhenMorePostsMock(){  //when comments < posts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        List<String>forumUsersNames = new ArrayList<String>();
        forumUsersNames.add("Jan Kowalski");
        forumUsersNames.add("Anna Kwaiatkowska");
        forumUsersNames.add("Marian Zalewski");
        forumUsersNames.add("Katarzyna Lewandowska");
        forumUsersNames.add("Urszula Piekarska");

        int postsNumber = 1000;
        int commentsNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averageCommentsPerPost = forumStats.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10, averageCommentsPerPost);
    }
    @Test
    public void  testCalculateStatisticAverageCommentsPerPostMockWhenMoreComments(){  //when comments > posts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        List<String>forumUsersNames = new ArrayList<String>();
        forumUsersNames.add("Jan Kowalski");
        forumUsersNames.add("Anna Kwaiatkowska");
        forumUsersNames.add("Marian Zalewski");
        forumUsersNames.add("Katarzyna Lewandowska");
        forumUsersNames.add("Urszula Piekarska");

        int postsNumber = 10000;
        int commentsNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);


        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averageCommentsPerPost = forumStats.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100, averageCommentsPerPost);
    }

    @Test
    public void  testCalculateStatisticUsersNumber0(){  // when users = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        List<String>forumUsersNames = new ArrayList<String>();

        int postsNumber = 100;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);


        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averagePostPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(100, averagePostPerUser);
    }
}







































