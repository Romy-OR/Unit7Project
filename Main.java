import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws Exception{
        File file = new File("C:\\Users\\student\\.vscode\\Unit7Project\\SuperBowlData.txt");
        Scanner text = new Scanner(file);
        GameList g1 = new GameList(text);
    }
}
