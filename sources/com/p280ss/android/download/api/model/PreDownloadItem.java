package com.p280ss.android.download.api.model;

import com.p280ss.android.download.api.p860c.C19390a;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.download.api.model.PreDownloadItem */
public class PreDownloadItem implements Serializable {
    private static final long serialVersionUID = -1872248691128991983L;
    public long adId;
    public String appPackageName;
    public String appVersion;
    public String downloadUrl;
    public boolean isAd;
    public String logExtra;
    public String md5;
    public long packageSize;

    PreDownloadItem() {
    }

    public int hashCode() {
        if (this.appPackageName != null) {
            return this.appPackageName.hashCode();
        }
        return 0;
    }

    public JSONObject toJSon() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("package_name", this.appPackageName);
            jSONObject.put("size", this.packageSize);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("download_url", this.downloadUrl);
            jSONObject.put("md5", this.md5);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static PreDownloadItem fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        PreDownloadItem preDownloadItem = new PreDownloadItem();
        try {
            preDownloadItem.appPackageName = jSONObject.optString("package_name");
            preDownloadItem.packageSize = C19390a.m63716a(jSONObject, "size");
            preDownloadItem.appVersion = jSONObject.optString("app_version");
            preDownloadItem.downloadUrl = jSONObject.optString("download_url");
            preDownloadItem.md5 = jSONObject.optString("md5");
            return preDownloadItem;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreDownloadItem preDownloadItem = (PreDownloadItem) obj;
        if (this.appPackageName != null) {
            return this.appPackageName.equals(preDownloadItem.appPackageName);
        }
        if (preDownloadItem.appPackageName == null) {
            return true;
        }
        return false;
    }
}
