package com.ltp.mars_rover_photos.Model;

import java.util.List;

public class PhotosApiResponse {
    List<PhotosRover> datosRover;

    public List<PhotosRover> getDatosRover() {
        return datosRover;
    }

    public void setDatosRover(List<PhotosRover> datosRover) {
        this.datosRover = datosRover;
    }
}
