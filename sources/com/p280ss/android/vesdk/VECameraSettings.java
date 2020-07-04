package com.p280ss.android.vesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.vesdk.VEConfigCenter.C45182a;

/* renamed from: com.ss.android.vesdk.VECameraSettings */
public class VECameraSettings implements Parcelable {
    public static final Creator<VECameraSettings> CREATOR = new Creator<VECameraSettings>() {
        /* renamed from: a */
        private static VECameraSettings[] m142431a(int i) {
            return new VECameraSettings[i];
        }

        /* renamed from: a */
        private static VECameraSettings m142430a(Parcel parcel) {
            return new VECameraSettings(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142430a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142431a(i);
        }
    };

    /* renamed from: a */
    public static final String f116121a = "VECameraSettings";

    /* renamed from: d */
    public static final String[] f116122d = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};

    /* renamed from: b */
    int[] f116123b;

    /* renamed from: c */
    int[] f116124c;

    /* renamed from: e */
    public int f116125e;

    /* renamed from: f */
    public VESize f116126f;

    /* renamed from: g */
    public int[] f116127g;

    /* renamed from: h */
    public CAMERA_HW_LEVEL f116128h;

    /* renamed from: i */
    public CAMERA_TYPE f116129i;

    /* renamed from: j */
    public CAMERA_FACING_ID f116130j;

    /* renamed from: k */
    public String f116131k;

    /* renamed from: l */
    public String f116132l;

    /* renamed from: m */
    public boolean f116133m;

    /* renamed from: n */
    public boolean f116134n;

    /* renamed from: o */
    public int f116135o;

    /* renamed from: p */
    public boolean f116136p;

    /* renamed from: q */
    public byte f116137q;

    /* renamed from: r */
    public VESize f116138r;

    /* renamed from: s */
    public CAMERA_OUTPUT_MODE f116139s;

    /* renamed from: t */
    public boolean f116140t;

    /* renamed from: u */
    public CAMERA_MODE_TYPE f116141u;

    /* renamed from: v */
    public boolean f116142v;

    /* renamed from: w */
    public int f116143w;

    /* renamed from: x */
    public Bundle f116144x;

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID */
    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD;
        
