package com.bytedance.opensdk.core.grant.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.opensdk.core.ApiInfo;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import java.util.Locale;
import kotlin.jvm.internal.C7573i;

public final class GrantConfig implements Parcelable {
    public static final Creator CREATOR = new C12324a();

    /* renamed from: a */
    public final int f32708a;

    /* renamed from: b */
    public final AppConfig f32709b;

    /* renamed from: c */
    public final GrantInfo f32710c;

    /* renamed from: d */
    public final String f32711d;

    /* renamed from: e */
    public final ApiInfo f32712e;

    /* renamed from: f */
    public final Locale f32713f;

    /* renamed from: com.bytedance.opensdk.core.grant.config.GrantConfig$a */
    public static class C12324a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            GrantConfig grantConfig = new GrantConfig(parcel.readInt(), (AppConfig) AppConfig.CREATOR.createFromParcel(parcel), (GrantInfo) GrantInfo.CREATOR.createFromParcel(parcel), parcel.readString(), (ApiInfo) Enum.valueOf(ApiInfo.class, parcel.readString()), (Locale) parcel.readSerializable());
            return grantConfig;
        }

        public final Object[] newArray(int i) {
            return new GrantConfig[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.f32708a);
        this.f32709b.writeToParcel(parcel, 0);
        this.f32710c.writeToParcel(parcel, 0);
        parcel.writeString(this.f32711d);
        parcel.writeString(this.f32712e.name());
        parcel.writeSerializable(this.f32713f);
    }

    public GrantConfig(int i, AppConfig appConfig, GrantInfo grantInfo, String str, ApiInfo apiInfo, Locale locale) {
        C7573i.m23587b(appConfig, "appConfig");
        C7573i.m23587b(grantInfo, "grantInfo");
        C7573i.m23587b(str, "hostAuthCode");
        C7573i.m23587b(apiInfo, "apiInfo");
        C7573i.m23587b(locale, "appLocale");
        this.f32708a = i;
        this.f32709b = appConfig;
        this.f32710c = grantInfo;
        this.f32711d = str;
        this.f32712e = apiInfo;
        this.f32713f = locale;
    }
}
