package Modul1;

public class Hidangan {
    protected String namaHidangan;
    
    public String getNamaHidangan(){
        return namaHidangan;
    }
    
    public String setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan;
        return namaHidangan;
    }
    
    public String disantap(){
        return "Makanan Dihidangkan";
    }
}
