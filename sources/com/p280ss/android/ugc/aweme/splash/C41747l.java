package com.p280ss.android.ugc.aweme.splash;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p702a.C13461b;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.fresco.animation.p707c.C13485b;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.p817ad.splash.C19141h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.util.C42880h;

/* renamed from: com.ss.android.ugc.aweme.splash.l */
public final class C41747l {

    /* renamed from: com.ss.android.ugc.aweme.splash.l$a */
    public static class C41750a extends C13461b {

        /* renamed from: b */
        private int f108640b;

        /* renamed from: e */
        public final int mo32996e() {
            return this.f108640b;
        }

        public C41750a(C13460a aVar, int i) {
            super(aVar);
            this.f108640b = i;
        }
    }

    /* renamed from: a */
    public static Drawable m132941a(Context context, String str, final C19141h hVar) {
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        C13396a c = ((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32748b(ImageRequestBuilder.m40865a(Uri.parse(sb.toString())).mo33476b())).mo32743a((C13401d<? super INFO>) new C13400c<C13648f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (animatable != null) {
                    try {
                        C13480a aVar = (C13480a) animatable;
                        aVar.mo33016a((C13460a) new C41750a(aVar.f35749a, 1));
                        aVar.mo33017a((C13485b) new C13485b() {
                            /* renamed from: a */
                            public final void mo33033a(C13480a aVar) {
                            }

                            /* renamed from: a */
                            public final void mo33034a(C13480a aVar, int i) {
                            }

                            /* renamed from: c */
                            public final void mo33036c(C13480a aVar) {
                            }

                            /* renamed from: b */
                            public final void mo33035b(C13480a aVar) {
                                hVar.mo50428a();
                            }
                        });
                        animatable.start();
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                        sb.append(th.toString());
                        C42880h.m136156a(sb.toString());
                        C6921a.m21559a(th);
                    }
                }
            }
        })).mo32751c(false)).mo32730f();
        C13445b a = C13445b.m39493a(new C13439b(context.getResources()).mo32908a(), context);
        a.mo32931a((C13386a) c);
        return a.mo32938f();
    }
}
