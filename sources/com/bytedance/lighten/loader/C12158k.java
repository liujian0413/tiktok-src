package com.bytedance.lighten.loader;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.bytedance.lighten.core.C12138q;
import com.bytedance.lighten.core.p613d.C12118a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.drawee.view.C13445b;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.bytedance.lighten.loader.k */
final class C12158k {

    /* renamed from: com.bytedance.lighten.loader.k$a */
    static class C12159a implements OnAttachStateChangeListener, OnTouchListener {

        /* renamed from: a */
        C13445b<C13387b> f32394a;

        public C12159a(C13445b<C13387b> bVar) {
            this.f32394a = bVar;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f32394a != null) {
                this.f32394a.mo32934b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f32394a != null) {
                this.f32394a.mo32935c();
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f32394a == null || !this.f32394a.mo32933a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m35395a(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static C13438a m35396b(ImageView imageView, C12138q qVar) {
        if (imageView == null || qVar == null) {
            return null;
        }
        RoundingParams roundingParams = new RoundingParams();
        if (qVar.f32294v != null) {
            roundingParams = C12166p.m35407a(roundingParams, qVar.f32294v);
        }
        C13439b a = new C13439b(imageView.getResources()).mo32926e(qVar.f32291s).mo32915a(roundingParams);
        if (qVar.f32293u != null) {
            a.mo32927e(C12187v.m35444a(qVar.f32293u));
        }
        if (qVar.f32286n > 0) {
            a.mo32917b(qVar.f32286n);
            if (qVar.f32288p != null) {
                a.mo32914a(C12187v.m35444a(qVar.f32288p));
            }
        } else if (qVar.f32287o != null) {
            a.mo32913a(qVar.f32287o);
        }
        if (qVar.f32289q > 0) {
            a.mo32923d(qVar.f32289q);
            if (qVar.f32290r != null) {
                a.mo32922c(C12187v.m35444a(qVar.f32290r));
            }
        }
        if (qVar.f32269K > 0) {
            a.mo32920c(qVar.f32269K);
            if (qVar.f32270L != null) {
                a.mo32919b(C12187v.m35444a(qVar.f32270L));
            }
        }
        if (qVar.f32285m > 0) {
            a.mo32910a(qVar.f32285m);
        }
        return a.mo32908a();
    }

    /* renamed from: a */
    static void m35394a(ImageView imageView, C12138q qVar) {
        C13445b bVar;
        if (imageView != null && qVar != null) {
            Object a = C12118a.m35284a(imageView);
            ImageRequest[] imageRequestArr = null;
            if (a instanceof C13445b) {
                bVar = (C13445b) a;
            } else {
                bVar = null;
            }
            C12149c cVar = new C12149c();
            cVar.mo29880a(qVar);
            boolean z = true;
            if (bVar == null) {
                bVar = C13445b.m39493a(null, imageView.getContext());
                C12159a aVar = new C12159a(bVar);
                bVar.mo32932a(m35396b(imageView, qVar));
                if (qVar.f32271M != null && !qVar.f32271M.mo29784a()) {
                    imageRequestArr = C12166p.m35414b(qVar);
                } else if (qVar.f32273a != null) {
                    imageRequestArr = new ImageRequest[]{C12166p.m35408a(qVar, qVar.f32273a)};
                }
                if (imageRequestArr != null && imageRequestArr.length != 0) {
                    C13382e eVar = (C13382e) ((C13382e) ((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32751c(qVar.f32275c)).mo32743a((C13401d<? super INFO>) cVar)).mo32729b(bVar.f35652b)).mo32746a((REQUEST[]) imageRequestArr)).mo32749b(false);
                    if (qVar.f32269K <= 0) {
                        z = false;
                    }
                    bVar.mo32931a((C13386a) ((C13382e) eVar.mo32745a(z)).mo32730f());
                    if (m35395a(imageView)) {
                        aVar.onViewAttachedToWindow(imageView);
                    }
                    imageView.addOnAttachStateChangeListener(aVar);
                    imageView.setOnTouchListener(aVar);
                    C12118a.m35286a((View) imageView, (Object) bVar);
                } else {
                    return;
                }
            } else {
                bVar.mo32935c();
                bVar.mo32932a(m35396b(imageView, qVar));
                if (qVar.f32271M != null && !qVar.f32271M.mo29784a()) {
                    imageRequestArr = C12166p.m35414b(qVar);
                } else if (qVar.f32273a != null) {
                    imageRequestArr = new ImageRequest[]{C12166p.m35408a(qVar, qVar.f32273a)};
                }
                if (imageRequestArr != null && imageRequestArr.length != 0) {
                    C13382e eVar2 = (C13382e) ((C13382e) ((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32751c(qVar.f32275c)).mo32743a((C13401d<? super INFO>) cVar)).mo32746a((REQUEST[]) imageRequestArr)).mo32729b(bVar.f35652b)).mo32749b(false);
                    if (qVar.f32269K <= 0) {
                        z = false;
                    }
                    bVar.mo32931a((C13386a) ((C13382e) eVar2.mo32745a(z)).mo32730f());
                    bVar.mo32934b();
                } else {
                    return;
                }
            }
            imageView.setImageDrawable(bVar.mo32938f());
        }
    }
}
