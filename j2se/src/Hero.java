// ���һ��lol��Ӣ��
/*
 * ��ϰһЩ����֪ʶ
 * �滻һ�����ߵ�ʹ�á�
 * ͬʱҲ������һ���µļ��ܡ�ͬʱҲ���ô�����Ϥ
 * */
public class Hero {
	// ����
	String name;
	
	// Ѫ��
	float hp;
	
	// ����
	float armor;
	
	// �ƶ��ٶ�
	int moveSpeed;
	
	// ��ȡ����
	float getArmor(){
		return armor;
	}
	
	// �Ӷ���
	void keng(){
		System.out.println("��ʼ�Ӷ���!");
	}
	
	// �����ƶ��ٶ�
	void addSpeed(int speed){
		// �����ƶ��ٶ�
		moveSpeed = moveSpeed + speed;
	}
	
	// ����
	void legendary(){
		
	}
	
	void getHp(){
		
	}
	
	void recovery(float blood){
		
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		
	}
}























