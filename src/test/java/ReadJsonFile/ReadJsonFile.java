package ReadJsonFile;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFile {
    private JSONObject jsonObject;

    public void loadJsonFile() throws IOException, ParseException {
        //step1: file reader to read the jsonfile
        FileReader fileReader=new FileReader("./TestData/Testdata.json");
        // step2 : create a jsonparser object to parse the file read by filereader
        JSONParser jsonParser=new JSONParser();
        // store the parsed data into Object class object
        Object object=jsonParser.parse(fileReader);
        //parse the Object class with Json object to get the data based on the key
        jsonObject=(JSONObject)object;
    }

    public String getData(String testcase,String fieldName)
    {
        JSONObject obj= (JSONObject) jsonObject.get(testcase);
        System.out.println(obj.get(fieldName));
        return obj.get(fieldName).toString();
    }


}
