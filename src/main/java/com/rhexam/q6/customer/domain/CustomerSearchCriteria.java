package com.rhexam.q6.customer.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhorton on 11/5/16.
 */
public class CustomerSearchCriteria {

    private int maxResultSetSize = 25;
    private List<SearchField> fields;

    public CustomerSearchCriteria(int maxRecords) {
        this.maxResultSetSize = maxRecords;
        this.fields = new ArrayList<SearchField>();
    }

    public int getMaxResultSetSize()
    {
        return maxResultSetSize;
    }

    public void setMaxResultSetSize(int pageSize)
    {
        this.maxResultSetSize = pageSize;
    }

    public void addSearchField(SearchField field) {
        this.fields.add(field);
    }

    public void removeSearchField(SearchField field) {
        this.fields.remove(field);
    }

    public List<SearchField> getFields() {
        return fields;
    }

    public void setFields(List<SearchField> fields) {
        this.fields = fields;
    }
    
}
