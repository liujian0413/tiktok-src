package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.api.exceptions.ApiException;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26135a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26095a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26097b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26113q;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e.C32010a;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e.C32011b;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e.C32012c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ak */
public final class C26128ak implements C26113q, C26134am, C26135a, C26136b, C32010a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68949a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26128ak.class), "batchModel", "getBatchModel()Lcom/ss/android/ugc/aweme/detail/presenter/BatchDetailModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26128ak.class), "batchPresenter", "getBatchPresenter()Lcom/ss/android/ugc/aweme/detail/presenter/BatchDetailPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26128ak.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C26129a f68950b = new C26129a(null);

    /* renamed from: c */
    private final C7541d f68951c = C7546e.m23569a(new C26130b(this));

    /* renamed from: d */
    private final C7541d f68952d = C7546e.m23569a(C26131c.f68962a);

    /* renamed from: e */
    private final C7541d f68953e = C7546e.m23569a(C26132d.f68963a);

    /* renamed from: f */
    private int f68954f = 1;

    /* renamed from: g */
    private C32012c f68955g;

    /* renamed from: h */
    private boolean f68956h;

    /* renamed from: i */
    private boolean f68957i;

    /* renamed from: j */
    private C26138ao f68958j;

    /* renamed from: k */
    private long f68959k;

    /* renamed from: l */
    private final C32009e f68960l;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$a */
    public static final class C26129a {
        private C26129a() {
        }

        public /* synthetic */ C26129a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$b */
    static final class C26130b extends Lambda implements C7561a<C26095a> {

        /* renamed from: a */
        final /* synthetic */ C26128ak f68961a;

        C26130b(C26128ak akVar) {
            this.f68961a = akVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C26095a invoke() {
            return new C26095a(this.f68961a.mo67682a(0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$c */
    static final class C26131c extends Lambda implements C7561a<C26097b> {

        /* renamed from: a */
        public static final C26131c f68962a = new C26131c();

        C26131c() {
            super(0);
        }

        /* renamed from: a */
        private static C26097b m85888a() {
            return new C26097b();
        }

        public final /* synthetic */ Object invoke() {
            return m85888a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$d */
    static final class C26132d extends Lambda implements C7561a<List<Aweme>> {

        /* renamed from: a */
        public static final C26132d f68963a = new C26132d();

        C26132d() {
            super(0);
        }

        /* renamed from: a */
        private static List<Aweme> m85889a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m85889a();
        }
    }

    /* renamed from: h */
    private final C26095a m85864h() {
        return (C26095a) this.f68951c.getValue();
    }

    /* renamed from: i */
    private final C26097b m85865i() {
        return (C26097b) this.f68952d.getValue();
    }

    /* renamed from: j */
    private final List<Aweme> m85866j() {
        return (List) this.f68953e.getValue();
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 7000;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        C7573i.m23587b(fragment, "owner");
        return true;
    }

    /* renamed from: d */
    public final boolean mo67699d() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo67692f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo67693g() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        C7573i.m23587b(str, "aid");
        this.f68960l.mo80543a(str);
        int size = m85866j().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            Aweme forwardItem = ((Aweme) m85866j().get(i)).getForwardItem();
            C7573i.m23582a((Object) forwardItem, "realAweme");
            if (TextUtils.equals(forwardItem.getAid(), str)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        m85866j().remove(i);
        this.f68959k = System.currentTimeMillis();
        C26138ao aoVar = this.f68958j;
        if (aoVar != null) {
            aoVar.mo61747c_(i);
        }
        return true;
    }

    /* renamed from: a */
    public final Object mo67683a() {
        return m85864h();
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return m85866j().isEmpty();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68958j = null;
        m85866j().clear();
        m85865i().mo59134U_();
        m85865i().mo66535W_();
        this.f68960l.mo80540a();
    }

    /* renamed from: k */
    private static Aweme m85867k() {
        Aweme aweme = new Aweme();
        AwemeStatus awemeStatus = new AwemeStatus();
        aweme.setCanPlay(false);
        awemeStatus.setDelete(true);
        aweme.setStatus(awemeStatus);
        User user = new User();
        user.setAdFake(false);
        aweme.setAuthor(user);
        return aweme;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        boolean z;
        StringBuilder sb = new StringBuilder("isLoading: ");
        if (this.f68956h || m85865i().mo66540i()) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.f68956h || m85865i().mo66540i()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m85863d(C32012c cVar) {
        this.f68955g = cVar;
        this.f68956h = false;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        this.f68957i = true;
    }

    public C26128ak(C32009e eVar) {
        C7573i.m23587b(eVar, "provider");
        this.f68960l = eVar;
    }

    /* renamed from: b */
    private final long m85859b(boolean z) {
        Object h;
        long j = -1;
        if (m85866j().isEmpty()) {
            return -1;
        }
        if (z) {
            h = C7525m.m23511f(m85866j());
        } else {
            h = C7525m.m23515h(m85866j());
        }
        try {
            String aid = ((Aweme) h).getAid();
            C7573i.m23582a((Object) aid, "aweme.aid");
            j = Long.parseLong(aid);
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        C7573i.m23587b(aoVar, "detailFragmentPanel");
        this.f68958j = aoVar;
        m85865i().mo66537a(this);
        m85865i().mo66536a(m85864h());
        this.f68960l.mo80542a((C32010a) this);
    }

    /* renamed from: c */
    public final void mo67698c(C32012c cVar) {
        C7573i.m23587b(cVar, "response");
        m85863d(cVar);
        if (cVar.f83729a.isEmpty()) {
            C26138ao aoVar = this.f68958j;
            if (aoVar != null) {
                aoVar.mo67623d(this.f68957i);
            }
            this.f68957i = false;
            C26138ao aoVar2 = this.f68958j;
            if (aoVar2 != null) {
                aoVar2.mo59108b(m85866j(), cVar.f83730b);
            }
        } else {
            m85865i().mo56976a(m85862d(cVar.f83729a));
        }
    }

    /* renamed from: c */
    private final void m85861c(List<Aweme> list) {
        boolean z;
        Collection collection = list;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int size = list.size();
            C32012c cVar = this.f68955g;
            if (cVar != null) {
                List<C32011b> list2 = cVar.f83729a;
                if (list2 != null && size == list2.size()) {
                    C32012c cVar2 = this.f68955g;
                    if (cVar2 == null) {
                        C7573i.m23580a();
                    }
                    List<C32011b> list3 = cVar2.f83729a;
                    List arrayList = new ArrayList();
                    arrayList.addAll(collection);
                    list.clear();
                    for (Object next : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C7525m.m23465b();
                        }
                        Aweme aweme = (Aweme) next;
                        Aweme aweme2 = new Aweme();
                        C32011b bVar = (C32011b) list3.get(i);
                        C7573i.m23585a((Object) aweme.getAid(), (Object) bVar.f83727a);
                        aweme2.setAid(String.valueOf(bVar.f83728b));
                        aweme2.setAwemeType(13);
                        aweme2.setForwardItem(aweme);
                        list.add(aweme2);
                        i = i2;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static String m85862d(List<C32011b> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        String str = ",";
        for (C32011b bVar : list) {
            sb.append(bVar.f83727a);
            sb.append(str);
        }
        C7634n.m23735a((CharSequence) sb, (CharSequence) str);
        sb.append("]");
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: b */
    public final void mo67697b(C32012c cVar) {
        C7573i.m23587b(cVar, "response");
        m85863d(cVar);
        if (cVar.f83729a.isEmpty()) {
            C26138ao aoVar = this.f68958j;
            if (aoVar != null) {
                aoVar.mo67623d(this.f68957i);
            }
            this.f68957i = false;
            C26138ao aoVar2 = this.f68958j;
            if (aoVar2 != null) {
                aoVar2.mo59110c(m85866j(), cVar.f83730b);
            }
        } else {
            m85865i().mo56976a(m85862d(cVar.f83729a));
        }
    }

    /* renamed from: b */
    private final void m85860b(List<Aweme> list) {
        boolean z;
        if (this.f68955g != null) {
            Iterable<Aweme> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (Aweme aid : iterable) {
                arrayList.add(aid.getAid());
            }
            List d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
            List arrayList2 = new ArrayList();
            C32012c cVar = this.f68955g;
            if (cVar == null) {
                C7573i.m23580a();
            }
            arrayList2.addAll(cVar.f83729a);
            int i = 0;
            for (Object next : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                C32011b bVar = (C32011b) next;
                int size = d.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        if (TextUtils.equals((CharSequence) d.get(i3), bVar.f83727a) && i == i3) {
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    Aweme k = m85867k();
                    k.setAid(bVar.f83727a);
                    list.add(i, k);
                    d.add(i, bVar.f83727a);
                }
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo67696a(C32012c cVar) {
        C7573i.m23587b(cVar, "response");
        m85863d(cVar);
        if (cVar.f83729a.isEmpty()) {
            m85866j().clear();
            C26138ao aoVar = this.f68958j;
            if (aoVar != null) {
                aoVar.mo59099a(m85866j(), cVar.f83730b);
            }
        } else {
            m85865i().mo56976a(m85862d(cVar.f83729a));
        }
    }

    /* renamed from: a */
    public final void mo67612a(Exception exc) {
        if (!(exc instanceof ApiException) || ((ApiException) exc).getErrorCode() != 2053) {
            boolean z = this.f68957i;
            this.f68955g = null;
            C26138ao aoVar = this.f68958j;
            if (aoVar != null) {
                aoVar.mo67623d(this.f68957i);
            }
            this.f68957i = false;
            if (!z) {
                switch (this.f68954f) {
                    case 1:
                        C26138ao aoVar2 = this.f68958j;
                        if (aoVar2 != null) {
                            aoVar2.mo59105a_(exc);
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        C26138ao aoVar3 = this.f68958j;
                        if (aoVar3 != null) {
                            aoVar3.mo59109c(exc);
                            break;
                        } else {
                            return;
                        }
                    default:
                        C26138ao aoVar4 = this.f68958j;
                        if (aoVar4 != null) {
                            aoVar4.mo59107b(exc);
                            return;
                        }
                        break;
                }
            }
            return;
        }
        mo67614a(null);
    }

    /* renamed from: a */
    public final void mo67614a(List<Aweme> list) {
        Object obj;
        boolean z;
        StringBuilder sb = new StringBuilder("onBatchDetailSuccess: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = null;
        }
        sb.append(obj);
        C32012c cVar = this.f68955g;
        if (cVar != null) {
            z = cVar.f83730b;
        } else {
            z = false;
        }
        C26138ao aoVar = this.f68958j;
        if (aoVar != null) {
            aoVar.mo67623d(this.f68957i);
        }
        this.f68957i = false;
        if (list == null) {
            list = new ArrayList<>();
        }
        m85860b(list);
        m85861c(list);
        this.f68955g = null;
        switch (this.f68954f) {
            case 1:
                m85866j().clear();
                m85866j().addAll(list);
                C26138ao aoVar2 = this.f68958j;
                if (aoVar2 != null) {
                    aoVar2.mo59099a(m85866j(), z);
                    break;
                } else {
                    return;
                }
            case 2:
                m85866j().addAll(0, list);
                C26138ao aoVar3 = this.f68958j;
                if (aoVar3 != null) {
                    aoVar3.mo59110c(m85866j(), !list.isEmpty());
                    break;
                } else {
                    return;
                }
            default:
                m85866j().addAll(list);
                C26138ao aoVar4 = this.f68958j;
                if (aoVar4 != null) {
                    aoVar4.mo59108b(m85866j(), z);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        if (!mo67689c() && System.currentTimeMillis() - this.f68959k >= 500) {
            C26138ao aoVar = this.f68958j;
            if (aoVar != null) {
                aoVar.mo67623d(this.f68957i);
            }
            this.f68954f = i;
            this.f68956h = true;
            switch (i) {
                case 1:
                    this.f68960l.mo80544b();
                    return;
                case 2:
                    this.f68960l.mo80545b(m85859b(true));
                    return;
                default:
                    this.f68960l.mo80541a(m85859b(false));
                    return;
            }
        }
    }
}
