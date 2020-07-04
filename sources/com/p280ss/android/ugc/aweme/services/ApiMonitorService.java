package com.p280ss.android.ugc.aweme.services;

import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.services.ApiMonitorService */
public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    public static final C7541d instance$delegate = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, ApiMonitorService$Companion$instance$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.ApiMonitorService$Companion */
    public static final class Companion {
        static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/services/ApiMonitorService;"))};

        private Companion() {
        }

        public final ApiMonitorService getInstance() {
            return (ApiMonitorService) ApiMonitorService.instance$delegate.getValue();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    private ApiMonitorService() {
    }

    /* access modifiers changed from: protected */
    public final boolean filter(String str, Object obj) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(obj, "body");
        return false;
    }

    public /* synthetic */ ApiMonitorService(C7571f fVar) {
        this();
    }
}
