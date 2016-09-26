
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
    "FilterItems",
    "SelectedItems",
    "CodeName",
    "IsFacet",
    "IsListSelect",
    "IsMultichangeable",
    "Active"
})
public class HotelTourTypesFacet {

    @JsonProperty("FilterItems")
    public List<FilterItem> filterItems = new ArrayList<FilterItem>();
    @JsonProperty("SelectedItems")
    public List<String> selectedItems = new ArrayList<String>();
    @JsonProperty("CodeName")
    public String codeName;
    @JsonProperty("IsFacet")
    public Boolean isFacet;
    @JsonProperty("IsListSelect")
    public Boolean isListSelect;
    @JsonProperty("IsMultichangeable")
    public Boolean isMultichangeable;
    @JsonProperty("Active")
    public Boolean active;

}
