package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.C18253l;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: a */
    public Context f5620a;

    /* renamed from: b */
    public volatile boolean f5621b;

    /* renamed from: c */
    public boolean f5622c;

    /* renamed from: d */
    private WorkerParameters f5623d;

    public enum Result {
        SUCCESS,
        FAILURE,
        RETRY
    }

    /* renamed from: androidx.work.ListenableWorker$a */
    public static final class C1448a {

        /* renamed from: a */
        public Result f5624a;

        /* renamed from: b */
        public C1458e f5625b;

        public C1448a(Result result) {
            this(result, C1458e.f5672a);
        }

        public C1448a(Result result, C1458e eVar) {
            this.f5624a = result;
            this.f5625b = eVar;
        }
    }

    /* renamed from: c */
    public abstract C18253l<C1448a> mo6667c();

    /* renamed from: e */
    public void mo6669e() {
    }

    /* renamed from: f */
    public final void mo6670f() {
        this.f5622c = true;
    }

    /* renamed from: a */
    public final UUID mo6665a() {
        return this.f5623d.f5633a;
    }

    /* renamed from: b */
    public final C1458e mo6666b() {
        return this.f5623d.f5634b;
    }

    /* renamed from: d */
    public final void mo6668d() {
        this.f5621b = true;
        mo6669e();
    }

    /* renamed from: g */
    public final Executor mo6671g() {
        return this.f5623d.f5637e;
    }

    /* renamed from: h */
    public final C1577j mo6672h() {
        return this.f5623d.f5639g;
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f5620a = context;
            this.f5623d = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }
}
