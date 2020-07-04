package com.google.android.gms.maps.p764a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C15172d;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.a.x */
public class C16745x {

    /* renamed from: a */
    private static final String f46742a = "x";

    /* renamed from: b */
    private static Context f46743b;

    /* renamed from: c */
    private static C16746y f46744c;

    /* renamed from: a */
    public static C16746y m55237a(Context context) throws GooglePlayServicesNotAvailableException {
        C16746y yVar;
        C15267r.m44384a(context);
        if (f46744c != null) {
            return f46744c;
        }
        int a = C15172d.m44145a(context, C15181e.f39276b);
        if (a == 0) {
            IBinder iBinder = (IBinder) m55239a(m55240b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                yVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                yVar = queryLocalInterface instanceof C16746y ? (C16746y) queryLocalInterface : new C16747z(iBinder);
            }
            f46744c = yVar;
            try {
                f46744c.mo43361a(C15349d.m44668a(m55240b(context).getResources()), C15172d.f39247a);
                return f46744c;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(a);
        }
    }

    /* renamed from: a */
    private static <T> T m55238a(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String str = "Unable to instantiate the dynamic class ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException unused2) {
            String str2 = "Unable to call the default constructor of ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }

    /* renamed from: a */
    private static <T> T m55239a(ClassLoader classLoader, String str) {
        try {
            return m55238a(((ClassLoader) C15267r.m44384a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: b */
    private static Context m55240b(Context context) {
        if (f46743b != null) {
            return f46743b;
        }
        Context c = m55241c(context);
        f46743b = c;
        return c;
    }

    /* renamed from: c */
    private static Context m55241c(Context context) {
        try {
            return DynamiteModule.m44685a(context, DynamiteModule.f39647a, "com.google.android.gms.maps_dynamite").f39660e;
        } catch (Throwable unused) {
            return C15172d.m44147b(context);
        }
    }
}
