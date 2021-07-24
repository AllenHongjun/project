public class HelloWorld{
//    public static void main(String[] args){
//        System.out.println("hello world");
//    }
    int i = 1;
    int j = i; // 其他属性可以访问i; 字段属性
	
    // 参数的作用域
    public void method1(int i){
    	System.out.println(i);
    	
    	// final 修饰过的变量只有一次赋值的机会
    	final int j = 6;
    	
    	final int k;
    	k = 16;
    	
    	// final 还可以修改 方法 类型。以后再学习
    }
    
    public void method2(){
    	// 局部变量 的声明和使用
    	int i = 5;
    	System.out.println(i);
    	
    }
	
    public static void main(String[] args) {
		System.out.println("hellow world");
		System.out.println("hello world");
		System.out.println("syso alt + /");
		;
		;
		;
		
		// 一个分号也是一个表达式 一行注释也是表达式
		;
		int year = 1949;
		
		// 整型 
		byte b = 1;
		short s = 200;
		int i = 300;
		long l = 400;
		
		// 字符型
		char c = '中';
//		char c2 = '中国';
//		char c3 = 'ab';
		
		// 浮点型
		double d = 123.45;
//		float f = 54.321;
		float f2 = 54.321f;
		
		boolean b1 = true;
		boolean b2 = false;
		
		// String 类型
		String str = "Hello Java";
		
		// 学习还是需要循序渐进。 从基础开始学起。
		// 但是可以学习的更加的快速。。比别人能够理解的更加深刻
		
		
		// 字符和字符串字面量
		
		char tab = '\t'; // 制表符
		char carriageReturn = '\r'; // 回车
		char newLine = '\n'; // 换行
		char doubleQuote = '\"'; // 双引号
		
		// 习惯那种一步一步 有步骤执行的学习方式
		
		// 习惯哪些有一些了解的基础之后的拓展学习
		
		char singleQuote = '\"'; // 单引号
		char backslash = '\\'; // 反斜杠
		
		// goal javaweb 12k 500强 
		// 整数字面量
		long val = 26L; // 以L结尾的表示long型
		int decval = 26; // 默认就是int型
		int hexVal = 0x1a; // 16进制
		int binVal = 0b11010; // 2进制
	}
}















