package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.raw.customdata;

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

public class CustomdataApi {

    private final CustomdataApiClient apiClient;

    public CustomdataApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomdataApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomdataApi
     */
    public static BitmovinApiBuilder<CustomdataApi> builder() {
        return new BitmovinApiBuilder<>(CustomdataApi.class);
    }
    
    /**
     * Raw ID3 Tag Custom Data of Progressive TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS Muxing (required)
     * @param id3TagId ID of the RAW ID3 Tag (required)
     * @return CustomData
     * @throws BitmovinException if fails to make API call
     */
    public CustomData getCustomData(String encodingId, String muxingId, String id3TagId) throws BitmovinException {
        return this.apiClient.getCustomData(encodingId, muxingId, id3TagId).getData().getResult();
    }
    
    interface CustomdataApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/raw/{id3_tag_id}/customData")
        ResponseEnvelope<CustomData> getCustomData(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
    }
}