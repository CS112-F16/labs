/**
	A class with several methods to manipulate jpg images.
**/

public class ImageManipulator {

	/**
		Creates an inversion of the original image by setting the red 
		value for each pixel to be 255 minus the original red value, 
		and the same for green and blue.  
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the negative 
		image will be stored
	**/
	public void makeNegative(String inputfile, String outputfile) {

	}

	/**
		Takes as input a floating point number between 0 and 1 that indicates
		by how much the image should be lightened. For each pixel, it will set
		its new red value to be (1-amount)oldred + amount * 255, doing the 
		same for green and blue.
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the lightened 
		image will be stored
		@param amount - the amount by which the image will be lightened
	**/
	public void lighten(String inputfile, String outputfile, double amount) {
		
	    /*
	      Hint: if you multiply an integer by a floating point number Java will
	      automatically convert the result to a floating point number. For these
	      exercises, you will need to convert that result back into an integer
	      (as the RGB values for the pixel must be whole numbers). To do this, 
	      you may using casting to convert a double to an int by truncating.
	      Example below:
	      
	      int original = 5;
	      double resultDouble = 5 * .55;
	      int resultInt = (int)resultDouble;

	    */

	}

	/**
		Converts the image to "black and white" by setting the red, 
		green, and blue value for each pixel to be 30% of the old 
		red value + 59% of the old green value + 11% of the old blue 
		value for that pixel (see: http://en.wikipedia.org/wiki/Grayscale).
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the greyscale 
		image will be stored
	**/
	public void makeGreyscale(String inputfile, String outputfile) {

	}


	/**
		Takes as input a number of pixels and scrolls the image by 
		that amount horizontally.  The image will be shifted to the 
		left, and the leftmost numpixels will appear on the right 
		side of the image.
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the scrolled 
		image will be stored
		@param numpixels - the amount by which the image will be scrolled
	**/
	public void scrollHorizontal(String inputfile, String outputfile, int numpixels) {
		
	}

}