public class Shelter {

    Larik_string Nama
    String namaShelter;

    public Shelter() {
    }

     
    public void tampilPenduduk(String judul) {
        System.out.println("=====" + judul + "=====");
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] != null) {
                System.out.println("No. " + (i + 1) + " " + this.namaPenduduk[i]);
            }
        }
    }

    public void addPenduduk(String nama) {
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] == null) {
                this.namaPenduduk[i] = nama;
                break;
            }
            if (i == this.namaPenduduk.length - 1) {
                System.out.println("Maaf Shelter ini sudah penuh");
            }
        }

    }

    setNamaPenduduk(Larik_string namaPenduduk) {
        int pointer = 0;
        for (int i = 0; i < this.namaPenduduk.length; i++) {
         //Ada Code disini!!

            }

        }
        for (int i = 0; i < namaPenduduk.length; i++) {
            this.namaPenduduk[pointer++] = namaPenduduk[i];
        }
    }

}
