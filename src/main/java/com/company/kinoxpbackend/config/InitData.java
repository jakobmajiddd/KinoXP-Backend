package com.company.kinoxpbackend.config;

import com.company.kinoxpbackend.models.*;
import com.company.kinoxpbackend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    ShowRepository showRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    SeatRepository seatRepository;
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setName("name");
        customer.setEmail("email");
        customerRepository.save(customer);

        System.out.println("HERE");
        Movie movie = new Movie();
        movie.setName("movie1");
        movie = movieRepository.save(movie);

        Room room = new Room();
        room.setName("A");
        room.setSeatAmount(20);
        roomRepository.save(room);

        Seat seat = new Seat();
        seat.setRoom(room);
        seatRepository.save(seat);

        Show show = new Show();
        show.setMovie(movie);
        showRepository.save(show);

        User user = new User();
        user.setPassword("123");
        user.setUsername("123");
        userRepository.save(user);

    }
}
