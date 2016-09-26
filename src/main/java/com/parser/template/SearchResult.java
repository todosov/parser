
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
    "SearchResultItems",
    "Stats",
    "Page",
    "PageSize",
    "ContainsTours",
    "OrderedByPrice",
    "AscendingOrder",
    "TotalOffers",
    "TotalItems",
    "TimeSpentSearching",
    "TimingInfo"
})
public class SearchResult {

    @JsonProperty("SearchResultItems")
    public List<SearchResultItem> searchResultItems = new ArrayList<SearchResultItem>();
    @JsonProperty("Stats")
    public List<Stat> stats = new ArrayList<Stat>();
    @JsonProperty("Page")
    public Integer page;
    @JsonProperty("PageSize")
    public Integer pageSize;
    @JsonProperty("ContainsTours")
    public Boolean containsTours;
    @JsonProperty("OrderedByPrice")
    public Boolean orderedByPrice;
    @JsonProperty("AscendingOrder")
    public Boolean ascendingOrder;
    @JsonProperty("TotalOffers")
    public Integer totalOffers;
    @JsonProperty("TotalItems")
    public Integer totalItems;
    @JsonProperty("TimeSpentSearching")
    public String timeSpentSearching;
    @JsonProperty("TimingInfo")
    public String timingInfo;

}
