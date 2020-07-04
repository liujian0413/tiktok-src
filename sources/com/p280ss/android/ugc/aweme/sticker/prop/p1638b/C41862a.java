package com.p280ss.android.ugc.aweme.sticker.prop.p1638b;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.C17457s;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.p280ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import com.p280ss.android.ugc.aweme.sticker.prop.fragment.C41889k;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.b.a */
public final class C41862a extends C25652b<C25640a<NewFaceStickerListBean>, C41889k> {

    /* renamed from: a */
    private C17457s<C27481e> f108893a;

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            ((C41889k) this.f67572c).mo102904a((NewFaceStickerListBean) this.f67571b.getData());
        }
    }

    public C41862a(C17457s<C27481e> sVar) {
        this.f108893a = sVar;
        mo66536a(new C25640a<NewFaceStickerListBean>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C41862a.m133143a(this.mHandler, objArr[0], objArr[1].intValue());
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C41889k) this.f67572c).mo102905a(exc);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m133142a(String str) throws Exception {
        return (NewFaceStickerListBean) ((StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(StickerPropApi.class)).getStickerDetail(str).get();
    }

    /* renamed from: a */
    public final void mo102899a(Context context, final NewFaceStickerBean newFaceStickerBean) {
        newFaceStickerBean.isFavorite = !newFaceStickerBean.isFavorite;
        ((C27481e) this.f108893a.mo44946a()).mo70633a("default", Collections.singletonList(newFaceStickerBean.f108868id), Boolean.valueOf(newFaceStickerBean.isFavorite), (C43766p) new C43766p() {
            /* renamed from: a */
            public final void mo101169a(C43726c cVar) {
                if (C41862a.this.f67572c != null) {
                    newFaceStickerBean.isFavorite = !newFaceStickerBean.isFavorite;
                    ((C41889k) C41862a.this.f67572c).mo102903a(newFaceStickerBean, cVar);
                }
            }

            /* renamed from: a */
            public final void mo101170a(List<String> list) {
                if (C41862a.this.f67572c != null) {
                    ((C41889k) C41862a.this.f67572c).mo102909b(newFaceStickerBean);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m133143a(Handler handler, String str, int i) {
        C23397p.f61597b.mo60807a(handler, new C41865b(str), 0);
    }
}
