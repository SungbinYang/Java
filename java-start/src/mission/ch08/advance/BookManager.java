package mission.ch08.advance;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private static final ArrayList<Book> BOOKS = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. 도서 등록\n2. 도서 조회\n3. 도서 삭제\n4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    SCANNER.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    private static void addBook() {
        System.out.print("도서 제목을 입력하세요: ");
        String title = SCANNER.nextLine();

        System.out.print("도서 저자를 입력하세요: ");
        String author = SCANNER.nextLine();

        BOOKS.add(new Book(title, author));
        System.out.println("도서가 등록되었습니다.");
    }

    private static void viewBooks() {
        if (BOOKS.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            System.out.println("현재 등록된 도서 목록:");

            for (Book book : BOOKS) {
                System.out.println(book);
            }
        }
    }

    private static void deleteBook() {
        System.out.print("삭제할 도서 제목을 입력하세요: ");
        String title = SCANNER.nextLine();
        boolean found = false;

        for (int i = 0; i < BOOKS.size(); i++) {
            if (BOOKS.get(i).getTitle().equalsIgnoreCase(title)) {
                BOOKS.remove(i);
                System.out.println("도서가 삭제되었습니다.");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 제목의 도서를 찾을 수 없습니다.");
        }
    }
}
