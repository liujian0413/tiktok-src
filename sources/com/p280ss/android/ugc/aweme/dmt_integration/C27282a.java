package com.p280ss.android.ugc.aweme.dmt_integration;

import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.beauty.C23539i;
import com.p280ss.android.ugc.aweme.common.p1140a.C25642b;
import com.p280ss.android.ugc.aweme.dmt_integration.p1191a.C27299a;
import com.p280ss.android.ugc.aweme.effect.C27428g;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27423b;
import com.p280ss.android.ugc.aweme.filter.C29332u;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29288a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.internal.C35609b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35531ac;
import com.p280ss.android.ugc.aweme.port.p1479in.C35533ad;
import com.p280ss.android.ugc.aweme.port.p1479in.C35534ae;
import com.p280ss.android.ugc.aweme.port.p1479in.C35535af;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai;
import com.p280ss.android.ugc.aweme.port.p1479in.C35543aj;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al;
import com.p280ss.android.ugc.aweme.port.p1479in.C35548am;
import com.p280ss.android.ugc.aweme.port.p1479in.C35549an;
import com.p280ss.android.ugc.aweme.port.p1479in.C35552ao;
import com.p280ss.android.ugc.aweme.port.p1479in.C35553ap;
import com.p280ss.android.ugc.aweme.port.p1479in.C35554aq;
import com.p280ss.android.ugc.aweme.port.p1479in.C35557ar;
import com.p280ss.android.ugc.aweme.port.p1479in.C35558as;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35575l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35576m;
import com.p280ss.android.ugc.aweme.port.p1479in.C35577n;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35580p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35581q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35582r;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s;
import com.p280ss.android.ugc.aweme.port.p1479in.C35590t;
import com.p280ss.android.ugc.aweme.port.p1479in.C35592u;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v;
import com.p280ss.android.ugc.aweme.port.p1479in.C35599w;
import com.p280ss.android.ugc.aweme.port.p1479in.C35601y;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.services.AndroidAssetServiceImpl;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import com.p280ss.android.ugc.aweme.services.sticker.StickerServiceImpl;
import com.p280ss.android.ugc.aweme.servicimpl.C37460ac;
import com.p280ss.android.ugc.aweme.servicimpl.C37525z;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.sticker.p1634b.C41846a;
import com.p280ss.android.ugc.aweme.storage.C41894b;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41942e;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42189a;
import com.p280ss.android.ugc.aweme.tools.draft.p1669d.C42286a;
import com.p280ss.android.ugc.aweme.tools.music.C42364a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1677c.C42520b;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.a */
public final class C27282a implements C35577n {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f71887a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "proxy", "getProxy()Lcom/ss/android/ugc/aweme/services/IAVServiceProxy;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "musicService", "getMusicService()Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "privacySettingService", "getPrivacySettingService()Lcom/ss/android/ugc/aweme/services/privacysetting/IAVPrivacySettingService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "permissionService", "getPermissionService()Lcom/ss/android/ugc/aweme/port/in/IPermissionService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "mvTemplateService", "getMvTemplateService()Lcom/ss/android/ugc/aweme/port/in/IMvTemplateService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "draftService", "getDraftService()Lcom/ss/android/ugc/aweme/port/in/IDraftInternalService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "avSettings", "getAvSettings()Lcom/ss/android/ugc/aweme/property/AVSettings;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "effectConfigService", "getEffectConfigService()Lcom/ss/android/ugc/aweme/port/internal/IEffectConfigService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "effectComponentService", "getEffectComponentService()Lcom/ss/android/ugc/aweme/effect/services/IEffectComponentService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "storageService", "getStorageService()Lcom/ss/android/ugc/aweme/storage/services/IStorageService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "androidAssetService", "getAndroidAssetService()Lcom/ss/android/ugc/aweme/common/android_asset/IAndroidAssetService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "avab", "getAvab()Lcom/ss/android/ugc/aweme/property/AVAB;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "filterComponentService", "getFilterComponentService()Lcom/ss/android/ugc/aweme/filter/services/IFilterComponentService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "stickerService", "getStickerService()Lcom/ss/android/ugc/aweme/sticker/services/IStickerInternalService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "beautyComponentService", "getBeautyComponentService()Lcom/ss/android/ugc/aweme/beauty/IBeautyComponentService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27282a.class), "customGson", "getCustomGson()Lcom/google/gson/Gson;"))};

