package com.p280ss.android.ugc.aweme.awemeservice.p1046a;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.util.Log;
import bolts.C1592h;
import com.bytedance.common.utility.p482io.C9734a;
import com.bytedance.common.utility.reflect.C6320a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.cache.C17473b;
import com.google.common.cache.C17474c;
import com.google.common.cache.C17544k;
import com.google.common.cache.RemovalNotification;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
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
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.g */
public final class C23128g implements C23122b<String> {

    /* renamed from: a */
    private C17473b<String, Aweme> f61049a = C17474c.m58050a().mo44970a(100).mo44975a((C17544k<? super K1, ? super V1>) new C23130h<Object,Object>(this)).mo44994o();

    /* renamed from: b */
    private C17473b<String, Aweme> f61050b = C17474c.m58050a().mo44988i().mo44970a(200).mo44975a((C17544k<? super K1, ? super V1>) new C23131i<Object,Object>(this)).mo44994o();

    /* renamed from: c */
    private C42954ax f61051c;

    /* renamed from: d */
    private Map<String, Object> f61052d;

    /* renamed from: a */
    public final Collection<Aweme> mo60233a() {
        return this.f61049a.mo44965a().values();
    }

    /* renamed from: b */
    public final void mo60235b() {
        try {
            C42973bg.m136431c(m76011a(C6399b.m19921a(), "awemeCache").getAbsolutePath());
        } catch (Exception unused) {
        }
    }

    public C23128g() {
        try {
            File a = m76011a(C6399b.m19921a(), "awemeCache");
            if (a.exists()) {
                C42973bg.m136431c(a.getAbsolutePath());
            }
            this.f61051c = C42954ax.m136348a(a, ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppVersionCode(), 1, 52428800);
            this.f61052d = (Map) C6320a.m19599a((Object) this.f61051c, "lruEntries");
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean mo60236b(String str) {
        try {
            if (this.f61049a.mo44963a(str) == null && this.f61050b.mo44963a(str) == null && !m76016d(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60242a(RemovalNotification removalNotification) {
        if (removalNotification.getValue() != null) {
            m76015c((String) removalNotification.getKey(), (Aweme) removalNotification.getValue());
        }
    }

    /* renamed from: c */
    private Aweme m76014c(String str) {
        Aweme aweme;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (this.f61051c == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(this.f61051c.mo104646a(str).mo104668a(0));
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

    /* renamed from: e */
    private static void m76017e(String str) {
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Aweme mo60232a(String str) {
        Aweme aweme = (Aweme) this.f61049a.mo44963a(str);
        if (aweme == null) {
            aweme = (Aweme) this.f61050b.mo44963a(str);
            if (aweme != null) {
                mo60234a(str, aweme);
                this.f61050b.mo44967b(str);
            }
        }
        if (aweme == null) {
            aweme = m76014c(str);
            if (aweme != null) {
                mo60234a(str, aweme);
            }
            StringBuilder sb = new StringBuilder("get Aweme from diskCache， awemeId = ");
            sb.append(str);
            C6921a.m21552a(4, "AwemeLruCache", sb.toString());
        }
        if (aweme == null) {
            m76017e(str);
        }
        return aweme;
    }

    /* renamed from: d */
    private boolean m76016d(String str) {
        boolean z = false;
        if (this.f61051c == null || this.f61051c.mo104651c()) {
            return false;
        }
        if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isContainsKeyWithLruEntries()) {
            try {
                C42959c a = this.f61051c.mo104646a(str);
                if (a != null) {
                    z = true;
                }
                if (a != null) {
                    a.close();
                }
            } catch (Exception unused) {
            }
            return z;
        } else if (this.f61052d == null) {
            return false;
        } else {
            Object obj = this.f61052d.get(str);
            if (obj == null) {
                return false;
            }
            return ((Boolean) C6320a.m19599a(obj, "readable")).booleanValue();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo60244b(RemovalNotification removalNotification) {
        this.f61050b.mo44966a((String) removalNotification.getKey(), (Aweme) removalNotification.getValue());
        m76015c((String) removalNotification.getKey(), (Aweme) removalNotification.getValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo60234a(String str, Aweme aweme) {
        this.f61049a.mo44966a(str, aweme);
    }

    /* renamed from: c */
    private void m76015c(final String str, final Aweme aweme) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C23128g.this.mo60243a(str, aweme);
                    return null;
                }
            });
        } else {
            mo60243a(str, aweme);
        }
    }

    /* renamed from: a */
    private static File m76011a(Context context, String str) {
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
    public final void mo60243a(String str, Aweme aweme) {
        if (this.f61051c != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                C42956a b = this.f61051c.mo104649b(str);
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
