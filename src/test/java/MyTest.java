import com.ncj.pojo.Books;
import com.ncj.service.BookService;
import com.ncj.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        List<Books> books = bookServiceImpl.queryAllBooks();
        System.out.println(books);
    }
}
