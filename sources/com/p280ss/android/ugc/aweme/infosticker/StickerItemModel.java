package com.p280ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.infosticker.StickerItemModel */
public class StickerItemModel implements Parcelable, Serializable, Cloneable {
    public static final Creator<StickerItemModel> CREATOR = new Creator<StickerItemModel>() {
        /* renamed from: a */
        private static StickerItemModel[] m104111a(int i) {
            return new StickerItemModel[i];
        }

        /* renamed from: a */
        private static StickerItemModel m104110a(Parcel parcel) {
            return new StickerItemModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m104110a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m104111a(i);
        }
    };
    @C6593c(mo15949a = "current_offsetX")
    public float currentOffsetX = 0.5f;
    @C6593c(mo15949a = "current_offsetY")
    public float currentOffsetY = 0.5f;
    @C6593c(mo15949a = "end_time")
    public int endTime;
    @C6593c(mo15949a = "extra")
    public String extra;

    /* renamed from: id */
    public transient int f83875id;
    @C6593c(mo15949a = "init_height")
    public float initHeight;
    @C6593c(mo15949a = "init_width")
    public float initWidth;
    @C6593c(mo15949a = "isAnimate")
    public boolean isAnimate;
    public boolean isImageStickerLayer;
    @C6593c(mo15949a = "is_pin")
    public boolean isPin;
    @C6593c(mo15949a = "layer_weight")
    public int layerWeight;
    @C6593c(mo15949a = "lyric_color")
    public int mLyricColor = -1;
    @C6593c(mo15949a = "lyric_fontPath")
    public String mLyricFontPath;
    @C6593c(mo15949a = "lyric_in_point")
    public int mLyricInPoint;
    @C6593c(mo15949a = "lyric_info")
    public String mLyricInfo;
    @C6593c(mo15949a = "lyric_out_point")
    public int mLyricOutPoint;
    @C6593c(mo15949a = "lyric_start_time")
    public int mLyricStartTime;
    @C6593c(mo15949a = "path")
    public String path;
    @C6593c(mo15949a = "pin_algorithm_file")
    public String pinAlgorithmFile;
    @C6593c(mo15949a = "angle")
    public float rotateAngle;
    @C6593c(mo15949a = "scale")
    public float scale = 1.0f;
    @C6593c(mo15949a = "start_time")
    public int startTime;
    @C6593c(mo15949a = "sticker_id")
    public String stickerId;
    public int type;

    public int describeContents() {
        return 0;
    }

    public String getPinAlgorithmFile() {
        return this.pinAlgorithmFile;
    }

    public String getText() {
        return this.path;
    }

    public boolean isPin() {
        return this.isPin;
    }

    /* access modifiers changed from: protected */
    public StickerItemModel clone() {
        try {
            return (StickerItemModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean isInfoSticker() {
        if (this.type == 1 || this.type == 2) {
            return false;
        }
        return true;
    }

    public boolean isLyric() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public boolean isSubtitle() {
        return "subtitle".equals(this.extra);
    }

    public boolean isSubtitleRule() {
        return "subtitle_rule".equals(this.extra);
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f83875id * 31) + this.stickerId.hashCode()) * 31) + this.path.hashCode()) * 31;
        if (this.extra != null) {
            i = this.extra.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public StickerItemModel dumpClonedData() {
        StickerItemModel stickerItemModel = new StickerItemModel(this.stickerId, this.path, this.extra, this.layerWeight, this.isAnimate, this.startTime, this.endTime);
        stickerItemModel.scale = this.scale;
        stickerItemModel.rotateAngle = this.rotateAngle;
        stickerItemModel.initHeight = this.initHeight;
        stickerItemModel.initWidth = this.initWidth;
        stickerItemModel.currentOffsetX = this.currentOffsetX;
        stickerItemModel.currentOffsetY = this.currentOffsetY;
        stickerItemModel.isAnimate = this.isAnimate;
        stickerItemModel.isImageStickerLayer = this.isImageStickerLayer;
        stickerItemModel.type = this.type;
        stickerItemModel.pinAlgorithmFile = this.pinAlgorithmFile;
        stickerItemModel.isPin = this.isPin;
        return stickerItemModel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StickerItemModel{id=");
        sb.append(this.f83875id);
        sb.append(", stickerId='");
        sb.append(this.stickerId);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", extra='");
        sb.append(this.extra);
        sb.append('\'');
        sb.append(", scale=");
        sb.append(this.scale);
        sb.append(", rotateAngle=");
        sb.append(this.rotateAngle);
        sb.append(", layerWeight=");
        sb.append(this.layerWeight);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", initWidth=");
        sb.append(this.initWidth);
        sb.append(", initHeight=");
        sb.append(this.initHeight);
        sb.append(", currentOffsetX=");
        sb.append(this.currentOffsetX);
        sb.append(", currentOffsetY=");
        sb.append(this.currentOffsetY);
        sb.append('}');
        return sb.toString();
    }

    public void setPin(boolean z) {
        this.isPin = z;
    }

    public void setPinAlgorithmFile(String str) {
        this.pinAlgorithmFile = str;
    }

    public void updateLayerWeight(int i) {
        this.layerWeight = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        StickerItemModel stickerItemModel = (StickerItemModel) obj;
        if (this.f83875id != stickerItemModel.f83875id || !this.path.equals(stickerItemModel.path) || !this.stickerId.equals(stickerItemModel.stickerId)) {
            return false;
        }
        if (this.extra != null) {
            return this.extra.equals(stickerItemModel.extra);
        }
        if (stickerItemModel.extra == null) {
            return true;
        }
        return false;
    }

    protected StickerItemModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.stickerId = parcel.readString();
        this.path = parcel.readString();
        this.extra = parcel.readString();
        this.scale = parcel.readFloat();
        this.rotateAngle = parcel.readFloat();
        this.layerWeight = parcel.readInt();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.initWidth = parcel.readFloat();
        this.initHeight = parcel.readFloat();
        this.currentOffsetX = parcel.readFloat();
        this.currentOffsetY = parcel.readFloat();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimate = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isImageStickerLayer = z2;
        this.type = parcel.readInt();
        this.pinAlgorithmFile = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.isPin = z3;
        this.mLyricInfo = parcel.readString();
        this.mLyricFontPath = parcel.readString();
        this.mLyricColor = parcel.readInt();
        this.mLyricInPoint = parcel.readInt();
        this.mLyricStartTime = parcel.readInt();
        this.mLyricOutPoint = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.extra);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.rotateAngle);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeFloat(this.initWidth);
        parcel.writeFloat(this.initHeight);
        parcel.writeFloat(this.currentOffsetX);
        parcel.writeFloat(this.currentOffsetY);
        parcel.writeByte(this.isAnimate ? (byte) 1 : 0);
        parcel.writeByte(this.isImageStickerLayer ? (byte) 1 : 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.pinAlgorithmFile);
        parcel.writeByte(this.isPin ? (byte) 1 : 0);
        parcel.writeString(this.mLyricInfo);
        parcel.writeString(this.mLyricFontPath);
        parcel.writeInt(this.mLyricColor);
        parcel.writeInt(this.mLyricInPoint);
        parcel.writeInt(this.mLyricStartTime);
        parcel.writeInt(this.mLyricOutPoint);
    }

    public StickerItemModel(String str, String str2, String str3, int i, boolean z, int i2, int i3) {
        this.stickerId = str;
        this.path = str2;
        this.extra = str3;
        this.layerWeight = i;
        this.isAnimate = z;
        this.startTime = i2;
        this.endTime = i3;
    }
}
