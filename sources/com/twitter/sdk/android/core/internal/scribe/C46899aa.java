package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.aa */
public final class C46899aa extends C46931v {
    @C6593c(mo15949a = "external_ids")

    /* renamed from: f */
    public final C46900a f120261f;
    @C6593c(mo15949a = "device_id_created_at")

    /* renamed from: g */
    public final long f120262g = 0;
    @C6593c(mo15949a = "language")

    /* renamed from: h */
    public final String f120263h;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.aa$a */
    public class C46900a {
        @C6593c(mo15949a = "AD_ID")

        /* renamed from: a */
        public final String f120264a;

        public C46900a(String str) {
            this.f120264a = str;
        }
    }

    public C46899aa(C46908e eVar, long j, String str, String str2, List<ScribeItem> list) {
        super("syndicated_sdk_impression", eVar, j, list);
        this.f120263h = str;
        this.f120261f = new C46900a(str2);
    }
}
