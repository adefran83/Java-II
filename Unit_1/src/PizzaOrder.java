import java.awt.EventQueue;
import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class PizzaOrder extends JFrame {

	/**
	 * some global variables, needed for UpdateTotals method, which calculates
	 * the finals and the taxes
	 */
	private static final long serialVersionUID = -580160874966373514L;
	private JPanel contentPane;
	private double pizzaTotal = 0.00;
	private JLabel lblPizzaTotal;
	private JLabel lblTaxesTotal;
	private JLabel lblFinalTotal;
	private JPanel PizzaToppings;
	private JRadioButton rdbtnSmallPizza;
	private JRadioButton rdbtnMediumPizza;
	private JRadioButton rdbtnLargePizza;
	private JRadioButton rdbtnXLargePizza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrder frame = new PizzaOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaOrder() {
		setTitle("Perfecto Pizza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		/*
		 * Panel that holds the radio buttons, also create radio button group,
		 * so that only one may be selected at a time.
		 */
		JLayeredPane PizzaSize = new JLayeredPane();
		PizzaSize.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		PizzaSize.setBorder(BorderFactory.createTitledBorder("Size"));
		PizzaSize.setBounds(12, 0, 207, 126);
		contentPane.add(PizzaSize);
		PizzaSize.setLayout(new GridLayout(0, 1, 0, 0));

		rdbtnSmallPizza = new JRadioButton("Small ($8.00)");
		rdbtnSmallPizza.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtnSmallPizza.isSelected()) {
					pizzaTotal = 8.00;
					UpdateTotal();
				}
			}
		});
		PizzaSize.add(rdbtnSmallPizza);

		rdbtnMediumPizza = new JRadioButton("Medium ($10.00)");
		rdbtnMediumPizza.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtnMediumPizza.isSelected()) {
					pizzaTotal = 10.00;
					UpdateTotal();
				}
			}
		});
		PizzaSize.add(rdbtnMediumPizza);

		rdbtnLargePizza = new JRadioButton("Large ($12.00)");
		rdbtnLargePizza.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtnLargePizza.isSelected()) {
					pizzaTotal = 12.00;
					UpdateTotal();
				}
			}
		});
		PizzaSize.add(rdbtnLargePizza);

		rdbtnXLargePizza = new JRadioButton("Extra-Large ($14.00)");
		rdbtnXLargePizza.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtnXLargePizza.isSelected()) {
					pizzaTotal = 14.00;
					UpdateTotal();
				}
			}
		});
		PizzaSize.add(rdbtnXLargePizza);

		/*
		 * Create button group for radio buttons
		 */
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSmallPizza);
		bg.add(rdbtnMediumPizza);
		bg.add(rdbtnLargePizza);
		bg.add(rdbtnXLargePizza);

		/*
		 * Panel that holds all the checkboxes for the panels
		 */
		PizzaToppings = new JPanel();
		PizzaToppings.setBorder(BorderFactory
				.createTitledBorder("Toppings ($1.00 Each)"));
		PizzaToppings.setBounds(220, 0, 206, 126);
		contentPane.add(PizzaToppings);
		PizzaToppings.setLayout(new GridLayout(0, 2, 0, 0));

		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		chckbxMushrooms.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxMushrooms);

		JCheckBox chckbxPepperoni = new JCheckBox("Pepperoni");
		chckbxPepperoni.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxPepperoni);

		JCheckBox chckbxExtraCheese = new JCheckBox("Extra Cheese");
		chckbxExtraCheese.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxExtraCheese);

		JCheckBox chckbxMeat = new JCheckBox("Meat");
		chckbxMeat.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxMeat);

		JCheckBox chckbxHam = new JCheckBox("Ham");
		chckbxHam.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxHam);

		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		chckbxSausage.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxSausage);

		JCheckBox chckbxPineapple = new JCheckBox("Pineapple");
		chckbxPineapple.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxPineapple);

		JCheckBox chckbxOlives = new JCheckBox("Olives");
		chckbxOlives.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxOlives);

		JCheckBox chckbxHotPeppers = new JCheckBox("Hot Peppers");
		chckbxHotPeppers.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxHotPeppers);

		JCheckBox chckbxOnions = new JCheckBox("Onions");
		chckbxOnions.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxOnions);

		JCheckBox chckbxGreenPeppers = new JCheckBox("Green Peppers");
		chckbxGreenPeppers.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxGreenPeppers);

		JCheckBox chckbxAnchovies = new JCheckBox("Anchovies");
		chckbxAnchovies.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				UpdateTotal();
			}
		});
		PizzaToppings.add(chckbxAnchovies);

		/*
		 * Panel that holds the specials for Perfecto Pizza
		 */
		JPanel InfoPanel = new JPanel();
		InfoPanel.setBorder(BorderFactory
				.createTitledBorder("Perfecto Specials"));
		InfoPanel.setBounds(12, 123, 207, 126);
		contentPane.add(InfoPanel);
		InfoPanel.setLayout(null);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture.setBounds(5, 17, 320, 117);
		lblPicture.setIcon(new ImageIcon(PizzaOrder.class.getResource("/pizza-hut.jpg")));
		InfoPanel.add(lblPicture);

		JLabel lblBuyMedium = new JLabel(
				"Buy 2 Medium 3 topping pizza's for only $20!");
		lblBuyMedium.setBounds(5, 146, 320, 31);
		InfoPanel.add(lblBuyMedium);

		/*
		 * Summary Panel which holds the totals for the pizza, taxes and then
		 * combines them for a final total
		 */
		JPanel SummaryPanel = new JPanel();
		SummaryPanel
				.setBorder(BorderFactory.createTitledBorder("Cost Summary"));
		SummaryPanel.setBounds(220, 123, 206, 126);
		contentPane.add(SummaryPanel);
		SummaryPanel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("Cost of Pizza:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		SummaryPanel.add(lblNewLabel);

		lblPizzaTotal = new JLabel("$0.00");
		SummaryPanel.add(lblPizzaTotal);

		JLabel lblTaxes = new JLabel("Taxes:");
		lblTaxes.setHorizontalAlignment(SwingConstants.RIGHT);
		SummaryPanel.add(lblTaxes);

		lblTaxesTotal = new JLabel("$0.00");
		SummaryPanel.add(lblTaxesTotal);

		JLabel lblFinal = new JLabel("Total:");
		lblFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		SummaryPanel.add(lblFinal);

		lblFinalTotal = new JLabel("$0.00");
		SummaryPanel.add(lblFinalTotal);

	}

	private void UpdateTotal() {
		double taxes, finalTotal;
		taxes = 0.00;
		finalTotal = 0.00;
		pizzaTotal = 0.00;
		/*
		 * check to see which radio button is checked
		 */
		if (rdbtnSmallPizza.isSelected()) {
			pizzaTotal = 8;
		} else if (rdbtnMediumPizza.isSelected()) {
			pizzaTotal = 10;
		} else if (rdbtnLargePizza.isSelected()) {
			pizzaTotal = 12;
		} else if (rdbtnXLargePizza.isSelected()) {
			pizzaTotal = 14;
		} else {
			/*
			 * Lets make the selection for the user if they don't pick a pizza
			 * size first, after all you can't pick toppings without a pizza
			 * size. Will also make the selection on mousing over the
			 * checkboxes.
			 */
			rdbtnMediumPizza.setSelected(true);
			pizzaTotal = 10;
		}
		/*
		 * for each loop to get get all that are checked, much easier and more
		 * efficient than keeping track of each check box
		 */
		for (int i = 0; i < PizzaToppings.getComponentCount(); i++) {
			JCheckBox checkBox = (JCheckBox) PizzaToppings.getComponent(i);
			if (checkBox.isSelected()) {
				pizzaTotal += 1;
			}
		}
		/*
		 * get totals
		 */
		taxes = pizzaTotal * .06;
		finalTotal = taxes + pizzaTotal;
		/*
		 * update labels for correct amounts, with a formatter to convert the
		 * value to a $$ or whatever your local currency is.
		 */
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		lblPizzaTotal.setText(formatter.format(pizzaTotal));
		lblTaxesTotal.setText(formatter.format(taxes));
		lblFinalTotal.setText(formatter.format(finalTotal));

	}
}
