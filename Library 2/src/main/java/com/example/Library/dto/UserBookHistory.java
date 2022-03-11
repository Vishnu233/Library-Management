package com.example.Library.dto;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class UserBookHistory {

    @NotNull
    private Integer userid;
    private Integer bookid;

    private Date startdate;
    private Date enddate;

    public UserBookHistory(){

    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public UserBookHistory(@NotNull Integer userid, Integer bookid, Date startdate, Date enddate) {
        this.userid = userid;
        this.bookid = bookid;
        this.startdate = startdate;
        this.enddate = enddate;
    }
}
