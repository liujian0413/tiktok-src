package com.p280ss.android.ugc.aweme.crossplatform.params.base;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.settings.RnSourceUrlSetting;
import com.p280ss.android.ugc.aweme.settings.RnSourceUrlSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.d */
public final class C25891d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68483a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25891d.class), "settings", "getSettings()Ljava/util/Map;"))};

    /* renamed from: b */
    public static final C7541d f68484b = C7546e.m23569a(C25893b.f68488a);

    /* renamed from: c */
    public static final C25892a f68485c = new C25892a(null);

    /* renamed from: d */
    private final C7541d f68486d;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.d$a */
    public static final class C25892a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f68487a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25892a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/params/base/SourUrlSettingsCache;"))};

        private C25892a() {
        }

        /* renamed from: a */
        public static C25891d m85166a() {
            return (C25891d) C25891d.f68484b.getValue();
        }

        public /* synthetic */ C25892a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.d$b */
    static final class C25893b extends Lambda implements C7561a<C25891d> {

        /* renamed from: a */
        public static final C25893b f68488a = new C25893b();

        C25893b() {
            super(0);
        }

        /* renamed from: a */
        private static C25891d m85167a() {
            return new C25891d(null);
        }

        public final /* synthetic */ Object invoke() {
            return m85167a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.d$c */
    static final class C25894c extends Lambda implements C7561a<Map<String, String>> {

        /* renamed from: a */
        public static final C25894c f68489a = new C25894c();

        C25894c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m85168a();
        }

        /* renamed from: a */
        private static Map<String, String> m85168a() {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            try {
                RnSourceUrlSetting[] rnSourceUrlSettingArr = (RnSourceUrlSetting[]) C10292j.m30480a().mo25014a(RnSourceUrlSettings.class, "android_source_url", C6384b.m19835a().mo15294c().getAndroidSourceUrl(), "com.ss.android.ugc.aweme.settings.RnSourceUrlSetting[]", RnSourceUrlSetting[].class);
                if (rnSourceUrlSettingArr != null) {
                    for (RnSourceUrlSetting rnSourceUrlSetting : rnSourceUrlSettingArr) {
                        String channel = rnSourceUrlSetting.getChannel();
                        if (channel != null) {
                            String sourceUrl = rnSourceUrlSetting.getSourceUrl();
                            if (sourceUrl != null) {
                                linkedHashMap.put(channel, sourceUrl);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return linkedHashMap;
        }
    }

    /* renamed from: b */
    public static final C25891d m85164b() {
        return C25892a.m85166a();
    }

    /* renamed from: a */
    public final Map<String, String> mo67271a() {
        return (Map) this.f68486d.getValue();
    }

    private C25891d() {
        this.f68486d = C7546e.m23569a(C25894c.f68489a);
    }

    public /* synthetic */ C25891d(C7571f fVar) {
        this();
    }
}
