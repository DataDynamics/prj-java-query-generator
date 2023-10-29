package io.datadynamics.datalake.sql.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "username",
        "tableName",
        "tarPath",
        "imagFileName"
})
@Generated("jsonschema2pojo")
public class DownloadRequest {

    @JsonProperty("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;

    @JsonProperty("tableName")
    private String tableName;

    @JsonProperty("tarPath")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tarPath;

    @JsonProperty("imagFileName")
    private String imageFileName;

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

    public DownloadRequest withUsername(String username) {
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

    public DownloadRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @JsonProperty("tarPath")
    public String getTarPath() {
        return tarPath;
    }

    @JsonProperty("tarPath")
    public void setTarPath(String tarPath) {
        this.tarPath = tarPath;
    }

    public DownloadRequest withTarPath(String tarPath) {
        this.tarPath = tarPath;
        return this;
    }

    @JsonProperty("imagFileName")
    public String getImagFileName() {
        return imageFileName;
    }

    @JsonProperty("imagFileName")
    public void setImagFileName(String imagFileNames) {
        this.imageFileName = imagFileNames;
    }

    public DownloadRequest withImagFileName(String imagFileNames) {
        this.imageFileName = imagFileNames;
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

    public DownloadRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DownloadRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null) ? "<null>" : this.username));
        sb.append(',');
        sb.append("tableName");
        sb.append('=');
        sb.append(((this.tableName == null) ? "<null>" : this.tableName));
        sb.append(',');
        sb.append("tarPath");
        sb.append('=');
        sb.append(((this.tarPath == null) ? "<null>" : this.tarPath));
        sb.append(',');
        sb.append("imagFileNames");
        sb.append('=');
        sb.append(((this.imageFileName == null) ? "<null>" : this.imageFileName));
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
        result = ((result * 31) + ((this.imageFileName == null) ? 0 : this.imageFileName.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.username == null) ? 0 : this.username.hashCode()));
        result = ((result * 31) + ((this.tableName == null) ? 0 : this.tableName.hashCode()));
        result = ((result * 31) + ((this.tarPath == null) ? 0 : this.tarPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownloadRequest) == false) {
            return false;
        }
        DownloadRequest rhs = ((DownloadRequest) other);
        return ((((((this.imageFileName == rhs.imageFileName) || ((this.imageFileName != null) && this.imageFileName.equals(rhs.imageFileName))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.username == rhs.username) || ((this.username != null) && this.username.equals(rhs.username)))) && ((this.tableName == rhs.tableName) || ((this.tableName != null) && this.tableName.equals(rhs.tableName)))) && ((this.tarPath == rhs.tarPath) || ((this.tarPath != null) && this.tarPath.equals(rhs.tarPath))));
    }

}
