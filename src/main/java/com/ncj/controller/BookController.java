package com.ncj.controller;

import com.ncj.pojo.Books;
import com.ncj.service.BookService;
import com.ncj.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("books",books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books book){
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id,Model model){
        Books books = bookService.queryBookById(id);
        if (books != null){
            model.addAttribute("book",books);
        }
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book){
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Integer id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }
}
