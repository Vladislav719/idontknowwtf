package com.github.vladislav719.model.vo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Владислав on 02.12.2014.
 */
@Entity
@Table
public class Documents {

    @Id
    @GeneratedValue
    @Column(name = "DOC_COD")
    private Integer docDoc;

    private Integer record;
    private String document;
    @Column(name = "DATE_DOC")
    private Date date;
    private Double part;



    public Documents() {
    }

    public Documents(Integer record, String document, Date date, Double part) {
        this.record = record;
        this.document = document;
        this.date = date;
        this.part = part;
    }

    public Integer getDocDoc() {
        return docDoc;
    }

    public void setDocDoc(Integer docDoc) {
        this.docDoc = docDoc;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPart() {
        return part;
    }

    public void setPart(Double part) {
        this.part = part;
    }
}
