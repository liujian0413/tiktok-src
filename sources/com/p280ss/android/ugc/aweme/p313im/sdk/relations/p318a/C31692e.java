package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
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
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b.C31665c.C31666a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e */
public class C31692e extends C31702f {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f82918d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31692e.class), "indexCountList", "getIndexCountList()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31692e.class), "indexLetterList", "getIndexLetterList()Ljava/util/List;"))};

    /* renamed from: e */
    public static final C31693a f82919e = new C31693a(null);

    /* renamed from: h */
    private final C7541d f82920h = C7546e.m23569a(C31694b.f82926a);

    /* renamed from: i */
    private final C7541d f82921i = C7546e.m23569a(C31695c.f82927a);

    /* renamed from: j */
    private final String f82922j;

    /* renamed from: k */
    private final C31637c f82923k;

    /* renamed from: l */
    private final C31654g<IMContact> f82924l;

    /* renamed from: m */
    private C31625a<IMContact> f82925m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e$a */
    public static final class C31693a {
        private C31693a() {
        }

        public /* synthetic */ C31693a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e$b */
    static final class C31694b extends Lambda implements C7561a<List<Integer>> {

        /* renamed from: a */
        public static final C31694b f82926a = new C31694b();

        C31694b() {
            super(0);
        }

        /* renamed from: a */
        private static List<Integer> m102935a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102935a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e$c */
    static final class C31695c extends Lambda implements C7561a<List<String>> {

        /* renamed from: a */
        public static final C31695c f82927a = new C31695c();

        C31695c() {
            super(0);
        }

        /* renamed from: a */
        private static List<String> m102936a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102936a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e$d */
    static final /* synthetic */ class C31696d extends FunctionReference implements C7562b<C31628c<IMContact>, Boolean> {
        C31696d(C31692e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "intercept";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31692e.class);
        }

        public final String getSignature() {
            return "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/core/core/CombinedLoader$InterceptPayload;)Z";
        }

        /* renamed from: a */
        private boolean m102937a(C31628c<IMContact> cVar) {
            C7573i.m23587b(cVar, "p1");
            return ((C31692e) this.receiver).mo82465a(cVar);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m102937a((C31628c) obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e$e */
    static final class C31697e extends Lambda implements C7562b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31690a f82928a;

        C31697e(C31690a aVar) {
            this.f82928a = aVar;
            super(1);
        }

        /* renamed from: a */
        private boolean m102938a(IMContact iMContact) {
            C7573i.m23587b(iMContact, "it");
            return C31666a.m102886a(this.f82928a).mo82448a(iMContact);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m102938a((IMContact) obj));
        }
    }

    /* renamed from: g */
    public final List<Integer> mo82462g() {
        return (List) this.f82920h.getValue();
    }

    /* renamed from: h */
    public final List<String> mo82466h() {
        return (List) this.f82921i.getValue();
    }

    /* renamed from: e */
    public final C7581n mo82406e() {
        mo82466h().clear();
        mo82462g().clear();
        return super.mo82406e();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public C31625a<IMContact> mo82397a() {
        if (this.f82925m != null) {
            C31625a<IMContact> aVar = this.f82925m;
            if (aVar == null) {
                C7573i.m23580a();
            }
            return aVar;
        }
        this.f82925m = C31627b.m102792a().mo82418a(this.f82924l).mo82420a((C7562b<? super C31628c<R>, Boolean>) new C31696d<Object,Boolean>(this)).mo82417a((C31641d<R>) this).f82831a;
        C31625a<IMContact> aVar2 = this.f82925m;
        if (aVar2 == null) {
            C7573i.m23580a();
        }
        return aVar2;
    }

    /* renamed from: a */
    public final boolean mo82465a(C31628c<IMContact> cVar) {
        if (cVar.f82834c == this.f82809b) {
            m102922b(cVar);
            return true;
        }
        m102925d(cVar);
        return false;
    }

    /* renamed from: d */
    private final void m102925d(C31628c<IMContact> cVar) {
        if (C6399b.m19945u()) {
            m102928g(cVar);
        } else if (this.f82810c.mo82464b()) {
            m102927f(cVar);
        } else {
            m102926e(cVar);
        }
    }

    /* renamed from: c */
    private final void m102923c(C31628c<IMContact> cVar) {
        boolean z;
        List list = (List) cVar.f82832a.get(this.f82809b);
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo82466h().add("recent");
            mo82462g().add(Integer.valueOf(list.size()));
        }
    }

    /* renamed from: b */
    private static List<IMContact> m102921b(List<IMContact> list) {
        int i;
        List<IMContact> arrayList = new ArrayList<>();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj != null) {
                IMUser iMUser = (IMUser) obj;
                if (iMUser.getFollowStatus() == 2) {
                    IMUser clone = iMUser.clone();
                    if (arrayList.isEmpty()) {
                        C7573i.m23582a((Object) clone, "clone");
                        clone.setType(5);
                    } else {
                        C7573i.m23582a((Object) clone, "clone");
                        clone.setType(6);
                    }
                    arrayList.add(clone);
                }
                if (i2 == 0) {
                    i = 3;
                } else {
                    i = 0;
                }
                iMUser.setType(i);
                i2++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m102924c(List<IMContact> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        Object obj = null;
        int i3 = 0;
        while (i2 < size) {
            Object obj2 = list.get(i2);
            if (obj2 != null) {
                String initialLetter = ((IMUser) obj2).getInitialLetter();
                CharSequence charSequence = initialLetter;
                if (!TextUtils.isEmpty(charSequence)) {
                    if (obj == null || TextUtils.equals(charSequence, (CharSequence) obj)) {
                        i = i3 + 1;
                    } else {
                        mo82466h().add(obj);
                        mo82462g().add(Integer.valueOf(i3));
                        i = 1;
                    }
                    if (i2 == list.size() - 1) {
                        List h = mo82466h();
                        C7573i.m23582a((Object) initialLetter, "lastLetter");
                        h.add(initialLetter);
                        mo82462g().add(Integer.valueOf(i));
                    }
                    i3 = i;
                    obj = initialLetter;
                }
                i2++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
    }

    /* renamed from: e */
    private final void m102926e(C31628c<IMContact> cVar) {
        List arrayList = new ArrayList();
        List b = m102921b(cVar.f82833b);
        Collection collection = b;
        if (!collection.isEmpty()) {
            mo82466h().add("Friend");
            mo82462g().add(Integer.valueOf(b.size()));
            arrayList.addAll(collection);
        }
        if (!this.f82810c.f82917d && (!cVar.f82833b.isEmpty())) {
            m102924c(cVar.f82833b);
            arrayList.addAll(cVar.f82833b);
        }
        cVar.f82832a.put(cVar.f82834c, arrayList);
    }

    /* renamed from: f */
    private final void m102927f(C31628c<IMContact> cVar) {
        m102923c(cVar);
        List arrayList = new ArrayList();
        if (cVar.f82833b.size() > 10) {
            List b = m102921b(cVar.f82833b);
            Collection collection = b;
            if (!collection.isEmpty()) {
                if (this.f82810c.f82917d) {
                    m102924c(b);
                } else {
                    mo82466h().add("Friend");
                    mo82462g().add(Integer.valueOf(b.size()));
                }
                arrayList.addAll(collection);
            }
        }
        if (!this.f82810c.f82917d && (!cVar.f82833b.isEmpty())) {
            m102924c(cVar.f82833b);
            arrayList.addAll(cVar.f82833b);
        }
        cVar.f82832a.put(cVar.f82834c, arrayList);
    }

    public C31692e(C31690a aVar) {
        String str;
        C31654g gVar;
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
        if (aVar.f82917d) {
            str = C31850a.m103366e();
        } else {
            str = C31850a.m103370i();
        }
        this.f82922j = str;
        boolean z = true;
        C31638a a = C31639b.m102815a().mo82426a(true);
        String str2 = this.f82922j;
        C7573i.m23582a((Object) str2, "sortWeightSql");
        this.f82923k = (C31637c) a.mo82424a(str2).mo82436a(-1).mo82439c(new C31697e(aVar)).mo82428b();
        C31654g a2 = C31655a.m102868a();
        if (!aVar.mo82464b() && !C6399b.m19945u()) {
            z = false;
        }
        if (z) {
            gVar = a2;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.mo82441a((C31644f<?, R>) this.f82809b);
        }
        this.f82924l = a2.mo82441a((C31644f<?, R>) this.f82923k);
    }

    /* renamed from: b */
    private static void m102922b(C31628c<IMContact> cVar) {
        List<R> list;
        int size = cVar.f82833b.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                ((IMContact) cVar.f82833b.get(i)).setType(2);
            } else {
                ((IMContact) cVar.f82833b.get(i)).setType(1);
            }
        }
        Map map = cVar.f82832a;
        C31643e<R> eVar = cVar.f82834c;
        if (cVar.f82833b.size() > 15) {
            list = cVar.f82833b.subList(0, 15);
        } else {
            list = cVar.f82833b;
        }
        map.put(eVar, list);
    }

    /* renamed from: g */
    private final void m102928g(C31628c<IMContact> cVar) {
        List arrayList = new ArrayList();
        List b = m102921b(cVar.f82833b);
        boolean z = false;
        if (!this.f82810c.f82917d ? cVar.f82833b.size() > 10 : b.size() > 10) {
            z = true;
        }
        if (z || !cVar.f82832a.containsKey(this.f82809b)) {
            m102923c(cVar);
        } else {
            cVar.f82832a.remove(this.f82809b);
        }
        Collection collection = b;
        if (!collection.isEmpty()) {
            if (this.f82810c.f82917d) {
                m102924c(b);
            } else {
                mo82466h().add("Friend");
                mo82462g().add(Integer.valueOf(b.size()));
            }
            arrayList.addAll(collection);
        }
        if (!this.f82810c.f82917d && (!cVar.f82833b.isEmpty())) {
            m102924c(cVar.f82833b);
            arrayList.addAll(cVar.f82833b);
        }
        cVar.f82832a.put(cVar.f82834c, arrayList);
    }
}
