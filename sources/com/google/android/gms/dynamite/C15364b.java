package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C15358a;
import com.google.android.gms.dynamite.DynamiteModule.C15358a.C15359a;
import com.google.android.gms.dynamite.DynamiteModule.C15358a.C15360b;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;

/* renamed from: com.google.android.gms.dynamite.b */
final class C15364b implements C15358a {
    C15364b() {
    }

    /* renamed from: a */
    public final C15360b mo38719a(Context context, String str, C15359a aVar) throws LoadingException {
        C15360b bVar = new C15360b();
        bVar.f39662b = aVar.mo38721a(context, str, true);
        if (bVar.f39662b != 0) {
            bVar.f39663c = 1;
        } else {
            bVar.f39661a = aVar.mo38720a(context, str);
            if (bVar.f39661a != 0) {
                bVar.f39663c = -1;
            }
        }
        return bVar;
    }
}
