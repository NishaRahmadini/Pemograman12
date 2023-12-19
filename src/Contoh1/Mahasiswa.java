package Contoh1;

import java.util.Date;

public class Mahasiswa {
   private String nama;
   private Date tanggalLahir;
   private String alamat;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public class Age
    {
        private int days;
        private int months;
        private int years;

        private Age()
        {
            //Prevent default constructor
        }

        public Age(int days, int months, int years)
        {
            this.days = days;
            this.months = months;
            this.years = years;
        }

        public int getDays()
        {
            return this.days;
        }

        public int getMonths()
        {
            return this.months;
        }

        public int getYears()
        {
            return this.years;
        }

        @Override
        public String toString()
        {
            return years + " Years, " + months + " Months, " + days + " Days";
        }
    }
}
