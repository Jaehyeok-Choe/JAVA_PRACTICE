package ch07;

/*[자바의 정석 - 기초편] ch7-31,32 추상 클래스, 추상 메서드
 * 
 * - 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
 * - 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가
 * - 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능
 * */

abstract class Player{	// 추상 클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos);	// 추상 메서드(미완성 메서드)
	abstract void stop();	// 추상 메서드(선언부만 있고 구현부{}가 없는 메서드)
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos + "위치부터 play합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
}

public class Ch7_31_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player ap = new AudioPlayer();	// 다형성
		ap.play(100);
		ap.stop();
	}

}
