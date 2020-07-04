package com.p280ss.android.ugc.aweme.account.p933a.p935b;

import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.a.b.b */
public final class C21102b {

    /* renamed from: a */
    public Map<String, String> f56672a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.account.a.b.b$a */
    public interface C21103a {

        /* renamed from: a */
        public static final C21103a f56673a = new C21103a() {
            /* renamed from: a */
            public final String mo56947a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C21103a f56674b = new C21103a() {
            /* renamed from: a */
            public final String mo56947a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo56947a(String str);
    }

    /* renamed from: a */
    public static C21102b m71165a() {
        return new C21102b();
    }

    /* renamed from: a */
    public final C21102b mo56944a(String str, int i) {
        return m71166a(str, String.valueOf(i), C21103a.f56673a);
    }

    /* renamed from: a */
    public final C21102b mo56945a(String str, long j) {
        return m71166a(str, String.valueOf(j), C21103a.f56673a);
    }

    /* renamed from: a */
    public final C21102b mo56946a(String str, String str2) {
        return m71166a(str, str2, C21103a.f56673a);
    }

    /* renamed from: a */
    private C21102b m71166a(String str, String str2, C21103a aVar) {
        this.f56672a.put(str, aVar.mo56947a(str2));
        return this;
    }
}
