package com.devinrsmith.kraken.data.stores;

import java.util.Map;

/**
 * Created by dsmith on 8/16/14.
 */
public class S3Store {
    private String key;
    private String secret;
    private String bucket;
    private String region;
    private String path;
    private String acl; // todo enum
    private Map<String, String> headers;

    public S3Store(String key, String secret, String bucket, String region, String path, String acl, Map<String, String> headers) {
        this.key = key;
        this.secret = secret;
        this.bucket = bucket;
        this.region = region;
        this.path = path;
        this.acl = acl;
        this.headers = headers;
    }

    public String getKey() {
        return key;
    }

    public String getSecret() {
        return secret;
    }

    public String getBucket() {
        return bucket;
    }

    public String getRegion() {
        return region;
    }

    public String getPath() {
        return path;
    }

    public String getAcl() {
        return acl;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
