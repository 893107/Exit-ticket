/* 개발단계
 * 1단계 : 설정 파일 로딩하면서 spring container 생성
 * 2단계 : 필요한 객체를 코드에서 획득
 * 3단계 : 획득한 객체 활용
 *  
 */
package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setp01.model.domain.People;

public class Running {

	public static void main(String[] args) {
		//설정 파일을 기반으로 spring container 기능의 객체 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		

//		<!-- step01 -->
//		<bean id="p1" class="model.domain.People"/>
		
		System.out.println("***step02***");
//		<!-- step02 -->
//		<bean id="p2" class="model.domain.People" scope="prototype"/>
		People p2 = context.getBean("p2", People.class); //people() 생성자 호출
		People p22 = context.getBean("p2", People.class); //people() 생성자 호출
		
//		싱글톤 빈은 조회할 때마다 같은 빈을 반환하는 것을 보장해준다.
//		프로토타입 빈은 조회할 때마다 새로운 인스턴스를 생성 ,반환해준다 
		
//		<!-- step03 -->
		System.out.println("***step03***");
		People p3 = context.getBean("p3", People.class); //public People(String name, int age) 생성자 호출 
		System.out.println(p3.getName());
		
		
//		<!-- step04 -->
		System.out.println("***step04***");
		People p4 = context.getBean("p4", People.class); //public People(String name, int age) 생성자 호출 
		System.out.println(p4.getName());
		
		
//		<!-- step05 -->
		System.out.println("***step05***");
		People p5 = context.getBean("p5", People.class); //public People(String name, int age) 생성자 호출 
		System.out.println(p5.getName());
		
//		<!-- step06 -->
		System.out.println("***step06***");
		People p6 = context.getBean("p6", People.class); 
		System.out.println(p6.getName());
	}

}
