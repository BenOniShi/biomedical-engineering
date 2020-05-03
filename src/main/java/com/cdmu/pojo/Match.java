package com.cdmu.pojo;

import java.io.Serializable;

public class Match implements Serializable {
    private Integer id;

    private String matchName;

    private String matchTheme;

    private String matchSession;

    private String matchType;

    private String matchPlace;

    private String enrollDate;

    private String matchDate;

    private String matchHost;

    private String matchUndertake;

    private String matchNumber;

    private String matchRequirement;

    private String matchIntroduce;

    private String matchState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    public String getMatchTheme() {
        return matchTheme;
    }

    public void setMatchTheme(String matchTheme) {
        this.matchTheme = matchTheme == null ? null : matchTheme.trim();
    }

    public String getMatchSession() {
        return matchSession;
    }

    public void setMatchSession(String matchSession) {
        this.matchSession = matchSession == null ? null : matchSession.trim();
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType == null ? null : matchType.trim();
    }

    public String getMatchPlace() {
        return matchPlace;
    }

    public void setMatchPlace(String matchPlace) {
        this.matchPlace = matchPlace == null ? null : matchPlace.trim();
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate == null ? null : enrollDate.trim();
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate == null ? null : matchDate.trim();
    }

    public String getMatchHost() {
        return matchHost;
    }

    public void setMatchHost(String matchHost) {
        this.matchHost = matchHost == null ? null : matchHost.trim();
    }

    public String getMatchUndertake() {
        return matchUndertake;
    }

    public void setMatchUndertake(String matchUndertake) {
        this.matchUndertake = matchUndertake == null ? null : matchUndertake.trim();
    }

    public String getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber == null ? null : matchNumber.trim();
    }

    public String getMatchRequirement() {
        return matchRequirement;
    }

    public void setMatchRequirement(String matchRequirement) {
        this.matchRequirement = matchRequirement == null ? null : matchRequirement.trim();
    }

    public String getMatchIntroduce() {
        return matchIntroduce;
    }

    public void setMatchIntroduce(String matchIntroduce) {
        this.matchIntroduce = matchIntroduce == null ? null : matchIntroduce.trim();
    }

    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState == null ? null : matchState.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", matchName=").append(matchName);
        sb.append(", matchTheme=").append(matchTheme);
        sb.append(", matchSession=").append(matchSession);
        sb.append(", matchType=").append(matchType);
        sb.append(", matchPlace=").append(matchPlace);
        sb.append(", enrollDate=").append(enrollDate);
        sb.append(", matchDate=").append(matchDate);
        sb.append(", matchHost=").append(matchHost);
        sb.append(", matchUndertake=").append(matchUndertake);
        sb.append(", matchNumber=").append(matchNumber);
        sb.append(", matchRequirement=").append(matchRequirement);
        sb.append(", matchIntroduce=").append(matchIntroduce);
        sb.append(", matchState=").append(matchState);
        sb.append("]");
        return sb.toString();
    }
}