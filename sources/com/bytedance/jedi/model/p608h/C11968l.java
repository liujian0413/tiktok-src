package com.bytedance.jedi.model.p608h;

import com.bytedance.jedi.model.p605g.C11847a;
import com.bytedance.jedi.model.p605g.C11848b;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.h.l */
public final class C11968l {
    /* renamed from: a */
    public static final String m35055a(Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2 != null) {
                if (obj2.length() > 200) {
                    StringBuilder sb = new StringBuilder();
                    if (obj2 != null) {
                        String substring = obj2.substring(0, C34943c.f91127w);
                        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append("...");
                        obj2 = sb.toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return TEVideoRecorder.FACE_BEAUTY_NULL;
    }

    /* renamed from: a */
    public static final <T> void m35056a(C11848b<T> bVar, C11847a<T> aVar) {
        C7573i.m23587b(bVar, "$this$onEvent");
        C7573i.m23587b(aVar, "tracePoint");
        C11942f.m34995a(aVar, bVar);
    }
}
