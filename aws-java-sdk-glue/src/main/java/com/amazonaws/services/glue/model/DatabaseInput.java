/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure used to create or updata a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DatabaseInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the database.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the database
     * </p>
     */
    private String description;
    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * A list of key-value pairs that define parameters and properties of the database.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * Name of the database.
     * </p>
     * 
     * @param name
     *        Name of the database.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the database.
     * </p>
     * 
     * @return Name of the database.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the database.
     * </p>
     * 
     * @param name
     *        Name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the database
     * </p>
     * 
     * @param description
     *        Description of the database
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the database
     * </p>
     * 
     * @return Description of the database
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the database
     * </p>
     * 
     * @param description
     *        Description of the database
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * 
     * @param locationUri
     *        The location of the database (for example, an HDFS path).
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * 
     * @return The location of the database (for example, an HDFS path).
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * 
     * @param locationUri
     *        The location of the database (for example, an HDFS path).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that define parameters and properties of the database.
     * </p>
     * 
     * @return A list of key-value pairs that define parameters and properties of the database.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of key-value pairs that define parameters and properties of the database.
     * </p>
     * 
     * @param parameters
     *        A list of key-value pairs that define parameters and properties of the database.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A list of key-value pairs that define parameters and properties of the database.
     * </p>
     * 
     * @param parameters
     *        A list of key-value pairs that define parameters and properties of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public DatabaseInput addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseInput == false)
            return false;
        DatabaseInput other = (DatabaseInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseInput clone() {
        try {
            return (DatabaseInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DatabaseInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
