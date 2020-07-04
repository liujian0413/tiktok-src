package com.p280ss.android.ugc.aweme.music.presenter;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.MusicCollection;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.n */
public final class C33817n extends C25652b<C25640a<MusicCollection>, C33802d> {
    public C33817n() {
        mo66536a(new C25640a<MusicCollection>() {
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                m108997a(0, PreloadTask.BYTE_UNIT_NUMBER);
                return true;
            }

            /* renamed from: a */
            private void m108997a(int i, int i2) {
                C23397p.m76735a().mo60807a(this.mHandler, new Callable(0, PreloadTask.BYTE_UNIT_NUMBER) {
                    public final Object call() throws Exception {
                        return MusicApi.m108891b(0, PreloadTask.BYTE_UNIT_NUMBER);
                    }
                }, 0);
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        List list;
        if (this.f67572c != null && this.f67571b != null) {
            C33802d dVar = (C33802d) this.f67572c;
            if (this.f67571b.getData() == null) {
                list = null;
            } else {
                list = ((MusicCollection) this.f67571b.getData()).getItems();
            }
            dVar.mo86418a(list);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C33802d) this.f67572c).mo86419d(exc);
        }
    }
}
