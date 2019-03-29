package com.bitmovin.api.sdk.encoding.outputs;

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
import com.bitmovin.api.sdk.encoding.outputs.type.TypeApi;
import com.bitmovin.api.sdk.encoding.outputs.s3.S3Api;
import com.bitmovin.api.sdk.encoding.outputs.s3RoleBased.S3RoleBasedApi;
import com.bitmovin.api.sdk.encoding.outputs.genericS3.GenericS3Api;
import com.bitmovin.api.sdk.encoding.outputs.local.LocalApi;
import com.bitmovin.api.sdk.encoding.outputs.gcs.GcsApi;
import com.bitmovin.api.sdk.encoding.outputs.azure.AzureApi;
import com.bitmovin.api.sdk.encoding.outputs.ftp.FtpApi;
import com.bitmovin.api.sdk.encoding.outputs.sftp.SftpApi;
import com.bitmovin.api.sdk.encoding.outputs.akamaiNetstorage.AkamaiNetstorageApi;

public class OutputsApi {
    public final TypeApi type;
    public final S3Api s3;
    public final S3RoleBasedApi s3RoleBased;
    public final GenericS3Api genericS3;
    public final LocalApi local;
    public final GcsApi gcs;
    public final AzureApi azure;
    public final FtpApi ftp;
    public final SftpApi sftp;
    public final AkamaiNetstorageApi akamaiNetstorage;

    private final OutputsApiClient apiClient;

    public OutputsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OutputsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.s3 = new S3Api(clientFactory);
        this.s3RoleBased = new S3RoleBasedApi(clientFactory);
        this.genericS3 = new GenericS3Api(clientFactory);
        this.local = new LocalApi(clientFactory);
        this.gcs = new GcsApi(clientFactory);
        this.azure = new AzureApi(clientFactory);
        this.ftp = new FtpApi(clientFactory);
        this.sftp = new SftpApi(clientFactory);
        this.akamaiNetstorage = new AkamaiNetstorageApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OutputsApi
     */
    public static BitmovinApiBuilder<OutputsApi> builder() {
        return new BitmovinApiBuilder<>(OutputsApi.class);
    }
    
    /**
     * List all Outputs
     * 
     * @return List&lt;Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Output> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Output> list(OutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface OutputsApiClient {
    
        @RequestLine("GET /encoding/outputs")
        ResponseEnvelope<PaginationResponse<Output>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}