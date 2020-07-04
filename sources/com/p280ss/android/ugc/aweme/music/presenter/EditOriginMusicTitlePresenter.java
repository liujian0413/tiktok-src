package com.p280ss.android.ugc.aweme.music.presenter;

import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter */
public final class EditOriginMusicTitlePresenter {

    /* renamed from: a */
    public C33798b f88175a;

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi */
    interface MusicTitleApi {
        @C6456g
        @C6468s(mo15750a = "/aweme/v1/music/update/")
        C7492s<C33797a> alterMusicTitle(@C6454e(mo15737a = "music_id") String str, @C6454e(mo15737a = "title") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a */
    public static class C33797a {

        /* renamed from: a */
        public int f88177a;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$b */
    public interface C33798b {
        /* renamed from: a */
        void mo86414a();

        /* renamed from: b */
        void mo86415b();
    }

    public EditOriginMusicTitlePresenter(C33798b bVar) {
        this.f88175a = bVar;
    }

    /* renamed from: a */
    public final void mo86412a(String str, String str2) {
        ((MusicTitleApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(MusicTitleApi.class)).alterMusicTitle(str, str2).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<C33797a>() {
            public final void onComplete() {
            }

            public final void onSubscribe(C7321c cVar) {
            }

            public final void onError(Throwable th) {
                if (EditOriginMusicTitlePresenter.this.f88175a != null) {
                    EditOriginMusicTitlePresenter.this.f88175a.mo86415b();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(C33797a aVar) {
                if (EditOriginMusicTitlePresenter.this.f88175a != null) {
                    if (aVar.f88177a == 0) {
                        EditOriginMusicTitlePresenter.this.f88175a.mo86414a();
                    } else {
                        EditOriginMusicTitlePresenter.this.f88175a.mo86415b();
                    }
                }
            }
        });
    }
}
