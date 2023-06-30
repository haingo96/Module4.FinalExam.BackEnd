//package com.example.restpractice1.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class RentController {
//
//    @Autowired
//    private IBookService iBookService;
//    @GetMapping("/books")
//    public ResponseEntity<List<Book>> index() {
//        List<Book> books = iBookService.findAll();
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("cong", "nghien");
//
//        if (books.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }else {
//            return new ResponseEntity<>(books, httpHeaders, HttpStatus.OK);
//        }
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<List<Book>> add(@RequestBody Book book) {
//        iBookService.save(book);
//        List<Book> books = iBookService.findAll();
//        if (books.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }else {
//            return new ResponseEntity<>(books, HttpStatus.OK);
//        }
//    }
//
//    @PutMapping("/edit")
//    public ResponseEntity<List<Book>> edit(@RequestBody Book book) {
//        Book matchBook = iBookService.findById(book.getBookId());
//        matchBook.setBookName(book.getBookName());
//        matchBook.setQuantity(book.getQuantity());
//        iBookService.save(matchBook);
//
//        iBookService.save(book);
//
//        List<Book> books = iBookService.findAll();
//        if (books.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }else {
//            return new ResponseEntity<>(books, HttpStatus.OK);
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<List<Book>> delete(@PathVariable Long id) {
//        iBookService.delete(iBookService.findById(id));
//
//        List<Book> books = iBookService.findAll();
//        if (books.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }else {
//            return new ResponseEntity<>(books, HttpStatus.OK);
//        }
//    }
//
//    @GetMapping("/detail")
//    public String detail(@RequestParam Long id) {
//        Book book = iBookService.findById(id);
////
////        if (book == null) {
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
////        }else {
////            return new ResponseEntity<>(book, HttpStatus.OK);
////        }
//
//        return book.toString();
//    }
//}
