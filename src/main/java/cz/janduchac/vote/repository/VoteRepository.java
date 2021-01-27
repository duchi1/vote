package cz.janduchac.vote.repository;

import cz.janduchac.vote.model.Post;
import cz.janduchac.vote.model.User;
import cz.janduchac.vote.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
