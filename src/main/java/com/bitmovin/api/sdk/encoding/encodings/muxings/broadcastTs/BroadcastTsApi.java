package com.bitmovin.api.sdk.encoding.encodings.muxings.broadcastTs;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.broadcastTs.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.broadcastTs.information.InformationApi;

public class BroadcastTsApi {
    public final CustomdataApi customdata;
    public final InformationApi information;

    private final BroadcastTsApiClient apiClient;

    public BroadcastTsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(BroadcastTsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of BroadcastTsApi
     */
    public static BitmovinApiBuilder<BroadcastTsApi> builder() {
        return new BitmovinApiBuilder<>(BroadcastTsApi.class);
    }
    
    /**
     * Add Broadcast TS Muxing
     * 
     * @param encodingId ID of the encoding. (required)
     * @param broadcastTsMuxing  (optional)
     * @return BroadcastTsMuxing
     * @throws BitmovinException if fails to make API call
     */
    public BroadcastTsMuxing create(String encodingId, BroadcastTsMuxing broadcastTsMuxing) throws BitmovinException {
        return this.apiClient.create(encodingId, broadcastTsMuxing).getData().getResult();
    }
    
    /**
     * Delete Broadcast TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Broadcast TS muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * Broadcast TS Muxing Details
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Broadcast TS Muxing (required)
     * @return BroadcastTsMuxing
     * @throws BitmovinException if fails to make API call
     */
    public BroadcastTsMuxing get(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * List Broadcast TS Muxings
     * 
     * @param encodingId ID of the Encoding. (required)
     * @return List&lt;BroadcastTsMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BroadcastTsMuxing> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Broadcast TS Muxings
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;BroadcastTsMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BroadcastTsMuxing> list(String encodingId, BroadcastTsMuxingListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface BroadcastTsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/broadcast-ts")
        ResponseEnvelope<BroadcastTsMuxing> create(@Param(value = "encoding_id") String encodingId, BroadcastTsMuxing broadcastTsMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/broadcast-ts/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/broadcast-ts/{muxing_id}")
        ResponseEnvelope<BroadcastTsMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/broadcast-ts")
        ResponseEnvelope<PaginationResponse<BroadcastTsMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}