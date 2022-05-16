package weapon;

public class GameCharacter {

	private Weapon weapon;//접근점
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;//교환가능
	}
	
	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {//델리게이트-->위임한다!
		weapon.attack();
		}
	}
}
