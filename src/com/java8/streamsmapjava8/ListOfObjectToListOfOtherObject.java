package com.java8.streamsmapjava8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.model.Staff;
import com.java8.model.StaffPublic;

public class ListOfObjectToListOfOtherObject {

	public static void main(String[] args) {

		List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );
		
		List<StaffPublic> collect = staff.stream().map(temp-> {
			StaffPublic staffPublic= new StaffPublic();
			staffPublic.setName(temp.getName());
			staffPublic.setAge(temp.getAge());
			if("mkyong".equals(temp.getName())){
				staffPublic.setExtra("this field is for mkyong only");
			}
			return staffPublic;
		}).collect(Collectors.toList());
		;
		System.out.println(collect);
	}

}
