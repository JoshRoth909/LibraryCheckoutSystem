import javax.persistence.*;
import java.util.List;

@Entity
public class Bookshelf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "books")
    private List<Book> books;

    @OneToOne(mappedBy = "users")
    private Users users;

    public Bookshelf() {}

    public Long getId() {
        return id;
    }

    public List<Book> getBook() {
        return books;
    }

}
