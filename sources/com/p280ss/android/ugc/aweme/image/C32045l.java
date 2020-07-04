package com.p280ss.android.ugc.aweme.image;

import android.os.Build.VERSION;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.image.experiment.C7107a;
import com.p280ss.android.ugc.aweme.image.experiment.ImageCropConfigExperiment;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.l */
public final class C32045l {
    /* renamed from: b */
    private static boolean m104059b() {
        if (VERSION.SDK_INT == 18) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m104056a() {
        /*
            com.ss.android.ugc.aweme.image.d r0 = com.p280ss.android.ugc.aweme.image.C32034d.m104015a()
            com.facebook.common.p686c.C13286a.m38833a(r0)
            boolean r0 = m104059b()
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.image.p r0 = com.p280ss.android.ugc.aweme.image.C32052p.m104069b()
            goto L_0x0016
        L_0x0012:
            com.ss.android.ugc.aweme.image.u r0 = com.p280ss.android.ugc.aweme.image.C32060u.m104088b()
        L_0x0016:
            java.io.File r1 = com.p280ss.android.ugc.aweme.shortvideo.util.C41564p.m132374b()
            boolean r2 = com.bytedance.storage.C12920c.m37608a()
            r3 = 10485760(0xa00000, double:5.180654E-317)
            r5 = 41943040(0x2800000, double:2.0722615E-316)
            if (r2 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0030
            long r7 = r1.getFreeSpace()
            r9 = 8
            long r7 = r7 / r9
            goto L_0x0031
        L_0x0030:
            r7 = r5
        L_0x0031:
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x003c
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            r3 = r7
            goto L_0x003d
        L_0x003c:
            r3 = r5
        L_0x003d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.ss.android.ugc.aweme.image.q r5 = com.p280ss.android.ugc.aweme.image.C32055q.f83841e
            r2.add(r5)
            com.ss.android.ugc.aweme.image.l$1 r5 = new com.ss.android.ugc.aweme.image.l$1
            r5.<init>()
            com.facebook.net.C14126c.m41716a(r5)
            android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            com.bytedance.lighten.core.o$a r5 = com.bytedance.lighten.core.C12134o.m35308a(r5)
            r6 = 1
            com.bytedance.lighten.core.o$a r5 = r5.mo29834c(r6)
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
            com.bytedance.lighten.core.o$a r5 = r5.mo29824a(r7)
            com.bytedance.lighten.core.o$a r5 = r5.mo29832b(r6)
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19928c()
            if (r7 == 0) goto L_0x006e
            r7 = 2
            goto L_0x006f
        L_0x006e:
            r7 = 5
        L_0x006f:
            com.bytedance.lighten.core.o$a r5 = r5.mo29822a(r7)
            com.bytedance.lighten.core.o$a r1 = r5.mo29828a(r1)
            com.bytedance.lighten.core.o$a r1 = r1.mo29823a(r3)
            com.bytedance.lighten.core.o$a r0 = r1.mo29827a(r0)
            com.ss.android.ugc.aweme.image.g r1 = new com.ss.android.ugc.aweme.image.g
            r1.<init>()
            com.bytedance.lighten.core.o$a r0 = r0.mo29825a(r1)
            com.bytedance.lighten.core.o$a r0 = r0.mo29829a(r2)
            com.bytedance.lighten.core.o$a r0 = r0.mo29830a(r6)
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            com.bytedance.lighten.core.o$a r0 = r0.mo29833b(r1)
            com.bytedance.lighten.core.c.n r1 = com.p280ss.android.ugc.aweme.image.C32047m.f83827a
            com.bytedance.lighten.core.o$a r0 = r0.mo29826a(r1)
            com.bytedance.lighten.core.o r0 = r0.mo29831a()
            com.bytedance.lighten.core.C12133n.m35302a(r0)
            r0 = 0
            com.facebook.drawee.backends.pipeline.C13380c.m39170a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32045l.m104056a():void");
    }

    /* renamed from: a */
    private static void m104058a(boolean z, JSONObject jSONObject) {
        if (!z) {
            int optInt = jSONObject.optInt("err_code");
            if (41 == optInt || 40 == optInt) {
                return;
            }
        }
        C32042i.f83824a.mo83014a(z, jSONObject);
    }

    /* renamed from: a */
    static final /* synthetic */ void m104057a(boolean z, String str, JSONObject jSONObject) {
        boolean z2;
        m104058a(z, jSONObject);
        boolean z3 = false;
        if (C6379c.m19829a("image_monitor_v2") || C7163a.m22363a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!z) {
                int optInt = jSONObject.optInt("err_code");
                if (41 == optInt || 40 == optInt) {
                    return;
                }
            }
            C7107a aVar = null;
            try {
                aVar = (C7107a) C6384b.m19835a().mo15290a(ImageCropConfigExperiment.class, true, "image_crop_config_v3", (Object) C6384b.m19835a().mo15295d().image_crop_config_v3, C7107a.class);
            } catch (Throwable unused) {
            }
            String str2 = "url_convert";
            if (aVar != null) {
                z3 = true;
            }
            try {
                jSONObject.put(str2, z3);
            } catch (JSONException unused2) {
            }
            C6893q.m21447a("image_monitor_v2", jSONObject);
            C7163a.m22363a();
        }
    }
}
