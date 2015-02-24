package com.github.vladislav719.service.impl;

import com.github.vladislav719.model.dao.FlatDAO;
import com.github.vladislav719.model.vo.Flat;
import com.github.vladislav719.service.FlatService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Владислав on 02.12.2014.
 */
public class FlatServiceImpl implements FlatService {

    private FlatDAO flatDAO;

    public void setFlatDAO(FlatDAO flatDAO) {
        this.flatDAO = flatDAO;
    }

    public List flats() {
        return flatDAO.firstTask();
    }

    @Override
    public List<Flat> flats(Double wear, String district) {
        return null;
    }
}
