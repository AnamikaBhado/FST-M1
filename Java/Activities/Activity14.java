package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException
    {
        try {
            File file = new File("C:/ANAMIKA/Activity14.txt");
            boolean status = file.createNewFile();
            if (status)
                System.out.println("File created successfully.");
            else
                System.out.println("File not created or already exists.");

            File fileUtil = FileUtils.getFile("C:/ANAMIKA/Activity14.txt");
            System.out.println("Data in file : " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File destDir = new File("resources");
            FileUtils.copyDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, "newFile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        }catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
