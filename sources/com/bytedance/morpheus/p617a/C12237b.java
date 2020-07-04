package com.bytedance.morpheus.p617a;

import com.google.android.play.core.splitinstall.C6563f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.morpheus.a.b */
public class C12237b {

    /* renamed from: a */
    private static volatile C12237b f32541a;

    /* renamed from: b */
    private Map<String, C6563f> f32542b = new HashMap();

    private C12237b() {
    }

    /* renamed from: a */
    public static C12237b m35601a() {
        if (f32541a == null) {
            synchronized (C12237b.class) {
                if (f32541a == null) {
                    f32541a = new C12237b();
                }
            }
        }
        return f32541a;
    }

    /* renamed from: a */
    public final C6563f mo29995a(String str) {
        return (C6563f) this.f32542b.get(str);
    }

    /* renamed from: a */
    public final void mo29996a(String str, C6563f fVar) {
        this.f32542b.put(str, fVar);
    }
}
