package Test.Test_1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	JSONObject obj = new JSONObject();
    obj.put("name", "mkyong.com");
    obj.put("age", new Integer(100));
    

    JSONArray list = new JSONArray();
    list.add("msg 1");
    list.add("msg 2");
    list.add("msg 3");

    obj.put("messages", list);

    try {
    	FileWriter file = new FileWriter("C:\\json\\test.json");

        file.write(obj.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println(obj);

}

}


