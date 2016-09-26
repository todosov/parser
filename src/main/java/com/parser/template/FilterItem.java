
package com.parser.template;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonPropertyOrder({
    "Id",
    "Text",
    "ResultCount"
})
public class FilterItem {

    @JsonProperty("Id")
    public String id;
    @JsonProperty("Text")
    public String text;
    @JsonProperty("ResultCount")
    public Integer resultCount;

}
