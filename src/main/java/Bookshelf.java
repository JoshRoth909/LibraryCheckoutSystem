import javax.persistence.*;
import java.util.List;

@Entity
public class Bookshelf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // add join column to Books model
    @OneToMany(mappedBy = "books")
    private List<Book> books;

    // add join column to Users model
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
