package com.p280ss.android.ugc.p1716b.p1719c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.ies.net.p573a.C10920a;
import com.p280ss.android.ugc.p1716b.p1717a.C43655e;

/* renamed from: com.ss.android.ugc.b.c.a */
public final class C43661a {

    /* renamed from: a */
    public C43655e f112992a;

    /* renamed from: b */
    public boolean f112993b;

    /* renamed from: c */
    private boolean f112994c = true;

    public C43661a(C43655e eVar) {
        this.f112992a = eVar;
    }

    /* renamed from: a */
    private void m138332a(final String str) {
        new AsyncTask() {
            /* access modifiers changed from: protected */
            public final Object doInBackground(Object[] objArr) {
                try {
                    return C10920a.m32024a(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            public final void onPostExecute(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (C43661a.this.f112992a != null) {
                        C43661a.this.f112992a.mo86441a(null, str, 4, C43661a.this.f112993b);
                    }
                } else if (C43661a.this.f112992a != null) {
                    C43661a.this.f112992a.mo86436a(1);
                }
            }
        }.execute(null);
    }

    /* renamed from: a */
    public final void mo105616a(String str, boolean z) {
        this.f112993b = z;
        m138332a(str);
    }
}
