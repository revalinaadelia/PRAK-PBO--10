# PRAKTIKUM 10 (STUDI KASUS ATM)

## Menambahkan Fitur Ubah Pin dan Validasi Saldo Minimal 

- import com.atm.model.Account = Mengimpor class Account dari package com.atm.model.
- import com.atm.transaction.* = Mengimpor semua class pada package com.atm.transaction.*.
- import java.util.HashMap = Mengimpor class java untuk menyimpan data.
- import java.util.Map = Mengimpor class java untuk mendifinisikan struktur data.
- import java.util.Scanner = Mengimpor class java untuk melakukan inputan.

## Menambahkan Fitur Ubah Pin

Fitur ubah pin terdapat pada file Account.java, dengan cara membuat sebuah method baru bernama public void changePin. Method ini digunakan untuk mengubah PIN melalui verifikasi PIN lama, kemudian PIN baru sebanyak dua kali untuk melakukan konfirmasi. Jika terdapat kesalahan pada konfirmasi atau tidak sesuai dengan PIN baru, maka dilakukan konfirmasi ulang. Setelah itu login ulang dengan memasukkan nomor akun dan pin baru.

![image](https://github.com/user-attachments/assets/b78dc39a-d899-4d8f-96ed-a77b33230270)

![image](https://github.com/user-attachments/assets/ae8b918f-5ae1-40d2-bc6a-3811e9e260c5)

![image](https://github.com/user-attachments/assets/a72336c8-5cbe-471f-8ad7-ef594341063b)

Hasil Output :
![image](https://github.com/user-attachments/assets/59a53c43-e473-4f42-8359-6a2192113e55)

## Validasi Saldo Minimal

Validasi saldo minimal dengan menetapkan saldo minimal sebesar Rp. 50.000 pada file Withdrawal.java. Pada file ini ditambahkan private static final double MINIMUM_BALANCE = 50000, dengan arti konstanta tidak dapat diubah atau seseorang tidak dapat menarik uang jika hanya sebesar 50000 bahkan di bawah 50000. Penarikan hanya dapat dilakukan jika lebih dari 50000. Apabila kondisi tersebut terjadi dalam penarikan, maka mesin ATM akan menampilkan pesan ("Saldo tidak mencukupi untuk penarikan dengan saldo minimal Rp50,000").

![image](https://github.com/user-attachments/assets/305f485e-db26-4089-a091-a228c6dacda6)

Hasil Output :
![image](https://github.com/user-attachments/assets/004e41d2-9151-4432-9538-b263d806bb86)

Adanya penambahan fitur ubah pin dan validasi saldo minimal, maka ada penambahan case pada method showMenu di public class ATM pada file ATM.java

![image](https://github.com/user-attachments/assets/1f240ae0-8ffd-4cce-b4f2-498061d04759)

![image](https://github.com/user-attachments/assets/99d8a37b-8eb9-48eb-a5c1-763e6f05923b)

![image](https://github.com/user-attachments/assets/8f0c32a3-3061-4b8c-97b9-bc1630511944)

## Source Code

Account.java
![image](https://github.com/user-attachments/assets/726ed20b-72da-447b-bcc1-f3c47fd2da0f)

Deposit.java
![image](https://github.com/user-attachments/assets/04682070-e56c-4ac2-af84-61a5e17220a3)

Transfer.java
![image](https://github.com/user-attachments/assets/e5380052-f975-48bf-834f-b211ca0b23c3)

Transaction.java
![image](https://github.com/user-attachments/assets/d18e1afd-6cee-43d9-b787-d19eeeaff4f4)

Main.java
![image](https://github.com/user-attachments/assets/d1135313-0acb-4271-af0f-1fc33bb4c31f)













