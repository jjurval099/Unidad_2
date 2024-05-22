package ies.jandula.unidad2add.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.JsonNode;

import ies.jandula.unidad2add.json.Json;
import ies.jandula.unidad2add.models.Competitions;

public class Ejercicio1 
{
    public static void main(String[] args)
    {    	
    	FileWriter fileWriter = null;
    	PrintWriter printWriter = null;
    	
        try 
        {
        	fileWriter = new FileWriter("Ejercicio1.json");
        	printWriter = new PrintWriter(fileWriter); 
        	
            List<Competitions> competitionsList= new ArrayList<>(); 
            String fileContent = FileUtils.readFileToString(new File("competitions.json"),"UTF-8");
            JsonNode rootJsonNode = Json.mapper().readTree(fileContent);
            
            if(rootJsonNode.isArray())
            {
                final Iterator<JsonNode> iterator = rootJsonNode.elements();
                
                while (iterator.hasNext())
                {
                    final JsonNode competitionJsonNode = iterator.next();
                    
                    if (competitionJsonNode.has("season_name"))
                    {
                    	final String competitionId = competitionJsonNode.get("competition_id").asText();
                    	final String seasonId = competitionJsonNode.get("season_id").asText();
                        final String countryName = competitionJsonNode.get("country_name").asText();
                        final String competitionName = competitionJsonNode.get("competition_name").asText();                        
                        final String competitionGender = competitionJsonNode.get("competition_gender").asText();  
                        final String competitionYouth = competitionJsonNode.get("competition_youth").asText();  
                        final String competitionInternational = competitionJsonNode.get("competition_international").asText();
                        final String seasonName = competitionJsonNode.get("season_name").asText();
                        final String matchUpdated = competitionJsonNode.get("match_updated").asText();  
                        final String matchAvailable = competitionJsonNode.get("match_available").asText();                            
                        final String matchUpdated360 = competitionJsonNode.get("match_updated_360").asText();
                        final String matchAvailable360 = competitionJsonNode.get("match_available_360").asText();
                        
                        Competitions competition = new Competitions(competitionId, seasonId, countryName, competitionName, competitionGender, competitionYouth, competitionInternational, seasonName, matchUpdated, matchAvailable, matchUpdated360, matchAvailable360);
                        competitionsList.add(competition);
                    }
                }
                
                // Imprimir los nombres de las competiciones en el orden correcto
                for (Competitions competition : competitionsList) 
                {
                    printWriter.println(competition.getSeasonName()+" "+competition.getCompetitionName());
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
        	try 
        	{
        		printWriter.close();
				fileWriter.close();
			} 
        	catch (IOException e) 
        	{
				e.printStackTrace();
			}
        }
    }
}

