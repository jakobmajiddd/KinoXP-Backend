package com.company.kinoxpbackend.repositories;

import com.company.kinoxpbackend.models.ReservedSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedSeatRepository extends JpaRepository<ReservedSeat, Long> {
}
