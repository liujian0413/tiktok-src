package com.ixigua.downloader;

import com.ixigua.downloader.p797a.C18466d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SyncFailedException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.ixigua.downloader.f */
public final class C18479f {
    /* renamed from: a */
    public static int m60892a(Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th instanceof SocketTimeoutException) {
            i = 14;
        } else if (th instanceof SocketException) {
            i = 15;
        } else if (th instanceof SSLPeerUnverifiedException) {
            i = 21;
        } else if (th instanceof FileNotFoundException) {
            i = 31;
        } else if (th instanceof IOException) {
            i = 24;
        } else if (th instanceof DownloadException) {
            i = ((DownloadException) th).getErrorCode();
        } else if (th instanceof SyncFailedException) {
            i = 26;
        } else {
            i = 18;
        }
        if ((i == 24 || i == 15 || i == 14) && !C18466d.m60825b(C18462a.m60789a().f50054a)) {
            return 12;
        }
        return i;
    }
}
