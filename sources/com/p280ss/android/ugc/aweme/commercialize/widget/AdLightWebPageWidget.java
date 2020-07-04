package com.p280ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i;
import com.p280ss.android.ugc.aweme.commercialize.views.AdLightWebPageView;
import com.p280ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C25419b;
import com.p280ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C25421d;
import com.p280ss.android.ugc.aweme.commercialize.views.AdLightWebPageView.C25421d.C25422a;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog.C25515c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget */
public final class AdLightWebPageWidget extends AbsAdFeedWidget {

    /* renamed from: j */
    public static final C25629a f67510j = new C25629a(null);

    /* renamed from: k */
    private AdLightWebPageView f67511k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$a */
    public static final class C25629a {
        private C25629a() {
        }

        public /* synthetic */ C25629a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public static String m84223b(Aweme aweme) {
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    return awemeRawAd.getLightWebUrl();
                }
            }
            return null;
        }

        /* renamed from: a */
        public final boolean mo66458a(Aweme aweme) {
            boolean z;
            String b = m84223b(aweme);
            if (b != null) {
                if (b.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null || awemeRawAd.getWebviewType() != 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b */
    static final class C25630b extends Lambda implements C7562b<C25515c, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24568i f67512a;

        C25630b(C24568i iVar) {
            this.f67512a = iVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m84225a((C25515c) obj);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
            if (r0 == null) goto L_0x0013;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m84225a(com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog.C25515c r3) {
            /*
                r2 = this;
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                com.ss.android.ugc.aweme.commercialize.c.i r0 = r2.f67512a
                org.json.JSONObject r0 = r0.f64811b
                if (r0 == 0) goto L_0x0013
                java.lang.String r1 = "init"
                java.lang.String r0 = r0.optString(r1)
                if (r0 != 0) goto L_0x0015
            L_0x0013:
                java.lang.String r0 = ""
            L_0x0015:
                r3.f67224a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget.C25630b.m84225a(com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$c):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$c */
    static final class C25631c extends Lambda implements C7562b<C25421d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageWidget f67513a;

        /* renamed from: b */
        final /* synthetic */ String f67514b;

        C25631c(AdLightWebPageWidget adLightWebPageWidget, String str) {
            this.f67513a = adLightWebPageWidget;
            this.f67514b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m84226a((C25421d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m84226a(C25421d dVar) {
            C7573i.m23587b(dVar, "$receiver");
            dVar.mo66043a(this.f67514b);
            dVar.f66907b = this.f67513a.f67509i;
            dVar.f66908c = this.f67513a.f67508a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$d */
    public static final class C25632d implements C25419b {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageWidget f67515a;

        /* renamed from: a */
        public final void mo66037a() {
            DataCenter dataCenter = this.f67515a.f60922e;
            if (dataCenter != null) {
                dataCenter.mo60134a("on_ad_light_web_page_show", (Object) null);
            }
        }

        /* renamed from: b */
        public final void mo66038b() {
            DataCenter dataCenter = this.f67515a.f60922e;
            if (dataCenter != null) {
                dataCenter.mo60134a("on_ad_light_web_page_hide", (Object) null);
            }
        }

        C25632d(AdLightWebPageWidget adLightWebPageWidget) {
            this.f67515a = adLightWebPageWidget;
        }
    }

    /* renamed from: e */
    private final void m84220e() {
        Activity activity;
        if (this.f67511k != null) {
            Fragment fragment = this.f67509i;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            if (activity != null) {
                AdLightWebPageView.f66885j.mo66040a(activity);
                this.f67511k = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66455a() {
        super.mo66455a();
        DataCenter dataCenter = this.f60922e;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60132a("ad_feed_on_page_selected", pVar);
            dataCenter.mo60132a("ad_feed_on_page_unselected", pVar);
            dataCenter.mo60132a("ad_on_receive_js_bridge_event", pVar);
        }
    }

    /* renamed from: d */
    private final void m84219d() {
        FragmentActivity fragmentActivity;
        boolean z;
        Fragment fragment = this.f67509i;
        if (fragment != null) {
            fragmentActivity = fragment.getActivity();
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            String b = C25629a.m84223b(this.f67508a);
            if (b != null) {
                if (b.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f67511k = AdLightWebPageView.f66885j.mo66039a((Activity) fragmentActivity, (C25421d) new C25422a().mo65870a(new C25631c(this, b)).f66613a);
                    AdLightWebPageView adLightWebPageView = this.f67511k;
                    if (adLightWebPageView != null) {
                        adLightWebPageView.setCallback(new C25632d(this));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1132409520) {
                    if (hashCode == -690921606 && str.equals("ad_on_receive_js_bridge_event")) {
                        m84218a((C24568i) aVar.mo60161a());
                    }
                } else if (str.equals("ad_feed_on_page_selected") && f67510j.mo66458a(this.f67508a)) {
                    m84219d();
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                m84220e();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r2 == null) goto L_0x008a;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Object, java.lang.String]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.String, java.lang.Object]
      mth insns count: 122
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m84218a(com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r8.f64813d
            boolean r1 = r0 instanceof com.p280ss.android.sdk.webview.DMTJsBridge
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r0 = r2
        L_0x000b:
            com.ss.android.sdk.webview.DMTJsBridge r0 = (com.p280ss.android.sdk.webview.DMTJsBridge) r0
            java.lang.String r1 = r8.f64810a
            int r3 = r1.hashCode()
            r4 = 898583738(0x358f4cba, float:1.0676661E-6)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x00e4
            r4 = 1518137890(0x5a7cf222, float:1.77994805E16)
            if (r3 == r4) goto L_0x00c8
            r4 = 1531924954(0x5b4f51da, float:5.8355317E16)
            if (r3 == r4) goto L_0x0062
            r2 = 2049435752(0x7a27e868, float:2.1795683E35)
            if (r3 == r2) goto L_0x002b
            goto L_0x0147
        L_0x002b:
            java.lang.String r2 = "closeLightLandingPage"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r7.f67511k
            if (r1 == 0) goto L_0x0044
            boolean r1 = r1.mo66026b()
            if (r1 != r6) goto L_0x0044
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r7.f67511k
            if (r1 == 0) goto L_0x0044
            r1.dismiss()
        L_0x0044:
            if (r0 == 0) goto L_0x0061
            java.lang.String r8 = r8.f64812c
            org.json.JSONObject r1 = new org.json.JSONObject
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "code"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.<init>(r3, r4)
            java.util.Map r2 = kotlin.collections.C7507ae.m23385a(r2)
            r1.<init>(r2)
            r0.mo53862b(r8, r1)
            goto L_0x0147
        L_0x0061:
            return
        L_0x0062:
            java.lang.String r3 = "openPanel"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0147
            org.json.JSONObject r1 = r8.f64811b
            if (r1 == 0) goto L_0x0074
            java.lang.String r2 = "type"
            java.lang.Object r2 = r1.opt(r2)
        L_0x0074:
            java.lang.String r1 = "menu"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r2, r1)
            if (r1 == 0) goto L_0x00a0
            com.google.gson.e r1 = com.bytedance.ies.ugc.aweme.network.C10944e.m32113a()
            org.json.JSONObject r2 = r8.f64811b
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x008c
        L_0x008a:
            java.lang.String r2 = ""
        L_0x008c:
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.m> r3 = com.p280ss.android.ugc.aweme.commercialize.model.C25004m.class
            java.lang.Object r1 = r1.mo15974a(r2, r3)
            com.ss.android.ugc.aweme.commercialize.model.m r1 = (com.p280ss.android.ugc.aweme.commercialize.model.C25004m) r1
            if (r1 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r2 = r7.f67511k
            if (r2 == 0) goto L_0x0147
            java.lang.String r8 = r8.f64812c
            r2.mo66023a(r1, r0, r8)
        L_0x009f:
            return
        L_0x00a0:
            java.lang.String r1 = "datePicker"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r2, r1)
            if (r1 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r7.f67511k
            if (r1 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$c$a r2 = new com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$c$a
            r2.<init>()
            com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b r3 = new com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget$b
            r3.<init>(r8)
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            com.ss.android.ugc.aweme.commercialize.utils.bf r2 = r2.mo65870a(r3)
            T r2 = r2.f66613a
            com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$c r2 = (com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog.C25515c) r2
            java.lang.String r8 = r8.f64812c
            r1.mo66024a(r2, r0, r8)
            goto L_0x0147
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.String r0 = "openAdUrl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0147
            org.json.JSONObject r8 = r8.f64811b
            if (r8 == 0) goto L_0x00da
            java.lang.String r0 = "close_current_page"
            boolean r5 = r8.optBoolean(r0)
        L_0x00da:
            if (r5 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r8 = r7.f67511k
            if (r8 == 0) goto L_0x0147
            r8.dismiss()
            return
        L_0x00e4:
            java.lang.String r3 = "openLightLandingPage"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r7.f67511k
            if (r1 == 0) goto L_0x012a
            boolean r1 = r1.mo66026b()
            if (r1 != 0) goto L_0x012a
            org.json.JSONObject r1 = r8.f64811b
            if (r1 == 0) goto L_0x0100
            java.lang.String r2 = "clickFrom"
            java.lang.String r2 = r1.optString(r2)
        L_0x0100:
            com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView r1 = r7.f67511k
            if (r1 == 0) goto L_0x010f
            if (r2 != 0) goto L_0x010c
            r2 = 25
            java.lang.String r2 = com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness.C25851a.m85060a(r2)
        L_0x010c:
            r1.mo66025a(r2)
        L_0x010f:
            if (r0 == 0) goto L_0x012a
            java.lang.String r1 = r8.f64812c
            org.json.JSONObject r2 = new org.json.JSONObject
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = "code"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.<init>(r4, r6)
            java.util.Map r3 = kotlin.collections.C7507ae.m23385a(r3)
            r2.<init>(r3)
            r0.mo53862b(r1, r2)
        L_0x012a:
            if (r0 == 0) goto L_0x0146
            java.lang.String r8 = r8.f64812c
            org.json.JSONObject r1 = new org.json.JSONObject
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "code"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.<init>(r3, r4)
            java.util.Map r2 = kotlin.collections.C7507ae.m23385a(r2)
            r1.<init>(r2)
            r0.mo53862b(r8, r1)
            goto L_0x0147
        L_0x0146:
            return
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget.m84218a(com.ss.android.ugc.aweme.commercialize.c.i):void");
    }
}
