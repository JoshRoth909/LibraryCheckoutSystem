import javax.persistence.*;

@Entity
public class Bookshelf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Bookshelf() {}

    public long getId() {
        return id;
    }
    @OneToOne(mappedBy = "user_id")
    private Users users;

    public long getUser_id() {
        return user_id;
    }

    @OneToMany(mappedBy = "book_id")
    private Books book;

    public long getBook() {
        return book_id;
    }
}
