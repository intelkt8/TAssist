/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author intelkt8
 */
public class GroupGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int iNumNames;
    ArrayList<String> listNames = new ArrayList<String>();
    
    iNumNames = fiReadFile("c:/home/names.txt", listNames);
    System.out.println("There are a total of " + iNumNames + " students in the file provided.");
    
    //obtain group information
    int iGroups; 
    Scanner cin = new Scanner(System.in);
    do
    {
      
      System.out.println("How many groups do you want?");
      iGroups = cin.nextInt();
      if(iGroups > plistNames.size())
      {
        System.out.println("ERROR: The number of groups entered is greater than the number of students in the file");
      }
    }
    while (iGroups > plistNames.size());
    
    iMax = piNumNames / iGroups;
    iMaxMod = piNumNames % iGroups;
    
    
    fvDisplayNames(listNames);
 //   fvRandomGroups(listNames, iNumNames);
    }
    
    
    
    //Read file
      public static int fiReadFile(String psFile, ArrayList<String> plistNames)
  {
    int iCount;
    String sName;
    iCount = 0;
    
    try
    {
      Scanner ifsInput = new Scanner(new File(psFile));
      while (ifsInput.hasNextLine())
      {
        sName = ifsInput.nextLine();
        plistNames.add(sName);
        iCount ++;
      }
    }
    catch (FileNotFoundException sMsg)
    {
      System.out.println("File not found");
    }
    
    return iCount;
  }
    
      //Display names in list
   public static void fvDisplayNames(ArrayList<String> plistNames)
  {
    int iCount;
    String sName;
    
    for(iCount = 0; iCount < plistNames.size(); iCount++)
    {
      System.out.println(plistNames.get(iCount));
    }
    
    return;
  }
   
   public static void rdmGroupGenerator(int iMax){
       
   }
  
}
