import org.bytedeco.javacpp.opencv_core;

import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.cvLoadImage;
import static org.bytedeco.javacpp.opencv_imgcodecs.imread;

/**
 * Created by ar9013 on 4/16/17.
 */
public class App {

    public static void main(String args[]) {
        System.out.println("JavaCV Hello World");

        opencv_core.IplImage src = cvLoadImage("Ariel_Lee.png");

        cvNamedWindow("Display Image");

        cvShowImage("Display Image", src); // 顯示影像於視窗

        waitKey(0);

        cvDestroyWindow("Display Image");

    }
}
