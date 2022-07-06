/* 개발단계
 * 1단계 : 설정 파일 로딩하면서 spring container 생성
 * 2단계 : 필요한 객체를 코드에서 획득
 * 3단계 : 획득한 객체 활용
 *  
 */
package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step02.model.domain.Car;
import step02.model.domain.People;



public class Running2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata2.xml");
		
//		System.out.println("***step01***: 모든 멤버 변수값 기본 초기화");
//		People p1 = context.getBean("p1", People.class);
//		System.out.println(p1);
//		
//		System.out.println("***step02***: 모든 멤버 변수값 기본 초기화");
//		People p1 = context.getBean("p2", People.class);
//		System.out.println(p2);
		
		System.out.println("***step03 : People : Car = 1 : 1***");
		People p3 = context.getBean("p3", People.class);
		System.out.println(p3);
		
		System.out.println("***step03 : People : Car = 1 : 1***");
		People p33 = context.getBean("p3", People.class);
		System.out.println(p33);


	}

}
