package com.p280ss.android.ugc.aweme.base;

import android.content.Context;
import android.os.Process;
import com.bytedance.apm.C6148a;
import com.bytedance.apm.p240d.C6186b.C6187a;
import com.bytedance.framwork.core.monitor.C6377a;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.q */
public class C6893q {

    /* renamed from: a */
    public static final ExecutorService f19558a;

    /* renamed from: b */
    private static final List<Runnable> f19559b = new ArrayList();

    /* renamed from: c */
    private static final ThreadFactory f19560c = new ThreadFactory() {
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }, "AwemeMonitor");
        }
    };

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH), f19560c, new DiscardOldestPolicy());
        f19558a = threadPoolExecutor;
    }

    /* renamed from: a */
    private static synchronized void m21441a() {
        synchronized (C6893q.class) {
            if (f19559b != null) {
                for (Runnable submit : f19559b) {
                    f19558a.submit(submit);
                }
                f19559b.clear();
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m21443a(Runnable runnable) {
        synchronized (C6893q.class) {
            if (C6377a.m19819a() == null) {
                f19559b.add(runnable);
            } else {
                f19558a.submit(runnable);
            }
        }
    }

    /* renamed from: b */
    public static void m21450b(Context context, C6187a aVar) {
        C6148a.m19087a(aVar.mo14909a());
        m21441a();
    }

    /* renamed from: a */
    public static void m21447a(final String str, final JSONObject jSONObject) {
        m21443a(new Runnable() {
            public final void run() {
                C6379c.m19826a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static void m21444a(String str, int i, JSONObject jSONObject) {
        C6379c.m19823a(str, i, jSONObject);
    }

    /* renamed from: b */
    public static void m21451b(final String str, final String str2, final float f) {
        m21443a(new Runnable() {
            public final void run() {
            }
        });
    }

    /* renamed from: b */
    public static void m21452b(final String str, final String str2, final JSONObject jSONObject) {
        m21443a(new Runnable() {
            public final void run() {
                try {
                    if (jSONObject != null) {
                        jSONObject.put("service", str2);
                    }
                } catch (Exception unused) {
                }
                C6379c.m19826a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static void m21446a(final String str, final String str2, final float f) {
        m21443a(new Runnable() {
            public final void run() {
                C6379c.m19825a(str, str2, f);
            }
        });
    }

    /* renamed from: a */
    public static void m21448a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C6379c.m19827a(str, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m21445a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C6379c.m19824a(str, i, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m21442a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C6379c.m19822a(j, j2, str, str2, str3, i, jSONObject);
    }

    /* renamed from: b */
    public static void m21449b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C6379c.m19830b(j, j2, str, str2, str3, i, jSONObject);
    }
}
