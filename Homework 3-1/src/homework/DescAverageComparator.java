﻿package homework;

import java.util.Comparator;

public class DescAverageComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getAverage() - o1.getAverage();
	}

}
