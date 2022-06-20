import java.io.IOException;

public class GIT2 {
    public static void main(String[] args)    
    {
        /*Este código me abre git-bash */
        try 
        {
            Runtime.getRuntime().exec
            ("cmd /c start cmd.exe /K \" cd C:\\Archivos de programa\\Git && git status\"");
            
        } 
        
        
        catch (IOException ioe) 
        {
            System.out.println (ioe);
        }
    
    }
}
