package com.bytedance.android.live.core.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.utils.C3404s.C3406b;
import com.bytedance.android.live.core.utils.p158a.C3347c;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p685b.C13275a;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13349e;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p718e.C13639b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.core.utils.m */
public final class C3393m {

    /* renamed from: a */
    private static final Handler f10189a = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.android.live.core.utils.m$a */
    public static class C3396a {

        /* renamed from: a */
        final ImageModel f10193a;

        /* renamed from: b */
        Drawable f10194b;

        /* renamed from: c */
        int f10195c = C34943c.f91128x;

        /* renamed from: d */
        int f10196d = -1;

        /* renamed from: e */
        int f10197e = -1;

        /* renamed from: f */
        C13842b f10198f;

        /* renamed from: g */
        C3405a f10199g;

        /* renamed from: h */
        boolean f10200h;

        /* renamed from: i */
        boolean f10201i = ((Boolean) CoreSettingKeys.ENABLE_IMAGE_DEFAULT_565.mo10240a()).booleanValue();

        /* renamed from: a */
        public final C3396a mo10292a(C3405a aVar) {
            this.f10199g = aVar;
            return this;
        }

        /* renamed from: b */
        public final C3396a mo10295b(boolean z) {
            this.f10201i = true;
            return this;
        }

        /* renamed from: a */
        public final C3396a mo10291a(int i) {
            this.f10195c = C34943c.f91128x;
            return this;
        }

        /* renamed from: a */
        public final C3396a mo10293a(boolean z) {
            this.f10200h = false;
            return this;
        }

        C3396a(ImageModel imageModel) {
            this.f10193a = imageModel;
        }

        /* renamed from: a */
        public final void mo10294a(HSImageView hSImageView) {
            C3393m.m12626a(hSImageView, this.f10193a, this.f10194b, C34943c.f91128x, this.f10196d, this.f10197e, this.f10198f, this.f10199g, this.f10200h, this.f10201i);
        }
    }

    /* renamed from: com.bytedance.android.live.core.utils.m$b */
    public static class C3397b implements C13401d<C13648f> {

        /* renamed from: a */
        private ImageModel f10202a;

        /* renamed from: b */
        private C3405a f10203b;

        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public C3397b(ImageModel imageModel, C3405a aVar) {
            this.f10202a = imageModel;
            this.f10203b = aVar;
        }

        public final void onSubmit(String str, Object obj) {
            if (this.f10203b != null) {
                this.f10203b.mo10308a(this.f10202a);
            }
        }

        public final void onFailure(String str, Throwable th) {
            if (this.f10203b != null) {
                this.f10203b.mo10310a(this.f10202a, new RuntimeException(th));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            int i;
            boolean a = C3401q.m12644a().mo10305a(this.f10202a);
            int i2 = -1;
            if (fVar != null) {
                i = fVar.getWidth();
            } else {
                i = -1;
            }
            if (fVar != null) {
                i2 = fVar.getHeight();
            }
            if (this.f10202a != null) {
                C3401q.m12644a().mo10306b(this.f10202a);
                this.f10202a.setLoaded(true);
            }
            if (this.f10203b != null) {
                this.f10203b.mo10309a(this.f10202a, i, i2, a);
            }
        }
    }

    /* renamed from: a */
    public static void m12622a(HSImageView hSImageView, ImageModel imageModel, C3405a aVar, boolean z) {
        m12627a(hSImageView, imageModel, null, -1, -1, null, aVar, z);
    }

    /* renamed from: a */
    public static void m12624a(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            hSImageView.setImageURI(ImageRequestBuilder.m40865a(Uri.parse(str)).mo33476b().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m12625a(HSImageView hSImageView, String str, C13842b bVar) {
        if (hSImageView != null && !TextUtils.isEmpty(str) && bVar != null) {
            ImageRequest b = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33473a(bVar).mo33476b();
            C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(hSImageView.getController())).mo32746a((REQUEST[]) new ImageRequest[]{b});
            hSImageView.setImageURI(b.mSourceUri);
            hSImageView.setController(eVar.mo32730f());
        }
    }

    /* renamed from: a */
    public static void m12623a(HSImageView hSImageView, ImageModel imageModel, C13842b bVar) {
        m12627a(hSImageView, imageModel, null, -1, -1, bVar, null, false);
    }

    /* renamed from: a */
    private static void m12627a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, C13842b bVar, C3405a aVar, boolean z) {
        m12626a(simpleDraweeView, imageModel, null, C34943c.f91128x, i, i2, bVar, aVar, z, false);
    }

