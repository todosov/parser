
package com.parser.template;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "PriceRanges",
    "CountriesFacet",
    "ResortsFacet",
    "CitiesFacet",
    "DistrictsFacet",
    "HotelCategoriesFacet",
    "MealTypesFacet",
    "HotelTourTypesFacet",
    "RecommendationsFacet",
    "ConceptsFacet",
    "ExcursionToursFacet",
    "PromotionTypesFacet"
})
public class Filters {

    @JsonProperty("PriceRanges")
    public PriceRanges priceRanges;
    @JsonProperty("CountriesFacet")
    public CountriesFacet countriesFacet;
    @JsonProperty("ResortsFacet")
    public ResortsFacet resortsFacet;
    @JsonProperty("CitiesFacet")
    public CitiesFacet citiesFacet;
    @JsonProperty("DistrictsFacet")
    public DistrictsFacet districtsFacet;
    @JsonProperty("HotelCategoriesFacet")
    public HotelCategoriesFacet hotelCategoriesFacet;
    @JsonProperty("MealTypesFacet")
    public MealTypesFacet mealTypesFacet;
    @JsonProperty("HotelTourTypesFacet")
    public HotelTourTypesFacet hotelTourTypesFacet;
    @JsonProperty("RecommendationsFacet")
    public RecommendationsFacet recommendationsFacet;
    @JsonProperty("ConceptsFacet")
    public ConceptsFacet conceptsFacet;
    @JsonProperty("ExcursionToursFacet")
    public ExcursionToursFacet excursionToursFacet;
    @JsonProperty("PromotionTypesFacet")
    public PromotionTypesFacet promotionTypesFacet;

}
