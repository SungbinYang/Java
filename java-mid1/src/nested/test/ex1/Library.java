package nested.test.ex1;

public class Library {

    private Book[] books;

    private int numOfBooks;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (numOfBooks < books.length) { // 처음에 반복문으로 해결볼려고 했음..
            books[numOfBooks++] = new Book(title, author);
            return;
        }

        System.out.println("도서관 저장 공간이 부족합니다.");
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println(book); // 정답은 여기서 toString을 구현함.
        }
    }

    private static class Book { // static은 전혀 생각 못함. 인텔리제이 도움 받음
        private String title;

        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + title + ", 저자: " + author;
        }
    }
}
