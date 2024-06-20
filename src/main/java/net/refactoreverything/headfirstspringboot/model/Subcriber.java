package net.refactoreverything.headfirstspringboot.model;

public class Subcriber {
    int subcriberId;
    String subcriberEmail;
    String subcriberName;

    public String getSubcriberName() {
        return subcriberName;
    }

    public void setSubcriberName(String subcriberName) {
        this.subcriberName = subcriberName;
    }

    public String getSubcriberEmail() {
        return subcriberEmail;
    }

    public void setSubcriberEmail(String subcriberEmail) {
        this.subcriberEmail = subcriberEmail;
    }

    public int getSubcriberId() {
        return subcriberId;
    }

    public void setSubcriberId(int subcriberId) {
        this.subcriberId = subcriberId;
    }

    @Override
    public String toString() {
        return "Subcriber{subcriberId=" + subcriberId + ", subcriberName=" + subcriberName + ", subcriberEmail=" + subcriberEmail + '}';
    }
}
