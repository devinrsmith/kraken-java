package com.devinrsmith.kraken.data.stores;

/**
 * Created by dsmith on 8/16/14.
 */
public class AzureStore {
    private String account;
    private String key;
    private String container;

    public AzureStore(String account, String key, String container) {
        this.account = account;
        this.key = key;
        this.container = container;
    }

    public String getAccount() {
        return account;
    }

    public String getKey() {
        return key;
    }

    public String getContainer() {
        return container;
    }
}
