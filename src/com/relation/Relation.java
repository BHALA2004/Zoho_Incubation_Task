package com.relation;
import java.lang.*;
import java.util.*;


public class Relation {
    public static void main(String[] args) {

        ArrayList<Member> list = new ArrayList<>();
        list.add(new Member("a",null,null,'M'));    // 0
        list.add(new Member("b",null,null,'F'));   // 1
        list.add(new Member("c",list.get(0),list.get(1),'F'));     // 2

        list.add(new Member("d",null,null,'M'));//3
        list.add(new Member("e",null,null,'F'));//4
        list.add(new Member("f",list.get(3),list.get(4),'F'));//5
        list.add(new Member("g",list.get(2),list.get(5),'M'));//6
        list.add(new Member("h",null,null,'F'));//7
        list.add(new Member("i",list.get(6),list.get(7),'M'));//8
        list.add(new Member("j",list.get(6),list.get(7),'F'));//9
        list.add(new Member("k",list.get(6),list.get(7),'M'));//10
        list.add(new Member("l",list.get(3),list.get(4),'F'));//11
        list.add(new Member("m",list.get(3),list.get(4),'F'));//12
        list.add(new Member("n",list.get(3),list.get(4),'M'));//13
        list.add(new Member("o",null,null,'M'));    // 14
        list.add(new Member("p",null,null,'M'));    // 15
        list.add(new Member("q",null,null,'F'));    // 16



        list.add(new Member("r",list.get(14),list.get(11),'M'));//17
        list.add(new Member("s",list.get(14),list.get(11),'F'));//18
        list.add(new Member("t",list.get(15),list.get(12),'M'));//19
        list.add(new Member("u",list.get(15),list.get(12),'F'));//20
        list.add(new Member("v",list.get(13),list.get(16),'F'));//21
        list.add(new Member("w",list.get(13),list.get(16),'F'));//22


       Member.getCousins(list,list.get(12));


    }
}
