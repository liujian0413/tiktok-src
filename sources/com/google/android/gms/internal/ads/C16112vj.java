package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.vj */
public final class C16112vj {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m52278b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        int b = DynamiteModule.m44690b(context, ModuleDescriptor.MODULE_ID);
        return b != 0 && b <= DynamiteModule.m44682a(context, ModuleDescriptor.MODULE_ID);
    }
}
