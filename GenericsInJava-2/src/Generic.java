import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		//EXAMPLE Eliminate duplicates!!!
		
		ArrayList<String> list = new ArrayList<>();
		list.add("green");
		list.add("red");
		list.add("blue");
		list.add("blue");
		list.add("black");
		list.add("green");
		list.add("yellow");
		list.add("orange");
		list.add("green");
		ArrayList<String> nodups = removeDuplicate(list);
		System.out.println(list);
		System.out.println(nodups);
		
		System.out.println("----------------------------------");
		
		ArrayList<Integer> listNum = new ArrayList<>();
		listNum.add(3);
		listNum.add(5);
		listNum.add(7);
		listNum.add(7);
		listNum.add(7);
		listNum.add(9);
		listNum.add(11);
		listNum.add(9);
		listNum.add(13);
		ArrayList<Integer> nodupsNum = removeDuplicate(listNum);
		System.out.println(listNum);
		System.out.println(nodupsNum);

	}
	// this method use generic - both String or Integer or...
	public static <E extends Comparable<E>> ArrayList<E> removeDuplicate(ArrayList<E> myList){

		//USING COMPARABLE
		int flag =0;
		ArrayList<E> newList = new ArrayList<>();
		newList.add(myList.get(0));
		for(int i=0; i < myList.size();i++){
			for(int y=0; y<newList.size(); y++){
				if(myList.get(i).compareTo(newList.get(y)) ==0){
					flag =1;
				}
			}
			if(flag == 0){
				newList.add(myList.get(i));
			}
			flag =0;
		}
		
		//USING Comtains method
//		for(int i=0; i<myList.size(); i++){
//			if(!newList.contains(myList.get(i))){
//				newList.add(myList.get(i));			
//			}
//		}		
		return newList;
	}	
}
