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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutRestApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutRestApiRequestMarshaller {

    private static final MarshallingInfo<String> RESTAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("restapi_id").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("mode").build();
    private static final MarshallingInfo<Boolean> FAILONWARNINGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("failonwarnings").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> BODY_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();

    private static final PutRestApiRequestMarshaller instance = new PutRestApiRequestMarshaller();

    public static PutRestApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutRestApiRequest putRestApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (putRestApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putRestApiRequest.getRestApiId(), RESTAPIID_BINDING);
            protocolMarshaller.marshall(putRestApiRequest.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(putRestApiRequest.getFailOnWarnings(), FAILONWARNINGS_BINDING);
            protocolMarshaller.marshall(putRestApiRequest.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(putRestApiRequest.getBody(), BODY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
