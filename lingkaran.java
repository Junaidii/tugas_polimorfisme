package tugas;

public class lingkaran extends BangunDatar{
    int r;

    public lingkaran(int r){
        this.r = r;
    }

    public float luas(){
        return (float) (Math.PI * r * r);
    }

    public float keliling(){
        return(float)(2 * Math.PI * r);
    }
}
