import javax.persistence.*;

@Entity
public class Bookshelf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Bookshelf() {}

    public int getId() {
        return id;
    }
    @OneToOne(mappedBy = "user_id")
    private Users users;

    public int getUser_id() {
        return user_id;
    }

    @OneToOne(mappedBy = "book_id")
    private Books book;

    public int getBook() {
        return book_id;
    }
}
