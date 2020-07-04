package com.bytedance.android.livesdk.browser.shorturl;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public final class ShortUrlService implements C4222a {

    /* renamed from: a */
    private ShortUrlApi f12325a;

    interface ShortUrlApi {
        @C6457h(mo15740a = "/hotsoon/share/link_command/")
        C7492s<C3479d<Object>> linkCommand(@C6474y(mo15757a = "url_schema_url") String str);

        @C6457h(mo15740a = "/hotsoon/short_url/gene/")
        C7492s<Object> shortenUrl(@C6474y(mo15757a = "long_url") String str, @C6474y(mo15757a = "target") String str2);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.shorturl.ShortUrlService$a */
    public static final class C4221a implements C9174b<C4222a> {
        /* renamed from: a */
        public final C9175a<C4222a> mo11528a(C9175a<C4222a> aVar) {
            return aVar.mo22388a(new ShortUrlService()).mo22387a();
        }
    }

    private ShortUrlService() {
        this.f12325a = (ShortUrlApi) C9178j.m27302j().mo22373b().mo10440a(ShortUrlApi.class);
    }
}
