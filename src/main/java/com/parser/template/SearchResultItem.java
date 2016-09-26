
package com.parser.template;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "Hotels",
    "PriceKey",
    "DepartureDate",
    "ArrivalDate",
    "DepartureCityId",
    "DepartureCityName",
    "TourTypeId",
    "Adults",
    "Children",
    "Infants",
    "HotelId",
    "BookingUrl",
    "HotelName",
    "ResortName",
    "ResortUrl",
    "CityName",
    "CityUrl",
    "DistrictName",
    "CountryId",
    "CountryName",
    "CountryUrl",
    "HotelCategory",
    "HotelCategoryName",
    "HotelPriority",
    "HotelConcepts",
    "Price",
    "PriceCurrency",
    "Nights",
    "Days",
    "PansionName",
    "NormalizedPansionName",
    "PansionCode",
    "RoomTypeName",
    "RoomCategoryName",
    "AccommodationType",
    "ExcursionTourNameId",
    "TourName",
    "ExcursionTourUrl",
    "Photos",
    "OffersCount",
    "QuotaHotel",
    "QuotaFlightTo",
    "QuotaFlightFrom",
    "Latitude",
    "Longitude",
    "TuiRating",
    "TuiRatingCount",
    "TripAdvisorRating",
    "TripAdvisorRatingCount",
    "TripAdvisorRatingImage",
    "TripAdvisorHotelUrl",
    "IsExcursionTourGroup",
    "IsCombinedTourGroup",
    "HotelUrl",
    "CssClass",
    "SpecialOfferCssClass",
    "SpecialOffers",
    "AviaPackage",
    "ActionHtml",
    "IsCreditPaymentHidden",
    "LowerThanTheLowestRangeLimit",
    "ExactQuotaHotel",
    "ExactQuotaFlightFrom",
    "ExactQuotaFlightTo"
})
public class SearchResultItem {

    @JsonProperty("Hotels")
    public List<Hotel> hotels = new ArrayList<Hotel>();
    @JsonProperty("PriceKey")
    public String priceKey;
    @JsonProperty("DepartureDate")
    public String departureDate;
    @JsonProperty("ArrivalDate")
    public String arrivalDate;
    @JsonProperty("DepartureCityId")
    public Integer departureCityId;
    @JsonProperty("DepartureCityName")
    public String departureCityName;
    @JsonProperty("TourTypeId")
    public Integer tourTypeId;
    @JsonProperty("Adults")
    public Integer adults;
    @JsonProperty("Children")
    public Integer children;
    @JsonProperty("Infants")
    public Integer infants;
    @JsonProperty("HotelId")
    public Integer hotelId;
    @JsonProperty("BookingUrl")
    public String bookingUrl;
    @JsonProperty("HotelName")
    public String hotelName;
    @JsonProperty("ResortName")
    public String resortName;
    @JsonProperty("ResortUrl")
    public String resortUrl;
    @JsonProperty("CityName")
    public String cityName;
    @JsonProperty("CityUrl")
    public String cityUrl;
    @JsonProperty("DistrictName")
    public String districtName;
    @JsonProperty("CountryId")
    public Integer countryId;
    @JsonProperty("CountryName")
    public String countryName;
    @JsonProperty("CountryUrl")
    public String countryUrl;
    @JsonProperty("HotelCategory")
    public String hotelCategory;
    @JsonProperty("HotelCategoryName")
    public String hotelCategoryName;
    @JsonProperty("HotelPriority")
    public Integer hotelPriority;
    @JsonProperty("HotelConcepts")
    public List<Object> hotelConcepts = new ArrayList<Object>();
    @JsonProperty("Price")
    public Integer price;
    @JsonProperty("PriceCurrency")
    public String priceCurrency;
    @JsonProperty("Nights")
    public Integer nights;
    @JsonProperty("Days")
    public Integer days;
    @JsonProperty("PansionName")
    public String pansionName;
    @JsonProperty("NormalizedPansionName")
    public String normalizedPansionName;
    @JsonProperty("PansionCode")
    public String pansionCode;
    @JsonProperty("RoomTypeName")
    public String roomTypeName;
    @JsonProperty("RoomCategoryName")
    public String roomCategoryName;
    @JsonProperty("AccommodationType")
    public String accommodationType;
    @JsonProperty("ExcursionTourNameId")
    public Integer excursionTourNameId;
    @JsonProperty("TourName")
    public String tourName;
    @JsonProperty("ExcursionTourUrl")
    public String excursionTourUrl;
    @JsonProperty("Photos")
    public List<String> photos = new ArrayList<String>();
    @JsonProperty("OffersCount")
    public Integer offersCount;
    @JsonProperty("QuotaHotel")
    public Integer quotaHotel;
    @JsonProperty("QuotaFlightTo")
    public Integer quotaFlightTo;
    @JsonProperty("QuotaFlightFrom")
    public Integer quotaFlightFrom;
    @JsonProperty("Latitude")
    public Double latitude;
    @JsonProperty("Longitude")
    public Double longitude;
    @JsonProperty("TuiRating")
    public Integer tuiRating;
    @JsonProperty("TuiRatingCount")
    public Integer tuiRatingCount;
    @JsonProperty("TripAdvisorRating")
    public Double tripAdvisorRating;
    @JsonProperty("TripAdvisorRatingCount")
    public Integer tripAdvisorRatingCount;
    @JsonProperty("TripAdvisorRatingImage")
    public String tripAdvisorRatingImage;
    @JsonProperty("TripAdvisorHotelUrl")
    public String tripAdvisorHotelUrl;
    @JsonProperty("IsExcursionTourGroup")
    public Boolean isExcursionTourGroup;
    @JsonProperty("IsCombinedTourGroup")
    public Boolean isCombinedTourGroup;
    @JsonProperty("HotelUrl")
    public String hotelUrl;
    @JsonProperty("CssClass")
    public String cssClass;
    @JsonProperty("SpecialOfferCssClass")
    public Object specialOfferCssClass;
    @JsonProperty("SpecialOffers")
    public List<Integer> specialOffers = new ArrayList<Integer>();
    @JsonProperty("AviaPackage")
    public Boolean aviaPackage;
    @JsonProperty("ActionHtml")
    public String actionHtml;
    @JsonProperty("IsCreditPaymentHidden")
    public Boolean isCreditPaymentHidden;
    @JsonProperty("LowerThanTheLowestRangeLimit")
    public Boolean lowerThanTheLowestRangeLimit;
    @JsonProperty("ExactQuotaHotel")
    public Integer exactQuotaHotel;
    @JsonProperty("ExactQuotaFlightFrom")
    public Integer exactQuotaFlightFrom;
    @JsonProperty("ExactQuotaFlightTo")
    public Integer exactQuotaFlightTo;

}
