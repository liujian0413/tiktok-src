package com.p280ss.android.ugc.aweme.location;

import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p280ss.android.ugc.aweme.poi.C35074c;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.location.e */
public final class C32622e implements C32619b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f85055a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32622e.class), "mCacheDuration", "getMCacheDuration()J"))};

    /* renamed from: b */
    private final C7541d f85056b = C7546e.m23569a(C32623a.f85057a);

    /* renamed from: com.ss.android.ugc.aweme.location.e$a */
    static final class C32623a extends Lambda implements C7561a<Long> {

        /* renamed from: a */
        public static final C32623a f85057a = new C32623a();

        C32623a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(m105673a());
        }

        /* renamed from: a */
        private static long m105673a() {
            try {
                C35074c o = C6903bc.m21496o();
                C7573i.m23582a((Object) o, "LegacyServiceUtils.getPoiAllService()");
                if (!o.mo88907a().mo88878a()) {
                    return 10;
                }
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                PoiSetting poiSetting = a.getPoiSetting();
                C7573i.m23582a((Object) poiSetting, "poiSetting");
                if (C7573i.m23576a(poiSetting.getPoiLocationCacheDuration().intValue(), 0) > 0) {
                    return (long) poiSetting.getPoiLocationCacheDuration().intValue();
                }
                return 10;
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
                return 10;
            }
        }
    }
}
