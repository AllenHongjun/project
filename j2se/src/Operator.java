/*
 * 操作符
 *  *-+ ++ --
 */
public class Operator {
	public static void main(String[] args) {
		// 工具的使用 快速 敲代码块
		System.out.println("Operator");
		int i = 10;
		int j = 5;
		int a = i + j;
		int b = i * j;
		int c = i * j;
		int d = i / j;
		
//		// 任意运行单元的长度超过int
//		int a = 5;
//		long b = 6;
//		int c = (int) (a + b);
//		long d = a + b;
		
//		flow();
		
		breakFunc();
	}
	
	public static void flow(){
		int i = 2;
		if(i == 1){
			System.out.println(1);
		}else if(i == 2){
			System.out.println(2);
		}else if( i == 3){
			System.out.println(3);
		}else if(i == 4){
			System.out.println(4);
		}
		
	}
	
	// 举一反三 触类旁通 
	public static void switchFunc(){
		int day = 5;
		switch(day){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			default:
				System.out.println("这个我也不知道");
				break;
		}
	}
	
	// 使用break 结束当前循环
	// f6 但不调试 step over 这个开发工具搞得有一些复制。而且注意开发工具的版本。。不能随意的更新。可能有会有不可预知的后果。
	// 这个调试界面和非调试界面还有很大的不同。。 有些小问题就重新建立一个项目。重新这个。。这个没有什么关联 。开发起来会迅速很多。
	// 虽然 java 里面很多内容和C#类似。但是也是需要过一遍。不然。你不知道如何来使用。。
	// 注意这里敲的每一行代码都是自己的一个demo 是要永久保存好的。。这个是重要的数据。也是自己的工作经验。
	// 每一次学习的主题 都需要写一篇总结。 。
	public static void breakFunc(){
		
		// 打印单数
		for(int i = 0; i < 10; i++){
			for(int j = 1; j < 10; j++){
				System.out.println(i + ":" + j);
				if(0 == j % 2)
					break;
			}
		}
	}
	
	// 学习数组相关的知识点
	public static void arrayFunc(){
		// 声明一个引用
		int[] a;
		
		// 创建一个长度是5的数组，并且使用a 指向该数组
		
		a = new int[5];
		int[] b = new int[5];
		
		a[0] = 1; // 下标0， 代表数组里的第一个数
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		System.out.println(a.length);
		
		a[4] = 100;
		a[5] = 101;
		
		int values [] = new int[]{12,44,23,53,3};
		for(int i = 0; i < values.length; i++){
			int each = values[i];
			System.out.println(each);
		}
		
		for(int each : values){
			System.out.println(each);
		}
		
		// C# foreach写法
//		foreach(var item in ass){
//			
//		}
		
	}
}
































