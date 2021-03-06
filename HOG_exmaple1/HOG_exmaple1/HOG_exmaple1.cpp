// HOG_exmaple1.cpp: 콘솔 응용 프로그램의 진입점을 정의합니다.
//

#include "stdafx.h"
#include <iostream>
#include <vector>
#include <string>
#include <stdexcept>
#include <chrono>
#include <opencv2/opencv.hpp>
#include <opencv2/core/core.hpp>
#include <opencv2/objdetect.hpp>
#include <opencv2/highgui.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/imgcodecs.hpp>
#include <opencv2/video.hpp>
#include <opencv2/videoio.hpp>
#include "opencv2/features2d/features2d.hpp"

using namespace std;
using namespace cv;

int main()
{
	Mat img = imread("pedestrian1.jpg");

	
	HOGDescriptor hog;
	hog.setSVMDetector(HOGDescriptor::getDefaultPeopleDetector());
	vector<Rect> detected;

	hog.detectMultiScale(img, detected, 0, Size(9, 9), Size(26, 20), 1.05, 2);

	int detectedCNT = detected.size();

	for (int i = 0; i < detectedCNT; i++)
	{
		Rect people = detected[i];
		rectangle(img, people, Scalar(0, 0, 255), 2);
	}

	imshow("Result", img);
	waitKey(0);
    return 0;
}

