package com.p280ss.android.ugc.aweme.tools.policysecurity;

import android.content.Context;
import com.p280ss.android.ugc.aweme.tools.policysecurity.C42579b.C42580a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a */
public final class C42577a {

    /* renamed from: a */
    public static final C42578a f110724a = new C42578a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a$a */
    public static final class C42578a {
        private C42578a() {
        }

        public /* synthetic */ C42578a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String[] m135297a(Context context) {
            C7573i.m23587b(context, "context");
            Iterable<OriginalSoundUploadTask> a = C42580a.m135303a(context).mo104184a();
            Collection arrayList = new ArrayList(C7525m.m23469a(a, 10));
            for (OriginalSoundUploadTask originalSoundUploadTask : a) {
                arrayList.add(originalSoundUploadTask.f110722d);
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    public static final String[] m135296a(Context context) {
        return C42578a.m135297a(context);
    }
}
