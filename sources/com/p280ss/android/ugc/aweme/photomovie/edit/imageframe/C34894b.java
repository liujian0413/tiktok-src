package com.p280ss.android.ugc.aweme.photomovie.edit.imageframe;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.b */
final class C34894b extends HandlerThread {

    /* renamed from: a */
    public final List<C34896a> f91022a;

    /* renamed from: b */
    public final ReadWriteLock f91023b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public final Handler f91024c;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.b$a */
    interface C34896a {
        /* renamed from: a */
        void mo88430a(Message message);
    }

    C34894b() {
        super("WorkerThread", 10);
        start();
        this.f91022a = new ArrayList(1);
        this.f91024c = new Handler(getLooper()) {
            public final void handleMessage(Message message) {
                C34894b.this.f91023b.readLock().lock();
                try {
                    for (C34896a a : C34894b.this.f91022a) {
                        a.mo88430a(message);
                    }
                } finally {
                    C34894b.this.f91023b.readLock().unlock();
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo88438a(C34896a aVar) {
        this.f91023b.writeLock().lock();
        try {
            this.f91022a.add(aVar);
        } finally {
            this.f91023b.writeLock().unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo88439b(C34896a aVar) {
        this.f91023b.writeLock().lock();
        try {
            this.f91022a.remove(aVar);
        } finally {
            this.f91023b.writeLock().unlock();
        }
    }
}
