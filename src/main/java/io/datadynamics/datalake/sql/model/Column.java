
package io.datadynamics.datalake.sql.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "columnName",
        "dataType",
        "scale",
        "precision",
        "required",
        "partition"
})
public class Column {

    @JsonProperty("columnName")
    private String columnName;

    @JsonProperty("dataType")
    private String dataType;

    @JsonProperty("scale")
    private Integer scale;

    @JsonProperty("precision")
    private Integer precision;

    @JsonProperty("required")
    private Boolean required;

    @JsonProperty("partition")
    private Boolean partition;

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

    public Column withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    @JsonProperty("dataType")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Column withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Column withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    @JsonProperty("precision")
    public Integer getPrecision() {
        return precision;
    }

    @JsonProperty("precision")
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Column withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Column withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    @JsonProperty("partition")
    public Boolean getPartition() {
        return partition;
    }

    @JsonProperty("partition")
    public void setPartition(Boolean partition) {
        this.partition = partition;
    }

    public Column withPartition(Boolean partition) {
        this.partition = partition;
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

    public Column withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Column.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columnName");
        sb.append('=');
        sb.append(((this.columnName == null) ? "<null>" : this.columnName));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null) ? "<null>" : this.dataType));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null) ? "<null>" : this.scale));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null) ? "<null>" : this.precision));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null) ? "<null>" : this.required));
        sb.append(',');
        sb.append("partition");
        sb.append('=');
        sb.append(((this.partition == null) ? "<null>" : this.partition));
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
        result = ((result * 31) + ((this.partition == null) ? 0 : this.partition.hashCode()));
        result = ((result * 31) + ((this.dataType == null) ? 0 : this.dataType.hashCode()));
        result = ((result * 31) + ((this.precision == null) ? 0 : this.precision.hashCode()));
        result = ((result * 31) + ((this.scale == null) ? 0 : this.scale.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.required == null) ? 0 : this.required.hashCode()));
        result = ((result * 31) + ((this.columnName == null) ? 0 : this.columnName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Column) == false) {
            return false;
        }
        Column rhs = ((Column) other);
        return ((((((((this.partition == rhs.partition) || ((this.partition != null) && this.partition.equals(rhs.partition))) && ((this.dataType == rhs.dataType) || ((this.dataType != null) && this.dataType.equals(rhs.dataType)))) && ((this.precision == rhs.precision) || ((this.precision != null) && this.precision.equals(rhs.precision)))) && ((this.scale == rhs.scale) || ((this.scale != null) && this.scale.equals(rhs.scale)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.required == rhs.required) || ((this.required != null) && this.required.equals(rhs.required)))) && ((this.columnName == rhs.columnName) || ((this.columnName != null) && this.columnName.equals(rhs.columnName))));
    }

}
