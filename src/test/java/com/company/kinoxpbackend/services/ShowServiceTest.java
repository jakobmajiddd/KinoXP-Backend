package com.company.kinoxpbackend.services;

import com.company.kinoxpbackend.exceptions.ShowNotFoundException;
import com.company.kinoxpbackend.models.Show;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShowServiceTest {

    private final ShowService showService;

    @Autowired
    public ShowServiceTest(ShowService showService) {
        this.showService = showService;
    }

    @Test
    public void createShow() throws ShowNotFoundException {
        Show testShow = new Show();

        Show show = showService.createShow(testShow);
        Long id = show.getShowId();

        Show foundUser = showService.findByid(id);

        assertNotNull(foundUser);
    }
}
