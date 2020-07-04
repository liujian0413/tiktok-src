package com.p280ss.android.ugc.aweme.p313im.sdk.p1324f;

import android.text.TextUtils;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.f.a */
public abstract class C31194a {

    /* renamed from: a */
    public final String f81826a;

    /* renamed from: b */
    public final Map<String, String> f81827b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.f.a$a */
    interface C31196a {

        /* renamed from: a */
        public static final C31196a f81829a = new C31196a() {
            /* renamed from: a */
            public final String mo81711a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C31196a f81830b = new C31196a() {
            /* renamed from: a */
            public final String mo81711a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo81711a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo81709b();

    /* renamed from: a */
    public final void mo81707a() {
        mo81709b();
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    if (!C31915n.m103672b()) {
                        C31194a.this.f81827b.put("_staging_flag", "1");
                    }
                    C6906g.m21515a(C31194a.this.f81826a, C31194a.this.f81827b);
                } catch (Throwable unused) {
                }
            }
        });
    }

    C31194a(String str) {
        this.f81826a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo81708a(String str, String str2, C31196a aVar) {
        this.f81827b.put(str, aVar.mo81711a(str2));
    }
}
