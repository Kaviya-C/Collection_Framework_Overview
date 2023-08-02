package com.kaviya.collection.framework;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollNo, marks;
	String name;

	public Student(int studRoll, int stMarks, String studName) {
		this.rollNo = studRoll;
		this.marks = stMarks;
		this.name = studName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		return name.length() > s.name.length() ? 1 : -1;
	}
}

public class ComparableDemo {
	public static void main(String... args) {
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(41, 78, "Kavi"));
		stud.add(new Student(21, 88, "Getha"));
		stud.add(new Student(31, 58, "Seha"));
		stud.add(new Student(71, 98, "Ma"));

		Collections.sort(stud, (i, j) -> i.marks > j.marks ? 1 : -1);

		for (Student eachStudent : stud) {
			System.out.println(eachStudent);
		}

	}
}
