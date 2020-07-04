package com.p280ss.android.ugc.aweme.base.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.model.UrlModel */
public class UrlModel implements Serializable {
    @C6593c(mo15949a = "file_hash")
    public String fileHash;
    @C6593c(mo15949a = "height")
    public int height;
    @C6593c(mo15949a = "data_size")
    public long size;
    @C6593c(mo15949a = "uri")
    public String uri;
    @C6593c(mo15949a = "url_key")
    public String urlKey;
    @C6593c(mo15949a = "url_list")
    public List<String> urlList;
    @C6593c(mo15949a = "width")
    public int width;

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public long getSize() {
        return this.size;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.urlKey;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.urlKey)) {
            str = this.uri;
        } else {
            str = this.urlKey;
        }
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.urlList != null) {
            i2 = this.urlList.hashCode();
        }
        return i3 + i2;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.urlKey = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (this.uri == null ? urlModel.uri != null : !this.uri.equals(urlModel.uri)) {
            return false;
        }
        if (this.urlKey == null ? urlModel.urlKey != null : !this.urlKey.equals(urlModel.urlKey)) {
            return false;
        }
        if (this.urlList != null) {
            return this.urlList.equals(urlModel.urlList);
        }
        if (urlModel.urlList == null) {
            return true;
        }
        return false;
    }
}