    /* renamed from: b */
    private final C7541d f71888b = C7546e.m23569a(C27296n.f71917a);

    /* renamed from: c */
    private final C7541d f71889c = C7546e.m23569a(C27292j.f71913a);

    /* renamed from: d */
    private final C7541d f71890d = C7546e.m23569a(C27295m.f71916a);

    /* renamed from: e */
    private final C7541d f71891e = C7546e.m23569a(C27294l.f71915a);

    /* renamed from: f */
    private final C7541d f71892f = C7546e.m23569a(C27293k.f71914a);

    /* renamed from: g */
    private final C7541d f71893g = C7546e.m23569a(C27288f.f71909a);

    /* renamed from: h */
    private final C7541d f71894h = C7546e.m23569a(C27284b.f71905a);

    /* renamed from: i */
    private final C7541d f71895i = C7546e.m23569a(C27290h.f71911a);

    /* renamed from: j */
    private final C7541d f71896j = C7546e.m23569a(C27289g.f71910a);

    /* renamed from: k */
    private final C7541d f71897k = C7546e.m23569a(C27298p.f71919a);

    /* renamed from: l */
    private final C7541d f71898l = C7546e.m23569a(C27283a.f71904a);

    /* renamed from: m */
    private final C7541d f71899m = C7546e.m23569a(C27285c.f71906a);

    /* renamed from: n */
    private final C7541d f71900n = C7546e.m23569a(C27291i.f71912a);

    /* renamed from: o */
    private final C7541d f71901o = C7546e.m23569a(C27297o.f71918a);

    /* renamed from: p */
    private final C7541d f71902p = C7546e.m23569a(C27286d.f71907a);

    /* renamed from: q */
    private final C7541d f71903q = C7546e.m23569a(C27287e.f71908a);

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$a */
    static final class C27283a extends Lambda implements C7561a<AndroidAssetServiceImpl> {

        /* renamed from: a */
        public static final C27283a f71904a = new C27283a();

        C27283a() {
            super(0);
        }

        /* renamed from: a */
        private static AndroidAssetServiceImpl m89381a() {
            return new AndroidAssetServiceImpl();
        }

