package com.bytedance.opensdk.core.grant.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.opensdk.core.ApiInfo;
import com.bytedance.opensdk.core.C12287a;
import com.bytedance.opensdk.core.base.p628ui.HeloSdkBaseWebActivity;
import com.bytedance.opensdk.core.grant.config.GrantConfig;
import com.bytedance.opensdk.core.grant.web.p632a.C12329a.C12330a;
import com.bytedance.opensdk.core.p629c.p630a.C12319a;
import com.bytedance.opensdk.core.p629c.p630a.C12320b;
import com.bytedance.opensdk.core.p629c.p630a.C12321c;
import com.bytedance.opensdk.core.p629c.p630a.C12322d;
import com.bytedance.opensdk.p619b.C12267b;
import com.bytedance.opensdk.p619b.C12278i;
import com.bytedance.opensdk.p619b.C12280k;
import com.bytedance.opensdk.p619b.C12285o;
import com.google.gson.C6711m;
import com.p280ss.ttm.player.MediaPlayer;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

public final class WebGrantActivity extends HeloSdkBaseWebActivity {

    /* renamed from: c */
    public static String f32718c = WebGrantActivity.class.getSimpleName();

    /* renamed from: d */
    public static final C12326a f32719d = new C12326a(null);

    /* renamed from: e */
    private GrantConfig f32720e;

    /* renamed from: f */
    private HashMap f32721f;

    /* renamed from: com.bytedance.opensdk.core.grant.web.WebGrantActivity$a */
    public static final class C12326a {
        private C12326a() {
        }

        public /* synthetic */ C12326a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo30116a(int i) {
        if (this.f32721f == null) {
            this.f32721f = new HashMap();
        }
        View view = (View) this.f32721f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f32721f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo30124a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        return false;
    }

