/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/*
 * @author Nkechi Nnaji
 * Date: September 5, 2016

 *Assignment
 * Please implement a computer program that reads in Lena 256_PGM.pgm 
 * (posted under this assignment on blackboard) and create another image file that is exactly the same. You can chose whatever programming language to use. 
 * (Pls do not use any image processing library functions)
 *Submission:
 *Your source code only. (for example, if you were using C++, then only the .cpp file, not anything else.
 *Submit on blackboard
 */

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;


public class Assignment1 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws IOException
   {
       //Static string to hold string literals on image
        String sCurrentLine;
        //Locate image
         FileInputStream myImageLocation = new FileInputStream("/Users/Nnaji-MacPro1/Downloads/lena256_PGM.pgm");
         //Read the image file
         BufferedReader dataOnImage= new BufferedReader(new InputStreamReader (myImageLocation));
         while((sCurrentLine = dataOnImage.readLine()) !=null)
         {
             System.out.println(sCurrentLine);
         }
         
         //Another image file
         
         //Image dimension
         int width = 256;
         int height = 256;
         BufferedImage myImage = new BufferedImage (width, height, BufferedImage.TYPE_BYTE_BINARY);
         System.out.println("**************************************************");
         
         //New file object
         File fileObject = null;
         
        /* for(int y = 0; y<height; y++)
         {
             for (int x= 0; x< width; x++)
             {
                 int a = (int)(Math.random()*256);
                 int r =(int)(Math.random()*256);
                 int g =(int)(Math.random()*256);
                 int b=(int)(Math.random()*256);
                 int p = (a<<24)| (r<<16) | (g<<8) | b;//pixel
                 
                 myImage.setRGB(x, y, p);
                 
             }
         }*/
         try{
             fileObject = new File("/Users/Nnaji-MacPro1/Desktop/myNewImage.pgm");
             ImageIO.write(myImage, "myImage", fileObject);
             System.out.println(fileObject);
         }
         catch(IOException e)
         {
             System.out.println("Error: " + e);
         }
         
         //Create similar image of lena256_PGM.pgm pixel by pixel
         
         
        
    }
}