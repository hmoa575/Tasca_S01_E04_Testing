package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    //Attributes
    private final List<String> BOOKS;

    //Constructor
    public Library() {
        this.BOOKS = new ArrayList<>();
    }

    //Getters and Setters
    public List<String> getBooks() {
        return new ArrayList<>(BOOKS);
    }

    //Exceptions
    public void validateTitle(String nameBook) {
        if (nameBook == null || nameBook.isBlank()) {
            throw new IllegalArgumentException("The tittle of the book cannot be empty/blank or null.");
        }
    }

    public void validatePosition(int position) {
        if (position < 0 || position >= BOOKS.size()) {
            throw new IndexOutOfBoundsException("The position " + position + " is not valid");
        }
    }

    //Methods
    public void addBook(String nameBook) {
        validateTitle(nameBook);
        if(!BOOKS.contains(nameBook)){
            BOOKS.add(nameBook);}
    }
    public String getBookByPosition(int position) {
        validatePosition(position);
        return BOOKS.get(position);
    }
    public void addBookAtPosition(String nameBook, int position) {
        validateTitle(nameBook);
        if (position < 0 || position > BOOKS.size()) {
            throw new IndexOutOfBoundsException("Position " + position + " is invalid. Must be between 0 and " + BOOKS.size());
        }
        BOOKS.add(position, nameBook);
    }
    public boolean removeBookByTitle(String nameBook) {
        validateTitle(nameBook);
        return BOOKS.remove(nameBook);
    }
    public List<String> getSortedList(){
        List<String> sortedBooks = new ArrayList<>(BOOKS);
        Collections.sort(sortedBooks);
        return sortedBooks;
    }
    public int size(){
        return BOOKS.size();
    }
}