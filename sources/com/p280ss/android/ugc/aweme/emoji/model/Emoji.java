package com.p280ss.android.ugc.aweme.emoji.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.emoji.model.Emoji */
public class Emoji implements Serializable {
    @C6593c(mo15949a = "animate_type")
    private String animateType;
    @C6593c(mo15949a = "animate_url")
    private UrlModel animateUrl;
    @C6593c(mo15949a = "display_name")
    private String displayName;
    @C6593c(mo15949a = "display_name_lang")
    private HashMap<String, String> displayNameLangs;
    @C6593c(mo15949a = "height")
    private int height;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f72762id;
    @C6593c(mo15949a = "log_pb")
    private LogPbBean mLogPb;
    @C6593c(mo15949a = "origin_package_id")
    private long resourcesId;
    @C6593c(mo15949a = "static_type")
    private String staticType;
    @C6593c(mo15949a = "static_url")
    private UrlModel staticUrl;
    @C6593c(mo15949a = "sticker_type")
    private int stickerType;
    @C6593c(mo15949a = "version")
    private String version;
    @C6593c(mo15949a = "width")
    private int width;

    public String getAnimateType() {
        return this.animateType;
    }

    public UrlModel getAnimateUrl() {
        return this.animateUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.displayNameLangs;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.f72762id;
    }

    public LogPbBean getLogPb() {
        return this.mLogPb;
    }

    public long getResourcesId() {
        return this.resourcesId;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public UrlModel getStaticUrl() {
        return this.staticUrl;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return String.valueOf(this.f72762id).hashCode();
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.animateUrl = urlModel;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> hashMap) {
        this.displayNameLangs = hashMap;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(long j) {
        this.f72762id = j;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.mLogPb = logPbBean;
    }

    public void setResourcesId(long j) {
        this.resourcesId = j;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.staticUrl = urlModel;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Emoji)) {
            return false;
        }
        Emoji emoji = (Emoji) obj;
        if ((emoji.f72762id <= 0 || emoji.f72762id != this.f72762id) && (emoji.getAnimateUrl() == null || getAnimateUrl() == null || !TextUtils.equals(emoji.getAnimateUrl().getUri(), this.animateUrl.getUri()))) {
            return false;
        }
        return true;
    }
}
