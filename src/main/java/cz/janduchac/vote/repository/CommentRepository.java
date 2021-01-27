package cz.janduchac.vote.repository;

import cz.janduchac.vote.model.Comment;
import cz.janduchac.vote.model.Post;
import cz.janduchac.vote.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
