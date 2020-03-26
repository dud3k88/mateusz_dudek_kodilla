package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kris = new Millenials("Kris");
        User tom = new YGeneration("Tom");
        User pablo = new ZGeneration("Pablo");

        //When
        String krisShare = kris.sharePost();
        System.out.println("Kris share on: " + krisShare);
        String tomShare = tom.sharePost();
        System.out.println("Tom share on: " + tomShare);
        String pabloShare = pablo.sharePost();
        System.out.println("Pablo share on: " + pabloShare);

        //Then
        Assert.assertEquals("Facebook", krisShare);
        Assert.assertEquals("Twitter", tomShare);
        Assert.assertEquals("SnapChat", pabloShare);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User kris = new Millenials("Kris");

        //When
        String krisShare = kris.sharePost();
        System.out.println("Kris share on: " + krisShare);
        kris.setSocialPublisher(new TwitterPublisher());
        krisShare = kris.sharePost();
        System.out.println("Kris share on: " + krisShare);

        //Then
        Assert.assertEquals("Twitter", krisShare);
    }
}
