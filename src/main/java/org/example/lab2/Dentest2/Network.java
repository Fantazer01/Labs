package org.example.lab2.Dentest2;

import java.util.ArrayList;

public class Network {
    public class Member { // Класс Member является внутренним
        // для класса Network
        private String name;
        private ArrayList<Member> friends;
        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>() ;
        }
        public void leave () {
            members.remove(this ) ;
        }
        public String getname(){return name;}
    }
    private ArrayList<Member> members = new ArrayList<> () ;
    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

}