        public static final Creator<CAMERA_FACING_ID> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_FACING_ID>() {
                /* renamed from: a */
                private static CAMERA_FACING_ID[] m142433a(int i) {
                    return new CAMERA_FACING_ID[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142432a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142433a(i);
                }

                /* renamed from: a */
                private static CAMERA_FACING_ID m142432a(Parcel parcel) {
                    return CAMERA_FACING_ID.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_FLASH_MODE */
    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;
        
        public static final Creator<CAMERA_FLASH_MODE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_FLASH_MODE>() {
                /* renamed from: a */
                private static CAMERA_FLASH_MODE[] m142435a(int i) {
                    return new CAMERA_FLASH_MODE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142434a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142435a(i);
                }

                /* renamed from: a */
                private static CAMERA_FLASH_MODE m142434a(Parcel parcel) {
                    return CAMERA_FLASH_MODE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_HW_LEVEL */
    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;
        
        public static final Creator<CAMERA_HW_LEVEL> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_HW_LEVEL>() {
                /* renamed from: a */
                private static CAMERA_HW_LEVEL[] m142437a(int i) {
                    return new CAMERA_HW_LEVEL[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142436a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142437a(i);
                }

                /* renamed from: a */
                private static CAMERA_HW_LEVEL m142436a(Parcel parcel) {
                    return CAMERA_HW_LEVEL.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_MODE_TYPE */
    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE;
        
        public static final Creator<CAMERA_MODE_TYPE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_MODE_TYPE>() {
                /* renamed from: a */
                private static CAMERA_MODE_TYPE[] m142439a(int i) {
                    return new CAMERA_MODE_TYPE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142438a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142439a(i);
                }

                /* renamed from: a */
                private static CAMERA_MODE_TYPE m142438a(Parcel parcel) {
                    return CAMERA_MODE_TYPE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE */
    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME;
        
        public static final Creator<CAMERA_OUTPUT_MODE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_OUTPUT_MODE>() {
                /* renamed from: a */
                private static CAMERA_OUTPUT_MODE[] m142441a(int i) {
                    return new CAMERA_OUTPUT_MODE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142440a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142441a(i);
                }

                /* renamed from: a */
                private static CAMERA_OUTPUT_MODE m142440a(Parcel parcel) {
                    return CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_TYPE */
    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_CHRYCamera,
        TYPE_Mi,
        TYPE_Oppo,
        TYPE_CamKit,
        TYPE_Vivo;
        
        public static final Creator<CAMERA_TYPE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<CAMERA_TYPE>() {
                /* renamed from: a */
                private static CAMERA_TYPE[] m142443a(int i) {
                    return new CAMERA_TYPE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142442a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142443a(i);
                }

                /* renamed from: a */
                private static CAMERA_TYPE m142442a(Parcel parcel) {
                    return CAMERA_TYPE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$a */
    public static class C45180a {

        /* renamed from: a */
        public VECameraSettings f116145a;

        public C45180a() {
            this.f116145a = new VECameraSettings();
        }

        public C45180a(VECameraSettings vECameraSettings) {
            this.f116145a = vECameraSettings;
        }

        /* renamed from: a */
        public final C45180a mo107818a(byte b) {
            this.f116145a.f116137q = b;
            return this;
        }

        /* renamed from: b */
        public final C45180a mo107826b(int i) {
            this.f116145a.f116143w = 2;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107819a(int i) {
            this.f116145a.f116125e = 0;
            return this;
        }

        /* renamed from: b */
        public final C45180a mo107827b(boolean z) {
            this.f116145a.f116140t = z;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107821a(CAMERA_FACING_ID camera_facing_id) {
            C45182a a = VEConfigCenter.m142457a().mo107838a("wide_camera_id");
            if (a != null && (a.f116149b instanceof String)) {
                this.f116145a.f116131k = (String) a.f116149b;
            }
            this.f116145a.f116130j = camera_facing_id;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107822a(CAMERA_HW_LEVEL camera_hw_level) {
            this.f116145a.f116128h = camera_hw_level;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107823a(CAMERA_OUTPUT_MODE camera_output_mode) {
            this.f116145a.f116139s = camera_output_mode;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107824a(CAMERA_TYPE camera_type) {
            this.f116145a.f116129i = camera_type;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107825a(boolean z) {
            this.f116145a.f116133m = z;
            return this;
        }

        /* renamed from: a */
        public final C45180a mo107820a(int i, int i2) {
            this.f116145a.f116126f = new VESize(i, i2);
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    private VECameraSettings() {
        this.f116123b = new int[]{2, 0, 1, 3};
        this.f116124c = new int[]{1, 2, 0, 3};
        this.f116125e = 30;
        this.f116126f = new VESize(720, 1280);
        this.f116127g = new int[]{7, 30};
        this.f116128h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f116129i = CAMERA_TYPE.TYPE1;
        this.f116130j = CAMERA_FACING_ID.FACING_FRONT;
        this.f116131k = "-1";
        this.f116132l = "auto";
        this.f116133m = false;
        this.f116134n = false;
        this.f116135o = 0;
        this.f116136p = false;
        this.f116137q = 1;
        this.f116138r = new VESize(-1, -1);
        this.f116139s = CAMERA_OUTPUT_MODE.SURFACE;
        this.f116140t = true;
        this.f116141u = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f116142v = false;
        this.f116143w = 0;
        this.f116129i = CAMERA_TYPE.TYPE1;
        this.f116130j = CAMERA_FACING_ID.FACING_FRONT;
        this.f116125e = 30;
        this.f116126f.f116385a = 720;
        this.f116126f.f116386b = 1280;
        this.f116144x = new Bundle();
    }

    protected VECameraSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f116123b = new int[]{2, 0, 1, 3};
        this.f116124c = new int[]{1, 2, 0, 3};
        this.f116125e = 30;
        this.f116126f = new VESize(720, 1280);
        this.f116127g = new int[]{7, 30};
        this.f116128h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f116129i = CAMERA_TYPE.TYPE1;
        this.f116130j = CAMERA_FACING_ID.FACING_FRONT;
        this.f116131k = "-1";
        this.f116132l = "auto";
        boolean z4 = false;
        this.f116133m = false;
        this.f116134n = false;
        this.f116135o = 0;
        this.f116136p = false;
        this.f116137q = 1;
        this.f116138r = new VESize(-1, -1);
        this.f116139s = CAMERA_OUTPUT_MODE.SURFACE;
        this.f116140t = true;
        this.f116141u = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f116142v = false;
        this.f116143w = 0;
        this.f116123b = parcel.createIntArray();
        this.f116124c = parcel.createIntArray();
        this.f116125e = parcel.readInt();
        this.f116126f = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f116127g = parcel.createIntArray();
        this.f116128h = (CAMERA_HW_LEVEL) parcel.readParcelable(CAMERA_HW_LEVEL.class.getClassLoader());
        this.f116129i = (CAMERA_TYPE) parcel.readParcelable(CAMERA_TYPE.class.getClassLoader());
        this.f116130j = (CAMERA_FACING_ID) parcel.readParcelable(CAMERA_FACING_ID.class.getClassLoader());
        this.f116131k = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f116133m = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f116134n = z2;
        this.f116132l = parcel.readString();
        this.f116137q = parcel.readByte();
        this.f116138r = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f116135o = parcel.readInt();
        this.f116139s = (CAMERA_OUTPUT_MODE) parcel.readParcelable(CAMERA_OUTPUT_MODE.class.getClassLoader());
        this.f116144x = parcel.readBundle();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f116140t = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f116142v = z4;
        this.f116141u = (CAMERA_MODE_TYPE) parcel.readParcelable(CAMERA_MODE_TYPE.class.getClassLoader());
        this.f116143w = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f116123b);
        parcel.writeIntArray(this.f116124c);
        parcel.writeInt(this.f116125e);
        parcel.writeParcelable(this.f116126f, i);
        parcel.writeIntArray(this.f116127g);
        parcel.writeParcelable(this.f116128h, i);
        parcel.writeParcelable(this.f116129i, i);
        parcel.writeParcelable(this.f116130j, i);
        parcel.writeString(this.f116131k);
        parcel.writeByte(this.f116133m ? (byte) 1 : 0);
        parcel.writeByte(this.f116134n ? (byte) 1 : 0);
        parcel.writeString(this.f116132l);
        parcel.writeByte(this.f116137q);
        parcel.writeParcelable(this.f116138r, i);
        parcel.writeInt(this.f116135o);
        parcel.writeParcelable(this.f116139s, i);
        parcel.writeBundle(this.f116144x);
        parcel.writeByte(this.f116140t ? (byte) 1 : 0);
        parcel.writeByte(this.f116142v ? (byte) 1 : 0);
        parcel.writeParcelable(this.f116141u, i);
        parcel.writeInt(this.f116143w);
    }
}
