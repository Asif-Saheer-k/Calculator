
package multicalculator;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

public class multiCalculator implements ActionListener{
	
//Global declaration;
	JFrame frame;
	JLabel maindisp, subdisp, titlelabel;
	//----------------------------------------------------------------------------------------//
	JButton onebutton, twobutton, threebutton, fourbutton, fivebutton, sixbutton, sevenbutton,
	eightbutton, ninebutton, zerobutton, addbutton, subtractbutton, multiplybutton, divbutton,
	equalbutton;
	//---------------------------------------------------------------------------------------//
	Boolean operator=false;
	String value, symbol, newvalue, lastoperator, nextinput, inputvalue, ACTION_KEY = "The Action";
	int choice = 0;
	float oldvaluef, newvaluef, result;
	//---------------------------------------------------------------------------------------//
	
	//---------------------------------------------------------------------------------------//
    Stack<String> stack_1 = new Stack<>();
    Stack<String> stack_2 = new Stack<>();
    Stack<String> stack_3 = new Stack<>();
    Stack<String> stack_4 = new Stack<>();    
    Stack<String> memstack = new Stack<>();
	//---------------------------------------------------------------------------------------//

	public multiCalculator() {
		
	//Base frame creation	
		frame=new JFrame();
		frame.setBounds(500, 100, 505, 550);
		frame.setLayout(null);
		frame.setUndecorated(true);
		frame.setOpacity(0.90f);
		
	//Main display creation
		maindisp=new JLabel(" ", SwingConstants.RIGHT);
		maindisp.setBounds(0, 110, 505, 70);
		maindisp.setFont(new FontUIResource("segoe UI", Font.BOLD, 40));
		maindisp.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		frame.add(maindisp);
		
	//Sub display creation
        subdisp=new JLabel(" ", SwingConstants.RIGHT);
        subdisp.setBounds(300, 40, 200, 70);
        subdisp.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        frame.add(subdisp);
        
    //Title label
        titlelabel = new JLabel("Calculator");
        titlelabel.setBounds(15, 2, 100, 30);
        titlelabel.setFont(new FontUIResource("segoe UI", Font.ROMAN_BASELINE, 13));
        titlelabel.setForeground(Color.BLACK);
        titlelabel.setOpaque(false);
        frame.add(titlelabel);
        
   
    
    //Button creation
		onebutton=new JButton("1");
		twobutton=new JButton("2");
		threebutton=new JButton("3");
		fourbutton=new JButton("4");
		fivebutton=new JButton("5");
		sixbutton=new JButton("6");
		sevenbutton=new JButton("7");
		eightbutton=new JButton("8");
		ninebutton=new JButton("9");
		zerobutton=new JButton("0");
		addbutton=new JButton("\u002B");
		subtractbutton=new JButton("\u2212");
		multiplybutton=new JButton("\u00D7");
		divbutton=new JButton("\u00F7");
		equalbutton=new JButton("\u003D");
		
        divbutton.setBounds(380, 275, 120, 50);
        sevenbutton.setBounds(5, 330, 120, 50);
        eightbutton.setBounds(130, 330, 120, 50);
        ninebutton.setBounds(255, 330, 120, 50);
        multiplybutton.setBounds(380, 330, 120, 50);
        fourbutton.setBounds(5, 385, 120, 50);
        fivebutton.setBounds(130, 385, 120, 50);
        sixbutton.setBounds(255, 385, 120, 50);
        subtractbutton.setBounds(380, 385, 120, 50);
        onebutton.setBounds(5, 440, 120, 50);
        twobutton.setBounds(130, 440, 120, 50);
        threebutton.setBounds(255, 440, 120, 50);
        addbutton.setBounds(380, 440, 120, 50);
        zerobutton.setBounds(130, 495, 120, 50);
        equalbutton.setBounds(380, 495, 120, 50);
       

       
        divbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        sevenbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        eightbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        ninebutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        multiplybutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        fourbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        fivebutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        sixbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        subtractbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        onebutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        twobutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        threebutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        addbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        zerobutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
        equalbutton.setFont(new FontUIResource("segoe UI", Font.PLAIN, 20));
       
        
        divbutton.setBackground(new Color(219, 217, 217));
        sevenbutton.setBackground(new Color(255, 255, 255));
        eightbutton.setBackground(new Color(255, 255, 255));
        ninebutton.setBackground(new Color(255, 255, 255));
        multiplybutton.setBackground(new Color(219, 217, 217));
        fourbutton.setBackground(new Color(255, 255, 255));
        fivebutton.setBackground(new Color(255, 255, 255));
        sixbutton.setBackground(new Color(255, 255, 255));
        subtractbutton.setBackground(new Color(219, 217, 217));
        onebutton.setBackground(new Color(255, 255, 255));
        twobutton.setBackground(new Color(255, 255, 255));
        threebutton.setBackground(new Color(255, 255, 255));
        addbutton.setBackground(new Color(219, 217, 217));
        zerobutton.setBackground(new Color(255, 255, 255));
        equalbutton.setBackground(new Color(219, 217, 217));
       
        divbutton.setBorderPainted(false);
        sevenbutton.setBorderPainted(false); 
        eightbutton.setBorderPainted(false);
        ninebutton.setBorderPainted(false);
        multiplybutton.setBorderPainted(false);
        fourbutton.setBorderPainted(false);
        fivebutton.setBorderPainted(false);
        sixbutton.setBorderPainted(false);
        subtractbutton.setBorderPainted(false);
        onebutton.setBorderPainted(false);
        twobutton.setBorderPainted(false);
        threebutton.setBorderPainted(false);
        addbutton.setBorderPainted(false);
        zerobutton.setBorderPainted(false);
        equalbutton.setBorderPainted(false);
       
        
      
        frame.add(divbutton);
        frame.add(sevenbutton);
        frame.add(eightbutton);
        frame.add(ninebutton);
        frame.add(multiplybutton);
        frame.add(fourbutton);
        frame.add(fivebutton);
        frame.add(sixbutton);
        frame.add(subtractbutton);
        frame.add(onebutton);
        frame.add(twobutton);
        frame.add(threebutton);
        frame.add(addbutton);
        frame.add(zerobutton);
        frame.add(equalbutton);
      
        divbutton.addActionListener(this);
        sevenbutton.addActionListener(this);
        eightbutton.addActionListener(this);
        ninebutton.addActionListener(this);
        multiplybutton.addActionListener(this);
        fourbutton.addActionListener(this);
        fivebutton.addActionListener(this);
        sixbutton.addActionListener(this);
        subtractbutton.addActionListener(this);
        onebutton.addActionListener(this);
        twobutton.addActionListener(this);
        threebutton.addActionListener(this);
        addbutton.addActionListener(this);
        zerobutton.addActionListener(this);
        equalbutton.addActionListener(this);
       

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	
     
	}
	public static void main(String[] args) {
		multiCalculator Calculator=new multiCalculator();
	}
	
