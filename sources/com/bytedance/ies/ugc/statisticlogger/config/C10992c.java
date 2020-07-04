package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import com.bytedance.common.utility.C6317k;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.c */
public abstract class C10992c {

    /* renamed from: a */
    public final Application f29723a;

    /* renamed from: b */
    public final boolean f29724b;

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.c$a */
    public interface C10993a {
        /* renamed from: a */
        C6317k mo26545a();
    }

    /* renamed from: a */
    public abstract C10993a mo26544a();

    private C10992c(Application application, boolean z) {
        C7573i.m23587b(application, "application");
        this.f29723a = application;
        this.f29724b = z;
    }

    public /* synthetic */ C10992c(Application application, boolean z, int i, C7571f fVar) {
        this(application, C6399b.m19943s());
    }
}
