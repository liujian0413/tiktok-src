package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.SparseArray;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p715b.C13553g;
import com.facebook.imagepipeline.p716c.C13558c;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p716c.C13584o;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.medialib.jni.FrameThumb;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache */
public interface VideoCoverBitmapCache {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover */
    public static class DefaultVideoCover extends VideoCoverCacheImpl {

        /* renamed from: a */
        public SparseArray<C13326a<C13645c>> f107942a = new SparseArray<>();

        /* access modifiers changed from: 0000 */
        @C0054q(mo125a = Event.ON_DESTROY)
        public void onDestroy() {
            this.f107952f.unInitVideoToGraph();
            for (int i = 0; i < this.f107942a.size(); i++) {
                C13326a.m39001c((C13326a) this.f107942a.valueAt(i));
            }
        }

        /* renamed from: a */
        public static C13326a<C13645c> m132220a(Bitmap bitmap) {
            return C13326a.m38995a(new C13646d(bitmap, (C13329c<Bitmap>) C13553g.m39883a(), C13649g.f36269a, 0));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Runnable mo102166b(final int i, final C41509a aVar) {
            return new Runnable() {
                public final void run() {
                    int[] frameThumbnail = DefaultVideoCover.this.f107952f.getFrameThumbnail(i);
                    if (frameThumbnail != null) {
                        C13326a a = DefaultVideoCover.m132220a(Bitmap.createBitmap(frameThumbnail, DefaultVideoCover.this.f107948b, DefaultVideoCover.this.f107949c, Config.ARGB_8888));
                        final C13326a b = a.clone();
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                aVar.mo96335a(b);
                            }
                        });
                        DefaultVideoCover.this.f107942a.put(i, a);
                    }
                }
            };
        }

        /* renamed from: a */
        public final void mo102165a(int i, C41509a aVar) {
            super.mo102165a(i, aVar);
            C13326a aVar2 = (C13326a) this.f107942a.get(i);
            if (aVar2 == null || !aVar2.mo32614d()) {
                this.f107951e.execute(mo102166b(i, aVar));
                return;
            }
            aVar.mo96335a(aVar2.clone());
            C13326a.m39001c(aVar2);
        }

        DefaultVideoCover(C0043i iVar, FrameThumb frameThumb, String str, int i, int i2) {
            super(iVar, frameThumb, str, i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl */
    public static class VideoCoverCacheImpl implements C0042h, VideoCoverBitmapCache {

        /* renamed from: b */
        int f107948b;

        /* renamed from: c */
        int f107949c;

        /* renamed from: d */
        String f107950d;

        /* renamed from: e */
        Executor f107951e;

        /* renamed from: f */
        FrameThumb f107952f;

        /* access modifiers changed from: 0000 */
        @C0054q(mo125a = Event.ON_DESTROY)
        public void onDestroy() {
            if (this.f107952f != null) {
                this.f107952f.unInitVideoToGraph();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C13326a<C13645c> m132223a(Bitmap bitmap) {
            return C13326a.m38995a(new C13646d(bitmap, (C13329c<Bitmap>) C13553g.m39883a(), C13649g.f36269a, 0));
        }

        /* renamed from: a */
        private static C13326a<C13645c> m132225a(String str) {
            C13584o b = C13380c.m39171b().mo33205b();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            C13558c cVar = new C13558c(sb.toString(), null, C13597e.m40009a(), C13594b.m40003a(), null, null, null);
            return b.mo33128a(cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Runnable mo102166b(final int i, final C41509a aVar) {
            return new Runnable() {
                public final void run() {
                    int[] frameThumbnail = VideoCoverCacheImpl.this.f107952f.getFrameThumbnail(i);
                    if (frameThumbnail != null) {
                        C13326a a = VideoCoverCacheImpl.m132223a(Bitmap.createBitmap(frameThumbnail, VideoCoverCacheImpl.this.f107948b, VideoCoverCacheImpl.this.f107949c, Config.ARGB_8888));
                        final C13326a b = a.clone();
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                aVar.mo96335a(b);
                            }
                        });
                        StringBuilder sb = new StringBuilder();
                        sb.append(VideoCoverCacheImpl.this.f107950d);
                        sb.append(i);
                        VideoCoverCacheImpl.m132226a(a, sb.toString());
                    }
                }
            };
        }

        /* renamed from: a */
        public static void m132226a(C13326a<C13645c> aVar, String str) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            C13380c.m39171b().mo33205b().mo33129a(C13577j.m39966a().mo33114a(ImageRequest.fromUri(sb.toString()), null), aVar);
        }

        /* renamed from: a */
        public void mo102165a(int i, C41509a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f107950d);
            sb.append(i);
            C13326a a = m132225a(sb.toString());
            if (a != null) {
                aVar.mo96335a(a.clone());
                C13326a.m39001c(a);
                return;
            }
            this.f107951e.execute(mo102166b(i, aVar));
        }

        VideoCoverCacheImpl(C0043i iVar, FrameThumb frameThumb, String str, int i, int i2) {
            this.f107950d = str;
            this.f107948b = i;
            this.f107949c = i2;
            iVar.getLifecycle().mo55a(this);
            this.f107952f = frameThumb;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiscardOldestPolicy());
            this.f107951e = threadPoolExecutor;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$a */
    public interface C41509a {
        /* renamed from: a */
        void mo96335a(C13326a<C13645c> aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$b */
    public static class C41510b {
        /* renamed from: a */
        public static VideoCoverBitmapCache m132230a(C0043i iVar, String str, int i, int i2, int i3) {
            TENativeLibsLoader.m67986c();
            FrameThumb frameThumb = new FrameThumb();
            int[] initVideoToGraph = frameThumb.initVideoToGraph(str, i, i2);
            if (initVideoToGraph[0] != 0) {
                return null;
            }
            int i4 = initVideoToGraph[4];
            int i5 = initVideoToGraph[5];
            if (i3 >= 40) {
                VideoCoverCacheImpl videoCoverCacheImpl = new VideoCoverCacheImpl(iVar, frameThumb, str, i4, i5);
                return videoCoverCacheImpl;
            }
            DefaultVideoCover defaultVideoCover = new DefaultVideoCover(iVar, frameThumb, str, i4, i5);
            return defaultVideoCover;
        }
    }

    /* renamed from: a */
    void mo102165a(int i, C41509a aVar);
}
