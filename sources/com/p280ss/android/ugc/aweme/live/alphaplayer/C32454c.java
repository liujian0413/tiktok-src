package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.view.Surface;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1360a.C32446a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1361b.C32449b;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c */
public interface C32454c<T extends C32454c> {

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c$a */
    public static class C32455a {
        /* renamed from: a */
        public static C32454c m105172a() {
            return new C32449b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c$b */
    public interface C32456b<T> {
        /* renamed from: a */
        void mo83696a(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c$c */
    public interface C32457c<T> {
        /* renamed from: a */
        void mo83699a(T t, int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c$d */
    public interface C32458d<T> {
        /* renamed from: a */
        void mo83695a(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c$e */
    public interface C32459e<T> {
        /* renamed from: a */
        void mo83698a(T t);
    }

    /* renamed from: a */
    void mo21067a(Surface surface);

    /* renamed from: a */
    void mo83703a(C32456b<T> bVar);

    /* renamed from: a */
    void mo83704a(C32457c<T> cVar);

    /* renamed from: a */
    void mo83705a(C32458d<T> dVar);

    /* renamed from: a */
    void mo83706a(C32459e<T> eVar);

    /* renamed from: a */
    void mo21068a(String str) throws IOException;

    /* renamed from: a */
    void mo21069a(boolean z);

    /* renamed from: b */
    void mo21070b();

    /* renamed from: b */
    void mo21071b(boolean z);

    /* renamed from: c */
    void mo21072c();

    /* renamed from: d */
    void mo21073d();

    /* renamed from: e */
    void mo21074e();

    /* renamed from: f */
    void mo21075f();

    /* renamed from: g */
    void mo21076g();

    /* renamed from: h */
    C32446a mo21077h() throws Exception;

    /* renamed from: i */
    String mo21078i();
}
