package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(1000,"Scratch", 'M', LocalDate.of(1993,5,24), 5));
        forumUsersList.add(new ForumUser(1001,"Lunar", 'F', LocalDate.of(1990,10,3), 25));
        forumUsersList.add(new ForumUser(1002,"Sam", 'M', LocalDate.of(1998,8,3), 197));
        forumUsersList.add(new ForumUser(1003,"Dorothy", 'F', LocalDate.of(1991,2,17), 103));
        forumUsersList.add(new ForumUser(1004,"Hannibal", 'M', LocalDate.of(1989,10,7), 89));
        forumUsersList.add(new ForumUser(1005,"Bigs", 'M', LocalDate.of(1995,8,14), 17));
        forumUsersList.add(new ForumUser(1006,"Southpaw", 'M', LocalDate.of(1999,1,30), 47));
        forumUsersList.add(new ForumUser(1007,"Dahlia", 'F', LocalDate.of(2000,6,22), 0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<ForumUser>(forumUsersList);
    }

}
