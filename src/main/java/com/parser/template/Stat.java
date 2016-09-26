
package com.parser.template;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "CountryId",
    "Name",
    "TourCount",
    "ToursHighPrice",
    "ToursLowPrice"
})
public class Stat {

    @JsonProperty("CountryId")
    public Integer countryId;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("TourCount")
    public Integer tourCount;
    @JsonProperty("ToursHighPrice")
    public Integer toursHighPrice;
    @JsonProperty("ToursLowPrice")
    public Integer toursLowPrice;

}
