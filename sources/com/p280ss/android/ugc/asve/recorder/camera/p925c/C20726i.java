package com.p280ss.android.ugc.asve.recorder.camera.p925c;

import android.content.Context;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.p756d.C15448c;
import com.p280ss.android.ugc.asve.recorder.camera.C20703a;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.i */
public final class C20726i implements C20719d {

    /* renamed from: a */
    private final Context f55967a;

    /* renamed from: b */
    private C20714a f55968b;

    /* renamed from: c */
    private int f55969c;

    /* renamed from: a */
    public final int mo56019a() {
        return this.f55969c;
    }

    /* renamed from: d */
    public final int mo56028d() {
        return 1;
    }

    /* renamed from: c */
    public final int mo56026c() {
        return this.f55968b.mo56011a();
    }

    /* renamed from: e */
    public final boolean mo56029e() {
        return this.f55968b.f55949b;
    }

    /* renamed from: g */
    public final boolean mo56031g() {
        return this.f55968b.mo56017c();
    }

    /* renamed from: f */
    public final boolean mo56030f() {
        if (!this.f55968b.f55949b || !mo56024b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo56024b() {
        int a = C15448c.m45237a(this.f55967a).mo38999a();
        if (a == 0) {
            boolean b = this.f55968b.mo56015b();
            mo56022a(b);
            return b;
        } else if (a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m68884a(Context context) {
        if (C15448c.m45237a(context).mo38999a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo56027c(boolean z) {
        return this.f55968b.mo56016b(z);
    }

    /* renamed from: a */
    public final void mo56020a(int i) {
        if (this.f55968b.f55951d != null) {
            this.f55968b.f55951d.mo52271a(i);
        }
    }

    /* renamed from: b */
    public final boolean mo56025b(boolean z) {
        if (!this.f55968b.mo56016b(z) || !mo56024b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo56021a(C19662d dVar) {
        m68883a((Context) C6855a.m21308b(), dVar);
    }

    /* renamed from: a */
    public final void mo56022a(boolean z) {
        int i;
        C15448c a = C15448c.m45237a(this.f55967a);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo39000a(i);
    }

    /* renamed from: a */
    private void m68883a(Context context, C19662d dVar) {
        this.f55968b.mo56012a(context, dVar);
    }

    /* renamed from: b */
    public final float mo56023b(float f, int i) {
        return this.f55968b.mo56014b(f, i);
    }

    /* renamed from: a */
    public final float mo56018a(float f, int i) {
        return this.f55968b.mo56010a(f, i);
    }

    public C20726i(Context context, C20707b bVar) {
        this.f55967a = context;
        this.f55969c = C20703a.m68740a(context, C6855a.m21306a().mo38963t(), bVar.mo55949b());
        switch (this.f55969c) {
            case 1:
                this.f55968b = new C20715b(bVar, this);
                break;
            case 2:
                this.f55968b = new C20721f(bVar, this);
                break;
            case 3:
                this.f55968b = new C20728k(bVar, this);
                break;
            case 4:
                this.f55968b = new C20717c(bVar, this);
                break;
            case 5:
                this.f55968b = new C20724h(bVar, this);
                break;
            default:
                this.f55968b = new C20714a(this);
                break;
        }
        this.f55968b.mo56013a(mo56024b());
    }
}
