import java.util.ArrayList;
public class Driver{
    public static char letter(){
	return (char)('A'+(int)(Math.random()*26));
    }

    /*//UNCOMMENT THIS WHEN YOU DO Area
      public static Area makeRandomAreaShape(){
      String name = ""+letter()+"-2d";
      double value =Math.round(Math.random()*10.0);
      if(Math.random() < 0.5){
      return new Circle(value,name);
      }else{
      double value2 =Math.round(Math.random()*10.0);
      return new Rectangle(value,value2,name);
      }
      }
      /*

      /* //UNCOMMENT THIS WHEN YOU DO Volume
      public static Volume makeRandomVolumeShape(){
      String name = ""+letter()+"-3d";
      double value = Math.round(Math.random()*10.0);
      double choice = Math.random();
      if(choice < 0.33){