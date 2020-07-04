package com.p280ss.android.ugc.aweme.tools.mvtemplate.p1677c;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35531ac;
import com.p280ss.android.ugc.aweme.port.p1479in.C35531ac.C35532a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.b */
public final class C42520b implements C35531ac {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f110571a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42520b.class), "themeUtil", "getThemeUtil()Lcom/ss/android/ugc/aweme/port/in/IMvTemplateService$IMvThemeUtil;"))};

    /* renamed from: b */
    private final C7541d f110572b = C7546e.m23569a(C42521a.f110573a);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.b$a */
    static final class C42521a extends Lambda implements C7561a<C425221> {

        /* renamed from: a */
        public static final C42521a f110573a = new C42521a();

        C42521a() {
            super(0);
        }

        /* renamed from: a */
        private static C425221 m135137a() {
            return new C35532a() {
                /* renamed from: a */
                public final String mo90347a() {
                    String b = C42537b.m135186b();
                    C7573i.m23582a((Object) b, "MvThemeUtils.createRandomPNGFilePath()");
                    return b;
                }

                /* renamed from: b */
                public final String mo90349b() {
                    String b = C42537b.m135187b("mvres");
                    C7573i.m23582a((Object) b, "MvThemeUtils.getMvThemeD…ThemeContants.MV_RES_DIR)");
                    return b;
                }

                /* renamed from: a */
                public final void mo90348a(C27311c cVar) {
                    C7573i.m23587b(cVar, "draft");
                    C42537b.m135188b(cVar);
                }

                /* renamed from: b */
                public final void mo90350b(C27311c cVar) {
                    C7573i.m23587b(cVar, "draft");
                    C42537b.m135183a(cVar);
                }
            };
        }

        public final /* synthetic */ Object invoke() {
            return m135137a();
        }
    }

    /* renamed from: b */
    private final C35532a m135135b() {
        return (C35532a) this.f110572b.getValue();
    }

    /* renamed from: a */
    public final C35532a mo90346a() {
        return m135135b();
    }
}
