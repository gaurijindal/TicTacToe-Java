import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frame;
	private JTextField Ocount;
	private JTextField Xcount;
	private int Ocount1 = 0;
	private int Xcount1 = 0;
	private String startGame = "O";
	private int b1 = 10;
	private int b2 = 10;
	private int b3 = 10;
	private int b4 = 10;
	private int b5 = 10;
	private int b6 = 10;
	private int b7 = 10;
	private int b8 = 10;
	private int b9 = 10;
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	private void GameWinner() {
		// For Player O
		if (b1 == 1 && b2 == 1 && b3 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b4 == 1 && b5 == 1 && b6 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b7 == 1 && b8 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b1 == 1 && b4 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b2 == 1 && b5 == 1 && b8 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b3 == 1 && b6 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b1 == 1 && b5 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		} else if (b3 == 1 && b5 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Ocount1++;
			Ocount.setText(String.valueOf(Ocount1));
		}

		// For Player X
		else if (b1 == 0 && b2 == 0 && b3 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b4 == 0 && b5 == 0 && b6 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b7 == 0 && b8 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b1 == 0 && b4 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b2 == 0 && b5 == 0 && b8 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b3 == 0 && b6 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b1 == 0 && b5 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (b3 == 0 && b5 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			Xcount1++;
			Xcount.setText(String.valueOf(Xcount1));
		} else if (i == 9) {
			JOptionPane.showMessageDialog(frame, "No one Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private void choosePlayer() {
		if (startGame.equalsIgnoreCase("O")) {
			startGame = "X";
		} else {
			startGame = "O";
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn1.setForeground(Color.BLUE);
					b1 = 1;
					i++;
				} else {
					btn1.setForeground(Color.RED);
					b1 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_1.add(btn1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn2.setForeground(Color.BLUE);
					b2 = 1;
					i++;
				} else {
					btn2.setForeground(Color.RED);
					b2 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_2.add(btn2, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn3.setForeground(Color.BLUE);
					b3 = 1;
					i++;
				} else {
					btn3.setForeground(Color.RED);
					b3 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_3.add(btn3, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_11 = new JButton("Player O");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_4.add(btnNewButton_11, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		Ocount = new JTextField();
		Ocount.setHorizontalAlignment(SwingConstants.CENTER);
		Ocount.setFont(new Font("Tahoma", Font.BOLD, 27));
		Ocount.setText("0");
		panel_5.add(Ocount, BorderLayout.CENTER);
		Ocount.setColumns(10);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn4.setForeground(Color.BLUE);
					b4 = 1;
					i++;
				} else {
					btn4.setForeground(Color.RED);
					b4 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_10.add(btn4, BorderLayout.CENTER);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn5.setForeground(Color.BLUE);
					b5 = 1;
					i++;
				} else {
					btn5.setForeground(Color.RED);
					b5 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_8.add(btn5, BorderLayout.CENTER);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn6.setForeground(Color.BLUE);
					b6 = 1;
					i++;
				} else {
					btn6.setForeground(Color.RED);
					b6 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_11.add(btn6, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_13.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_12 = new JButton("Player X");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_9.add(btnNewButton_12, BorderLayout.CENTER);

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		Xcount = new JTextField();
		Xcount.setText("0");
		Xcount.setFont(new Font("Tahoma", Font.BOLD, 27));
		Xcount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(Xcount, BorderLayout.CENTER);
		Xcount.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn7.setForeground(Color.BLUE);
					b7 = 1;
					i++;
				} else {
					btn7.setForeground(Color.RED);
					b7 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_6.add(btn7, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn8.setForeground(Color.BLUE);
					b8 = 1;
					i++;
				} else {
					btn8.setForeground(Color.RED);
					b8 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_7.add(btn8, BorderLayout.CENTER);

		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));

		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("O")) {
					btn9.setForeground(Color.BLUE);
					b9 = 1;
					i++;
				} else {
					btn9.setForeground(Color.RED);
					b9 = 0;
					i++;
				}
				choosePlayer();
				GameWinner();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 34));
		panel_16.add(btn9, BorderLayout.CENTER);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1 = 10;
				b2 = 10;
				b3 = 10;
				b4 = 10;
				b5 = 10;
				b6 = 10;
				b7 = 10;
				b8 = 10;
				b9 = 10;
				i = 0;
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_12.add(btnReset, BorderLayout.CENTER);

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm, You want to Exit.", "Tic Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
