import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;
import seminars.fourth.book.InMemoryBookRepository;

public class BookServiceTest {

    private BookRepository mokedBookRepository;
    private BookService bookService;
    private InMemoryBookRepository inMemoryBookRepository;

    @BeforeEach
    public void init(){
        // перед каждым тестом создаем фиктивную реализацию интерфейса BookRepository
        mokedBookRepository = Mockito.mock(BookRepository.class);

        //Создаем тестовый репозиторий
        inMemoryBookRepository = new InMemoryBookRepository();

        //Мокируем методы интерфейса
        Mockito.when(mokedBookRepository.findAll()).thenReturn(inMemoryBookRepository.findAll());
        Mockito.when(mokedBookRepository.findById("1")).thenReturn(inMemoryBookRepository.findById("1"));
        Mockito.when(mokedBookRepository.findById("2")).thenReturn(inMemoryBookRepository.findById("2"));

        //Создаем новый экземпляр тестируемого класса BookService, которому подсовываем mock BookRepository
        bookService = new BookService(mokedBookRepository);
    }

    @Test
    public void testFindAllBooks(){
        //Проверяем, что метод BookService.findAllBooks вернет все книги из тестового репозитория
        assertThat(bookService.findAllBooks().size()).isEqualTo(inMemoryBookRepository.findAll().size());
    }

    @Test
    public void testFindBookById(){
        //Проверяем, что метод BookService.findBookById возвращает из репозитория правильные книги
        assertThat(bookService.findBookById("1")).isEqualTo(inMemoryBookRepository.findById("1"));
        assertThat(bookService.findBookById("2")).isEqualTo(inMemoryBookRepository.findById("2"));
    }



}
