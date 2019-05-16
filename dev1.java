
import java.util.*;
import java.io.*;
class Dev1 
{
    public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter Input");
	int noTestCase = sc.nextInt();
	//System.out.println(noTestCase);
	Map<Integer,List<Integer>> sumWithArray=new HashMap<>(); 
	for(int i=1;i<=noTestCase;i++){
		System.out.println("please enter array size and sum");
		int size=sc.nextInt();
		int sum=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int j=1;j<=size;j++){
			list.add(sc.nextInt());
		}
		//System.out.println(list.toString());
		sumWithArray.put(sum,list);
	}
	 for (Map.Entry<Integer,List<Integer>> entry : sumWithArray.entrySet()){
	 	int sum = entry.getKey();
		//int lastIndex=0; 
		//System.out.println(entry.getValue().size());
		for(int index=0;index<entry.getValue().size();index++){
			int i=0;
		       	Integer finalSum=0;
			for(int lastIndex=index;lastIndex<entry.getValue().size();lastIndex++){
				finalSum =finalSum+entry.getValue().get(lastIndex);
				//System.out.println(sum+", "+finalSum);
				if(finalSum==sum){
					System.out.println(index+","+lastIndex);
					break;
				}
			}
		}
	 }
    }
}
