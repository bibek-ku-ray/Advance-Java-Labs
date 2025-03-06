package com.bibek.marksheetMVC;

public class MarksheetModel {
    private double ootMarks;
    private double oopMarks;
    private double dbMarks;

    public void setOotMarks(double ootMarks) {
        this.ootMarks = ootMarks;
    }

    public void setOopMarks(double oopMarks) {
        this.oopMarks = oopMarks;
    }

    public void setDbMarks(double dbMarks) {
        this.dbMarks = dbMarks;
    }

    public double getTotalMarks() {
        return ootMarks + oopMarks + dbMarks;
    }

    public double getTotalPercentage() {
        return (getTotalMarks() / 300) * 100;
    }

    public String getDivision() {
        double percentage = getTotalPercentage();
        if (percentage >= 70) {
            return "1st";
        } else if (percentage >= 50) {
            return "2nd";
        } else if (percentage >= 35) {
            return "3rd";
        } else {
            return "Fail";
        }
    }

    public String getResult() {
        return getTotalPercentage() >= 35 ? "PASS" : "FAIL";
    }
}
