package lesson_3_1_inheritance.task_1.mover;

import lesson_3_1_inheritance.task_1.Book;
import lesson_3_1_inheritance.task_1.Status;

public class FromArchivedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "Перевод книги из статуса `X` в статус `Y` невозможен";
        if (book.getStatus() != Status.ARCHIVED) {
            System.out.println(errorMessage);
            return;
        }
        if (requestedStatus == Status.AVAILABLE) {
            book.setStatus(Status.AVAILABLE);
        } else {
            System.out.println(errorMessage);
        }
    }
}