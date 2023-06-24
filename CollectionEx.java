package week14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		int idx = 0;

		list.add("Java");
		list.add("OOP");
		list.add("Love");
		list.add("fff");

		int size = list.size();
		System.out.println("num of list items = " + size);

		String item = list.get(2);
		System.out.println("2econd item of the list = " + item);
		System.out.println();

		for (String s : list)
			System.out.println(idx++ + " : " + s);
		System.out.println();

		// remove
		list.remove(1);
		idx = 0;

		for (String s : list)
			System.out.println(idx++ + " : " + s);
		System.out.println();

		list.remove(1);
		idx = 0;

		for (String s : list)
			System.out.println(idx++ + " : " + s);
		System.out.println();

		System.out.println("-----------------");
		
		List<String> list2 = new LinkedList<String>();
		list2.add("aaaa");
		list2.add("bbb");
		list2.add("ccccc");
		
		for(String s : list2)
			System.out.println(s);
		System.out.println();
		
		list2.remove(1);
		
		for(String s : list2)
			System.out.println(s);
		System.out.println();
		
		System.out.println("-----map-----");

		// map은 키가 중복이 되면 안된다.
		Map<String, String> map = new HashMap<>();
		map.put("name", "Honggildong");
		map.put("gender", "male");
		map.put("id", "Babo");
		map.put("passwd", "1234");
		map.put("id", "mungchunge");
		
		map.remove("id");
		map.put("id", "mungchunge");
		map.put("id", "Babo");

		for (String k : map.keySet())
			System.out.println(k + " = " + map.get(k));

		System.out.println("---Iterator---");
		Set<String> keyset = map.keySet();
		Iterator<String> keyIter = keyset.iterator();	//저장된 객체를 하나씩 가져오는 반복자 리턴, 키셋에 저장된 객첼=들을 가져옴
		while (keyIter.hasNext()) {
			String k = keyIter.next();
			System.out.println(k);
		}

	}

}
