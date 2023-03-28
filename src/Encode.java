import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Encode {
    public static void main(String[] args){
        JSONArray arr = new JSONArray();
        JSONObject objInner = new JSONObject();
        objInner.put("name", "John");
        objInner.put("age", 30);
        objInner.put("city", "New York");
        arr.add(objInner);
        JSONObject objInner1 = new JSONObject();
        objInner1.put("name", "anna");
        objInner1.put("age", 25);
        objInner1.put("city", "London");
        arr.add(objInner1);
        JSONObject objInner2 = new JSONObject();
        objInner2.put("name", "Peter");
        objInner2.put("age", 36);
        objInner2.put("city", "Madrid");
        arr.add(objInner2);
        JSONObject obj = new JSONObject();
        obj.put("empoyee", arr);
        System.out.println(obj);
    }
}
