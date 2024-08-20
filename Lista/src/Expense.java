package br.pucpr.poo.lista;

public class Expense {

    private String description;
    private float value;

    public Expense(String description, float value) {

        this.description = description;
        this.value = value;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public float getValue() {

        return value;
    }

    public void setValue(float value) {

        this.value = value;
    }

    public String getText() {

        return description + ": " + value;
    }
}
