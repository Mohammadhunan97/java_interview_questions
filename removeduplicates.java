import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList a1 = new ArrayList();
    
    a1.add(1);
    a1.add(2);
    a1.add(1);
    a1.add(4);
    
    System.out.println(removeDuplicates(a1));
  }
  
  public static ArrayList removeDuplicates(ArrayList ArrList){
    ArrayList a2 = new ArrayList();
    
    for(int i = 0; i <= ArrList.size() - 1; i++){
;
      if(a2.contains(ArrList.get(i))){
        System.out.println("not a value we want");
      }else{
        a2.add(ArrList.get(i));
      }
    }
    
    return a2;
  }
}
