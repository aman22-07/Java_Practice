package Fundamentals;

public class Operators {
	/*
	 Operators Name
	 Arithmetic -> + - * % /
	 Assignment -> -=,+=,*=,/=,%=
	 Relational -> ==,!=,<,>,<=,>=
	 Logical    -> && ,||,!
	 Ternary    -> condition ? valu1:value2
	 Bitwise    -> &.|,^.,~
	 Unary      -> +,-,--,++,!
	 Shift      -> <<,>>,>>>
	 InstanceOf -> object instance of ClassName(Instance check operator)
	 */		

	public static void main(String[] args) {
		// Initial values for demonstration
        int a = 10;
        int b = 5;
        boolean x = true;
        boolean y = false;
        String s = "Hello";
        
        int result;
        boolean boolResult;
        
        System.out.println("--- Initial Variable Values ---");
        System.out.println("int a: " + a);
        System.out.println("int b: " + b);
        System.out.println("boolean x: " + x);
        System.out.println("boolean y: " + y);
        System.out.println("String s: " + s);

        // --- 1. ARITHMETIC OPERATORS -------------------------------------------
        System.out.println("--- 1. ARITHMETIC OPERATORS ---");
        System.out.println("a + b = " + (a + b)); // Addition: 15
        System.out.println("a - b = " + (a - b)); // Subtraction: 5
        System.out.println("a * b = " + (a * b)); // Multiplication: 50
        System.out.println("a / b = " + (a / b)); // Division: 2
        System.out.println("a % b = " + (a % b)); // Modulus (Remainder): 0

        System.out.println("-------------------------------------");

        // --- 2. UNARY OPERATORS -----------------------------------------------
        System.out.println("--- 2. UNARY OPERATORS ---");
        int c = 8;
        System.out.println("+c (Unary Plus) = " + (+c)); // 8
        System.out.println("-c (Unary Minus) = " + (-c)); // -8
        System.out.println("c++ (Post-Increment) = " + (c++)); // 8 (c becomes 9)
        System.out.println("++c (Pre-Increment) = " + (++c)); // 10 (c becomes 10)
        System.out.println("!x (Logical NOT) = " + (!x)); // false

        int d = 1; // Binary 0001
        System.out.println("~d (Bitwise Complement) = " + (~d)); // -2 (Binary 1110 - in two's complement)
        
        System.out.println("-------------------------------------");

        // --- 3. RELATIONAL OPERATORS ------------------------------------------
        System.out.println("--- 3. RELATIONAL OPERATORS ---");
        System.out.println("a == b (Equal to) = " + (a == b)); // false
        System.out.println("a != b (Not equal to) = " + (a != b)); // true
        System.out.println("a > b (Greater than) = " + (a > b)); // true
        System.out.println("a <= b (Less than or Equal to) = " + (a <= b)); // false

        System.out.println("-------------------------------------");
        
        // --- 4. LOGICAL OPERATORS ---------------------------------------------
        System.out.println("--- 4. LOGICAL OPERATORS (x=true, y=false) ---");
        System.out.println("x && y (Logical AND) = " + (x && y)); // false
        System.out.println("x || y (Logical OR) = " + (x || y)); // true
        
        System.out.println("-------------------------------------");

        // --- 5. TERNARY OPERATOR ----------------------------------------------
        System.out.println("--- 5. TERNARY OPERATOR ---");
        String status = (a > b) ? "a is greater" : "a is not greater";
        System.out.println("Ternary result: " + status); // a is greater

        System.out.println("-------------------------------------");
        
        // --- 6. ASSIGNMENT OPERATORS ------------------------------------------
        System.out.println("--- 6. ASSIGNMENT OPERATORS ---");
        result = 20;
        result += 5; // result = 20 + 5 = 25
        System.out.println("+= : " + result); 
        
        result -= 10; // result = 25 - 10 = 15
        System.out.println("-= : " + result); 

        result *= 2; // result = 15 * 2 = 30
        System.out.println("*= : " + result); 
        
        result /= 6; // result = 30 / 6 = 5
        System.out.println("/= : " + result); 

        result %= 3; // result = 5 % 3 = 2
        System.out.println("%= : " + result); 

        System.out.println("-------------------------------------");

        // --- 7. BITWISE OPERATORS ---------------------------------------------
        // a=10 (binary 1010), b=5 (binary 0101)
        System.out.println("--- 7. BITWISE OPERATORS (a=10, b=5) ---");
        System.out.println("a & b (AND) = " + (a & b)); // 0 (1010 & 0101 = 0000)
        System.out.println("a | b (OR) = " + (a | b)); // 15 (1010 | 0101 = 1111)
        System.out.println("a ^ b (XOR) = " + (a ^ b)); // 15 (1010 ^ 0101 = 1111)

        System.out.println("-------------------------------------");

        // --- 8. SHIFT OPERATORS -----------------------------------------------
        // a=10 (binary 0000 1010)
        System.out.println("--- 8. SHIFT OPERATORS (a=10) ---");
        System.out.println("a << 1 (Left Shift) = " + (a << 1)); // 20 (10100 - effectively a * 2)
        System.out.println("a >> 1 (Signed Right Shift) = " + (a >> 1)); // 5 (0000 0101 - effectively a / 2)
        
        int neg_a = -10; // Binary (example) 1111 0110
        System.out.println("neg_a >> 1 (Signed Right Shift) = " + (neg_a >> 1)); // -5 (Sign bit preserved)
        System.out.println("neg_a >>> 1 (Unsigned Right Shift) = " + (neg_a >>> 1)); // Large positive number (Fills with 0)

        System.out.println("-------------------------------------");

        // --- 9. INSTANCEOF OPERATOR -------------------------------------------
        System.out.println("--- 9. INSTANCEOF OPERATOR ---");
        boolResult = s instanceof String;
        System.out.println("s instanceof String = " + boolResult); // true

        Object o = Integer.valueOf(100);
        System.out.println("o instanceof Integer = " + (o instanceof Integer)); // true
        System.out.println("o instanceof String = " + (o instanceof String)); // false
    }
		

}

