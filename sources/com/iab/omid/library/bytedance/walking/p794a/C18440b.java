package com.iab.omid.library.bytedance.walking.p794a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.walking.a.b */
public abstract class C18440b extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    public C18441a f49997d;

    /* renamed from: e */
    protected final C18442b f49998e;

    /* renamed from: com.iab.omid.library.bytedance.walking.a.b$a */
    public interface C18441a {
        /* renamed from: a */
        void mo47884a(C18440b bVar);
    }

    /* renamed from: com.iab.omid.library.bytedance.walking.a.b$b */
    public interface C18442b {
        /* renamed from: a */
        JSONObject mo47885a();

        /* renamed from: a */
        void mo47886a(JSONObject jSONObject);
    }

    public C18440b(C18442b bVar) {
        this.f49998e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (this.f49997d != null) {
            this.f49997d.mo47884a(this);
        }
    }

    /* renamed from: a */
    public final void mo47882a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
