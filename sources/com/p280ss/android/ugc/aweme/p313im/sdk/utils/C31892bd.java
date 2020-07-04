package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$drawable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bd */
public final class C31892bd {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bd$a */
    static final class C31894a {

        /* renamed from: a */
        public RemoteImageView f83362a;

        /* renamed from: b */
        public C31922w f83363b;

        /* renamed from: c */
        public boolean f83364c = true;

        /* renamed from: d */
        C13401d<C13648f> f83365d = new C13400c<C13648f>() {

            /* renamed from: a */
            boolean f83374a;

            /* renamed from: a */
            private void m103620a() {
                if (C31894a.this.f83362a.getController() != null && this.f83374a) {
                    Animatable j = C31894a.this.f83362a.getController().mo32721j();
                    if (j != null && !j.isRunning() && C31894a.this.f83364c) {
                        j.start();
                    }
                }
            }

            public final void onRelease(String str) {
                super.onRelease(str);
                this.f83374a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                super.onIntermediateImageSet(str, fVar);
                this.f83374a = false;
            }

            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (C31894a.this.f83363b != null) {
                    C31894a.this.f83363b.mo81513b();
                }
                C31894a.this.mo82734a();
                this.f83374a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (animatable != null) {
                    this.f83374a = true;
                    m103620a();
                    if (C31894a.this.f83363b != null) {
                        C31894a.this.f83363b.mo81512a();
                    }
                } else {
                    this.f83374a = false;
                }
            }
        };

        /* renamed from: e */
        private int f83366e;

        /* renamed from: f */
        private UrlModel f83367f;

        /* renamed from: g */
        private ImageRequest[] f83368g;

        /* renamed from: h */
        private C13386a f83369h;

        /* renamed from: i */
        private int f83370i;

        /* renamed from: j */
        private int f83371j;

        /* renamed from: k */
        private C13382e f83372k;

        /* renamed from: l */
        private boolean f83373l = true;

        /* renamed from: a */
        public final void mo82734a() {
            List urlList = this.f83367f.getUrlList();
            int i = this.f83366e;
            this.f83366e = i + 1;
            String a = C31892bd.m103608a(urlList, i);
            if (!TextUtils.isEmpty(a)) {
                ImageRequest[] a2 = m103616a(a);
                if (this.f83372k == null) {
                    this.f83372k = (C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(this.f83362a.getController())).mo32746a((REQUEST[]) a2)).mo32743a(this.f83365d);
                }
                this.f83372k.mo32746a((REQUEST[]) a2);
                if (this.f83369h == null) {
                    this.f83369h = this.f83372k.mo32730f();
                }
                this.f83362a.setController(this.f83369h);
            } else if (this.f83373l) {
                int a3 = C29961b.m98232a(this.f83362a.getContext(), 90.0f);
                LayoutParams layoutParams = this.f83362a.getLayoutParams();
                layoutParams.width = a3;
                layoutParams.height = a3;
                this.f83362a.setLayoutParams(layoutParams);
                if (this.f83363b == null) {
                    C23323e.m76504a(this.f83362a, AppImageUri.m76615a(R$drawable.im_emoji_download_fail));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C31894a mo82733a(boolean z) {
            this.f83373l = z;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C31894a mo82735b(boolean z) {
            this.f83364c = z;
            return this;
        }

        /* renamed from: a */
        private ImageRequest[] m103616a(String str) {
            if (this.f83368g == null) {
                C13595c cVar = new C13595c();
                cVar.mo33153a(Config.ARGB_8888);
                cVar.mo33152a(1);
                cVar.mo33154a(false);
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33467a(new C13594b(cVar));
                if (this.f83371j > 0 && this.f83370i > 0) {
                    a.mo33468a(new C13596d(this.f83370i, this.f83371j));
                }
                this.f83368g = new ImageRequest[]{a.mo33476b()};
            }
            return this.f83368g;
        }

        public C31894a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C31922w wVar) {
            this.f83362a = remoteImageView;
            this.f83367f = urlModel;
            this.f83370i = i;
            this.f83371j = i2;
            this.f83363b = wVar;
        }
    }

    /* renamed from: a */
    public static GestureDetector m103607a(Context context) {
        return new GestureDetector(context, new SimpleOnGestureListener() {
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                return true;
            }

            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    /* renamed from: b */
    public static void m103615b(RemoteImageView remoteImageView, UrlModel urlModel) {
        m103614a(remoteImageView, urlModel, true);
    }

    /* renamed from: a */
    public static String m103608a(List<String> list, int i) {
        if (!C6307b.m19566a((Collection<T>) list) && i < list.size()) {
            return (String) list.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public static void m103609a(RemoteImageView remoteImageView, UrlModel urlModel) {
        if (remoteImageView != null && urlModel != null) {
            if (!C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
                C23323e.m76524b(remoteImageView, urlModel);
                return;
            }
            if (!TextUtils.isEmpty(urlModel.getUri())) {
                C23323e.m76514a(remoteImageView, urlModel.getUri());
            }
        }
    }

    /* renamed from: a */
    public static void m103613a(RemoteImageView remoteImageView, UrlModel urlModel, C31922w wVar) {
        m103611a(remoteImageView, urlModel, 0, 0, wVar, true, true);
    }

    /* renamed from: a */
    public static void m103614a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        m103611a(remoteImageView, urlModel, 0, 0, null, z, true);
    }

    /* renamed from: a */
    public static void m103610a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m103611a(remoteImageView, urlModel, i, i2, null, true, true);
    }

    /* renamed from: a */
    public static void m103612a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, boolean z) {
        m103611a(remoteImageView, urlModel, i, i2, null, true, false);
    }

    /* renamed from: a */
    private static void m103611a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C31922w wVar, boolean z, boolean z2) {
        if (!C6307b.m19566a((Collection<T>) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            C31894a aVar = new C31894a(remoteImageView, urlModel, i, i2, wVar);
            aVar.mo82733a(z2).mo82735b(z).mo82734a();
        }
    }
}
