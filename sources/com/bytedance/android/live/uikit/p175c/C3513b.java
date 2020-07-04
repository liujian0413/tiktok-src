package com.bytedance.android.live.uikit.p175c;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.android.live.uikit.c.b */
public final class C3513b extends Handler {

    /* renamed from: c */
    private static C3513b f10394c;

    /* renamed from: a */
    public boolean f10395a;

    /* renamed from: b */
    public int f10396b = 5;

    /* renamed from: d */
    private final Queue<C3511a> f10397d = new LinkedList();

    public final void dismiss() {
        C3511a aVar = (C3511a) this.f10397d.peek();
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public static synchronized C3513b m12951a() {
        synchronized (C3513b.class) {
            if (f10394c != null) {
                C3513b bVar = f10394c;
                return bVar;
            }
            C3513b bVar2 = new C3513b(Looper.getMainLooper());
            f10394c = bVar2;
            return bVar2;
        }
    }

    /* renamed from: b */
    private void m12952b() {
        while (!this.f10397d.isEmpty()) {
            C3511a aVar = (C3511a) this.f10397d.peek();
            if (aVar.mo10606g()) {
                aVar.dismiss();
                this.f10397d.poll();
            } else {
                if (!aVar.mo10601c()) {
                    Message obtain = Message.obtain();
                    obtain.what = 291;
                    obtain.obj = aVar;
                    sendMessage(obtain);
                }
                return;
            }
        }
    }

    private C3513b(Looper looper) {
        super(looper);
    }

    /* renamed from: b */
    public final void mo10609b(C3511a aVar) {
        this.f10397d.remove(aVar);
        while (this.f10397d.contains(aVar)) {
            this.f10397d.remove(aVar);
        }
    }

    public final void handleMessage(Message message) {
        C3511a aVar = (C3511a) message.obj;
        int i = message.what;
        if (i == 291) {
            m12953d(aVar);
        } else if (i != 1110) {
            if (i == 1929) {
                m12952b();
            }
        } else {
            mo10610c(aVar);
        }
    }

    /* renamed from: d */
    private void m12953d(C3511a aVar) {
        if (!aVar.mo10601c()) {
            aVar.mo10605f();
            this.f10395a = true;
            aVar.mo10593a().start();
            Message obtain = Message.obtain();
            obtain.what = 1110;
            obtain.obj = aVar;
            sendMessageDelayed(obtain, aVar.f10368b);
        }
    }

    /* renamed from: a */
    public final void mo10608a(C3511a aVar) {
        if (!this.f10397d.contains(aVar) && this.f10397d.size() <= this.f10396b) {
            this.f10397d.offer(aVar);
            if (!this.f10395a) {
                m12952b();
            }
        }
    }

    /* renamed from: c */
    public final void mo10610c(final C3511a aVar) {
        if (!aVar.mo10601c() || aVar.mo10606g()) {
            aVar.dismiss();
            this.f10395a = false;
            this.f10397d.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f10397d.contains(aVar)) {
            this.f10395a = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet b = aVar.mo10599b();
            b.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.f10370d = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    aVar.f10370d = false;
                    aVar.dismiss();
                    C3513b.this.f10395a = false;
                    C3513b.this.removeMessages(1110);
                    C3513b.this.sendEmptyMessage(1929);
                }
            });
            b.start();
            this.f10397d.poll();
        }
    }
}
