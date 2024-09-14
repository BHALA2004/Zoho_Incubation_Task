package com.relation;

import java.util.ArrayList;
import java.util.List;

public class Member {

     String name;
     Member father;
     Member mother;

     char gender;



    public Member(String name, Member father, Member mother, char gender) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getFather() {
        return father;
    }

    public void setFather(Member father) {
        this.father = father;
    }

    public Member getMother() {
        return mother;
    }

    public void setMother(Member mother) {
        this.mother = mother;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static ArrayList<Member> getSons(ArrayList<Member> list,Member member){
        ArrayList<Member> list1 = new ArrayList<>();
        for(Member m : list){try{
            if(m.getGender()=='M' && m.getFather().name.equals(member.name)){
               list1.add(m);
            }

        }
        catch (Exception e){ }

        }
        return list1;


    }
    public static void getDaughter(ArrayList<Member> list,Member member){

        for(Member m : list){try{
            if(m.getGender()=='F' && m.getFather().name.equals(member.name)){
                System.out.println(m.name);
            }

        }
        catch (Exception e){ }}


    }

    public static ArrayList<Member> getSiblings(ArrayList<Member> list,Member member){
        ArrayList<Member> list1 = new ArrayList<>();
        for(Member m : list){try{
            if( m.getFather().name.equals(member.getFather().name) && m.getMother().name.equals(member.getMother().name) && !member.name.equals(m.name)){
                list1.add(m);
            }

        }
        catch (Exception e){ }

        }
        return list1;


    }

    public static void getChild(ArrayList<Member> list,Member member){
        try{
        for(Member m : list){
            if(m.getFather() != null && member.getName().equals(m.getFather().getName()) || m.getMother()!=null && member.getName().equals(m.getMother().getName())){
                System.out.println(m.name);
            }
        }}
        catch (Exception e){
        }

    }

    public static void getCousins(ArrayList<Member> list,Member member){
        ArrayList<Member> x = member.getSiblings(list,member);
        for(Member i : x){
            i.getChild(list,i);
        }

    }




    }


