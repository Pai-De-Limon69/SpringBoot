import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}

public interface UserRepository extends JpaRepository<User, Integer> {
}

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
