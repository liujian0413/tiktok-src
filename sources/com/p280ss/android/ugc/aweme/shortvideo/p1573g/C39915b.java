package com.p280ss.android.ugc.aweme.shortvideo.p1573g;

import android.app.ActivityManager;
import android.graphics.drawable.BitmapDrawable;
import android.support.p022v4.util.C0894f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.g.b */
public final class C39915b {

    /* renamed from: a */
    private static final C39915b f103686a = new C39915b();

    /* renamed from: b */
    private final C0894f<String, BitmapDrawable> f103687b;

    /* renamed from: c */
    private final ReadWriteLock f103688c = new ReentrantReadWriteLock();

    /* renamed from: a */
    public static C39915b m127686a() {
        return f103686a;
    }

    private C39915b() {
        long memoryClass = (long) (((((ActivityManager) C6399b.m19921a().getSystemService("activity")).getMemoryClass() * PreloadTask.BYTE_UNIT_NUMBER) * PreloadTask.BYTE_UNIT_NUMBER) / 4);
        if (memoryClass <= 0) {
            memoryClass = 1;
        }
        this.f103687b = new C0894f<String, BitmapDrawable>((int) memoryClass) {
            /* renamed from: a */
            private static int m127689a(String str, BitmapDrawable bitmapDrawable) {
                return bitmapDrawable.getBitmap().getByteCount();
            }

            /* renamed from: b */
            public final /* synthetic */ int mo3346b(Object obj, Object obj2) {
                return m127689a((String) obj, (BitmapDrawable) obj2);
            }
        };
    }

    /* renamed from: a */
    public final BitmapDrawable mo99321a(String str) {
        try {
            this.f103688c.readLock().lock();
            return (BitmapDrawable) this.f103687b.mo3341a(str);
        } finally {
            this.f103688c.readLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo99322a(String str, BitmapDrawable bitmapDrawable) {
        try {
            this.f103688c.writeLock().lock();
            this.f103687b.mo3342a(str, bitmapDrawable);
        } finally {
            this.f103688c.writeLock().unlock();
        }
    }
}
