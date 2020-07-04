package com.bytedance.android.livesdk.chatroom.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.utils.p158a.C3347c;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C9714c;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13350f;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.facebook.imagepipeline.p718e.C13639b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.e */
public final class C5343e {
    /* renamed from: a */
    public static void m17038a(HSImageView hSImageView, ImageModel imageModel) {
        C3393m.m12633b(hSImageView, imageModel);
    }

    /* renamed from: a */
    public static void m17039a(HSImageView hSImageView, ImageModel imageModel, C13842b bVar) {
        C3393m.m12623a(hSImageView, imageModel, bVar);
    }

    /* renamed from: a */
    public static void m17040a(HSImageView hSImageView, String str) {
        C3393m.m12624a(hSImageView, str);
    }

    /* renamed from: a */
    public static void m17041a(HSImageView hSImageView, String str, C13842b bVar) {
        C3393m.m12625a(hSImageView, str, bVar);
    }

    /* renamed from: a */
    public static C7492s<Bitmap> m17028a(ImageModel imageModel) {
        return C7492s.m23282a((C7495v<T>) new C5345f<T>(imageModel));
    }

    /* renamed from: c */
    private static C13346c<C13326a<C13645c>> m17046c(ImageModel imageModel) {
        ImageRequest[] d = m17047d(imageModel);
        if (d == null || d.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ImageRequest imageRequest : d) {
            if (imageRequest != null) {
                arrayList.add(C13380c.m39172c().mo33171a(imageRequest, (Object) null, RequestLevel.FULL_FETCH));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C13350f.m39080a(arrayList).mo29879b();
    }

    /* renamed from: b */
    public static Drawable m17042b(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        C13396a c = ((C13382e) ((C13382e) C13380c.m39166a().mo32746a((REQUEST[]) m17047d(imageModel))).mo32751c(true)).mo32730f();
        C13445b a = C13445b.m39493a(new C13439b(C3358ac.m12513a()).mo32908a(), C3358ac.m12528e());
        a.mo32931a((C13386a) c);
        return a.mo32938f();
    }

    /* renamed from: d */
    private static ImageRequest[] m17047d(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C3347c cVar = new C3347c();
        for (String str : imageModel.getUrls()) {
            if (!C6319n.m19593a(str)) {
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str));
                cVar.mo10269a(a);
                arrayList.add(a.mo33476b());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    /* renamed from: b */
    public static void m17043b(ImageView imageView, ImageModel imageModel) {
        C3404s.m12650a(imageView, imageModel);
    }

    /* renamed from: a */
    public static void m17029a(ImageView imageView, int i) {
        C3404s.m12649a(imageView, i, -1, -1);
    }

    /* renamed from: a */
    public static void m17030a(ImageView imageView, ImageModel imageModel) {
        m17044b(imageView, imageModel, 0);
    }

    /* renamed from: a */
    static final /* synthetic */ void m17036a(final ImageModel imageModel, final C47870u uVar) throws Exception {
        String str;
        C13346c c = m17046c(imageModel);
        if (c == null) {
            StringBuilder sb = new StringBuilder("Cannot build requests from imageModel: ");
            if (imageModel != null) {
                str = imageModel.toString();
            } else {
                str = "";
            }
            sb.append(str);
            uVar.mo19240a((Throwable) new IllegalArgumentException(sb.toString()));
            return;
        }
        c.mo32633a(new C13639b() {
            public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
                uVar.mo19240a(cVar.mo32642e());
            }

            /* renamed from: a */
            public final void mo9161a(Bitmap bitmap) {
                if (bitmap == null) {
                    C47870u uVar = uVar;
                    StringBuilder sb = new StringBuilder("No bitmap loaded for imageModel: ");
                    sb.append(imageModel.toString());
                    uVar.mo19240a((Throwable) new IllegalStateException(sb.toString()));
                    return;
                }
                uVar.mo19239a((Object) bitmap.copy(bitmap.getConfig(), false));
                uVar.mo19238a();
            }
        }, C9714c.m28650a());
    }

    /* renamed from: a */
    public static void m17037a(HSImageView hSImageView, int i) {
        C3393m.m12618a(hSImageView, (int) R.drawable.c73);
    }

    /* renamed from: a */
    public static void m17035a(ImageView imageView, ImageModel imageModel, C3405a aVar) {
        C3404s.m12657a(imageView, imageModel, aVar);
    }

    /* renamed from: b */
    private static void m17044b(ImageView imageView, ImageModel imageModel, int i) {
        C3404s.m12651a(imageView, imageModel, 0);
    }

    /* renamed from: a */
    public static void m17031a(ImageView imageView, ImageModel imageModel, int i) {
        C3404s.m12653a(imageView, imageModel, 0, 0, i, null);
    }

    /* renamed from: a */
    public static void m17032a(ImageView imageView, ImageModel imageModel, int i, int i2) {
        C3404s.m12654a(imageView, imageModel, i, i2, null);
    }

    /* renamed from: b */
    public static void m17045b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C3404s.m12653a(imageView, imageModel, i, i2, i3, null);
    }

    /* renamed from: a */
    public static void m17034a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C3404s.m12660b(imageView, imageModel, i, i2, i3, null);
    }

    /* renamed from: a */
    public static void m17033a(ImageView imageView, ImageModel imageModel, int i, int i2, float f, C3405a aVar) {
        C3404s.m12652a(imageView, imageModel, 0, 0, i, i2, f, null);
    }
}
