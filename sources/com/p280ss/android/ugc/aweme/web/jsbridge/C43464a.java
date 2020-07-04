package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a */
public final class C43464a implements C11093e {

    /* renamed from: b */
    public static CardStruct f112565b;

    /* renamed from: c */
    public static CardStruct f112566c;

    /* renamed from: d */
    public static int f112567d;

    /* renamed from: e */
    public static Aweme f112568e;

    /* renamed from: f */
    public static final C43466b f112569f = new C43466b(null);

    /* renamed from: a */
    public final WeakReference<Context> f112570a;

    /* renamed from: g */
    private int f112571g;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$a */
    public static final class C43465a {

        /* renamed from: a */
        public final JSONObject f112572a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f112572a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43465a) r2).f112572a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43465a
                if (r0 == 0) goto L_0x0013
                com.ss.android.ugc.aweme.web.jsbridge.a$a r2 = (com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43465a) r2
                org.json.JSONObject r0 = r1.f112572a
                org.json.JSONObject r2 = r2.f112572a
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43465a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            JSONObject jSONObject = this.f112572a;
            if (jSONObject != null) {
                return jSONObject.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChooseLogAdExtraData(adExtraData=");
            sb.append(this.f112572a);
            sb.append(")");
            return sb.toString();
        }

        public C43465a(JSONObject jSONObject) {
            C7573i.m23587b(jSONObject, "adExtraData");
            this.f112572a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$b */
    public static final class C43466b {
        private C43466b() {
        }

        /* renamed from: a */
        public static Aweme m137927a() {
            return C43464a.f112568e;
        }

        /* renamed from: b */
        public static void m137931b(CardStruct cardStruct) {
            C43464a.f112566c = cardStruct;
        }

        public /* synthetic */ C43466b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m137928a(int i) {
            C43464a.f112567d = i;
        }

        /* renamed from: a */
        public static void m137929a(Aweme aweme) {
            C43464a.f112568e = aweme;
        }

        /* renamed from: a */
        public static void m137930a(CardStruct cardStruct) {
            C43464a.f112565b = cardStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$c */
    static final class C43467c implements C25372a {

        /* renamed from: a */
        final /* synthetic */ C43464a f112573a;

        C43467c(C43464a aVar) {
            this.f112573a = aVar;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            if (z) {
                Context context = (Context) this.f112573a.f112570a.get();
                if (context == null) {
                    context = C6399b.m19921a();
                }
                C24976t.m82257n(context, C43466b.m137927a());
                return;
            }
            Context context2 = (Context) this.f112573a.f112570a.get();
            if (context2 == null) {
                context2 = C6399b.m19921a();
            }
            C24976t.m82261o(context2, C43466b.m137927a());
        }
    }

    public C43464a(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f112570a = weakReference;
    }

    /* renamed from: a */
    public final void mo105390a(DMTJsBridge dMTJsBridge) {
        C7573i.m23587b(dMTJsBridge, "dmtJsBridge");
        C11093e eVar = this;
        dMTJsBridge.mo53855a("getPageData", eVar).mo53855a("cardClick", eVar).mo53855a("cardStatus", eVar).mo53855a("closeCardDialog", eVar).mo53855a("openHalfScreenForm", eVar).mo53855a("callNativePhone", eVar).mo53855a("download_click", eVar).mo53855a("setCard", eVar).mo53855a("closeAdModal", eVar).mo53855a("modalInteractionURL", eVar).mo53855a("showModalPage", eVar).mo53855a("setModalSize", eVar).mo53855a("cardInteriorShow", eVar);
        this.f112571g = dMTJsBridge.f54458e.hashCode();
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ss.android.ugc.aweme.feed.model.AwemeRawAd] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.feed.model.AwemeRawAd] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.util.List]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.AwemeRawAd]
      mth insns count: 422
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03f3  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.p582a.C11097i r8, org.json.JSONObject r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.lang.String r0 = "res"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = r8.f30170c
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            int r1 = r0.hashCode()
            r2 = 25
            r3 = -1
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r1) {
                case -1547174390: goto L_0x0442;
                case -1358093233: goto L_0x03ac;
                case -585801204: goto L_0x0380;
                case -271137704: goto L_0x023e;
                case -160920371: goto L_0x0209;
                case -32695719: goto L_0x01d8;
                case 473850877: goto L_0x01ad;
                case 649898786: goto L_0x016c;
                case 714964112: goto L_0x0149;
                case 972450577: goto L_0x006d;
                case 1528366175: goto L_0x005a;
                case 1780854578: goto L_0x0049;
                case 1984473746: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0477
        L_0x001e:
            java.lang.String r1 = "setCard"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "code"
            r9.put(r0, r6)
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "width"
            int r0 = r0.optInt(r1, r6)
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r1 = "height"
            int r8 = r8.optInt(r1, r6)
            com.ss.android.ugc.aweme.commercialize.views.cards.a r1 = new com.ss.android.ugc.aweme.commercialize.views.cards.a
            r1.<init>(r8, r0)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r1)
            java.lang.String r8 = "code"
            r9.put(r8, r5)
            return
        L_0x0049:
            java.lang.String r8 = "closeAdModal"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0477
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r8 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            r8.<init>(r3)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r8)
            return
        L_0x005a:
            java.lang.String r8 = "showModalPage"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0477
            com.ss.android.ugc.aweme.commercialize.c.f r8 = new com.ss.android.ugc.aweme.commercialize.c.f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            r8.<init>(r9, r2)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r8)
            return
        L_0x006d:
            java.lang.String r1 = "download_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "code"
            r9.put(r0, r6)
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "app_id"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x0477
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "extParam"
            java.lang.Object r0 = r0.opt(r1)
            boolean r1 = r0 instanceof org.json.JSONObject
            if (r1 != 0) goto L_0x0091
            r0 = r4
        L_0x0091:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f112568e
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83468b(r1, r2)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r8 = "code"
            r9.put(r8, r5)
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r9 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65266a(r9)
            java.lang.String r9 = "click"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65276b(r9)
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65277b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65273b(r9)
            r8.mo65278b()
            com.ss.android.ugc.aweme.commercialize.log.am r8 = com.p280ss.android.ugc.aweme.commercialize.log.C24943am.f65779a
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            r8.mo65218b(r9)
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r8 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            r8.<init>(r3)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r8)
            return
        L_0x00d5:
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f112568e
            boolean r1 = com.p280ss.android.ugc.aweme.miniapp.utils.C33419c.m108078a(r1, r2)
            if (r1 == 0) goto L_0x00e6
            return
        L_0x00e6:
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r1 = "app_id"
            java.lang.String r8 = r8.getString(r1)
            java.lang.String r1 = "code"
            java.lang.ref.WeakReference<android.content.Context> r2 = r7.f112570a
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83471b(r2, r8)
            r9.put(r1, r8)
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r9 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65266a(r9)
            java.lang.String r9 = "click"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65276b(r9)
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65277b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65273b(r9)
            r8.mo65278b()
            com.ss.android.ugc.aweme.commercialize.log.am r8 = com.p280ss.android.ugc.aweme.commercialize.log.C24943am.f65779a
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            r8.mo65218b(r9)
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r9 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65266a(r9)
            java.lang.String r9 = "click_start"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65276b(r9)
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65277b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65273b(r9)
            r8.mo65278b()
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r8 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            r8.<init>(r3)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r8)
            return
        L_0x0149:
            java.lang.String r9 = "closeCardDialog"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0477
            org.json.JSONObject r9 = r8.f30171d
            java.lang.String r0 = "cardStatus"
            boolean r9 = r9.has(r0)
            if (r9 == 0) goto L_0x0477
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r9 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r0 = "cardStatus"
            int r8 = r8.getInt(r0)
            r9.<init>(r8)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r9)
            return
        L_0x016c:
            java.lang.String r9 = "cardStatus"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0477
            org.json.JSONObject r9 = r8.f30171d
            java.lang.String r0 = "status"
            boolean r9 = r9.has(r0)
            if (r9 == 0) goto L_0x0477
            org.json.JSONObject r9 = r8.f30171d
            java.lang.String r0 = "from"
            int r9 = r9.optInt(r0, r5)
            com.ss.android.ugc.aweme.commercialize.views.cards.b r0 = new com.ss.android.ugc.aweme.commercialize.views.cards.b
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r1 = "status"
            int r8 = r8.getInt(r1)
            int r1 = f112567d
            r0.<init>(r8, r9, r1)
            int r8 = r7.f112571g
            r0.f67302d = r8
            java.lang.ref.WeakReference<android.content.Context> r8 = r7.f112570a
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            if (r8 == 0) goto L_0x01a7
            int r6 = r8.hashCode()
        L_0x01a7:
            r0.f67303e = r6
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r0)
            return
        L_0x01ad:
            java.lang.String r1 = "cardInteriorShow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "code"
            r9.put(r0, r6)
            com.ss.android.ugc.aweme.web.jsbridge.a$a r0 = new com.ss.android.ugc.aweme.web.jsbridge.a$a
            org.json.JSONObject r1 = new org.json.JSONObject
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r2 = "ad_extra_data"
            java.lang.String r3 = ""
            java.lang.String r8 = r8.optString(r2, r3)
            r1.<init>(r8)
            r0.<init>(r1)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r0)
            java.lang.String r8 = "code"
            r9.put(r8, r5)
            goto L_0x0477
        L_0x01d8:
            java.lang.String r1 = "callNativePhone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "code"
            r9.put(r0, r6)
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "tel_num"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x0477
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r0 = "tel_num"
            java.lang.String r8 = r8.getString(r0)
            java.lang.String r0 = "code"
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83476c(r1, r8)
            r9.put(r0, r8)
            return
        L_0x0209:
            java.lang.String r1 = "openHalfScreenForm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "code"
            r9.put(r0, r6)
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "form_url"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x0477
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r0 = "form_url"
            java.lang.String r8 = r8.getString(r0)
            java.lang.String r0 = "code"
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f112568e
            r3 = 10
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83456a(r1, r8, r2, r3)
            r9.put(r0, r8)
            return
        L_0x023e:
            java.lang.String r1 = "cardClick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "open_status"
            r9.put(r0, r6)
            java.lang.String r0 = "web_status"
            r9.put(r0, r6)
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "open_url"
            java.lang.String r0 = r0.optString(r1)
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = f112568e
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83457a(r1, r0, r3, r6)
            if (r1 == 0) goto L_0x026f
            java.lang.String r8 = "open_status"
            r9.put(r8, r5)
            goto L_0x0328
        L_0x026f:
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83463a(r1, r0, r6)
            if (r0 == 0) goto L_0x029b
            java.lang.String r8 = "open_status"
            r9.put(r8, r5)
            java.lang.ref.WeakReference<android.content.Context> r8 = r7.f112570a
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82253m(r8, r9)
            com.ss.android.ugc.aweme.web.jsbridge.a$c r8 = new com.ss.android.ugc.aweme.web.jsbridge.a$c
            r8.<init>(r7)
            com.ss.android.ugc.aweme.commercialize.utils.n$a r8 = (com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a) r8
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83440a(r8)
            goto L_0x0328
        L_0x029b:
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "web_url"
            java.lang.String r0 = r0.optString(r1)
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r1 = "web_title"
            java.lang.String r8 = r8.optString(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = f112568e
            if (r1 == 0) goto L_0x0308
            boolean r1 = r1.isAd()
            if (r1 != r5) goto L_0x0308
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a r1 = new com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a
            r1.<init>()
            java.lang.ref.WeakReference<android.content.Context> r3 = r7.f112570a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a r1 = r1.mo66449a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = f112568e
            if (r3 == 0) goto L_0x02ce
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r3.getAwemeRawAd()
        L_0x02ce:
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a r1 = r1.mo66450a(r4)
            java.lang.String r3 = "url"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a r1 = r1.mo66451a(r0)
            java.lang.String r3 = "webTitle"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a r1 = r1.mo66454b(r8)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b$a r1 = r1.mo66453b(r2)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.b r1 = r1.mo66452a()
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83465a(r1)
            if (r1 != 0) goto L_0x0302
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f112568e
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83450a(r1, r2, r0, r8)
            if (r8 == 0) goto L_0x0328
        L_0x0302:
            java.lang.String r8 = "web_status"
            r9.put(r8, r5)
            goto L_0x0328
        L_0x0308:
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f112570a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83459a(r1, r0, r8)
            if (r8 == 0) goto L_0x0328
            java.lang.String r8 = "web_status"
            r9.put(r8, r5)
            java.lang.ref.WeakReference<android.content.Context> r8 = r7.f112570a
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = f112568e
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82265p(r8, r9)
        L_0x0328:
            java.lang.ref.WeakReference<android.content.Context> r8 = r7.f112570a     // Catch:{ Exception -> 0x037f }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x037f }
            if (r8 == 0) goto L_0x0377
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ Exception -> 0x037f }
            android.view.Window r8 = r8.getWindow()     // Catch:{ Exception -> 0x037f }
            java.lang.String r9 = "(contextRef.get() as Activity).window"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)     // Catch:{ Exception -> 0x037f }
            android.view.View r8 = r8.getDecorView()     // Catch:{ Exception -> 0x037f }
            android.view.View r8 = r8.findFocus()     // Catch:{ Exception -> 0x037f }
            java.lang.ref.WeakReference<android.content.Context> r9 = r7.f112570a     // Catch:{ Exception -> 0x037f }
            java.lang.Object r9 = r9.get()     // Catch:{ Exception -> 0x037f }
            if (r9 == 0) goto L_0x036f
            android.app.Activity r9 = (android.app.Activity) r9     // Catch:{ Exception -> 0x037f }
            java.lang.String r0 = "input_method"
            java.lang.Object r9 = r9.getSystemService(r0)     // Catch:{ Exception -> 0x037f }
            if (r9 == 0) goto L_0x0367
            android.view.inputmethod.InputMethodManager r9 = (android.view.inputmethod.InputMethodManager) r9     // Catch:{ Exception -> 0x037f }
            java.lang.String r0 = "focused"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)     // Catch:{ Exception -> 0x037f }
            android.os.IBinder r0 = r8.getWindowToken()     // Catch:{ Exception -> 0x037f }
            r9.hideSoftInputFromWindow(r0, r6)     // Catch:{ Exception -> 0x037f }
            r8.clearFocus()     // Catch:{ Exception -> 0x037f }
            return
        L_0x0367:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x037f }
            java.lang.String r9 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r8.<init>(r9)     // Catch:{ Exception -> 0x037f }
            throw r8     // Catch:{ Exception -> 0x037f }
        L_0x036f:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x037f }
            java.lang.String r9 = "null cannot be cast to non-null type android.app.Activity"
            r8.<init>(r9)     // Catch:{ Exception -> 0x037f }
            throw r8     // Catch:{ Exception -> 0x037f }
        L_0x0377:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x037f }
            java.lang.String r9 = "null cannot be cast to non-null type android.app.Activity"
            r8.<init>(r9)     // Catch:{ Exception -> 0x037f }
            throw r8     // Catch:{ Exception -> 0x037f }
        L_0x037f:
            return
        L_0x0380:
            java.lang.String r1 = "setModalSize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "code"
            r9.put(r0, r6)
            org.json.JSONObject r0 = r8.f30171d
            java.lang.String r1 = "width"
            int r0 = r0.optInt(r1, r6)
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r1 = "height"
            int r8 = r8.optInt(r1, r6)
            com.ss.android.ugc.aweme.commercialize.views.cards.a r1 = new com.ss.android.ugc.aweme.commercialize.views.cards.a
            r2 = 2
            r1.<init>(r8, r0, r2)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r1)
            java.lang.String r8 = "code"
            r9.put(r8, r5)
            return
        L_0x03ac:
            java.lang.String r1 = "getPageData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0477
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getPageData "
            r0.<init>(r1)
            com.ss.android.ugc.aweme.feed.model.CardStruct r1 = f112565b
            if (r1 == 0) goto L_0x03c4
            org.json.JSONObject r1 = r1.getCardData()
            goto L_0x03c5
        L_0x03c4:
            r1 = r4
        L_0x03c5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r8 = r8.optString(r0, r1)
            java.lang.String r0 = "4"
            boolean r8 = kotlin.jvm.internal.C7573i.m23585a(r8, r0)
            if (r8 == 0) goto L_0x03e9
            com.ss.android.ugc.aweme.feed.model.CardStruct r8 = f112566c
            if (r8 == 0) goto L_0x03e7
            org.json.JSONObject r8 = r8.getCardData()
            goto L_0x03f1
        L_0x03e7:
            r8 = r4
            goto L_0x03f1
        L_0x03e9:
            com.ss.android.ugc.aweme.feed.model.CardStruct r8 = f112565b
            if (r8 == 0) goto L_0x03e7
            org.json.JSONObject r8 = r8.getCardData()
        L_0x03f1:
            if (r8 == 0) goto L_0x0438
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f112570a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43127fh.m136806a(r0)
            if (r5 != r0) goto L_0x0406
            java.lang.String r0 = "webview_layout_direction"
            r8.put(r0, r5)
        L_0x0406:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = f112568e
            if (r0 == 0) goto L_0x040e
            java.util.List r4 = r0.getRawAdClickTrackUrlList()
        L_0x040e:
            if (r4 == 0) goto L_0x0438
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ r5
            if (r0 != r5) goto L_0x0438
            java.lang.String r0 = "app_data"
            org.json.JSONObject r0 = r8.optJSONObject(r0)
            if (r0 == 0) goto L_0x0438
            java.lang.String r1 = "click_track_url_list"
            boolean r1 = r0.has(r1)
            if (r1 != 0) goto L_0x0433
            java.lang.String r1 = "click_track_url_list"
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r4)
            r0.put(r1, r2)
        L_0x0433:
            java.lang.String r1 = "app_data"
            r8.put(r1, r0)
        L_0x0438:
            java.lang.String r0 = "card_data"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r9.put(r0, r8)
            return
        L_0x0442:
            java.lang.String r9 = "modalInteractionURL"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0477
            org.json.JSONObject r8 = r8.f30171d
            java.lang.String r9 = "card_url"
            java.lang.String r8 = r8.optString(r9)
            if (r8 == 0) goto L_0x0476
            r9 = r8
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x045e
            r6 = 1
        L_0x045e:
            if (r6 != r5) goto L_0x0477
            com.ss.android.ugc.aweme.feed.model.CardStruct r9 = new com.ss.android.ugc.aweme.feed.model.CardStruct
            r9.<init>()
            r9.setCardUrl(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = f112568e
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25364j.m83401a(r8, r9)
            if (r8 == 0) goto L_0x0477
            f112566c = r9
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r9)
            return
        L_0x0476:
            return
        L_0x0477:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.call(com.bytedance.ies.web.a.i, org.json.JSONObject):void");
    }
}
