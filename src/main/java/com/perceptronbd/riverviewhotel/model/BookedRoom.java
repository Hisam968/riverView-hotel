package com.perceptronbd.riverviewhotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author Hisam Youhana
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookedRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingid;

    @Column(name = "check_in")
    private LocalDate checkInDate;

    @Column(name = "check_out")
    private LocalDate checkOutDate;

    @Column(name = "guest_FullName")
    private String guestFullName;

    @Column(name = "guest_Email")
    private String guetEmail;

    @Column(name = "adults")
    private int NumofAdults;

    @Column(name = "children")
    private int NumofChildren;

    @Column(name = "total_guest")
    private int TotalNumOfGuest;

    @Column(name = "conf_code")
    private String bookingConfirmationCoede;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "room_id")
    private Room room;

    public void calculateTotalNumberOfGuest(){
        this.TotalNumOfGuest = this.NumofAdults + NumofChildren;

    }

    public void setNumofAdults(int numofAdults) {
        NumofAdults = numofAdults;
        calculateTotalNumberOfGuest();
    }

    public void setNumofChildren(int numofChildren) {
        NumofChildren = numofChildren;
        calculateTotalNumberOfGuest();
    }

    public BookedRoom(String bookingConfirmationCoede) {
        this.bookingConfirmationCoede = bookingConfirmationCoede;
    }

}

