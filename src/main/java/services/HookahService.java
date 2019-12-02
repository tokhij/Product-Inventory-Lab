package services;

import models.Hookah;

import java.util.ArrayList;
import java.util.List;

public class HookahService {

    private static Integer nextId = 1;  // (1)

    public List<Hookah> inventory = new ArrayList<>(); //2


//1. A create method that will accept arguments and return a new Sneaker instance.
    public Hookah create(String brand, String size) {
//2. Make a new Sneaker instance and pass the values receive from the line above into the constructor.
        nextId++;
        Hookah createdHookah = new Hookah(nextId, brand, size);
//3. Add the new sneaker to the ArrayList to be managed.
        inventory.add(createdHookah);
//4. Return the new object to the caller.
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


