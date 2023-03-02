package ua.goodvice.easylib.easylib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.goodvice.easylib.easylib.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
