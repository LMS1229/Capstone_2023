package Team.server.repository;

import Team.server.domain.Review;
import Team.server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    public Review deleteByRid(Long rid);

    List<Review> findByPhoneContaining(String phone_num);
    public Review findByRid(Long rid);

}
