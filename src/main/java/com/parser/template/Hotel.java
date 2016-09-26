
package com.parser.template;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "HotelId",
    "Nights",
    "HotelCategory",
    "MealTypeKey",
    "RoomTypeKey",
    "RoomCategoryKey",
    "HotelName",
    "ResortName",
    "CityName",
    "DistrictName",
    "PansionName",
    "RoomTypeName",
    "RoomCategoryName",
    "AccommodationType",
    "HotelUrl"
})
public class Hotel {

    @JsonProperty("HotelId")
    public Integer hotelId;
    @JsonProperty("Nights")
    public Integer nights;
    @JsonProperty("HotelCategory")
    public String hotelCategory;
    @JsonProperty("MealTypeKey")
    public Integer mealTypeKey;
    @JsonProperty("RoomTypeKey")
    public Integer roomTypeKey;
    @JsonProperty("RoomCategoryKey")
    public Integer roomCategoryKey;
    @JsonProperty("HotelName")
    public String hotelName;
    @JsonProperty("ResortName")
    public String resortName;
    @JsonProperty("CityName")
    public String cityName;
    @JsonProperty("DistrictName")
    public String districtName;
    @JsonProperty("PansionName")
    public String pansionName;
    @JsonProperty("RoomTypeName")
    public String roomTypeName;
    @JsonProperty("RoomCategoryName")
    public String roomCategoryName;
    @JsonProperty("AccommodationType")
    public String accommodationType;
    @JsonProperty("HotelUrl")
    public String hotelUrl;

}
