package controlexception;

import java.util.ArrayList;
import java.util.List;

public class ControlExceptionArray {
    //Attributes
    private List<Integer> numbersList;
    //Constructor
    public ControlExceptionArray(){
        this.numbersList = new ArrayList<>();
    }
    public void addNumber(int number){
        numbersList.add(number);
    }
    public List<Integer> getList(){
        return  numbersList;
    }

    public int triggerArrayIndexOutOfBoundsException(int position) {
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers[position];
    }
}
