package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker.C1448a;
import androidx.work.ListenableWorker.Result;
import androidx.work.impl.utils.p038a.C1564c;
import com.google.common.util.concurrent.C18253l;

public abstract class Worker extends ListenableWorker {

    /* renamed from: d */
    C1564c<C1448a> f5630d;

    /* renamed from: e */
    public volatile C1458e f5631e = C1458e.f5672a;

    /* renamed from: i */
    public abstract Result mo6677i();

    /* renamed from: c */
    public final C18253l<C1448a> mo6667c() {
        this.f5630d = C1564c.m7648a();
        mo6671g().execute(new Runnable() {
            public final void run() {
                Worker.this.f5630d.mo6820a(new C1448a(Worker.this.mo6677i(), Worker.this.f5631e));
            }
        });
        return this.f5630d;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
