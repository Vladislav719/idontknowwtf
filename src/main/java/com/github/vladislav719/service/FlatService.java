package com.github.vladislav719.service;

import com.github.vladislav719.model.vo.Flat;

import java.util.List;

/**
 * Created by Владислав on 02.12.2014.
 */
public interface FlatService {
    public List<Flat> flats(Double wear, String district);
    public List flats();
}
