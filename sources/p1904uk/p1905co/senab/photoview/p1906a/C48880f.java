package p1904uk.p1905co.senab.photoview.p1906a;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: uk.co.senab.photoview.a.f */
public final class C48880f {
    /* renamed from: a */
    public static C48878d m150832a(Context context, C48879e eVar) {
        C48878d dVar;
        int i = VERSION.SDK_INT;
        if (i < 5) {
            dVar = new C48874a(context);
        } else if (i < 8) {
            dVar = new C48875b(context);
        } else {
            dVar = new C48876c(context);
        }
        dVar.mo123670a(eVar);
        return dVar;
    }
}
