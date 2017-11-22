package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int postsNumber;

    public ForumUser(final int userId, final String username, final char sex, final LocalDate birthdate, final int postsNumber) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthdate = birthdate;
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
