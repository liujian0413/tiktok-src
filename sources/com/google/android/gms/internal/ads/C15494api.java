package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C14823e;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;

/* renamed from: com.google.android.gms.internal.ads.api */
public final class C15494api extends C14823e<apl> {
    public C15494api(Context context, Looper looper, C15232a aVar, C15233b bVar) {
        super(context, looper, 116, aVar, bVar, null);
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: q */
    public final apl mo39918q() throws DeadObjectException {
        return (apl) super.mo38568o();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof apl) {
            return (apl) queryLocalInterface;
        }
        return new C15495apm(iBinder);
    }
}
