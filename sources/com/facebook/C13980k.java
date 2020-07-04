package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.C1642a;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.k */
public class C13980k extends AsyncTask<Void, Void, List<GraphResponse>> {

    /* renamed from: c */
    private static final String f36964c = C13980k.class.getCanonicalName();

    /* renamed from: a */
    public final C14064l f36965a;

    /* renamed from: b */
    public Exception f36966b;

    /* renamed from: d */
    private final HttpURLConnection f36967d;

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (C13499h.m39717c()) {
            C1642a.m8034a("execute async task: %s", new Object[]{this});
        }
        if (this.f36965a.f37142a == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f36965a.f37142a = handler;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.f36967d);
        sb.append(", requests: ");
        sb.append(this.f36965a);
        sb.append("}");
        return sb.toString();
    }

    public C13980k(C14064l lVar) {
        this(null, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<GraphResponse> doInBackground(Void... voidArr) {
        try {
            if (this.f36967d == null) {
                return this.f36965a.mo33710a();
            }
            return GraphRequest.m38258a(this.f36967d, this.f36965a);
        } catch (Exception e) {
            this.f36966b = e;
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onPostExecute(List<GraphResponse> list) {
        super.onPostExecute(list);
        if (this.f36966b != null) {
            C1642a.m8034a("onPostExecute: exception encountered during request: %s", new Object[]{this.f36966b.getMessage()});
        }
    }

    private C13980k(HttpURLConnection httpURLConnection, C14064l lVar) {
        this.f36965a = lVar;
        this.f36967d = null;
    }
}
