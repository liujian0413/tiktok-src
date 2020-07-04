package com.p280ss.android.ugc.aweme.storage;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.a */
public final class C41891a {

    /* renamed from: a */
    public static final C41891a f108968a = new C41891a();

    private C41891a() {
    }

    /* renamed from: a */
    public static final boolean m133230a() {
        return m133231b().getBoolean("key_is_effect_storage_cleaning", false);
    }

    /* renamed from: b */
    private static Keva m133231b() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "AVStoragePreferences", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final void m133229a(boolean z) {
        m133231b().storeBoolean("key_is_effect_storage_cleaning", z);
    }
}
