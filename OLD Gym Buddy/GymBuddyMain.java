/*Created by Bartosz Kosakowski
* 15/02/17
* Gym Buddy is an app that will allow you to keep
* track of various stats related to your work out.
* Keep track of weekly routines, number of sets/reps,
* the weights you can lift, and time your rests.
*/
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GymBuddyMain extends JFrame{
	public static void main (String [] args){
	//creates a gui to put stuff onto
	MyGUI gui = new MyGUI();
	//creates the red close button on the window
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setSize(500, 500);
	gui.setVisible(true);
	//puts a title at the top of the window
	gui.setTitle("Gym Buddy");
	}

}//end of GymBuddyMain class

class MyExercise{
	private String exerciseName;
	private String category;
	private double weights;
	private int reps, sets;

	//constructor for MyExercise
	public MyExercise(String exerciseName, String category, double weights, int reps, int sets){
		this.exerciseName = exerciseName;
		this.category = category;
		this.weights = weights;
		this.reps = reps;
		this.sets = sets;
	}//end of MyExercise constructor

	//start of getters
	public String getName(){
		return this.exerciseName;
	}
	public String getCategory(){
		return this.category;
	}
	public double getWeights(){
		return this.weights;
	}
	public int getReps(){
		return this.reps;
	}
	public int getSets(){
		return this.sets;
	}
	//end of getters

	//start of setters
	public void setName(String name){//####################### this perhaps should be immutable?
		this.exerciseName = name;
	}
	public void setCategory(String category){//####################### this perhaps should be immutable?
		this.category = category;
	}
	public void setWeights(double weights){
		this.weights = weights;
	}
	public void setReps(int reps){
		this.reps = reps;
	}
	public void setSets(int sets){
		this.sets = sets;
	}
	//end of setters

}//end of MyExercise class

class MyGUI extends JFrame{
	//puts text onto the window
	private JLabel label;
	private JButton button;
	//makes a textbox to type into
	private JTextField textField;

	public MyGUI(){
		//this is basically a "default layout", which is lame
		setLayout(new FlowLayout());
		
		label = new JLabel("");
		add(label);

		//the parameters can be a string that will be the default text in the textbox,
		//or we can put in a number to limit the number of chars that will fit in our box
		textField = new JTextField(15);
		add(textField);

		button = new JButton("This is a button");
		add(button);

		event e = new event();
		button.addActionListener(e);
	}//end of MyGUI constructor

	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//put whatever you want to happen here
			label.setText("success");
		}
	}//end of event class
}//end of MyGUI class

