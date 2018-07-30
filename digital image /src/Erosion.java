import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
/**
 * The Erosion class presents a way to access a picture, erode and save it.
 * 
 * @author Li Tang
 * @version 2018.01.18
 */
public class Erosion{

	public static void main(String[] args)
	 {
		//Load the OpenCV Native Library previously set on the project.
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		//Read a image form a location and define it as a new Mat. 
		Mat img = Imgcodecs.imread(args[0]);
		//Convert the image from multi channel to single channel.
		Imgproc.cvtColor(img, img, Imgproc.COLOR_BGR2GRAY);
		//Define a new Mat which is the same with img.
		Mat img2=img.clone();
		
		//use erosion method 
        erosion(img.height(),img.width(),img,img2);
		
		//Write and save the new image in the address. 
		Imgcodecs.imwrite(args[1], img2);
	 }
	/**
	 * erode image and save as a new image. 
	 * @param h the height of original image.
	 * @param w the with of original image.
	 * @param img the Mat got by original image.
	 * @param img2 a new Mat which the same as img. 
	 */
    public static void erosion(int h,int w,Mat img,Mat img2) {
	     //The loop to find every pixel in the image.
	     for(int x=0;x<w;x++) {
		     for(int y=0;y<h;y++) {
			    double min= img.get(x, y)[0];
			      //Get a point as a centre and find every pixel in the 5*5 square. 
			        for(int i=x-2;i<=x+2;i++) {
				       for(int j=y-2;j<=y+2;j++) {
					     //compare every pixels in the square and find the smallest one.
					       if (i>=0&&i<w&&j>=0&&j<h) {
					           if (img.get(i, j)[0]<min) {
						          min= img.get(i, j)[0];
					}
				} 
			}
		}		       
			//put the every minimum pixel in the new Mat.
            img2.put(x,y,min);			
		}			 
	}
}
}
	

		
	
	
	
	
	


	



	






