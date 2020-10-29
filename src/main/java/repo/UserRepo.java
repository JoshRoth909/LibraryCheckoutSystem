package repo;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<user, Long> {
}
