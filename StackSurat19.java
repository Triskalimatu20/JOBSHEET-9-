/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author triska
 */
public class StackSurat19 {
    Surat19[] stack;
    int top;

    public StackSurat19(int size) {
        stack = new Surat19[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(Surat19 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat baru.");
        }
    }

    public Surat19 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong, tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampil();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}

