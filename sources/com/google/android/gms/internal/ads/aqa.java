package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class aqa {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<apz> f40904a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static apz m46891a(String str) throws GeneralSecurityException {
        Iterator it = f40904a.iterator();
        while (it.hasNext()) {
            apz apz = (apz) it.next();
            if (apz.mo39943a(str)) {
                return apz;
            }
        }
        String str2 = "No KMS client does support: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
