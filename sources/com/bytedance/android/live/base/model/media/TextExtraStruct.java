package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;

public class TextExtraStruct implements Parcelable {
    public static final Creator<TextExtraStruct> CREATOR = new Creator<TextExtraStruct>() {
        /* renamed from: a */
        private static TextExtraStruct[] m9963a(int i) {
            return new TextExtraStruct[i];
        }

        /* renamed from: a */
        private static TextExtraStruct m9962a(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m9962a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m9963a(i);
        }
    };
    @C6593c(mo15949a = "end")
    private int end;
    private transient boolean isAddPosition;
    @C6593c(mo15949a = "start")
    private int start;
    @C6593c(mo15949a = "user_id")
    private long userId;

    public TextExtraStruct() {
    }

    public int describeContents() {
        return 0;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isAddPosition() {
        return this.isAddPosition;
    }

    public void setAddPosition(boolean z) {
        this.isAddPosition = z;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    protected TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}
