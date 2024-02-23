/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Model;

import java.util.Date;

/**
 *
 * @author josh
 */
public class courtEvent {

    private Date date;
    private String time;
    private int courtId;
    private String judge;

    public courtEvent(Date date, String time, int courtId, String judge) {
        this.date = date;
        this.time = time;
        this.courtId = courtId;
        this.judge = judge;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCourtId() {
        return courtId;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

}
