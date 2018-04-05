import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_Reader
{
    public static void main(String args[])
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object object = parser.parse(new FileReader("C:\Users\Admin\dicl-intern-18\data.json"));
        
            JSONObject jsonObject = (JSONObject)object;
            
            //Reading the String
            String name = (String) jsonObject.get("name");
            int score = (int) jsonObject.get("score");
            int grade = (int) jsonObject.get("grade");            
            
            //Printing all the values
            System.out.println("Name : " + name);
            System.out.println("Score : " + score);
            System.out.println("Grade:" + grade);
            
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}