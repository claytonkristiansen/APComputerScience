import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void onlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(0);
	        pixelObj.setRed(0);
	      }
	    }
  }
  	//Here changed tab spacing, it was driving me crazy
  	public void negate()
  	{
	  	Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	    	for (Pixel pixelObj : rowArray)
	    	{
	    		pixelObj.setGreen(255 - pixelObj.getGreen());
	    		pixelObj.setRed(255 - pixelObj.getRed());
	    		pixelObj.setBlue(255 - pixelObj.getBlue());
	    	}
	    }
  	}	
  	
  	public void grayScale()
  	{
	  	Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	    	for (Pixel pixelObj : rowArray)
	    	{
	    		int average = (pixelObj.getGreen() + pixelObj.getRed() + pixelObj.getBlue()) / 3;
	    		pixelObj.setGreen(average);
	    		pixelObj.setRed(average);
	    		pixelObj.setBlue(average);
	    	}
	    }
  	}	
  	
  	public void fixUnderwater()
  	{
	  	Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	    	for (Pixel pixelObj : rowArray)
	    	{
	    		if(pixelObj.getRed() < 20)
	    		{
	    			pixelObj.setRed(255);
	    			pixelObj.setBlue(0);
	    			pixelObj.setGreen(0);
	    		}
	    	}
	    }
  	}	
  	
  //Back to regular stupid tab spacing
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width - 1; col > width / 2; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < height / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < height / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel sidePixel = null;
    Pixel topPixel = null;
    for(int row = 0; row < pixels.length && row < pixels[0].length; row++)
    {
    	for(int col = row; col < pixels.length && col < pixels[0].length; col++)
    	{
    		sidePixel = pixels[col][row];
    		topPixel = pixels[row][col];
    		topPixel.setColor(sidePixel.getColor());
    	}
    }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
    	  
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println("This loop executed: " + count + " times");
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 199;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the columns
    for (int col = 102; col < 296; col++)
    {
      // loop from 13 to just before the mirror point
      for (int row = 158; row < mirrorPoint; row++)
      {
        count++;
    	  
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    System.out.println("This loop executed: " + count + " times");
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 236;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 234; row < 322; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 345; col > mirrorPoint; col--)
      {
        count++;
    	  
        rightPixel = pixels[row][col];      
        leftPixel = pixels[row][mirrorPoint - (col - mirrorPoint)];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
    System.out.println("This loop executed: " + count + " times");
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** copy from the passed fromPic to the
   * specified startRow and startCol in the
   * current picture
   * @param fromPic the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   */
 public void copyPart(Picture fromPic, int startRow, int startCol, int fromStartRow, int fromStartColumn, int fromEndRow, int fromEndColumn)
 {
   Pixel fromPixel = null;
   Pixel toPixel = null;
   Pixel[][] toPixels = this.getPixels2D();
   Pixel[][] fromPixels = fromPic.getPixels2D();
   for (int fromRow = fromStartRow, toRow = startRow; 
        (fromRow < fromPixels.length && fromRow < fromEndRow) &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
   {
     for (int fromCol = fromStartColumn, toCol = startCol; 
          (fromCol < fromPixels[0].length && fromCol < fromEndColumn) &&
          toCol < toPixels[0].length;  
          fromCol++, toCol++)
     {
       fromPixel = fromPixels[fromRow][fromCol];
       toPixel = toPixels[toRow][toCol];
       toPixel.setColor(fromPixel.getColor());
     }
   }   
 }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  /** Method to create a collage of several pictures */
  public void myCollage(Picture pic1, Picture pic2, Picture pic3)
  {
	Picture _pic1 = pic1.scale(0.25, 0.25);
	Picture _pic2 = pic2.scale(0.25, 0.25);
	Picture _pic3 = pic3.scale(0.25, 0.25);
	  
    _pic1.zeroBlue();
    _pic2.mirrorDiagonal();
    _pic3.grayScale();
    
    this.copy(_pic1,0,0);
    this.copy(_pic2,_pic1.getHeight(),0);
    this.copy(_pic3,_pic1.getHeight() + _pic2.getHeight(),0);
    this.mirrorVertical();
    this.write("mycollage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  /** Method to show large changes in color 
   * @param edgeDist the distance for finding edges
   */
 public void edgeDetection2(int edgeDist)
 {
   Pixel leftTopPixel = null;
   Pixel rightPixel = null;
   Pixel bottomPixel = null;
   Pixel[][] pixels = this.getPixels2D();
   Color rightColor = null;
   Color bottomColor = null;
   for (int row = 0; row < pixels.length - 1; row++)
   {
     for (int col = 0; 
          col < pixels[0].length-1; col++)
     {
       leftTopPixel = pixels[row][col];
       rightPixel = pixels[row][col+1];
       bottomPixel = pixels[row + 1][col];
       rightColor = rightPixel.getColor();
       bottomColor = bottomPixel.getColor();
       if (leftTopPixel.colorDistance(rightColor) > 
           edgeDist || leftTopPixel.colorDistance(bottomColor) > edgeDist)
         leftTopPixel.setColor(Color.BLACK);
       else
         leftTopPixel.setColor(Color.WHITE);
     }
   }
 }
  
 /** Method to show large changes in color 
  * @param edgeDist the distance for finding edges
  */
public void edgeDetection3(int colorDiff)
{
  Pixel leftTopPixel = null;
  Pixel rightPixel = null;
  Pixel bottomPixel = null;
  Pixel[][] pixels = this.getPixels2D();
  Color rightColor = null;
  Color bottomColor = null;
  for (int row = 0; row < pixels.length - 1; row++)
  {
    for (int col = 0; 
         col < pixels[0].length-1; col++)
    {
      leftTopPixel = pixels[row][col];
      rightPixel = pixels[row][col+1];
      bottomPixel = pixels[row + 1][col];
      rightColor = rightPixel.getColor();
      bottomColor = bottomPixel.getColor();
      if (	  Math.abs(leftTopPixel.getBlue() - rightColor.getBlue()) > colorDiff ||
    		  Math.abs(leftTopPixel.getGreen() - rightColor.getGreen()) > colorDiff ||
    		  Math.abs(leftTopPixel.getRed() - rightColor.getRed()) > colorDiff ||
    		  Math.abs(leftTopPixel.getBlue() - bottomColor.getBlue()) > colorDiff ||
    		  Math.abs(leftTopPixel.getGreen() - bottomColor.getGreen()) > colorDiff ||
    		  Math.abs(leftTopPixel.getRed() - bottomColor.getRed()) > colorDiff
    		  )
        leftTopPixel.setColor(Color.BLACK);
      else
        leftTopPixel.setColor(Color.WHITE);
    }
  }
}

/** Method to replace the blue background with
 * the pixels in the newBack picture
 * @param newBack the picture to copy from
 */
	public void chromakey(Picture newBack)
	{
		Pixel fromPixel = null;
 		Pixel toPixel = null;
 		Pixel[][] toPixels = this.getPixels2D();
 		Pixel[][] fromPixels = newBack.getPixels2D();

 		for(int i = 0; i < toPixels.length; i++)
 		{
	 		for(int k = 0; k < toPixels[i].length; k++)
	 		{
		 		if(toPixels[i][k].getBlue() >= toPixels[i][k].getRed())
		 		{
			 		toPixels[i][k].setColor(fromPixels[i][k].getColor());
				}
	 		}
 		}

	}
	
	/** Hide a black and white message in the current
	    * picture by changing the red to even and then
	    * setting it to odd if the message pixel is black 
	    * @param messagePict the picture with a message
	    */
	  public void encode(Picture messagePict)
	  {

	    Pixel[][] messagePixels = messagePict.getPixels2D();
	    Pixel[][] currPixels = this.getPixels2D();
	    Pixel currPixel = null;
	    Pixel messagePixel = null;
	    
	    for(int i = 0; i < currPixels.length; i++)
	    {
	    	for(int k = 0; k < currPixels[i].length; k++)
	    	{
	    		if(currPixels[i][k].getRed() % 2 == 1)
	    		{
	    			currPixels[i][k].setRed(currPixels[i][k].getRed() - 1);
	    		}
	    	}
	    }

	    for(int i = 0; i < currPixels.length && i < messagePixels.length; i++)
	    {
	    	for(int k = 0; k < currPixels[i].length && k < messagePixels[i].length; k++)
	    	{
	    		if(!(messagePixels[i][k].colorDistance(Color.white) < 50))
	    		{
	    			currPixels[i][k].setRed(currPixels[i][k].getRed() + 1);
	    		}
	    	}
	    }

	  }
	  
	  /**
	   * Method to decode a message hidden in the
	   * red value of the current picture
	   * @return the picture with the hidden message
	   */
	  public Picture decode()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    int height = this.getHeight();
	    int width = this.getWidth();
	    Pixel currPixel = null;
	    Pixel messagePixel = null;
	    Picture messagePicture = new Picture(height,width);
	    Pixel[][] messagePixels = messagePicture.getPixels2D();
	    for(int i = 0; i < pixels.length; i++)
	    {
	    	for(int k = 0; k < pixels[i].length; k++)
	    	{
	    		if(pixels[i][k].getRed() % 2 == 1)
	    		{
	    			messagePixels[i][k].setColor(Color.BLACK);
	    		}
	    		else
	    		{
	    			messagePixels[i][k].setColor(Color.WHITE);
	    		}
	    	}
	    }

	    return messagePicture;
	  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
