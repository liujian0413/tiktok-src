package com.p280ss.android.ugc.aweme.awemeservice.p1046a;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.util.Log;
import bolts.C1592h;
import com.bytedance.common.utility.p482io.C9734a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.cache.C17473b;
import com.google.common.cache.C17474c;
import com.google.common.cache.C17544k;
import com.google.common.cache.RemovalNotification;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.utils.C42954ax;
import com.p280ss.android.ugc.aweme.utils.C42954ax.C42956a;
import com.p280ss.android.ugc.aweme.utils.C42954ax.C42959c;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import java.io.Closeable;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.d */
public final class C23124d implements C23122b<String> {

    /* renamed from: a */
    private C17473b<String, Aweme> f61042a = C17474c.m58050a().mo44970a(100).mo44975a((C17544k<? super K1, ? super V1>) new C23126e<Object,Object>(this)).mo44994o();

    /* renamed from: b */
    private C42954ax f61043b;

    /* renamed from: a */
    public final Collection<Aweme> mo60233a() {
        return this.f61042a.mo44965a().values();
    }

    /* renamed from: b */
    public final void mo60235b() {
        try {
            C42973bg.m136431c(m75993a(C6399b.m19921a(), "awemeCache").getAbsolutePath());
        } catch (Exception unused) {
        }
    }

    public C23124d() {
        try {
            File a = m75993a(C6399b.m19921a(), "awemeCache");
            if (a.exists()) {
                C42973bg.m136431c(a.getAbsolutePath());
            }
            this.f61043b = C42954ax.m136348a(a, ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppVersionCode(), 1, 52428800);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m75998e(String str) {
        if (this.f61043b != null) {
            try {
                this.f61043b.mo104652c(str);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Aweme mo60237a(String str) throws Exception {
        Aweme d = m75997d(str);
        if (d != null) {
            m75998e(str);
            mo60234a(str, d);
        }
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Aweme mo60232a(String str) {
        Aweme aweme;
        try {
            aweme = (Aweme) this.f61042a.mo44964a(str, (Callable<? extends V>) new C23127f<Object>(this, str));
        } catch (Exception unused) {
            aweme = null;
        }
        if (aweme == null) {
            m76000g(str);
        }
        return aweme;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean mo60236b(String str) {
        boolean containsKey = this.f61042a.mo44965a().containsKey(str);
        if (!containsKey) {
            return m75999f(str);
        }
        return containsKey;
    }

    /* renamed from: d */
    private Aweme m75997d(String str) {
        Aweme aweme;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (this.f61043b == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(this.f61043b.mo104646a(str).mo104668a(0));
            try {
                aweme = (Aweme) objectInputStream.readObject();
                C9734a.m28682a((Closeable) objectInputStream);
            } catch (Exception unused) {
                C9734a.m28682a((Closeable) objectInputStream);
                aweme = null;
                return aweme;
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                C9734a.m28682a((Closeable) objectInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            objectInputStream = null;
            C9734a.m28682a((Closeable) objectInputStream);
            aweme = null;
            return aweme;
        } catch (Throwable th2) {
            th = th2;
            C9734a.m28682a((Closeable) objectInputStream2);
            throw th;
        }
        return aweme;
    }

    /* renamed from: f */
    private boolean m75999f(String str) {
        boolean z = false;
        if (this.f61043b == null || this.f61043b.mo104651c()) {
            return false;
        }
        try {
            C42959c a = this.f61043b.mo104646a(str);
            if (a != null) {
                z = true;
            }
            if (a != null) {
                a.close();
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: g */
    private static void m76000g(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 4096) {
                stackTraceString = stackTraceString.substring(0, 4096);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("aid", str);
            C6893q.m21447a("aweme_manager_get_aweme_is_null", jSONObject);
            C7163a.m22363a();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60238a(final RemovalNotification removalNotification) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C23124d.this.mo60239a((String) removalNotification.getKey(), (Aweme) removalNotification.getValue());
                    return null;
                }
            });
        } else {
            mo60239a((String) removalNotification.getKey(), (Aweme) removalNotification.getValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo60234a(String str, Aweme aweme) {
        this.f61042a.mo44966a(str, aweme);
    }

    /* renamed from: a */
    private static File m75993a(Context context, String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            str2 = context.getExternalCacheDir().getPath();
        } else {
            str2 = context.getCacheDir().getPath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str);
        return new File(sb.toString());
    }

    /* renamed from: a */
    public final void mo60239a(String str, Aweme aweme) {
        if (this.f61043b != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                C42956a b = this.f61043b.mo104649b(str);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(b.mo104657a(0));
                try {
                    objectOutputStream2.writeObject(aweme);
                    b.mo104658a();
                    C9734a.m28682a((Closeable) objectOutputStream2);
                } catch (Exception unused) {
                    objectOutputStream = objectOutputStream2;
                    C9734a.m28682a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    C9734a.m28682a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                C9734a.m28682a((Closeable) objectOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C9734a.m28682a((Closeable) objectOutputStream);
                throw th;
            }
        }
    }
}
