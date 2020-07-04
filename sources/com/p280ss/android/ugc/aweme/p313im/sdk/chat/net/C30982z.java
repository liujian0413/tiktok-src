package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.common.utility.p482io.FileUtils;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31883ay.C31884a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31885az;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.z */
public class C30982z extends C30926ac implements C30981y {

    /* renamed from: a */
    private static int f81104a;

    /* renamed from: b */
    public String f81105b;

    /* renamed from: c */
    private C31885az f81106c;

    /* renamed from: d */
    private C30981y f81107d;

    public int hashCode() {
        return this.f81000f.hashCode();
    }

    /* renamed from: a */
    public final void mo18257a() {
        if (this.f81107d != null) {
            this.f81107d.mo18257a();
        }
        mo81276e();
    }

    /* renamed from: b */
    private boolean mo81307b() {
        if (this.f81106c == null) {
            mo18261a((Throwable) new IllegalStateException("uploader is null"));
            return false;
        }
        this.f81106c.mo82728a((C31884a) this);
        if (FileUtils.m28679c(this.f81105b)) {
            return true;
        }
        mo18261a((Throwable) new RuntimeException("compress failed"));
        return false;
    }

    public void run() {
        if (mo81307b()) {
            try {
                C31885az azVar = this.f81106c;
                String str = this.f81105b;
                StringBuilder sb = new StringBuilder();
                sb.append(C7075h.f19903b);
                sb.append("upload/image/");
                String a = azVar.mo82727a(str, sb.toString());
                if (a == null) {
                    mo18261a((Throwable) new RuntimeException("response null"));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    boolean has = jSONObject.has("status_code");
                    int i = -1;
                    if (has) {
                        i = jSONObject.optInt("status_code");
                    }
                    if (!has || i != 0) {
                        mo18261a((Throwable) new ApiServerException(i).setErrorMsg(jSONObject.toString()));
                        return;
                    }
                    UrlModel urlModel = (UrlModel) C31913m.m103667a(jSONObject.getString("data"), UrlModel.class);
                    if (!(urlModel == null || urlModel.getUrlList() == null)) {
                        if (!urlModel.getUrlList().isEmpty()) {
                            mo81308b(this.f81105b, urlModel);
                            return;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Code=");
                    sb2.append(i);
                    sb2.append(" Response=");
                    sb2.append(jSONObject.toString());
                    mo18261a((Throwable) new RuntimeException(sb2.toString()));
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

    /* renamed from: a */
    public void mo18259a(String str) {
        mo81276e();
        m100806a((Object) str, true);
    }

    public C30982z(OkHttpClient okHttpClient) {
        this.f81106c = new C31885az(okHttpClient, 0);
        f81104a++;
        this.f81000f = String.valueOf(f81104a);
    }

    /* renamed from: a */
    public final void mo18258a(double d) {
        if (this.f81107d != null) {
            this.f81107d.mo18258a(d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30982z) || this.f81105b == null) {
            return false;
        }
        return this.f81000f.equals(((C30982z) obj).f81000f);
    }

    /* renamed from: a */
    public final void mo81371a(C30981y yVar) {
        this.f81107d = yVar;
        if (this.f81106c != null) {
            this.f81106c.mo82728a((C31884a) this);
        }
    }

    /* renamed from: a */
    public void mo18261a(Throwable th) {
        if (this.f81107d != null) {
            this.f81107d.mo18261a(th);
        }
        mo81276e();
        m100806a((Object) th, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo81308b(String str, UrlModel urlModel) {
        mo18260a(str, urlModel);
    }

    /* renamed from: a */
    private static void m100806a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "PhotoUploadItem");
        if (obj != null) {
            if (z) {
                hashMap.put("error", obj);
            } else {
                hashMap.put("success", obj);
            }
        }
        C7074e.m22065a("message_upload_image", hashMap);
        if (z) {
            C7074e.m22070b("message_upload_image_error", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo18260a(String str, UrlModel urlModel) {
        if (this.f81107d != null) {
            this.f81107d.mo18260a(str, urlModel);
        }
        mo81276e();
        m100806a((Object) str, false);
    }
}
