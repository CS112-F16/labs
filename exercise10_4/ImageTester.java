public class ImageTester {

	public static void main(String[] args) {

		ImageManipulator im = new ImageManipulator();

		//TEST MAKE NEGATIVE
		im.makeNegative("original.jpg", "negative.jpg");

		//TEST LIGHTEN
		im.lighten("original.jpg", "lighter.jpg", .5);

		//TEST LIGHTEN
		im.lighten("original.jpg", "lightest.jpg", .75);

		//TEST GREYSCALE
		im.makeGreyscale("original.jpg", "greyscale.jpg");

		//TEST SCROLL HORIZONTAL
		im.scrollHorizontal("original.jpg", "scrollhorizontal.jpg", 300);


	}
}