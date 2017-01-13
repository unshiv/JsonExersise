package trng.json.domain;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

 
public class Marshelling {
 
    public static void main(String[] args) {
    	
    	Students students = getStudents();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	 try {
             //mapper.writeValue(new File("result.json"), students);//Plain JSON
             mapper.writerWithDefaultPrettyPrinter().writeValue(new File("result.json"), students);//Prettified JSON
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
      
 
	public static Students getStudents() {
 
        Student std = new Student();
         std.setNumber(101);
         std.setName("vijay");
         
         Address home = new Address();
         home.setStreet("N MAcArthur");
         home.setCity("Irving");
         home.setZipcode(75063);
         
         Marks marks = new Marks();
         marks.setSubject("Maths");
         marks.setMaxMarks(100);
         marks.setMarks(75);
         
         
         Student std1 = new Student();
         std1.setNumber(102);
         std1.setName("vishnu");
        
         Address home1 = new Address();
         home1.setStreet("Las Colinas");
         home1.setCity("Irving");
         home1.setZipcode(75063);
         
         Marks marks1 = new Marks();
         marks1.setSubject("social");
         marks1.setMaxMarks(100);
         marks1.setMarks(75);
              
         Students students = new Students();
         students.getStudents().add(std);
         students.getStudents().add(std1);
         
        return students;
    }
 
}