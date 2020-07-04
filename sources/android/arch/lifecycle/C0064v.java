package android.arch.lifecycle;

import android.support.p022v4.app.Fragment;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: android.arch.lifecycle.v */
public final class C0064v {
    /* renamed from: a */
    public static final void m149a(Fragment fragment, C0063u uVar, C7561a<String> aVar) {
        C7573i.m23587b(fragment, "$this$ensureViewModel");
        C7573i.m23587b(uVar, "value");
        C7573i.m23587b(aVar, "keyFactory");
        C0070y a = C0030aa.m79a(fragment);
        C7573i.m23582a((Object) a, "ViewModelStores.of(this)");
        String str = (String) aVar.invoke();
        if (a.mo150a(str) == null) {
            a.mo152a(str, uVar);
        }
    }
}
