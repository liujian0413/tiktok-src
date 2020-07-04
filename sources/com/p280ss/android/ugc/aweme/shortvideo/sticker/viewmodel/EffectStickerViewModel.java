package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40913s;
import com.p280ss.android.ugc.aweme.story.shootvideo.record.p1660a.p1661a.C42027a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import java.util.Collection;
import java.util.List;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel */
public class EffectStickerViewModel extends C0063u {

    /* renamed from: a */
    public C0052o<LiveDataWrapper<List<EffectCategoryResponse>>> f106520a;

    /* renamed from: b */
    public C0052o<LiveDataWrapper<PanelInfoModel>> f106521b;

    /* renamed from: c */
    public C40913s f106522c;

    /* renamed from: d */
    private String f106523d;

    /* renamed from: e */
    private EffectPlatform f106524e;

    /* renamed from: f */
    private C0052o<List<String>> f106525f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel$a */
    static class C40981a implements C40913s {

        /* renamed from: a */
        private LiveData<Boolean> f106538a;

        /* renamed from: b */
        private LiveData<Boolean> f106539b;

        /* renamed from: c */
        private LiveData<Double> f106540c;

        /* renamed from: a */
        public final LiveData<Boolean> mo101191a() {
            return this.f106538a;
        }

        /* renamed from: a */
        public final void mo101192a(List<String> list) {
        }

        /* renamed from: b */
        public final boolean mo101193b() {
            return false;
        }

        /* renamed from: c */
        public final LiveData<Boolean> mo101194c() {
            return this.f106539b;
        }

        /* renamed from: d */
        public final ShortVideoContext mo101195d() {
            return null;
        }

        /* renamed from: e */
        public final boolean mo101196e() {
            return false;
        }

        /* renamed from: f */
        public final AVMusic mo101197f() {
            return null;
        }

        /* renamed from: g */
        public final int mo101198g() {
            return 0;
        }

        /* renamed from: h */
        public final LiveData<Double> mo101199h() {
            return this.f106540c;
        }

