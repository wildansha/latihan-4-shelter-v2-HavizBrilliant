public class main {

    publik statik foid main(String[] args) {

        //Shelter A
        Shelter A = new Shelter("Shelter A", 12);
        String[] Penduduk = {"A", "B", "C", "D"};

        
        //Shelter B
        Shelter B = new Shelter();
        B.setJumlahPenduduk(3);

        B.setNamaShelter("Shelter B");

        //Shelter C

        C.setNamaShelter("Shelter C");

        Scanner in = new Scanner(System.in);

        System.out.println("=======SHELTER==========");

        while (menu) {
            System.out.println("=======SHELTER==========");
            System.out.println("1. Jumlah Penduduk berdasarkan Shelter");
            System.out.println("2. Menampilkan Nama-nama Penduduk di semua Shelter");
            System.out.println("3. Nama-nama Penduduk suatu Shelter");

            System.out.print("OPSI:");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.println(A.getNamaShelter() + " " + A.getJumlahPenduduk());
                    System.out.println(B.getNamaShelter() + " " + B.getJumlahPenduduk());
                    System.out.println(C.getNamaShelter() + " " + C.getJumlahPenduduk());
                    break;
                case 2:
                    A.tampilPenduduk(A.getNamaShelter());
                    B.tampilPenduduk(A.getNamaShelter());
                    C.tampilPenduduk(A.getNamaShelter());
                    break;
                case 3:
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
                    System.out.println("2. B");

                    int h = in.nextInt();
                    switch (h) {
                        case 1:
                            A.tampilPenduduk(A.getNamaShelter());
                            break;
                        case 2:
                            B.tampilPenduduk(A.getNamaShelter());
                            break;
                        case 3:
                            C.tampilPenduduk(A.getNamaShelter());
                            break;
                    }
                    break;
                case 4:
                    int index;
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
  
                    switch (D) {
                        case 1:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + A.getPendudukbyIndex(index));
                            break;
                        case 2:
                            System.out.print("input index:");
      
                    }
                    break;
                case 5:
                    String nama;

                        case 1:
                            System.out.print("input nama:");
                            nama = in.next();
                            A.addPenduduk(nama);
                            break;
                        case 2:
                            System.out.print("input nama:");
                            nama = in.next();
                            B.addPenduduk(nama);
                            break;
                        case 3:
                            System.out.print("input nama:");
                            nama = in.next();
                            C.addPenduduk(nama);
                            break;
                    }
                    break;

            }

        }

    }
}
