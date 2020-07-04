package com.bytedance.sdk.account.bdplatform.p657c;

import com.bytedance.sdk.account.bdplatform.p655a.C12755b;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.sdk.account.bdplatform.c.a */
public final class C12765a {
    /* renamed from: a */
    public static int m37077a(C12755b bVar, Throwable th) {
        int i = -21;
        if (th instanceof ConnectTimeoutException) {
            i = -13;
        } else if (th instanceof SocketTimeoutException) {
            i = -14;
        } else {
            if (!(th instanceof SocketException)) {
                if (!(th instanceof SSLPeerUnverifiedException)) {
                    if (!(th instanceof IOException)) {
                        if (!(th instanceof SSLHandshakeException)) {
                            i = th instanceof UnknownHostException ? -16 : -1;
                        }
                    }
                }
            }
            i = -15;
        }
        if ((i == -15 || i == -14) && bVar != null && !bVar.mo31274b()) {
            return -12;
        }
        return i;
    }
}
