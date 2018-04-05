import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class scores
{
    public static void main(String args[])
    {
        JSONParser parser = new JSONParser();
        try
        {
            JSONArray arr = (JSONArray) parser.parse(new FileReader("C:\\Users\\Admin\\dicl-intern-18\\data.json"));
   
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
