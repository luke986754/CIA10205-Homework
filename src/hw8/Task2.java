package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
	
	public static void main(String args[]) {
	/*
	請寫一隻程式，能印出不重複的Train物件
 	請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
 	承上，不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件
   (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
	*/
		//請寫一隻程式，能印出不重複的Train物件
		Set<Train> set1 = new HashSet<Train>();
		set1.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set1.add(new Train(118, "自強", "高雄", "台北", 500));
		set1.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set1.add(new Train(122, "自強", "台中", "花蓮", 600));
		set1.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set1.add(new Train(1254, "區間", "屏東", "基隆", 700));


		System.out.println("======foreach======");
		for(Train tr : set1) {
			System.out.println(tr);
		}
	
	
	System.out.println();
	
		//班次編號由大到小印出
		List<Train> list = new ArrayList<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		Collections.sort(list);;
		System.out.println("======for迴圈======");
		
		for(int i = 0; i <list.size(); i++) {
			Object obj = list.get(i);
			System.out.print(obj);
			System.out.println();
		}
	
	System.out.println();
		
	
		//班次編號由大排到小印出，不重複印出Train物件	
		Set<Train> set2 = new TreeSet<Train>();
		set2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set2.add(new Train(118, "自強", "高雄", "台北", 500));
		set2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set2.add(new Train(122, "自強", "台中", "花蓮", 600));
		set2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		
		
		System.out.println("======迭代器======");
		Iterator<Train> it = set2.iterator();
		while(it.hasNext()) {
			Train tr = it.next();
			System.out.print(tr);
			System.out.println();
		}
		
	}

}
