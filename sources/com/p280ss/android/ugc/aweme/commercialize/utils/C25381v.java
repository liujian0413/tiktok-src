package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.v */
public final class C25381v {

    /* renamed from: a */
    public final String f66795a;

    /* renamed from: b */
    public final C0043i f66796b;

    /* renamed from: c */
    public final int f66797c;

    /* renamed from: d */
    public final String f66798d;

    /* renamed from: e */
    public final Bundle f66799e;

    /* renamed from: f */
    public final AwemeRawAd f66800f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.v$a */
    public static final class C25382a {

        /* renamed from: a */
        public String f66801a = "about:blank";

        /* renamed from: b */
        public int f66802b;

        /* renamed from: c */
        public String f66803c = "";

        /* renamed from: d */
        public Bundle f66804d;

        /* renamed from: e */
        public AwemeRawAd f66805e;

        /* renamed from: f */
        public C0043i f66806f;

        /* renamed from: a */
        public final C25381v mo65944a() {
            C25381v vVar = new C25381v(this.f66801a, this.f66806f, this.f66802b, this.f66803c, this.f66804d, this.f66805e);
            return vVar;
        }

        /* renamed from: a */
        public final C25382a mo65939a(int i) {
            C25382a aVar = this;
            aVar.f66802b = i;
            return aVar;
        }

        /* renamed from: a */
        public final C25382a mo65940a(C0043i iVar) {
            C25382a aVar = this;
            aVar.f66806f = iVar;
            return aVar;
        }

        /* renamed from: b */
        public final C25382a mo65945b(String str) {
            C7573i.m23587b(str, "title");
            C25382a aVar = this;
            aVar.f66803c = str;
            return aVar;
        }

        /* renamed from: a */
        public final C25382a mo65941a(Bundle bundle) {
            C7573i.m23587b(bundle, "bundle");
            C25382a aVar = this;
            aVar.f66804d = bundle;
            return aVar;
        }

        /* renamed from: a */
        public final C25382a mo65942a(AwemeRawAd awemeRawAd) {
            C25382a aVar = this;
            aVar.f66805e = awemeRawAd;
            return aVar;
        }

        /* renamed from: a */
        public final C25382a mo65943a(String str) {
            C7573i.m23587b(str, "url");
            C25382a aVar = this;
            aVar.f66801a = str;
            return aVar;
        }
    }

    public C25381v(String str, C0043i iVar, int i, String str2, Bundle bundle, AwemeRawAd awemeRawAd) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "title");
        this.f66795a = str;
        this.f66796b = iVar;
        this.f66797c = i;
        this.f66798d = str2;
        this.f66799e = bundle;
        this.f66800f = awemeRawAd;
    }
}
