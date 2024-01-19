
public class SuperHero  extends Hero{ //heroのクラスを拡張
	
// 継承

	
	boolean flying;       //飛んでいるか飛んでいないか 

	
	public SuperHero() {
		super(); //この書き方で親のコンストラクタを呼び出せる
		System.out.println("SuperHeroのコンストラクタが動作");
		
	}
	
	
	
	public void attack(Matango m) {
		
		super.attack(m);
		if(this.flying) {
			super.attack(m);   //子クラス側で定義することができる。スーパークラスのメソッドを呼び出す
		}
	}	
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
		
	}
	
	public void run() {  //親クラスにもあるが、子クラスで再定義（上書き）する場合  オーバーライドという
 	 System.out.println(this.name + "は撤退した！");
    }   
	
	
}