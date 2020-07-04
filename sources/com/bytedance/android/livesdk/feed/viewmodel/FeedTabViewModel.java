package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.C6039l;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.bytedance.common.utility.C6311g;
import java.util.List;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p354j.C47844a;
import p346io.reactivex.p354j.C7486b;

public class FeedTabViewModel extends RxViewModel {

    /* renamed from: a */
    public C47844a<List<C5989f>> f21083a = C47844a.m148742a();

    /* renamed from: b */
    private C7486b<Integer> f21084b = C7486b.m23223a();

    /* renamed from: c */
    private C6037j f21085c;

    /* renamed from: d */
    private C6039l<C5989f> f21086d;

    /* renamed from: a */
    public final List<C5989f> mo20499a() {
        return this.f21085c.mo14693c();
    }

    /* renamed from: c */
    private void m23979c() {
        mo10158a(this.f21085c.mo14691b().mo19280a(C7827v.f21122a, C7819n.f21114a));
    }

    /* renamed from: b */
    private void m23976b() {
        mo10158a(this.f21085c.mo14690a().mo19291a(C7822q.f21117a).mo19317d(C7823r.f21118a).mo19291a((C7328l<? super T>) new C7824s<Object>(this)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7825t<Object>(this), C7826u.f21121a));
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m23977b(Status status) throws Exception {
        if (status == Status.Login || status == Status.Logout) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static final /* synthetic */ boolean m23980d(List list) throws Exception {
        if (!C6311g.m19573a(list)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20500a(Status status) throws Exception {
        m23976b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo20502b(List list) throws Exception {
        if (!this.f21086d.mo14694a(list, (List) this.f21083a.mo10167b())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bytedance.android.livesdk.feed.feed.f>, for r3v0, types: [java.util.List, java.util.List<com.bytedance.android.livesdk.feed.feed.f>] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.util.List m23978c(java.util.List<com.bytedance.android.livesdk.feed.feed.C5989f> r3) throws java.lang.Exception {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r3.next()
            com.bytedance.android.livesdk.feed.feed.f r1 = (com.bytedance.android.livesdk.feed.feed.C5989f) r1
            if (r1 == 0) goto L_0x0009
            boolean r2 = r1.mo14646b()
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel.m23978c(java.util.List):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20501a(List list) throws Exception {
        this.f21083a.onNext(list);
    }

    public FeedTabViewModel(C6037j jVar, C6039l<C5989f> lVar, C5971a aVar) {
        this.f21085c = jVar;
        this.f21086d = lVar;
        mo10158a(aVar.mo14618a().mo19158b(C7817l.f21112a).mo19150a(C7818m.f21113a).mo19142a((C7326g<? super T>) new C7820o<Object>(this), C7821p.f21116a));
        m23979c();
    }
}
