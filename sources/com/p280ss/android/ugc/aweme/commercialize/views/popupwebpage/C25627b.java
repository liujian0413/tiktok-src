package com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b */
public final class C25627b {

    /* renamed from: a */
    public final Context f67496a;

    /* renamed from: b */
    public final AwemeRawAd f67497b;

    /* renamed from: c */
    public final int f67498c;

    /* renamed from: d */
    public final int f67499d;

    /* renamed from: e */
    public final String f67500e;

    /* renamed from: f */
    public final String f67501f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a */
    public static final class C25628a {

        /* renamed from: a */
        public Context f67502a;

        /* renamed from: b */
        public AwemeRawAd f67503b;

        /* renamed from: c */
        public int f67504c = 2;

        /* renamed from: d */
        public int f67505d;

        /* renamed from: e */
        public String f67506e;

        /* renamed from: f */
        public String f67507f;

        /* renamed from: a */
        public final C25627b mo66452a() {
            C25627b bVar = new C25627b(this.f67502a, this.f67503b, this.f67504c, this.f67505d, this.f67506e, this.f67507f);
            return bVar;
        }

        /* renamed from: a */
        public final C25628a mo66448a(int i) {
            C25628a aVar = this;
            aVar.f67504c = 3;
            return aVar;
        }

        /* renamed from: b */
        public final C25628a mo66453b(int i) {
            C25628a aVar = this;
            aVar.f67505d = i;
            return aVar;
        }

        /* renamed from: a */
        public final C25628a mo66449a(Context context) {
            C25628a aVar = this;
            aVar.f67502a = context;
            return aVar;
        }

        /* renamed from: b */
        public final C25628a mo66454b(String str) {
            C7573i.m23587b(str, "webTitle");
            C25628a aVar = this;
            aVar.f67507f = str;
            return aVar;
        }

        /* renamed from: a */
        public final C25628a mo66450a(AwemeRawAd awemeRawAd) {
            C25628a aVar = this;
            aVar.f67503b = awemeRawAd;
            return aVar;
        }

        /* renamed from: a */
        public final C25628a mo66451a(String str) {
            C7573i.m23587b(str, "webUrl");
            C25628a aVar = this;
            aVar.f67506e = str;
            return aVar;
        }
    }

    public C25627b(Context context, AwemeRawAd awemeRawAd, int i, int i2, String str, String str2) {
        this.f67496a = context;
        this.f67497b = awemeRawAd;
        this.f67498c = i;
        this.f67499d = i2;
        this.f67500e = str;
        this.f67501f = str2;
    }
}
