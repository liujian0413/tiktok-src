package androidx.work.impl.p033a.p034a;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.NetworkType;
import androidx.work.impl.p033a.C1477b;
import androidx.work.impl.p033a.p035b.C1487g;
import androidx.work.impl.p036b.C1501g;

/* renamed from: androidx.work.impl.a.a.e */
public final class C1473e extends C1470c<C1477b> {
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo6710b(Object obj) {
        return m7376a((C1477b) obj);
    }

    public C1473e(Context context) {
        super(C1487g.m7418a(context).f5704c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6709a(C1501g gVar) {
        if (gVar.f5743j.f5657b == NetworkType.METERED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m7376a(C1477b bVar) {
        if (VERSION.SDK_INT < 26) {
            if (!bVar.f5686a) {
                return true;
            }
            return false;
        } else if (!bVar.f5686a || !bVar.f5688c) {
            return true;
        } else {
            return false;
        }
    }
}
