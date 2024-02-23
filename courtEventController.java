/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Controller;

import java.util.Date;
import m02a02.Model.courtEvent;
import m02a02.View.courtEventView;

public class courtEventController {

    private courtEvent model;
    private courtEventView view;

    public courtEventController(courtEvent model, courtEventView view) {
        this.model = model;
        this.view = view;
    }

    public Date getDate() {
        return model.getDate();
    }

    public void setDate(Date date) {
        model.setDate(date);
    }

    public String getTime() {
        return model.getTime();
    }

    public void setTime(String time) {
        model.setTime(time);
    }

    public int getCourtId() {
        return model.getCourtId();
    }

    public void setCourtId(int courtId) {
        model.setCourtId(courtId);
    }

    public String getJudge() {
        return model.getJudge();
    }

    public void setJudge(String judge) {
        model.setJudge(judge);
    }

    public void updateCourtEventView() {
        view.showEventDetails(model.getDate(), model.getTime(), model.getCourtId(), model.getJudge());
    }
}
