package mapper;

import com.BookmsApplication;
import com.bean.Book;
import com.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BookmsApplication.class)
class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test1() {

        Book book = bookMapper.selectById(1);
        System.out.println(book);

    }
}