package enemo.springframework.springwebapp.repositories;

import enemo.springframework.springwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository  extends CrudRepository<Publisher, Long> {
}
