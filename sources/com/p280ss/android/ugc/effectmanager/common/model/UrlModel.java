package com.p280ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModel */
public class UrlModel implements Parcelable, Serializable {
    public static final Creator<UrlModel> CREATOR = new Creator<UrlModel>() {
        public final UrlModel[] newArray(int i) {
            return new UrlModel[i];
        }

        public final UrlModel createFromParcel(Parcel parcel) {
            return new UrlModel(parcel);
        }
    };
    protected String uri;
    protected List<String> url_list;

    public UrlModel() {
    }

    public int describeContents() {
        return 0;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.url_list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.url_list != null) {
            for (String str : this.url_list) {
                sb.append(" [");
                sb.append(str);
                sb.append("] ");
            }
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("UrlModel{url_list=");
        sb3.append(sb2);
        sb3.append('\'');
        sb3.append(", uri='");
        sb3.append(this.uri);
        sb3.append('\'');
        sb3.append('}');
        return sb3.toString();
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.url_list = list;
    }

    protected UrlModel(Parcel parcel) {
        this.url_list = parcel.createStringArrayList();
        this.uri = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.uri);
    }
}
