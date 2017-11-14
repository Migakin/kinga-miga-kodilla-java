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

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = forumStats.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(0, averagePostsPerUser);
    }
    @Test
    public void  testCalculateStatisticAveragePostsPerUser1000Mock(){
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

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

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

        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(0, averageCommentsPerUser);
    }

    @Test
    public void  testCalculateStatisticAverageCommentsPerPostMock(){  //when comments < posts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics forumStats = new CalculateStatistics(statisticsMock);

        int commentsNumber = 100;
        int postsNumber = 1000;

        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int averageCommentsPerPost = forumStats.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageCommentsPerPost);
    }
}







































