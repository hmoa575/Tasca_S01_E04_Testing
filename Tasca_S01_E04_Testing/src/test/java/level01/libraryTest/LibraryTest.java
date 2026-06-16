package level01.libraryTest;

import level01.library.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void libraryShouldNotBeNullAfterCreation() {
        assertThat(library).isNotNull();
    }

    @Test
    void librarySizeShouldBeCorrectAfterAddingBooks() {
        library.addBook("The Lost Paradise");
        library.addBook("Romeo & Juliet");
        assertThat(library.size()).isEqualTo(2);
    }

    @Test
    void booksShouldBeAtExpectedPositionsWhenAdded() {
        library.addBook("First");
        library.addBook("Second");
        library.addBook("Third");
        assertThat(library.getBooks()).containsExactly("First", "Second", "Third");
    }

    @Test
    void getTitleByPositionShouldReturnCorrectTitle() {
        library.addBook("The Lost Paradise");
        library.addBook("Romeo & Juliet");
        library.addBook("Effective Java");
        library.addBook("Java Concurrency in Practice");
        String title = library.getBookByPosition(1);
        assertThat(title).isEqualTo("Romeo & Juliet");
    }

    @Test
    void removingBookByTitleShouldReduceSize() {
        library.addBook("Effective Java - To Keep");
        library.addBook("Java Concurrency - To Remove");
        boolean removed = library.removeBookByTitle("Java Concurrency - To Remove");
        assertThat(removed).isTrue();
        assertThat(library.size()).isEqualTo(1);
        assertThat(library.getBooks()).containsExactly("Effective Java - To Keep");
    }
    @Test
    void addingBookAtSpecificPositionShouldModifyCollection() {
        library.addBook("The Lost Paradise - Position A");
        library.addBook("Romeo & Juliet - Position C");
        library.addBookAtPosition("Pride and Prejudice - Position B", 1);
        assertThat(library.getBooks()).containsExactly("The Lost Paradise - Position A", "Pride and Prejudice - Position B", "Romeo & Juliet - Position C");
    }
    @Test
    void addingBookAtLastPositionShouldWork(){
        library.addBook("The Lost Paradise - Position A");
        library.addBook("Pride and Prejudice - Position B");
        library.addBook("Romeo & Juliet - Position C");
        library.addBookAtPosition("Hamlet = Position D", 3);
        assertThat(library.getBooks()).containsExactly("The Lost Paradise - Position A","Pride and Prejudice - Position B", "Romeo & Juliet - Position C", "Hamlet = Position D");
    }
    @Test
    void sortedListShouldBeAlphabeticalAndNotModifyOriginal(){
        library.addBook("Zebra");
        library.addBook("Apple");
        library.addBook("Monkey");
        library.addBook("Glass");
        library.addBook("Orange");
        List<String> sorted = library.getSortedList();
        assertThat(sorted).containsExactly("Apple","Glass","Monkey","Orange","Zebra");
        assertThat(library.getBooks()).containsExactly("Zebra","Apple","Monkey","Glass","Orange");
    }
    @Test
    void addBookAtInvalidPositionThrowsException(){
        library.addBook("Just me");
        assertThatThrownBy(() -> library.addBookAtPosition("Invalid", 9))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
    @Test
    void getBookByInvalidPositionThrowsException(){
        library.addBook("Just me");
        assertThatThrownBy(() -> library.getBookByPosition(9))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
    @Test
    void duplicateTitlesShouldNotBeAllowed(){
        library.addBook("Pride and Prejudice");
        library.addBook("Pride and Prejudice");
        assertThat(library.size()).isEqualTo(1);
        assertThat(library.getBooks()).containsExactly("Pride and Prejudice");
    }
}