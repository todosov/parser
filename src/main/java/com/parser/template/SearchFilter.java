
package com.parser.template;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "Filters",
    "SpecialOffersByHotelPivot"
})
public class SearchFilter {

    @JsonProperty("Filters")
    public Filters filters;
    @JsonProperty("SpecialOffersByHotelPivot")
    public SpecialOffersByHotelPivot specialOffersByHotelPivot;

}
