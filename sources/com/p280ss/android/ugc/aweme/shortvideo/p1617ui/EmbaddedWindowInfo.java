package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo */
public final class EmbaddedWindowInfo implements Parcelable {
    public static final C41140a CREATOR = new C41140a(null);
    @C6593c(mo15949a = "w")

    /* renamed from: a */
    public int f107063a;
    @C6593c(mo15949a = "h")

    /* renamed from: b */
    public int f107064b;
    @C6593c(mo15949a = "x")

    /* renamed from: c */
    public int f107065c;
    @C6593c(mo15949a = "y")

    /* renamed from: d */
    public int f107066d;
    @C6593c(mo15949a = "s")

    /* renamed from: e */
    public int f107067e;
    @C6593c(mo15949a = "e")

    /* renamed from: f */
    public int f107068f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo$a */
    public static final class C41140a implements Creator<EmbaddedWindowInfo> {
        private C41140a() {
        }

        /* renamed from: a */
        private static EmbaddedWindowInfo[] m131336a(int i) {
            return new EmbaddedWindowInfo[i];
        }

        public /* synthetic */ C41140a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m131334a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m131336a(i);
        }

        /* renamed from: a */
        private static EmbaddedWindowInfo m131334a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new EmbaddedWindowInfo(parcel);
        }

        /* renamed from: a */
        public static List<EmbaddedWindowInfo> m131335a(int i, int i2) {
            EmbaddedWindowInfo embaddedWindowInfo = new EmbaddedWindowInfo();
            embaddedWindowInfo.f107065c = 0;
            embaddedWindowInfo.f107066d = 0;
            embaddedWindowInfo.f107063a = i;
            embaddedWindowInfo.f107064b = i2;
            embaddedWindowInfo.f107067e = 0;
            embaddedWindowInfo.f107068f = Integer.MAX_VALUE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(embaddedWindowInfo);
            return arrayList;
        }
    }

    public EmbaddedWindowInfo() {
    }

    public final int describeContents() {
        return 0;
    }

    public EmbaddedWindowInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        this.f107063a = parcel.readInt();
        this.f107064b = parcel.readInt();
        this.f107065c = parcel.readInt();
        this.f107066d = parcel.readInt();
        this.f107067e = parcel.readInt();
        this.f107068f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.f107063a);
        parcel.writeInt(this.f107064b);
        parcel.writeInt(this.f107065c);
        parcel.writeInt(this.f107066d);
        parcel.writeInt(this.f107067e);
        parcel.writeInt(this.f107068f);
    }
}
