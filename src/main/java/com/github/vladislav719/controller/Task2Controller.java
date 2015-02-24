package com.github.vladislav719.controller;

import com.github.vladislav719.ez.DBConnection;
import com.github.vladislav719.model.vo.one.First;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 27.12.2014.
 */
@Controller
@RequestMapping(value = "task2")
public class Task2Controller{

    private Connection conn = DBConnection.getConnection();
    @RequestMapping(value = "/first")
    public String first(ModelMap model) {
        List<First> firsts = new ArrayList<First>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT \n" +
                    "  n_passport, KADASTR, max(DATE_DOC) as max_date, sum(SQUARE_FLAT) as square_flat\n" +
                    "  from FLAT LEFT JOIN BUILDING on KADASTR = FLAT.BUILDING_ID, OWNER, DOCUMENTS\n" +
                    "    GROUP BY  N_PASSPORT, KADASTR");
            while (resultSet.next()) {
                First first = new First();
                first.setDate(resultSet.getString("max_date"));
                first.setKadastr(resultSet.getString("kadastr"));
                first.setPassport(resultSet.getString("n_passport"));
                first.setSquare(resultSet.getString("square_flat"));
                firsts.add(first);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        model.addAttribute("userList", firsts);
        return "2/1";
    }

}