    /* renamed from: a */
    public static void m12626a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, int i3, C13842b bVar, C3405a aVar, boolean z, boolean z2) {
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C13596d dVar = null;
            if (i2 < 0 || i3 < 0) {
                i2 = simpleDraweeView.getMeasuredWidth();
                i3 = simpleDraweeView.getMeasuredHeight();
            }
            if (i2 > 0 && i3 > 0) {
                dVar = new C13596d(i2, i3);
            }
            ImageRequest[] a = m12632a(imageModel, dVar, bVar, z2);
            if (a != null && a.length != 0) {
                C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(simpleDraweeView.getController())).mo32746a((REQUEST[]) a);
                if (z) {
                    eVar.mo32751c(true);
                }
                if (drawable != null) {
                    if (simpleDraweeView.getHierarchy() == null) {
                        simpleDraweeView.setHierarchy(new C13439b(simpleDraweeView.getContext().getResources()).mo32910a((int) C34943c.f91128x).mo32913a(drawable).mo32914a(C13423b.f35599g).mo32908a());
                    } else {
                        C13438a aVar2 = (C13438a) simpleDraweeView.getHierarchy();
                        aVar2.mo32890a((int) C34943c.f91128x);
                        aVar2.mo32900b(drawable);
                        simpleDraweeView.setHierarchy(aVar2);
                    }
                }
                eVar.mo32743a((C13401d<? super INFO>) new C3397b<Object>(imageModel, aVar));
                simpleDraweeView.setController(eVar.mo32730f());
            }
        }
    }

    /* renamed from: a */
    private static ImageRequest[] m12631a(ImageModel imageModel, C13596d dVar, C13842b bVar) {
        return m12632a(imageModel, (C13596d) null, (C13842b) null, false);
    }

    /* renamed from: a */
    private static ImageRequest[] m12632a(ImageModel imageModel, C13596d dVar, C13842b bVar, boolean z) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new ImageRequest[0];
        }
        ArrayList arrayList = new ArrayList();
        C3347c cVar = new C3347c();
        for (String str : imageModel.getUrls()) {
            if (!C6319n.m19593a(str)) {
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str));
                if (bVar != null) {
                    a.mo33473a(bVar);
                }
                if (dVar != null) {
                    a.mo33468a(dVar);
                }
                cVar.mo10269a(a);
                arrayList.add(a.mo33476b());
            }
        }
        if (arrayList.size() == 0) {
            return new ImageRequest[0];
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    /* renamed from: a */
    public static void m12629a(String str, int i, int i2, C3406b bVar) {
        ArrayList arrayList = new ArrayList();
        ImageRequest a = m12614a(Uri.parse(str), (C13596d) null);
        if (a != null) {
            arrayList.add(a);
        }
        m12630a((ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]), bVar);
    }

    /* renamed from: a */
    private static void m12630a(ImageRequest[] imageRequestArr, final C3406b bVar) {
        if (imageRequestArr != null && imageRequestArr.length != 0) {
            final C13346c a = C13622l.m40095a().mo33208d().mo33172a(imageRequestArr[0], (Object) null);
            a.mo32633a(new C13639b() {
                public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
                    if (cVar != null) {
                        cVar.mo32644g();
                    }
                    if (bVar != null) {
                        C3393m.m12628a((Runnable) new C3400p(bVar));
                    }
                }

                /* renamed from: a */
                public final void mo9161a(Bitmap bitmap) {
                    if (a.mo32639b() && bitmap != null) {
                        C3393m.m12628a((Runnable) new C3398n(bVar, Bitmap.createBitmap(bitmap)));
                    } else if (bVar != null) {
                        C3393m.m12628a((Runnable) new C3399o(bVar));
                    }
                    a.mo32644g();
                }
            }, C13275a.m38815a());
        }
    }

    /* renamed from: a */
    public static void m12628a(Runnable runnable) {
        f10189a.post(runnable);
    }

    /* renamed from: a */
    public static C3396a m12613a(ImageModel imageModel) {
        return new C3396a(imageModel);
    }

    /* renamed from: a */
    public static InputStream m12615a(Uri uri) {
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            C13380c.m39172c().mo33178b(ImageRequestBuilder.m40865a(uri).mo33476b(), null).mo32633a(new C13349e<C13326a<PooledByteBuffer>>() {
                public final void onProgressUpdate(C13346c<C13326a<PooledByteBuffer>> cVar) {
                }

                public final void onCancellation(C13346c<C13326a<PooledByteBuffer>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.mo32644g();
                    }
                }

                public final void onFailure(C13346c<C13326a<PooledByteBuffer>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.mo32644g();
                    }
                }

                public final void onNewResult(C13346c<C13326a<PooledByteBuffer>> cVar) {
                    C13326a aVar = (C13326a) cVar.mo32641d();
                    if (aVar != null) {
                        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) aVar.mo32609a();
                        byte[] bArr = new byte[pooledByteBuffer.mo32575a()];
                        pooledByteBuffer.mo32576a(0, bArr, 0, pooledByteBuffer.mo32575a());
                        try {
                            pipedOutputStream.write(bArr);
                            pipedOutputStream.close();
                        } catch (IOException unused) {
                        } finally {
                            cVar.mo32644g();
                        }
                    }
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
            return pipedInputStream;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m12633b(HSImageView hSImageView, ImageModel imageModel) {
        m12627a(hSImageView, imageModel, null, -1, -1, null, null, false);
    }

    /* renamed from: a */
    private static ImageRequest m12614a(Uri uri, C13596d dVar) {
        if (uri == null) {
            return null;
        }
        ImageRequestBuilder a = ImageRequestBuilder.m40865a(uri);
        if (dVar != null) {
            a.mo33468a(dVar);
        }
        return a.mo33476b();
    }

    /* renamed from: b */
    public static void m12634b(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            if (!str.startsWith("file://")) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                str = sb.toString();
            }
            hSImageView.setImageURI(ImageRequestBuilder.m40865a(Uri.parse(str)).mo33476b().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m12616a(Context context, ImageModel imageModel) {
        if (context != null && imageModel != null && !C6311g.m19573a(imageModel.getUrls())) {
            C13380c.m39172c().mo33182c(ImageRequest.fromUri((String) imageModel.getUrls().get(0)), context);
        }
    }

    /* renamed from: a */
    public static void m12618a(HSImageView hSImageView, int i) {
        if (hSImageView != null) {
            hSImageView.setImageURI(ImageRequestBuilder.m40864a(i).mo33476b().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m12619a(HSImageView hSImageView, ImageModel imageModel) {
        if (hSImageView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            ImageRequest[] a = m12631a(imageModel, (C13596d) null, (C13842b) null);
            if (a != null && a.length != 0) {
                hSImageView.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(hSImageView.getController())).mo32746a((REQUEST[]) a)).mo32751c(true)).mo32730f());
            }
        }
    }

    /* renamed from: a */
    public static void m12621a(HSImageView hSImageView, ImageModel imageModel, C3405a aVar) {
        m12627a(hSImageView, imageModel, null, -1, -1, null, aVar, false);
    }

    /* renamed from: a */
    public static void m12620a(HSImageView hSImageView, ImageModel imageModel, int i, int i2) {
        m12627a(hSImageView, imageModel, null, i, i2, null, null, false);
    }

    /* renamed from: a */
    public static void m12617a(ImageModel imageModel, int i, int i2, boolean z, C3406b bVar) {
        m12630a(m12632a(imageModel, (C13596d) null, (C13842b) null, false), bVar);
    }
}
