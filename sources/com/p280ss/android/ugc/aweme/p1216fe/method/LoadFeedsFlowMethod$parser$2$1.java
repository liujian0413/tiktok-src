package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$parser$2$1 */
public final class LoadFeedsFlowMethod$parser$2$1 implements C6708j<Boolean> {
    LoadFeedsFlowMethod$parser$2$1() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) {
        return m91386b(kVar, type, iVar);
    }

    /* renamed from: b */
    private static Boolean m91386b(C6709k kVar, Type type, C6610i iVar) {
        boolean z;
        boolean z2 = true;
        if (kVar != null) {
            try {
                if (kVar.mo16003g() == 1) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            } catch (Exception unused) {
                if (kVar != null) {
                    try {
                        if (kVar.mo16004h()) {
                            return Boolean.valueOf(z2);
                        }
                    } catch (Exception unused2) {
                        return Boolean.valueOf(false);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
