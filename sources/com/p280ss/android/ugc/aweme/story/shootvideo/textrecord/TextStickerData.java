package com.p280ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39546b;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData */
public class TextStickerData implements Parcelable, C39546b, Cloneable {
    public static final Creator<TextStickerData> CREATOR = new Creator<TextStickerData>() {
        /* renamed from: a */
        private static TextStickerData[] m133725a(int i) {
            return new TextStickerData[i];
        }

        /* renamed from: a */
        private static TextStickerData m133724a(Parcel parcel) {
            return new TextStickerData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m133724a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m133725a(i);
        }
    };
    public boolean autoSelect;
    public int fontSize = 28;
    @C6593c(mo15949a = "align")
    public int mAlign;
    @C6593c(mo15949a = "bg_mode")
    public int mBgMode;
    @C6593c(mo15949a = "color")
    public int mColor;
    @C6593c(mo15949a = "edit_center_point")
    public Point mEditCenterPoint;
    public int mEndTime;
    @C6593c(mo15949a = "font_type")
    public String mFontType;
    public int mStartTime;
    @C6593c(mo15949a = "text_str")
    public String mTextStr;
    @C6593c(mo15949a = "text_str_ary")
    public String[] mTextStrAry;
    @C6593c(mo15949a = "r")
    public float rotation;
    @C6593c(mo15949a = "s")
    public float scale;

    /* renamed from: x */
    public float f109252x;

    /* renamed from: y */
    public float f109253y;

    public int describeContents() {
        return 0;
    }

    public boolean hasTimeData() {
        if (this.mEndTime != 0) {
            return true;
        }
        return false;
    }

    public TextStickerData clone() {
        try {
            return (TextStickerData) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean hasPositionData() {
        if (this.scale != 0.0f) {
            return true;
        }
        return false;
    }

    public boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        if (((long) this.mStartTime) > j || j > ((long) this.mEndTime)) {
            return false;
        }
        return true;
    }

    protected TextStickerData(Parcel parcel) {
        this.mTextStr = parcel.readString();
        this.mTextStrAry = parcel.createStringArray();
        this.mBgMode = parcel.readInt();
        this.mColor = parcel.readInt();
        this.mAlign = parcel.readInt();
        this.mFontType = parcel.readString();
        this.mEditCenterPoint = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.mStartTime = parcel.readInt();
        this.mEndTime = parcel.readInt();
        this.f109252x = parcel.readFloat();
        this.f109253y = parcel.readFloat();
        this.rotation = parcel.readFloat();
        this.scale = parcel.readFloat();
        this.fontSize = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTextStr);
        parcel.writeStringArray(this.mTextStrAry);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mAlign);
        parcel.writeString(this.mFontType);
        parcel.writeParcelable(this.mEditCenterPoint, i);
        parcel.writeInt(this.mStartTime);
        parcel.writeInt(this.mEndTime);
        parcel.writeFloat(this.f109252x);
        parcel.writeFloat(this.f109253y);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.fontSize);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this.mTextStr = str;
        this.mBgMode = i;
        this.mColor = i2;
        this.mAlign = i3;
        this.mFontType = str2;
        this.mEditCenterPoint = new Point();
    }
}
