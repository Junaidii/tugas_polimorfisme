package tugas;

public class persegi extends BangunDatar{

    int sisi;

    public persegi(int sisi){
        this.sisi = sisi;
    }

    public float luas(){

        return this.sisi * this.sisi;
    }

    public float keliling(){
        return this.sisi * 4;
    }

}
