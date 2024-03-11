// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.ArrayList;



public class Main {
  
  public static void main(String[] args) {  
    ArrayList<String> list = new ArrayList<String>();

    list.add("He");
    list.add("yo");
    list.add("We");

    for (String i : list){
      System.out.println(i);
    }
  }
}
