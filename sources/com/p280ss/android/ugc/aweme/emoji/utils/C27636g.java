package com.p280ss.android.ugc.aweme.emoji.utils;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.g */
public final class C27636g {

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.g$a */
    static final class C27637a {

        /* renamed from: a */
        public RemoteImageView f72819a;

        /* renamed from: b */
        public C27640i f72820b;

        /* renamed from: c */
        public boolean f72821c = true;

        /* renamed from: d */
        C13401d<C13648f> f72822d = new C13401d<C13648f>() {

            /* renamed from: a */
            boolean f72830a;

            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            public final void onSubmit(String str, Object obj) {
            }

            /* renamed from: a */
            private void m90617a() {
                if (C27637a.this.f72819a.getController() != null && this.f72830a) {
                    Animatable j = C27637a.this.f72819a.getController().mo32721j();
                    if (j != null && !j.isRunning() && C27637a.this.f72821c) {
                        j.start();
                    }
                }
            }

            public final void onRelease(String str) {
                this.f72830a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                this.f72830a = false;
            }

            public final void onFailure(String str, Throwable th) {
                if (C27637a.this.f72820b != null) {
                    C27637a.this.f72820b.an_();
                }
                C27637a.this.mo71037a();
                this.f72830a = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (animatable != null) {
                    this.f72830a = true;
                    m90617a();
                    if (C27637a.this.f72820b != null) {
                        C27637a.this.f72820b.am_();
                    }
                } else {
                    this.f72830a = false;
                }
            }
        };

        /* renamed from: e */
        private int f72823e;

        /* renamed from: f */
        private UrlModel f72824f;

        /* renamed from: g */
        private ImageRequest[] f72825g;

        /* renamed from: h */
        private C13386a f72826h;

        /* renamed from: i */
        private int f72827i;

        /* renamed from: j */
        private int f72828j;

        /* renamed from: k */
        private C13382e f72829k;

        /* renamed from: a */
        public final void mo71037a() {
            List urlList = this.f72824f.getUrlList();
            int i = this.f72823e;
            this.f72823e = i + 1;
            ImageRequest[] a = m90614a(m90613a(urlList, i));
            if (this.f72829k == null) {
                this.f72829k = (C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(this.f72819a.getController())).mo32746a((REQUEST[]) a)).mo32743a(this.f72822d);
            }
            this.f72829k.mo32746a((REQUEST[]) a);
            if (this.f72826h == null) {
                this.f72826h = this.f72829k.mo32730f();
            }
            this.f72819a.setController(this.f72826h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C27637a mo71036a(boolean z) {
            this.f72821c = z;
            return this;
        }

        /* renamed from: a */
        private ImageRequest[] m90614a(String str) {
            if (this.f72825g == null) {
                C13595c cVar = new C13595c();
                cVar.mo33153a(Config.ARGB_8888);
                cVar.mo33152a(1);
                cVar.mo33154a(false);
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33467a(new C13594b(cVar));
                if (this.f72828j > 0 && this.f72827i > 0) {
                    a.mo33468a(new C13596d(this.f72827i, this.f72828j));
                }
                this.f72825g = new ImageRequest[]{a.mo33476b()};
            }
            return this.f72825g;
        }

        /* renamed from: a */
        private static String m90613a(List<String> list, int i) {
            if (!C6307b.m19566a((Collection<T>) list) && i < list.size()) {
                return (String) list.get(i);
            }
            return null;
        }

        C27637a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C27640i iVar) {
            this.f72819a = remoteImageView;
            this.f72824f = urlModel;
            this.f72827i = i;
            this.f72828j = i2;
            this.f72820b = iVar;
        }
    }

    /* renamed from: a */
    public static void m90607a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m90611a(remoteImageView, urlModel, true);
    }

    /* renamed from: a */
    public static void m90612a(RemoteImageView remoteImageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            List singletonList = Collections.singletonList(str);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(singletonList);
            m90607a(remoteImageView, urlModel);
        }
    }

    /* renamed from: a */
    public static void m90610a(RemoteImageView remoteImageView, UrlModel urlModel, C27640i iVar) {
        m90609a(remoteImageView, urlModel, 0, 0, iVar, true);
    }

    /* renamed from: a */
    private static void m90611a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        m90609a(remoteImageView, urlModel, 0, 0, null, true);
    }

    /* renamed from: a */
    public static void m90608a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m90609a(remoteImageView, urlModel, i, i2, null, true);
    }

    /* renamed from: a */
    private static void m90609a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C27640i iVar, boolean z) {
        if (!C6307b.m19566a((Collection<T>) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            C27637a aVar = new C27637a(remoteImageView, urlModel, i, i2, iVar);
            aVar.mo71036a(z).mo71037a();
        }
    }
}
