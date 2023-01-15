import java.util.Arrays;

class Dynamic_Array {
       int i=0;
       int [] array = new int[5];
	public static void main(String[] args) {
		//Dynamic_Array da=  new Dynamic_Array();
		/*for(int i=0;i<10;i++) {
			da.add(i);
		}
      System.out.println(Arrays.toString(da.array));*/
		//da.toString();
		//da.delete(1);
	}
	
	public int delete(int j) {
		if(j>=array.length) {
			System.out.println("Upto Index"+(array.length-1)+"only Available");
		}
		int temp=array[j];
		array[j]=0;
		return temp;
		
	}

	public void add(int j) {
		array[i++]=j;
		if(i==array.length) {
		int []temp=new int[array.length+5];
		for(int i=0;i<array.length;i++) {
			temp[i]=array[i];
		}
		array=new int[temp.length];
		array=temp;
		}
		
		
	}
	public String toString() {
		return Arrays.toString(array);
	}

}
public class Checking_Dynamic_Array {

	public static void main(String[] args) {
		Dynamic_Array da=  new Dynamic_Array();
		for(int i=0;i<=22;i++) {
			da.add(i);
		}
       System.out.println(da.delete(22));
       System.out.println(da);
	}

}
