package com.p280ss.android.ugc.aweme.live.feedpage;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.f */
public final class C32523f extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "data")

    /* renamed from: a */
    public C32524a f84805a;

    /* renamed from: b */
    private String f84806b;

    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.f$a */
    public static class C32524a {
        @C6593c(mo15949a = "room_id")

        /* renamed from: a */
        public Map<Long, Long> f84807a;

        /* renamed from: a */
        public final Map<Long, Long> mo83756a() {
            if (this.f84807a == null) {
                return new HashMap(0);
            }
            return this.f84807a;
        }
    }

    public final String getRequestId() {
        return this.f84806b;
    }

    /* renamed from: a */
    public final Map<Long, Long> mo83755a() {
        if (this.f84805a == null) {
            return new HashMap(0);
        }
        return this.f84805a.mo83756a();
    }

    public final void setRequestId(String str) {
        this.f84806b = str;
    }
}
