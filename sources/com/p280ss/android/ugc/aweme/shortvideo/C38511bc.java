package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bc */
public final class C38511bc {

    /* renamed from: a */
    public Map<String, String> f100112a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.bc$a */
    public interface C38512a {

        /* renamed from: a */
        public static final C38512a f100113a = new C38512a() {
            /* renamed from: a */
            public final String mo96487a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C38512a f100114b = new C38512a() {
            /* renamed from: a */
            public final String mo96487a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo96487a(String str);
    }

    /* renamed from: a */
    public static C38511bc m123103a() {
        return new C38511bc();
    }

    /* renamed from: a */
    public final C38511bc mo96486a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f100112a.putAll(map);
        }
        return this;
    }

    /* renamed from: a */
    public final C38511bc mo96483a(String str, int i) {
        return m123104a(str, String.valueOf(i), C38512a.f100113a);
    }

    /* renamed from: a */
    public final C38511bc mo96484a(String str, long j) {
        return m123104a(str, String.valueOf(j), C38512a.f100113a);
    }

    /* renamed from: a */
    public final C38511bc mo96485a(String str, String str2) {
        return m123104a(str, str2, C38512a.f100113a);
    }

    /* renamed from: a */
    private C38511bc m123104a(String str, String str2, C38512a aVar) {
        this.f100112a.put(str, aVar.mo96487a(str2));
        return this;
    }
}
