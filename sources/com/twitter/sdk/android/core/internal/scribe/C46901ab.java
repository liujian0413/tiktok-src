package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ab */
public final class C46901ab extends C46931v {
    @C6593c(mo15949a = "language")

    /* renamed from: f */
    public final String f120266f;
    @C6593c(mo15949a = "event_info")

    /* renamed from: g */
    public final String f120267g;
    @C6593c(mo15949a = "external_ids")

    /* renamed from: h */
    public final C46902a f120268h;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ab$a */
    public class C46902a {
        @C6593c(mo15949a = "6")

        /* renamed from: a */
        public final String f120269a;

        public C46902a(String str) {
            this.f120269a = str;
        }
    }

    public C46901ab(C46908e eVar, String str, long j, String str2, String str3, List<ScribeItem> list) {
        super("tfw_client_event", eVar, j, list);
        this.f120266f = str2;
        this.f120267g = str;
        this.f120268h = new C46902a(str3);
    }
}
