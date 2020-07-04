package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.b */
public final class C7211b {

    /* renamed from: a */
    public static final C7211b f20151a = new C7211b();

    /* renamed from: b */
    private static C6711m f20152b;

    private C7211b() {
    }

    /* renamed from: a */
    public static final boolean m22490a() {
        if (C6399b.m19928c() || C6319n.m19594a(C6399b.m19941q(), "local_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m22489a(C6711m mVar) {
        f20152b = mVar;
    }

    /* renamed from: b */
    public static final void m22491b(C6711m mVar) {
        f20152b = mVar;
        C7215f.m22631b().mo16907b(C6399b.m19921a(), "ab_test_model_jsonobject", (Object) mVar);
    }

    /* renamed from: a */
    public static final C6709k m22488a(String str) {
        C7573i.m23587b(str, "key");
        if (C6399b.m19928c()) {
            return null;
        }
        C6711m mVar = f20152b;
        if (mVar != null) {
            return mVar.mo16149b(str);
        }
        return null;
    }
}
