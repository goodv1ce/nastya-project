package ua.goodvice.easylib.easylib.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.goodvice.easylib.easylib.communicator.RestBookCommunicator;
import ua.goodvice.easylib.easylib.entity.Book;

@Controller
@RequestMapping("/")
public class ViewController {
    @Autowired
    private RestBookCommunicator restBookCommunicator;

    @GetMapping("/")
    public String showStartPage() {
        return "index";
    }

    @GetMapping("/catalogue")
    public String showBookCatalogue(Model model) {
        model.addAttribute("bookList", restBookCommunicator.getAllBooks());
        return "catalogue";
    }

    @GetMapping("/donate")
    public String showDonationBookPage(Model model) {
        model.addAttribute("book", new Book());
        return "book-donation-page";
    }

    @PostMapping("/donate")
    public String addBookAndRedirect(@ModelAttribute Book book) throws JsonProcessingException {
        restBookCommunicator.addBook(book);
        return "redirect:/";
    }
}
