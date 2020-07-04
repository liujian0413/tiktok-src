package com.p280ss.android.ugc.aweme.shortvideo.cut.gif;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p280ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.gif.p1553a.C38758b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.h */
public final class C38769h implements IVideo2GifService {
    public final Fragment getGifCutVideoFragment(VideoShare2GifEditContext videoShare2GifEditContext) {
        C7573i.m23587b(videoShare2GifEditContext, "context");
        Video2GifCutFragment a = Video2GifCutFragment.m123760a(videoShare2GifEditContext);
        C7573i.m23582a((Object) a, "Video2GifCutFragment.newInstance(context)");
        return a;
    }

    public final void convert2Gif(VideoShare2GifEditContext videoShare2GifEditContext, ConvertListener convertListener) {
        C7573i.m23587b(videoShare2GifEditContext, "editContext");
        C7573i.m23587b(convertListener, "listener");
        new C38758b();
        C38758b.m123783a(videoShare2GifEditContext, convertListener);
    }
}
