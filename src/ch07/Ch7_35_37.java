package ch07;

/*[자바의 정석 - 기초편] ch7-35~37 인터페이스의 선언, 상속, 구현
 * 
 * - 추상 메서드의 집합
 * - 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 PUBLIC)
 * 
 * - 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
 * - 다중 상속이 가능.(추상메서드는 충돌해도 문제 없음)
 * 
 * - 인터페이스에 정의된 추상 메서드를 완성하는것이 인터페이스의 구현이다. 
 * */

interface Fightable{
	void move(int x, int y);
	void attack(Unit u);
}

class Fighter implements Fightable{
	public void move(int x, int y) {/* 내용생략 */}
	public void attack(Unit u) {/* 내용생략 */}
}

public class Ch7_35_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* 인터페이스란? 
 * - 추상 메서드의 집합
 * 
 * 인터페이스의 구현이란?
 * - 인터페이스의 추상메서드 몸통{}만들기(미완성 설계도 완성하기)
 * 
 * 추상클래스와 인터페이스의 공통점은?
 * - 추상메서드를 가지고 있다. (미완성 설계도)
 * 
 * 추상클래스와 인터페이스의 차이점은?
 * 인터페이스는 iv를 가질 수 없다. 
 * */
