package trng.json.domain;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
 
import com.fasterxml.jackson.databind.ObjectMapper;

 
public class UnmMrshell {
 
    public static void main(String args[]){
         
        ObjectMapper mapper = new ObjectMapper();
 
        /**
         * Read object from file
         */
        Students value = null;
        try {
            value = mapper.readValue(new File("result.json"), Students.class);
        } catch (Exception e) {
            e.printStackTrace();
        }   
         
        System.out.println(value);
         
    }
     
}