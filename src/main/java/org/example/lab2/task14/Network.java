package org.example.lab2.task14;

import java.util.ArrayList;

public class Network {
    public Network() {
        this.members = new ArrayList<>();
    }

    public class Member { // Класс Member является внутренним для класса org.example.task14.Network
        private final String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            ArrayList<Member> friends = new ArrayList<>();
        }

        public void leave() {
            unenroll(this);
        }

        @Override
        public String toString() {
            return "Name: " + name + ", count of friends: " + friends.size();
        }
    }

    private final ArrayList<Member> members;

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unenroll(Member m) {
        members.remove(m);
    }
}

