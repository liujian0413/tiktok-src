package com.bytedance.apm.p244g;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.apm.g.c */
public final class C6210c {
    /* renamed from: a */
    public static boolean m19286a(Throwable th) {
        if (th == null) {
            return false;
        }
        boolean z = th instanceof ConnectTimeoutException;
        if (z || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException)) {
            return true;
        }
        boolean z2 = th instanceof NoRouteToHostException;
        if (!z2 && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !z2 && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !z && !(th instanceof SSLHandshakeException)) {
            return false;
        }
        return true;
    }
}
