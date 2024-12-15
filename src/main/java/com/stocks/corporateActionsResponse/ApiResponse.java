package com.stocks.corporateActionsResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class ApiResponse {
    private BoardMeeting boardMeeting ;
    private Divident divident;
    private Splits splits;
    private Bonus bonus;
    private Rights rights;
}