        private C40981a() {
            this.f106538a = new C0052o();
            this.f106539b = new C0052o();
            this.f106540c = new C0052o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101288a(EffectPlatform effectPlatform, String str, String str2, Boolean bool, int i, int i2, int i3, String str3, C47870u uVar) throws Exception {
        final C47870u uVar2 = uVar;
        effectPlatform.mo70632a(str, str2, !bool.booleanValue(), i, i2, i3, str3, new C43756f() {
            /* renamed from: a */
            public final void mo70686a(C43726c cVar) {
                uVar2.mo19240a((Throwable) cVar.f113222c);
            }

            /* renamed from: a */
            public final void mo70687a(CategoryPageModel categoryPageModel) {
                if (!C6307b.m19566a((Collection<T>) categoryPageModel.url_prefix)) {
                    EffectStickerViewModel.this.mo101289b().setValue(categoryPageModel.url_prefix);
                }
                uVar2.mo19239a((Object) categoryPageModel.category_effects);
                uVar2.mo19238a();
            }
        });
    }

    /* renamed from: b */
    public final C0052o<List<String>> mo101289b() {
        if (this.f106525f == null) {
            this.f106525f = new C0052o<>();
        }
        return this.f106525f;
    }

    public void onCleared() {
        super.onCleared();
        if (this.f106524e != null) {
            this.f106524e.destroy();
        }
    }

    /* renamed from: c */
    public final void mo101291c() {
        if (this.f106524e != null && this.f106520a != null) {
            m130866c(this.f106524e, this.f106523d);
        }
    }

    /* renamed from: a */
    public final C40913s mo101285a() {
        if (this.f106522c == null) {
            this.f106522c = new C40981a();
        }
        return this.f106522c;
    }

    /* renamed from: b */
    public final void mo101290b(EffectPlatform effectPlatform, String str) {
        m130865a(effectPlatform, str, (C43757g) null);
    }

    /* renamed from: c */
    private void m130866c(final EffectPlatform effectPlatform, final String str) {
        effectPlatform.mo70641b(str, false, new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                EffectStickerViewModel.this.mo101290b(effectPlatform, str);
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("EffectStickerViewModel", sb.toString());
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                if (!C6307b.m19566a((Collection<T>) effectChannelResponse.urlPrefix)) {
                    EffectStickerViewModel.this.mo101289b().setValue(effectChannelResponse.urlPrefix);
                }
                C42027a.f109157b.mo103192a(str, System.currentTimeMillis());
                EffectStickerViewModel.this.f106520a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse.categoryResponseList));
            }
        });
    }

    /* renamed from: a */
    public final C0052o<LiveDataWrapper<PanelInfoModel>> mo101283a(EffectPlatform effectPlatform, String str) {
        if ("livestreaming".equals(str)) {
            final C0052o<LiveDataWrapper<PanelInfoModel>> oVar = new C0052o<>();
            effectPlatform.mo70637a(str, true, "", 0, 0, (C43762l) new C43762l() {
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
        if (this.f106521b == null) {
            this.f106521b = new C0052o<>();
            effectPlatform.mo70637a(str, true, "", 0, 0, (C43762l) new C43762l() {
                /* renamed from: a */
                public final void mo70697a(C43726c cVar) {
                    EffectStickerViewModel.this.f106521b.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
                }

                /* renamed from: a */
                public final void mo70698a(PanelInfoModel panelInfoModel) {
                    EffectStickerViewModel.this.f106521b.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, panelInfoModel));
                }
            });
        }
        return this.f106521b;
    }

    /* renamed from: a */
    private void m130865a(EffectPlatform effectPlatform, String str, C43757g gVar) {
        if (this.f106520a == null) {
            this.f106520a = new C0052o<>();
        }
        effectPlatform.mo70623a(str, (C43757g) new C43757g(null) {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                EffectStickerViewModel.this.f106520a.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
                if (null != null) {
                    null.mo9274a(cVar);
                }
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                if (!C6307b.m19566a((Collection<T>) effectChannelResponse.urlPrefix)) {
                    EffectStickerViewModel.this.mo101289b().setValue(effectChannelResponse.urlPrefix);
                }
                EffectStickerViewModel.this.f106520a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse.categoryResponseList));
                if (null != null) {
                    null.mo9275a(effectChannelResponse);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101287a(EffectPlatform effectPlatform, String str, final C47870u uVar) throws Exception {
        effectPlatform.mo70629a("default", str, (C43751a) new C43751a() {
            /* renamed from: a */
            public final void mo9276a(C43726c cVar) {
                uVar.mo19239a((Object) Boolean.valueOf(false));
                uVar.mo19238a();
            }

            /* renamed from: a */
            public final void mo9277a(boolean z) {
                uVar.mo19239a((Object) Boolean.valueOf(z));
                uVar.mo19238a();
            }
        });
    }

    /* renamed from: a */
    public final C0052o<LiveDataWrapper<CategoryEffectModel>> mo101284a(EffectPlatform effectPlatform, String str, String str2, int i, int i2, int i3, String str3) {
        C0052o<LiveDataWrapper<CategoryEffectModel>> oVar = new C0052o<>();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        EffectPlatform effectPlatform2 = effectPlatform;
        String str4 = str2;
        C7492s a = C7492s.m23282a((C7495v<T>) new C40986b<T>(this, effectPlatform, str4));
        C40987c cVar = new C40987c(this, effectPlatform2, str, str4, 0, 0, 0, str3);
        a.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) cVar).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C40988d<Object>(oVar), (C7326g<? super Throwable>) new C40989e<Object>(oVar));
        return oVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7496w mo101286a(EffectPlatform effectPlatform, String str, String str2, int i, int i2, int i3, String str3, Boolean bool) throws Exception {
        C40990f fVar = new C40990f(this, effectPlatform, str, str2, bool, i, i2, i3, str3);
        return C7492s.m23282a((C7495v<T>) fVar);
    }
}
