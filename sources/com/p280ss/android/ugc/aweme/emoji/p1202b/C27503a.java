package com.p280ss.android.ugc.aweme.emoji.p1202b;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.utils.C27630a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27631b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import com.p280ss.android.ugc.aweme.emoji.utils.C27635f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.emoji.b.a */
public class C27503a implements C27516i {

    /* renamed from: e */
    private static C27503a f72537e;

    /* renamed from: a */
    public int f72538a;

    /* renamed from: b */
    private boolean f72539b;

    /* renamed from: c */
    private List<Emoji> f72540c;

    /* renamed from: d */
    private List<C27516i> f72541d = new ArrayList();

    private C27503a() {
    }

    /* renamed from: b */
    public static boolean m90147b() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static C1592h<List<Emoji>> m90148d() {
        return C1592h.m7855a(C27513f.f72554a, (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    public static C27503a m90145a() {
        if (f72537e == null) {
            synchronized (C27503a.class) {
                if (f72537e == null) {
                    f72537e = new C27503a();
                }
            }
        }
        return f72537e;
    }

    /* renamed from: g */
    private static String m90150g() {
        StringBuilder sb = new StringBuilder("GIF_EMOJIS");
        sb.append(C27630a.m90585c());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ List mo70711f() throws Exception {
        if (!C6307b.m19566a((Collection<T>) this.f72540c)) {
            return this.f72540c;
        }
        List<Emoji> a = C27635f.m90605a(m90150g(), Emoji.class);
        this.f72540c = a;
        return a;
    }

    /* renamed from: e */
    static final /* synthetic */ List m90149e() throws Exception {
        List b = C27633d.m90594a().mo71031b();
        if (b.isEmpty() || b.size() < 8) {
            int size = 8 - b.size();
            for (int i = 0; i < size; i++) {
                b.add(null);
            }
        }
        return b;
    }

    /* renamed from: c */
    public final void mo70710c() {
        if (m90147b()) {
            if (this.f72539b || !C27514g.m90169a(C6399b.m19921a())) {
                C1592h.m7855a((Callable<TResult>) new C27511d<TResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27512e<TResult,TContinuationResult>(this), C1592h.f5958b);
            } else {
                mo70705a(false);
            }
        }
    }

    /* renamed from: a */
    public static List<Emoji> m90146a(List<Emoji> list) {
        if (list.size() > 88) {
            return list.subList(0, 88);
        }
        return list;
    }

    /* renamed from: b */
    public final void mo70707b(C27516i iVar) {
        if (m90147b()) {
            this.f72541d.remove(iVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo70703a(C1592h hVar) throws Exception {
        mo70708b((List) hVar.mo6890e());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo70706b(C1592h hVar) throws Exception {
        List list;
        if (hVar == null || !hVar.mo6882b()) {
            list = null;
        } else {
            list = (List) hVar.mo6890e();
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f72538a = 3;
        } else if (this.f72538a == 1) {
            this.f72539b = false;
        } else {
            this.f72538a = 2;
        }
        mo70708b(list);
        return null;
    }

    /* renamed from: a */
    public final void mo70704a(C27516i iVar) {
        if (m90147b() && !this.f72541d.contains(iVar)) {
            this.f72541d.add(iVar);
        }
    }

    /* renamed from: b */
    public final void mo70708b(List<Emoji> list) {
        for (C27516i b : this.f72541d) {
            b.mo70708b(list);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.util.List mo70709c(bolts.C1592h r6) throws java.lang.Exception {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x004f
            boolean r1 = r6.mo6882b()
            if (r1 == 0) goto L_0x004f
            r1 = 1
            java.lang.Object r6 = r6.mo6890e()     // Catch:{ Exception -> 0x004d }
            com.ss.android.ugc.aweme.emoji.b.a.b r6 = (com.p280ss.android.ugc.aweme.emoji.p1202b.p1203a.C27505b) r6     // Catch:{ Exception -> 0x004d }
            if (r6 == 0) goto L_0x004a
            int r2 = r6.status_code     // Catch:{ Exception -> 0x004d }
            if (r2 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.emoji.b.a.a r2 = r6.f72546a     // Catch:{ Exception -> 0x004d }
            if (r2 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            com.ss.android.ugc.aweme.emoji.b.a.a r2 = r6.f72546a     // Catch:{ Exception -> 0x004d }
            java.util.List<? extends com.ss.android.ugc.aweme.emoji.model.Emoji> r2 = r2.f72542a     // Catch:{ Exception -> 0x004d }
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)     // Catch:{ Exception -> 0x004d }
            if (r2 != 0) goto L_0x004f
            com.ss.android.ugc.aweme.emoji.b.a.a r2 = r6.f72546a     // Catch:{ Exception -> 0x004d }
            java.util.List<? extends com.ss.android.ugc.aweme.emoji.model.Emoji> r2 = r2.f72542a     // Catch:{ Exception -> 0x004d }
            java.util.Iterator r0 = r2.iterator()     // Catch:{ Exception -> 0x0048 }
        L_0x002d:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0048 }
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0048 }
            com.ss.android.ugc.aweme.emoji.model.Emoji r3 = (com.p280ss.android.ugc.aweme.emoji.model.Emoji) r3     // Catch:{ Exception -> 0x0048 }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r6.f72547b     // Catch:{ Exception -> 0x0048 }
            r3.setLogPb(r4)     // Catch:{ Exception -> 0x0048 }
            goto L_0x002d
        L_0x003f:
            java.lang.String r6 = m90150g()     // Catch:{ Exception -> 0x0048 }
            com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90606a(r6, r2)     // Catch:{ Exception -> 0x0048 }
            r0 = r2
            goto L_0x004f
        L_0x0048:
            r0 = r2
            goto L_0x004d
        L_0x004a:
            r5.f72538a = r1     // Catch:{ Exception -> 0x004d }
            goto L_0x004f
        L_0x004d:
            r5.f72538a = r1
        L_0x004f:
            boolean r6 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = m90150g()
            java.lang.Class<com.ss.android.ugc.aweme.emoji.model.Emoji> r0 = com.p280ss.android.ugc.aweme.emoji.model.Emoji.class
            java.util.List r0 = com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90605a(r6, r0)
        L_0x005f:
            r5.f72540c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.p1202b.C27503a.mo70709c(bolts.h):java.util.List");
    }

    /* renamed from: a */
    public final void mo70705a(boolean z) {
        if (C27630a.m90583a() && m90147b() && (z || !this.f72539b)) {
            this.f72539b = true;
            this.f72538a = 0;
            C27631b.m90586a().getTrendingEmojis(0, 80).mo6876a((C1591g<TResult, TContinuationResult>) new C27506b<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27510c<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }
}
