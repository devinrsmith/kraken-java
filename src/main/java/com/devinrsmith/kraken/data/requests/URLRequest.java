package com.devinrsmith.kraken.data.requests;

import com.devinrsmith.kraken.data.stores.AzureStore;
import com.devinrsmith.kraken.data.stores.CloudFilesStore;
import com.devinrsmith.kraken.data.stores.S3Store;

/**
* Created by dsmith on 8/16/14.
*/
public class URLRequest {
    public static Builder builder(Auth auth, String url) {
        return new Builder(auth, url);
    }

    public static class Waiting extends URLRequest {
        private Waiting(Auth auth, String url, Boolean wait, Boolean lossy, Integer quality, Boolean webp, CloudFilesStore cf_store, S3Store s3_store, AzureStore azure_store) {
            super(auth, url, null, wait, lossy, quality, webp, cf_store, s3_store, azure_store);
        }
    }

    public static class Callback extends URLRequest {
        private Callback(Auth auth, String url, String callback_url, Boolean lossy, Integer quality, Boolean webp, CloudFilesStore cf_store, S3Store s3_store, AzureStore azure_store) {
            super(auth, url, callback_url, null, lossy, quality, webp, cf_store, s3_store, azure_store);
        }
    }

    private Auth auth;
    private String url;
    private String callback_url;
    private Boolean wait;
    private Boolean lossy;
    private Integer quality;
    private Boolean webp;
    private CloudFilesStore cf_store;
    private S3Store s3_store;
    private AzureStore azure_store;

    private URLRequest(Auth auth, String url, String callback_url, Boolean wait, Boolean lossy, Integer quality, Boolean webp, CloudFilesStore cf_store, S3Store s3_store, AzureStore azure_store) {
        this.auth = auth;
        this.url = url;
        this.callback_url = callback_url;
        this.wait = wait;
        this.lossy = lossy;
        this.quality = quality;
        this.webp = webp;
        this.cf_store = cf_store;
        this.s3_store = s3_store;
        this.azure_store = azure_store;
    }

    public Auth getAuth() {
        return auth;
    }

    public String getUrl() {
        return url;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public Boolean getWait() {
        return wait;
    }

    public Boolean getLossy() {
        return lossy;
    }

    public Integer getQuality() {
        return quality;
    }

    public Boolean getWebp() {
        return webp;
    }

    public CloudFilesStore getCf_store() {
        return cf_store;
    }

    public S3Store getS3_store() {
        return s3_store;
    }

    public AzureStore getAzure_store() {
        return azure_store;
    }

    public static class Builder {
        private final Auth auth;
        private final String url;
        private Boolean lossy;
        private Integer quality;
        private Boolean webp;
        private CloudFilesStore cf_store;
        private S3Store s3_store;
        private AzureStore azure_store;

        private Builder(Auth auth, String url) {
            this.auth = auth;
            this.url = url;
        }

        public Builder lossy(final Boolean lossy) {
            this.lossy = lossy;
            return this;
        }

        public Builder quality(final Integer quality) {
            this.quality = quality;
            return this;
        }

        public Builder webp(final Boolean webp) {
            this.webp = webp;
            return this;
        }

        public Builder cf_store(final CloudFilesStore cf_store) {
            this.cf_store = cf_store;
            return this;
        }

        public Builder s3_store(final S3Store s3_store) {
            this.s3_store = s3_store;
            return this;
        }

        public Builder azure_store(final AzureStore azure_store) {
            this.azure_store = azure_store;
            return this;
        }


        public Waiting build() {
            return new Waiting(auth, url, true, lossy, quality, webp, cf_store, s3_store, azure_store);
        }

        public Callback build(String callback_url) {
            return new Callback(auth, url, callback_url, lossy, quality, webp, cf_store, s3_store, azure_store);
        }
    }
}
