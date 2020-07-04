package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.app.download.p1030a.C22931e;
import com.p280ss.android.ugc.aweme.app.download.p1030a.C22932f;
import com.p280ss.android.ugc.aweme.framework.C29959e;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27868c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod */
public class JsAppDownloadMethod extends BaseCommonJavaMethod implements C22932f {

    /* renamed from: a */
    private C22931e f73475a;

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        if (this.f73475a != null) {
            this.f73475a.mo59922a();
        }
    }

    /* renamed from: c */
    private void m91367c() {
        if (this.f73475a == null) {
            this.f73475a = C22931e.m75476a((Context) this.f73443f.get(), (C22932f) this);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.f73475a != null && this.f73443f != null && this.f73443f.get() != null) {
            this.f73475a.mo59926b();
            this.f73475a = null;
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (this.f73475a != null && this.f73443f != null && this.f73443f.get() != null) {
            this.f73475a.mo59923a((Context) this.f73443f.get());
        }
    }

    public JsAppDownloadMethod(C11087a aVar) {
        super(aVar);
    }

    public JsAppDownloadMethod(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    public final BaseCommonJavaMethod mo71360b(WeakReference<Context> weakReference) {
        Context context = (Context) weakReference.get();
        if (context instanceof C0043i) {
            ((C0043i) context).getLifecycle().mo55a(this);
        }
        return super.mo71360b(weakReference);
    }

    /* renamed from: a */
    public final void mo59932a(String str, JSONObject jSONObject) {
        if (this.f73445h != null) {
            this.f73445h.mo27034b(str, jSONObject);
        }
        if (this.f73442e != null) {
            try {
                C29959e.m98228a((ReactContext) this.f73442e.get(), str, C27868c.m91294a(jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (this.f73443f != null && this.f73443f.get() != null) {
            m91367c();
            String optString = jSONObject.optString("func");
            if (TextUtils.equals("subscribe_app_ad", optString)) {
                this.f73475a.mo59924a((Context) this.f73443f.get(), jSONObject);
                return;
            }
            if (TextUtils.equals("unsubscribe_app_ad", optString)) {
                if (this.f73475a != null) {
                    this.f73475a.mo59925a(jSONObject);
                }
            } else if (TextUtils.equals("download_app_ad", optString)) {
                if (this.f73475a != null) {
                    this.f73475a.mo59927b((Context) this.f73443f.get(), jSONObject);
                }
            } else if (TextUtils.equals("cancel_download_app_ad", optString)) {
                if (this.f73475a != null) {
                    this.f73475a.mo59928b(jSONObject);
                }
            } else if (TextUtils.equals("get_download_pause_task", optString)) {
                if (this.f73475a != null) {
                    this.f73475a.mo59929c();
                }
            } else if (TextUtils.equals("get_downloading_task", optString)) {
                if (this.f73475a != null) {
                    this.f73475a.mo59931d();
                }
            } else if (TextUtils.equals("get_install_status", optString) && this.f73475a != null) {
                this.f73475a.mo59930c(jSONObject);
            }
        }
    }
}
