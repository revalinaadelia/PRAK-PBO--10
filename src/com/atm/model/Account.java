package com.atm.model;

import java.util.Scanner;

public class Account {

    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    // Method to change PIN
    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan PIN lama Anda : ");
        String oldPin = scanner.nextLine();
        System.out.print("Masukan PIN baru Anda : ");
        String newPin = scanner.nextLine();
        System.out.print("Konfirmasi PIN baru Anda : ");
        String confirmationPin = scanner.nextLine();

        if (!newPin.equals(confirmationPin)) {
            System.out.println("PIN baru yang Anda masukkan tidak cocok");
            System.out.println("Silakan konfirmasi kembali PIN Anda.");
            System.out.print("Konfirmasi PIN baru Anda : ");
            confirmationPin = scanner.nextLine();
        }

        this.pin = newPin;
        System.out.println("PIN berhasil diperbarui!");

        System.out.println("\nSilakan login ulang untuk verifikasi.");
        System.out.print("Masukkan Nomor Akun Anda : ");
        String newAccount = scanner.nextLine();
        System.out.print("Masukkan PIN Anda : ");
        String confirmPin = scanner.nextLine();

        if (newAccount.equals(this.accountNumber) && confirmPin.equals(newPin)) {
            System.out.println("\nVerifikasi berhasil, silakan lanjutkan transaksi.");
        } else {
            System.out.println("\nVerifikasi gagal!");
            while (!confirmPin.equals(newPin)) {
                System.out.println("\nMaaf, PIN yang Anda masukkan tidak valid!");
                System.out.print("Masukkan PIN baru Anda : ");
                confirmPin = scanner.nextLine();
            }
        }
    }
}