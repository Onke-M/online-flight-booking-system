package entelect.training.incubator.spring.booking.bookingservice.controller;

import entelect.training.incubator.spring.booking.bookingservice.model.BookingRequest;
import entelect.training.incubator.spring.booking.bookingservice.model.BookingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookings")
public class BookingController {

    @GetMapping("{id}")
    public ResponseEntity<BookingResponse> getBookingById (@PathVariable Long bookingId) {
        return ResponseEntity.ok(new BookingResponse());
    }

    @PostMapping()
    public ResponseEntity<BookingResponse> makeBooking (@RequestBody BookingRequest bookingRequest){
        return ResponseEntity.ok(new BookingResponse());
    }

    @PostMapping("/search")
    public ResponseEntity<List<BookingResponse>> getAllBookings (@RequestBody Long customerId) {
        return ResponseEntity.ok(List.of(new BookingResponse()));
    }

    @PostMapping("/search")
    public ResponseEntity<BookingResponse> getBookingByReferenceNumber (@RequestBody String referenceNumber) {
        return ResponseEntity.ok(new BookingResponse());
    }

}
