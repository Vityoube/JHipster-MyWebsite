package org.vkalashnykov.jhipster_mywebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vkalashnykov.jhipster_mywebsite.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
