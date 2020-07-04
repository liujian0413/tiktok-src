package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.p685b.C13279c;
import com.facebook.common.p685b.C13285i;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.animated.base.C13538a;
import com.facebook.imagepipeline.animated.base.C13543f;
import com.facebook.imagepipeline.animated.p712a.C13519a;
import com.facebook.imagepipeline.animated.p712a.C13522d;
import com.facebook.imagepipeline.animated.p712a.C13523e;
import com.facebook.imagepipeline.animated.p713b.C13528a;
import com.facebook.imagepipeline.animated.p713b.C13529b;
import com.facebook.imagepipeline.animated.p714c.C13545a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13570h;
import com.facebook.imagepipeline.p717d.C13604g;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p720g.C13650h;

public class AnimatedFactoryV2Impl implements C13519a {
    public static int sAnimationCachingStrategy = 1;
    private C13529b mAnimatedDrawableBackendProvider;
    private C13642a mAnimatedDrawableFactory;
    private C13545a mAnimatedDrawableUtil;
    private C13522d mAnimatedImageFactory;
    private final C13570h<C13265a, C13645c> mBackingCache;
    private final C13604g mExecutorSupplier;
    private final C13551f mPlatformBitmapFactory;

    private C13522d buildAnimatedImageFactory() {
        return new C13523e(new C13529b() {
            /* renamed from: a */
            public final C13538a mo33043a(C13543f fVar, Rect rect) {
                return new C13528a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), fVar, rect);
            }
        }, this.mPlatformBitmapFactory);
    }

    private C13529b getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new C13529b() {
                /* renamed from: a */
                public final C13538a mo33043a(C13543f fVar, Rect rect) {
                    return new C13528a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), fVar, rect);
                }
            };
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public C13545a getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new C13545a();
        }
        return this.mAnimatedDrawableUtil;
    }

    public C13522d getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    private C13496a createDrawableFactory() {
        C134923 r7 = new C13310j<Integer>() {
            /* renamed from: a */
            private static Integer m39683a() {
                return Integer.valueOf(AnimatedFactoryV2Impl.sAnimationCachingStrategy);
            }

            /* renamed from: b */
            public final /* synthetic */ Object mo29879b() {
                return m39683a();
            }
        };
        C13496a aVar = new C13496a(getAnimatedDrawableBackendProvider(), C13285i.m38830b(), new C13279c(this.mExecutorSupplier.mo33166c()), RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, r7, new C13310j<Integer>() {
            /* renamed from: a */
            private static Integer m39685a() {
                return Integer.valueOf(3);
            }

            /* renamed from: b */
            public final /* synthetic */ Object mo29879b() {
                return m39685a();
            }
        });
        return aVar;
    }

    public static void setAnimationCachingStrategy(int i) {
        sAnimationCachingStrategy = i;
    }

    public C13629b getGifDecoder(final Config config) {
        return new C13629b() {
            /* renamed from: a */
            public final C13645c mo33042a(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().mo33057a(eVar, bVar, config);
            }
        };
    }

    public C13629b getWebPDecoder(final Config config) {
        return new C13629b() {
            /* renamed from: a */
            public final C13645c mo33042a(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().mo33058b(eVar, bVar, config);
            }
        };
    }

    public C13642a getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    public AnimatedFactoryV2Impl(C13551f fVar, C13604g gVar, C13570h<C13265a, C13645c> hVar) {
        this.mPlatformBitmapFactory = fVar;
        this.mExecutorSupplier = gVar;
        this.mBackingCache = hVar;
    }
}