    /* renamed from: a */
    public final String mo30117a() {
        GrantConfig grantConfig = this.f32720e;
        if (grantConfig == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o oVar = new C12285o(C12280k.m35709d(grantConfig.f32709b.f32673e));
        String str = "avatar";
        GrantConfig grantConfig2 = this.f32720e;
        if (grantConfig2 == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o a = oVar.mo30088a(str, grantConfig2.f32710c.f32715b);
        String str2 = "nick";
        GrantConfig grantConfig3 = this.f32720e;
        if (grantConfig3 == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o a2 = a.mo30088a(str2, grantConfig3.f32710c.f32714a);
        String str3 = "code";
        GrantConfig grantConfig4 = this.f32720e;
        if (grantConfig4 == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o a3 = a2.mo30088a(str3, grantConfig4.f32711d);
        String str4 = "device_id";
        GrantConfig grantConfig5 = this.f32720e;
        if (grantConfig5 == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o a4 = a3.mo30088a(str4, grantConfig5.f32709b.f32674f);
        String str5 = "platform";
        GrantConfig grantConfig6 = this.f32720e;
        if (grantConfig6 == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o a5 = a4.mo30088a(str5, grantConfig6.f32709b.f32673e);
        String str6 = "has_bind";
        GrantConfig grantConfig7 = this.f32720e;
        if (grantConfig7 == null) {
            C7573i.m23583a("grantConfig");
        }
        C12285o a6 = a5.mo30087a(str6, grantConfig7.f32708a);
        String str7 = "region";
        GrantConfig grantConfig8 = this.f32720e;
        if (grantConfig8 == null) {
            C7573i.m23583a("grantConfig");
        }
        String country = grantConfig8.f32713f.getCountry();
        C7573i.m23582a((Object) country, "grantConfig.appLocale.country");
        C12285o a7 = a6.mo30088a(str7, country);
        String str8 = "helo_language";
        GrantConfig grantConfig9 = this.f32720e;
        if (grantConfig9 == null) {
            C7573i.m23583a("grantConfig");
        }
        String language = grantConfig9.f32713f.getLanguage();
        C7573i.m23582a((Object) language, "grantConfig.appLocale.language");
        String a8 = a7.mo30088a(str8, language).mo30089a();
        String str9 = this.f32684b;
        C7573i.m23582a((Object) str9, "TAG");
        StringBuilder sb = new StringBuilder("loadUrl = ");
        sb.append(a8);
        C12278i.m35691a(str9, sb.toString());
        return a8;
    }

    /* renamed from: a */
    private final void m35785a(C12319a aVar) {
        Intent intent = new Intent();
        intent.putExtra("result", C12287a.m35724a().mo15979b((Object) aVar));
        if (C7573i.m23585a((Object) aVar.f32667b, (Object) "success")) {
            setResult(-1, intent);
        } else {
            setResult(3000, intent);
        }
    }

    /* renamed from: a */
    public final void mo30118a(Intent intent) {
        C7573i.m23587b(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bind_config");
        if (!(parcelableExtra instanceof GrantConfig)) {
            parcelableExtra = null;
        }
        GrantConfig grantConfig = (GrantConfig) parcelableExtra;
        if (grantConfig != null) {
            this.f32720e = grantConfig;
            return;
        }
        m35785a(new C12319a("fail", new C12320b("grant config null", Integer.valueOf(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL))));
        finish();
    }

    /* renamed from: a */
    public final boolean mo30127a(C12330a aVar) {
        int i;
        boolean z;
        C7573i.m23587b(aVar, "jsMsg");
        String str = aVar.f32728c;
        boolean z2 = false;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1743442128) {
                if (hashCode != 1251063817) {
                    if (hashCode == 1584751270 && str.equals("track_event")) {
                        C6711m mVar = aVar.f32729d;
                        if (mVar != null) {
                            String a = C12267b.m35674a(mVar, "event_name", (String) null);
                            if (a != null) {
                                C6711m a2 = C12267b.m35670a(mVar, "properties");
                                if (a2 != null) {
                                    C12280k.m35699a(a, a2);
                                }
                            }
                        }
                    }
                } else if (str.equals("heloLogin")) {
                    String str2 = this.f32684b;
                    C7573i.m23582a((Object) str2, "TAG");
                    StringBuilder sb = new StringBuilder("handleUriHook heloLogin,   jsMsg = ");
                    sb.append(aVar);
                    C12278i.m35691a(str2, sb.toString());
                    C6711m mVar2 = aVar.f32729d;
                    if (mVar2 != null) {
                        Boolean a3 = C12267b.m35672a(mVar2, "syncHis", (Boolean) null);
                        if (a3 != null) {
                            z = a3.booleanValue();
                        } else {
                            z = false;
                        }
                        Boolean a4 = C12267b.m35672a(mVar2, "hasBind", (Boolean) null);
                        if (a4 != null) {
                            z2 = a4.booleanValue();
                        }
                        String str3 = "HeloNativeLoginEnd";
                        C6711m mVar3 = new C6711m();
                        mVar3.mo16145a("syncHis", Boolean.valueOf(z));
                        mVar3.mo16145a("hasBind", Boolean.valueOf(z2));
                        ApiInfo apiInfo = ApiInfo.BIND;
                        if (C12280k.m35701a(apiInfo)) {
                            mVar3.mo16147a("result", "success");
                            mo30123a(str3, mVar3);
                            Activity activity = this;
                            GrantConfig grantConfig = this.f32720e;
                            if (grantConfig == null) {
                                C7573i.m23583a("grantConfig");
                            }
                            m35784a(activity, C12267b.m35668a(grantConfig, z), apiInfo.getRequestCodeInt());
                        } else {
                            mVar3.mo16147a("result", "fail");
                            mo30123a(str3, mVar3);
                        }
                    }
                }
            } else if (str.equals("bindAccount")) {
                String str4 = this.f32684b;
                C7573i.m23582a((Object) str4, "TAG");
                StringBuilder sb2 = new StringBuilder("handleUriHook bindTiktok,  jsMsg = ");
                sb2.append(aVar);
                C12278i.m35691a(str4, sb2.toString());
                C6711m mVar4 = aVar.f32729d;
                if (mVar4 != null) {
                    String a5 = C12267b.m35674a(mVar4, "status", (String) null);
                    if (a5 == null) {
                        a5 = "";
                    }
                    String a6 = C12267b.m35674a(mVar4, "code", (String) null);
                    if (a6 != null) {
                        Integer d = C7634n.m23706d(a6);
                        if (d != null) {
                            i = d.intValue();
                            m35785a(new C12319a(a5, new C12320b(a5, Integer.valueOf(i))));
                            finish();
                        }
                    }
                    i = C12267b.m35664a(mVar4, "code", -1);
                    m35785a(new C12319a(a5, new C12320b(a5, Integer.valueOf(i))));
                    finish();
                }
            }
            return true;
        }
        String str5 = this.f32684b;
        C7573i.m23582a((Object) str5, "TAG");
        StringBuilder sb3 = new StringBuilder("handleUriHook else,  jsMsg = ");
        sb3.append(aVar);
        C12278i.m35691a(str5, sb3.toString());
        return false;
    }

    /* renamed from: a */
    private static void m35784a(Activity activity, C12322d dVar, int i) {
        Intent intent = new Intent("com.ss.android.heloauth.ACTION_BIND_ACCOUNT", C12280k.m35693a("bind").build());
        C12321c cVar = new C12321c(100, dVar);
        intent.setPackage("app.buzz.share");
        intent.putExtra("data", C12287a.m35724a().mo15979b((Object) cVar));
        activity.startActivityForResult(intent, i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r6 == null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            com.bytedance.opensdk.core.ApiInfo r6 = com.bytedance.opensdk.core.ApiInfo.BIND
            int r6 = r6.getRequestCodeInt()
            if (r5 != r6) goto L_0x0085
            r5 = 0
            if (r7 == 0) goto L_0x0015
            java.lang.String r6 = "result"
            java.lang.String r6 = r7.getStringExtra(r6)
            goto L_0x0016
        L_0x0015:
            r6 = r5
        L_0x0016:
            com.google.gson.e r0 = com.bytedance.opensdk.core.C12287a.m35724a()     // Catch:{ Exception -> 0x0023 }
            java.lang.Class<com.bytedance.opensdk.core.c.a.a> r1 = com.bytedance.opensdk.core.p629c.p630a.C12319a.class
            java.lang.Object r6 = r0.mo15974a(r6, r1)     // Catch:{ Exception -> 0x0023 }
            com.bytedance.opensdk.core.c.a.a r6 = (com.bytedance.opensdk.core.p629c.p630a.C12319a) r6     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            if (r6 == 0) goto L_0x002b
            boolean r0 = r6.mo30108b()
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r6 == 0) goto L_0x0036
            T r1 = r6.f32668c
            com.bytedance.opensdk.core.c.a.b r1 = (com.bytedance.opensdk.core.p629c.p630a.C12320b) r1
            if (r1 == 0) goto L_0x0036
            java.lang.Integer r5 = r1.f32666d
        L_0x0036:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            if (r0 == 0) goto L_0x0047
            java.lang.String r6 = "result"
            java.lang.String r2 = "success"
            r1.put(r6, r2)
            goto L_0x0061
        L_0x0047:
            java.lang.String r2 = "result"
            java.lang.String r3 = "fail"
            r1.put(r2, r3)
            java.lang.String r2 = "fail_type"
            if (r6 == 0) goto L_0x005c
            T r6 = r6.f32668c
            com.bytedance.opensdk.core.c.a.b r6 = (com.bytedance.opensdk.core.p629c.p630a.C12320b) r6
            if (r6 == 0) goto L_0x005c
            java.lang.String r6 = r6.f32665c
            if (r6 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r6 = ""
        L_0x005e:
            r1.put(r2, r6)
        L_0x0061:
            java.lang.String r6 = "sync_connect_account_result"
            com.bytedance.opensdk.p619b.C12280k.m35700a(r6, r1)
            if (r0 != 0) goto L_0x007e
            if (r5 != 0) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            int r5 = r5.intValue()
            r6 = 1041(0x411, float:1.459E-42)
            if (r5 != r6) goto L_0x007e
            java.lang.String r5 = "HasBindAnotherAccount"
            com.google.gson.m r6 = new com.google.gson.m
            r6.<init>()
            r4.mo30123a(r5, r6)
            return
        L_0x007e:
            r5 = -1
            r4.setResult(r5, r7)
            r4.finish()
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.grant.web.WebGrantActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
