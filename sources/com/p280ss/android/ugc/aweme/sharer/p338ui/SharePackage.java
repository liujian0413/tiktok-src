package com.p280ss.android.ugc.aweme.sharer.p338ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage */
public abstract class SharePackage implements Parcelable {

    /* renamed from: n */
    public static final C7220b f20180n = new C7220b(null);

    /* renamed from: g */
    public final String f20181g;

    /* renamed from: h */
    public final String f20182h;

    /* renamed from: i */
    public final String f20183i;

    /* renamed from: j */
    public final String f20184j;

    /* renamed from: k */
    public final String f20185k;

    /* renamed from: l */
    public final Bundle f20186l = new Bundle();

    /* renamed from: m */
    public final C7219a<? extends SharePackage> f20187m;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$a */
    public static abstract class C7219a<SP extends SharePackage> {

        /* renamed from: f */
        public String f20188f;

        /* renamed from: g */
        public String f20189g;

        /* renamed from: h */
        public String f20190h;

        /* renamed from: i */
        public String f20191i;

        /* renamed from: j */
        public String f20192j;

        /* renamed from: k */
        public final Bundle f20193k = new Bundle();

        /* renamed from: a */
        public abstract SP mo18866a();

        /* renamed from: d */
        public final C7219a<SP> mo18868d(String str) {
            C7573i.m23587b(str, "type");
            this.f20188f = str;
            return this;
        }

        /* renamed from: e */
        public final C7219a<SP> mo18869e(String str) {
            C7573i.m23587b(str, "id");
            this.f20189g = str;
            return this;
        }

        /* renamed from: f */
        public final C7219a<SP> mo18870f(String str) {
            C7573i.m23587b(str, "title");
            this.f20190h = str;
            return this;
        }

        /* renamed from: g */
        public final C7219a<SP> mo18871g(String str) {
            C7573i.m23587b(str, "desc");
            this.f20191i = str;
            return this;
        }

        /* renamed from: h */
        public final C7219a<SP> mo18872h(String str) {
            C7573i.m23587b(str, "url");
            this.f20192j = str;
            return this;
        }

        /* renamed from: b */
        public C7219a<SP> mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            this.f20188f = parcel.readString();
            this.f20189g = parcel.readString();
            this.f20190h = parcel.readString();
            this.f20191i = parcel.readString();
            this.f20192j = parcel.readString();
            this.f20193k.putAll(parcel.readBundle(getClass().getClassLoader()));
            return this;
        }

        /* renamed from: a */
        public final C7219a<SP> mo18865a(String str, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "value");
            this.f20193k.putString(str, str2);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$b */
    public static final class C7220b {
        private C7220b() {
        }

        public /* synthetic */ C7220b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public abstract C38354f mo18860a(C38343b bVar);

    /* renamed from: a */
    public boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: a */
    public boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public SharePackage(C7219a<? extends SharePackage> aVar) {
        C7573i.m23587b(aVar, "builder");
        this.f20187m = aVar;
        String str = this.f20187m.f20188f;
        if (str == null) {
            C7573i.m23580a();
        }
        this.f20181g = str;
        String str2 = this.f20187m.f20189g;
        if (str2 == null) {
            str2 = "";
        }
        this.f20182h = str2;
        String str3 = this.f20187m.f20190h;
        if (str3 == null) {
            str3 = "";
        }
        this.f20183i = str3;
        String str4 = this.f20187m.f20191i;
        if (str4 == null) {
            str4 = "";
        }
        this.f20184j = str4;
        String str5 = this.f20187m.f20192j;
        if (str5 == null) {
            str5 = "";
        }
        this.f20185k = str5;
        this.f20186l.putAll(this.f20187m.f20193k);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f20181g);
            parcel.writeString(this.f20182h);
            parcel.writeString(this.f20183i);
            parcel.writeString(this.f20184j);
            parcel.writeString(this.f20185k);
            parcel.writeBundle(this.f20186l);
        }
    }
}
