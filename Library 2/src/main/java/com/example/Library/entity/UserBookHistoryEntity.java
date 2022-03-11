package com.example.Library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="userbookhistory")
public class UserBookHistoryEntity {
    @NotNull
    @Id
    private Integer userid;

    @NotNull
    private Integer bookid;

    private Date startdate;
    private Date enddate;

    public UserBookHistoryEntity(){

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

    public UserBookHistoryEntity(@NotNull Integer userid, Integer bookid, Date startdate, Date enddate) {
        this.userid = userid;
        this.bookid = bookid;
        this.startdate = startdate;
        this.enddate = enddate;
    }
}
