package com.bytedance.android.live.wallet.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;

public class FirstChargeCheck implements Parcelable {
    public static final Creator<FirstChargeCheck> CREATOR = new Creator<FirstChargeCheck>() {
        /* renamed from: a */
        private static FirstChargeCheck[] m13557a(int i) {
            return new FirstChargeCheck[i];
        }

        /* renamed from: a */
        private static FirstChargeCheck m13556a(Parcel parcel) {
            return new FirstChargeCheck(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m13556a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m13557a(i);
        }
    };
    @C6593c(mo15949a = "is_first_charge")

    /* renamed from: a */
    public boolean f11293a;
    @C6593c(mo15949a = "diamond")

    /* renamed from: b */
    public List<ChargeDeal> f11294b;
    @C6593c(mo15949a = "extra")

    /* renamed from: c */
    public FirstChargeCheckExtra f11295c;
    @C6593c(mo15949a = "first_charge_package")

    /* renamed from: d */
    public List<FirstChargePackage> f11296d;

    public static class FirstChargeCheckExtra implements Parcelable {
        public static final Creator<FirstChargeCheckExtra> CREATOR = new Creator<FirstChargeCheckExtra>() {
            /* renamed from: a */
            private static FirstChargeCheckExtra[] m13559a(int i) {
                return new FirstChargeCheckExtra[i];
            }

            /* renamed from: a */
            private static FirstChargeCheckExtra m13558a(Parcel parcel) {
                return new FirstChargeCheckExtra(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13558a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13559a(i);
            }
        };
        @C6593c(mo15949a = "giving_desc")

        /* renamed from: a */
        public String f11297a;
        @C6593c(mo15949a = "gift_img")

        /* renamed from: b */
        public ImageModel f11298b;
        @C6593c(mo15949a = "panel_top_img")

        /* renamed from: c */
        public ImageModel f11299c;
        @C6593c(mo15949a = "rule")

        /* renamed from: d */
        public List<String> f11300d;
        @C6593c(mo15949a = "panel_bottom_desc")

        /* renamed from: e */
        public List<RichTextModel> f11301e;
        @C6593c(mo15949a = "panel_bottom_bg_img")

        /* renamed from: f */
        FlexImageStruct f11302f;
        @C6593c(mo15949a = "panel_top_bg_img")

        /* renamed from: g */
        FlexImageStruct f11303g;
        @C6593c(mo15949a = "panel_top_desc")

        /* renamed from: h */
        public List<RichTextModel> f11304h;

        public static class RichTextModel implements Parcelable {
            public static final Creator<RichTextModel> CREATOR = new Creator<RichTextModel>() {
                /* renamed from: a */
                private static RichTextModel[] m13561a(int i) {
                    return new RichTextModel[i];
                }

                /* renamed from: a */
                private static RichTextModel m13560a(Parcel parcel) {
                    return new RichTextModel(parcel);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m13560a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m13561a(i);
                }
            };
            @C6593c(mo15949a = "type")

            /* renamed from: a */
            public String f11305a;
            @C6593c(mo15949a = "text")

            /* renamed from: b */
            public String f11306b;
            @C6593c(mo15949a = "img")

            /* renamed from: c */
            public ImageModel f11307c;
            @C6593c(mo15949a = "font_size")

            /* renamed from: d */
            public long f11308d;
            @C6593c(mo15949a = "font_color")

            /* renamed from: e */
            public String f11309e;
            @C6593c(mo15949a = "weight")

            /* renamed from: f */
            public int f11310f;

            public RichTextModel() {
            }

            public int describeContents() {
                return 0;
            }

            protected RichTextModel(Parcel parcel) {
                this.f11305a = parcel.readString();
                this.f11306b = parcel.readString();
                this.f11307c = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
                this.f11308d = parcel.readLong();
                this.f11309e = parcel.readString();
                this.f11310f = parcel.readInt();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f11305a);
                parcel.writeString(this.f11306b);
                parcel.writeParcelable(this.f11307c, i);
                parcel.writeLong(this.f11308d);
                parcel.writeString(this.f11309e);
                parcel.writeInt(this.f11310f);
            }
        }

        public FirstChargeCheckExtra() {
        }

        public int describeContents() {
            return 0;
        }

        protected FirstChargeCheckExtra(Parcel parcel) {
            this.f11297a = parcel.readString();
            this.f11298b = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f11299c = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f11300d = parcel.createStringArrayList();
            this.f11301e = parcel.createTypedArrayList(RichTextModel.CREATOR);
            this.f11302f = (FlexImageStruct) parcel.readParcelable(FlexImageStruct.class.getClassLoader());
            this.f11303g = (FlexImageStruct) parcel.readParcelable(FlexImageStruct.class.getClassLoader());
            this.f11304h = parcel.createTypedArrayList(RichTextModel.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11297a);
            parcel.writeParcelable(this.f11298b, i);
            parcel.writeParcelable(this.f11299c, i);
            parcel.writeStringList(this.f11300d);
            parcel.writeTypedList(this.f11301e);
            parcel.writeParcelable(this.f11302f, i);
            parcel.writeParcelable(this.f11303g, i);
            parcel.writeTypedList(this.f11304h);
        }
    }

    public static class FirstChargePackage implements Parcelable {
        public static final Creator<FirstChargePackage> CREATOR = new Creator<FirstChargePackage>() {
            /* renamed from: a */
            private static FirstChargePackage[] m13563a(int i) {
                return new FirstChargePackage[i];
            }

            /* renamed from: a */
            private static FirstChargePackage m13562a(Parcel parcel) {
                return new FirstChargePackage(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13562a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13563a(i);
            }
        };
        @C6593c(mo15949a = "title")

        /* renamed from: a */
        public String f11311a;
        @C6593c(mo15949a = "diamond_id")

        /* renamed from: b */
        public int f11312b;
        @C6593c(mo15949a = "item")

        /* renamed from: c */
        public List<FirstChargePackageItem> f11313c;

        public FirstChargePackage() {
        }

        public int describeContents() {
            return 0;
        }

        protected FirstChargePackage(Parcel parcel) {
            this.f11311a = parcel.readString();
            this.f11312b = parcel.readInt();
            this.f11313c = parcel.createTypedArrayList(FirstChargePackageItem.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11311a);
            parcel.writeInt(this.f11312b);
            parcel.writeTypedList(this.f11313c);
        }
    }

    public static class FirstChargePackageItem implements Parcelable {
        public static final Creator<FirstChargePackageItem> CREATOR = new Creator<FirstChargePackageItem>() {
            /* renamed from: a */
            private static FirstChargePackageItem[] m13565a(int i) {
                return new FirstChargePackageItem[i];
            }

            /* renamed from: a */
            private static FirstChargePackageItem m13564a(Parcel parcel) {
                return new FirstChargePackageItem(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13564a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13565a(i);
            }
        };
        @C6593c(mo15949a = "img")

        /* renamed from: a */
        public ImageModel f11314a;
        @C6593c(mo15949a = "desc")

        /* renamed from: b */
        public String f11315b;
        @C6593c(mo15949a = "elide_desc")

        /* renamed from: c */
        public String f11316c;

        public FirstChargePackageItem() {
        }

        public int describeContents() {
            return 0;
        }

        protected FirstChargePackageItem(Parcel parcel) {
            this.f11314a = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f11315b = parcel.readString();
            this.f11316c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f11314a, i);
            parcel.writeString(this.f11315b);
            parcel.writeString(this.f11316c);
        }
    }

    public static class FlexImageStruct implements Parcelable {
        public static final Creator<FlexImageStruct> CREATOR = new Creator<FlexImageStruct>() {
            /* renamed from: a */
            private static FlexImageStruct[] m13567a(int i) {
                return new FlexImageStruct[i];
            }

            /* renamed from: a */
            private static FlexImageStruct m13566a(Parcel parcel) {
                return new FlexImageStruct(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13566a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13567a(i);
            }
        };
        @C6593c(mo15949a = "url_list")

        /* renamed from: a */
        public List<String> f11317a;
        @C6593c(mo15949a = "uri")

        /* renamed from: b */
        public String f11318b;
        @C6593c(mo15949a = "flex_setting")

        /* renamed from: c */
        public List<Long> f11319c;

        public FlexImageStruct() {
        }

        public int describeContents() {
            return 0;
        }

        protected FlexImageStruct(Parcel parcel) {
            this.f11317a = parcel.createStringArrayList();
            this.f11318b = parcel.readString();
            this.f11319c = new ArrayList();
            parcel.readList(this.f11319c, Long.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.f11317a);
            parcel.writeString(this.f11318b);
            parcel.writeList(this.f11319c);
        }
    }

    public FirstChargeCheck() {
    }

    public int describeContents() {
        return 0;
    }

    protected FirstChargeCheck(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11293a = z;
        this.f11294b = parcel.createTypedArrayList(ChargeDeal.CREATOR);
        this.f11295c = (FirstChargeCheckExtra) parcel.readParcelable(FirstChargeCheckExtra.class.getClassLoader());
        this.f11296d = parcel.createTypedArrayList(FirstChargePackage.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f11293a ? (byte) 1 : 0);
        parcel.writeTypedList(this.f11294b);
        parcel.writeParcelable(this.f11295c, i);
        parcel.writeTypedList(this.f11296d);
    }
}
