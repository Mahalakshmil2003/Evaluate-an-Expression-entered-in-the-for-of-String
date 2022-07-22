import java.util.*;
public class Operation{
	static int num1=0;
	static int num2=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Expression:");
		String exp=sc.next();
		Operation op=new Operation();
		int flag=0;
		char operator='\0';

		for(int i=0;i<exp.length();i++)
		{ 	
			if(Character.isDigit(exp.charAt(i))){
				if(flag==0)
					op.setNum1(exp.charAt(i));
				if(flag==1) 
					op.setNum2(exp.charAt(i));
				
			}
			else{
				flag=1;
				operator=exp.charAt(i);
			}
		}

		System.out.println("num1="+op.num1);
		System.out.println("num2="+op.num2);
		op.compute(operator);
	  
	}
	
	void compute(char op){
		switch(op){
			case '+':addition();
				 break;
			case '-':subtraction();
				 break;
			case '*':multiplication();
				 break;
			case '/':division();
				 break;
			default:System.out.println("Invalid");
		}				
	}

	void setNum1(char ex){
		num1=(num1*10)+(ex-'0');
	}
	void setNum2(char ex){
		num2=(num2*10)+(ex-'0');
	}

	int getNum1(){
		return num1;
	}
	int getNum2(){
		return num2;
	}

	void addition(){
		System.out.println("Operation=Addition");
		int resa=getNum1()+getNum2();
		System.out.println("Result="+resa);
	}

	void subtraction(){	
		System.out.println("Operation=Subtraction");
		int resm=getNum1()-getNum2();
		System.out.println("Result="+ resm);
	}

	void multiplication(){	
		System.out.println("Operation=Multiplication");
		int resm=getNum1()*getNum2();
		System.out.println("Result="+ resm);
	}

	void division(){	
		System.out.println("Operation=Division");
		float resm=(float)getNum1()/getNum2();
		System.out.println("Result="+ resm);
	}
}