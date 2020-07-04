package com.bytedance.android.livesdk.feed.tab.p364b;

import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.C5990g;
import java.util.List;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.a */
public class C7757a implements C6037j {

    /* renamed from: a */
    private C7772o f20980a;

    /* renamed from: b */
    private C7773p f20981b;

    /* renamed from: c */
    public final List<C5989f> mo14693c() {
        return this.f20980a.mo20451b();
    }

    /* renamed from: a */
    public final C7492s<List<C5989f>> mo14690a() {
        return C7492s.m23283a((C7496w<? extends T>) C7492s.m23282a((C7495v<T>) new C7758b<T>(this)), (C7496w<? extends T>) C7492s.m23282a((C7495v<T>) new C7759c<T>(this)));
    }

    /* renamed from: b */
    public final C7492s<List<C5989f>> mo14691b() {
        return this.f20981b.mo20452a().mo19317d((C7327h<? super T, ? extends R>) new C7760d<Object,Object>(this)).mo19316d((C7326g<? super T>) new C7761e<Object>(this));
    }

    /* renamed from: a */
    public final C5989f mo14689a(long j) {
        return this.f20980a.mo20446a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ List mo20443b(C3474a aVar) throws Exception {
        if (aVar.f10297c != null) {
            this.f20980a.mo20449a((C5990g) aVar.f10297c);
        }
        return aVar.f10296b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ List mo20440a(C3474a aVar) throws Exception {
        if (aVar.f10297c != null) {
            this.f20980a.mo20449a((C5990g) aVar.f10297c);
        }
        return aVar.f10296b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ List mo20444b(List list) throws Exception {
        if (this.f20980a.mo20450a(list)) {
            return list;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20441a(C47870u uVar) throws Exception {
        this.f20981b.mo20452a().mo19317d((C7327h<? super T, ? extends R>) new C7762f<Object,Object>(this)).mo19317d((C7327h<? super T, ? extends R>) new C7763g<Object,Object>(this)).mo19280a((C7326g<? super T>) new C7764h<Object>(uVar), (C7326g<? super Throwable>) new C7765i<Object>(uVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo20445b(C47870u uVar) throws Exception {
        this.f20980a.mo20447a().mo19280a((C7326g<? super T>) new C7766j<Object>(uVar), (C7326g<? super Throwable>) new C7767k<Object>(uVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20442a(List list) throws Exception {
        this.f20980a.mo20450a(list);
    }

    /* renamed from: b */
    public final boolean mo14692b(long j) {
        C5989f a = mo14689a(j);
        if (a == null || a.f17760j <= 0) {
            return false;
        }
        return true;
    }

    public C7757a(C7772o oVar, C7773p pVar) {
        this.f20980a = oVar;
        this.f20981b = pVar;
    }

    /* renamed from: a */
    static final /* synthetic */ void m23862a(C47870u uVar, List list) throws Exception {
        uVar.mo19239a((Object) list);
        uVar.mo19238a();
    }

    /* renamed from: b */
    static final /* synthetic */ void m23864b(C47870u uVar, List list) throws Exception {
        uVar.mo19239a((Object) list);
        uVar.mo19238a();
    }
}
