package ua.goodvice.easylib.easylib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.goodvice.easylib.easylib.entity.Book;

/**
 * Interface extends JpaRepository interface which provides some basic
 * CRUD methods defined and implemented. Also, it provides very useful
 * tool - automatic generation of queries from methods names.
 *
 * @author goodvice
 * @version 1.0
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
}
