package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C6505uv
public final class afn {
    /* renamed from: a */
    public static <T> T m45786a(Context context, String str, afo<IBinder, T> afo) throws zzbgx {
        try {
            return afo.mo39284a(m45787b(context).mo38718a(str));
        } catch (Exception e) {
            throw new zzbgx(e);
        }
    }

    /* renamed from: b */
    public static <T> T m45788b(Context context, String str, afo<IBinder, T> afo) throws zzbgx {
        try {
            return afo.mo39284a(m45789c(context).mo38718a(str));
        } catch (Exception e) {
            throw new zzbgx(e);
        }
    }

    /* renamed from: a */
    public static Context m45785a(Context context) throws zzbgx {
        return m45787b(context).f39660e;
    }

    /* renamed from: b */
    private static DynamiteModule m45787b(Context context) throws zzbgx {
        try {
            return DynamiteModule.m44685a(context, DynamiteModule.f39647a, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzbgx(e);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m45789c(Context context) throws zzbgx {
        try {
            return DynamiteModule.m44685a(context, DynamiteModule.f39650d, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzbgx(e);
        }
    }
}
