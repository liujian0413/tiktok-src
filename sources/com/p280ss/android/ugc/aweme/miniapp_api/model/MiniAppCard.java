package com.p280ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.MiniAppCard */
public final class MiniAppCard implements Serializable {
    @C6593c(mo15949a = "image_url")
    public String imageUrl;
    @C6593c(mo15949a = "text")
    public String text;
    @C6593c(mo15949a = "wait_time")
    public int waitTime;

    public MiniAppCard() {
    }

    public static /* synthetic */ MiniAppCard copy$default(MiniAppCard miniAppCard, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = miniAppCard.imageUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = miniAppCard.text;
        }
        if ((i2 & 4) != 0) {
            i = miniAppCard.waitTime;
        }
        return miniAppCard.copy(str, str2, i);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.waitTime;
    }

    public final MiniAppCard copy(String str, String str2, int i) {
        C7573i.m23587b(str, "imageUrl");
        C7573i.m23587b(str2, "text");
        return new MiniAppCard(str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MiniAppCard) {
                MiniAppCard miniAppCard = (MiniAppCard) obj;
                if (C7573i.m23585a((Object) this.imageUrl, (Object) miniAppCard.imageUrl) && C7573i.m23585a((Object) this.text, (Object) miniAppCard.text)) {
                    if (this.waitTime == miniAppCard.waitTime) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.waitTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppCard(imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", waitTime=");
        sb.append(this.waitTime);
        sb.append(")");
        return sb.toString();
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    public final void setImageUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.text = str;
    }

    public MiniAppCard(String str, String str2, int i) {
        C7573i.m23587b(str, "imageUrl");
        C7573i.m23587b(str2, "text");
        this.imageUrl = str;
        this.text = str2;
        this.waitTime = i;
    }
}
