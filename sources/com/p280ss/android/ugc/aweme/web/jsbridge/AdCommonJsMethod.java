package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.commercialize.log.C24943am;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.model.C24990c;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25251av;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.framework.bridge.C29953a;
import com.p280ss.android.ugc.aweme.framework.bridge.C29954b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod */
public final class AdCommonJsMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C43448a f112530b = new C43448a(null);

    /* renamed from: a */
    public final WeakReference<Context> f112531a;

    /* renamed from: c */
    private final DMTJsBridge f112532c;

    /* renamed from: d */
    private final C29954b f112533d;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$a */
    public static final class C43448a {
        private C43448a() {
        }

        public /* synthetic */ C43448a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m137890a(WeakReference<Context> weakReference, DMTJsBridge dMTJsBridge) {
            C7573i.m23587b(weakReference, "contextRef");
            C7573i.m23587b(dMTJsBridge, "dmtJsBridge");
            new AdCommonJsMethod(weakReference, dMTJsBridge, null, null);
        }

        /* renamed from: a */
        public static void m137891a(WeakReference<Context> weakReference, C29954b bVar) {
            C7573i.m23587b(weakReference, "contextRef");
            C7573i.m23587b(bVar, "rnPluginProcessor");
            new AdCommonJsMethod(weakReference, null, bVar, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b */
    static final class C43449b implements C25372a {

        /* renamed from: a */
        final /* synthetic */ C24990c f112534a;

        /* renamed from: b */
        final /* synthetic */ AdCommonJsMethod f112535b;

        C43449b(C24990c cVar, AdCommonJsMethod adCommonJsMethod) {
            this.f112534a = cVar;
            this.f112535b = adCommonJsMethod;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            String str;
            C24961b a = C24958f.m81905a().mo65266a("draw_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a.mo65276b(str).mo65264a(Long.valueOf(this.f112534a.f65887a)).mo65286h(this.f112534a.f65888b).mo65275b(Long.valueOf(this.f112534a.f65889c)).mo65270a((Context) this.f112535b.f112531a.get());
        }
    }

    /* renamed from: a */
    public static final void m137884a(WeakReference<Context> weakReference, DMTJsBridge dMTJsBridge) {
        C43448a.m137890a(weakReference, dMTJsBridge);
    }

    /* renamed from: a */
    public static final void m137885a(WeakReference<Context> weakReference, C29954b bVar) {
        C43448a.m137891a(weakReference, bVar);
    }

    /* renamed from: b */
    private final void m137888b(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject.has("msg")) {
            C10761a.m31387a((Context) this.f112531a.get(), jSONObject.getString("msg")).mo25750a();
            if (aVar != null) {
                aVar.mo71363a((Object) null);
            }
        } else if (aVar != null) {
            aVar.mo71362a(-1, "empty msg");
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("func");
            C24990c a = C25251av.m83001a();
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -1690732780) {
                    if (hashCode != -1491591) {
                        if (hashCode == 1518137890 && optString.equals("openAdUrl")) {
                            m137887b(jSONObject, a, aVar);
                        }
                    } else if (optString.equals("sendAdLog")) {
                        m137886a(jSONObject, a, aVar);
                    }
                } else if (optString.equals("messageTip")) {
                    m137888b(jSONObject, aVar);
                }
            }
            C7573i.m23582a((Object) optString, "func");
            C24568i iVar = new C24568i(optString, jSONObject, null, null, 12, null);
            C42961az.m136380a(iVar);
        }
    }

    private AdCommonJsMethod(WeakReference<Context> weakReference, DMTJsBridge dMTJsBridge, C29954b bVar) {
        C11087a aVar;
        if (dMTJsBridge != null) {
            aVar = dMTJsBridge.f54455b;
        } else {
            aVar = null;
        }
        super(aVar);
        this.f112531a = weakReference;
        this.f112532c = dMTJsBridge;
        this.f112533d = bVar;
        DMTJsBridge dMTJsBridge2 = this.f112532c;
        if (dMTJsBridge2 != null) {
            C11093e eVar = this;
            dMTJsBridge2.mo53855a("sendAdLog", eVar);
            dMTJsBridge2.mo53855a("messageTip", eVar);
            dMTJsBridge2.mo53855a("openAdUrl", eVar);
        }
        C29954b bVar2 = this.f112533d;
        if (bVar2 != null) {
            C29953a aVar2 = this;
            bVar2.mo76115a("sendAdLog", aVar2);
            bVar2.mo76115a("messageTip", aVar2);
            bVar2.mo76115a("openAdUrl", aVar2);
        }
    }

    /* renamed from: a */
    private final void m137886a(JSONObject jSONObject, C24990c cVar, C27876a aVar) {
        boolean z;
        try {
            String optString = jSONObject.optString("tag");
            String optString2 = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParam");
            boolean z2 = false;
            boolean optBoolean = jSONObject.optBoolean("has_ad_info", false);
            C7573i.m23582a((Object) optString, "tag");
            if (optString.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C7573i.m23582a((Object) optString2, "label");
                if (optString2.length() > 0) {
                    z2 = true;
                }
                if (z2 && cVar != null) {
                    C24958f.m81905a().mo65266a(optString).mo65276b(optString2).mo65264a(Long.valueOf(cVar.f65887a)).mo65286h(cVar.f65888b).mo65275b(Long.valueOf(cVar.f65889c)).mo65277b(optJSONObject).mo65270a((Context) this.f112531a.get());
                    if (C7573i.m23585a((Object) optString, (Object) "draw_ad") && C7573i.m23585a((Object) optString2, (Object) "click")) {
                        C24943am.f65779a.mo65218b(cVar.f65898l);
                    }
                    if (aVar != null) {
                        aVar.mo71363a((Object) null);
                    }
                    return;
                }
            }
            if (optBoolean) {
                String optString3 = jSONObject.optString("creative_id");
                String optString4 = jSONObject.optString("log_extra");
                String optString5 = jSONObject.optString("group_id");
                if (!TextUtils.isEmpty(optString3)) {
                    C24958f.m81905a().mo65266a(optString).mo65276b(optString2).mo65280c(optString3).mo65286h(optString4).mo65282d(optString5).mo65277b(optJSONObject).mo65270a((Context) this.f112531a.get());
                    if (aVar != null) {
                        aVar.mo71363a((Object) null);
                    }
                } else if (aVar != null) {
                    aVar.mo71362a(-1, "empty creativeId");
                }
            } else if (aVar != null) {
                aVar.mo71362a(-1, "empty tag or label");
            }
        } catch (Exception e) {
            C6921a.m21554a(e);
            if (aVar != null) {
                aVar.mo71362a(-1, "unknown error");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r9 != true) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r6 != true) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m137887b(org.json.JSONObject r9, com.p280ss.android.ugc.aweme.commercialize.model.C24990c r10, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r11) {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "open_status"
            r2 = 0
            r0.put(r1, r2)
            java.lang.String r1 = "web_status"
            r0.put(r1, r2)
            java.lang.String r1 = "code"
            r3 = 1
            r0.put(r1, r3)
            java.lang.String r1 = "open_url"
            java.lang.String r1 = r9.optString(r1)
            java.lang.String r4 = "web_url"
            java.lang.String r4 = r9.optString(r4)
            java.lang.String r5 = "web_title"
            java.lang.String r5 = r9.optString(r5)
            java.lang.String r6 = "use_packaged_open_url"
            boolean r6 = r9.optBoolean(r6, r2)
            java.lang.String r7 = "use_packaged_web_url"
            boolean r9 = r9.optBoolean(r7, r2)
            r7 = 0
            if (r6 == 0) goto L_0x0059
            if (r1 == 0) goto L_0x0047
            r6 = r1
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0044
            r6 = 1
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 == r3) goto L_0x0059
        L_0x0047:
            if (r10 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f65898l
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r1.getOpenUrl()
            goto L_0x0059
        L_0x0058:
            r1 = r7
        L_0x0059:
            if (r9 == 0) goto L_0x0091
            if (r4 == 0) goto L_0x006b
            r9 = r4
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0068
            r9 = 1
            goto L_0x0069
        L_0x0068:
            r9 = 0
        L_0x0069:
            if (r9 == r3) goto L_0x0091
        L_0x006b:
            if (r10 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r10.f65898l
            if (r9 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = r9.getAwemeRawAd()
            if (r9 == 0) goto L_0x007d
            java.lang.String r9 = r9.getWebUrl()
            r4 = r9
            goto L_0x007e
        L_0x007d:
            r4 = r7
        L_0x007e:
            if (r10 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r10.f65898l
            if (r9 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = r9.getAwemeRawAd()
            if (r9 == 0) goto L_0x0090
            java.lang.String r9 = r9.getWebTitle()
            r5 = r9
            goto L_0x0091
        L_0x0090:
            r5 = r7
        L_0x0091:
            java.lang.ref.WeakReference<android.content.Context> r9 = r8.f112531a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            if (r10 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.f65898l
            goto L_0x009f
        L_0x009e:
            r6 = r7
        L_0x009f:
            boolean r9 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83457a(r9, r1, r6, r2)
            if (r9 == 0) goto L_0x00ac
            java.lang.String r9 = "open_status"
            r0.put(r9, r3)
            goto L_0x0169
        L_0x00ac:
            java.lang.ref.WeakReference<android.content.Context> r9 = r8.f112531a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83463a(r9, r1, r2)
            if (r9 == 0) goto L_0x0101
            java.lang.String r9 = "open_status"
            r0.put(r9, r3)
            if (r10 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65266a(r1)
            java.lang.String r1 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65276b(r1)
            long r1 = r10.f65887a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65264a(r1)
            java.lang.String r1 = r10.f65888b
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65286h(r1)
            long r1 = r10.f65889c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65275b(r1)
            java.lang.ref.WeakReference<android.content.Context> r1 = r8.f112531a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            r9.mo65270a(r1)
            com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b r9 = new com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b
            r9.<init>(r10, r8)
            com.ss.android.ugc.aweme.commercialize.utils.n$a r9 = (com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a) r9
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83440a(r9)
            goto L_0x0169
        L_0x0101:
            java.lang.ref.WeakReference<android.content.Context> r9 = r8.f112531a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            if (r10 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.f65898l
        L_0x010d:
            boolean r9 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83450a(r9, r7, r4, r5)
            if (r9 == 0) goto L_0x0119
            java.lang.String r9 = "web_status"
            r0.put(r9, r3)
            goto L_0x0169
        L_0x0119:
            java.lang.ref.WeakReference<android.content.Context> r9 = r8.f112531a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83459a(r9, r4, r5)
            if (r9 == 0) goto L_0x0164
            java.lang.String r9 = "web_status"
            r0.put(r9, r3)
            if (r10 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65266a(r1)
            java.lang.String r1 = "open_url_h5"
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65276b(r1)
            long r1 = r10.f65887a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65264a(r1)
            java.lang.String r1 = r10.f65888b
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65286h(r1)
            long r1 = r10.f65889c
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r9 = r9.mo65275b(r10)
            java.lang.ref.WeakReference<android.content.Context> r10 = r8.f112531a
            java.lang.Object r10 = r10.get()
            android.content.Context r10 = (android.content.Context) r10
            r9.mo65270a(r10)
            goto L_0x0169
        L_0x0164:
            java.lang.String r9 = "code"
            r0.put(r9, r2)
        L_0x0169:
            if (r11 == 0) goto L_0x016f
            r11.mo71365a(r0)
            return
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.m137887b(org.json.JSONObject, com.ss.android.ugc.aweme.commercialize.model.c, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    public /* synthetic */ AdCommonJsMethod(WeakReference weakReference, DMTJsBridge dMTJsBridge, C29954b bVar, C7571f fVar) {
        this(weakReference, dMTJsBridge, bVar);
    }
}
