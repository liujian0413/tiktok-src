package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.lighten.core.C12091a;
import com.bytedance.lighten.core.C12102c;
import com.bytedance.lighten.core.C12126g;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12138q;
import com.bytedance.lighten.core.CacheChoice;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.CircleOptions.C12090b;
import com.bytedance.lighten.core.ImagePiplinePriority;
import com.bytedance.lighten.core.p610a.C12092a;
import com.bytedance.lighten.core.p610a.C12093b;
import com.bytedance.lighten.core.p612c.C12109g;
import com.bytedance.lighten.core.p612c.C12113k;
import com.bytedance.lighten.core.p612c.C12115m;
import com.bytedance.lighten.core.p613d.C12121b;
import com.bytedance.lighten.core.p613d.C12123c;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13350f;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.drawable.C13420o;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p718e.C13639b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.lighten.loader.p */
final class C12166p implements C12126g {

    /* renamed from: a */
    public C12102c f32402a;

    /* renamed from: b */
    private ExecutorService f32403b = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18994a("fresco-loader-io").mo18993a(2).mo18996a());

    /* renamed from: e */
    private static C13596d m35417e(C12138q qVar) {
        return new C13596d(qVar.f32281i, qVar.f32282j);
    }

    public final void trimDisk(final int i) {
        this.f32403b.submit(new Runnable() {
            public final void run() {
                switch (i) {
                    case 1:
                        C13380c.m39171b().mo33207c().mo32462b();
                        C13380c.m39171b().mo33210f().mo32462b();
                        return;
                    case 2:
                        C13380c.m39171b().mo33207c().mo32464c();
                        C13380c.m39171b().mo33210f().mo32464c();
                        break;
                }
            }
        });
    }

    /* renamed from: a */
    public static Executor m35409a(C12138q qVar) {
        C12121b a = C12121b.m35290a();
        if (qVar.f32260B != null) {
            return qVar.f32260B;
        }
        return a;
    }

    /* renamed from: h */
    private static Priority m35420h(C12138q qVar) {
        ImagePiplinePriority imagePiplinePriority = qVar.f32298z;
        if (imagePiplinePriority == ImagePiplinePriority.LOW) {
            return Priority.LOW;
        }
        if (imagePiplinePriority == ImagePiplinePriority.HIGH) {
            return Priority.HIGH;
        }
        return Priority.MEDIUM;
    }

    C12166p(C12102c cVar) {
        this.f32402a = cVar;
    }

    /* renamed from: b */
    static ImageRequest[] m35414b(C12138q qVar) {
        List<String> i = m35421i(qVar);
        ArrayList arrayList = new ArrayList();
        for (String a : i) {
            arrayList.add(m35412b(qVar, C12123c.m35293a(a)).mo33476b());
        }
        if (arrayList.size() == 0) {
            return new ImageRequest[0];
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    /* renamed from: c */
    private static void m35415c(C12138q qVar) {
        RoundingParams roundingParams;
        if (qVar.f32294v != null) {
            SmartImageView smartImageView = (SmartImageView) qVar.f32262D;
            if (smartImageView != null) {
                CircleOptions circleOptions = qVar.f32294v;
                if (((C13438a) smartImageView.getHierarchy()).f35619a != null) {
                    roundingParams = ((C13438a) smartImageView.getHierarchy()).f35619a;
                } else {
                    roundingParams = new RoundingParams();
                }
                ((C13438a) smartImageView.getHierarchy()).mo32897a(m35407a(roundingParams, circleOptions));
            }
        }
    }

    /* renamed from: f */
    private static void m35418f(C12138q qVar) {
        if (!qVar.f32267I) {
            SmartImageView smartImageView = (SmartImageView) qVar.f32262D;
            if (smartImageView != null) {
                Drawable drawable = qVar.f32291s;
                if (drawable == null) {
                    ((C13438a) smartImageView.getHierarchy()).mo32907e((Drawable) null);
                } else {
                    ((C13438a) smartImageView.getHierarchy()).mo32907e((Drawable) new C13420o(drawable, C13423b.f35599g));
                }
            }
        }
    }

    public final void display(C12138q qVar) {
        if (qVar.f32262D instanceof SmartCircleImageView) {
            ((SmartCircleImageView) qVar.f32262D).mo29858a(qVar);
        } else if (qVar.f32262D instanceof SmartImageView) {
            ((SmartImageView) qVar.f32262D).mo29858a(qVar);
        } else if (qVar.f32263E != null) {
            C12158k.m35394a(qVar.f32263E, qVar);
        } else {
            throw new IllegalArgumentException("Lighten:needs SmartImageView or ImageView to display, use with(view)");
        }
    }

    public final void trimMemory(int i) {
        if (i == 5) {
            C12176q.m35423a().mo29904a(MemoryTrimType.OnSystemLowMemoryWhileAppInForeground);
            C12143a.m35367b().mo29874a();
        } else if (i != 10) {
            if (i == 40) {
                C12176q.m35423a().mo29904a(MemoryTrimType.OnSystemLowMemoryWhileAppInBackground);
            }
        } else {
            C12176q.m35423a().mo29904a(MemoryTrimType.OnCloseToDalvikHeapLimit);
            C12143a.m35367b().mo29874a();
        }
    }

    /* renamed from: d */
    private static C13594b m35416d(C12138q qVar) {
        C13595c b = C13594b.m40004b();
        if (qVar.f32292t != null) {
            b.mo33153a(qVar.f32292t);
        }
        b.mo33154a(qVar.f32278f);
        if (qVar.f32279g >= 0) {
            b.mo33152a(qVar.f32279g);
        }
        if (qVar.f32276d != C12091a.f32189a.f32190b) {
            HashMap hashMap = new HashMap();
            hashMap.put("frame_scheduler_id", Integer.valueOf(qVar.f32276d));
            if (qVar.f32272N != null) {
                hashMap.put("frame_scheduler_listener", qVar.f32272N);
            }
            b.f36023k = hashMap;
        }
        return b.mo33151a();
    }

    /* renamed from: i */
    private static List<String> m35421i(C12138q qVar) {
        if (qVar.f32271M == null || qVar.f32271M.mo29784a()) {
            return Collections.emptyList();
        }
        if (C12133n.m35297a().f32234l == null || C12133n.m35297a().f32234l.mo29786a() == null) {
            return qVar.f32271M.f32193a;
        }
        return ((C12092a) C12133n.m35297a().f32234l.mo29786a().mo29785a(new C12093b(qVar.f32271M, qVar.f32283k, qVar.f32284l))).f32193a;
    }

    public final void download(C12138q qVar) {
        final Uri uri;
        List i = m35421i(qVar);
        if (i.isEmpty()) {
            uri = qVar.f32273a;
        } else {
            uri = Uri.parse((String) i.get(0));
        }
        final C12113k kVar = qVar.f32265G;
        if (this.f32402a.mo29799b(uri)) {
            if (kVar != null) {
                m35409a(qVar).execute(new Runnable() {
                    public final void run() {
                        C12166p.this.f32402a.mo29798a(uri);
                    }
                });
            }
            return;
        }
        ImageRequest fromUri = ImageRequest.fromUri(uri);
        C13606i d = C13622l.m40095a().mo33208d();
        if (kVar == null) {
            d.mo33185d(fromUri, null);
        } else {
            d.mo33185d(fromUri, null).mo32633a(new C13345b<Void>() {
                public final void onFailureImpl(C13346c<Void> cVar) {
                }

                public final void onNewResultImpl(C13346c<Void> cVar) {
                    if (cVar.mo32639b()) {
                        C12166p.this.f32402a.mo29798a(uri);
                    }
                }
            }, m35409a(qVar));
        }
    }

    public final void loadBitmap(C12138q qVar) {
        if (qVar.f32271M == null || qVar.f32271M.mo29784a()) {
            m35410a(C13622l.m40095a().mo33208d().mo33172a(m35408a(qVar, qVar.f32273a), (Object) null), qVar);
            return;
        }
        ImageRequest[] b = m35414b(qVar);
        if (b.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (ImageRequest imageRequest : b) {
                if (imageRequest != null) {
                    arrayList.add(C13380c.m39172c().mo33171a(imageRequest, (Object) null, RequestLevel.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty()) {
                m35410a(C13350f.m39080a(arrayList).mo29879b(), qVar);
            }
        }
    }

    /* renamed from: g */
    private static void m35419g(C12138q qVar) {
        SmartImageView smartImageView = (SmartImageView) qVar.f32262D;
        if (smartImageView != null) {
            if (qVar.f32286n > 0) {
                if (qVar.f32288p != null) {
                    ((C13438a) smartImageView.getHierarchy()).mo32891a(qVar.f32286n, C12187v.m35444a(qVar.f32288p));
                } else {
                    ((C13438a) smartImageView.getHierarchy()).mo32898b(qVar.f32286n);
                }
            } else if (qVar.f32287o != null) {
                ((C13438a) smartImageView.getHierarchy()).mo32900b(qVar.f32287o);
            }
            if (qVar.f32289q > 0) {
                if (qVar.f32290r != null) {
                    ((C13438a) smartImageView.getHierarchy()).mo32899b(qVar.f32289q, C12187v.m35444a(qVar.f32290r));
                } else {
                    ((C13438a) smartImageView.getHierarchy()).mo32902c(qVar.f32289q);
                }
            }
            if (qVar.f32293u != null) {
                ((C13438a) smartImageView.getHierarchy()).mo32896a(C12187v.m35444a(qVar.f32293u));
            }
            if (qVar.f32269K > 0) {
                if (qVar.f32270L != null) {
                    ((C13438a) smartImageView.getHierarchy()).mo32903c(qVar.f32269K, C12187v.m35444a(qVar.f32270L));
                } else {
                    ((C13438a) smartImageView.getHierarchy()).mo32905d(qVar.f32269K);
                }
            }
            if (qVar.f32285m > 0) {
                ((C13438a) smartImageView.getHierarchy()).mo32890a(qVar.f32285m);
            }
        }
    }

    /* renamed from: a */
    static ImageRequest m35408a(C12138q qVar, Uri uri) {
        return m35412b(qVar, uri).mo33476b();
    }

    /* renamed from: b */
    private static void m35413b(ImageRequestBuilder imageRequestBuilder, C12138q qVar) {
        if (qVar.f32296x != null) {
            imageRequestBuilder.mo33473a((C13842b) new C12150d(qVar.f32296x));
        }
    }

    /* renamed from: a */
    private void m35410a(final C13346c<C13326a<C13645c>> cVar, final C12138q qVar) {
        final C12115m mVar = qVar.f32266H;
        if (mVar != null) {
            cVar.mo32633a(new C13639b() {
                public final void onCancellation(C13346c<C13326a<C13645c>> cVar) {
                    if (cVar != null) {
                        cVar.mo32644g();
                        C12166p.m35409a(qVar).execute(new Runnable() {
                            public final void run() {
                                mVar.mo29803a();
                            }
                        });
                    }
                }

                public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
                    if (cVar != null) {
                        final Throwable e = cVar.mo32642e();
                        C12166p.m35409a(qVar).execute(new Runnable() {
                            public final void run() {
                                mVar.mo29817a(e);
                            }
                        });
                    }
                }

                public final void onProgressUpdate(C13346c<C13326a<C13645c>> cVar) {
                    if (cVar != null) {
                        final float f = cVar.mo32643f();
                        C12166p.m35409a(qVar).execute(new Runnable() {
                            public final void run() {
                                mVar.mo29804a(f);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo9161a(Bitmap bitmap) {
                    if (!cVar.mo32639b() || bitmap == null) {
                        C12166p.m35409a(qVar).execute(new Runnable() {
                            public final void run() {
                                mVar.mo29817a(cVar.mo32642e());
                            }
                        });
                        return;
                    }
                    Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Config.ARGB_8888;
                    }
                    final Bitmap copy = bitmap.copy(config, true);
                    cVar.mo32644g();
                    C12166p.m35409a(qVar).execute(new Runnable() {
                        public final void run() {
                            mVar.mo29816a(copy);
                        }
                    });
                }
            }, this.f32403b);
        }
    }

    /* renamed from: a */
    static RoundingParams m35407a(RoundingParams roundingParams, CircleOptions circleOptions) {
        if (circleOptions == null) {
            return roundingParams;
        }
        if (roundingParams == null) {
            roundingParams = new RoundingParams();
        }
        if (circleOptions.f32175g != null) {
            C12090b bVar = circleOptions.f32175g;
            roundingParams.mo32880a(bVar.f32185a, bVar.f32186b, bVar.f32187c, bVar.f32188d);
        }
        roundingParams.mo32884a(circleOptions.f32172d);
        roundingParams.mo32879a(circleOptions.f32173e);
        roundingParams.mo32886c(circleOptions.f32169a);
        roundingParams.mo32885b(circleOptions.f32170b);
        roundingParams.mo32881a(circleOptions.f32171c);
        roundingParams.mo32887d(circleOptions.f32174f);
        roundingParams.mo32883a(C12190x.m35446a(circleOptions.f32176h));
        return roundingParams;
    }

    /* renamed from: b */
    private static ImageRequestBuilder m35412b(C12138q qVar, Uri uri) {
        ImageRequestBuilder a = ImageRequestBuilder.m40865a(uri).mo33477b(qVar.f32280h).mo33474a(qVar.f32277e);
        if (qVar.f32261C == CacheChoice.SMALL) {
            a.mo33471a(ImageRequest.CacheChoice.SMALL);
        }
        m35413b(a, qVar);
        m35411a(a, qVar);
        m35415c(qVar);
        a.mo33467a(m35416d(qVar)).mo33465a(m35420h(qVar)).mo33474a(qVar.f32277e);
        if (qVar.f32281i > 0 || qVar.f32282j > 0) {
            a.mo33468a(m35417e(qVar));
        }
        m35418f(qVar);
        m35419g(qVar);
        return a;
    }

    /* renamed from: a */
    private static void m35411a(ImageRequestBuilder imageRequestBuilder, C12138q qVar) {
        if (qVar.f32297y != null && qVar.f32297y.f32340a != null && !qVar.f32297y.f32340a.isEmpty()) {
            imageRequestBuilder.mo33473a((C13842b) new C12153g((C12109g) qVar.f32297y.f32340a.get(0)));
        }
    }
}
