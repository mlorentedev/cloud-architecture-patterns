package es.urjc.code.daw.library.book;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

import es.urjc.code.daw.library.notification.NotificationService;
import es.urjc.code.daw.library.toggle.Features;

/* Este servicio se usará para incluir la funcionalidad que sea 
 * usada desde el BookRestController y el BookWebController
 */
@Service
public class BookService {

	private BookRepository repository;
	private NotificationService notificationService;
	private FeatureManager featureManager;
	private LineBreaker lineBreaker = new LineBreaker();

	public BookService(FeatureManager featureManager, BookRepository repository, NotificationService notificationService){
		this.featureManager = featureManager;
		this.repository = repository;
		this.notificationService = notificationService;
	}

	public Optional<Book> findOne(long id) {
		return repository.findById(id);
	}
	
	public boolean exist(long id) {
		return repository.existsById(id);
	}

	public List<Book> findAll() {
		return repository.findAll();
	}

	public Book save(Book book) {
		Book newBook = featureManager.isActive(Features.LINE_BREAKER) ? breakLines(book) : book;
		repository.save(newBook);
		notificationService.notify("Book Event: book with title="+newBook.getTitle()+" was created");
		return newBook;
	}

	public void delete(long id) {
		repository.deleteById(id);
		notificationService.notify("Book Event: book with id="+id+" was deleted");
	}

	public Book breakLines(Book book) {
		book.setDescription(this.lineBreaker.breakLine(book.getDescription(), 10));
		notificationService.notify("Book Event: book with title="+book.getTitle()+" was updated");
		return book;
	}
}
