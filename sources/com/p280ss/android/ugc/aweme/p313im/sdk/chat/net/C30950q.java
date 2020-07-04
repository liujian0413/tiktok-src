package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.squareup.okhttp.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.q */
public final class C30950q extends C30982z {

    /* renamed from: a */
    public static int f81048a;

    /* renamed from: c */
    private C6309f f81049c;

    /* renamed from: d */
    private OnlyPictureContent f81050d;

    /* renamed from: e */
    private Message f81051e;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo81307b() {
        C31863ai.m103533b(this.f81051e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo81309c() {
        C31863ai.m103533b(this.f81051e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo81310d() {
        C31863ai.m103535c(this.f81051e);
    }

    /* renamed from: a */
    public final void mo18259a(String str) {
        super.mo18259a(str);
        f81048a++;
        C31858ad.m103406a().mo82715a(this.f81051e);
        this.f81051e.setMsgStatus(3);
        this.f81049c.post(new C30953t(this));
    }

    /* renamed from: a */
    public final void mo18261a(Throwable th) {
        super.mo18261a(th);
        f81048a++;
        C31858ad.m103406a().mo82715a(this.f81051e);
        this.f81051e.setMsgStatus(3);
        this.f81049c.post(new C30952s(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81308b(String str, UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            this.f81050d.setUrl(urlModel);
            this.f81051e.setContent(C31913m.m103668a(this.f81050d));
            this.f81049c.post(new C30951r(this));
            super.mo81308b(str, urlModel);
        }
    }

    public C30950q(OkHttpClient okHttpClient, C6309f fVar, OnlyPictureContent onlyPictureContent, Message message) {
        super(okHttpClient);
        this.f81049c = fVar;
        this.f81050d = onlyPictureContent;
        this.f81105b = onlyPictureContent.getPicturePath();
        if (!onlyPictureContent.isSendRaw() && !TextUtils.isEmpty(onlyPictureContent.getCompressPath())) {
            this.f81105b = onlyPictureContent.getCompressPath();
        }
        this.f81051e = message;
        this.f81000f = m100663a(message);
    }
}
