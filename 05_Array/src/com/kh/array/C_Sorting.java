package com.kh.array;

public class C_Sorting {

	public void method4() {
		
		//1.비교주체
		for(int i=0; i<arr.length; i++) {
			
			//2.비교대상
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j]
					arr[j] = temp;
				}
			}
		}
		
	}
	/*
	 * 삽입정령(insertion sort) -동작 원리는 직관적, 선택 정령에 비해서는 구현 난이도가 높 -필요할 때만 위치를 바꾸므로
	 * '데이터가 거의 정렬되어 있을
	 * 
	 * 
	 * 7, 5, 9, 0. 3. 1, 6, 2, 4, 8 5, 7, 9, 0, 3, 1, 6, 2, 4, 8 0, 5, 7, 9, 3, 1,
	 * 6, 2, 4, 7 ... 0, 1. 2. 3, 4, 5, 6, 7, 8, 9
	 */

	public void method5() {
		
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8}
		
		// i=1        j=0
		// i=2        j=0~!
		// i=3        j=0~2
		// i=4        j=0~3
		
		// 1.비교주제
		
		
		
		
		
		// 2. 비교대상
		for(int j=0; j<i; j++) {
			
			if(arr[j] > arr[i]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		
		
		
	}

	/*
	 * 버블 정령(bubble sort) -인접한 두 수를 비교해서 큰 수를 뒤로 보내는 것이 특징 -구현이 쉽다는 장점이 있지만, 다른 정렬에
	 * 비해 정령 속도가 느리먀, 역순으로 정렬할때 가장 느린 속도를 가짐
	 * 
	 * 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 5, 7, 0, 3, 1, 6, 2, 4, 8, 9 5, 0, 3, 1, 6, 2,
	 * 4, 7, 8, 9 0, 3, 1, 5, 2, 4, 6, 7, 8, 9
	 * 
	 * ..
	 * 
	 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
	 */

	public void method6() {

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = arr.length - 1; i >= 0; i--) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {

		C_Sorting c = new C_Sorting();
		c.method4();
		c.method5();
		c.method6();

	}

}
