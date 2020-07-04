package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ai */
public abstract class C24937ai {

    /* renamed from: a */
    public boolean f65768a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ai$a */
    public static final class C24938a {

        /* renamed from: a */
        public Context f65769a;

        /* renamed from: b */
        public String f65770b;

        /* renamed from: c */
        public String f65771c;

        /* renamed from: d */
        public String f65772d;

        /* renamed from: e */
        public long f65773e;

        /* renamed from: f */
        public JSONObject f65774f;

        public C24938a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
            this.f65769a = context;
            this.f65770b = str;
            this.f65771c = str2;
            this.f65772d = str3;
            this.f65773e = j;
            this.f65774f = jSONObject;
        }
    }

    /* renamed from: a */
    public abstract boolean mo65212a(C24938a aVar);

    /* renamed from: b */
    public abstract boolean mo65213b(C24938a aVar);

    /* renamed from: c */
    public final boolean mo65214c(C24938a aVar) {
        C7573i.m23587b(aVar, "params");
        if (!this.f65768a || !mo65212a(aVar) || !mo65213b(aVar)) {
            return false;
        }
        return true;
    }
}