        public final /* synthetic */ Object invoke() {
            return m89381a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$b */
    static final class C27284b extends Lambda implements C7561a<AVSettings> {

        /* renamed from: a */
        public static final C27284b f71905a = new C27284b();

        C27284b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m89382a();
        }

        /* renamed from: a */
        private static AVSettings m89382a() {
            return new AVSettings(C35563c.f93238a, 7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$c */
    static final class C27285c extends Lambda implements C7561a<AVAB> {

        /* renamed from: a */
        public static final C27285c f71906a = new C27285c();

        C27285c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m89383a();
        }

        /* renamed from: a */
        private static AVAB m89383a() {
            return new AVAB(C35563c.f93238a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$d */
    static final class C27286d extends Lambda implements C7561a<C42189a> {

        /* renamed from: a */
        public static final C27286d f71907a = new C27286d();

        C27286d() {
            super(0);
        }

        /* renamed from: a */
        private static C42189a m89384a() {
            return new C42189a();
        }

        public final /* synthetic */ Object invoke() {
            return m89384a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$e */
    static final class C27287e extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C27287e f71908a = new C27287e();

        C27287e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m89385a();
        }

        /* renamed from: a */
        private static C6600e m89385a() {
            return new C6607f().mo15986a(Integer.TYPE, new C27299a()).mo15992f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$f */
    static final class C27288f extends Lambda implements C7561a<C42286a> {

        /* renamed from: a */
        public static final C27288f f71909a = new C27288f();

        C27288f() {
            super(0);
        }

        /* renamed from: a */
        private static C42286a m89386a() {
            return new C42286a();
        }

        public final /* synthetic */ Object invoke() {
            return m89386a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$g */
    static final class C27289g extends Lambda implements C7561a<C27428g> {

        /* renamed from: a */
        public static final C27289g f71910a = new C27289g();

        C27289g() {
            super(0);
        }

        /* renamed from: a */
        private static C27428g m89387a() {
            return new C27428g();
        }

        public final /* synthetic */ Object invoke() {
            return m89387a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$h */
    static final class C27290h extends Lambda implements C7561a<C27301b> {

        /* renamed from: a */
        public static final C27290h f71911a = new C27290h();

        C27290h() {
            super(0);
        }

        /* renamed from: a */
        private static C27301b m89388a() {
            return new C27301b();
        }

        public final /* synthetic */ Object invoke() {
            return m89388a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$i */
    static final class C27291i extends Lambda implements C7561a<C29332u> {

        /* renamed from: a */
        public static final C27291i f71912a = new C27291i();

        C27291i() {
            super(0);
        }

        /* renamed from: a */
        private static C29332u m89389a() {
            return new C29332u();
        }

        public final /* synthetic */ Object invoke() {
            return m89389a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$j */
    static final class C27292j extends Lambda implements C7561a<C42364a> {

        /* renamed from: a */
        public static final C27292j f71913a = new C27292j();

        C27292j() {
            super(0);
        }

        /* renamed from: a */
        private static C42364a m89390a() {
            return new C42364a();
        }

        public final /* synthetic */ Object invoke() {
            return m89390a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$k */
    static final class C27293k extends Lambda implements C7561a<C42520b> {

        /* renamed from: a */
        public static final C27293k f71914a = new C27293k();

        C27293k() {
            super(0);
        }

        /* renamed from: a */
        private static C42520b m89391a() {
            return new C42520b();
        }

        public final /* synthetic */ Object invoke() {
            return m89391a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$l */
    static final class C27294l extends Lambda implements C7561a<C37525z> {

        /* renamed from: a */
        public static final C27294l f71915a = new C27294l();

        C27294l() {
            super(0);
        }

        /* renamed from: a */
        private static C37525z m89392a() {
            return new C37525z();
        }

        public final /* synthetic */ Object invoke() {
            return m89392a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$m */
    static final class C27295m extends Lambda implements C7561a<C37460ac> {

        /* renamed from: a */
        public static final C27295m f71916a = new C27295m();

        C27295m() {
            super(0);
        }

        /* renamed from: a */
        private static C37460ac m89393a() {
            return new C37460ac();
        }

        public final /* synthetic */ Object invoke() {
            return m89393a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$n */
    static final class C27296n extends Lambda implements C7561a<IAVServiceProxy> {

        /* renamed from: a */
        public static final C27296n f71917a = new C27296n();

        C27296n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m89394a();
        }

        /* renamed from: a */
        private static IAVServiceProxy m89394a() {
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class);
            if (iAVServiceProxy != null) {
                return iAVServiceProxy;
            }
            throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$o */
    static final class C27297o extends Lambda implements C7561a<StickerServiceImpl> {

        /* renamed from: a */
        public static final C27297o f71918a = new C27297o();

        C27297o() {
            super(0);
        }

        /* renamed from: a */
        private static StickerServiceImpl m89395a() {
            return new StickerServiceImpl();
        }

        public final /* synthetic */ Object invoke() {
            return m89395a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$p */
    static final class C27298p extends Lambda implements C7561a<C41894b> {

        /* renamed from: a */
        public static final C27298p f71919a = new C27298p();

        C27298p() {
            super(0);
        }

        /* renamed from: a */
        private static C41894b m89396a() {
            return new C41894b();
        }

        public final /* synthetic */ Object invoke() {
            return m89396a();
        }
    }

    /* renamed from: T */
    private final IAVServiceProxy m89334T() {
        return (IAVServiceProxy) this.f71888b.getValue();
    }

    /* renamed from: U */
    private final C6600e m89335U() {
        return (C6600e) this.f71903q.getValue();
    }

    /* renamed from: a */
    public final IAVMusicService mo70086a() {
        return (IAVMusicService) this.f71889c.getValue();
    }

    /* renamed from: b */
    public final IAVPrivacySettingService mo70087b() {
        return (IAVPrivacySettingService) this.f71890d.getValue();
    }

    /* renamed from: c */
    public final C35536ag mo70088c() {
        return (C35536ag) this.f71891e.getValue();
    }

    /* renamed from: d */
    public final C35531ac mo70089d() {
        return (C35531ac) this.f71892f.getValue();
    }

    /* renamed from: e */
    public final C35592u mo70090e() {
        return (C35592u) this.f71893g.getValue();
    }

    /* renamed from: f */
    public final AVSettings mo70091f() {
        return (AVSettings) this.f71894h.getValue();
    }

    /* renamed from: g */
    public final C35609b mo70092g() {
        return (C35609b) this.f71895i.getValue();
    }

    /* renamed from: h */
    public final C27423b mo70093h() {
        return (C27423b) this.f71896j.getValue();
    }

    /* renamed from: i */
    public final C41942e mo70094i() {
        return (C41942e) this.f71897k.getValue();
    }

    /* renamed from: j */
    public final C25642b mo70095j() {
        return (C25642b) this.f71898l.getValue();
    }

    /* renamed from: k */
    public final AVAB mo70096k() {
        return (AVAB) this.f71899m.getValue();
    }

    /* renamed from: l */
    public final C29288a mo70097l() {
        return (C29288a) this.f71900n.getValue();
    }

    /* renamed from: m */
    public final C41846a mo70098m() {
        return (C41846a) this.f71901o.getValue();
    }

    /* renamed from: n */
    public final C23539i mo70099n() {
        return (C23539i) this.f71902p.getValue();
    }

    /* renamed from: p */
    public final void mo70101p() {
        C35563c.m114838e();
    }

    /* renamed from: S */
    public final C6600e mo70085S() {
        return m89335U();
    }

    /* renamed from: A */
    public final C35554aq mo70067A() {
        C35554aq syncShareService = m89334T().getSyncShareService();
        C7573i.m23582a((Object) syncShareService, "proxy.syncShareService");
        return syncShareService;
    }

    /* renamed from: B */
    public final C35538ah mo70068B() {
        C35538ah poiService = m89334T().getPoiService();
        C7573i.m23582a((Object) poiService, "proxy.poiService");
        return poiService;
    }

    /* renamed from: C */
    public final C35590t mo70069C() {
        C35590t commerceService = m89334T().getCommerceService();
        C7573i.m23582a((Object) commerceService, "proxy.commerceService");
        return commerceService;
    }

    /* renamed from: D */
    public final C35544ak mo70070D() {
        C35544ak spServcie = m89334T().getSpServcie();
        C7573i.m23582a((Object) spServcie, "proxy.spServcie");
        return spServcie;
    }

    /* renamed from: E */
    public final C35601y mo70071E() {
        return m89334T().getLiveService();
    }

    /* renamed from: F */
    public final C35580p mo70072F() {
        C35580p bridgeService = m89334T().getBridgeService();
        C7573i.m23582a((Object) bridgeService, "proxy.bridgeService");
        return bridgeService;
    }

    /* renamed from: G */
    public final C21164d mo70073G() {
        C21164d accountService = m89334T().getAccountService();
        C7573i.m23582a((Object) accountService, "proxy.accountService");
        return accountService;
    }

    /* renamed from: H */
    public final C35549an mo70074H() {
        C35549an stickerShareService = m89334T().getStickerShareService();
        C7573i.m23582a((Object) stickerShareService, "proxy.stickerShareService");
        return stickerShareService;
    }

    /* renamed from: I */
    public final C35552ao mo70075I() {
        C35552ao storyPublishService = m89334T().getStoryPublishService();
        C7573i.m23582a((Object) storyPublishService, "proxy.storyPublishService");
        return storyPublishService;
    }

    /* renamed from: J */
    public final C35593v mo70076J() {
        C35593v duoShanService = m89334T().getDuoShanService();
        C7573i.m23582a((Object) duoShanService, "proxy.duoShanService");
        return duoShanService;
    }

    /* renamed from: K */
    public final C35543aj mo70077K() {
        C35543aj settingService = m89334T().getSettingService();
        C7573i.m23582a((Object) settingService, "proxy.settingService");
        return settingService;
    }

    /* renamed from: L */
    public final C35534ae mo70078L() {
        C35534ae networkService = m89334T().getNetworkService();
        C7573i.m23582a((Object) networkService, "proxy.networkService");
        return networkService;
    }

    /* renamed from: M */
    public final C35576m mo70079M() {
        C35576m aVConverter = m89334T().getAVConverter();
        C7573i.m23582a((Object) aVConverter, "proxy.avConverter");
        return aVConverter;
    }

    /* renamed from: N */
    public final C35581q mo70080N() {
        C35581q businessGoodsService = m89334T().getBusinessGoodsService();
        C7573i.m23582a((Object) businessGoodsService, "proxy.businessGoodsService");
        return businessGoodsService;
    }

    /* renamed from: O */
    public final C35548am mo70081O() {
        C35548am iStickerPropService = m89334T().getIStickerPropService();
        C7573i.m23582a((Object) iStickerPropService, "proxy.iStickerPropService");
        return iStickerPropService;
    }

    /* renamed from: P */
    public final C35558as mo70082P() {
        C35558as unlockStickerService = m89334T().unlockStickerService();
        C7573i.m23582a((Object) unlockStickerService, "proxy.unlockStickerService()");
        return unlockStickerService;
    }

    /* renamed from: Q */
    public final C35546al mo70083Q() {
        C35546al shortVideoPluginService = m89334T().getShortVideoPluginService();
        C7573i.m23582a((Object) shortVideoPluginService, "proxy.shortVideoPluginService");
        return shortVideoPluginService;
    }

    /* renamed from: R */
    public final C35535af mo70084R() {
        C35535af openSDKService = m89334T().openSDKService();
        C7573i.m23582a((Object) openSDKService, "proxy.openSDKService()");
        return openSDKService;
    }

    /* renamed from: o */
    public final void mo70100o() {
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
    }

    /* renamed from: q */
    public final C35578o mo70102q() {
        C35578o applicationService = m89334T().getApplicationService();
        C7573i.m23582a((Object) applicationService, "proxy.applicationService");
        return applicationService;
    }

    /* renamed from: r */
    public final C35584s mo70103r() {
        return m89334T().getChallengeService();
    }

    /* renamed from: s */
    public final C35533ad mo70104s() {
        return m89334T().getNationalTaskService();
    }

    /* renamed from: t */
    public final C35553ap mo70105t() {
        return m89334T().getSummonFriendService();
    }

    /* renamed from: u */
    public final C35582r mo70106u() {
        C35582r captureService = m89334T().getCaptureService();
        C7573i.m23582a((Object) captureService, "proxy.captureService");
        return captureService;
    }

    /* renamed from: v */
    public final C35603z mo70107v() {
        C35603z locationService = m89334T().getLocationService();
        C7573i.m23582a((Object) locationService, "proxy.locationService");
        return locationService;
    }

    /* renamed from: w */
    public final C35557ar mo70108w() {
        C35557ar toolsComponentService = m89334T().getToolsComponentService();
        C7573i.m23582a((Object) toolsComponentService, "proxy.toolsComponentService");
        return toolsComponentService;
    }

    /* renamed from: x */
    public final C35541ai mo70109x() {
        C35541ai publishService = m89334T().getPublishService();
        C7573i.m23582a((Object) publishService, "proxy.publishService");
        return publishService;
    }

    /* renamed from: y */
    public final C35575l mo70110y() {
        C35575l aBService = m89334T().getABService();
        C7573i.m23582a((Object) aBService, "proxy.abService");
        return aBService;
    }

    /* renamed from: z */
    public final C35599w mo70111z() {
        C35599w hashTagService = m89334T().getHashTagService();
        C7573i.m23582a((Object) hashTagService, "proxy.hashTagService");
        return hashTagService;
    }
}
