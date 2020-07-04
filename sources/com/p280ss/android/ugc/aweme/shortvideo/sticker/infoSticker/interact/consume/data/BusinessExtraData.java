package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.vast.p673a.C13015c;
import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData */
public class BusinessExtraData {
    @C6593c(mo15949a = "clickable_open_url")
    private String clickableOpenUrl;
    @C6593c(mo15949a = "clickable_web_url")
    private String clickableWebUrl;
    @C6593c(mo15949a = "interaction_type")
    private int interactionType;
    @C6593c(mo15949a = "interaction_url")
    private String interactionUrl;
    @C6593c(mo15949a = "interaction_icon")
    private String popIcon;
    @C6593c(mo15949a = "interaction_text")
    private String popText;
    @C6593c(mo15949a = "sticker_id")
    private String stickerId;

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public String getSchemaUrlOpenFirst() {
        if (!C13015c.m37973a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        if (!C13015c.m37973a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        return this.interactionUrl;
    }

    public String getSchemaUrlWebFirst() {
        if (!C13015c.m37973a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        if (!C13015c.m37973a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        return this.interactionUrl;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
