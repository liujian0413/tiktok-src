package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a;

import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31625a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31625a.C31627b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31625a.C31628c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31637c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31637c.C31638a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31637c.C31639b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31643e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31644f;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31654g;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31654g.C31655a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c */
public final class C31671c extends C31702f {

    /* renamed from: e */
    public static final C31672a f82884e = new C31672a(null);

    /* renamed from: d */
    public volatile List<String> f82885d;

    /* renamed from: h */
    private final String f82886h;

    /* renamed from: i */
    private final C31637c f82887i;

    /* renamed from: j */
    private final C31654g<IMContact> f82888j;

    /* renamed from: k */
    private C31625a<IMContact> f82889k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$a */
    public static final class C31672a {
        private C31672a() {
        }

        public /* synthetic */ C31672a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$b */
    static final class C31673b extends Lambda implements C7561a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C31671c f82890a;

        C31673b(C31671c cVar) {
            this.f82890a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<String> invoke() {
            return this.f82890a.f82885d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$c */
    static final class C31674c extends Lambda implements C7562b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a */
        public static final C31674c f82891a = new C31674c();

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$c$a */
        public static final class C31675a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C47886a.m148819a(Integer.valueOf(((IMUser) t2).getFollowStatus()), Integer.valueOf(((IMUser) t).getFollowStatus()));
            }
        }

        C31674c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m102896a((List) obj);
        }

        /* renamed from: a */
        private static List<IMUser> m102896a(List<? extends IMUser> list) {
            C7573i.m23587b(list, "list");
            return C7525m.m23494a((Iterable<? extends T>) list, (Comparator<? super T>) new C31675a<Object>());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c$d */
    static final /* synthetic */ class C31676d extends FunctionReference implements C7562b<C31628c<IMContact>, Boolean> {
        C31676d(C31671c cVar) {
            super(1, cVar);
        }

        public final String getName() {
            return "intercept";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31671c.class);
        }

        public final String getSignature() {
            return "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/core/core/CombinedLoader$InterceptPayload;)Z";
        }

        /* renamed from: a */
        private boolean m102897a(C31628c<IMContact> cVar) {
            C7573i.m23587b(cVar, "p1");
            return ((C31671c) this.receiver).mo82451a(cVar);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m102897a((C31628c) obj));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C31643e<IMContact> mo82397a() {
        if (this.f82889k != null) {
            C31625a<IMContact> aVar = this.f82889k;
            if (aVar == null) {
                C7573i.m23580a();
            }
            return aVar;
        }
        this.f82889k = C31627b.m102792a().mo82418a(this.f82888j).mo82420a((C7562b<? super C31628c<R>, Boolean>) new C31676d<Object,Boolean>(this)).mo82417a((C31641d<R>) this).f82831a;
        C31625a<IMContact> aVar2 = this.f82889k;
        if (aVar2 == null) {
            C7573i.m23580a();
        }
        return aVar2;
    }

    public C31671c(C31690a aVar) {
        String str;
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
        if (aVar.f82917d) {
            str = C31850a.m103366e();
        } else {
            str = C31850a.m103370i();
        }
        this.f82886h = str;
        C31638a a = C31639b.m102815a();
        String str2 = this.f82886h;
        C7573i.m23582a((Object) str2, "followSql");
        this.f82887i = (C31637c) a.mo82424a(str2).mo82426a(false).mo82425a((C7561a<? extends List<String>>) new C31673b<Object>(this)).mo82436a(100).mo82438b(C31674c.f82891a).mo82428b();
        this.f82888j = C31655a.m102868a().mo82441a((C31644f<?, R>) this.f82809b).mo82441a((C31644f<?, R>) this.f82887i);
    }

    /* renamed from: a */
    public final boolean mo82451a(C31628c<IMContact> cVar) {
        List<R> list;
        if (cVar.f82834c != this.f82809b || cVar.f82833b.size() <= 15) {
            list = cVar.f82833b;
        } else {
            list = cVar.f82833b.subList(0, 15);
        }
        cVar.f82832a.put(cVar.f82834c, list);
        if (cVar.f82834c != this.f82809b || !(!list.isEmpty())) {
            if (cVar.f82834c == this.f82887i && ((C31637c) cVar.f82834c).f82847e == 1 && (!list.isEmpty())) {
                ((IMContact) list.get(0)).setType(3);
            }
            return false;
        }
        ((IMContact) list.get(0)).setType(2);
        this.f82885d = m102753a(list);
        return true;
    }
}
