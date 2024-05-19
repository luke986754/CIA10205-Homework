package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {


//	請建立一個Collection物件並將以下資料加入：
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();

		// 加入資料進collection物件
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator<Object> it = list.iterator();
		System.out.println("========Iterator=========");
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();

		System.out.println("========傳統for=========");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.print(obj + ", ");
		}
		System.out.println();

		System.out.println("========foreach========");

		for (Object obj : list) {
			System.out.print(obj + ", ");
		}

		System.out.println();
		
		// • 移除不是java.lang.Number相關的物件
		// • 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		Iterator<Object> it2 = list.iterator();
		while (it2.hasNext()) {
			if (!(it2.next() instanceof Number)) {
				it2.remove();
			}
		}
		for(Object obj2 : list) {
			System.out.print(obj2 + ", ");
		}

	}

}
