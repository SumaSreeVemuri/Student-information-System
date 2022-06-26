import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Student {
	Student(){
		JFrame f = new JFrame("Student Information System");//Creating a new frame using JFrame
		//Creating JLabels and naming them
		JLabel l1 = new JLabel("Enter the Enrollment Number to know details of the Student");
		JLabel l2 = new JLabel("NIT RAIPUR - CSE BRANCH");
		l2.setForeground(Color.red);//Setting the color of label l2 to red.
		//Setting the bounds of JLabels
		l1.setBounds(60,60,340,30);
		l2.setBounds(150,10,240,60);
		JTextField n = new JTextField();//Creating a JTextField
		n.setBounds(130,90,60,20);//Setting the bounds of JTextField
		JButton b = new JButton("Enter");//Creating a JButton
		b.setBounds(230,90,70,20);//Setting the bounds of JButton
		
		JLabel p1 = new JLabel("Name");
		JLabel p2 = new JLabel("Year of Study");
		JLabel p3 = new JLabel("Date of Birth");
		JLabel p4 = new JLabel("Gender");
		JLabel p5 = new JLabel("Contact Number");
		JLabel p6 = new JLabel("Email-ID");
		JLabel p7 = new JLabel("Home City");
		p1.setBounds(40,130,100,20);
		p2.setBounds(40,160,100,20);
		p3.setBounds(40,190,100,20);
		p4.setBounds(40,220,100,20);
		p5.setBounds(40,250,100,20);
		p6.setBounds(40,280,100,20);
		p7.setBounds(40,310,100,20);

		
		JTextField q1 = new JTextField();
		JTextField q2 = new JTextField();
		JTextField q3 = new JTextField(); 
		ButtonGroup bg = new ButtonGroup();//Creating a JButtonGroup
		//Creating JRadioButtons
		JRadioButton r1 = new JRadioButton("Male"); 
		JRadioButton r2 = new JRadioButton("Female");
		bg.add(r1);bg.add(r2);// Adding JRadioButtons to ButtonGroup
		JTextField q5 = new JTextField();
		JTextField q6 = new JTextField();
		JTextField q7 = new JTextField();
		
		q1.setBounds(190,130,160,20);
		q2.setBounds(190,160,160,20);
		q3.setBounds(190,190,160,20);
		r1.setBounds(190,220,60,20);
		r2.setBounds(260,220,160,20);
		q5.setBounds(190,250,160,20);
		q6.setBounds(190,280,160,20);
		q7.setBounds(190,310,160,20);

		//Adding the created objects to frame
		f.add(l1);f.add(l2);
		f.add(n);
		f.add(b);
		f.add(p1);f.add(p2);f.add(p3);f.add(p4);f.add(p5);f.add(p6);f.add(p7);
		f.add(q1);f.add(q2);f.add(q3);f.add(q5);f.add(q6);f.add(q7);
		f.add(r1);f.add(r2);
		f.setSize(500,430);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Adding ActionListener to the Enter Button
        b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = n.getText();
				//Setting the text in switch cases
				switch(Integer.parseInt(s)){
				case 2001:
					q1.setText("V.Suma Sree");
					q2.setText("2nd year");
					q3.setText("23-08-2002");
					r1.setSelected(true);
					q5.setText("9514587544");
					q6.setText("sumavemuri23@gmail.com");
					q7.setText("Hyderabad-(Telangana)");
					break;
				case 1901:
					q1.setText("A.Vikram Aditya");
					q2.setText("3rd year");
					q3.setText("15-11-2001");
					r1.setSelected(true);
					q5.setText("7778454968");
					q6.setText("vikram11@gmail.com");
					q7.setText("Nagpur-(Maharastra)");
					break;
				case 1801:
					q1.setText("R.Nivetha");
					q2.setText("4th year");
					q3.setText("19-03-2000");
					r2.setSelected(true);
					q5.setText("9440987854");
					q6.setText("nivi33@gmail.com");
					q7.setText("Jaipur-(Rajasthan)");
					break;
				case 2002:
					q1.setText("M.Varun Soni");
					q2.setText("2nd year");
					q3.setText("14-02-2002");
					r1.setSelected(true);
					q5.setText("9170094021");
					q6.setText("varunsonim@gmail.com");
					q7.setText("Raipur-(Chattisgarh)");
					break;
				case 1902:
					q1.setText("K.Shreya Agarwal");
					q2.setText("3rd year");
					q3.setText("23-12-2000");
					r2.setSelected(true);
					q5.setText("8521455478");
					q6.setText("shreyaagarwal23@gmail.com");
					q7.setText("Lucknow-(Uttar Pradesh)");
					break;
				case 1903:
					q1.setText("L.Jaya Kumar");
					q2.setText("3rd year");
					q3.setText("08-03-2001");
					r1.setSelected(true);
					q5.setText("9175487664");
					q6.setText("jayakumar38@gmail.com");
					q7.setText("Kadapa-(Andhra Pradesh)");
					break;
				case 2003:
					q1.setText("D.Jyothika");
					q2.setText("2nd year");
					q3.setText("31-05-2002");
					r2.setSelected(true);
					q5.setText("6354998755");
					q6.setText("jyothikadhan4@gmail.com");
					q7.setText("Hassan-(Karnataka)");
					break;
				case 2101:
					q1.setText("N.Surya Kumar");
					q2.setText("1st year");
					q3.setText("15-09-2003");
					r1.setSelected(true);
					q5.setText("8854625484");
					q6.setText("suryakumarnag@gmail.com");
					q7.setText("Coimbatore-(Tamil Nadu)");
					break;
				case 2102:
					q1.setText("T.Manjunathan");
					q2.setText("1st year");
					q3.setText("13-02-2004");
					r1.setSelected(true);
					q5.setText("7784755482");
					q6.setText("manjunathan13@gmail.com");
					q7.setText("Nellore-(Andhra Pradesh)");
					break;
				case 2103:
					q1.setText("B.Lokesh Rahul");
					q2.setText("1st year");
					q3.setText("16-10-2004");
					r1.setSelected(true);
					q5.setText("9447574831");
					q6.setText("lokeshrahul22@gmail.com");
					q7.setText("Palakkad-(Kerala)");
					break;
				case 1802:
					q1.setText("H.Suraj Mishra");
					q2.setText("4th year");
					q3.setText("29-05-2000");
					r1.setSelected(true);
					q5.setText("8851264898");
					q6.setText("surajhiran92@gmail.com");
					q7.setText("Gwalior-(Madhya Pradesh)");
					break;
				case 1803:
					q1.setText("S.Priyanka Chowdary");
					q2.setText("4th year");
					q3.setText("21-06-2000");
					r2.setSelected(true);
					q5.setText("9515494908");
					q6.setText("priyankasharma@gmail.com");
					q7.setText("Guntur-(Andhra Pradesh)");
					break;
				default:
					q1.setText("");
					q2.setText("");
					q3.setText("");
					r1.setSelected(false);
					r2.setSelected(false);
					q5.setText("");
					q6.setText("");
					q7.setText("");
					JOptionPane.showMessageDialog(f,"Please Enter a Valid Enrollment Number");
				}		
			}
        });	
	}

	public static void main(String[] args) {
		new Student();
	}

}
