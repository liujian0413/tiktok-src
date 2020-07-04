package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31883ay.C31884a;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.az */
public final class C31885az {

    /* renamed from: a */
    private OkHttpClient f83355a;

    /* renamed from: b */
    private C31884a f83356b;

    /* renamed from: c */
    private C31883ay f83357c;

    /* renamed from: d */
    private int f83358d;

    /* renamed from: b */
    private void m103590b(String str) {
        if (this.f83356b != null) {
            this.f83356b.mo18261a((Throwable) new IllegalArgumentException(str));
        }
    }

    /* renamed from: c */
    private static String m103592c(String str) {
        return URI.create(str).getHost();
    }

    /* renamed from: a */
    public final void mo82728a(C31884a aVar) {
        this.f83356b = aVar;
        if (this.f83357c != null) {
            this.f83357c.f83353a = aVar;
        }
    }

    /* renamed from: a */
    private File m103586a(String str) {
        File file = new File(str);
        if (file.exists() && file.length() != 0) {
            return file;
        }
        m103590b("file not exists");
        return null;
    }

    /* renamed from: a */
    private MultipartTypedOutput m103585a(File file) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        String a = C6306c.m19560a(file);
        multipartTypedOutput.addPart("file", new C31921v(null, file, this.f83356b));
        if (a == null) {
            a = "";
        }
        multipartTypedOutput.addPart("md5", new TypedString(a));
        if (this.f83358d == 1) {
            multipartTypedOutput.addPart("file_type", new TypedString("mpeg"));
        }
        return multipartTypedOutput;
    }

    /* renamed from: b */
    private RequestBody m103588b(File file) {
        MultipartBuilder multipartBuilder = new MultipartBuilder();
        this.f83357c = new C31883ay(file, this.f83356b);
        multipartBuilder.addFormDataPart("file", file.getName(), this.f83357c);
        String a = C6306c.m19560a(file);
        String str = "md5";
        if (a == null) {
            a = "";
        }
        multipartBuilder.addFormDataPart(str, a);
        if (this.f83358d == 1) {
            multipartBuilder.addFormDataPart("file_type", "mpeg");
        }
        return multipartBuilder.build();
    }

    public C31885az(OkHttpClient okHttpClient, int i) {
        this.f83355a = okHttpClient;
        this.f83358d = i;
    }

    /* renamed from: a */
    private String m103587a(String str, File file) throws IOException {
        Response response;
        try {
            response = this.f83355a.newCall(m103591c(str, file)).execute();
        } catch (Exception unused) {
            response = null;
        }
        if (response == null) {
            return null;
        }
        try {
            return response.body().string();
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: b */
    private String m103589b(String str, File file) throws IOException {
        C12534t tVar;
        try {
            tVar = ((IUploaderApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C7075h.f19903b).mo26431b(false).mo26432c(false).mo26429a(true).mo26430a().mo26435a(IUploaderApi.class)).upload(str, m103592c(str), m103585a(file)).execute();
        } catch (Exception unused) {
            tVar = null;
        }
        if (tVar == null) {
            return null;
        }
        return (String) tVar.f33302b;
    }

    /* renamed from: c */
    private Request m103591c(String str, File file) {
        Request build = new Builder().url(str).post(m103588b(file)).addHeader("Host", m103592c(str)).build();
        if (this.f83355a == null) {
            this.f83355a = new OkHttpClient();
        }
        this.f83355a.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
        this.f83355a.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
        this.f83355a.setReadTimeout(60000, TimeUnit.MILLISECONDS);
        this.f83355a.setRetryOnConnectionFailure(true);
        return build;
    }

    /* renamed from: a */
    public final String mo82727a(String str, String str2) throws IOException {
        if (!C31888ba.m103599a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.bna).mo25750a();
            m103590b("network is unavailable");
            return null;
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            m103590b("file or url invalid");
            return null;
        } else {
            File a = m103586a(str);
            if (a == null) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        C9738o.m28693a(C6399b.m19921a(), (int) R.string.bo1);
                    }
                });
                m103590b("file is null");
                return null;
            }
            try {
                if (C30199h.m98861a().getImUseOkhttpclient().getUploaderUseOkhttpclient().booleanValue()) {
                    return m103587a(str2, a);
                }
                return m103589b(str2, a);
            } catch (NullValueException unused) {
                return m103589b(str2, a);
            }
        }
    }
}
