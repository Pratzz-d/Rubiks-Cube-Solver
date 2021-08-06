import java.io.*;

public class reader{
    static String coloredcube = new String(" ");
    public String reading(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("resource.txt")); //location of resource file
            String s;
            while((s = br.readLine())!= null){

                coloredcube = coloredcube.concat(s);
            }
            br.close();
            coloredcube = coloredcube.replaceAll("\\s","");
            return(coloredcube);

        }catch(Exception e){
            return("File Handling Error");
        }
    }
}