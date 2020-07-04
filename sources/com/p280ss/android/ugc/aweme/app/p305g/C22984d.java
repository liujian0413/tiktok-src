package com.p280ss.android.ugc.aweme.app.p305g;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.g.d */
public final class C22984d {

    /* renamed from: a */
    public Map<String, String> f60753a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.app.g.d$a */
    public interface C22985a {

        /* renamed from: a */
        public static final C22985a f60754a = new C22985a() {
            /* renamed from: a */
            public final String mo59976a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C22985a f60755b = new C22985a() {
            /* renamed from: a */
            public final String mo59976a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo59976a(String str);
    }

    /* renamed from: a */
    public static C22984d m75611a() {
        return new C22984d();
    }

    /* renamed from: b */
    public final C22984d mo59975b() {
        String str;
        String str2 = "_staging_flag";
        if (C6399b.m19946v()) {
            str = "0";
        } else {
            str = "1";
        }
        mo59973a(str2, str);
        return this;
    }

    /* renamed from: a */
    public final C22984d mo59974a(HashMap<? extends String, ? extends String> hashMap) {
        if (hashMap != null) {
            this.f60753a.putAll(hashMap);
        }
        return this;
    }

    /* renamed from: a */
    public final C22984d mo59970a(String str, int i) {
        return m75612a(str, String.valueOf(i), C22985a.f60754a);
    }

    /* renamed from: a */
    public final C22984d mo59971a(String str, long j) {
        return m75612a(str, String.valueOf(j), C22985a.f60754a);
    }

    /* renamed from: a */
    public final C22984d mo59972a(String str, Object obj) {
        if (obj != null) {
            mo59973a(str, new C6600e().mo15979b(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C22984d mo59973a(String str, String str2) {
        return m75612a(str, str2, C22985a.f60754a);
    }

    /* renamed from: a */
    private C22984d m75612a(String str, String str2, C22985a aVar) {
        this.f60753a.put(str, aVar.mo59976a(str2));
        return this;
    }
}
