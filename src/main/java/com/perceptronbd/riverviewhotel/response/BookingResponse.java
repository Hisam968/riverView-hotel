package com.perceptronbd.riverviewhotel.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse{

    private Long bookingid;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guetEmail;
    private int NumofAdults;
    private int NumofChildren;
    private int TotalNumOfGuest;
    private String bookingConfirmationCoede;
    private RoomResponse room;

    public BookingResponse(Long bookingid, LocalDate checkInDate, LocalDate checkOutDate,
                           String bookingConfirmationCoede) {
        this.bookingid = bookingid;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCoede = bookingConfirmationCoede;
    }
}
