package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.fr */
final class C15689fr extends C15716gr {

    /* renamed from: a */
    private final C15960ps f44438a;

    C15689fr(C15960ps psVar) {
        this.f44438a = psVar;
    }

    /* renamed from: a */
    public final C15932or mo41636a(bqk<?> bqk, Map<String, String> map) throws IOException, zza {
        try {
            HttpResponse b = this.f44438a.mo41645b(bqk, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new bky(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new C15932or(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C15932or(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
