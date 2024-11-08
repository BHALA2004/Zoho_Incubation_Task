package com.equations;

import java.util.ArrayList;

public class EquationMain {
    public static void main(String[] args) {
        Variables variables = new Variables("x",2);
        Variables variables1 = new Variables("Y",2);
        ArrayList<Variables> variablesArrayList= new ArrayList<>();
        variablesArrayList.add(variables);
        variablesArrayList.add(variables1);
        Coeffcient coeffcient = new Coeffcient(2,variablesArrayList.get(0));
        Coeffcient coeffcient1 = new Coeffcient(4,variablesArrayList.get(1));
        ArrayList<Coeffcient> coeffcientArrayList = new ArrayList<>();
        coeffcientArrayList.add(coeffcient);
        coeffcientArrayList.add(coeffcient1);
        for (int i = 0;i<coeffcientArrayList.size();i++){
            System.out.print(coeffcientArrayList.get(i).value+coeffcientArrayList.get(i).variables.var+"^"+coeffcientArrayList.get(i).variables.degree+" ");

        }
        System.out.println();
        Variables variables2 = new Variables("x",2);
        Variables variables3 = new Variables("Y",2);
        ArrayList<Variables> variablesArrayList1= new ArrayList<>();
        variablesArrayList1.add(variables2);
        variablesArrayList1.add(variables3);
        Coeffcient coeffcient2 = new Coeffcient(2,variablesArrayList.get(0));
        Coeffcient coeffcient3 = new Coeffcient(4,variablesArrayList.get(1));
        ArrayList<Coeffcient> coeffcientArrayList1 = new ArrayList<>();
        coeffcientArrayList1.add(coeffcient2);
        coeffcientArrayList1.add(coeffcient3);
        for (int i = 0;i<coeffcientArrayList.size();i++){
            System.out.print(coeffcientArrayList.get(i).value+coeffcientArrayList.get(i).variables.var+"^"+coeffcientArrayList.get(i).variables.degree+" ");

        }
        System.out.println();
        ArrayList<Coeffcient> ansCoeff = new ArrayList<>();
        for(int i = 0;i<coeffcientArrayList.size();i++){
            Coeffcient c  = coeffcientArrayList.get(i);
            for(int j = 0;j<coeffcientArrayList1.size();j++){
                Coeffcient c1 = coeffcientArrayList1.get(j);
                int m = 1;
                int reval = c.value*c1.value;
                String g = c.variables.var;
                String g1 = c1.variables.var;
                int gval = c.variables.degree;
                int g1val = c1.variables.degree;
                if(g.equals(g1)){
                    m = gval*g1val;
                }
                Variables v = new Variables(g,m);
                ansCoeff.add(new Coeffcient(reval,v));


            }
        } for (int i = 0;i<ansCoeff.size();i++){
            System.out.print(ansCoeff.get(i).value+ansCoeff.get(i).variables.var+"^"+ansCoeff.get(i).variables.degree+" ");

        }



    }
}
