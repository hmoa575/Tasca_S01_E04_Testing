package level01.controlexception;

public class Main {
    public static void main(String[] args){
        ControlExceptionArray listNumbers = new ControlExceptionArray();

        listNumbers.addNumber(1);
        listNumbers.addNumber(2);
        listNumbers.addNumber(3);
        listNumbers.addNumber(4);
        listNumbers.addNumber(5);

        listNumbers.getList().forEach(System.out::println);

        listNumbers.triggerArrayIndexOutOfBoundsException(10);
    }

}
