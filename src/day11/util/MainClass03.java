package day11.util;

import java.util.Vector;

/*
 * [[ Vector Class ]] 
 * 	선형배열 객체
 * 	ArrayList와 동일
 * 	Thread safe - synchronized
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		// 추가
		vec.add("피카츄");
		vec.add("피카츄");
		vec.add("피카츄");

		System.out.println("저장된 데이터 개수 : " + vec.size());
		
		// 데이터 가져오기. stack에서 pop을 하면 빠져나가는거지만, vec는 값이 그대로 존재
		System.out.println("1번 인덱스 데이터 가져오기 : " + vec.get(1));
		
		
		
	}
}
