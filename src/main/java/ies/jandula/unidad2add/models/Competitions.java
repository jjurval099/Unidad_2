package ies.jandula.unidad2add.models;

import java.util.Date;


public class Competitions
{
	private Integer competitionId;
	
	private Integer seasonId;
	
	private String competitionName;
	
	private String competitionGender;
	
	private String countryName;
	
	private String seasonName;
	
	private Date matchUpdated;
	
	private Date matchAvailable;

	public Competitions()
	{
		super();
	}

	public Competitions(Integer competitionId, Integer seasonId, String competitionName, String competitionGender,
			String countryName, String seasonName, Date matchUpdated, Date matchAvailable) 
	{
		super();
		this.competitionId = competitionId;
		this.seasonId = seasonId;
		this.competitionName = competitionName;
		this.competitionGender = competitionGender;
		this.countryName = countryName;
		this.seasonName = seasonName;
		this.matchUpdated = matchUpdated;
		this.matchAvailable = matchAvailable;
	}

	public Integer getCompetitionId() {
		return competitionId;
	}

	public void setCompetitionId(Integer competitionId) {
		this.competitionId = competitionId;
	}

	public Integer getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
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

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public Date getMatchUpdated() {
		return matchUpdated;
	}

	public void setMatchUpdated(Date matchUpdated) {
		this.matchUpdated = matchUpdated;
	}

	public Date getMatchAvailable() {
		return matchAvailable;
	}

	public void setMatchAvailable(Date matchAvailable) {
		this.matchAvailable = matchAvailable;
	}

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Competitions [competitionId= ");
		builder.append(competitionId);
		builder.append(", seasonId= ");
		builder.append(seasonId);
		builder.append(", competitionName= ");
		builder.append(competitionName);
		builder.append(", competitionGender= ");
		builder.append(competitionGender);
		builder.append(", countryName= ");
		builder.append(countryName);
		builder.append(", seasonName= ");
		builder.append(seasonName);
		builder.append(", matchUpdated= ");
		builder.append(matchUpdated);
		builder.append(", matchAvailable= ");
		builder.append(matchAvailable);
		builder.append("]");
		return builder.toString();
	}
}
