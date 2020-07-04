package com.p280ss.android.ugc.aweme.base.utils;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.bizactivity.AnimateDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.c */
public final class C23474c {

    /* renamed from: com.ss.android.ugc.aweme.base.utils.c$a */
    public static final class C23475a {

        /* renamed from: a */
        public int f61944a = R.drawable.yz;

        /* renamed from: b */
        public RemoteImageView f61945b;

        /* renamed from: c */
        C13401d<C13648f> f61946c = new C13400c<C13648f>() {

            /* renamed from: a */
            boolean f61956a;

            /* renamed from: a */
            private void m77078a() {
                if (C23475a.this.f61945b.getController() != null && C23475a.this.f61945b.getVisibility() == 0 && this.f61956a) {
                    Animatable j = C23475a.this.f61945b.getController().mo32721j();
                    if (j != null && !j.isRunning()) {
                        j.start();
                    }
                }
            }

            public final void onRelease(String str) {
                super.onRelease(str);
                this.f61956a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                super.onIntermediateImageSet(str, fVar);
                this.f61956a = false;
            }

            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                C23475a.this.mo61089a();
                this.f61956a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (animatable != null) {
                    this.f61956a = true;
                    m77078a();
                    return;
                }
                this.f61956a = false;
            }
        };

        /* renamed from: d */
        private boolean f61947d;

        /* renamed from: e */
        private Config f61948e = Config.RGB_565;

        /* renamed from: f */
        private int f61949f;

        /* renamed from: g */
        private UrlModel f61950g;

        /* renamed from: h */
        private int f61951h;

        /* renamed from: i */
        private ImageRequest[] f61952i;

        /* renamed from: j */
        private C13386a f61953j;

        /* renamed from: k */
        private C13382e f61954k;

        /* renamed from: l */
        private boolean f61955l = true;

        /* renamed from: a */
        public final void mo61089a() {
            m77073a(this.f61947d, this.f61948e, null);
        }

        public final int hashCode() {
            return C23480h.m77086a(Integer.valueOf(this.f61944a), this.f61950g, this.f61945b);
        }

