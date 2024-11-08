package com.equations;

public class Coeffcient {

    public int value;
    public Variables variables;

    public Coeffcient(int value, Variables variables) {
        this.value = value;
        this.variables = variables;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "Coeffcient{" +
                "value=" + value +
                ", variablesArrayList=" + variables +
                '}';
    }
}
