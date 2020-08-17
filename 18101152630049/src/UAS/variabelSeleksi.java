/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author arfan
 */
public class variabelSeleksi {
    
    int noPeserta, umur, tinggi;
    String nama, keterangan;
    
    public void setKetentuan(){
        if(umur >= 17 && umur <= 25 && tinggi >= 150){
            keterangan = "Lulus";
        }else{
            keterangan = "Tidak Lulus";
        }
    }
    
}
