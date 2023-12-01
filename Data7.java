import processing.core.PApplet;
import java.util.Random;

public class Data7 extends PApplet {

    float vehicleX = 0;
    float vehicleY = 500;
    float vehicleWidth = 100;
    float vehicleHeight = 50;

    float[] snowflakeX;
    float[] snowflakeY;

    float carX = 0;
    float carY = 409;
    float carWidth = 80;
    float carHeight = 40;

    public static void main(String[] args) {
        PApplet.main("Data7");
    }

    public void settings() {
        size(1300, 600);
    }

    public void setup() {
        snowflakeX = new float[100];
        snowflakeY = new float[100];
        for (int i = 0; i < snowflakeX.length; i++) {
            snowflakeX[i] = random(width);
            snowflakeY[i] = random(height);
        }
    }

    public void draw() {
        // Memvuat Warna background
        int x1 = 0;
        int y1 = 0;
        int x2 = 1300;
        int y2 = 0;
        int R1 = 20;
        int G1 = 10;
        int B1 = 81;
        stroke(R1, G1, 81);
        for (int x = 0; x <= 380; x++) {
            stroke(R1, G1, B1);
            line(x1, y1, x2, y2);
            y1++;
            y2++;
            G1++;
        }

        // Membuat Bintang
        float randomX = new Random().nextFloat();
        float randomY = new Random().nextFloat();
        stroke(255);
        strokeWeight(3);
        for (int i = 0; i < 25; i++) {
            randomX = random(0, 1300);
            randomY = random(0, 200);
            point(randomX, randomY);
        }

        // Gambar Bulan
        stroke(200, 200, 200);
        fill(200, 200, 200);
        smooth();
        ellipse(100, 70, 55, 55);

        // Gambar KotastrokeWeight(2);
        // Membuat Pondasi Semua Gedung
        smooth();
        fill(0);
        rect(0, 330, 1300, 50);

        //Gedung 1
        fill(0); //Warna Gedung 1
        rect(130, 160, 130, 170);//Gedung 1
        fill(225, 225, 0);//Warna Jendela
        rect(140, 190, 25, 25);//Jendela kiri
        rect(140 ,260,25,25); //jendela kiri 2
        rect(220, 190, 25, 25);//Jendela kanan
        rect(220,260,25,25); //jendela kanan 2

        //Gedung Pondasi Dasaran A Dan B ;
        fill(0);//Gambar Dasaran Gedung
        rect(430, 280, 470, 50);//Dasaran gedung

        //Gedung 3
        fill(0);
        rect(280, 205, 140, 125);//gedung 3
        fill(225,225,0);//Gambar Jendela Gedung 3
        rect(290,230, 30,30 );//Jendela 1
        rect(370,230, 30,30 );//jendela 2

        //Gedung A
        fill(0);
        rect(440, 80, 120, 200);//Gedung menara
        fill(225,225,0);//gambar jendela menara
        rect(528,90,25,25); //Kaca Pojok Kanan
        rect(450,90,25,25); //kaca tengah
        rect(490,90,25,25); //Kaca Kiri
        rect(528,130,25,25); //Kaca pojok Kanan
        rect(490,130,25,25); //Kaca tengah
        rect(450,130,25,25); // Kaca Kiri

        //Membuat Jembatan Antara Gedung A Dan Gedung B
        fill(0);
        rect(560,178,75,20);
        rect(700,178,75,20);

        //gedung B Lantai 1
        fill(0);
        rect(760, 170, 140, 110);

        //gedung B lantai 2
        fill(0);
        rect(760, 120, 120, 50);
        fill(225,225,0);
        rect(770,130,25,25);
        rect(810,130,25,25);

        //gedung B lantai 3
        fill(0);
        rect(760, 90, 80, 30);

        //Membuat Puncuk Di atas gedung
        fill(0);
        triangle(1045, 70, 1145, 70, 1095, 20);
        rect(620, 170, 80, 110);
        triangle(620, 170, 700, 170, 660, 120);

        //Gedung Menara Pelabuhan
        fill(0);
        rect(1045, 70, 100, 210);
        fill(225,225,0);
        rect(1045, 70, 100, 50);

        //bawahan gedung menara
        fill(0);
        rect(1025, 280, 140, 50);

        //Gedung Paling Kanan
        fill(0);
        rect(1200, 180, 100, 150);
        fill(225,225,0);
        rect(1220, 190, 25,25);
        rect(1220, 230, 25,25);

        //Membuat Masjid
        fill(0);//Gambar Kubah Masjid
        ellipse(960, 285, 75, 70);//Membuat Kubah Masjid
        fill(0);//Gambar gedung Masjid
        rect(920, 290, 80, 40);//gedung masjid


        // Gambar bawahan sebagai objek laut
        fill(0,102,204); //
        rect(0, 545, 1366, 150);


        // Gambar Garis jalan
        for (int k = 1; k <= 11; k++) {
            fill(0);
            rect(1200 / 12 * k, 450, 180, 15);
            k += 2;
        }

        //Tahap Membuat Truk
        fill(0); // Warna Badan Truk
        rect(carX , carY, carWidth  + 140, carHeight + 50); // Membuat Badan truk
        fill(225,225,0);// Gambar Kepala Truk
        rect(carX + 230, carY+7, carWidth  + 2, carHeight + 10);//Membuat Kepala Truk
        fill(255,255,0);//Gambar Kepala Truk 2
        rect(carX + 220, carY+14, carWidth  + 5, carHeight + 28);//Membuat Kepalatruk 2
        fill(225,225,225);//Gambar Kaca Truk
        rect(carX + 235, carY+30, carWidth  -30, carHeight -2);//Membuat kaca Truk
        fill(0);//Gambar Roda Truk
        ellipse(carX + 60, carY+90, carWidth  + 5, carHeight + 20);//Membuat Roda Truk
        ellipse(carX + 200, carY+90, carWidth  + 5, carHeight + 20);//Membuat Rode Truk

        carX += 2; // Untuk Kecepatan Truk

    }
}
