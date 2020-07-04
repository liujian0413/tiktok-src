package com.bytedance.opensdk.core.base.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;
import kotlin.jvm.internal.C7573i;

public final class AppConfig implements Parcelable {
    public static final Creator CREATOR = new C12309a();

    /* renamed from: a */
    public final String f32669a;

    /* renamed from: b */
    public final String f32670b;

    /* renamed from: c */
    public final int f32671c;

    /* renamed from: d */
    public final String f32672d;

    /* renamed from: e */
    public final String f32673e;

    /* renamed from: f */
    public final String f32674f;

    /* renamed from: g */
    public Locale f32675g;

    /* renamed from: com.bytedance.opensdk.core.base.config.AppConfig$a */
    public static class C12309a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            AppConfig appConfig = new AppConfig(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (Locale) parcel.readSerializable());
            return appConfig;
        }

        public final Object[] newArray(int i) {
            return new AppConfig[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.f32669a);
        parcel.writeString(this.f32670b);
        parcel.writeInt(this.f32671c);
        parcel.writeString(this.f32672d);
        parcel.writeString(this.f32673e);
        parcel.writeString(this.f32674f);
        parcel.writeSerializable(this.f32675g);
    }

    public AppConfig(String str, String str2, int i, String str3, String str4, String str5, Locale locale) {
        C7573i.m23587b(str, "appName");
        C7573i.m23587b(str2, "appIcon");
        C7573i.m23587b(str3, "platformAppId");
        C7573i.m23587b(str4, "platform");
        C7573i.m23587b(str5, "deviceId");
        C7573i.m23587b(locale, "appLocale");
        this.f32669a = str;
        this.f32670b = str2;
        this.f32671c = i;
        this.f32672d = str3;
        this.f32673e = str4;
        this.f32674f = str5;
        this.f32675g = locale;
    }
}
