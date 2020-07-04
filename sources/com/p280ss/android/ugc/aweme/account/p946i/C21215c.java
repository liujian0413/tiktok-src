package com.p280ss.android.ugc.aweme.account.p946i;

import android.text.TextUtils;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.common.C6906g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.i.c */
public abstract class C21215c {

    /* renamed from: a */
    protected final String f57009a;

    /* renamed from: b */
    private final Map<String, String> f57010b = new HashMap();

    /* renamed from: c */
    private boolean f57011c = false;

    /* renamed from: d */
    private Map<String, String> f57012d = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.account.i.c$a */
    public interface C21216a {

        /* renamed from: a */
        public static final C21216a f57013a = new C21216a() {
            /* renamed from: a */
            public final String mo57143a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C21216a f57014b = new C21216a() {
            /* renamed from: a */
            public final String mo57143a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo57143a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57136a();

    /* renamed from: b */
    public final void mo57141b() {
        mo57136a();
        this.f57010b.putAll(this.f57012d);
        C6726a.m20842a(new C21219d(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo57142c() {
        try {
            if (this.f57011c) {
                C6759a.m20910a(this.f57009a, C21220e.m71417a(this.f57010b));
                return;
            }
            C6906g.m21515a(this.f57009a, this.f57010b);
        } catch (Throwable unused) {
        }
    }

    C21215c(String str) {
        this.f57009a = str;
    }

    /* renamed from: a */
    public final void mo57140a(String str, String str2, C21216a aVar) {
        this.f57010b.put(str, aVar.mo57143a(str2));
    }
}
