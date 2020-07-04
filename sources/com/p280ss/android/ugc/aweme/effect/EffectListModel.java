package com.p280ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectListModel */
public class EffectListModel implements Parcelable {
    public static final Creator<EffectListModel> CREATOR = new Creator<EffectListModel>() {
        /* renamed from: a */
        private static EffectListModel[] m89624a(int i) {
            return new EffectListModel[i];
        }

        /* renamed from: a */
        private static EffectListModel m89623a(Parcel parcel) {
            return new EffectListModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m89623a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m89624a(i);
        }
    };
    private ArrayList<EffectPointModel> mEffectPointModels;

    public EffectListModel() {
    }

    public int describeContents() {
        return 0;
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        if (this.mEffectPointModels == null) {
            return new ArrayList<>();
        }
        return this.mEffectPointModels;
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        this.mEffectPointModels = arrayList;
    }

    protected EffectListModel(Parcel parcel) {
        this.mEffectPointModels = new ArrayList<>();
        parcel.readList(this.mEffectPointModels, EffectPointModel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mEffectPointModels);
    }
}
