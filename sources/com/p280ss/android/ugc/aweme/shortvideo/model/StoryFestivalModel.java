package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel */
public final class StoryFestivalModel implements Parcelable, Serializable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private int transResult;
    private boolean useActivityEffect;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel$CREATOR */
    public static final class CREATOR implements Creator<StoryFestivalModel> {
        private CREATOR() {
        }

        public final StoryFestivalModel[] newArray(int i) {
            return new StoryFestivalModel[i];
        }

        public /* synthetic */ CREATOR(C7571f fVar) {
            this();
        }

        public final StoryFestivalModel createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new StoryFestivalModel(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getTransResult() {
        return this.transResult;
    }

    public final boolean getUseActivityEffect() {
        return this.useActivityEffect;
    }

    public StoryFestivalModel() {
        this.transResult = -1;
    }

    public final void setTransResult(int i) {
        this.transResult = i;
    }

    public final void setUseActivityEffect(boolean z) {
        this.useActivityEffect = z;
    }

    public StoryFestivalModel(Parcel parcel) {
        boolean z;
        C7573i.m23587b(parcel, "parcel");
        this();
        this.transResult = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useActivityEffect = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.transResult);
        parcel.writeByte(this.useActivityEffect ? (byte) 1 : 0);
    }
}
