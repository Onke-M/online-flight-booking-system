package entelect.training.incubator.spring.booking.bookingservice.repository;

import entelect.training.incubator.spring.booking.bookingservice.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

    Optional<Booking> findByBookingId(Long bookingId);
    Optional<List<Booking>> findAllByCustomerId(Long customerId);
    Optional<Booking> findByReferenceNumber(String referenceNumber);

}
