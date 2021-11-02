package com.zx.bookms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bean.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author cqmaple
 * @since 2021-11-02
 */
@RestController   //@Controller @ResponseBody
@RequestMapping("/book/")
public class BookController {
    @Autowired  //注入bean
    private BookService bookService;

    // http://localhost:8080/book/all/1/5
    @RequestMapping("all/{cur}/{size}")
    public Page<Book> showAll(@PathVariable("cur") Integer cur, @PathVariable("size") Integer size) {
        Page<Book> page = new Page<Book>(cur, size);
        Page<Book> pageInfo = bookService.page(page);
        return pageInfo;
    }

    @RequestMapping("find/{bid}")
    public Book details(@PathVariable("bid") Integer bid) {
        Book book = bookService.getById(bid);
        return book;
    }

    @RequestMapping("del/{bid}")
    public boolean del(@PathVariable("bid") Integer bid) {
        boolean flag = bookService.removeById(bid);
        return flag;
    }
    //  @RequestBody  接收 一个json格式的对象  {"bookNum":"1","bookName":"xxx",... }
    @RequestMapping("add")
    public boolean save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return flag;
    }

    @RequestMapping("update")
    public boolean update(@RequestBody Book book) {
        boolean flag = bookService.updateById(book);
        return flag;
    }
}

