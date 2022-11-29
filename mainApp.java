package tugas;

public class mainApp {
    public static void main(String[]args){
        BangunDatar BangunDatar=new BangunDatar();
        persegi persegi =new persegi(4);
        lingkaran lingkaran=new lingkaran(35);
        segitiga segitiga=new segitiga(5, 7);

        BangunDatar.luas();
        BangunDatar.keliling();

        System.out.println("Luas persegi : " + persegi.luas());
        System.out.println("keliling persegi : " + persegi.keliling());
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        System.out.println("Luas segitiga : " + segitiga.luas());
        System.out.println("keliling lingkaran : " + lingkaran.keliling());

    }
}
