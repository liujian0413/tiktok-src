package com.p280ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VEWatermarkParam */
public class VEWatermarkParam implements Parcelable {
    public static final Creator<VEWatermarkParam> CREATOR = new Creator<VEWatermarkParam>() {
        /* renamed from: a */
        private static VEWatermarkParam[] m142737a(int i) {
            return new VEWatermarkParam[i];
        }

        /* renamed from: a */
        private static VEWatermarkParam m142736a(Parcel parcel) {
            return new VEWatermarkParam(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142736a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142737a(i);
        }
    };
    public long duration = -1;
    public String extFile;
    public int height;
    public String[] images;
    public int interval;
    public VEWatermarkMask mask;
    public boolean needExtFile;
    public VEWaterMarkPosition position = VEWaterMarkPosition.TL_BR;
    public int rotation;
    public String[] secondHalfImages;
    public Bitmap waterMarkBitmap;
    public int width;
    public int xOffset;
    public int yOffset;

    /* renamed from: com.ss.android.vesdk.VEWatermarkParam$VEWatermarkMask */
    public static class VEWatermarkMask implements Parcelable {
        public static final Creator<VEWatermarkMask> CREATOR = new Creator<VEWatermarkMask>() {
            /* renamed from: a */
            private static VEWatermarkMask[] m142739a(int i) {
                return new VEWatermarkMask[i];
            }

            /* renamed from: a */
            private static VEWatermarkMask m142738a(Parcel parcel) {
                return new VEWatermarkMask(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m142738a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m142739a(i);
            }
        };
        public int height;
        public String maskImage;
        public int width;
        public int xOffset;
        public int yOffset;

        public VEWatermarkMask() {
        }

        public int describeContents() {
            return 0;
        }

        protected VEWatermarkMask(Parcel parcel) {
            this.maskImage = parcel.readString();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maskImage);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    public int describeContents() {
        return 0;
    }

    public VEWatermarkParam() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" needExtFile ");
        sb.append(this.needExtFile);
        return sb.toString();
    }

    protected VEWatermarkParam(Parcel parcel) {
        boolean z;
        VEWaterMarkPosition vEWaterMarkPosition;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needExtFile = z;
        this.extFile = parcel.readString();
        this.images = parcel.createStringArray();
        this.waterMarkBitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.secondHalfImages = parcel.createStringArray();
        this.interval = parcel.readInt();
        this.xOffset = parcel.readInt();
        this.yOffset = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            vEWaterMarkPosition = null;
        } else {
            vEWaterMarkPosition = VEWaterMarkPosition.values()[readInt];
        }
        this.position = vEWaterMarkPosition;
        this.mask = (VEWatermarkMask) parcel.readParcelable(VEWatermarkMask.class.getClassLoader());
        this.rotation = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByte(this.needExtFile ? (byte) 1 : 0);
        parcel.writeString(this.extFile);
        parcel.writeStringArray(this.images);
        parcel.writeParcelable(this.waterMarkBitmap, i);
        parcel.writeStringArray(this.secondHalfImages);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.xOffset);
        parcel.writeInt(this.yOffset);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        if (this.position == null) {
            i2 = -1;
        } else {
            i2 = this.position.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.mask, i);
        parcel.writeInt(this.rotation);
    }
}
