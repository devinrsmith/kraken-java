package com.devinrsmith.kraken.data.stores;

/**
 * Created by dsmith on 8/16/14.
 */
public class CloudFilesStore {
    private String user;
    private String key;
    private String container;
    private String path;

    public CloudFilesStore(String user, String key, String container, String path) {
        this.user = user;
        this.key = key;
        this.container = container;
        this.path = path;
    }

    public String getUser() {
        return user;
    }

    public String getKey() {
        return key;
    }

    public String getContainer() {
        return container;
    }

    public String getPath() {
        return path;
    }
}
