package androidx.work.impl.p033a.p034a;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.NetworkType;
import androidx.work.impl.p033a.C1477b;
import androidx.work.impl.p033a.p035b.C1487g;
import androidx.work.impl.p036b.C1501g;

/* renamed from: androidx.work.impl.a.a.f */
public final class C1474f extends C1470c<C1477b> {
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo6710b(Object obj) {
        return m7379a((C1477b) obj);
    }

    public C1474f(Context context) {
        super(C1487g.m7418a(context).f5704c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6709a(C1501g gVar) {
        if (gVar.f5743j.f5657b == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m7379a(C1477b bVar) {
        if (VERSION.SDK_INT < 24) {
            if (!bVar.f5686a) {
                return true;
            }
            return false;
        } else if (!bVar.f5686a || !bVar.f5689d) {
            return true;
        } else {
            return false;
        }
    }
}
