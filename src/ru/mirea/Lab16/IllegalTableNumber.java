package ru.mirea.Lab16;

class IllegalTableNumber extends RuntimeException {
    IllegalTableNumber(int numberOfTable){
        super("Can`t find table with number " + numberOfTable + ".");
    }
}
