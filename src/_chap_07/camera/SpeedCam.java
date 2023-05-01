package _chap_07.camera;

public class SpeedCam extends Camera {//자식 클래스
    //public String name;
    public SpeedCam() {
        this.name = "과속 단속 카메라";
    }

//    public void takePicture(){
//        //사진 촬영
//        System.out.println("사진을 촬영합니다");
//    }
//    public void recordVideo(){
//        //동영상 녹화
//        System.out.println("사진을 촬영합니다");
//    }
    public void checkSpeed(){
        System.out.println("속도를 측정합니다");
    }
    public void recognizeLicensePlate (){
        System.out.println("차량 번호를 인식합니다.");

    }



}
