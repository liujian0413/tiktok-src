package com.p280ss.android.ugc.aweme.app.download.config;

import android.text.TextUtils;
import com.C1642a;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* renamed from: com.ss.android.ugc.aweme.app.download.config.e */
public final class C22966e implements C20347f {

    /* renamed from: a */
    IDownloadApi f60732a;

    /* renamed from: a */
    private static String m75557a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C1642a.m8034a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final C20346e mo20815a(int i, String str, List<HttpHeader> list) throws IOException {
        String str2;
        if (!C19929d.m65759a(str)) {
            return null;
        }
        if (this.f60732a == null) {
            this.f60732a = (IDownloadApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str).create(IDownloadApi.class);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                String str3 = httpHeader.f54980a;
                if (TextUtils.equals(httpHeader.f54980a, "User-Agent")) {
                    str2 = m75557a(httpHeader.f54981b);
                } else {
                    str2 = httpHeader.f54981b;
                }
                arrayList.add(new C12461b(str3, str2));
            }
        }
        final C12466b bVar = this.f60732a.get(str, arrayList);
        try {
            final C12534t execute = bVar.execute();
            if (execute.f33302b != null) {
                final InputStream in = ((TypedInput) execute.f33302b).mo10444in();
                List<C12461b> b = execute.mo30511b();
                if (b != null) {
                    String str4 = null;
                    for (C12461b bVar2 : b) {
                        if (bVar2.f33095a.equals("Content-Encoding")) {
                            str4 = bVar2.f33096b;
                        }
                    }
                    if (str4 != null && "gzip".equalsIgnoreCase(str4) && !(in instanceof GZIPInputStream)) {
                        in = new GZIPInputStream(in);
                    }
                }
                return new C20346e() {
                    /* renamed from: a */
                    public final InputStream mo20816a() throws IOException {
                        return in;
                    }

                    /* renamed from: b */
                    public final int mo20818b() throws IOException {
                        return execute.mo30510a();
                    }

                    /* renamed from: c */
                    public final void mo20819c() {
                        if (bVar != null) {
                            bVar.cancel();
                        }
                    }

                    /* renamed from: d */
                    public final void mo20820d() {
                        try {
                            if (bVar != null) {
                                bVar.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    /* renamed from: a */
                    public final String mo20817a(String str) {
                        List<C12461b> b = execute.mo30511b();
                        if (b != null) {
                            for (C12461b bVar : b) {
                                if (bVar.f33095a.equals(str)) {
                                    return bVar.f33096b;
                                }
                            }
                        }
                        return null;
                    }
                };
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
