import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InitialTask {

    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Paths.get(InitialTask.class.getClassLoader().getResource("sample.html").toURI());

        String contents = new String(Files.readAllBytes(path));

        //System.out.println(contents);

        //Your logic goes here
        String title = StringUtils.substringBetween(contents, "<title>", "</title>");
        System.out.println("Cities of Country : "+title);
      
        Cities cities = new Cities();
        List<String> cityArray = cities.getCities(title);
        
        
        int i=0;//city number
        for(String city: cityArray)
        {
        	i++;
        	System.out.println("City "+i+" : "+city);
        }
        
        
    }
}
