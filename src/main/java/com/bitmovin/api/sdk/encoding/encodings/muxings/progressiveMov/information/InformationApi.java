package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveMov.information;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Body;
import feign.Headers;

import com.bitmovin.api.sdk.model.*;
import com.bitmovin.api.sdk.common.BitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class InformationApi {

    private final InformationApiClient apiClient;

    public InformationApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InformationApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of InformationApi
     */
    public static BitmovinApiBuilder<InformationApi> builder() {
        return new BitmovinApiBuilder<>(InformationApi.class);
    }
    
    /**
     * Progressive MOV Muxing Information
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive MOV muxing (required)
     * @return ProgressiveMovMuxingInformation
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveMovMuxingInformation get(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId).getData().getResult();
    }
    
    interface InformationApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-mov/{muxing_id}/information")
        ResponseEnvelope<ProgressiveMovMuxingInformation> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}