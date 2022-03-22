package com.company.kinoxpbackend.services;

import com.company.kinoxpbackend.exceptions.ShowNotFoundException;
import com.company.kinoxpbackend.models.Show;
import com.company.kinoxpbackend.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    private final ShowRepository showRepository;

    @Autowired
    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public Show createShow(Show show) {
        return showRepository.save(show);
    }

    public Show findByid(Long id) throws ShowNotFoundException {

        return showRepository.findById(id).orElseThrow(() -> new ShowNotFoundException("Show Not Found"));
    }

    public List<Show> getShows() {
        return showRepository.getShowsByDate().orElseThrow(() -> new IllegalArgumentException("Error"));
    }

    public Show editShow(Show show) {
        return showRepository.save(show);
    }

    public void deleteShow(Long id) {
        showRepository.deleteById(id);
    }

    public List<Show> getShowsByMovieId(Long id) {
        return showRepository.getShowsByMovieId(id);
    }
}
