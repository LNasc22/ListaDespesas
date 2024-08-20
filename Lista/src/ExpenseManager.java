package br.pucpr.poo.lista;

import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {

        expenses.add(expense);
    }

    public float getTotal() {

        float total = 0.0f;
        for (Expense expense: expenses) {

            total += expense.getValue();
        }

        return total;
    }

    public Object[] getExpenses() {

        ArrayList<String> list = new ArrayList<>();
        for (Expense expense: expenses) {

            list.add(expense.getText());
        }

        return list.toArray();
    }
}
