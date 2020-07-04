package com.p280ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23347h;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.adapter.C28140al;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.j */
public final class C28422j {

    /* renamed from: a */
    public static final C28422j f74949a = new C28422j();

    private C28422j() {
    }

    /* renamed from: a */
    public static final void m93422a(SmartImageView smartImageView, UrlModel urlModel, Priority priority, C28140al alVar, DataCenter dataCenter) {
        UrlModel urlModel2;
        ArrayList arrayList;
        SmartImageView smartImageView2 = smartImageView;
        C28140al alVar2 = alVar;
        DataCenter dataCenter2 = dataCenter;
        C7573i.m23587b(priority, "priority");
        C7573i.m23587b(alVar2, "controllerListener");
        if (smartImageView2 != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            List urlList = urlModel.getUrlList();
            Object obj = urlList.get(urlList.size() - 1);
            C7573i.m23582a(obj, "originUrlList[originUrlList.size - 1]");
            Context context = null;
            boolean c = C7634n.m23776c((CharSequence) obj, (CharSequence) "360p.", false);
            if (c) {
                UrlModel urlModel3 = new UrlModel();
                urlModel3.setWidth(urlModel.getWidth());
                urlModel3.setHeight(urlModel.getHeight());
                urlModel3.setUrlKey(urlModel.getUrlKey());
                urlModel3.setUri(urlModel.getUri());
                urlModel3.setSize(urlModel.getSize());
                urlModel3.setFileHash(urlModel.getFileHash());
                urlModel3.setUrlList(new ArrayList(urlList));
                urlModel3.getUrlList().add(0, (String) urlModel3.getUrlList().remove(urlModel3.getUrlList().size() - 1));
                if (C7163a.m22363a() && dataCenter2 != null) {
                    dataCenter2.mo60134a("poster_processor", (Object) "超分过程中，有360p图片");
                }
                urlModel2 = urlModel3;
            } else {
                urlModel2 = urlModel;
            }
            if (C7163a.m22363a() && dataCenter2 != null) {
                dataCenter2.mo60134a("poster_processor_end", (Object) "封面图片开始请求");
            }
            Context context2 = smartImageView.getContext();
            if (context2 != null) {
                context = context2.getApplicationContext();
            }
            Context context3 = context;
            C28420h hVar = new C28420h(alVar2, dataCenter2);
            List urlList2 = urlModel2.getUrlList();
            ArrayList arrayList2 = new ArrayList();
            String str = (String) urlList2.get(0);
            if (c) {
                C7573i.m23582a((Object) str, "firstUrl");
                arrayList = arrayList2;
                arrayList.add(m93421a(str, null, priority, new C28423k(str, dataCenter2, alVar2), Config.ARGB_8888, hVar));
            } else {
                arrayList = arrayList2;
                C7573i.m23582a((Object) str, "firstUrl");
                arrayList.add(m93421a(str, null, priority, null, Config.RGB_565, hVar));
            }
            int size = urlList2.size();
            int i = 1;
            while (i < size) {
                Object obj2 = urlList2.get(i);
                C7573i.m23582a(obj2, "urlList[i]");
                int i2 = i;
                arrayList.add(m93421a((String) obj2, null, priority, null, Config.RGB_565, hVar));
                i = i2 + 1;
            }
            if (arrayList.size() != 0) {
                C13382e eVar = (C13382e) C13380c.m39166a().mo32729b(smartImageView.getController());
                Object[] array = arrayList.toArray(new ImageRequest[0]);
                if (array != null) {
                    C13382e eVar2 = (C13382e) eVar.mo32746a((REQUEST[]) array);
                    C13401d dVar = alVar2;
                    Object obj3 = arrayList.get(0);
                    C7573i.m23582a(obj3, "imageRequests[0]");
                    smartImageView2.setController(((C13382e) eVar2.mo32743a(C23323e.m76497a(dVar, ((ImageRequest) obj3).mSourceUri, context3, urlModel2))).mo32730f());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    /* renamed from: a */
    private static ImageRequest m93421a(String str, C13596d dVar, Priority priority, C13842b bVar, Config config, C23347h hVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(priority, "priority");
        C7573i.m23587b(config, "config");
        C7573i.m23587b(hVar, "requestsMonitor");
        C13595c cVar = new C13595c();
        cVar.mo33153a(config);
        cVar.mo33152a(1);
        cVar.mo33154a(false);
        ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33465a(priority).mo33467a(new C13594b(cVar));
        if (bVar != null) {
            a.mo33473a(bVar);
        }
        hVar.mo60644a(a);
        ImageRequest b = a.mo33476b();
        C7573i.m23582a((Object) b, "builder.build()");
        return b;
    }
}
