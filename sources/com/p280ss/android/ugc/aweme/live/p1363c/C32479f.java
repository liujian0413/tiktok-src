package com.p280ss.android.ugc.aweme.live.p1363c;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.p158a.C3347c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9458b;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.common.utility.C6319n;
import com.facebook.common.p685b.C13285i;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13350f;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p718e.C13639b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.c.f */
public final class C32479f implements C9456c {
    public C32479f() {
        C3596c.m13174a(C9456c.class, this);
    }

    /* renamed from: a */
    public final void mo23193a(String str) {
        C23323e.m76526b(str);
    }

    /* renamed from: a */
    private static boolean m105220a(Uri uri) {
        return C23323e.m76518a(uri);
    }

    /* renamed from: b */
    public final String mo23197b(String str) {
        return C23323e.m76500a(str);
    }

    /* renamed from: b */
    public final String mo23196b(ImageModel imageModel) {
        if (imageModel == null) {
            return "";
        }
        List urls = imageModel.getUrls();
        if (urls == null || urls.isEmpty()) {
            return "";
        }
        int size = urls.size();
        for (int i = 0; i < size; i++) {
            if (m105220a(Uri.parse((String) urls.get(i)))) {
                return mo23197b((String) urls.get(i));
            }
        }
        return "";
    }

    /* renamed from: a */
    public final boolean mo23195a(ImageModel imageModel) {
        if (imageModel == null) {
            return false;
        }
        List urls = imageModel.getUrls();
        if (urls == null || urls.isEmpty()) {
            return false;
        }
        int size = urls.size();
        for (int i = 0; i < size; i++) {
            if (m105220a(Uri.parse((String) urls.get(i)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C9457a mo23192a(ImageModel imageModel, final C9459c cVar) {
        m105219a(imageModel, null, null, null, new C13639b() {
            public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
            }

            /* renamed from: a */
            public final void mo9161a(Bitmap bitmap) {
                cVar.mo9921a(bitmap);
            }
        });
        return null;
    }

    /* renamed from: a */
    public final void mo23194a(String str, final C9458b bVar) {
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        C23323e.m76502a(urlModel, (C23328a) new C23328a() {
            /* renamed from: a */
            public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                bVar.mo21637b();
            }

            /* renamed from: a */
            public final void mo60610a(Exception exc) {
                bVar.mo21638c();
            }
        });
    }

    /* renamed from: a */
    private static ImageRequest[] m105221a(ImageModel imageModel, C13596d dVar, C13842b bVar) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C3347c cVar = new C3347c();
        for (String str : imageModel.getUrls()) {
            if (!C6319n.m19593a(str)) {
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str));
                if (bVar != null) {
                    a.mo33473a(bVar);
                    if (dVar != null) {
                        a.mo33468a(dVar);
                    }
                }
                cVar.mo10269a(a);
                arrayList.add(a.mo33476b());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    /* renamed from: a */
    private static C13346c<C13326a<C13645c>> m105219a(ImageModel imageModel, C13596d dVar, C13842b bVar, Object obj, C13639b bVar2) {
        ImageRequest[] a = m105221a(imageModel, null, null);
        if (a == null || a.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ImageRequest imageRequest : a) {
            if (imageRequest != null) {
                arrayList.add(C13380c.m39172c().mo33171a(imageRequest, (Object) null, RequestLevel.FULL_FETCH));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C13346c<C13326a<C13645c>> a2 = C13350f.m39080a(arrayList).mo29879b();
        a2.mo32633a(bVar2, C13285i.m38830b());
        return a2;
    }
}
