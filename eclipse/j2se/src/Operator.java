/*
 * ������
 *  *-+ ++ --
 */
public class Operator {
	public static void main(String[] args) {
		// ���ߵ�ʹ�� ���� �ô����
		System.out.println("Operator");
		int i = 10;
		int j = 5;
		int a = i + j;
		int b = i * j;
		int c = i * j;
		int d = i / j;
		
//		// �������е�Ԫ�ĳ��ȳ���int
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
	
	// ��һ���� ������ͨ 
	public static void switchFunc(){
		int day = 5;
		switch(day){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			default:
				System.out.println("�����Ҳ��֪��");
				break;
		}
	}
	
	// ʹ��break ������ǰѭ��
	// f6 �������� step over ����������߸����һЩ���ơ�����ע�⿪�����ߵİ汾������������ĸ��¡������л��в���Ԥ֪�ĺ����
	// ������Խ���ͷǵ��Խ��滹�кܴ�Ĳ�ͬ���� ��ЩС��������½���һ����Ŀ����������������û��ʲô���� ������������Ѹ�ٺܶࡣ
	// ��Ȼ java ����ܶ����ݺ�C#���ơ�����Ҳ����Ҫ��һ�顣��Ȼ���㲻֪�������ʹ�á���
	// ע�������õ�ÿһ�д��붼���Լ���һ��demo ��Ҫ���ñ���õġ����������Ҫ�����ݡ�Ҳ���Լ��Ĺ������顣
	// ÿһ��ѧϰ������ ����Ҫдһƪ�ܽᡣ ��
	public static void breakFunc(){
		
		// ��ӡ����
		for(int i = 0; i < 10; i++){
			for(int j = 1; j < 10; j++){
				System.out.println(i + ":" + j);
				if(0 == j % 2)
					break;
			}
		}
	}
	
	// ѧϰ������ص�֪ʶ��
	public static void arrayFunc(){
		// ����һ������
		int[] a;
		
		// ����һ��������5�����飬����ʹ��a ָ�������
		
		a = new int[5];
		int[] b = new int[5];
		
		a[0] = 1; // �±�0�� ����������ĵ�һ����
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
		
		// C# foreachд��
//		foreach(var item in ass){
//			
//		}
		
	}
}
































