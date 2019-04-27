package swing_review;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 2
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingReview implements ActionListener, KeyListener{
	//Creates necessary Swing components to use for this program
		JFrame frame;
		JPanel panel;
		JLabel label;
		JButton button1;
		JButton button2;
		
		public void run() {

			// 1. Initialize an object of the JFrame class
			
			// 2. Set your JFrame object to be visible
			
			// 3. Run your program. Do you see your window? It's probably very
			// small.

			// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
			
			// 5. Initialize an object of the JPanel class
			
			// 6. Initialize an object of the JLabel class
			
			// 7. Set the text of the JLabel to a lovely greeting.
			
			// 8. Add the JPanel object to the JFrame
			
			// 9. Add the JLabel object to the JPanel
			
			// 10. Pack your JFrame.
			
			// 11. Run your program again. Do you see your message.
			
			// 12. Use the loadImage method to set the icon of the JLabel object.
			
			// 13. Re-pack the JFrame object.
			
			// 14. Run the program one more time. Do you see the image?
			
			// 15. Initialize an object of the JButton class
			
			// 16. Add the JButton object to the JPanel
			
			// 17. Pack your JFrame
			
			// 18. Add an action listener to the button
			
			// 19. Set the text of your button to "Click Me"
			
			// 20. Pack your JFrame
		
			// 21. Add a second JButton and action listener to the button
			
			
			
			// 22. Set the text of your button to "No, Click Me"
					
			// 23. Uncomment the 2 lines below (Ignore what they do for now)
			//button1.setFocusable(false);
			//button2.setFocusable(false);
			
			// 28. Add a key listener to the frame
			
		}

		public ImageIcon loadImage() {
			try {
				return new ImageIcon(ImageIO.read(new SwingReview().getClass().getResourceAsStream("java.png")));
			} catch (IOException e) {

				return null;
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// 24. Uncomment the 2 lines below
			// JButton buttonClicked = (JButton)e.getSource();
			// System.out.println(buttonClicked.getText());
			
			// 25. Check which button was clicked (HINT: look back at step 24) 
			  // 26. If the "Click Me" button was clicked use JOptionPane pop-up to say "Good Choice"
			 
			  // 27. If the "No, Click Me button was clicked say "A Better Choice"
			 
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// 29. Save the key typed by the user to a variable
			// HINT: Look at the methods that KeyEvent e has
			
			// 30. Use JOptionPane pop-up to tell the user which key they typed 
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
}
