package ies.jandula.unidad2add.models;

import java.util.Date;

public class Competitions 
{
    private String competitionId;
    private String seasonId;
    private String countryName;
    private String competitionName;
    private String competitionGender;
    private String competitionYouth;
    private String competitionInternational;
    private String seasonName;
    private String matchUpdated;
    private String matchAvailable;
    private String matchUpdated360;
    private String matchAvailable360;

    /**
     * Default constructor.
     */
    public Competitions() 
    {
        super();
    }

	public Competitions(String string, String seasonId2, String countryName, String competitionName,
			String competitionGender, String competitionYouth, String competitionInternational, String seasonName,
			String matchUpdated, String matchAvailable, String matchUpdated360, String matchAvailable360) {
		super();
		this.competitionId = string;
		this.seasonId = seasonId2;
		this.countryName = countryName;
		this.competitionName = competitionName;
		this.competitionGender = competitionGender;
		this.competitionYouth = competitionYouth;
		this.competitionInternational = competitionInternational;
		this.seasonName = seasonName;
		this.matchUpdated = matchUpdated;
		this.matchAvailable = matchAvailable;
		this.matchUpdated360 = matchUpdated360;
		this.matchAvailable360 = matchAvailable360;
	}

	public String getCompetitionId() {
		return competitionId;
	}

	public void setCompetitionId(String competitionId) {
		this.competitionId = competitionId;
	}

	public String getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCompetitionName() {
		return competitionName;
	}

	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}

	public String getCompetitionGender() {
		return competitionGender;
	}

	public void setCompetitionGender(String competitionGender) {
		this.competitionGender = competitionGender;
	}

	public String getCompetitionYouth() {
		return competitionYouth;
	}

	public void setCompetitionYouth(String competitionYouth) {
		this.competitionYouth = competitionYouth;
	}

	public String getCompetitionInternational() {
		return competitionInternational;
	}

	public void setCompetitionInternational(String competitionInternational) {
		this.competitionInternational = competitionInternational;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public String getMatchUpdated() {
		return matchUpdated;
	}

	public void setMatchUpdated(String matchUpdated) {
		this.matchUpdated = matchUpdated;
	}

	public String getMatchAvailable() {
		return matchAvailable;
	}

	public void setMatchAvailable(String matchAvailable) {
		this.matchAvailable = matchAvailable;
	}

	public String getMatchUpdated360() {
		return matchUpdated360;
	}

	public void setMatchUpdated360(String matchUpdated360) {
		this.matchUpdated360 = matchUpdated360;
	}

	public String getMatchAvailable360() {
		return matchAvailable360;
	}

	public void setMatchAvailable360(String matchAvailable360) {
		this.matchAvailable360 = matchAvailable360;
	}

	@Override
	public String toString() {
		return "Competitions [competitionId=" + competitionId + ", seasonId=" + seasonId + ", countryName="
				+ countryName + ", competitionName=" + competitionName + ", competitionGender=" + competitionGender
				+ ", competitionYouth=" + competitionYouth + ", competitionInternational=" + competitionInternational
				+ ", seasonName=" + seasonName + ", matchUpdated=" + matchUpdated + ", matchAvailable=" + matchAvailable
				+ ", matchUpdated360=" + matchUpdated360 + ", matchAvailable360=" + matchAvailable360 + "]";
	}

	
    
}
