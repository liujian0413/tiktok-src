package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a;

import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f */
public abstract class C31702f extends C31617a {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f82933f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31702f.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: d */
    private String f82934d;

    /* renamed from: e */
    private boolean f82935e;

    /* renamed from: g */
    public C31661b f82936g;

    /* renamed from: h */
    private final C7541d f82937h = C7546e.m23569a(C31703a.f82938a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f$a */
    static final class C31703a extends Lambda implements C7561a<C47562b> {

        /* renamed from: a */
        public static final C31703a f82938a = new C31703a();

        C31703a() {
            super(0);
        }

        /* renamed from: a */
        private static C47562b m102953a() {
            return new C47562b();
        }

        public final /* synthetic */ Object invoke() {
            return m102953a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f$b */
    static final class C31704b<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C31702f f82939a;

        /* renamed from: b */
        final /* synthetic */ String f82940b;

        /* renamed from: c */
        final /* synthetic */ List f82941c;

        C31704b(C31702f fVar, String str, List list) {
            this.f82939a = fVar;
            this.f82940b = str;
            this.f82941c = list;
        }

        public final void subscribe(C47870u<List<IMUser>> uVar) {
            boolean z;
            C7573i.m23587b(uVar, "source");
            if (this.f82939a instanceof C31671c) {
                List d = C31850a.m103357a().mo82686d(this.f82940b);
                C7573i.m23582a((Object) d, "IMUserDao.inst().find(keyword)");
                Iterable iterable = d;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    IMUser iMUser = (IMUser) next;
                    C7573i.m23582a((Object) iMUser, "it");
                    if (iMUser.getFollowStatus() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                uVar.mo19239a((Object) C7525m.m23509d((Collection<? extends T>) (List) arrayList));
                return;
            }
            List<IMUser> a = C6961d.m21657a().mo18024a(this.f82941c, this.f82940b, true);
            List arrayList2 = new ArrayList();
            for (IMUser iMUser2 : a) {
                if (!arrayList2.contains(iMUser2)) {
                    C7573i.m23582a((Object) iMUser2, "user");
                    arrayList2.add(iMUser2);
                }
            }
            uVar.mo19239a((Object) arrayList2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f$c */
    static final class C31705c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C31702f f82942a;

        C31705c(C31702f fVar) {
            this.f82942a = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<IMContact> apply(List<IMUser> list) {
            C7573i.m23587b(list, "list");
            this.f82942a.mo82472j();
            Iterable<IMUser> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (IMUser iMUser : iterable) {
                if (iMUser != null) {
                    arrayList.add(iMUser);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                }
            }
            return C7525m.m23509d((Collection<? extends T>) (List) arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f$d */
    static final class C31706d<T> implements C7326g<List<IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C31702f f82943a;

        /* renamed from: b */
        final /* synthetic */ String f82944b;

        C31706d(C31702f fVar, String str) {
            this.f82943a = fVar;
            this.f82944b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<IMContact> list) {
            C31661b bVar = this.f82943a.f82936g;
            if (bVar != null) {
                C7573i.m23582a((Object) list, "it");
                bVar.mo82445a(list, this.f82944b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f$e */
    static final class C31707e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C31702f f82945a;

        C31707e(C31702f fVar) {
            this.f82945a = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C31661b bVar = this.f82945a.f82936g;
            if (bVar != null) {
                C7573i.m23582a((Object) th, "it");
                bVar.mo82446c(th);
            }
        }
    }

    /* renamed from: g */
    private final C47562b mo82462g() {
        return (C47562b) this.f82937h.getValue();
    }

    /* renamed from: i */
    public final void mo82471i() {
        this.f82936g = null;
        mo82462g().mo119660a();
    }

    /* renamed from: j */
    public final void mo82472j() {
        boolean z;
        CharSequence charSequence = this.f82934d;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo82466h();
        }
    }

    /* renamed from: h */
    private final void mo82466h() {
        boolean z;
        CharSequence charSequence = this.f82934d;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterable c = mo82404c();
            Collection arrayList = new ArrayList();
            for (Object next : c) {
                if (((IMContact) next) instanceof IMUser) {
                    arrayList.add(next);
                }
            }
            Iterable<IMContact> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList2.add((IMUser) iMContact);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            List list = (List) arrayList2;
            String str = this.f82934d;
            if (str == null) {
                C7573i.m23580a();
            }
            this.f82934d = null;
            C7321c a = C7492s.m23282a((C7495v<T>) new C31704b<T>(this, str, list)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) new C31705c<Object,Object>(this)).mo19280a((C7326g<? super T>) new C31706d<Object>(this, str), (C7326g<? super Throwable>) new C31707e<Object>(this));
            mo82462g().mo119660a();
            mo82462g().mo119661a(a);
        }
    }

    /* renamed from: a */
    public final void mo82469a(C31661b bVar) {
        C7573i.m23587b(bVar, "subscriber");
        this.f82936g = bVar;
    }

    public C31702f(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo82470a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f82934d = str;
            if (!this.f82935e) {
                mo82466h();
            }
        }
    }
}
