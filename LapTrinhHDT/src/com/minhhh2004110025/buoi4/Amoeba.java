package com.minhhh2004110025.buoi4;

public class Amoeba {
        String fileSound;
        double xPoint, yPoint;
    
        public String getfileSound() {
            return fileSound;
        }
    
        public void setFileSound(String fileSound) {
            this.fileSound = fileSound;
        }
    
        public double getxPoint() {
            return xPoint;
        }
    
        public void setxPoint(double xPoint) {
            this.xPoint = xPoint;
        }
    
        public double getyPoint() {
            return yPoint;
        }
    
        public void setyPoint(double yPoint) {
            this.yPoint = yPoint;
        }
    
        public Amoeba() {
    
        }

        public Amoeba(String fileSound, double xPoint, double yPoint) {
            this.fileSound = fileSound;
            this.xPoint = xPoint;
            this.yPoint = yPoint;
        }
    
    
        public void playSound() {
            System.out.println("Play " + fileSound );
        }
    
        public void rotate() {
            System.out.println("Amoeba đang Xoay 360 Độ... Tại xPoint: " + this.xPoint + " and yPoint: " + this.yPoint);
    }
}


