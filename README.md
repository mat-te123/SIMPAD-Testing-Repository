# Step By Step

1. **Clone Repository**

   Untuk tahap pertama, bisa dengan menuju folder dimana project ingin dijalankan. Sebagai contoh:

   ![Contoh direktori clone](image/img.png)

    selanjutnya, bisa membuka terminal dengan klik kanan dan pilih opsi **Open in Terminal**

    ![img.png](image/img_2.png)

    selanjutnya, dapat melakukan cloning untuk repository ini, dengan dengan detail perintah sebagai berikut 

    ```bash
   git clone https://github.com/mat-te123/SIMPAD-Testing-Repository.git
   ```
   pastikan sudha terinstall git di perangkat.
2. **Menjalankan project**
   
   Buka Aplikasi intellij, pada pojok kiri aplikasi. pilih opsi open.

   ![img.png](image/img_3.png)

   selanjutnya plih folder, dimana aplikasi diclone. sebagai contoh

   ![img.png](image/img_4.png)

   selanjutnya, kita dapat melakukan testing apa kode berhasil di clone dengan menjalankan kode pada file /test/Main

   ```java
       @Test
    public void WebTesting(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://simpad-frontend.vercel.app/");
        WebElement Hero = driver.findElement(By.id("Upper"));

        if(Hero.isDisplayed() && Hero.isEnabled()){
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }
   ```
   
   jika output aplikasi **Success maka aplikasi berhasil di clone dan berjalan**

3. **Membuat branch baru**

   >[!WARNING]
   > Tahap ini Sangat crucial agar tidak terjadi conflict
   
   unutk membuat branch baru, dapat dengan memilih menu di pojok kiri atas. saat pertama kali clone nama branch
   akan bertuliskan main
   
   ![membuat branch](/image/img_5.png)

   selanjutnya, dapat menamakan branch berdasarkan fitur yang dibuat. sebagai conothr branch ini akan bertindak sebagai
   backup

   ![menamai branch](/image/img_6.png)


   jika sudah, pada pojok kiri nama akan berubah menjadi nama branch yang sudah kita buat, selanutnya kita dapat menamba
   hkan baris baru pada file /test/main sebagai penanda jika ini adalah branch baru.

   ```java
       @Test
public void BranchTesting(){
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://simpad-frontend.vercel.app/");
   WebElement Hero = driver.findElement(By.id("Upper"));

   if(Hero.isDisplayed() && Hero.isEnabled()){
      System.out.println("Edan");
   } else {
      System.out.println("Error Lek");
   }
}
   ```

   selanjutnya kita dapat melakukan commit dan push. untuk melakukan commit dapat diakses melalui menu kiri dibawah ikon
   folder.

   ![img.png](image/img_8.png)

   selanjutnya dapat menuliskkan pesan kommit apapun dan pilih menu commit and push. seanjutnya, akan muncul menu baru 
   unutk konfirmasi terkait push

   ![push](/image/img_7.png)

   seperti yang dapat diihat kita akan melkukan push pada branch backup_branch.



   
   
   
   
