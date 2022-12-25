package org.Group_Chat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ICQ icq = new ICQ();
        together OneToOne = new together();
        User client1 = new User("Петя", icq);
        User client2 = new User("Маша", icq);
        User client3 = new User("Миша", icq);
        User client4 = new User("Вася", OneToOne);
        User client5 = new User("Ваня", OneToOne);

        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client3);

        OneToOne.appendClient(client4);
        OneToOne.appendClient(client5);

        client1.sendMsg("hi gays!");
        client2.sendMsg("Hi!");
        client3.sendMsg("hello!");
        client4.sendMsg("Hello");
        client4.sendMsg("hi bro");

    }
}

class User {
    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    String name;
    private Chat chatroom;

    void printMessage(String msg) {
        System.out.printf("Сообщение‚ %s: %s\n", name, msg);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }
}

interface Chat {
    void sendMessage(String msg, User user);

    void appendClient(User user);
}

class ICQ implements Chat {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String text, User me) {

        for (User user : users) {
            if (user.name != me.name) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User client) {
        System.out.println("\n >>> К чату присоединился новый пользователь " + client.name);
        users.add(client);

    }
}

class together implements Chat {

    ArrayList<User> users_together = new ArrayList<>();

    @Override
    public void sendMessage(String text, User me) {
        for (User user : users_together) {
            if (user.name != me.name) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User client_one) {
        System.out.println("\n >>> К чату присоединился твой собеседник " + client_one.name);
        users_together.add(client_one);
    }
}