/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author triska
 */
public class MStackTugasMahasiswa19 {
    MMahasiswa19[] stack;
    int top;
    int size;
    
    public MStackTugasMahasiswa19(int size) {
        this.size = size;
        stack = new MMahasiswa19[size];
        top = -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(MMahasiswa19 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    
    public MMahasiswa19 pop() {
        if (!isEmpty()) {
            MMahasiswa19 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    
    public MMahasiswa19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }   
    
    public void print() {
        for (int i = 0; i <= top; i++) {
            String nilaiTugas = (stack[i].nilai == -1) ? "Belum Dinilai" : String.valueOf(stack[i].nilai);
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" + nilaiTugas);
        }
        System.out.println("");
    }
    
    public MMahasiswa19 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    
    public int countTugas() {
    return top + 1; 
    }
}
