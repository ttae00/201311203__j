import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Yoot extends JFrame implements ActionListener {
	JButton btnStart;
	JButton btnCancel;
	JTextField result;
	JTextField result1;
	JLabel sumResult;
	JLabel sumResult1;
	JLabel label;
	JLabel label1;
	String Yresult;
	int num;
	String fname;
	int Sumfname=0;
	
	String lname;
	int Sumlname=0;
	
	int state;
	JPanel panel;
	
	
	public Yoot(String name1,String name2,int state){
		num=-1;
			
			this.state=state;
			panel = new JPanel(new GridLayout(3,3)); 
			getContentPane().add(panel);
			if(state==1){
				this.fname=name1;
				this.lname=name2;
				label=new JLabel(fname+"의 차례");
				label1=new JLabel(lname);
			
			}if(state==2){
				this.fname=name2;
				this.lname=name1;
				label1=new JLabel(fname+"의 차례");
				label=new JLabel(lname);
				}
			
			
			result= new JTextField(10);
			sumResult=new JLabel("");
			
			
			result1= new JTextField(10);
			sumResult1=new JLabel("");
			
			
			btnStart = new JButton("play");
			btnCancel = new JButton("cancle");
			btnStart.addActionListener(this);
		    btnCancel.addActionListener(this);
			
			
			
			
			
			
			
			
			panel.add(label);
			panel.add(result);
			panel.add(sumResult);
			panel.add(label1);
			panel.add(result1);
			panel.add(sumResult1);
		    panel.add(btnStart);
		    panel.add(btnCancel);
		    
		    pack();
		    
		    
		    panel.setSize(300,300);
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		
		
	}
	
	public void playY(){
		num = (int) (Math.random() * 4);
		
	}
	public String getYname(int n){
		String[] Yoot={"도","개","걸","윳","모"};
		
		return Yoot[n];
	}

	
	public void play(){

		playY();
		Yresult = getYname(num);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnStart)){
			play();
			
			if(state==1){
			Sumfname+=(num+1);
			result.setText(Yresult);
			label.setText(fname);
			label1.setText(lname+"의 차례");
			result1.setText("");
			sumResult.setText("총"+Sumfname+"칸 이동");
		
			state=2;
			}else if(state==2){
				Sumlname+=(num+1);
				result1.setText(Yresult);
				label.setText(fname+"의 차례");
				label1.setText(lname);
				result.setText("");
				state=1;

				sumResult1.setText("총"+Sumlname+"칸 이동");
			}
			
		
			
		}
			
			
		
	}
	
	
}
