package com.p280ss.ttvideoengine.p1813f;

import android.os.Handler;
import android.os.Message;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.f.a */
public class C46088a {

    /* renamed from: a */
    protected Handler f117935a = new C46089a(this);

    /* renamed from: b */
    protected boolean f117936b;

    /* renamed from: c */
    protected String f117937c;

    /* renamed from: d */
    public C46090b f117938d;

    /* renamed from: e */
    protected C46106j f117939e;

    /* renamed from: com.ss.ttvideoengine.f.a$a */
    static class C46089a extends Handler {

        /* renamed from: a */
        private final WeakReference<C46088a> f117940a;

        public C46089a(C46088a aVar) {
            super(C46122g.m144534c());
            this.f117940a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            C46088a aVar = (C46088a) this.f117940a.get();
            if (aVar != null) {
                C46090b bVar = aVar.f117938d;
                if (bVar != null && !aVar.f117936b) {
                    switch (message.what) {
                        case 0:
                            bVar.mo112094a();
                            return;
                        case 1:
                            aVar.mo112264d();
                            bVar.mo112095a((C46117c) message.obj);
                            return;
                        case 2:
                            aVar.mo112264d();
                            bVar.mo112096a(null, (C46117c) message.obj);
                            return;
                        case 3:
                            aVar.mo112264d();
                            bVar.mo112096a((JSONObject) message.obj, null);
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo112260b() {
    }

    /* renamed from: c */
    public void mo112262c() {
    }

    /* renamed from: d */
    public void mo112264d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo112265e() {
        this.f117935a.sendEmptyMessage(0);
    }

    public C46088a(String str) {
        this.f117937c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo112259a(JSONObject jSONObject) {
        this.f117935a.sendMessage(this.f117935a.obtainMessage(3, jSONObject));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo112261b(C46117c cVar) {
        this.f117935a.sendMessage(this.f117935a.obtainMessage(1, cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo112263c(C46117c cVar) {
        this.f117935a.sendMessage(this.f117935a.obtainMessage(2, cVar));
    }

    public C46088a(String str, C46106j jVar) {
        this.f117937c = str;
        if (jVar == null) {
            jVar = new C46103i();
        }
        this.f117939e = jVar;
    }
}
