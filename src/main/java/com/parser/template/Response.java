
package com.parser.template;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "SearchFilter",
    "SearchResult",
    "FoundWithOriginalFilters",
    "DebugQueryInfo"
})
public class Response {

    @JsonProperty("SearchFilter")
    public SearchFilter searchFilter;
    @JsonProperty("SearchResult")
    public SearchResult searchResult;
    @JsonProperty("FoundWithOriginalFilters")
    public Boolean foundWithOriginalFilters;
    @JsonProperty("DebugQueryInfo")
    public String debugQueryInfo;

}
