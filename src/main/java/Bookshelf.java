import javax.persistence.*;

@Entity
public class Bookshelf {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    @OneToOne(mappedBy = "book_id")
    private Long book;

    @OneToOne(mappedBy = "user_id")
    private Long id;
    private Users users;

    public Bookshelf() {}
    public long getId() {
        return id;
    }
    public long getBook() {
        return book_id;
    }
}
