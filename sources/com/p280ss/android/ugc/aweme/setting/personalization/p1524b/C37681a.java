package com.p280ss.android.ugc.aweme.setting.personalization.p1524b;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.personalization.api.PersonalizationApi.API;
import com.p280ss.android.ugc.aweme.setting.personalization.api.PersonalizationApi.C37680a;
import com.p280ss.android.ugc.aweme.setting.personalization.api.Resp;
import com.p280ss.android.ugc.aweme.setting.personalization.p1523a.C37679a;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a.C37687a;
import com.p280ss.android.ugc.aweme.setting.secret.C37702c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a */
public final class C37681a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98163a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37681a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/setting/personalization/api/PersonalizationApi$API;"))};

    /* renamed from: c */
    public static final C37682a f98164c = new C37682a(null);

    /* renamed from: b */
    public final DataCenter f98165b;

    /* renamed from: d */
    private final C7541d f98166d = C7546e.m23569a(C37684c.f98169a);

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$a */
    public static final class C37682a {
        private C37682a() {
        }

        public /* synthetic */ C37682a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$b */
    static final class C37683b<TTaskResult, TContinuationResult> implements C1591g<Resp, Object> {

        /* renamed from: a */
        final /* synthetic */ C37681a f98167a;

        /* renamed from: b */
        final /* synthetic */ boolean f98168b;

        C37683b(C37681a aVar, boolean z) {
            this.f98167a = aVar;
            this.f98168b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Resp> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d()) {
                C6877n.m21407a("compliance_api_status", "", C42967ba.m136396a().mo104680a("type", "/aweme/v1/personality/ad/get/").mo104679a("error_message", Integer.valueOf(((Resp) hVar.mo6890e()).error_code)).mo104679a("status", Integer.valueOf(1)).mo104681b());
            } else if (!hVar.mo6887c() && hVar.mo6882b()) {
                if ((!this.f98168b && !((Resp) hVar.mo6890e()).getNeedTerm() && !((Resp) hVar.mo6890e()).getHaveSet() && ((Resp) hVar.mo6890e()).getPersonalityMode() == 2) || (this.f98168b && ((Resp) hVar.mo6890e()).getPersonalityMode() == 2 && !((Resp) hVar.mo6890e()).getHaveSet())) {
                    SharePrefCache inst = SharePrefCache.inst();
                    C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                    C22903bl personalizationMode = inst.getPersonalizationMode();
                    C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
                    personalizationMode.mo59871a(Integer.valueOf(2));
                    this.f98167a.mo95032a(2, this.f98168b);
                } else if (this.f98168b && !((Resp) hVar.mo6890e()).getHaveSet()) {
                    this.f98167a.mo95032a(((Resp) hVar.mo6890e()).getPersonalityMode(), this.f98168b);
                } else if (!this.f98168b || (this.f98168b && ((Resp) hVar.mo6890e()).getHaveSet())) {
                    SharePrefCache inst2 = SharePrefCache.inst();
                    C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
                    C22903bl personalizationMode2 = inst2.getPersonalizationMode();
                    C7573i.m23582a((Object) personalizationMode2, "SharePrefCache.inst().personalizationMode");
                    personalizationMode2.mo59871a(Integer.valueOf(((Resp) hVar.mo6890e()).getPersonalityMode()));
                }
                if (!this.f98168b) {
                    C23060u a = C23060u.m75742a();
                    C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                    C22903bl ac = a.mo60059ac();
                    C7573i.m23582a((Object) ac, "CommonSharePrefCache.ins…sonalizationSettingShowed");
                    if (!((Boolean) ac.mo59877d()).booleanValue() && ((Resp) hVar.mo6890e()).getNeedTerm()) {
                        C7213d a2 = C7213d.m22500a();
                        C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
                        if (a2.mo18763aa()) {
                            C42961az.m136380a(new C37679a());
                            C23060u a3 = C23060u.m75742a();
                            C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                            C22903bl I = a3.mo60039I();
                            C7573i.m23582a((Object) I, "CommonSharePrefCache.ins…eedFollowGoogleAdsSetting");
                            I.mo59871a(Boolean.valueOf(((Resp) hVar.mo6890e()).getFollowSysConfig()));
                            C23060u a4 = C23060u.m75742a();
                            C7573i.m23582a((Object) a4, "CommonSharePrefCache.inst()");
                            C22903bl H = a4.mo60038H();
                            C7573i.m23582a((Object) H, "CommonSharePrefCache.ins…izationSettingDescription");
                            H.mo59871a(((Resp) hVar.mo6890e()).getDescription());
                            C6877n.m21407a("compliance_api_status", "", C42967ba.m136396a().mo104680a("type", "/aweme/v1/personality/ad/get/").mo104679a("status", Integer.valueOf(0)).mo104681b());
                        }
                    }
                }
                if (!this.f98168b) {
                    C37687a.m120533d(true);
                    C42961az.m136380a(new C37702c());
                }
                C23060u a32 = C23060u.m75742a();
                C7573i.m23582a((Object) a32, "CommonSharePrefCache.inst()");
                C22903bl I2 = a32.mo60039I();
                C7573i.m23582a((Object) I2, "CommonSharePrefCache.ins…eedFollowGoogleAdsSetting");
                I2.mo59871a(Boolean.valueOf(((Resp) hVar.mo6890e()).getFollowSysConfig()));
                C23060u a42 = C23060u.m75742a();
                C7573i.m23582a((Object) a42, "CommonSharePrefCache.inst()");
                C22903bl H2 = a42.mo60038H();
                C7573i.m23582a((Object) H2, "CommonSharePrefCache.ins…izationSettingDescription");
                H2.mo59871a(((Resp) hVar.mo6890e()).getDescription());
                C6877n.m21407a("compliance_api_status", "", C42967ba.m136396a().mo104680a("type", "/aweme/v1/personality/ad/get/").mo104679a("status", Integer.valueOf(0)).mo104681b());
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$c */
    static final class C37684c extends Lambda implements C7561a<API> {

        /* renamed from: a */
        public static final C37684c f98169a = new C37684c();

        C37684c() {
            super(0);
        }

        /* renamed from: a */
        private static API m120522a() {
            return C37680a.m120517a();
        }

        public final /* synthetic */ Object invoke() {
            return m120522a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$d */
    static final class C37685d<TTaskResult, TContinuationResult> implements C1591g<BaseResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ C37681a f98170a;

        /* renamed from: b */
        final /* synthetic */ int f98171b;

        /* renamed from: c */
        final /* synthetic */ boolean f98172c;

        C37685d(C37681a aVar, int i, boolean z) {
            this.f98170a = aVar;
            this.f98171b = i;
            this.f98172c = z;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0132  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(bolts.C1592h<com.p280ss.android.ugc.aweme.base.api.BaseResponse> r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r10, r0)
                boolean r0 = r10.mo6889d()
                r1 = 2131823015(0x7f1109a7, float:1.9278818E38)
                r2 = 0
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L_0x008c
                java.lang.String r0 = "compliance_api_status"
                java.lang.String r5 = ""
                com.ss.android.ugc.aweme.utils.ba r6 = com.p280ss.android.ugc.aweme.utils.C42967ba.m136396a()
                java.lang.String r7 = "type"
                java.lang.String r8 = "/aweme/v1/personality/ad/set/"
                com.ss.android.ugc.aweme.utils.ba r6 = r6.mo104680a(r7, r8)
                java.lang.String r7 = "error_message"
                java.lang.Object r10 = r10.mo6890e()
                com.ss.android.ugc.aweme.base.api.BaseResponse r10 = (com.p280ss.android.ugc.aweme.base.api.BaseResponse) r10
                int r10 = r10.error_code
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                com.ss.android.ugc.aweme.utils.ba r10 = r6.mo104679a(r7, r10)
                java.lang.String r6 = "mode"
                int r7 = r9.f98171b
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                com.ss.android.ugc.aweme.utils.ba r10 = r10.mo104679a(r6, r7)
                java.lang.String r6 = "status"
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                com.ss.android.ugc.aweme.utils.ba r10 = r10.mo104679a(r6, r7)
                org.json.JSONObject r10 = r10.mo104681b()
                com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r0, r5, r10)
                boolean r10 = r9.f98172c
                if (r10 != 0) goto L_0x007c
                com.ss.android.ugc.aweme.app.AwemeApplication r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                java.lang.String r0 = "AwemeApplication.getApplication()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r0)
                android.app.Activity r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21343b()
                boolean r10 = r10 instanceof com.p280ss.android.ugc.aweme.main.MainActivity
                if (r10 == 0) goto L_0x007c
                com.ss.android.ugc.aweme.app.AwemeApplication r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                java.lang.String r0 = "AwemeApplication.getApplication()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r0)
                android.app.Activity r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21343b()
                android.content.Context r10 = (android.content.Context) r10
                com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31393b(r10, r1, r4, r3)
                r10.mo25750a()
                goto L_0x008b
            L_0x007c:
                com.ss.android.ugc.aweme.setting.personalization.b.a r10 = r9.f98170a
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r10 = r10.f98165b
                if (r10 == 0) goto L_0x008b
                java.lang.String r0 = "set_status"
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r10.mo60134a(r0, r1)
            L_0x008b:
                return r2
            L_0x008c:
                boolean r0 = r10.mo6887c()
                if (r0 == 0) goto L_0x00ce
                boolean r10 = r9.f98172c
                if (r10 != 0) goto L_0x00be
                com.ss.android.ugc.aweme.app.AwemeApplication r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                java.lang.String r0 = "AwemeApplication.getApplication()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r0)
                android.app.Activity r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21343b()
                boolean r10 = r10 instanceof com.p280ss.android.ugc.aweme.main.MainActivity
                if (r10 == 0) goto L_0x00be
                com.ss.android.ugc.aweme.app.AwemeApplication r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                java.lang.String r0 = "AwemeApplication.getApplication()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r0)
                android.app.Activity r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21343b()
                android.content.Context r10 = (android.content.Context) r10
                com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31393b(r10, r1, r4, r3)
                r10.mo25750a()
                goto L_0x00cd
            L_0x00be:
                com.ss.android.ugc.aweme.setting.personalization.b.a r10 = r9.f98170a
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r10 = r10.f98165b
                if (r10 == 0) goto L_0x00cd
                java.lang.String r0 = "set_status"
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r10.mo60134a(r0, r1)
            L_0x00cd:
                return r2
            L_0x00ce:
                boolean r10 = r10.mo6882b()
                if (r10 == 0) goto L_0x0167
                boolean r10 = r9.f98172c
                r0 = 0
                if (r10 != 0) goto L_0x0104
                com.ss.android.ugc.aweme.app.AwemeApplication r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                java.lang.String r1 = "AwemeApplication.getApplication()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r1)
                android.app.Activity r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21343b()
                boolean r10 = r10 instanceof com.p280ss.android.ugc.aweme.main.MainActivity
                if (r10 == 0) goto L_0x0104
                com.ss.android.ugc.aweme.app.AwemeApplication r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                java.lang.String r1 = "AwemeApplication.getApplication()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r1)
                android.app.Activity r10 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21343b()
                android.content.Context r10 = (android.content.Context) r10
                r1 = 2131825778(0x7f111472, float:1.9284422E38)
                com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31385a(r10, r1, r4, r3)
                r10.mo25750a()
                goto L_0x0113
            L_0x0104:
                com.ss.android.ugc.aweme.setting.personalization.b.a r10 = r9.f98170a
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r10 = r10.f98165b
                if (r10 == 0) goto L_0x0113
                java.lang.String r1 = "set_status"
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                r10.mo60134a(r1, r3)
            L_0x0113:
                com.ss.android.ugc.aweme.app.SharePrefCache r10 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
                java.lang.String r1 = "SharePrefCache.inst()"
                kotlin.jvm.internal.C7573i.m23582a(r10, r1)
                com.ss.android.ugc.aweme.app.bl r10 = r10.getPersonalizationMode()
                java.lang.String r1 = "SharePrefCache.inst().personalizationMode"
                kotlin.jvm.internal.C7573i.m23582a(r10, r1)
                int r1 = r9.f98171b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r10.mo59871a(r1)
                int r10 = r9.f98171b
                if (r10 != 0) goto L_0x013a
                com.ss.android.ugc.aweme.interest.i r10 = new com.ss.android.ugc.aweme.interest.i
                r10.<init>(r0)
                com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r10)
            L_0x013a:
                java.lang.String r10 = "compliance_api_status"
                java.lang.String r1 = ""
                com.ss.android.ugc.aweme.utils.ba r3 = com.p280ss.android.ugc.aweme.utils.C42967ba.m136396a()
                java.lang.String r4 = "type"
                java.lang.String r5 = "/aweme/v1/personality/ad/set/"
                com.ss.android.ugc.aweme.utils.ba r3 = r3.mo104680a(r4, r5)
                java.lang.String r4 = "mode"
                int r5 = r9.f98171b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                com.ss.android.ugc.aweme.utils.ba r3 = r3.mo104679a(r4, r5)
                java.lang.String r4 = "status"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                com.ss.android.ugc.aweme.utils.ba r0 = r3.mo104679a(r4, r0)
                org.json.JSONObject r0 = r0.mo104681b()
                com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r10, r1, r0)
            L_0x0167:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.personalization.p1524b.C37681a.C37685d.then(bolts.h):java.lang.Void");
        }
    }

    /* renamed from: a */
    private final API m120518a() {
        return (API) this.f98166d.getValue();
    }

    public C37681a(DataCenter dataCenter) {
        this.f98165b = dataCenter;
    }

    /* renamed from: a */
    public final void mo95032a(int i, boolean z) {
        m120518a().setPersonalizationSetting(i).mo6876a((C1591g<TResult, TContinuationResult>) new C37685d<TResult,TContinuationResult>(this, i, z), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo95033a(boolean z, boolean z2) {
        m120518a().getPersonalizationSetting(z).mo6876a((C1591g<TResult, TContinuationResult>) new C37683b<TResult,TContinuationResult>(this, z2), C1592h.f5958b);
    }
}
