package com.p280ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse */
public class EffectCategoryResponse implements Parcelable {
    public static final Creator<EffectCategoryResponse> CREATOR = new Creator<EffectCategoryResponse>() {
        public final EffectCategoryResponse[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }

        public final EffectCategoryResponse createFromParcel(Parcel parcel) {
            return new EffectCategoryResponse(parcel);
        }
    };
    public List<Effect> addedEffects;
    public List<Effect> collectionEffect;
    public List<Effect> deletedEffects;
    public String extra;
    public Effect frontEffect;
    public String icon_normal_url;
    public String icon_selected_url;

    /* renamed from: id */
    public String f113500id;
    public boolean is_default;
    public String key;
    public String name;
    public Effect rearEffect;
    public List<String> tags;
    public String tagsUpdateTime;
    public List<Effect> totalEffects;

    public EffectCategoryResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EffectCategoryResponse{id='");
        sb.append(this.f113500id);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", key='");
        sb.append(this.key);
        sb.append('\'');
        sb.append(", collection='");
        sb.append(this.collectionEffect);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected EffectCategoryResponse(Parcel parcel) {
        this.f113500id = parcel.readString();
        this.name = parcel.readString();
        this.key = parcel.readString();
        this.icon_normal_url = parcel.readString();
        this.icon_selected_url = parcel.readString();
        this.frontEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.rearEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.totalEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.addedEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.deletedEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.tags = parcel.createStringArrayList();
        this.tagsUpdateTime = parcel.readString();
        this.collectionEffect = parcel.createTypedArrayList(Effect.CREATOR);
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.is_default = z;
        this.extra = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f113500id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.frontEffect, i);
        parcel.writeParcelable(this.rearEffect, i);
        parcel.writeTypedList(this.totalEffects);
        parcel.writeTypedList(this.addedEffects);
        parcel.writeTypedList(this.deletedEffects);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tagsUpdateTime);
        parcel.writeTypedList(this.collectionEffect);
        parcel.writeByte(this.is_default ? (byte) 1 : 0);
        parcel.writeString(this.extra);
    }

    public EffectCategoryResponse(String str, String str2, String str3, List<Effect> list, List<String> list2, String str4) {
        this.f113500id = str;
        this.name = str2;
        this.key = str3;
        this.totalEffects = list;
    }

    public EffectCategoryResponse(String str, String str2, String str3, List<Effect> list, List<String> list2, String str4, List<Effect> list3) {
        this.f113500id = str;
        this.name = str2;
        this.key = str3;
        this.totalEffects = list;
        this.collectionEffect = list3;
    }
}
