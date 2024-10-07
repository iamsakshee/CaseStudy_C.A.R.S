package dao;

import entity.Cases;
import entity.Incidents;
import entity.Reports;

import java.util.Collection;
import java.util.Date;

import exception.DatabaseException;
import exception.IncidentNotFoundException;
import exception.CaseNotFoundException;

public interface ICrimeAnalysisService {
    boolean createIncident(Incidents incident) throws DatabaseException;
    
    boolean updateIncidentStatus(String status, int incidentId) throws DatabaseException, IncidentNotFoundException;
    
    Collection<Incidents> getIncidentsInDateRange(Date startDate, Date endDate) throws DatabaseException;
    
    Collection<Incidents> searchIncidents(String criteria) throws DatabaseException;
    
    Reports generateIncidentReport(Incidents incident) throws DatabaseException, IncidentNotFoundException;
    
    Cases createCase(int caseid, String caseDescription, int incidentid) throws DatabaseException;
    
    Cases getCaseDetails(int caseId) throws DatabaseException, CaseNotFoundException;
    
    boolean updateCaseDetails(Cases caseDetails) throws DatabaseException;
    
    Collection<Cases> getAllCases() throws DatabaseException;
}
