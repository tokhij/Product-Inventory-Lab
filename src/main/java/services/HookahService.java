package services;

import models.Hookah;

import java.util.ArrayList;
import java.util.List;

public class HookahService {

    private static Integer nextId = 1;  // (1)

    public List<Hookah> inventory = new ArrayList<>(); //2


    public Hookah create(String brand, String size) {
        nextId++;
        Hookah createdHookah = new Hookah(nextId, brand, size);
        inventory.add(createdHookah);
    return createdHookah;
    }

    public Hookah findHookahById(Integer id){
        for (Hookah eachHookah : inventory) {
            if(eachHookah.getId() == id){
                System.out.println(eachHookah.getId());

                return eachHookah;
            }
        }
        return null;
    }

    public Hookah[] findAll(){
        Hookah[] temp= new Hookah[inventory.size()];
        inventory.toArray(temp);
        return temp;
    }

    public boolean delete (Integer id){
        for (Hookah eachHookah : inventory) {
            inventory.remove(id);
            if(!eachHookah.getId().equals(id)){
                return true;
            }
        }
        return false;
    }


    }


