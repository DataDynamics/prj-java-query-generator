package io.datadynamics.datalake.sql.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "columnName",
        "operator",
        "values"
})
public class Condition {

    @JsonProperty("columnName")
    private String columnName;

    @JsonProperty("operator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String operator;

    @JsonProperty("values")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> values = new ArrayList<String>();

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("columnName")
    public String getColumnName() {
        return columnName;
    }

    @JsonProperty("columnName")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Condition withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Condition withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @JsonProperty("values")
    public List<String> getValues() {
        if (values == null) {
            values = new ArrayList<>();
        }
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    public Condition withValues(List<String> values) {
        this.values = values;
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

    public Condition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columnName");
        sb.append('=');
        sb.append(((this.columnName == null) ? "<null>" : this.columnName));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null) ? "<null>" : this.operator));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null) ? "<null>" : this.values));
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
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.operator == null) ? 0 : this.operator.hashCode()));
        result = ((result * 31) + ((this.columnName == null) ? 0 : this.columnName.hashCode()));
        result = ((result * 31) + ((this.values == null) ? 0 : this.values.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return (((((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))) && ((this.operator == rhs.operator) || ((this.operator != null) && this.operator.equals(rhs.operator)))) && ((this.columnName == rhs.columnName) || ((this.columnName != null) && this.columnName.equals(rhs.columnName)))) && ((this.values == rhs.values) || ((this.values != null) && this.values.equals(rhs.values))));
    }

}
