package Practice;

public class Split {
	public static void main(String[] args)
	{
		String s="ninna manasalli nange jaga illa";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
	}

}
