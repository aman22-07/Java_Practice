package Fundamentals;

public class Literals {
	public static void main(String[] args) {
		
		/*
		 	Literal
		1. Integer Literal
   		2. Floating-Point Literal
   		3. Character Literal
   		4. String Literal
   		5. Boolean Literal
   		6. Null Literal 
		   */
		int x=12;
		System.out.println(x);
		
		int dec=122;
		System.out.println("decimal :"+dec);
		
		int bin=0b10011;
		System.out.println("binary :"+bin);
		
		int oct=010011;
		System.out.println("Octal :"+oct);
		
		int hex=0x10011;
		System.out.println("hexagonal :"+hex);
		
		float f1=3.14f;
		System.out.println("float :"+f1);
		
		double d1=2.141234;
		System.out.println("double :"+d1);
		
		String str="name";
		String str2="Aman";
		//new line
		System.out.println("Line1" +'\n' +"Line2");
		// tabspace
		System.out.println(str +'\t' +str2);
		
		// Using Escape Sequences for special characters
        char newlineChar = '\n'; // Represents a newline
        char tabChar = '\t'; // Represents a tab
        char singleQuoteChar = '\''; // Represents a single quote
        char backslashChar = '\\'; // Represents a backslash

        // Output using escape sequences
        System.out.println("Escape Sequence (newline):" + newlineChar + "This is after newline.");
        System.out.println("Escape Sequence (tab):" + tabChar + "This is after tab.");
        System.out.println("Escape Sequence (single quote): " + singleQuoteChar + "This is single quote.");
        System.out.println("Escape Sequence (backslash): " + backslashChar + "This is backslash.");
		
		//null
        String nan=null;
       // int x=null; cannot use with primitive
        
        boolean name=false;
        if(name) {
        	System.out.print("name");
        }
        else {
        	System.out.print("This is True");
        }
		
	}
}
