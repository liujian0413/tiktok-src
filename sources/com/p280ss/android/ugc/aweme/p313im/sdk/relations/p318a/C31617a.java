package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a;

import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31643e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31657h;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31657h.C31659b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b.C31667d.C31668a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b.C31669e.C31670a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1346e.C31699b.C31700a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a */
public abstract class C31617a implements C31641d<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82808a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31617a.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public final C31657h f82809b = ((C31657h) C31659b.m102879a().mo82437a((C7562b<? super T, Boolean>) new C31619b<Object,Boolean>(this)).mo82438b(new C31620c(this)).mo82439c(new C31621d(this)).mo82428b());

    /* renamed from: c */
    public final C31690a f82810c;

    /* renamed from: d */
    private C31641d<IMContact> f82811d;

    /* renamed from: e */
    private final C7541d f82812e = C7546e.m23569a(C31618a.f82813a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$a */
    static final class C31618a extends Lambda implements C7561a<List<IMContact>> {

        /* renamed from: a */
        public static final C31618a f82813a = new C31618a();

        C31618a() {
            super(0);
        }

        /* renamed from: a */
        private static List<IMContact> m102767a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102767a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$b */
    static final class C31619b extends Lambda implements C7562b<Conversation, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31617a f82814a;

        C31619b(C31617a aVar) {
            this.f82814a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m102768a((Conversation) obj));
        }

        /* renamed from: a */
        private boolean m102768a(Conversation conversation) {
            C7573i.m23587b(conversation, "it");
            return C31670a.m102892a(this.f82814a.f82810c).mo82450a(conversation);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$c */
    static final class C31620c extends Lambda implements C7562b<List<? extends Conversation>, List<? extends Conversation>> {

        /* renamed from: a */
        final /* synthetic */ C31617a f82815a;

        C31620c(C31617a aVar) {
            this.f82815a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<Conversation> invoke(List<? extends Conversation> list) {
            C7573i.m23587b(list, "it");
            return C31700a.m102945a(this.f82815a.f82810c).mo82467a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$d */
    static final class C31621d extends Lambda implements C7562b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31617a f82816a;

        C31621d(C31617a aVar) {
            this.f82816a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m102770a((IMContact) obj));
        }

        /* renamed from: a */
        private boolean m102770a(IMContact iMContact) {
            C7573i.m23587b(iMContact, "it");
            return C31668a.m102890a(this.f82816a.f82810c).mo82449a(iMContact);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$e */
    static final class C31622e extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

        /* renamed from: a */
        public static final C31622e f82817a = new C31622e();

        C31622e() {
            super(2);
        }

        /* renamed from: a */
        private static void m102771a(List<IMContact> list, boolean z) {
            C7573i.m23587b(list, "<anonymous parameter 0>");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m102771a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$f */
    static final class C31623f extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        public static final C31623f f82818a = new C31623f();

        C31623f() {
            super(1);
        }

        /* renamed from: a */
        private static void m102772a(Throwable th) {
            C7573i.m23587b(th, "<anonymous parameter 0>");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102772a((Throwable) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$g */
    public static final class C31624g implements C31641d<IMContact> {

        /* renamed from: a */
        final /* synthetic */ C7563m f82819a;

        /* renamed from: b */
        final /* synthetic */ C7562b f82820b;

        /* renamed from: c */
        final /* synthetic */ C7563m f82821c;

        /* renamed from: d */
        final /* synthetic */ C7562b f82822d;

        /* renamed from: a */
        public final void mo82399a(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f82820b.invoke(th);
        }

        /* renamed from: b */
        public final void mo82402b(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f82822d.invoke(th);
        }

        /* renamed from: a */
        public final void mo82400a(List<IMContact> list, boolean z) {
            C7573i.m23587b(list, "list");
            this.f82819a.invoke(list, Boolean.valueOf(z));
        }

        /* renamed from: b */
        public final void mo82403b(List<IMContact> list, boolean z) {
            C7573i.m23587b(list, "list");
            this.f82821c.invoke(list, Boolean.valueOf(z));
        }

        C31624g(C7563m mVar, C7562b bVar, C7563m mVar2, C7562b bVar2) {
            this.f82819a = mVar;
            this.f82820b = bVar;
            this.f82821c = mVar2;
            this.f82822d = bVar2;
        }
    }

    /* renamed from: g */
    private final List<IMContact> mo82462g() {
        return (List) this.f82812e.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C31643e<IMContact> mo82397a();

    /* renamed from: b */
    public final C31617a mo82401b() {
        C31617a aVar = this;
        aVar.f82811d = null;
        return aVar;
    }

    /* renamed from: h */
    private boolean mo82466h() {
        return mo82397a().mo82412c();
    }

    /* renamed from: c */
    public final List<IMContact> mo82404c() {
        return C7525m.m23509d((Collection<? extends T>) mo82462g());
    }

    /* renamed from: d */
    public final boolean mo82405d() {
        return mo82397a().mo82413d();
    }

    /* renamed from: e */
    public C7581n mo82406e() {
        C31617a aVar;
        if (!mo82466h()) {
            aVar = this;
        } else {
            aVar = null;
        }
        C31617a aVar2 = aVar;
        if (aVar2 != null) {
            C31643e a = aVar2.mo82397a();
            if (a != null) {
                a.mo82409a();
                return C7581n.f20898a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final C7581n mo82407f() {
        boolean z;
        C31617a aVar;
        if (mo82466h() || !mo82405d()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            aVar = this;
        } else {
            aVar = null;
        }
        C31617a aVar2 = aVar;
        if (aVar2 != null) {
            C31643e a = aVar2.mo82397a();
            if (a != null) {
                a.mo82411b();
                return C7581n.f20898a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo82402b(Throwable th) {
        C7573i.m23587b(th, "t");
        C6921a.m21559a(th);
        C31641d<IMContact> dVar = this.f82811d;
        if (dVar != null) {
            dVar.mo82402b(th);
        }
    }

    /* renamed from: a */
    protected static List<String> m102753a(List<? extends IMContact> list) {
        C7573i.m23587b(list, "$this$toUidList");
        List<String> arrayList = new ArrayList<>();
        for (IMContact a : list) {
            IMUser a2 = C6961d.m21661a(a);
            if (a2 != null) {
                String uid = a2.getUid();
                C7573i.m23582a((Object) uid, "it.uid");
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    public C31617a(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        this.f82810c = aVar;
    }

    /* renamed from: a */
    public final C31617a mo82398a(C31641d<IMContact> dVar) {
        C7573i.m23587b(dVar, "subscriber");
        C31617a aVar = this;
        aVar.f82811d = dVar;
        return aVar;
    }

    /* renamed from: a */
    public final void mo82399a(Throwable th) {
        C7573i.m23587b(th, "t");
        C6921a.m21559a(th);
        C31641d<IMContact> dVar = this.f82811d;
        if (dVar != null) {
            dVar.mo82399a(th);
        }
    }

    /* renamed from: b */
    public final void mo82403b(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        mo82462g().addAll(list);
        C31641d<IMContact> dVar = this.f82811d;
        if (dVar != null) {
            dVar.mo82403b(list, z);
        }
    }

    /* renamed from: a */
    public void mo82400a(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        mo82462g().clear();
        mo82462g().addAll(list);
        C31641d<IMContact> dVar = this.f82811d;
        if (dVar != null) {
            dVar.mo82400a(list, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C31617a m102752a(C7563m<? super List<IMContact>, ? super Boolean, C7581n> mVar, C7562b<? super Throwable, C7581n> bVar, C7563m<? super List<IMContact>, ? super Boolean, C7581n> mVar2, C7562b<? super Throwable, C7581n> bVar2) {
        C7573i.m23587b(mVar, "onLoadSuccess");
        C7573i.m23587b(bVar, "onLoadError");
        C7573i.m23587b(mVar2, "onLoadMoreSuccess");
        C7573i.m23587b(bVar2, "onLoadMoreError");
        return mo82398a((C31641d<IMContact>) new C31624g<IMContact>(mVar, bVar, mVar2, bVar2));
    }
}
