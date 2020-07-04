package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.al */
public final class C26254al implements C47373d<AwemeApplication> {

    /* renamed from: a */
    private final C26252aj f69255a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AwemeApplication get() {
        return m86297b(this.f69255a);
    }

    private C26254al(C26252aj ajVar) {
        this.f69255a = ajVar;
    }

    /* renamed from: b */
    private static AwemeApplication m86297b(C26252aj ajVar) {
        return m86298c(ajVar);
    }

    /* renamed from: a */
    public static C26254al m86296a(C26252aj ajVar) {
        return new C26254al(ajVar);
    }

    /* renamed from: c */
    private static AwemeApplication m86298c(C26252aj ajVar) {
        return (AwemeApplication) C47375f.m147940a(ajVar.f69253a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
