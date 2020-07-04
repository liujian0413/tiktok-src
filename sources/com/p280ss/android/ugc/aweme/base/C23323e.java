package com.p280ss.android.ugc.aweme.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p482io.FileUtils;
import com.facebook.binaryresource.C13231a;
import com.facebook.binaryresource.C13232b;
import com.facebook.common.p685b.C13275a;
import com.facebook.common.p685b.C13285i;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13349e;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p718e.C13639b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.e */
public class C23323e {

    /* renamed from: a */
    private static boolean f61384a;

    /* renamed from: com.ss.android.ugc.aweme.base.e$a */
    public interface C23328a {
        /* renamed from: a */
        void mo60609a(C13346c<C13326a<C13645c>> cVar);

        /* renamed from: a */
        void mo60610a(Exception exc);
    }

    /* renamed from: a */
    public static void m76510a(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar, boolean z) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            ImageRequest[] a = m76522a(urlModel, (C13596d) null, (C13842b) null);
            if (a != null && a.length != 0) {
                C13382e eVar = (C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a)).mo32751c(z);
                eVar.mo32743a(m76497a(dVar, a[0].mSourceUri, applicationContext, urlModel));
                remoteImageView.setController(eVar.mo32730f());
            }
        }
    }

    /* renamed from: a */
    public static void m76515a(RemoteImageView remoteImageView, String str, int i, int i2) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m76503a(remoteImageView, (int) R.drawable.a_j);
                return;
            }
            C13596d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C13596d(i, i2);
            }
            ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str));
            if (dVar != null) {
                a.mo33468a(dVar);
            }
            remoteImageView.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32748b(a.mo33476b())).mo32751c(true)).mo32730f());
        }
    }

    /* renamed from: a */
    public static void m76509a(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar) {
        m76511a(remoteImageView, urlModel, Priority.MEDIUM, dVar);
    }

    /* renamed from: a */
    private static void m76511a(RemoteImageView remoteImageView, UrlModel urlModel, Priority priority, C13401d<C13648f> dVar) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            ImageRequest[] a = m76520a(urlModel, (C13596d) null, priority, (C13842b) null);
            if (a != null && a.length != 0) {
                C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a);
                eVar.mo32743a(m76497a(dVar, a[0].mSourceUri, applicationContext, urlModel));
                remoteImageView.setController(eVar.mo32730f());
            }
        }
    }

    /* renamed from: a */
    public static void m76508a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C13842b bVar, C13401d<C13648f> dVar) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            C13596d dVar2 = (i <= 0 || i2 <= 0) ? null : new C13596d(i, i2);
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            ImageRequest[] a = m76522a(urlModel, dVar2, (C13842b) null);
            if (a != null && a.length != 0) {
                C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a);
                eVar.mo32743a(m76497a(dVar, a[0].mSourceUri, applicationContext, urlModel));
                remoteImageView.setController(eVar.mo32730f());
            }
        }
    }

    /* renamed from: a */
    public static void m76513a(RemoteImageView remoteImageView, UrlModel urlModel, C13842b bVar) {
        m76507a(remoteImageView, urlModel, -1, -1, bVar);
    }

    /* renamed from: a */
    public static void m76507a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C13842b bVar) {
        m76512a(remoteImageView, urlModel, (i <= 0 || i2 <= 0) ? null : new C13596d(i, i2), bVar);
    }

    /* renamed from: a */
    private static void m76512a(RemoteImageView remoteImageView, UrlModel urlModel, C13596d dVar, C13842b bVar) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            ImageRequest[] a = m76522a(urlModel, dVar, bVar);
            if (a != null && a.length != 0) {
                remoteImageView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a)).mo32730f());
            }
        }
    }

    /* renamed from: a */
    public static void m76506a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m76507a(remoteImageView, urlModel, i, i2, (C13842b) null);
    }

    /* renamed from: a */
    public static void m76514a(RemoteImageView remoteImageView, String str) {
        m76525b(remoteImageView, str, -1, -1);
    }

    /* renamed from: a */
    public static void m76516a(RemoteImageView remoteImageView, String str, int i, int i2, Config config) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m76503a(remoteImageView, (int) R.drawable.a_j);
                return;
            }
            C13596d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C13596d(i, i2);
            }
            ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str));
            if (dVar != null) {
                a.mo33468a(dVar);
            }
            if (config != null) {
                C13595c cVar = new C13595c();
                cVar.mo33153a(config);
                a.mo33467a(new C13594b(cVar));
            }
            remoteImageView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32748b(a.mo33476b())).mo32730f());
        }
    }

    /* renamed from: a */
    public static ImageRequest[] m76522a(UrlModel urlModel, C13596d dVar, C13842b bVar) {
        return m76521a(urlModel, dVar, Priority.MEDIUM, bVar, Config.RGB_565);
    }

    /* renamed from: a */
    public static ImageRequest[] m76520a(UrlModel urlModel, C13596d dVar, Priority priority, C13842b bVar) {
        return m76521a(urlModel, (C13596d) null, priority, (C13842b) null, Config.RGB_565);
    }

    /* renamed from: a */
    public static ImageRequest[] m76523a(UrlModel urlModel, C13596d dVar, C13842b bVar, Config config) {
        return m76521a(urlModel, (C13596d) null, Priority.MEDIUM, (C13842b) null, config);
    }

    /* renamed from: a */
    private static ImageRequest[] m76521a(UrlModel urlModel, C13596d dVar, Priority priority, C13842b bVar, Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new ImageRequest[0];
        }
        ArrayList arrayList = new ArrayList();
        C23347h hVar = null;
        if (!f61384a) {
            hVar = new C23347h();
        }
        for (String str : urlModel.getUrlList()) {
            if (!C6319n.m19593a(str)) {
                C13595c cVar = new C13595c();
                cVar.mo33153a(config);
                cVar.mo33152a(1);
                cVar.mo33154a(false);
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33465a(priority).mo33467a(new C13594b(cVar));
                if (bVar != null) {
                    a.mo33473a(bVar);
                }
                if (dVar != null) {
                    a.mo33468a(dVar);
                }
                if (hVar != null) {
                    hVar.mo60644a(a);
                }
                arrayList.add(a.mo33476b());
            }
        }
        if (arrayList.size() == 0) {
            return new ImageRequest[0];
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m76518a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C13622l.m40095a().mo33207c().mo32467d(C13577j.m39966a().mo33116c(ImageRequest.fromUri(uri), null));
    }

    /* renamed from: a */
    public static boolean m76519a(C13606i iVar, ImageRequest[] imageRequestArr, int i, C13349e<C13326a<C13645c>> eVar) {
        if (i >= imageRequestArr.length) {
            return false;
        }
        iVar.mo33172a(imageRequestArr[i], (Object) null).mo32633a(eVar, C13285i.m38830b());
        return true;
    }

    /* renamed from: a */
    public static void m76517a(boolean z) {
        f61384a = true;
    }

    /* renamed from: a */
    public static String m76500a(String str) {
        String str2 = "";
        if (str == null || str.isEmpty()) {
            return str2;
        }
        Uri parse = Uri.parse(str);
        if (m76518a(parse)) {
            C13231a a = C13622l.m40095a().mo33207c().mo32459a(C13577j.m39966a().mo33116c(ImageRequest.fromUri(parse), null));
            if (a != null) {
                File file = ((C13232b) a).f35057a;
                if (file != null) {
                    str2 = file.getAbsolutePath();
                }
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static void m76526b(String str) {
        if (str != null && !str.isEmpty() && !m76518a(Uri.parse(str))) {
            C13622l.m40095a().mo33208d().mo33185d(ImageRequest.fromUri(str), null);
        }
    }

    /* renamed from: a */
    public static String m76499a(UrlModel urlModel) {
        if (urlModel != null) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    List urlList = urlModel.getUrlList();
                    if (urlList == null || urlList.isEmpty()) {
                        return "";
                    }
                    int size = urlList.size();
                    for (int i = 0; i < size; i++) {
                        if (m76518a(Uri.parse((String) urlList.get(i)))) {
                            return (String) urlList.get(i);
                        }
                    }
                    return "";
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: b */
    public static void m76524b(RemoteImageView remoteImageView, UrlModel urlModel) {
        m76507a(remoteImageView, urlModel, -1, -1, (C13842b) null);
    }

    /* renamed from: a */
    public static void m76505a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m76510a(remoteImageView, urlModel, null, true);
    }

    /* renamed from: a */
    public static void m76502a(UrlModel urlModel, final C23328a aVar) {
        final ImageRequest[] a = m76522a(urlModel, (C13596d) null, (C13842b) null);
        final C13606i c = C13380c.m39172c();
        m76519a(c, a, 0, (C13349e<C13326a<C13645c>>) new C13345b<C13326a<C13645c>>() {

            /* renamed from: d */
            private int f61391d = 1;

            public final void onNewResultImpl(C13346c<C13326a<C13645c>> cVar) {
                aVar.mo60609a(cVar);
            }

            public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
                Throwable e = cVar.mo32642e();
                C13606i iVar = c;
                ImageRequest[] imageRequestArr = a;
                int i = this.f61391d;
                this.f61391d = i + 1;
                if (!C23323e.m76519a(iVar, imageRequestArr, i, (C13349e<C13326a<C13645c>>) this)) {
                    aVar.mo60610a((Exception) new RuntimeException(e));
                }
            }
        });
    }

    /* renamed from: a */
    public static String m76498a(Context context, String str) {
        if (C6319n.m19593a(str)) {
            return "";
        }
        String str2 = "";
        Uri parse = Uri.parse(str);
        if (m76518a(parse)) {
            C13231a a = C13622l.m40095a().mo33207c().mo32459a(C13577j.m39966a().mo33116c(ImageRequest.fromUri(parse), null));
            if (a != null) {
                File file = ((C13232b) a).f35057a;
                if (file != null) {
                    new C6813b(context);
                    String a2 = C6813b.m21179a();
                    String a3 = C6306c.m19561a(file.getName());
                    File file2 = new File(a2, a3);
                    if (!file2.exists()) {
                        FileUtils.m28675a(file.getAbsolutePath(), a2, a3);
                    }
                    str2 = file2.getAbsolutePath();
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static void m76503a(RemoteImageView remoteImageView, int i) {
        if (remoteImageView != null) {
            remoteImageView.setImageURI(ImageRequestBuilder.m40864a(i).mo33476b().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m76504a(RemoteImageView remoteImageView, AppImageUri appImageUri) {
        switch (appImageUri.f61444a) {
            case RES_ID:
                m76503a(remoteImageView, appImageUri.mo60652a());
                return;
            case URL_MODEL:
                m76524b(remoteImageView, appImageUri.mo60654c());
                return;
            case URL:
                m76514a(remoteImageView, appImageUri.mo60653b());
                break;
        }
    }

    /* renamed from: a */
    public static C13401d<C13648f> m76497a(final C13401d<C13648f> dVar, Uri uri, Context context, UrlModel urlModel) {
        return new C13401d<C13648f>() {
            public final void onRelease(String str) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, fVar);
                }
            }

            public final void onFailure(String str, Throwable th) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }

            public final void onIntermediateImageFailed(String str, Throwable th) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }

            public final void onSubmit(String str, Object obj) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (dVar != null) {
                    dVar.onFinalImageSet(str, fVar, animatable);
                }
            }
        };
    }

    /* renamed from: b */
    public static void m76525b(RemoteImageView remoteImageView, String str, int i, int i2) {
        m76516a(remoteImageView, str, i, i2, Config.ARGB_8888);
    }

    /* renamed from: a */
    public static void m76501a(UrlModel urlModel, int i, int i2, final C23319b<Bitmap> bVar) {
        C13596d dVar;
        C13606i d = C13622l.m40095a().mo33208d();
        if (i <= 0 || i2 <= 0) {
            dVar = null;
        } else {
            dVar = new C13596d(i, i2);
        }
        ImageRequest[] a = m76522a(urlModel, dVar, (C13842b) null);
        if (a.length != 0) {
            final C13346c a2 = d.mo33172a(a[0], (Object) null);
            a2.mo32633a(new C13639b() {
                public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
                    if (cVar != null) {
                        cVar.mo32644g();
                    }
                    bVar.accept(null);
                }

                /* renamed from: a */
                public final void mo9161a(Bitmap bitmap) {
                    if (!a2.mo32639b() || bitmap == null) {
                        bVar.accept(null);
                        return;
                    }
                    bVar.accept(Bitmap.createBitmap(bitmap));
                    a2.mo32644g();
                }
            }, C13275a.m38815a());
        }
    }
}
