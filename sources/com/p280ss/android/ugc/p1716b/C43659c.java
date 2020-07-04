package com.p280ss.android.ugc.p1716b;

import android.content.Context;
import com.p280ss.android.ugc.iesdownload.IesDownLoadConfigProvider;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.b.c */
public class C43659c {

    /* renamed from: f */
    public static int f112985f = 30000;

    /* renamed from: g */
    private static C43659c f112986g;

    /* renamed from: a */
    public C43660a f112987a;

    /* renamed from: b */
    public C43660a f112988b;

    /* renamed from: c */
    public Context f112989c;

    /* renamed from: d */
    public OkHttpClient f112990d;

    /* renamed from: e */
    public boolean f112991e = true;

    /* renamed from: com.ss.android.ugc.b.c$a */
    public interface C43660a {
        /* renamed from: a */
        String mo83624a();
    }

    /* renamed from: b */
    public final String mo105614b() {
        return this.f112987a.mo83624a();
    }

    /* renamed from: c */
    public final String mo105615c() {
        return this.f112988b.mo83624a();
    }

    /* renamed from: a */
    public static C43659c m138324a() {
        if (f112986g == null) {
            synchronized (C43659c.class) {
                if (f112986g == null) {
                    f112986g = new C43659c();
                }
            }
        }
        return f112986g;
    }

    /* renamed from: a */
    public final C43659c mo105611a(boolean z) {
        this.f112991e = false;
        return this;
    }

    /* renamed from: a */
    private void m138325a(Context context) {
        IesDownLoadConfigProvider.getInstance().setContext(context);
        if (this.f112990d != null) {
            IesDownLoadConfigProvider.getInstance().setOkHttpClient(this.f112990d);
        }
    }

    /* renamed from: a */
    public final String mo105612a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f112987a.mo83624a());
        sb.append(C43650a.m138300b(str));
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo105613a(Context context, C43660a aVar, C43660a aVar2) {
        this.f112989c = context;
        m138325a(context);
        this.f112987a = aVar2;
        this.f112988b = aVar;
    }
}
