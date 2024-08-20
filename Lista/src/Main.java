package br.pucpr.poo.lista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JPanel pnlMain;
    private JList lstExpense;
    private JTextField txtDesc;
    private JTextField txtValue;
    private JButton btnAdd;
    private JLabel lblTotal;

    private ExpenseManager manager = new ExpenseManager();

    public Main() {
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Expense expense = new Expense(txtDesc.getText(), Float.parseFloat(txtValue.getText()));
                txtDesc.setText("");
                txtValue.setText("");

                manager.addExpense(expense);
                lblTotal.setText("Total: " + manager.getTotal());

                lstExpense.setListData(manager.getExpenses());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
