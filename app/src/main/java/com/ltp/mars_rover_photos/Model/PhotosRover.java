package com.ltp.mars_rover_photos.Model;

public class PhotosRover {
    public Rover rover;
    public int sol;
    public String img_src;

    public PhotosRover(Rover rover, int sol, String img_src) {
        this.rover = rover;
        this.sol = sol;
        this.img_src = img_src;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }
}
