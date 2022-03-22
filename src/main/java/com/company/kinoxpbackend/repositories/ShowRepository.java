package com.company.kinoxpbackend.repositories;

import com.company.kinoxpbackend.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

    @Query(value = "SELECT * FROM kinoxptestv1.shows " +
            "ORDER BY start_date", nativeQuery = true)
    Optional<List<Show>> getShowsByDate();

    @Query(value = "SELECT s" +
            " FROM Show s " +
            "WHERE s.movie.id = ?1")
    List<Show> getShowsByMovieId(Long id);
}
