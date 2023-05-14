package xyz.clipboard.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.clipboard.engine.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
