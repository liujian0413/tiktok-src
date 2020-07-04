package com.p280ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C38515bd;
import com.p280ss.android.ugc.aweme.shortvideo.C38516be;
import com.p280ss.android.ugc.aweme.shortvideo.C39359dv;
import com.p280ss.android.ugc.aweme.shortvideo.C39821ey;
import com.p280ss.android.ugc.aweme.shortvideo.C39825f;
import com.p280ss.android.ugc.aweme.shortvideo.C40203p;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.utils.C43130fj;
import com.p280ss.android.ugc.aweme.utils.C43131fk;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.photomovie.j */
public final class C34926j extends C39825f {

    /* renamed from: d */
    private C34920f f91099d = new C34920f();

    /* renamed from: e */
    private TTUploaderService f91100e;

    /* renamed from: f */
    private C39821ey f91101f;

    /* renamed from: a */
    public final void mo88206a() {
        this.f91101f.mo88206a();
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo88204a(Object obj) {
        return this.f91099d.mo88487a(obj);
    }

    /* renamed from: b */
    public final long mo88207b(Object obj) {
        return C34920f.m112563b(obj);
    }

    /* renamed from: d */
    public final boolean mo88492d(Object obj) {
        return C34920f.m112564c(obj);
    }

    /* renamed from: c */
    public final Bitmap mo88209c(Object obj) {
        C43131fk.m136816a();
        return C43131fk.m136817b((String) ((PhotoMovieContext) obj).mImageList.get(0), 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 1);
    }

    /* renamed from: a */
    public final C18253l<VideoCreation> mo88202a(Object obj, SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C34920f.m112562a((PhotoMovieContext) obj, synthetiseResult, linkedHashMap);
        C18253l<VideoCreation> a = this.f91100e.mo96258a(linkedHashMap);
        C18246h.m60214a(a, (C18245g<? super V>) new C38516be<Object>(), (Executor) C23364n.f61448a);
        C18246h.m60214a(a, (C18245g<? super V>) new C38515bd<Object>(), (Executor) C23364n.f61448a);
        return a;
    }

    /* renamed from: a */
    public final C39359dv<VideoCreation> mo88205a(Object obj, VideoCreation videoCreation) {
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        return this.f91101f.mo99240a(photoMovieContext.mOutputVideoPath, photoMovieContext.mCoverStartTm, C36964i.m118933i(), videoCreation);
    }

    public C34926j(TTUploaderService tTUploaderService, int i, int i2) {
        super(i, i2);
        this.f91100e = tTUploaderService;
        this.f91101f = new C39821ey(this.f91100e, i, i2);
        this.f103509a = i;
        this.f103510b = i2;
    }

    /* renamed from: a */
    private C18253l<? extends C38455ap> m112572a(PhotoMovieContext photoMovieContext, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("new_sdk", "1");
        linkedHashMap.put("video_id", videoCreation.materialId);
        C43130fj.m136814a(videoCreation, linkedHashMap);
        return this.f91099d.mo88486a(photoMovieContext, videoCreation, synthetiseResult, linkedHashMap);
    }

    /* renamed from: a */
    public final C18253l<C38455ap> mo88491b(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        return C18246h.m60209a(m112572a((PhotoMovieContext) obj, videoCreation, synthetiseResult), ApiServerException.class, C40203p.m128511a(new C34927k(this, obj, videoCreation, synthetiseResult)), C23364n.f61448a);
    }
}
