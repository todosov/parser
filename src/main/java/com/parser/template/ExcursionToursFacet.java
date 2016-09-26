
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
public class ExcursionToursFacet {

    @JsonProperty("FilterItems")
    public List<Object> filterItems = new ArrayList<Object>();
    @JsonProperty("SelectedItems")
    public List<Object> selectedItems = new ArrayList<Object>();
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
