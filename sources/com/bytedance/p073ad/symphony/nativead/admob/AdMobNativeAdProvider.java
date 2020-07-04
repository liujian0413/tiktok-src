package com.bytedance.p073ad.symphony.nativead.admob;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14739c;
import com.google.android.gms.ads.C14739c.C14740a;
import com.google.android.gms.ads.C14873l;
import com.google.android.gms.ads.C14873l.C14874a;
import com.google.android.gms.ads.formats.C14750b.C14751a;
import com.google.android.gms.ads.formats.C14761h;
import com.google.android.gms.ads.formats.C14761h.C14762a;
import com.google.android.gms.ads.p741a.C14727c.C14728a;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.ad.symphony.nativead.admob.AdMobNativeAdProvider */
public class AdMobNativeAdProvider extends AbsNativeAdProvider {
    private boolean mEnableTestDevice;

    /* renamed from: com.bytedance.ad.symphony.nativead.admob.AdMobNativeAdProvider$a */
    class C2168a extends C14732b {

        /* renamed from: a */
        public C2143b f7359a;

        /* renamed from: b */
        public String f7360b;

        /* renamed from: c */
        public C2158a f7361c;

        /* renamed from: e */
        private C2170b f7363e;

        /* renamed from: b */
        public final void mo7869b() {
            super.mo7869b();
            C14732b bVar = this.f7363e.f7366a;
            if (bVar != null) {
                bVar.mo7869b();
            }
        }

        /* renamed from: v_ */
        public final void mo7870v_() {
            super.mo7870v_();
            C14732b bVar = this.f7363e.f7366a;
            if (bVar != null) {
                bVar.mo7870v_();
            }
        }

        /* renamed from: a */
        public final void mo7868a(final int i) {
            AdMobNativeAdProvider.this.runOnAdThread(new Runnable() {
                public final void run() {
                    AdMobNativeAdProvider.this.getTag();
                    new StringBuilder("Google Native Ad load failed, errorCode-->").append(i);
                    AdMobNativeAdProvider.this.cancelTimeoutCheck(C2168a.this.f7360b);
                    if (C2168a.this.f7361c != null) {
                        C2168a.this.f7361c.mo7839a(C2168a.this.f7359a.f7284a, String.valueOf(i));
                    }
                }
            });
        }

        C2168a(C2170b bVar, String str, C2143b bVar2, C2158a aVar) {
            this.f7363e = bVar;
            this.f7359a = bVar2;
            this.f7360b = str;
            this.f7361c = aVar;
        }
    }

    /* renamed from: com.bytedance.ad.symphony.nativead.admob.AdMobNativeAdProvider$b */
    static class C2170b extends C14740a {

        /* renamed from: a */
        public C14732b f7366a;

        /* renamed from: b */
        public String f7367b;

        /* renamed from: a */
        public final C14740a mo7872a(C14732b bVar) {
            super.mo7872a(bVar);
            return this;
        }

        public C2170b(Context context, String str, String str2) {
            super(context, str);
            this.f7367b = str2;
        }
    }

    public String getTag() {
        StringBuilder sb = new StringBuilder("AdMobNativeAdProvider[");
        sb.append(getProviderId());
        sb.append("]");
        return sb.toString();
    }

    private Bundle createBundle(C2143b bVar) {
        Bundle bundle = new Bundle();
        if (C2114c.m9318c()) {
            bundle.putString("npa", "1");
        }
        if (bVar.f7286c) {
            bundle.putString("disablePlayWhenVisible", "true");
        }
        if (C2114c.m9317b() && bVar.f7287d) {
            bundle.putBoolean("disable_content_ad", true);
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getAspectRatio(com.bytedance.p073ad.symphony.p081e.p082a.C2143b r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f7288e
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r6 = r6.f7288e
            r0 = -1
            int r2 = r6.hashCode()
            r3 = -894674659(0xffffffffcaac591d, float:-5647502.5)
            r4 = 2
            if (r2 == r3) goto L_0x0032
            r3 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r2 == r3) goto L_0x0028
            r3 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r2 == r3) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            java.lang.String r2 = "landscape"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x003c
            r6 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r2 = "portrait"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r2 = "square"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x003c
            r6 = 2
            goto L_0x003d
        L_0x003c:
            r6 = -1
        L_0x003d:
            switch(r6) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0043;
                case 2: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0046
        L_0x0041:
            r1 = 4
            goto L_0x0046
        L_0x0043:
            r1 = 3
            goto L_0x0046
        L_0x0045:
            r1 = 2
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p073ad.symphony.nativead.admob.AdMobNativeAdProvider.getAspectRatio(com.bytedance.ad.symphony.e.a.b):int");
    }

