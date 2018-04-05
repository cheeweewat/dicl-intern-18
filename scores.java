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
            int total=0;            
            
            
            System.out.println("1.1 Average Score");
            for (int i = 0; i < score.length; i++) {
                total+=score;
                System.out.println("Average score : " +total);
            }
            System.out.println("1.2 Who has 70+ Score");
            for (int i = 0; i < score.length; i++) {
                if (score>70) {
                    System.out.println("Name : " +name);
                    System.out.println("Score : " +score);
                }
            }

            
            
            
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