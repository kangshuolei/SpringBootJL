package com.xiaokang.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MsgList<T> {
    @JsonProperty("Rows")
    private List<T> rows;
    @JsonProperty("Total")
    private Integer total;


    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
