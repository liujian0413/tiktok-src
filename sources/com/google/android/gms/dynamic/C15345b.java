package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p761c.C16356a;
import com.google.android.gms.internal.p761c.C16357b;

/* renamed from: com.google.android.gms.dynamic.b */
public interface C15345b extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.b$a */
    public static abstract class C15346a extends C16357b implements C15345b {

        /* renamed from: com.google.android.gms.dynamic.b$a$a */
        public static class C15347a extends C16356a implements C15345b {
            C15347a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C15346a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C15345b m44656a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C15345b) {
                return (C15345b) queryLocalInterface;
            }
            return new C15347a(iBinder);
        }
    }
}
