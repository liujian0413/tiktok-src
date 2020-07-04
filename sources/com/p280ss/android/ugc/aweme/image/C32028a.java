package com.p280ss.android.ugc.aweme.image;

import com.bytedance.frameworks.baselib.network.http.retrofit.C10180c;
import com.bytedance.lighten.core.p612c.C12114l;
import com.facebook.net.C14134d;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.image.a */
public abstract class C32028a implements C12114l {

    /* renamed from: a */
    protected Executor f83783a;

    /* renamed from: b */
    public C32043j f83784b;

    /* renamed from: c */
    public C14134d f83785c;

    /* renamed from: d */
    protected C32044k f83786d;

    public C32028a() {
        this(new C10180c());
        this.f83786d = new C32044k();
    }

    private C32028a(Executor executor) {
        this.f83783a = executor;
    }

    /* renamed from: a */
    protected static String m104004a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
