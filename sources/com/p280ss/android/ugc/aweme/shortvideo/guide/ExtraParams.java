package com.p280ss.android.ugc.aweme.shortvideo.guide;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.ExtraParams */
public class ExtraParams implements Parcelable {
    public static final Creator<ExtraParams> CREATOR = new Creator<ExtraParams>() {
        /* renamed from: a */
        private static ExtraParams[] m127859a(int i) {
            return new ExtraParams[i];
        }

        /* renamed from: a */
        private static ExtraParams m127858a(Parcel parcel) {
            return new ExtraParams(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m127858a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m127859a(i);
        }
    };
    public static final int GIF_TYPE_HORIZONTAL = 1;
    public static final int GIF_TYPE_VERTICAL = 2;
    public static final int INTERACTION_URL = 1;
    @C6593c(mo15949a = "clickable_open_url")
    private String clickableOpenUrl;
    @C6593c(mo15949a = "clickable_web_url")
    private String clickableWebUrl;
    @C6593c(mo15949a = "gif_type")
    int gifType;
    @C6593c(mo15949a = "interaction_icon")
    String interactionIcon;
    @C6593c(mo15949a = "interaction_text")
    String interactionText;
    @C6593c(mo15949a = "interaction_type")
    int interactionType;
    @C6593c(mo15949a = "interaction_url")
    String interactionUrl;

    public ExtraParams() {
    }

    public int describeContents() {
        return 0;
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public boolean isGifValid() {
        if (1 == this.gifType || 2 == this.gifType) {
            return true;
        }
        return false;
    }

    public boolean isUrlInteractionStickerValid() {
        if (this.interactionType != 1 || C6319n.m19593a(this.interactionText) || (C6319n.m19593a(this.interactionUrl) && C6319n.m19593a(this.clickableOpenUrl) && C6319n.m19593a(this.clickableWebUrl))) {
            return false;
        }
        return true;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    protected ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
        this.clickableOpenUrl = parcel.readString();
        this.clickableWebUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
        parcel.writeString(this.clickableOpenUrl);
        parcel.writeString(this.clickableWebUrl);
    }
}
