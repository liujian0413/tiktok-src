package com.p280ss.android.ugc.aweme.filter;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.bv */
public final class C29268bv {
    @C6593c(mo15949a = "type")

    /* renamed from: a */
    public final int f77216a;
    @C6593c(mo15949a = "effect_ids")

    /* renamed from: b */
    public final String f77217b;
    @C6593c(mo15949a = "device_id")

    /* renamed from: c */
    public final String f77218c;
    @C6593c(mo15949a = "aid")

    /* renamed from: d */
    public final int f77219d;
    @C6593c(mo15949a = "panel")

    /* renamed from: e */
    public final String f77220e;
    @C6593c(mo15949a = "sdk_version")

    /* renamed from: f */
    public final String f77221f;
    @C6593c(mo15949a = "channel")

    /* renamed from: g */
    public final String f77222g;
    @C6593c(mo15949a = "region")

    /* renamed from: h */
    public final String f77223h;
    @C6593c(mo15949a = "access_key")

    /* renamed from: i */
    public final String f77224i;
    @C6593c(mo15949a = "app_version")

    /* renamed from: j */
    public final String f77225j;

    private C29268bv(Set<Integer> set, int i) {
        this.f77216a = i;
        this.f77217b = C7525m.m23492a(set, ",", null, null, 0, null, null, 62, null);
        this.f77218c = AppLog.getServerDeviceId();
        String str = EffectPlatform.f72452d;
        C7573i.m23582a((Object) str, "EffectPlatform.APP_ID");
        this.f77219d = Integer.parseInt(str);
        C7573i.m23582a((Object) FilterManager.m95700a(), "FilterManager.getInstance()");
        this.f77220e = FilterManager.m95703i();
        this.f77221f = C35574k.m114859a().mo70092g().mo70114b();
        this.f77222g = EffectPlatform.m90015d();
        this.f77223h = C35574k.m114859a().mo70107v().mo83209c();
        this.f77224i = C35574k.m114859a().mo70092g().mo70113a();
        this.f77225j = C35574k.m114859a().mo70102q().mo83142i();
    }

    public /* synthetic */ C29268bv(Set set, int i, C7571f fVar) {
        this(set, i);
    }
}
