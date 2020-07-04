package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6937c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31625a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31625a.C31627b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31625a.C31628c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31636b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31637c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31637c.C31638a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31637c.C31639b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31644f;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31654g;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31654g.C31655a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C31681e;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d */
public final class C31684d extends C31617a {

    /* renamed from: e */
    public static final C31685a f82903e = new C31685a(null);

    /* renamed from: d */
    public volatile List<String> f82904d;

    /* renamed from: f */
    private final String f82905f;

    /* renamed from: g */
    private final String f82906g;

    /* renamed from: h */
    private final C31637c f82907h;

    /* renamed from: i */
    private final C31637c f82908i;

    /* renamed from: j */
    private final C31654g<IMContact> f82909j;

    /* renamed from: k */
    private C31625a<IMContact> f82910k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$a */
    public static final class C31685a {
        private C31685a() {
        }

        public /* synthetic */ C31685a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$b */
    static final class C31686b extends Lambda implements C7561a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C31684d f82911a;

        C31686b(C31684d dVar) {
            this.f82911a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<String> invoke() {
            return this.f82911a.f82904d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$c */
    static final class C31687c extends Lambda implements C7561a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C31684d f82912a;

        C31687c(C31684d dVar) {
            this.f82912a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<String> invoke() {
            return this.f82912a.f82904d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$d */
    static final /* synthetic */ class C31688d extends FunctionReference implements C7561a<Boolean> {
        C31688d(C31684d dVar) {
            super(0, dVar);
        }

        public final String getName() {
            return "interceptStart";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31684d.class);
        }

        public final String getSignature() {
            return "interceptStart()Z";
        }

        /* renamed from: a */
        private boolean m102917a() {
            return ((C31684d) this.receiver).mo82462g();
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m102917a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$e */
    static final /* synthetic */ class C31689e extends FunctionReference implements C7562b<C31628c<IMContact>, Boolean> {
        C31689e(C31684d dVar) {
            super(1, dVar);
        }

        public final String getName() {
            return "intercept";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31684d.class);
        }

        public final String getSignature() {
            return "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/core/core/CombinedLoader$InterceptPayload;)Z";
        }

        /* renamed from: a */
        private boolean m102918a(C31628c<IMContact> cVar) {
            C7573i.m23587b(cVar, "p1");
            return ((C31684d) this.receiver).mo82461a(cVar);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m102918a((C31628c) obj));
        }
    }

    /* renamed from: g */
    public final boolean mo82462g() {
        if (!this.f82810c.f82914a || m102910i()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C31625a<IMContact> mo82397a() {
        if (this.f82910k != null) {
            C31625a<IMContact> aVar = this.f82910k;
            if (aVar == null) {
                C7573i.m23580a();
            }
            return aVar;
        }
        C31684d dVar = this;
        this.f82910k = C31627b.m102792a().mo82418a(this.f82909j).mo82419a((C7561a<Boolean>) new C31688d<Boolean>(dVar)).mo82420a((C7562b<? super C31628c<R>, Boolean>) new C31689e<Object,Boolean>(dVar)).mo82417a((C31641d<R>) this).f82831a;
        C31625a<IMContact> aVar2 = this.f82910k;
        if (aVar2 == null) {
            C7573i.m23580a();
        }
        return aVar2;
    }

    /* renamed from: i */
    private static boolean m102910i() {
        C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
        int l = C31850a.m103373l();
        C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
        int m = C31850a.m103374m();
        int c = C6937c.f19628b.mo17968c();
        StringBuilder sb = new StringBuilder("SharePanelRelationModel checkShowHeader: ");
        sb.append(l);
        sb.append(", ");
        sb.append(m);
        sb.append(", ");
        sb.append(c);
        C6921a.m21555a(sb.toString());
        if (l > 15) {
            return true;
        }
        if (c == 1 && m > 0 && l > 5) {
            return true;
        }
        if (c != 2 || m <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo82461a(C31628c<IMContact> cVar) {
        cVar.f82832a.put(cVar.f82834c, cVar.f82833b);
        if (cVar.f82834c == this.f82809b) {
            this.f82904d = m102753a(cVar.f82833b);
            if (C6399b.m19944t()) {
                C31681e.m102906a(cVar.f82833b);
            }
        }
        if (C31636b.m102799a(cVar.f82832a).size() > 15) {
            return false;
        }
        return true;
    }

    public C31684d(C31690a aVar) {
        String str;
        String str2;
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
        if (C6399b.m19944t()) {
            str = C31850a.m103367f();
        } else {
            str = C31850a.m103366e();
        }
        this.f82905f = str;
        if (C6399b.m19944t()) {
            str2 = C31850a.m103368g();
        } else {
            str2 = C31850a.m103369h();
        }
        this.f82906g = str2;
        C31638a a = C31639b.m102815a();
        String str3 = this.f82905f;
        C7573i.m23582a((Object) str3, "followEachOtherSql");
        this.f82907h = (C31637c) a.mo82424a(str3).mo82426a(false).mo82425a((C7561a<? extends List<String>>) new C31687c<Object>(this)).mo82436a(100).mo82428b();
        C31638a a2 = C31639b.m102815a();
        String str4 = this.f82906g;
        C7573i.m23582a((Object) str4, "followOneSql");
        this.f82908i = (C31637c) a2.mo82424a(str4).mo82426a(false).mo82425a((C7561a<? extends List<String>>) new C31686b<Object>(this)).mo82436a(100).mo82428b();
        this.f82909j = C31655a.m102868a().mo82441a((C31644f<?, R>) this.f82809b).mo82441a((C31644f<?, R>) this.f82907h).mo82441a((C31644f<?, R>) this.f82908i);
    }

    /* renamed from: a */
    public final void mo82400a(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        if (list.size() > 15) {
            list = list.subList(0, 15);
        }
        super.mo82400a(list, false);
    }
}
