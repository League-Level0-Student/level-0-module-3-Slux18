
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	Robot rob = new Robot();
	for(int i=0;i<5;i++){
	    //2. Make the robot draw a shape (this will take more than one line of code)
	rob.penDown();
	rob.setSpeed(20);
	rob.turn(90);
	rob.move(200);
	rob.turn(-90);
	rob.move(200);
	rob.turn(-90);
	rob.move(200);
	rob.turn(-90);	
	rob.move(20);
	rob.penUp();
	rob.move(50);
	rob.penDown();
		//3. Set the pen width to 10
rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
String userResponse = JOptionPane.showInputDialog("what color pen color do you want thr robot to draw width");
		//5. Use an if/else statement to set the pen color that the user requested
if(userResponse.equals("black")){
	rob.setPenColor(Color.black);
}
else if(userResponse.equals("red")){
	rob.setPenColor(Color.red);
}
        //6. If the user doesn't enter anything, choose a random color
else if(userResponse.equals("blue")){
	rob.setPenColor(Color.blue);
}
else if(userResponse.equals("purple")){
	rob.setPenColor(Color.magenta);
}
else if(userResponse.equals("pink")){
	rob.setPenColor(Color.pink);
}
else if(userResponse.equals("green")){
	rob.setPenColor(Color.green);
}
else{
	rob.setRandomPenColor();
}
	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}

	private static void setPenWidth(int i) {
		// TODO Auto-generated method stub
		
	}
}
