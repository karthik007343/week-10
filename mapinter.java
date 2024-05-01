import java.util.HashMap;
import java.util.Map;
public class mapinterJava {
public static void main(String[] args) {
Map<String, String> SId = new HashMap<>();
SId.put("karthik, "501");
SId.put("siddu", "523");
SId.put("harshi", "566");
SId.put("nithish", "550");
for (Map.Entry<String, String> entry : SId.entrySet()) {
String name = entry.getKey();
String Id = entry.getValue();
System.out.println(name + " ID: " + Id);
}
System.out.println("\n");
System.out.println("Changing -> karthik : 501 - l501");
SId.put("karthikl501");
System.out.println("Removing -> nithish : 550");
SId.remove("nithish");
boolean sidd = SId.containsKey("siddu");
System.out.println("Is there any Student Id with siddu ? --> " + sidd);
System.out.println("\n");
for (Map.Entry<String, String> entry : SId.entrySet()) {
String name = entry.getKey();
String Id = entry.getValue();
System.out.println(name + " ID: " + Id);
}
}
}

