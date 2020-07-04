package com.p280ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectPointModel */
public class EffectPointModel implements Parcelable, Serializable, Cloneable {
    public static final Creator<EffectPointModel> CREATOR = new Creator<EffectPointModel>() {
        /* renamed from: a */
        private static EffectPointModel[] m89626a(int i) {
            return new EffectPointModel[i];
        }

        /* renamed from: a */
        private static EffectPointModel m89625a(Parcel parcel) {
            return new EffectPointModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m89625a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m89626a(i);
        }
    };
    private String category = "filter";
    private int duration;
    private int endPoint;
    private String extra;
    private int index;
    private boolean isFromEnd;
    private String key = "0";
    private String name;
    private String resDir;
    private int selectColor;
    private int startPoint;
    private int type;

    public int describeContents() {
        return 0;
    }

    public String getCategory() {
        return this.category;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getIndex() {
        return this.index;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getResDir() {
        return this.resDir;
    }

    public int getSelectColor() {
        return this.selectColor;
    }

    public int getStartPoint() {
        return this.startPoint;
    }

    public int getType() {
        return this.type;
    }

    public boolean isFromEnd() {
        return this.isFromEnd;
    }

    public EffectPointModel() {
    }

    public EffectPointModel clone() {
        try {
            return (EffectPointModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("key : ");
        sb.append(this.key);
        sb.append(" reaDir : ");
        sb.append(this.resDir);
        sb.append(" start: ");
        sb.append(this.startPoint);
        sb.append(", end: ");
        sb.append(this.endPoint);
        sb.append(", isFromEnd: ");
        sb.append(this.isFromEnd);
        return sb.toString();
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndPoint(int i) {
        this.endPoint = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFromEnd(boolean z) {
        this.isFromEnd = z;
    }

    public EffectPointModel setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setResDir(String str) {
        this.resDir = str;
    }

    public void setSelectColor(int i) {
        this.selectColor = i;
    }

    public void setStartPoint(int i) {
        this.startPoint = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    protected EffectPointModel(Parcel parcel) {
        boolean z;
        this.startPoint = parcel.readInt();
        this.endPoint = parcel.readInt();
        this.selectColor = parcel.readInt();
        this.key = parcel.readString();
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromEnd = z;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        this.category = parcel.readString();
        this.duration = parcel.readInt();
        this.extra = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.startPoint);
        parcel.writeInt(this.endPoint);
        parcel.writeInt(this.selectColor);
        parcel.writeString(this.key);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isFromEnd ? (byte) 1 : 0);
        parcel.writeString(this.resDir);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeInt(this.duration);
        parcel.writeString(this.extra);
    }
}
