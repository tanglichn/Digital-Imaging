import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
/**
 * Using erosion and dilation method, implement a grayscale opening with a square structuring element of a size 5x5 pixels.
 * 
 * @author Li Tang
 * @version 2018.01.18
 */
public class Opening {
	public static void main(String [] args)
	{
		//Load the OpenCV Native Library previously set on the project.
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		//Read a image form a location and define it as a new Mat. 
		Mat img = Imgcodecs.imread(args[0]);
		//Convert the image from multi channel to single channel.
		Imgproc.cvtColor(img,img,Imgproc.COLOR_BGR2GRAY);
		
		Mat img2=img.clone();
		Mat img3=img.clone();
		
		//using erosion method and dilation method.
		Erosion.erosion(img.height(),img.width(), img, img2);
		Dilation.dilation(img.height(),img.width(),img2,img3);
		
		//Write and save the new image in the address.
		Imgcodecs.imwrite(args[1], img3);								
	}
}
