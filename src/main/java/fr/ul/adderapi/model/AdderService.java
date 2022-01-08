package fr.ul.adderapi.model;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdderService {
    private int value;

    public AdderService(){
        Random r = new Random();
        this.value = r.nextInt();
    }

    public AdderService(int v){
        this.value = v;
    }

    public int add(int adder){
        return this.value + adder;
    }

    public int accumulate(int adder){
        return this.value+=adder;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
