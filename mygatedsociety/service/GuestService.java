package com.example.mygatedsociety.service;

import com.example.mygatedsociety.dto.GuestDto;
import com.example.mygatedsociety.enums.Status;
import java.util.List;

public interface GuestService {
    Status entry1(List<GuestDto> guests);

	Status entry(List<GuestDto> guests);

	Status entry11(List<GuestDto> guests);

	Status entry111(List<GuestDto> guests);
}

