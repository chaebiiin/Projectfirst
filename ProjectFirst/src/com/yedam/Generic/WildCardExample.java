package com.yedam.Generic;

import java.util.Arrays;

//제네릭 <T> <- 타입이 정해지지 않은 메소드
// <?> < ? extends class>, <? super class>
//Person -> Worker person을 상속받는 Worker 클래스 .
//		 ->Student -> HighStudent 위의 두 클래스를 상속받는, Student클래스.
//Course<T>
public class WildCardExample {
	public static void registerCourse(Course<?> course) { // Course<person>, Course<Worker>, Course<Student>,
															// Course<HighStudent>
		System.out.println(course.getName() + " 수강생 " + Arrays.toString(course.getStudents())); // course.getName() -> 과정명 리턴 
																								// course.getStudents()	 -> 배열의 번지의 toString을받아옴. 리턴?												

	}

	public static void registerStudent(Course<? extends Student> course) { // course클래스에서 Student클래스를 받거나, 그 하위 클래스만 받는
																			// Course클래스를 만들겠다는 뜻.
		System.out.println(course.getName() + " 수강생 " + Arrays.toString(course.getStudents())); // course.getName() -> 과정명 리턴 //
																								// course.getStudents() -> 배열의 번지의 toString을 받아옴. 리턴?																					
	}

	public static void registerWorker(Course<? super Worker> course) { // Worker가 제일 최 하위 클래스이고, 그 상위 클래스(Person, Worker)만 받아오겠다.
		System.out.println(course.getName() + " 수강생 " + Arrays.toString(course.getStudents())); // course.getName() ->과정명 리턴 
																								// course.getStudents() -> 배열의 번지의 toString을 받아옴. 리턴?																						
	}

	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5); // 상속받는 클래스는 다 받아 올 수 있음.
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<Worker>("직장인 과정 ", 5); // worker클래스의 하위 클래스가 올 수 있다.
		courseWorker.add(new Worker("직장인"));

		Course<Student> courseStudent = new Course<Student>("학생 과정 ", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생")); // student의 하위클래스를 불러 올 수 있다.

		Course<HighStudent> courseHighStudent = new Course<HighStudent>("고등학생과정", 5);
		courseHighStudent.add(new HighStudent("고등학생"));

		// Course<?>의 모든타입을 받아서 매게값으로 쓰겠다는 뜻
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHighStudent);

		// Course<? extends class> 상위클래스와 그에 속한 하위클래스만 받겠다는것.
		registerStudent(courseStudent);
		registerStudent(courseHighStudent);

		// Course< ? super class> 상위 클래스만 받겠다는거?
		registerWorker(coursePerson);
		registerWorker(courseWorker);
	}
}
