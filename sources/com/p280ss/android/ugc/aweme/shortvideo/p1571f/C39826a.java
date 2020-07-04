package com.p280ss.android.ugc.aweme.shortvideo.p1571f;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.a */
public final class C39826a {
    /* renamed from: a */
    public static void m127518a(RemoteImageView remoteImageView, String str, Config config) {
        ImageRequest[] imageRequestArr;
        if (!TextUtils.isEmpty(str)) {
            imageRequestArr = m127520a(str, false, config);
        } else {
            imageRequestArr = null;
        }
        m127519a(remoteImageView, imageRequestArr, false, config);
    }

    /* renamed from: a */
    public static ImageRequest[] m127520a(String str, boolean z, Config config) {
        C13595c cVar = new C13595c();
        cVar.mo33153a(config);
        cVar.mo33152a(1);
        cVar.mo33154a(false);
        return new ImageRequest[]{ImageRequestBuilder.m40865a(Uri.parse(str)).mo33467a(new C13594b(cVar)).mo33476b()};
    }

    /* renamed from: a */
    private static void m127519a(RemoteImageView remoteImageView, ImageRequest[] imageRequestArr, boolean z, Config config) {
        if (imageRequestArr == null) {
            C23323e.m76503a(remoteImageView, (int) R.drawable.a_j);
        } else {
            remoteImageView.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32751c(true)).mo32746a((REQUEST[]) imageRequestArr)).mo32730f());
        }
    }
}
