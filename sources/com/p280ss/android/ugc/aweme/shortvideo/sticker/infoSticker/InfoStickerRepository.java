package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p1606a.C40678a;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43752b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43753c;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43763m;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository */
public final class InfoStickerRepository {

    /* renamed from: a */
    private EffectPlatform f105697a;

    /* renamed from: b */
    private IRetrofit f105698b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());

    /* renamed from: c */
    private Queue<Effect> f105699c = new LinkedBlockingQueue();

    /* renamed from: d */
    private Effect f105700d;

    /* renamed from: e */
    private boolean f105701e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository$RetrofitService */
    interface RetrofitService {
        @C7730f(mo20420a = "/aweme/v1/info/sticker/")
        C18253l<C40691ai> getTemperature(@C7744t(mo20436a = "longitude") double d, @C7744t(mo20436a = "latitude") double d2);
    }

    /* renamed from: b */
    public final void mo100793b() {
        this.f105701e = false;
    }

    /* renamed from: a */
    public final void mo100788a(final C0052o<LiveDataWrapper<EffectChannelResponse>> oVar, String str) {
        this.f105697a.mo70623a(str, (C43757g) new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                oVar.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse));
            }
        });
    }

    /* renamed from: a */
    public final void mo100789a(List<Effect> list, boolean z) {
        this.f105699c.addAll(list);
        m129990b(z);
    }

    /* renamed from: a */
    public final void mo100790a(boolean z) {
        if (!this.f105701e) {
            this.f105701e = true;
            m129990b(z);
        }
    }

    /* renamed from: a */
    public final void mo100787a() {
        this.f105699c.clear();
    }

    /* renamed from: c */
    public final void mo100794c() {
        m129990b(false);
    }

    /* renamed from: b */
    public static LiveData<LiveDataWrapper<AVChallenge>> m129989b(String str) {
        C0052o oVar = new C0052o();
        C35574k.m114859a().mo70103r().mo83166a(str, null, 0, 0, new C40812r(oVar));
        return oVar;
    }

    /* renamed from: b */
    private void m129990b(boolean z) {
        while (this.f105701e) {
            this.f105700d = (Effect) this.f105699c.poll();
            if (this.f105700d != null) {
                if (!StickerWrapper.m129075a(this.f105700d, (C27481e) this.f105697a, z)) {
                    this.f105697a.mo70620a(this.f105700d, (C43760j) new C43760j() {
                        /* renamed from: b */
                        public final void mo9282b(Effect effect) {
                        }

                        /* renamed from: a */
                        public final void mo9280a(Effect effect) {
                            InfoStickerRepository.this.mo100794c();
                        }

                        /* renamed from: a */
                        public final void mo9281a(Effect effect, C43726c cVar) {
                            InfoStickerRepository.this.mo100794c();
                        }
                    });
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<Effect>> mo100781a(Effect effect) {
        final C0052o oVar = new C0052o();
        if (StickerWrapper.m129074a(effect, (C27481e) this.f105697a)) {
            oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effect));
            return oVar;
        }
        this.f105697a.mo70620a(effect, (C43760j) new C40678a("info_sticker_download_error_rate", new C43755e() {
            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effect));
            }

            /* renamed from: b */
            public final void mo9282b(Effect effect) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, effect));
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                oVar.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }

            /* renamed from: a */
            public final void mo70696a(Effect effect, int i, long j) {
                oVar.setValue(LiveDataWrapper.m109597a(STATUS.PROGRESS, effect, i));
            }
        }));
        return oVar;
    }

    public InfoStickerRepository(Context context) {
        this.f105697a = new EffectPlatform(context, C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final LiveData<LiveDataWrapper<ProviderEffect>> mo100782a(ProviderEffect providerEffect) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70621a(providerEffect, (C43752b) new C43753c() {
            /* renamed from: a */
            public final void mo100797a(ProviderEffect providerEffect) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, providerEffect));
            }

            /* renamed from: a */
            public final void mo100799a(ProviderEffect providerEffect, C43726c cVar) {
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("InfoStickerRepository", sb.toString());
                oVar.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }

            /* renamed from: a */
            public final void mo100798a(ProviderEffect providerEffect, int i, long j) {
                oVar.setValue(LiveDataWrapper.m109597a(STATUS.PROGRESS, providerEffect, i));
            }
        });
        return oVar;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<EffectChannelResponse>> mo100783a(final String str) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70641b(str, false, new C43757g() {
            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse));
            }

            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                InfoStickerRepository.this.mo100788a(oVar, str);
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("InfoStickerRepository", sb.toString());
            }
        });
        return oVar;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<C40691ai>> mo100780a(double d, double d2) {
        final C0052o oVar = new C0052o();
        C18246h.m60214a(((RetrofitService) this.f105698b.create(RetrofitService.class)).getTemperature(d, d2), (C18245g<? super V>) new C18245g<C40691ai>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C40691ai aiVar) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, aiVar));
            }

            public final void onFailure(Throwable th) {
                oVar.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, th));
            }
        }, (Executor) C23364n.f61448a);
        return oVar;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<ProviderEffectModel>> mo100784a(String str, int i, int i2) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70635a(str, false, i, i2, (C43763m) new C43763m() {
            /* renamed from: a */
            public final void mo100796a(ProviderEffectModel providerEffectModel) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, providerEffectModel));
            }

            /* renamed from: a */
            public final void mo100795a(C43726c cVar) {
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("InfoStickerRepository", sb.toString());
                oVar.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }
        });
        return oVar;
    }

    /* renamed from: b */
    public final LiveData<LiveDataWrapper<ProviderEffectModel>> mo100791b(String str, String str2, int i, int i2) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70627a(str, str2, i, i2, (C43763m) new C43763m() {
            /* renamed from: a */
            public final void mo100796a(ProviderEffectModel providerEffectModel) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, providerEffectModel));
            }

            /* renamed from: a */
            public final void mo100795a(C43726c cVar) {
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("InfoStickerRepository", sb.toString());
                oVar.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }
        });
        return oVar;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<PanelInfoModel>> mo100785a(String str, String str2, int i, int i2) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70637a(str, true, str2, i, i2, (C43762l) new C43762l() {
            /* renamed from: a */
            public final void mo70697a(C43726c cVar) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
            }

            /* renamed from: a */
            public final void mo70698a(PanelInfoModel panelInfoModel) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, panelInfoModel));
            }
        });
        return oVar;
    }

    /* renamed from: b */
    public final LiveData<LiveDataWrapper<CategoryPageModel>> mo100792b(String str, String str2, int i, int i2, int i3, String str3) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70626a(str, str2, i, i2, i3, str3, new C43756f() {
            /* renamed from: a */
            public final void mo70686a(C43726c cVar) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
            }

            /* renamed from: a */
            public final void mo70687a(CategoryPageModel categoryPageModel) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, categoryPageModel));
            }
        });
        return oVar;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<CategoryEffectModel>> mo100786a(String str, String str2, int i, int i2, int i3, String str3) {
        final C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f105697a.mo70632a(str, str2, true, i, i2, i3, str3, new C43756f() {
            /* renamed from: a */
            public final void mo70687a(CategoryPageModel categoryPageModel) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, categoryPageModel.category_effects));
            }

            /* renamed from: a */
            public final void mo70686a(C43726c cVar) {
                oVar.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("InfoStickerRepository", sb.toString());
            }
        });
        return oVar;
    }
}
