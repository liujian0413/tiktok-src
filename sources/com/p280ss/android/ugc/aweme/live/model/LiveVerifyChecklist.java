package com.p280ss.android.ugc.aweme.live.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist */
public class LiveVerifyChecklist implements Parcelable {
    public static final Creator<LiveVerifyChecklist> CREATOR = new Creator<LiveVerifyChecklist>() {
        /* renamed from: a */
        private static LiveVerifyChecklist[] m105353a(int i) {
            return new LiveVerifyChecklist[i];
        }

        /* renamed from: a */
        private static LiveVerifyChecklist m105352a(Parcel parcel) {
            return new LiveVerifyChecklist(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m105352a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m105353a(i);
        }
    };
    public boolean is_phone_binded;
    public boolean live_agreement;
    public boolean live_answer = true;
    public int realname_verify;

    public int describeContents() {
        return 0;
    }

    public LiveVerifyChecklist() {
    }

    protected LiveVerifyChecklist(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.realname_verify = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_phone_binded = z;
        if (parcel.readByte() == 0) {
            z2 = false;
        }
        this.live_agreement = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.realname_verify);
        parcel.writeByte(this.is_phone_binded ? (byte) 1 : 0);
        parcel.writeByte(this.live_agreement ? (byte) 1 : 0);
    }
}
