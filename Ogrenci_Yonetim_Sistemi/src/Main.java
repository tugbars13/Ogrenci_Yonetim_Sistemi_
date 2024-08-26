import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                System.out.println("!ÖĞRENCİ OTOMASYONUNA HOŞGELDİNİZ!");
                System.out.println("**********************************");

                while (true) {
                    System.out.println("1. Öğrenci Ekle");
                    System.out.println("2. Öğrenci Sil");
                    System.out.println("3. Öğrenci Güncelle");
                    System.out.println("4. Öğrenci Bilgilerini Göster");
                    System.out.println("5. Notları Göster");
                    System.out.println("6. Ortalama Hesapla");
                    System.out.println("7. Çıkış");
                    System.out.print("Lütfen bir işlem seçiniz: ");
                    Scanner scanner = new Scanner(System.in);
                    int secim = scanner.nextInt();
                    scanner.nextLine();

                    switch (secim) {
                        case 1:
                            ogrenciEkle();
                            break;
                        case 2:
                            ogrenciSil();
                            break;
                        case 3:
                            ogrenciGuncelle();
                            break;
                        case 4:
                            ogrenciBilgileriniGoster();
                            break;
                        case 5:
                            notlariGoster();
                            break;
                        case 6:
                            ortalamaHesapla();
                            break;
                        case 7:
                            System.out.println("Çıkılıyor...");
                            return;
                        default:
                            System.out.println("Geçersiz seçim, tekrar deneyin.");
                    }
                }
            }

            public static void ogrenciEkle() {
                System.out.print("Öğrenci ID: ");
                Scanner scanner = new Scanner(System.in);
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Öğrenci Adı: ");
                String ad = scanner.nextLine();
                System.out.print("Öğrenci Soyadı: ");
                String soyad = scanner.nextLine();
                Ogrenci ogrenci = new Ogrenci(ad, soyad, id);
                OgrenciYonetimSistemi ogrenciYonetimSistemi= new OgrenciYonetimSistemi();
                ogrenciYonetimSistemi.addStudent(ogrenci);
                System.out.println("Öğrenci eklendi.");
            }

            private static void ogrenciSil() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Silinecek Öğrenci ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme
                OgrenciYonetimSistemi ogrenciYonetimSistemi= new OgrenciYonetimSistemi();
                ogrenciYonetimSistemi.deleteStudent(id);
                System.out.println("Öğrenci silindi.");
            }

            private static void ogrenciGuncelle() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Güncellenecek Öğrenci ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme
                System.out.print("Yeni Ad: ");
                String yeniAd = scanner.nextLine();
                System.out.print("Yeni Soyad: ");
                String yeniSoyad = scanner.nextLine();
                OgrenciYonetimSistemi ogrenciYonetimSistemi= new OgrenciYonetimSistemi();
                ogrenciYonetimSistemi.updateStudent(id,yeniAd,yeniSoyad);
                System.out.println("Öğrenci bilgileri güncellendi.");
            }

            private static void ogrenciBilgileriniGoster() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Gösterilecek Öğrenci ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme
                OgrenciYonetimSistemi ogrenciYonetimSistemi= new OgrenciYonetimSistemi();
                ogrenciYonetimSistemi.showStudent(id);
            }

            private static void notlariGoster() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Notları Gösterilecek Öğrenci ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme
                OgrenciYonetimSistemi ogrenciYonetimSistemi= new OgrenciYonetimSistemi();
                ogrenciYonetimSistemi.showNotes(id);
            }

            private static void ortalamaHesapla() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ortalama Hesaplanacak Öğrenci ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme
                OgrenciYonetimSistemi ogrenciYonetimSistemi= new OgrenciYonetimSistemi();
                ogrenciYonetimSistemi.average(id);
            }
        }