    private C14728a createRequestBuilder(C2143b bVar, C2159a aVar) {
        C14728a aVar2 = new C14728a();
        aVar2.mo37388a(AdMobAdapter.class, createBundle(bVar));
        if (this.mEnableTestDevice) {
            try {
                aVar2.mo37392b(C6306c.m19561a(Secure.getString(this.mContext.getContentResolver(), "android_id")).toUpperCase());
            } catch (Exception unused) {
            }
        }
        if (aVar != null) {
            if (aVar.f7327b > 0) {
                aVar2.mo37387a(aVar.f7327b);
            }
            List<String> d = aVar.mo7850d();
            if (!d.isEmpty()) {
                for (String a : d) {
                    aVar2.mo37389a(a);
                }
                getTag();
                new StringBuilder("keywords-->").append(d);
            }
            Map<String, String> map = aVar.f7328c;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    aVar2.mo37390a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (C2140e.m9361b() != null && C2140e.m9361b().f7298e && !TextUtils.isEmpty(aVar.f7329d)) {
                aVar2.mo37393c(aVar.f7329d);
            }
        }
        return aVar2;
    }

    public AdMobNativeAdProvider(Context context, C2142a aVar, C2113d dVar) {
        super(context, aVar, dVar);
    }

    public void loadAdAsync(String str, C2143b bVar, C2159a aVar, C2158a aVar2) {
        try {
            String str2 = bVar.f7284a;
            if (C2114c.m9317b() && !C6319n.m19593a(this.mAdConfig.f7282g)) {
                if (this.mAdConfig.f7282g.equals("1")) {
                    this.mEnableTestDevice = true;
                } else {
                    str2 = this.mAdConfig.f7282g;
                }
            }
            getTag();
            StringBuilder sb = new StringBuilder("load placement:");
            sb.append(str);
            sb.append(",use real pid:");
            sb.append(str2);
            C14873l a = new C14874a().mo37877a(true).mo37878a();
            C2170b bVar2 = new C2170b(this.mContext, str2, str);
            C14740a a2 = bVar2.mo37425a(new C14751a().mo37505a(a).mo37508b(getAspectRatio(bVar)).mo37507a());
            C2168a aVar3 = new C2168a(bVar2, str, bVar, aVar2);
            a2.mo7872a((C14732b) aVar3);
            final C2170b bVar3 = bVar2;
            final C2143b bVar4 = bVar;
            final String str3 = str;
            final C2158a aVar4 = aVar2;
            C21661 r2 = new C14762a() {
                /* renamed from: a */
                public final void mo7866a(final C14761h hVar) {
                    AdMobNativeAdProvider.this.runOnAdThread(new Runnable() {
                        public final void run() {
                            AdMobNativeAdProvider.this.getTag();
                            StringBuilder sb = new StringBuilder("type-->");
                            sb.append(bVar3.f7367b);
                            sb.append(", body-->");
                            sb.append(hVar.mo37540c());
                            sb.append(", title-->");
                            sb.append(hVar.mo37538a());
                            C2171a aVar = new C2171a(AdMobNativeAdProvider.this.mContext, AdMobNativeAdProvider.this.mAdConfig, bVar4, hVar, "", bVar3, str3);
                            AdMobNativeAdProvider.this.addToPool(bVar3.f7367b, aVar);
                            AdMobNativeAdProvider.this.cancelTimeoutCheck(str3);
                            if (aVar4 != null) {
                                aVar4.mo7843c(bVar4.f7284a);
                            }
                        }
                    });
                }
            };
            bVar2.mo37428a((C14762a) r2);
            C14739c a3 = bVar2.mo37430a();
            C14728a createRequestBuilder = createRequestBuilder(bVar, aVar);
            startTimeoutCheck(str, aVar2);
            a3.mo37423a(createRequestBuilder.mo37391a());
            getTag();
            new StringBuilder(" type-->").append(str);
        } catch (Throwable unused) {
            getTag();
            if (aVar2 != null) {
                aVar2.mo7839a(bVar.f7284a, "GMS Exception");
            }
        }
    }
}
