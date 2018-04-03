import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList a1 = new ArrayList();
    
    a1.add(1);
    a1.add(2);
    a1.add(1);
    a1.add(4);
    
    System.out.println(reverse(a1));
  }
  
  public static ArrayList reverse(ArrayList ArrList){
    ArrayList a2 = new ArrayList();
    
    for(int i = ArrList.size() -1 ; i >= 0; i--){
      a2.add(ArrList.get(i));
    }
    
    return a2;
  }
}
