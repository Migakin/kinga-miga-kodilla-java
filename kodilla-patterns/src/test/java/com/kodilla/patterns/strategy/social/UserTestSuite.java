package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
     public void testDefaultSharingStrategies() {

        //given
        User mark = new Millenials("Mark Leclerc");
        User sylvie = new YGeneration("Sylvie Miaud");
        User leo = new ZGeneration("Leo Bienvenue");

        //when
        String markPosts = mark.sharePost();
        System.out.println("Mark is  " + markPosts);
        String sylviePosts = sylvie.sharePost();
        System.out.println("Sylvie is  " + sylviePosts);
        String leoPosts = leo.sharePost();
        System.out.println("Leo is  " + leoPosts);

        //then
        Assert.assertEquals("posting on Twitter", markPosts);
        Assert.assertEquals("posting on Facebook", sylviePosts);
        Assert.assertEquals("posting on Snapchat", leoPosts);
    }

    @Test
    public void testIndividualSharingStrategies() {

        //givem
        User leo = new ZGeneration("Leo Bienvenue");

        //when
        String leoPosts = leo.sharePost();
        System.out.println("Leo is  " + leoPosts);
        leo.setSocialMedia(new FacebookPublisher());
        leoPosts = leo.sharePost();
        System.out.println("Leo is  " + leoPosts);

        //then
        Assert.assertEquals("posting on Facebook", leoPosts);

    }
}
