package com.basilus.iracing.manager.model;

/**
 * Model class representing the cache link response from the iRacing API.
 * Instead of returning the data directly, the API returns a link to an S3 bucket
 * where the actual data is stored.
 */
public class CacheLinkResponse {
    private String link;
    private String expires;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }
}
