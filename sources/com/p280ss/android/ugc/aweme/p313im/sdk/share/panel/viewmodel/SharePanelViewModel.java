package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewmodel;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31684d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d.C31642a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31807a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31912l;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel */
public final class SharePanelViewModel implements C0042h, C31641d<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83301a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SharePanelViewModel.class), "contactList", "getContactList()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SharePanelViewModel.class), "selectContactList", "getSelectContactList()Ljava/util/Set;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SharePanelViewModel.class), "relationModel", "getRelationModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/SharePanelRelationModel;"))};

    /* renamed from: d */
    public static final C31841a f83302d = new C31841a(null);

    /* renamed from: b */
    public C31845a f83303b;

    /* renamed from: c */
    public SharePackage f83304c;

    /* renamed from: e */
    private final C7541d f83305e = C7546e.m23569a(C31842b.f83308a);

    /* renamed from: f */
    private final C7541d f83306f = C7546e.m23569a(C31844d.f83310a);

    /* renamed from: g */
    private final C7541d f83307g = C7546e.m23569a(new C31843c(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$a */
    public static final class C31841a {
        private C31841a() {
        }

        public /* synthetic */ C31841a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$b */
    static final class C31842b extends Lambda implements C7561a<List<IMContact>> {

        /* renamed from: a */
        public static final C31842b f83308a = new C31842b();

        C31842b() {
            super(0);
        }

        /* renamed from: a */
        private static List<IMContact> m103338a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m103338a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$c */
    static final class C31843c extends Lambda implements C7561a<C31684d> {

        /* renamed from: a */
        final /* synthetic */ SharePanelViewModel f83309a;

        C31843c(SharePanelViewModel sharePanelViewModel) {
            this.f83309a = sharePanelViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31684d invoke() {
            return new C31684d(new C31690a(1, C31912l.m103665a(this.f83309a.f83304c)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$d */
    static final class C31844d extends Lambda implements C7561a<Set<IMContact>> {

        /* renamed from: a */
        public static final C31844d f83310a = new C31844d();

        C31844d() {
            super(0);
        }

        /* renamed from: a */
        private static Set<IMContact> m103340a() {
            return new LinkedHashSet<>();
        }

        public final /* synthetic */ Object invoke() {
            return m103340a();
        }
    }

    /* renamed from: c */
    private List<IMContact> m103329c() {
        return (List) this.f83305e.getValue();
    }

    /* renamed from: d */
    private final C31684d m103330d() {
        return (C31684d) this.f83307g.getValue();
    }

    /* renamed from: a */
    public final Set<IMContact> mo82667a() {
        return (Set) this.f83306f.getValue();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m103330d().mo82401b();
        this.f83303b = null;
        this.f83304c = null;
    }

    /* renamed from: b */
    public final void mo82669b() {
        m103330d().mo82398a((C31641d<IMContact>) this);
        m103330d().mo82406e();
    }

    /* renamed from: b */
    public final void mo82402b(Throwable th) {
        C7573i.m23587b(th, "t");
        C31642a.m102821a(this, th);
    }

    /* renamed from: a */
    public final void mo82399a(Throwable th) {
        C7573i.m23587b(th, "t");
        m103329c().clear();
        C31845a aVar = this.f83303b;
        if (aVar != null) {
            aVar.mo82646b(m103329c());
        }
    }

    public SharePanelViewModel(SharePackage sharePackage) {
        this.f83304c = sharePackage;
    }

    /* renamed from: a */
    public final boolean mo82668a(IMContact iMContact, boolean z) {
        C7573i.m23587b(iMContact, "contact");
        C31845a aVar = this.f83303b;
        if (aVar != null) {
            return aVar.mo82644a(iMContact, z);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo82403b(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        C31642a.m102822a(this, list, z);
    }

    /* renamed from: a */
    public final void mo82400a(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        new StringBuilder("onLoadSuccess: ");
        Iterable<IMContact> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (IMContact displayName : iterable) {
            arrayList.add(displayName.getDisplayName());
        }
        List a = C31807a.f83208c.mo18255a(list);
        m103329c().clear();
        m103329c().addAll(a);
        C31845a aVar = this.f83303b;
        if (aVar != null) {
            aVar.mo82646b(m103329c());
        }
    }
}
