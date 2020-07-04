package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.gms.internal.ads.gr */
public abstract class C15716gr implements C15960ps {
    /* renamed from: a */
    public abstract C15932or mo41636a(bqk<?> bqk, Map<String, String> map) throws IOException, zza;

    /* renamed from: b */
    public final HttpResponse mo41645b(bqk<?> bqk, Map<String, String> map) throws IOException, zza {
        C15932or a = mo41636a(bqk, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.f44829a, ""));
        ArrayList arrayList = new ArrayList();
        for (bky bky : a.mo41814a()) {
            arrayList.add(new BasicHeader(bky.f42430a, bky.f42431b));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStream = a.f44831c;
        if (inputStream != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStream);
            basicHttpEntity.setContentLength((long) a.f44830b);
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
