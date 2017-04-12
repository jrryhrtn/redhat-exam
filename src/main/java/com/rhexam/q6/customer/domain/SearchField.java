package com.rhexam.q6.customer.domain;

/**
 * Created by jhorton on 11/5/16.
 */
public class SearchField {

    public enum SortOrder {
        NONE,ASC,DSC
    }

    public enum FieldType {
        FIRST_NAME, LAST_NAME, STREET_ADDRESS_1, STREET_ADDRESS_2, CITY, STATE, ZIP
    }

    private SortOrder sortOrder;
    private FieldType fieldType;
    private String fieldValue;

    public SearchField(FieldType fieldType, String fieldValue) {
        this.fieldType = fieldType;
        this.fieldValue = fieldValue;
        this.sortOrder = SortOrder.NONE;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldName(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

}
