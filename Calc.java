public class Calc{
	public static void main(String[] args){
			// hello
		int index= args.length;
		if(index < 3 || index > 3){
			System.out.println("please enter 3 arguments");

			System.out.println("dev branch abdelhay");
			System.out.println("test branch abdelhay");


		}else{
			int operand1= Integer.parseInt(args[0]);
			int operand2= Integer.parseInt(args[2]);
			
			if(args[1].equals("+")){
				System.out.print(args[0] + " + " +args[2] + " = ");
				System.out.print((operand1+operand2));
			
			}else if(args[1].equals("-")){
				System.out.print(args[0] + " - " +args[2] + " = ");
				System.out.print((operand1-operand2));
				
			}else if(args[1].equals("*")){
				System.out.print(args[0] + " * " +args[2] + " = ");
				System.out.print((operand1*operand2));
			
			}else if(args[1].equals("/")){
				if(operand2 >1 && operand1>operand2){
				System.out.print(args[0] + " / " +args[2] + " = ");
				System.out.print((operand1/operand2));
				}else{
					System.out.println("make operand2 > operand1");
				}
				
			}else{
				System.out.println("wrong operation");
			}
		}
	}
}