// 设计一个lol的英雄
/*
 * 复习一些基础知识
 * 替换一个工具的使用。
 * 同时也是掌握一个新的技能。同时也是敲代码熟悉
 * */
public class Hero {
	// 姓名
	String name;
	
	// 血量
	float hp;
	
	// 护甲
	float armor;
	
	// 移动速度
	int moveSpeed;
	
	// 获取护甲
	float getArmor(){
		return armor;
	}
	
	// 坑队友
	void keng(){
		System.out.println("开始坑队友!");
	}
	
	// 增加移动速度
	void addSpeed(int speed){
		// 增加移动速度
		moveSpeed = moveSpeed + speed;
	}
	
	// 超神
	void legendary(){
		
	}
	
	void getHp(){
		
	}
	
	void recovery(float blood){
		
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		
	}
}























