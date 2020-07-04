package com.p280ss.android.ugc.aweme.newfollow.util;

import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.e */
public final class C34200e {

    /* renamed from: a */
    private List<C43222g> f89190a = new LinkedList();

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.e$a */
    static class C34201a {

        /* renamed from: a */
        public static C34200e f89191a = new C34200e();
    }

    /* renamed from: a */
    public static C34200e m110432a() {
        return C34201a.f89191a;
    }

    /* renamed from: b */
    public final C43222g mo86947b() {
        if (this.f89190a.size() >= 8) {
            C43222g gVar = (C43222g) this.f89190a.get(this.f89190a.size() - 1);
            gVar.mo104922B();
            gVar.mo104949y();
            this.f89190a.remove(this.f89190a.size() - 1);
        }
        C43316v vVar = new C43316v();
        this.f89190a.add(vVar);
        return vVar;
    }

    /* renamed from: a */
    public final void mo86946a(C43222g gVar) {
        if (gVar != null) {
            gVar.mo104922B();
            try {
                gVar.mo104949y();
                this.f89190a.remove(gVar);
            } catch (Exception unused) {
            }
        }
    }
}
