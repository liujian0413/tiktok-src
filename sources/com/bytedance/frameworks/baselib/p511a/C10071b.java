package com.bytedance.frameworks.baselib.p511a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.List;

/* renamed from: com.bytedance.frameworks.baselib.a.b */
public abstract class C10071b {

    /* renamed from: b */
    public String f27405b;

    /* renamed from: c */
    public C10073b f27406c;

    /* renamed from: d */
    protected C10079e f27407d;

    /* renamed from: e */
    public String f27408e;

    /* renamed from: f */
    public C10074c f27409f;

    /* renamed from: g */
    public long f27410g;

    /* renamed from: h */
    public long f27411h;

    /* renamed from: com.bytedance.frameworks.baselib.a.b$a */
    public static abstract class C10072a implements C10073b {
        /* renamed from: c */
        public int mo23967c() {
            return 4;
        }

        /* renamed from: d */
        public long mo23968d() {
            return C40413c.f105051b;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.b$b */
    public interface C10073b {
        /* renamed from: a */
        String mo23965a();

        /* renamed from: b */
        List<String> mo23966b();

        /* renamed from: c */
        int mo23967c();

        /* renamed from: d */
        long mo23968d();
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.b$c */
    public interface C10074c {
        /* renamed from: a */
        boolean mo23969a();

        /* renamed from: b */
        long mo23970b();

        /* renamed from: c */
        boolean mo23971c();

        /* renamed from: d */
        long mo23972d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23973a(String str, byte[] bArr);

    /* renamed from: a */
    private boolean m29924a(byte[] bArr) {
        return this.f27407d.mo24730a(this.f27405b, bArr);
    }

    /* renamed from: a */
    public final boolean mo24727a(String str) {
        return m29924a(C10076d.m29939a(str));
    }

    public C10071b(Context context, C10073b bVar, C10074c cVar) {
        this.f27406c = bVar;
        this.f27409f = cVar;
        if (this.f27406c == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (this.f27409f != null) {
            this.f27405b = bVar.mo23965a();
            if (!TextUtils.isEmpty(this.f27405b)) {
                this.f27407d = C10079e.m29942a(context);
                this.f27407d.mo24729a(this.f27405b, this);
                return;
            }
            throw new IllegalArgumentException("type is empty.");
        } else {
            throw new IllegalArgumentException("responseConfig is null");
        }
    }
}
