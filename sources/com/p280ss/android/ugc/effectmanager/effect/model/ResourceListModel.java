package com.p280ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel */
public class ResourceListModel implements Parcelable {
    public static final Creator<ResourceListModel> CREATOR = new Creator<ResourceListModel>() {
        public final ResourceListModel[] newArray(int i) {
            return new ResourceListModel[i];
        }

        public final ResourceListModel createFromParcel(Parcel parcel) {
            return new ResourceListModel(parcel);
        }
    };
    public String icon_uri;
    public String params;
    public List<ResourceListBean> resource_list;
    public List<String> url_prefix;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean */
    public static class ResourceListBean implements Parcelable {
        public static final Creator<ResourceListBean> CREATOR = new Creator<ResourceListBean>() {
            public final ResourceListBean[] newArray(int i) {
                return new ResourceListBean[i];
            }

            public final ResourceListBean createFromParcel(Parcel parcel) {
                return new ResourceListBean(parcel);
            }
        };
        public String name;
        public String resource_uri;
        public String value;

        public ResourceListBean() {
        }

        public int describeContents() {
            return 0;
        }

        protected ResourceListBean(Parcel parcel) {
            this.name = parcel.readString();
            this.value = parcel.readString();
            this.resource_uri = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }
    }

    public ResourceListModel() {
    }

    public int describeContents() {
        return 0;
    }

    protected ResourceListModel(Parcel parcel) {
        this.resource_list = parcel.createTypedArrayList(ResourceListBean.CREATOR);
        this.url_prefix = parcel.createStringArrayList();
        this.icon_uri = parcel.readString();
        this.params = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.resource_list);
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }
}
