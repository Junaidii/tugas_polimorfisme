package tugas;

public class segitiga extends BangunDatar{
    int alas;
    int tinggi;

    public segitiga(int alas, int tinggi){
        this.alas= alas;
        this.tinggi=tinggi;
    }

    public float luas(){

        return this.alas * this.tinggi;

    }
}
