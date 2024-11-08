package com.equations;

import java.util.ArrayList;

public class EquationForm {

    public Coeffcient coeffcient;

    public EquationForm(Coeffcient coeffcient) {
        this.coeffcient = coeffcient;
    }

    @Override
    public String toString() {
        return "EquationForm{" +
                "coeffcient=" + coeffcient +
                '}';
    }
}
