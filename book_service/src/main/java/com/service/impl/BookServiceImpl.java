package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.bean.Book;
import com.mapper.BookMapper;
import com.service.BookService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cqmaple
 * @since 2021-11-02
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
