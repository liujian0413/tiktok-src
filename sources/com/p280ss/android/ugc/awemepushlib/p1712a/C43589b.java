package com.p280ss.android.ugc.awemepushlib.p1712a;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.message.C19836e;
import com.p280ss.android.newmedia.redbadge.C19994j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.awemepushlib.a.b */
public final class C43589b implements C19836e {

    /* renamed from: a */
    private static C43589b f112829a;

    /* renamed from: b */
    private List<C19836e> f112830b = new ArrayList();

    private C43589b() {
        this.f112830b.add(new C19994j());
    }

    /* renamed from: b */
    public static synchronized C43589b m138115b() {
        C43589b bVar;
        synchronized (C43589b.class) {
            if (f112829a == null) {
                f112829a = new C43589b();
            }
            bVar = f112829a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo53187a() {
        for (int i = 0; i < this.f112830b.size(); i++) {
            ((C19836e) this.f112830b.get(i)).mo53187a();
        }
    }

    /* renamed from: a */
    public final void mo53188a(Context context) {
        for (int i = 0; i < this.f112830b.size(); i++) {
            ((C19836e) this.f112830b.get(i)).mo53188a(context);
        }
    }

    /* renamed from: a */
    public final void mo53189a(Intent intent) {
        for (int i = 0; i < this.f112830b.size(); i++) {
            ((C19836e) this.f112830b.get(i)).mo53189a(intent);
        }
    }
}
