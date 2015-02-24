package com.github.vladislav719.model.dao;

import com.github.vladislav719.model.vo.Flat;

import java.util.List;

/**
 * Created by Владислав on 02.12.2014.
 */
public interface FlatDAO {
    public List firstTask();
    public List<Flat> getAllFlats(Double wear, String district);
}
