package com.bytedance.morpheus;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.morpheus.core.C12250a;
import com.bytedance.morpheus.core.C12251b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.morpheus.e */
public class C12253e {

    /* renamed from: c */
    private static volatile C12253e f32575c;

    /* renamed from: a */
    public final List<C12251b> f32576a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Map<String, C12250a> f32577b = new HashMap();

    /* renamed from: d */
    private Handler f32578d = new Handler(Looper.getMainLooper());

    private C12253e() {
    }

    /* renamed from: a */
    public static C12253e m35640a() {
        if (f32575c == null) {
            synchronized (C12253e.class) {
                if (f32575c == null) {
                    f32575c = new C12253e();
                }
            }
        }
        return f32575c;
    }

    /* renamed from: a */
    public final void mo30013a(C12251b bVar) {
        this.f32576a.add(bVar);
    }

    /* renamed from: b */
    public final void mo30015b(C12251b bVar) {
        this.f32576a.remove(bVar);
    }

    /* renamed from: b */
    private void m35641b(final C12250a aVar) {
        this.f32578d.post(new Runnable() {
            public final void run() {
                for (C12251b a : C12253e.this.f32576a) {
                    a.mo30010a(aVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final C12250a mo30011a(String str) {
        return (C12250a) this.f32577b.get(str);
    }

    /* renamed from: a */
    public final void mo30012a(C12250a aVar) {
        if (aVar != null && aVar.f32566a != null) {
            synchronized (this.f32577b) {
                C12250a aVar2 = (C12250a) this.f32577b.get(aVar.f32566a);
                if (aVar2 != null) {
                    aVar2.f32568c = aVar.f32568c;
                    aVar2.f32567b = aVar.f32567b;
                    aVar2.f32572g = aVar.f32572g;
                    aVar2.f32574i = aVar.f32574i;
                    aVar2.f32573h = aVar.f32573h;
                    aVar2.f32570e = aVar.f32570e;
                    aVar2.f32569d = aVar.f32569d;
                    m35641b(aVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo30014a(Map<String, C12250a> map) {
        this.f32577b.putAll(map);
    }
}
