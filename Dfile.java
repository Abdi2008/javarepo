import java.io.File;
import java.io.IOException;
public class Dfile{
    public static void main(String[] args){
    //     try{
    //         File myObj= new File("receba.css");
    //         if(myObj.createNewFile()){
    //             System.out.println("File has been succesfully Created");
    //         } else{
    //             System.out.println("file already exists");
    //         }
    //     } catch (IOException e) {
    //   System.out.println("An error occurred.");
    //   e.printStackTrace();
    // }
        try{
            File myObj= new File("receba.html");
            if(myObj.createNewFile()){
                System.out.println("file has been succesfully Created");
            }else{
                System.out.println("File Exists");
            }
        } catch(IOException e){
            System.out.println("An error Occured whilst creating");
            e.printStackTrace();
        }
    }
}