import animal.Animal;

import java.util.Arrays;
import java.util.Scanner;

public class AnimalArrayList {
    private Animal[] arrayList;
    private int size;



    public AnimalArrayList(int initSize){
        arrayList = new Animal[initSize];
    }
    public AnimalArrayList(){
        arrayList = new Animal[10];
    }



    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }



    private void copyElementsFrom(Animal[] oldElements){
        for(int i = 0; i< oldElements.length;i++){
            arrayList[i] = oldElements[i];
        }
    }
    private void checkSize(int needCapacity){
        if ((double)needCapacity > (double)this.arrayList.length * 0.7) {
            Animal[] oldElements = this.arrayList;
            int newSize = this.size * 2;
            this.arrayList = new Animal[newSize];
            this.size = newSize;
            this.copyElementsFrom(oldElements);
        }
    }


    public boolean add(Animal element) {
        this.checkSize(this.size + 1);
        this.arrayList[this.size++] = element;
        return true;
    }

    private boolean checkRange(int index) {
        if (index >= 0 && index < this.size + 1) {
            return true;
        } else {
            System.out.println("INCORRECT INDEX: " + index);
            return false;
        }
    }



    public void set(int index, Animal element) {
        if (this.checkRange(index)) {
            this.arrayList[index] = element;
        }
    }



    public Animal get(int index) {
        return this.arrayList[index];
    }

    public void clear() {
        for(int i = 0; i < this.size; ++i) {
            this.arrayList[i] = null;
        }
        this.size = 0;
    }



    public String toString() {
        String var10000 = Arrays.toString(this.arrayList);
        return "CustomArrayList{elements=" + var10000 + ", size=" + this.size + "}";
    }





}
