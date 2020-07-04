package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.common.utility.p482io.FileUtils;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31883ay.C31884a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31885az;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.n */
public class C30942n extends C30926ac implements C30941m {

    /* renamed from: b */
    private static int f81027b;

    /* renamed from: a */
    public String f81028a;

    /* renamed from: c */
    private C31885az f81029c;

    /* renamed from: d */
    private C30941m f81030d;

    public int hashCode() {
        return this.f81000f.hashCode();
    }

    /* renamed from: a */
    public final void mo18257a() {
        if (this.f81030d != null) {
            this.f81030d.mo18257a();
        }
        mo81276e();
    }

    public void run() {
        if (m100713b(this.f81028a)) {
            try {
                C31885az azVar = this.f81029c;
                String str = this.f81028a;
                StringBuilder sb = new StringBuilder();
                sb.append(C7075h.f19903b);
                sb.append("upload/file/");
                try {
                    JSONObject jSONObject = new JSONObject(azVar.mo82727a(str, sb.toString()));
                    int i = -1;
                    if (jSONObject.has("status_code")) {
                        i = jSONObject.optInt("status_code");
                    }
                    if (i == 0) {
                        String string = jSONObject.getString("data");
                        UrlModel urlModel = (UrlModel) C31913m.m103667a(string, UrlModel.class);
                        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                            StringBuilder sb2 = new StringBuilder(" audio upload success, url is null, data : ");
                            sb2.append(string);
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder("log_message_audio_error");
                            sb4.append(sb3);
                            C6921a.m21555a(sb4.toString());
                        }
                        mo81299a(this.f81028a, urlModel);
                        mo18257a();
                        return;
                    }
                    mo18259a(jSONObject.toString());
                } catch (JSONException e) {
                    mo18261a((Throwable) e);
                } catch (Exception e2) {
                    mo18261a((Throwable) e2);
                }
            } catch (IOException e3) {
                mo18261a((Throwable) e3);
            }
        }
    }

    public C30942n(OkHttpClient okHttpClient) {
        this.f81029c = new C31885az(okHttpClient, 1);
        f81027b++;
        this.f81000f = String.valueOf(f81027b);
    }

    /* renamed from: a */
    public final void mo18258a(double d) {
        if (this.f81030d != null) {
            this.f81030d.mo18258a(d);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30942n) || this.f81028a == null) {
            return false;
        }
        return this.f81000f.equals(((C30942n) obj).f81000f);
    }

    /* renamed from: b */
    private boolean m100713b(String str) {
        if (this.f81029c == null) {
            mo18261a((Throwable) new IllegalStateException("uploader is null"));
            return false;
        }
        this.f81029c.mo82728a((C31884a) this);
        if (FileUtils.m28679c(str)) {
            return true;
        }
        mo18261a((Throwable) new IllegalStateException(" file not exist"));
        return false;
    }

    /* renamed from: a */
    public void mo18259a(String str) {
        if (this.f81030d != null) {
            this.f81030d.mo18259a(str);
        }
        mo81276e();
    }

    /* renamed from: a */
    public void mo18261a(Throwable th) {
        if (this.f81030d != null) {
            this.f81030d.mo18261a(th);
        }
        mo81276e();
    }

    /* renamed from: a */
    public void mo81299a(String str, UrlModel urlModel) {
        if (this.f81030d != null) {
            this.f81030d.mo81299a(str, urlModel);
        }
        mo81276e();
    }
}
