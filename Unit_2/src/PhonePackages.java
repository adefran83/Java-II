import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PhonePackages extends JFrame {

	private JPanel contentPane;
	private JRadioButtonMenuItem rdbtnmntm800MinutesPer;
	private JRadioButtonMenuItem rdbtnmntm1500MinutesPer;
	private JRadioButtonMenuItem rdbtnmntm300MinutesPer;
	private JRadioButtonMenuItem rdbtnmntmModel100;
	private JRadioButtonMenuItem rdbtnmntmModel110;
	private JRadioButtonMenuItem rdbtnmntmModel200;
	private JCheckBoxMenuItem chckbxmntmTextMessaging;
	private JCheckBoxMenuItem chckbxmntmVoiceMail;
	private String packageName;
	private String phoneName;
	private JTextArea textAreaPackageName;
	private JTextArea textAreaPhoneName;
	private JLabel lblMonthlyTotal;
	private JPanel panel;
	private JTextArea textAreaTextMessage;
	private JTextArea textAreaVoiceMail;
	private JLabel lblPhoneCost;
	private JPanel panelPhoneCost;
	private JLabel lblPhone_1;
	private JLabel lblPhoneCostAmount;
	private JLabel lblTaxes;
	private JLabel lblTaxesamount;
	private JLabel lblTotal;
	private JLabel lblTotalamount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhonePackages frame = new PhonePackages();
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
	public PhonePackages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 342);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mnFile.add(mntmExit);

		JMenu mnPackages = new JMenu("Packages");
		menuBar.add(mnPackages);

		rdbtnmntm300MinutesPer = new JRadioButtonMenuItem(
				"300 minutes per month: $45.00 per month");
		rdbtnmntm300MinutesPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				packageName = "300 minutes\n$45.00 per month";
				UpdateUI();

			}
		});
		mnPackages.add(rdbtnmntm300MinutesPer);

		rdbtnmntm800MinutesPer = new JRadioButtonMenuItem(
				"800 minutes per month: $65.00 per month");
		rdbtnmntm800MinutesPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				packageName = "800 minutes\n$65.00 per month";
				UpdateUI();
			}
		});
		mnPackages.add(rdbtnmntm800MinutesPer);

		rdbtnmntm1500MinutesPer = new JRadioButtonMenuItem(
				"1500 minutes per month: $99.00 per month");
		rdbtnmntm1500MinutesPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				packageName = "1500 minutes\n$99.00 per month";
				UpdateUI();
			}
		});
		mnPackages.add(rdbtnmntm1500MinutesPer);

		ButtonGroup packageBG = new ButtonGroup();
		packageBG.add(rdbtnmntm300MinutesPer);
		packageBG.add(rdbtnmntm800MinutesPer);
		packageBG.add(rdbtnmntm1500MinutesPer);

		JMenu mnPhones = new JMenu("Phones");
		menuBar.add(mnPhones);

		rdbtnmntmModel100 = new JRadioButtonMenuItem("Model 100: $29.95");
		rdbtnmntmModel100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phoneName = "Model 100\n$29.95";
				UpdateUI();
			}
		});
		mnPhones.add(rdbtnmntmModel100);

		rdbtnmntmModel110 = new JRadioButtonMenuItem("Model 110: $49.95");
		rdbtnmntmModel110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phoneName = "Model 110\n$49.95";
				UpdateUI();
			}
		});
		mnPhones.add(rdbtnmntmModel110);

		rdbtnmntmModel200 = new JRadioButtonMenuItem("Model 200: $99.95");
		rdbtnmntmModel200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phoneName = "Model 200\n$99.95";
				UpdateUI();
			}
		});
		mnPhones.add(rdbtnmntmModel200);

		ButtonGroup phoneBG = new ButtonGroup();
		phoneBG.add(rdbtnmntmModel200);
		phoneBG.add(rdbtnmntmModel100);
		phoneBG.add(rdbtnmntmModel110);

		JMenu mnAddons = new JMenu("Add-Ons");
		menuBar.add(mnAddons);

		chckbxmntmVoiceMail = new JCheckBoxMenuItem(
				"Voice Mail: $5.00 per month");
		chckbxmntmVoiceMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateUI();
			}
		});
		mnAddons.add(chckbxmntmVoiceMail);

		chckbxmntmTextMessaging = new JCheckBoxMenuItem(
				"Text messaging: $10.00 per month");
		chckbxmntmTextMessaging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateUI();
			}
		});
		mnAddons.add(chckbxmntmTextMessaging);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{123, 123, 123, 123, 123, 0};
		gbl_contentPane.rowHeights = new int[]{141, 141, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
				
						JLabel lblPackage = new JLabel("Package");
						lblPackage.setHorizontalAlignment(SwingConstants.CENTER);
						GridBagConstraints gbc_lblPackage = new GridBagConstraints();
						gbc_lblPackage.fill = GridBagConstraints.BOTH;
						gbc_lblPackage.insets = new Insets(0, 0, 5, 5);
						gbc_lblPackage.gridx = 0;
						gbc_lblPackage.gridy = 0;
						contentPane.add(lblPackage, gbc_lblPackage);
		
				JLabel lblPhone = new JLabel("Phone");
				lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_lblPhone = new GridBagConstraints();
				gbc_lblPhone.fill = GridBagConstraints.BOTH;
				gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
				gbc_lblPhone.gridx = 1;
				gbc_lblPhone.gridy = 0;
				contentPane.add(lblPhone, gbc_lblPhone);
		
				JLabel lblAddons = new JLabel("Add-Ons");
				lblAddons.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_lblAddons = new GridBagConstraints();
				gbc_lblAddons.fill = GridBagConstraints.BOTH;
				gbc_lblAddons.insets = new Insets(0, 0, 5, 5);
				gbc_lblAddons.gridx = 2;
				gbc_lblAddons.gridy = 0;
				contentPane.add(lblAddons, gbc_lblAddons);
				
						JLabel lblTotalPerMonth = new JLabel("Total Per Month");
						GridBagConstraints gbc_lblTotalPerMonth = new GridBagConstraints();
						gbc_lblTotalPerMonth.fill = GridBagConstraints.BOTH;
						gbc_lblTotalPerMonth.insets = new Insets(0, 0, 5, 5);
						gbc_lblTotalPerMonth.gridx = 3;
						gbc_lblTotalPerMonth.gridy = 0;
						contentPane.add(lblTotalPerMonth, gbc_lblTotalPerMonth);
		
				lblPhoneCost = new JLabel("Phone Cost");
				lblPhoneCost.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_lblPhoneCost = new GridBagConstraints();
				gbc_lblPhoneCost.fill = GridBagConstraints.BOTH;
				gbc_lblPhoneCost.insets = new Insets(0, 0, 5, 0);
				gbc_lblPhoneCost.gridx = 4;
				gbc_lblPhoneCost.gridy = 0;
				contentPane.add(lblPhoneCost, gbc_lblPhoneCost);
						
								textAreaPackageName = new JTextArea();
								textAreaPackageName.setLineWrap(true);
								textAreaPackageName.setRows(2);
								textAreaPackageName.setWrapStyleWord(true);
								textAreaPackageName.setBackground(UIManager
										.getColor("Label.background"));
								textAreaPackageName.setEditable(false);
								GridBagConstraints gbc_textAreaPackageName = new GridBagConstraints();
								gbc_textAreaPackageName.fill = GridBagConstraints.BOTH;
								gbc_textAreaPackageName.insets = new Insets(0, 0, 0, 5);
								gbc_textAreaPackageName.gridx = 0;
								gbc_textAreaPackageName.gridy = 1;
								contentPane.add(textAreaPackageName, gbc_textAreaPackageName);
				
						textAreaPhoneName = new JTextArea();
						textAreaPhoneName.setRows(2);
						textAreaPhoneName.setEditable(false);
						textAreaPhoneName.setWrapStyleWord(true);
						textAreaPhoneName.setLineWrap(true);
						textAreaPhoneName.setBackground(UIManager.getColor("Label.background"));
						GridBagConstraints gbc_textAreaPhoneName = new GridBagConstraints();
						gbc_textAreaPhoneName.fill = GridBagConstraints.BOTH;
						gbc_textAreaPhoneName.insets = new Insets(0, 0, 0, 5);
						gbc_textAreaPhoneName.gridx = 1;
						gbc_textAreaPhoneName.gridy = 1;
						contentPane.add(textAreaPhoneName, gbc_textAreaPhoneName);
				
						panel = new JPanel();
						GridBagConstraints gbc_panel = new GridBagConstraints();
						gbc_panel.fill = GridBagConstraints.BOTH;
						gbc_panel.insets = new Insets(0, 0, 0, 5);
						gbc_panel.gridx = 2;
						gbc_panel.gridy = 1;
						contentPane.add(panel, gbc_panel);
						GridBagLayout gbl_panel = new GridBagLayout();
						gbl_panel.columnWidths = new int[]{123, 0};
						gbl_panel.rowHeights = new int[]{70, 70, 0};
						gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
						gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
						panel.setLayout(gbl_panel);
						
								textAreaTextMessage = new JTextArea();
								textAreaTextMessage.setBackground(UIManager
										.getColor("Label.background"));
								textAreaTextMessage.setWrapStyleWord(true);
								textAreaTextMessage.setEditable(false);
								textAreaTextMessage.setLineWrap(true);
								GridBagConstraints gbc_textAreaTextMessage = new GridBagConstraints();
								gbc_textAreaTextMessage.fill = GridBagConstraints.BOTH;
								gbc_textAreaTextMessage.insets = new Insets(0, 0, 5, 0);
								gbc_textAreaTextMessage.gridx = 0;
								gbc_textAreaTextMessage.gridy = 0;
								panel.add(textAreaTextMessage, gbc_textAreaTextMessage);
								
										textAreaVoiceMail = new JTextArea();
										textAreaVoiceMail.setWrapStyleWord(true);
										textAreaVoiceMail.setLineWrap(true);
										textAreaVoiceMail.setBackground(UIManager.getColor("Label.background"));
										textAreaVoiceMail.setEditable(false);
										GridBagConstraints gbc_textAreaVoiceMail = new GridBagConstraints();
										gbc_textAreaVoiceMail.fill = GridBagConstraints.BOTH;
										gbc_textAreaVoiceMail.gridx = 0;
										gbc_textAreaVoiceMail.gridy = 1;
										panel.add(textAreaVoiceMail, gbc_textAreaVoiceMail);
		
				lblMonthlyTotal = new JLabel("");
				lblMonthlyTotal.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_lblMonthlyTotal = new GridBagConstraints();
				gbc_lblMonthlyTotal.fill = GridBagConstraints.BOTH;
				gbc_lblMonthlyTotal.insets = new Insets(0, 0, 0, 5);
				gbc_lblMonthlyTotal.gridx = 3;
				gbc_lblMonthlyTotal.gridy = 1;
				contentPane.add(lblMonthlyTotal, gbc_lblMonthlyTotal);
		
				panelPhoneCost = new JPanel();
				GridBagConstraints gbc_panelPhoneCost = new GridBagConstraints();
				gbc_panelPhoneCost.fill = GridBagConstraints.BOTH;
				gbc_panelPhoneCost.gridx = 4;
				gbc_panelPhoneCost.gridy = 1;
				contentPane.add(panelPhoneCost, gbc_panelPhoneCost);
				GridBagLayout gbl_panelPhoneCost = new GridBagLayout();
				gbl_panelPhoneCost.columnWidths = new int[]{61, 61, 0};
				gbl_panelPhoneCost.rowHeights = new int[]{47, 47, 47, 0};
				gbl_panelPhoneCost.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_panelPhoneCost.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
				panelPhoneCost.setLayout(gbl_panelPhoneCost);
				
						lblPhone_1 = new JLabel("Phone: ");
						GridBagConstraints gbc_lblPhone_1 = new GridBagConstraints();
						gbc_lblPhone_1.fill = GridBagConstraints.BOTH;
						gbc_lblPhone_1.insets = new Insets(0, 0, 5, 5);
						gbc_lblPhone_1.gridx = 0;
						gbc_lblPhone_1.gridy = 0;
						panelPhoneCost.add(lblPhone_1, gbc_lblPhone_1);
						
								lblPhoneCostAmount = new JLabel("");
								GridBagConstraints gbc_lblPhoneCostAmount = new GridBagConstraints();
								gbc_lblPhoneCostAmount.fill = GridBagConstraints.BOTH;
								gbc_lblPhoneCostAmount.insets = new Insets(0, 0, 5, 0);
								gbc_lblPhoneCostAmount.gridx = 1;
								gbc_lblPhoneCostAmount.gridy = 0;
								panelPhoneCost.add(lblPhoneCostAmount, gbc_lblPhoneCostAmount);
								
										lblTaxes = new JLabel("Taxes:");
										GridBagConstraints gbc_lblTaxes = new GridBagConstraints();
										gbc_lblTaxes.fill = GridBagConstraints.BOTH;
										gbc_lblTaxes.insets = new Insets(0, 0, 5, 5);
										gbc_lblTaxes.gridx = 0;
										gbc_lblTaxes.gridy = 1;
										panelPhoneCost.add(lblTaxes, gbc_lblTaxes);
										
												lblTaxesamount = new JLabel("");
												GridBagConstraints gbc_lblTaxesamount = new GridBagConstraints();
												gbc_lblTaxesamount.fill = GridBagConstraints.BOTH;
												gbc_lblTaxesamount.insets = new Insets(0, 0, 5, 0);
												gbc_lblTaxesamount.gridx = 1;
												gbc_lblTaxesamount.gridy = 1;
												panelPhoneCost.add(lblTaxesamount, gbc_lblTaxesamount);
												
														lblTotal = new JLabel("Total:");
														GridBagConstraints gbc_lblTotal = new GridBagConstraints();
														gbc_lblTotal.fill = GridBagConstraints.BOTH;
														gbc_lblTotal.insets = new Insets(0, 0, 0, 5);
														gbc_lblTotal.gridx = 0;
														gbc_lblTotal.gridy = 2;
														panelPhoneCost.add(lblTotal, gbc_lblTotal);
														
																lblTotalamount = new JLabel("");
																GridBagConstraints gbc_lblTotalamount = new GridBagConstraints();
																gbc_lblTotalamount.fill = GridBagConstraints.BOTH;
																gbc_lblTotalamount.gridx = 1;
																gbc_lblTotalamount.gridy = 2;
																panelPhoneCost.add(lblTotalamount, gbc_lblTotalamount);
	}

	private void UpdateUI() {
		double monthlyCost = 0.00;
		double planCost = 0.00;
		double phoneCost = 0.00;
		double addOnCost = 0.00;
		double taxes = 0.00;
		double phoneCostFinal = 0.00;
		/*
		 * look to see which radio buttons in each group are selected, then
		 * check to see which/if any add-ons selected
		 */
		if (rdbtnmntm300MinutesPer.isSelected()) {
			planCost = 45.00;
		} else if (rdbtnmntm800MinutesPer.isSelected()) {
			planCost = 65.00;
		} else if (rdbtnmntm1500MinutesPer.isSelected()) {
			planCost = 99.00;
		} else {
			packageName = "Please select a plan.";
		}
		if (rdbtnmntmModel100.isSelected()) {
			phoneCost = 29.95;
		} else if (rdbtnmntmModel110.isSelected()) {
			phoneCost = 49.95;
		} else if (rdbtnmntmModel200.isSelected()) {
			phoneCost = 99.95;
		}
		if (chckbxmntmTextMessaging.isSelected()) {
			textAreaTextMessage.setText("Text messaging\n$10.00 per month");
			addOnCost = 10.00;
		} else {
			textAreaTextMessage.setText("");
		}
		if (chckbxmntmVoiceMail.isSelected()) {
			textAreaVoiceMail.setText("Voice Mail\n$5.00 per month");
			addOnCost += 5.00;
		} else {
			textAreaVoiceMail.setText("");
		}

		/*
		 * figure out total monthly cost.
		 */
		monthlyCost = planCost + addOnCost;
		/*
		 * figure out phone cost and taxes cost
		 */
		taxes = phoneCost * .06;
		phoneCostFinal = phoneCost + taxes;
		/*
		 * set labels to selected items
		 */
		textAreaPackageName.setText(packageName);
		textAreaPhoneName.setText(phoneName);
		/*
		 * format money labels with dollars
		 */
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		lblPhoneCostAmount.setText(formatter.format(phoneCost));
		lblTaxesamount.setText(formatter.format(taxes));
		lblTotalamount.setText(formatter.format(phoneCostFinal));
		lblMonthlyTotal.setText(formatter.format(monthlyCost));
	}

}
