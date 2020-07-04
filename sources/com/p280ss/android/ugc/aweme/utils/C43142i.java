package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.utils.C43137g.C43138a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.i */
public final class C43142i {
    /* renamed from: a */
    public static final List<String> m136843a(List<String> list, MediaType mediaType) {
        C7573i.m23587b(list, "$this$getAdaptionPaths");
        C7573i.m23587b(mediaType, "type");
        return C43137g.m136832a(list, mediaType);
    }

    /* renamed from: a */
    public static final String m136842a(String str, MediaType mediaType) {
        C7573i.m23587b(str, "$this$getAdaptionPath");
        C7573i.m23587b(mediaType, "type");
        return C43138a.m136839a().mo104767b(str, mediaType);
    }

    /* renamed from: a */
    public static final String[] m136844a(String[] strArr, MediaType mediaType) {
        C7573i.m23587b(strArr, "$this$getAdaptionPaths");
        C7573i.m23587b(mediaType, "type");
        Object[] array = C43137g.m136832a(C7519g.m23418a(strArr), mediaType).toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
