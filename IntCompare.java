public class IntCompare{
  public static void main(String[] args){
    int x = 4, y = 5;
    if(x != y){
        if (x < y){
            System.out.println(x + "小于" + y);
        }else{
            System.out.println(x + "大于" + y);
        }
    }else{
        System.out.println(x + "等于" + y);
    } 
  }
}