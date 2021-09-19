package com.relevel.bookingdotcom.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Listing {

    @Id
    private long listing_id;
}
