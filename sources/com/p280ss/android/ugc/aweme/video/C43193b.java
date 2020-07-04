package com.p280ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.TTVideoEngine;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1812e.C46084i;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.b */
public final class C43193b {

    /* renamed from: a */
    public static final C43193b f111831a = new C43193b();

    /* renamed from: b */
    private static final Resolution f111832b = Resolution.H_High;

    /* renamed from: c */
    private static final DashPlayHelper$VIDEO_MODELS$1 f111833c = new DashPlayHelper$VIDEO_MODELS$1();

    private C43193b() {
    }

    /* renamed from: a */
    public static Resolution m136953a() {
        return f111832b;
    }

    /* renamed from: b */
    public static C46083h m136956b(String str) {
        C7573i.m23587b(str, "videoId");
        return (C46083h) f111833c.get((Object) str);
    }

    /* renamed from: a */
    public static long m136952a(C46083h hVar) {
        if (hVar == null || hVar.f117858d == null) {
            return 0;
        }
        return TTVideoEngine.getCacheFileSize(hVar, TTVideoEngine.findBestResolution(hVar, f111832b, 1));
    }

    /* renamed from: a */
    public static C46083h m136954a(String str) {
        C7573i.m23587b(str, "jsonString");
        if (!TextUtils.isEmpty(str)) {
            try {
                C46084i iVar = new C46084i();
                iVar.mo112251a(new JSONObject(str));
                C46083h hVar = new C46083h();
                hVar.mo112228a(iVar);
                return hVar;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m136955a(String str, C46083h hVar) {
        C7573i.m23587b(str, "videoId");
        C7573i.m23587b(hVar, "videoModel");
        f111833c.put(str, hVar);
    }
}
