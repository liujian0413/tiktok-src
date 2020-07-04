package com.p280ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.aweme.status.p1632b.C41809a;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel */
public final class RecordStatusViewModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108654a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "loadStatusList", "getLoadStatusList()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "effectResponse", "getEffectResponse()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "loadCateoryList", "getLoadCateoryList()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "effectCategoryResponse", "getEffectCategoryResponse()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "downloadEffect", "getDownloadEffect()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "enterEditActivity", "getEnterEditActivity()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "loadRandomData", "getLoadRandomData()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "createStatusEnterEditActivity", "getCreateStatusEnterEditActivity()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "createStatusEnterEditActivityMusicProgress", "getCreateStatusEnterEditActivityMusicProgress()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "createStatusEnterEditActivityBgProgress", "getCreateStatusEnterEditActivityBgProgress()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "createStatusEnterEditActivityEffectProgress", "getCreateStatusEnterEditActivityEffectProgress()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "clickStatusPendant", "getClickStatusPendant()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "hideStatusPendantScene", "getHideStatusPendantScene()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "statusEnter", "getStatusEnter()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "showTemplate", "getShowTemplate()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "statusEnterMethod", "getStatusEnterMethod()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordStatusViewModel.class), "clickTabName", "getClickTabName()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private final C7541d f108655b = C7546e.m23569a(C41772n.f108685a);

    /* renamed from: c */
    private final C7541d f108656c = C7546e.m23569a(C41767i.f108680a);

    /* renamed from: d */
    private final C7541d f108657d = C7546e.m23569a(C41770l.f108683a);

    /* renamed from: e */
    private final C7541d f108658e = C7546e.m23569a(C41766h.f108679a);

    /* renamed from: f */
    private final C7541d f108659f = C7546e.m23569a(C41765g.f108678a);

    /* renamed from: g */
    private final C7541d f108660g = C7546e.m23569a(C41768j.f108681a);

    /* renamed from: h */
    private final C7541d f108661h = C7546e.m23569a(C41771m.f108684a);

    /* renamed from: i */
    private final C7541d f108662i = C7546e.m23569a(C41761c.f108674a);

    /* renamed from: j */
    private final C7541d f108663j = C7546e.m23569a(C41764f.f108677a);

    /* renamed from: k */
    private final C7541d f108664k = C7546e.m23569a(C41762d.f108675a);

    /* renamed from: l */
    private final C7541d f108665l = C7546e.m23569a(C41763e.f108676a);

    /* renamed from: m */
    private final C7541d f108666m = C7546e.m23569a(C41759a.f108672a);

    /* renamed from: n */
    private final C7541d f108667n = C7546e.m23569a(C41769k.f108682a);

    /* renamed from: o */
    private final C7541d f108668o = C7546e.m23569a(C41774p.f108687a);

    /* renamed from: p */
    private final C7541d f108669p = C7546e.m23569a(C41773o.f108686a);

    /* renamed from: q */
    private final C7541d f108670q = C7546e.m23569a(C41775q.f108688a);

    /* renamed from: r */
    private final C7541d f108671r = C7546e.m23569a(C41760b.f108673a);

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$a */
    static final class C41759a extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C41759a f108672a = new C41759a();

        C41759a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m132976a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132976a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$b */
    static final class C41760b extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C41760b f108673a = new C41760b();

        C41760b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<String> m132977a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132977a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$c */
    static final class C41761c extends Lambda implements C7561a<C0052o<C41809a>> {

        /* renamed from: a */
        public static final C41761c f108674a = new C41761c();

        C41761c() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C41809a> m132978a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132978a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$d */
    static final class C41762d extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41762d f108675a = new C41762d();

        C41762d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m132979a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132979a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$e */
    static final class C41763e extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41763e f108676a = new C41763e();

        C41763e() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m132980a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132980a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$f */
    static final class C41764f extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41764f f108677a = new C41764f();

        C41764f() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m132981a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132981a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$g */
    static final class C41765g extends Lambda implements C7561a<C0052o<C41809a>> {

        /* renamed from: a */
        public static final C41765g f108678a = new C41765g();

        C41765g() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C41809a> m132982a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132982a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$h */
    static final class C41766h extends Lambda implements C7561a<C0052o<CategoryPageModel>> {

        /* renamed from: a */
        public static final C41766h f108679a = new C41766h();

        C41766h() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<CategoryPageModel> m132983a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132983a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$i */
    static final class C41767i extends Lambda implements C7561a<C0052o<EffectChannelResponse>> {

        /* renamed from: a */
        public static final C41767i f108680a = new C41767i();

        C41767i() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<EffectChannelResponse> m132984a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132984a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$j */
    static final class C41768j extends Lambda implements C7561a<C0052o<C41809a>> {

        /* renamed from: a */
        public static final C41768j f108681a = new C41768j();

        C41768j() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C41809a> m132985a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132985a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$k */
    static final class C41769k extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C41769k f108682a = new C41769k();

        C41769k() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m132986a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132986a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$l */
    static final class C41770l extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C41770l f108683a = new C41770l();

        C41770l() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<String> m132987a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132987a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$m */
    static final class C41771m extends Lambda implements C7561a<C0052o<C41809a>> {

        /* renamed from: a */
        public static final C41771m f108684a = new C41771m();

        C41771m() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C41809a> m132988a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132988a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$n */
    static final class C41772n extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C41772n f108685a = new C41772n();

        C41772n() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m132989a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132989a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$o */
    static final class C41773o extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C41773o f108686a = new C41773o();

        C41773o() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<String> m132990a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132990a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$p */
    static final class C41774p extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41774p f108687a = new C41774p();

        C41774p() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m132991a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132991a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$q */
    static final class C41775q extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C41775q f108688a = new C41775q();

        C41775q() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<String> m132992a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m132992a();
        }
    }

    /* renamed from: a */
    public final C0052o<Boolean> mo102530a() {
        return (C0052o) this.f108655b.getValue();
    }

    /* renamed from: b */
    public final C0052o<EffectChannelResponse> mo102531b() {
        return (C0052o) this.f108656c.getValue();
    }

    /* renamed from: c */
    public final C0052o<String> mo102532c() {
        return (C0052o) this.f108657d.getValue();
    }

    /* renamed from: d */
    public final C0052o<CategoryPageModel> mo102533d() {
        return (C0052o) this.f108658e.getValue();
    }

    /* renamed from: e */
    public final C0052o<C41809a> mo102534e() {
        return (C0052o) this.f108659f.getValue();
    }

    /* renamed from: f */
    public final C0052o<C41809a> mo102535f() {
        return (C0052o) this.f108660g.getValue();
    }

    /* renamed from: g */
    public final C0052o<C41809a> mo102536g() {
        return (C0052o) this.f108661h.getValue();
    }

    /* renamed from: h */
    public final C0052o<C41809a> mo102537h() {
        return (C0052o) this.f108662i.getValue();
    }

    /* renamed from: i */
    public final C0052o<Integer> mo102538i() {
        return (C0052o) this.f108663j.getValue();
    }

    /* renamed from: j */
    public final C0052o<Integer> mo102539j() {
        return (C0052o) this.f108664k.getValue();
    }

    /* renamed from: k */
    public final C0052o<Integer> mo102540k() {
        return (C0052o) this.f108665l.getValue();
    }

    /* renamed from: l */
    public final C0052o<Boolean> mo102541l() {
        return (C0052o) this.f108666m.getValue();
    }

    /* renamed from: m */
    public final C0052o<Boolean> mo102542m() {
        return (C0052o) this.f108667n.getValue();
    }

    /* renamed from: n */
    public final C0052o<Integer> mo102543n() {
        return (C0052o) this.f108668o.getValue();
    }

    /* renamed from: o */
    public final C0052o<String> mo102544o() {
        return (C0052o) this.f108669p.getValue();
    }

    /* renamed from: p */
    public final C0052o<String> mo102545p() {
        return (C0052o) this.f108670q.getValue();
    }

    /* renamed from: q */
    public final C0052o<String> mo102546q() {
        return (C0052o) this.f108671r.getValue();
    }
}
