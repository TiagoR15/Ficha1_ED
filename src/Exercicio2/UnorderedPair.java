/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author tiago
 */
public class UnorderedPair<T extends Comparable> extends Pair<T> {

    public UnorderedPair(T first, T second) {
        super(first, second);
    }

    public UnorderedPair() {
    }
    
    public boolean equalElements(){
        if(getFirst() == getSecond()){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            UnorderedPair<T> otherPair
                    = (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst())
                    && getSecond().equals(otherPair.getSecond()))
                    || (getFirst().equals(otherPair.getSecond())
                    && getSecond().equals(otherPair.getFirst()));
        }
    }
}
