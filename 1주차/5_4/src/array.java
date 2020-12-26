
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = {10,20,30,40,50};
		int[] iArr2 = iArr1;
		int[] iArr3 = {1,2,3};
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] =" + iArr1[i]);
			System.out.println("iArr2[" + i + "] =" + iArr2[i]);
		}
		
		// Arr2를 바꾸니깐 Arr1도 바뀌더라~ 
		// 왜? Arr2 = Arr1 할 때 Arr1 자체를 Arr2에 할당함으로
		iArr2[0] = 100;
		iArr2[1] = 200;
		iArr2[2] = 300;
		iArr2[3] = 400;
		iArr2[4] = 500;
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] =" + iArr1[i]);
			System.out.println("iArr2[" + i + "] =" + iArr2[i]);
		}
		
		System.out.println("iArr1 : " + iArr1);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("iArr3 : " + iArr3);
	}

}
