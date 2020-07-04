package android.support.p022v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: android.support.v4.view.c */
public final class C0961c {

    /* renamed from: a */
    LayoutInflater f3350a;

    /* renamed from: b */
    Handler f3351b;

    /* renamed from: c */
    C0965c f3352c;

    /* renamed from: d */
    private Callback f3353d = new Callback() {
        public final boolean handleMessage(Message message) {
            C0964b bVar = (C0964b) message.obj;
            if (bVar.f3359d == null) {
                bVar.f3359d = C0961c.this.f3350a.inflate(bVar.f3358c, bVar.f3357b, false);
            }
            bVar.f3360e.onInflateFinished(bVar.f3359d, bVar.f3358c, bVar.f3357b);
            C0961c.this.f3352c.mo3745a(bVar);
            return true;
        }
    };

    /* renamed from: android.support.v4.view.c$a */
    static class C0963a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f3355a = {"android.widget.", "android.webkit.", "android.app."};

        C0963a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new C0963a(context);
        }

        /* access modifiers changed from: protected */
        public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = f3355a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: android.support.v4.view.c$b */
    static class C0964b {

        /* renamed from: a */
        C0961c f3356a;

        /* renamed from: b */
        ViewGroup f3357b;

        /* renamed from: c */
        int f3358c;

        /* renamed from: d */
        View f3359d;

        /* renamed from: e */
        C0966d f3360e;

        C0964b() {
        }
    }

    /* renamed from: android.support.v4.view.c$c */
    static class C0965c extends Thread {

        /* renamed from: a */
        private static final C0965c f3361a;

        /* renamed from: b */
        private ArrayBlockingQueue<C0964b> f3362b = new ArrayBlockingQueue<>(10);

        /* renamed from: c */
        private SynchronizedPool<C0964b> f3363c = new SynchronizedPool<>(10);

        /* renamed from: a */
        public static C0965c m4087a() {
            return f3361a;
        }

        public final void run() {
            while (true) {
                m4088c();
            }
        }

        static {
            C0965c cVar = new C0965c();
            f3361a = cVar;
            cVar.start();
        }

        /* renamed from: b */
        public final C0964b mo3746b() {
            C0964b bVar = (C0964b) this.f3363c.acquire();
            if (bVar == null) {
                return new C0964b();
            }
            return bVar;
        }

        private C0965c() {
        }

        /* renamed from: c */
        private void m4088c() {
            try {
                C0964b bVar = (C0964b) this.f3362b.take();
                try {
                    bVar.f3359d = bVar.f3356a.f3350a.inflate(bVar.f3358c, bVar.f3357b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(bVar.f3356a.f3351b, 0, bVar).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        /* renamed from: a */
        public final void mo3745a(C0964b bVar) {
            bVar.f3360e = null;
            bVar.f3356a = null;
            bVar.f3357b = null;
            bVar.f3358c = 0;
            bVar.f3359d = null;
            this.f3363c.release(bVar);
        }

        /* renamed from: b */
        public final void mo3747b(C0964b bVar) {
            try {
                this.f3362b.put(bVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }
    }

    /* renamed from: android.support.v4.view.c$d */
    public interface C0966d {
        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    public C0961c(Context context) {
        this.f3350a = new C0963a(context);
        this.f3351b = new Handler(this.f3353d);
        this.f3352c = C0965c.m4087a();
    }

    /* renamed from: a */
    public final void mo3741a(int i, ViewGroup viewGroup, C0966d dVar) {
        C0964b b = this.f3352c.mo3746b();
        b.f3356a = this;
        b.f3358c = i;
        b.f3357b = viewGroup;
        b.f3360e = dVar;
        this.f3352c.mo3747b(b);
    }
}