	Action action = new AbstractAction() {
		
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton source = (JButton) e.getSource();
			if (source != null) {
		        maindisp.setBorder(null);
			}
			
			if (source.equals(ninebutton)) {
                keyPressed("9");
            }
			else if (source.equals(eightbutton)) {
                keyPressed("8");
            }
            else if (source.equals(sevenbutton)) {
                keyPressed("7");
            }
            else if (source.equals(sixbutton)) {
                keyPressed("6");
            }
            else if (source.equals(fivebutton)) {
                keyPressed("5");
            }
            else if (source.equals(fourbutton)) {
                keyPressed("4");
            }
            else if (source.equals(threebutton)) {
                keyPressed("3");
            }
            else if (source.equals(twobutton)) {
                keyPressed("2");
            }
            else if (source.equals(onebutton)) {
                keyPressed("1");
            }
            else if (source.equals(zerobutton)) {
                keyPressed("0");
            }
            else if (source.equals(addbutton)) {
                keyPressed("+");
            }
            else if (source.equals(subtractbutton)) {
                keyPressed("-");
            }
            else if (source.equals(multiplybutton)) {
                keyPressed("x");
            }
            else if (source.equals(divbutton)) {
                keyPressed("/");
            }
           
		}
	};
	
	public void keyPressed(String num) {
	
		if (num == "9") {
            if (operator) {
                maindisp.setText("9");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"9");
            }
        }
		else if (num == "8") {
            if (operator) {
                maindisp.setText("8");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"8");
            }
        }
		else if (num == "7") {
            if (operator) {
            	maindisp.setText("7");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"7");
            }        
        }
		else if (num == "6") {
            if (operator) {
            	maindisp.setText("6");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"6");
            }        
        }
		else if (num == "6") {
            if (operator) {
            	maindisp.setText("6");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"6");
            }        
        }
		else if (num == "5") {
            if (operator) {
            	maindisp.setText("5");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"5");
            }        
        }
		else if (num == "4") {
            if (operator) {
            	maindisp.setText("4");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"4");
            }        
        }
		else if (num == "3") {
            if (operator) {
            	maindisp.setText("3");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"3");
            }        
        }
		else if (num == "2") {
            if (operator) {
            	maindisp.setText("2");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"2");
            }        
        }
		else if (num == "1") {
            if (operator) {
            	maindisp.setText("1");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"1");
            }        
        }
		else if (num == "0") {
            if (operator) {
            	maindisp.setText("0");
                operator = false;
            }
            else{
            	maindisp.setText(maindisp.getText()+"0");
            }        
        }
		else if (num == "+") {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"+");
            value = maindisp.getText();
            symbol = "+";
            getValues(value, symbol);
        }
		else if (num == "-") {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"-");
            value = maindisp.getText();
            symbol = "-";
            getValues(value, symbol);
        }
		else if (num == "x") {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"x");
            value = maindisp.getText();
            symbol = "x";
            getValues(value, symbol);
        }
		else if (num == "/") {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"\u00F7");
            value = maindisp.getText();
            symbol = "/";
            getValues(value, symbol);
        }
		
		
		
	}
	
	//Accept input from buttons
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() != null) {
	        maindisp.setBorder(null);
		}

		if (e.getSource()==onebutton) {
            if (operator) {
                maindisp.setText("1");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"1");
            }
        }
		else if (e.getSource()==twobutton) {
            if (operator) {
                maindisp.setText("2");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"2");
            }
        }
		else if (e.getSource()==threebutton) {
            if (operator) {
                maindisp.setText("3");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"3");
            }
        }
		else if (e.getSource()==fourbutton) {
            if (operator) {
                maindisp.setText("4");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"4");
            }
        }
		else if (e.getSource()==fivebutton) {
            if (operator) {
                maindisp.setText("5");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"5");
            }
        }
		else if (e.getSource()==sixbutton) {
            if (operator) {
                maindisp.setText("6");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"6");
            }
        }
		else if (e.getSource()==sevenbutton) {
            if (operator) {
                maindisp.setText("7");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"7");
            }
        }
		else if (e.getSource()==eightbutton) {
            if (operator) {
                maindisp.setText("8");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"8");
            }
        }
		else if (e.getSource()==ninebutton) {
            if (operator) {
                maindisp.setText("9");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"9");
            }
        }
		else if (e.getSource()==zerobutton) {
            if (operator) {
                maindisp.setText("0");
                operator = false;
            }
            else{
                maindisp.setText(maindisp.getText()+"0");
            }
        }
		
		else if (e.getSource()==addbutton) {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"+");
            value = maindisp.getText();
            maindisp.setText(" ");
            symbol = "+";
            getValues(value, symbol);
        }
		else if (e.getSource()==subtractbutton) {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"-");
            value = maindisp.getText();
            maindisp.setText(" ");
            symbol = "-";
            getValues(value, symbol);
        }
		else if (e.getSource()==multiplybutton) {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"x");
            value = maindisp.getText();
            maindisp.setText(" ");
            symbol = "x";
            getValues(value, symbol);
        }
		else if (e.getSource()==divbutton) {
            operator = true;
            subdisp.setText(subdisp.getText()+maindisp.getText()+"\u00F7");
            value = maindisp.getText();
            maindisp.setText(" ");
            symbol = "/";
            getValues(value, symbol);
        }
		
        else if (e.getSource() == equalbutton) {
            
            value = maindisp.getText();
            symbol = "=";
            getValues(value, symbol);

            while (!stack_1.empty()) {
                stack_2.push(stack_1.pop());
                lastoperator = "=";
            }

            while (!stack_2.empty()){
                nextinput = stack_2.pop();
                inputvalue = stack_2.pop();
                buttonHandler(inputvalue, nextinput);
            }
        }
        
       
	}

	//store initial values to stack 1
	private void getValues(String value, String symbol) {
        stack_1.push(value);
        stack_1.push(symbol);
	}
	
	//method to find result
    private void buttonHandler(String buttonValue, String nexInput) {  
        
    	int choice = 0;
        if (lastoperator.equals("=")) {
            maindisp.setText("");
            subdisp.setText(" ");
        }
        
        if (buttonValue.length()>0) {
            try {
                if (!stack_3.empty()) {
                    if (stack_3.peek().equals("x")) {
                    	stack_3.pop();
                        float num1 = Float.parseFloat(stack_3.pop());
                        float num2 = Float.parseFloat(nexInput);
                        float result = num1 * num2;
                        nexInput = Float.toString(result);
                    }
                    else if (stack_3.peek().equals("/")) {
                    	stack_3.pop();
                        float num1 = Float.parseFloat(stack_3.pop());
                        float num2 = Float.parseFloat(nexInput);
                        if (num2 != 0) {
                        	float result = num1 / num2;
                            nexInput = Float.toString(result); 
						}
                        else {
                        	 choice = 1; 
                        }
                    }
                }
            }
            catch (Exception ex) {
                //System.out.println("something wrong in part 1");
            	maindisp.setText("Something went wrong");
            }
            if (!buttonValue.equals("=")) {
                stack_3.push(nexInput);
                stack_3.push(buttonValue);
            }
            else {
                if(!stack_3.empty()) {
                    try {
                        stack_3.push(nexInput);
                        while (!stack_3.empty()) {
                            stack_4.push(stack_3.pop());
                        }
                        while (!stack_4.empty()) {
                            String firstNumber = stack_4.pop();
                            if (stack_4.peek().equals("+")) {
                                stack_4.pop();
                                float num1 = Float.parseFloat(firstNumber);
                                float num2 = Float.parseFloat(stack_4.pop());
                                float result = num1 + num2;
                                nexInput = Float.toString(result);
                            }
                            else if (stack_4.peek().equals("-")) {
                                stack_4.pop();
                                float num1 = Float.parseFloat(firstNumber);
                                float num2 = Float.parseFloat(stack_4.pop());
                                float result = num1 - num2;
                                nexInput = Float.toString(result);
                            }
                            if (!stack_4.empty()) {
                                stack_4.push(nexInput);
                            }
                            else {
                                maindisp.setText(nexInput);
                            }
                        }
                    }
                    catch (Exception ex) {
                    //System.out.println("something wrong in part 2");
                    maindisp.setText("Something went wrong");
                }
            }
                else if(choice == 1) {
                	maindisp.setText("Cannot divided by zero");
                }
                else {
                    maindisp.setText(nexInput);
                }
        }
        }
    }
}