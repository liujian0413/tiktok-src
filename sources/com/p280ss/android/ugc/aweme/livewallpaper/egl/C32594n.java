package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.n */
public class C32594n implements C32587h {

    /* renamed from: a */
    protected C32597b f84980a;

    /* renamed from: b */
    private int f84981b;

    /* renamed from: c */
    private int f84982c;

    /* renamed from: d */
    private int f84983d;

    /* renamed from: e */
    private int f84984e;

    /* renamed from: f */
    private C32586g f84985f = new C32593m(0);

    /* renamed from: g */
    private ReentrantLock f84986g = new ReentrantLock();

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.n$a */
    class C32596a implements C32597b {
        private C32596a() {
        }

        /* renamed from: a */
        public final void mo83921a(C32587h hVar) {
            C32594n.this.f84980a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.n$b */
    public interface C32597b {
        /* renamed from: a */
        void mo83921a(C32587h hVar);
    }

    /* renamed from: a */
    public final int mo83895a() {
        return this.f84985f.mo83895a();
    }

    /* renamed from: d */
    public final void mo83898d() {
        this.f84986g.unlock();
    }

    /* renamed from: c */
    public final int mo83897c() {
        if (!this.f84986g.isHeldByCurrentThread()) {
            this.f84986g.lock();
            return this.f84981b;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    /* renamed from: b */
    public final int mo83896b() {
        int b = this.f84985f.mo83896b();
        if (b == 1) {
            this.f84980a.mo83921a(this);
        } else if (b <= 0) {
            StringBuilder sb = new StringBuilder("reference idx ");
            sb.append(b - 1);
            sb.append(" app abort!!");
            throw new RuntimeException(new Exception(sb.toString()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo83920e() {
        mo83897c();
        if (this.f84981b > 0) {
            C32588i.m105569a(this.f84981b);
        }
        if (this.f84982c > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f84982c}, 0);
        }
        this.f84982c = 0;
        this.f84981b = 0;
        this.f84980a = new C32596a();
        mo83898d();
    }

    public C32594n(int i, int i2, int i3, C32597b bVar) {
        this.f84981b = i;
        this.f84983d = i2;
        this.f84984e = i3;
        if (bVar == null) {
            bVar = new C32596a();
        }
        this.f84980a = bVar;
    }
}
