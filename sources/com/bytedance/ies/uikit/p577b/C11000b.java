package com.bytedance.ies.uikit.p577b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.ies.uikit.b.b */
public final class C11000b extends Handler {

    /* renamed from: c */
    private static C11000b f29772c;

    /* renamed from: a */
    public boolean f29773a;

    /* renamed from: b */
    public int f29774b = 5;

    /* renamed from: d */
    private final Queue<C10998a> f29775d = new ConcurrentLinkedQueue();

    public final void dismiss() {
        C10998a aVar = (C10998a) this.f29775d.peek();
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public static synchronized C11000b m32244a() {
        synchronized (C11000b.class) {
            if (f29772c != null) {
                C11000b bVar = f29772c;
                return bVar;
            }
            C11000b bVar2 = new C11000b(Looper.getMainLooper());
            f29772c = bVar2;
            return bVar2;
        }
    }

    /* renamed from: b */
    private void m32245b() {
        while (!this.f29775d.isEmpty()) {
            C10998a aVar = (C10998a) this.f29775d.peek();
            if (aVar == null || !aVar.mo26568i()) {
                if (aVar != null && !aVar.mo26562d()) {
                    Message obtain = Message.obtain();
                    obtain.what = 291;
                    obtain.obj = aVar;
                    sendMessage(obtain);
                }
                return;
            }
            aVar.dismiss();
            this.f29775d.poll();
        }
    }

    private C11000b(Looper looper) {
        super(looper);
    }

    /* renamed from: b */
    public final void mo26572b(Context context) {
        for (C10998a aVar : this.f29775d) {
            if (aVar != null && aVar.f29745a == context) {
                aVar.mo26565f();
            }
        }
    }

    /* renamed from: c */
    public final void mo26574c(Context context) {
        for (C10998a aVar : this.f29775d) {
            if (aVar != null && aVar.f29745a == context) {
                aVar.mo26566g();
            }
        }
    }

    public final void handleMessage(Message message) {
        C10998a aVar = (C10998a) message.obj;
        int i = message.what;
        if (i == 291) {
            m32246d(aVar);
        } else if (i != 1110) {
            if (i == 1929) {
                m32245b();
            }
        } else {
            mo26575c(aVar);
        }
    }

    /* renamed from: d */
    private void m32246d(C10998a aVar) {
        if (!aVar.mo26562d()) {
            aVar.mo26567h();
            this.f29773a = true;
            aVar.mo26551a().start();
            Message obtain = Message.obtain();
            obtain.what = 1110;
            obtain.obj = aVar;
            sendMessageDelayed(obtain, aVar.f29746b);
        }
    }

    /* renamed from: a */
    public final void mo26570a(Context context) {
        removeMessages(1929);
        int size = this.f29775d.size();
        for (int i = 0; i < size; i++) {
            C10998a aVar = (C10998a) this.f29775d.poll();
            if (aVar != null) {
                if (aVar.f29745a == context) {
                    removeMessages(1110, aVar);
                    aVar.mo26564e();
                } else {
                    this.f29775d.add(aVar);
                }
            }
        }
        if (!this.f29775d.isEmpty()) {
            sendEmptyMessage(1929);
        }
        this.f29773a = false;
    }

    /* renamed from: a */
    public final void mo26571a(C10998a aVar) {
        if (!this.f29775d.contains(aVar) && this.f29775d.size() <= this.f29774b) {
            this.f29775d.offer(aVar);
            if (!this.f29773a) {
                sendEmptyMessage(1929);
            }
        }
    }

    /* renamed from: b */
    public final void mo26573b(C10998a aVar) {
        this.f29775d.remove(aVar);
        while (this.f29775d.contains(aVar)) {
            this.f29775d.remove(aVar);
        }
    }

    /* renamed from: c */
    public final void mo26575c(final C10998a aVar) {
        if (!aVar.mo26562d() || aVar.mo26568i()) {
            aVar.dismiss();
            this.f29773a = false;
            this.f29775d.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f29775d.contains(aVar)) {
            this.f29773a = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet b = aVar.mo26559b();
            b.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.f29748d = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    aVar.f29748d = false;
                    aVar.dismiss();
                    C11000b.this.f29773a = false;
                    C11000b.this.removeMessages(1110);
                    C11000b.this.sendEmptyMessage(1929);
                }
            });
            b.start();
            this.f29775d.poll();
        }
    }
}
