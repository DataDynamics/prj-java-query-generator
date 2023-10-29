package io.datadynamics.datalake.sql.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "username",
        "tableName",
        "selected",
        "conditions",
        "partitions",
        "limit",
        "queryPostfix"
})
public class QueryRequest {

    @JsonProperty("username")
    private String username;

    @JsonProperty("tableName")
    private String tableName;

    @JsonProperty("selected")
    private List<String> selected = new ArrayList<String>();

    @JsonProperty("conditions")
    private List<Condition> conditions = new ArrayList<Condition>();

    @JsonProperty("partitions")
    private List<String> partitions = new ArrayList<String>();

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("queryPostfix")
    private String queryPostfix;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public QueryRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public QueryRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @JsonProperty("selected")
    public List<String> getSelected() {
        if (selected == null) {
            selected = new ArrayList<>();
        }
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(List<String> selected) {
        this.selected = selected;
    }

    public QueryRequest withSelected(List<String> selected) {
        this.selected = selected;
        return this;
    }

    @JsonProperty("conditions")
    public List<Condition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<>();
        }
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public QueryRequest withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @JsonProperty("partitions")
    public List<String> getPartitions() {
        if (partitions == null) {
            partitions = new ArrayList<>();
        }
        return partitions;
    }

    @JsonProperty("partitions")
    public void setPartitions(List<String> partitions) {
        this.partitions = partitions;
    }

    public QueryRequest withPartitions(List<String> partitions) {
        this.partitions = partitions;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("queryPostfix")
    public String getQueryPostfix() {
        return queryPostfix;
    }

    @JsonProperty("queryPostfix")
    public void setQueryPostfix(String queryPostfix) {
        this.queryPostfix = queryPostfix;
    }

    public QueryRequest withQueryPostfix(String queryPostfix) {
        this.queryPostfix = queryPostfix;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public QueryRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QueryRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null) ? "<null>" : this.username));
        sb.append(',');
        sb.append("tableName");
        sb.append('=');
        sb.append(((this.tableName == null) ? "<null>" : this.tableName));
        sb.append(',');
        sb.append("selected");
        sb.append('=');
        sb.append(((this.selected == null) ? "<null>" : this.selected));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null) ? "<null>" : this.conditions));
        sb.append(',');
        sb.append("partitions");
        sb.append('=');
        sb.append(((this.partitions == null) ? "<null>" : this.partitions));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null) ? "<null>" : this.limit));
        sb.append(',');
        sb.append("queryPostfix");
        sb.append('=');
        sb.append(((this.queryPostfix == null) ? "<null>" : this.queryPostfix));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.partitions == null) ? 0 : this.partitions.hashCode()));
        result = ((result * 31) + ((this.queryPostfix == null) ? 0 : this.queryPostfix.hashCode()));
        result = ((result * 31) + ((this.limit == null) ? 0 : this.limit.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.conditions == null) ? 0 : this.conditions.hashCode()));
        result = ((result * 31) + ((this.selected == null) ? 0 : this.selected.hashCode()));
        result = ((result * 31) + ((this.username == null) ? 0 : this.username.hashCode()));
        result = ((result * 31) + ((this.tableName == null) ? 0 : this.tableName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryRequest) == false) {
            return false;
        }
        QueryRequest rhs = ((QueryRequest) other);
        return (((((((((this.partitions == rhs.partitions) || ((this.partitions != null) && this.partitions.equals(rhs.partitions))) && ((this.queryPostfix == rhs.queryPostfix) || ((this.queryPostfix != null) && this.queryPostfix.equals(rhs.queryPostfix)))) && ((this.limit == rhs.limit) || ((this.limit != null) && this.limit.equals(rhs.limit)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.conditions == rhs.conditions) || ((this.conditions != null) && this.conditions.equals(rhs.conditions)))) && ((this.selected == rhs.selected) || ((this.selected != null) && this.selected.equals(rhs.selected)))) && ((this.username == rhs.username) || ((this.username != null) && this.username.equals(rhs.username)))) && ((this.tableName == rhs.tableName) || ((this.tableName != null) && this.tableName.equals(rhs.tableName))));
    }

}
