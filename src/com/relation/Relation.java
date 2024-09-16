package com.relation;
import java.lang.*;
import java.util.*;


public class Relation {
    public static void main(String[] args) {

        ArrayList<Member> list = new ArrayList<>();
        list.add(new Member("Eswaran",null,null,'M'));    // 0
        list.add(new Member("Mookammal",null,null,'F'));   // 1
        list.add(new Member("Kannan",list.get(0),list.get(1),'F'));     // 2

        list.add(new Member("Muniyappan",null,null,'M'));//3
        list.add(new Member("Pandiyammal",null,null,'F'));//4
        list.add(new Member("Thangam",list.get(3),list.get(4),'F'));//5
        list.add(new Member("Bala",list.get(2),list.get(5),'M'));//6
        list.add(new Member("Aarthi",null,null,'F'));//7
        list.add(new Member("Vijay",list.get(6),list.get(7),'M'));//8
        list.add(new Member("Sanjay",list.get(6),list.get(7),'M'));//9
        list.add(new Member("Samantha",list.get(6),list.get(7),'F'));//10
        list.add(new Member("Marima",list.get(3),list.get(4),'F'));//11
        list.add(new Member("Panju",list.get(3),list.get(4),'F'));//12
        list.add(new Member("Muni Small",list.get(3),list.get(4),'M'));//13
        list.add(new Member("Arumugam",null,null,'M'));    // 14
        list.add(new Member("Murugan",null,null,'M'));    // 15
        list.add(new Member("Viji",null,null,'F'));    // 16



        list.add(new Member("Raja",list.get(14),list.get(11),'M'));//17
        list.add(new Member("vani",list.get(14),list.get(11),'F'));//18
        list.add(new Member("maripa",list.get(15),list.get(12),'M'));//19
        list.add(new Member("Aish",list.get(15),list.get(12),'F'));//20
        list.add(new Member("Dharani",list.get(13),list.get(16),'M'));//21
        list.add(new Member("Hema",list.get(13),list.get(16),'F'));//22


       Member.getCousins(list,list.get(12));


    }
}
