package com.adefran.chapter14;

import javax.swing.JApplet;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class Chapter14UI extends JApplet {
	private JTextField unitPriceTextField;
	private JTextField quantityTextField;
	private JLabel lblItemprice;
	private JLabel lblTotalsalestax;
	private JLabel lblTotalprice;

	/**
	 * Create the applet.
	 */
	public Chapter14UI() {
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		lblUnitPrice.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblUnitPrice);
		
		unitPriceTextField = new JTextField();
		getContentPane().add(unitPriceTextField);
		unitPriceTextField.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblQuantity);
		
		quantityTextField = new JTextField();
		getContentPane().add(quantityTextField);
		quantityTextField.setColumns(10);
		
		JLabel label = new JLabel("");
		getContentPane().add(label);
		
		JButton btnComputeTotal = new JButton("Compute Total");
		btnComputeTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double salesTaxTotal = 0.00;
				double unitCost = 0.00;
				double quantity = 0.00;
				double totalPrice = 0.00;
				double totalUnitCost = 0.00;
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				/*
				 * get values from text fields
				 */
				quantity = Double.parseDouble(quantityTextField.getText());
				unitCost = Double.parseDouble(unitPriceTextField.getText());
				/*
				 * get totals for text fields
				 */
				totalUnitCost = quantity * unitCost;
				salesTaxTotal = totalUnitCost * .07;
				totalPrice = salesTaxTotal + totalUnitCost;
				/*
				 * set result labels
				 */
				lblItemprice.setText(formatter.format(totalUnitCost));
				lblTotalsalestax.setText(formatter.format(salesTaxTotal));
				lblTotalprice.setText(formatter.format(totalPrice));
			}
		});
		getContentPane().add(btnComputeTotal);
		
		JLabel lblPriceOfItems = new JLabel("Price of Items");
		lblPriceOfItems.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblPriceOfItems);
		
		lblItemprice = new JLabel("");
		lblItemprice.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblItemprice);
		
		JLabel lblSalesTax = new JLabel("Sales Tax");
		lblSalesTax.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblSalesTax);
		
		lblTotalsalestax = new JLabel("");
		lblTotalsalestax.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTotalsalestax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTotal);
		
		lblTotalprice = new JLabel("");
		lblTotalprice.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTotalprice);

	}

}
