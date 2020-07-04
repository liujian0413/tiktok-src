package com.p280ss.android.ugc.aweme.lancet.network;

import java.net.URLConnection;

/* renamed from: com.ss.android.ugc.aweme.lancet.network.e */
public final class C7118e {
    /* renamed from: a */
    public static boolean m22232a(URLConnection uRLConnection) {
        if (uRLConnection == null || uRLConnection.getClass().getSimpleName().contains("Cronet")) {
            return false;
        }
        return true;
    }
}
