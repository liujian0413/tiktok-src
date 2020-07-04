package com.bytedance.android.livesdk.action;

import com.bytedance.android.livesdk.action.C3868d.C3869a;
import com.bytedance.android.livesdk.action.p182a.C3855a;
import com.bytedance.android.livesdk.action.p182a.C3858c;
import com.bytedance.android.livesdk.action.p182a.C3859d;
import com.bytedance.android.livesdk.action.p182a.C3861e;
import com.bytedance.android.livesdk.action.p182a.C3865f;

/* renamed from: com.bytedance.android.livesdk.action.b */
public class C3866b {

    /* renamed from: a */
    private static C3866b f11567a;

    /* renamed from: b */
    private C3852a f11568b = new C3852a();

    private C3866b() {
        m13716b();
    }

    /* renamed from: a */
    public static C3866b m13714a() {
        if (f11567a == null) {
            synchronized (C3866b.class) {
                if (f11567a == null) {
                    f11567a = new C3866b();
                }
            }
        }
        return f11567a;
    }

    /* renamed from: b */
    private void m13716b() {
        m13715a((C3868d) new C3865f());
        m13715a((C3868d) new C3855a());
        m13715a((C3868d) new C3858c());
        m13715a((C3868d) new C3859d());
        m13715a((C3868d) new C3861e());
    }

    /* renamed from: a */
    private void m13715a(C3868d dVar) {
        this.f11568b.mo11400a(dVar);
    }

    /* renamed from: a */
    public final void mo11406a(String str) {
        mo11407a(str, null);
    }

    /* renamed from: a */
    public final void mo11407a(String str, C3869a aVar) {
        try {
            this.f11568b.mo11402a(str, aVar);
        } catch (Exception unused) {
        }
    }
}
