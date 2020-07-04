package com.p280ss.android.ugc.aweme.p1216fe.base;

import android.arch.lifecycle.C0042h;
import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.p280ss.android.sdk.webview.C20136d;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25836e;
import com.p280ss.android.ugc.aweme.framework.C29959e;
import com.p280ss.android.ugc.aweme.framework.bridge.C29953a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27868c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod */
public abstract class BaseCommonJavaMethod implements C0042h, C11093e, C29953a {

    /* renamed from: e */
    protected WeakReference<ReactContext> f73442e;

    /* renamed from: f */
    public WeakReference<Context> f73443f;

    /* renamed from: g */
    protected WeakReference<C20136d> f73444g;

    /* renamed from: h */
    protected C11087a f73445h;

    /* renamed from: com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a */
    public interface C27876a {
        /* renamed from: a */
        void mo71362a(int i, String str);

        /* renamed from: a */
        void mo71363a(Object obj);

        /* renamed from: a */
        void mo71364a(Object obj, int i, String str);

        /* renamed from: a */
        void mo71365a(JSONObject jSONObject);
    }

    public BaseCommonJavaMethod() {
    }

    /* renamed from: a */
    public abstract void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException;

    /* renamed from: c */
    private C20136d mo71374c() {
        if (this.f73444g != null) {
            return (C20136d) this.f73444g.get();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbsActivityContainer mo71356a() {
        C20136d c = mo71374c();
        if (c != null) {
            return (AbsActivityContainer) c.mo53896a(AbsActivityContainer.class);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C30388i mo71361b() {
        C20136d c = mo71374c();
        if (c != null) {
            return (C30388i) c.mo53896a(C30388i.class);
        }
        return null;
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo71358a(WeakReference<ReactContext> weakReference) {
        this.f73442e = weakReference;
        return this;
    }

    /* renamed from: b */
    public BaseCommonJavaMethod mo71360b(WeakReference<Context> weakReference) {
        this.f73443f = weakReference;
        return this;
    }

    public BaseCommonJavaMethod(C11087a aVar) {
        this.f73445h = aVar;
    }

    public BaseCommonJavaMethod(ReactContext reactContext) {
        this.f73442e = new WeakReference<>(reactContext);
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo71357a(C20136d dVar) {
        if (dVar != null) {
            this.f73444g = new WeakReference<>(dVar);
        }
        return this;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) {
        try {
            C25836e.m84972a().mo67156b();
            JSONObject jSONObject2 = iVar.f30171d;
            if (jSONObject2 != null) {
                jSONObject2.put("func", iVar.f30170c);
            }
            final String str = iVar.f30169b;
            iVar.f30173f = false;
            mo64209a(jSONObject2, new C27876a() {
                /* renamed from: a */
                public final void mo71365a(JSONObject jSONObject) {
                    if (BaseCommonJavaMethod.this.f73445h != null) {
                        BaseCommonJavaMethod.this.f73445h.mo27030a(str, jSONObject);
                    }
                }

                /* renamed from: a */
                public final void mo71363a(Object obj) {
                    if (BaseCommonJavaMethod.this.f73445h != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 1);
                            jSONObject.put("data", obj);
                        } catch (JSONException unused) {
                        }
                        BaseCommonJavaMethod.this.f73445h.mo27030a(str, jSONObject);
                    }
                }

                /* renamed from: a */
                public final void mo71362a(int i, String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                    } catch (JSONException unused) {
                    }
                    BaseCommonJavaMethod.this.f73445h.mo27030a(str, jSONObject);
                }

                /* renamed from: a */
                public final void mo71364a(Object obj, int i, String str) {
                    if (BaseCommonJavaMethod.this.f73445h != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", i);
                            jSONObject.put("msg", str);
                            jSONObject.put("data", obj);
                        } catch (JSONException unused) {
                        }
                        BaseCommonJavaMethod.this.f73445h.mo27030a(str, jSONObject);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo67335a(String str, ReadableMap readableMap, final Callback callback) {
        try {
            JSONObject a = C27868c.m91296a(readableMap);
            a.put("func", str);
            mo64209a(a, new C27876a() {
                /* renamed from: a */
                public final void mo71363a(Object obj) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", 1);
                        jSONObject.put("data", obj);
                        callback.invoke(C27868c.m91294a(jSONObject));
                    } catch (JSONException unused) {
                    }
                }

                /* renamed from: a */
                public final void mo71365a(JSONObject jSONObject) {
                    try {
                        callback.invoke(C27868c.m91294a(jSONObject));
                    } catch (JSONException unused) {
                    }
                }

                /* renamed from: a */
                public final void mo71362a(int i, String str) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                        callback.invoke(C27868c.m91294a(jSONObject));
                    } catch (JSONException unused) {
                    }
                }

                /* renamed from: a */
                public final void mo71364a(Object obj, int i, String str) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                        jSONObject.put("data", obj);
                        callback.invoke(C27868c.m91294a(jSONObject));
                    } catch (JSONException unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo71359a(String str, JSONObject jSONObject, int i) {
        if (i == 2 || i == 3) {
            try {
                if (!(this.f73442e == null || this.f73442e.get() == null)) {
                    C29959e.m98228a((ReactContext) this.f73442e.get(), str, C27868c.m91294a(jSONObject));
                }
            } catch (JSONException unused) {
            }
        }
        if ((i == 1 || i == 3) && this.f73445h != null) {
            this.f73445h.mo27034b(str, jSONObject);
        }
    }
}