        /* renamed from: a */
        private void m77072a(C13400c<C13648f> cVar) {
            m77073a(this.f61947d, this.f61948e, cVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23475a)) {
                return false;
            }
            C23475a aVar = (C23475a) obj;
            if (this.f61944a != aVar.f61944a || !C23480h.m77087a(this.f61950g, aVar.f61950g) || !C23480h.m77087a(this.f61945b, aVar.f61945b)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private ImageRequest[] m77074a(int i, boolean z, Config config) {
            if (this.f61952i == null) {
                C13595c cVar = new C13595c();
                cVar.mo33153a(config);
                cVar.mo33154a(z);
                this.f61952i = new ImageRequest[]{ImageRequestBuilder.m40864a(i).mo33467a(new C13594b(cVar)).mo33476b()};
            }
            return this.f61952i;
        }

        /* renamed from: a */
        private ImageRequest[] m77075a(String str, boolean z, Config config) {
            if (this.f61952i == null) {
                C13595c cVar = new C13595c();
                cVar.mo33153a(config);
                cVar.mo33152a(1);
                cVar.mo33154a(z);
                this.f61952i = new ImageRequest[]{ImageRequestBuilder.m40865a(Uri.parse(str)).mo33467a(new C13594b(cVar)).mo33476b()};
            }
            return this.f61952i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m77073a(boolean r4, android.graphics.Bitmap.Config r5, com.facebook.drawee.controller.C13400c<com.facebook.imagepipeline.p720g.C13648f> r6) {
            /*
                r3 = this;
                r3.f61947d = r4
                r3.f61948e = r5
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.f61950g
                if (r0 != 0) goto L_0x0013
                int r0 = r3.f61951h
                if (r0 <= 0) goto L_0x002e
                int r0 = r3.f61951h
                com.facebook.imagepipeline.request.ImageRequest[] r4 = r3.m77074a(r0, r4, r5)
                goto L_0x002f
            L_0x0013:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.f61950g
                java.util.List r0 = r0.getUrlList()
                int r1 = r3.f61949f
                int r2 = r1 + 1
                r3.f61949f = r2
                java.lang.String r0 = com.p280ss.android.ugc.aweme.base.utils.C23474c.m77071a(r0, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x002e
                com.facebook.imagepipeline.request.ImageRequest[] r4 = r3.m77075a(r0, r4, r5)
                goto L_0x002f
            L_0x002e:
                r4 = 0
            L_0x002f:
                if (r4 != 0) goto L_0x003d
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r3.f61945b
                int r5 = r3.f61944a
                com.ss.android.ugc.aweme.base.model.AppImageUri r5 = com.p280ss.android.ugc.aweme.base.model.AppImageUri.m76615a(r5)
                com.p280ss.android.ugc.aweme.base.C23323e.m76504a(r4, r5)
                return
            L_0x003d:
                com.facebook.drawee.backends.pipeline.e r5 = r3.f61954k
                if (r5 != 0) goto L_0x0062
                com.facebook.drawee.backends.pipeline.e r5 = com.facebook.drawee.backends.pipeline.C13380c.m39166a()
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.f61945b
                com.facebook.drawee.c.a r0 = r0.getController()
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r5 = r5.mo32729b(r0)
                com.facebook.drawee.backends.pipeline.e r5 = (com.facebook.drawee.backends.pipeline.C13382e) r5
                com.facebook.drawee.controller.d<com.facebook.imagepipeline.g.f> r0 = r3.f61946c
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r5 = r5.mo32743a(r0)
                com.facebook.drawee.backends.pipeline.e r5 = (com.facebook.drawee.backends.pipeline.C13382e) r5
                r0 = 1
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r5 = r5.mo32751c(r0)
                com.facebook.drawee.backends.pipeline.e r5 = (com.facebook.drawee.backends.pipeline.C13382e) r5
                r3.f61954k = r5
            L_0x0062:
                com.facebook.drawee.backends.pipeline.e r5 = r3.f61954k
                r5.mo32746a((REQUEST[]) r4)
                com.facebook.drawee.c.a r4 = r3.f61953j
                if (r4 != 0) goto L_0x0082
                com.facebook.drawee.backends.pipeline.e r4 = r3.f61954k
                com.facebook.drawee.controller.a r4 = r4.mo32730f()
                r3.f61953j = r4
                com.facebook.drawee.c.a r4 = r3.f61953j
                boolean r4 = r4 instanceof com.facebook.drawee.backends.pipeline.C13381d
                if (r4 == 0) goto L_0x0082
                if (r6 == 0) goto L_0x0082
                com.facebook.drawee.c.a r4 = r3.f61953j
                com.facebook.drawee.backends.pipeline.d r4 = (com.facebook.drawee.backends.pipeline.C13381d) r4
                r4.mo32756a(r6)
            L_0x0082:
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r3.f61945b
                com.facebook.drawee.c.a r5 = r3.f61953j
                r4.setController(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.utils.C23474c.C23475a.m77073a(boolean, android.graphics.Bitmap$Config, com.facebook.drawee.controller.c):void");
        }

        /* renamed from: a */
        public final void mo61090a(AnimateDraweeView animateDraweeView, UrlModel urlModel, boolean z, Config config, C13400c<C13648f> cVar) {
            this.f61945b = animateDraweeView;
            this.f61950g = urlModel;
            this.f61947d = z;
            this.f61948e = config;
            m77072a(cVar);
        }
    }

    /* renamed from: a */
    public static String m77071a(List<String> list, int i) {
        if (!C6307b.m19566a((Collection<T>) list) && i < list.size()) {
            return (String) list.get(i);
        }
        return null;
    }
}
