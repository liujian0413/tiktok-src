package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.favorites.p1211b.C27742a;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.o */
public interface C40889o {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.o$a */
    public static class C40890a implements OnClickListener, C40889o {

        /* renamed from: a */
        public String f106340a;

        /* renamed from: b */
        public AppCompatActivity f106341b;

        /* renamed from: c */
        public EffectStickerManager f106342c;

        /* renamed from: d */
        public ShortVideoContext f106343d;

        /* renamed from: e */
        private FrameLayout f106344e;

        /* renamed from: f */
        private CheckableImageView f106345f;

        /* renamed from: g */
        private Drawable f106346g;

        /* renamed from: h */
        private Drawable f106347h;

        /* renamed from: i */
        private List<Effect> f106348i;

        /* renamed from: b */
        private void m130662b() {
            this.f106345f.mo86446b();
        }

        /* renamed from: a */
        public final void mo101162a() {
            ((FavoriteStickerViewModel) C0069x.m159a((FragmentActivity) this.f106341b).mo147a(FavoriteStickerViewModel.class)).mo101297a(this.f106342c.f104787e, this.f106340a).observe(this.f106341b, new C40895p(this));
        }

        /* renamed from: a */
        public final void mo101163a(Effect effect) {
            mo101166b(mo101167b(effect));
        }

        /* renamed from: b */
        public final boolean mo101167b(Effect effect) {
            if (this.f106348i == null || !this.f106348i.contains(effect)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static void m130663c(Effect effect) {
            if (effect != null) {
                NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
                newFaceStickerBean.f108868id = effect.getId();
                C7705c.m23799a().mo20394d(new C27742a(newFaceStickerBean));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo101165a(LiveDataWrapper liveDataWrapper) {
            if (liveDataWrapper != null && liveDataWrapper.f88767a != null) {
                this.f106348i = ((FetchFavoriteListResponse) liveDataWrapper.f88767a).getEffects();
            }
        }

        /* renamed from: b */
        public final void mo101166b(boolean z) {
            if (z) {
                this.f106345f.setImageDrawable(this.f106346g);
            } else {
                this.f106345f.setImageDrawable(this.f106347h);
            }
        }

        /* renamed from: a */
        public final void mo101164a(boolean z) {
            C40823l.m130437a().f106156a = z;
            if (z) {
                if (this.f106341b != null && !this.f106341b.isFinishing()) {
                    C40823l.m130437a().mo101088a(this.f106344e.findViewById(R.id.bjz), (Activity) this.f106341b);
                }
                this.f106344e.setVisibility(0);
                return;
            }
            this.f106344e.setVisibility(8);
        }

        public final void onClick(View view) {
            Bundle bundle;
            ClickInstrumentation.onClick(view);
            String string = this.f106341b.getString(R.string.b4r);
            if (!C35574k.m114859a().mo70073G().mo57090c()) {
                C21164d G = C35574k.m114859a().mo70073G();
                AppCompatActivity appCompatActivity = this.f106341b;
                String str = "favorite_sticker";
                String str2 = "click_favorite_prop";
                if (C30538p.m99745a()) {
                    bundle = null;
                } else {
                    bundle = C42914ab.m136242a().mo104633a("login_title", string).f111445a;
                }
                G.mo57085a((Activity) appCompatActivity, str, str2, bundle, (C21165a) new C21165a() {
                    /* renamed from: b */
                    public final void mo57094b() {
                    }

                    /* renamed from: a */
                    public final void mo57093a() {
                        C40890a.this.mo101162a();
                    }
                });
                return;
            }
            m130662b();
        }

        public C40890a(EffectStickerManager effectStickerManager, String str, AppCompatActivity appCompatActivity, FrameLayout frameLayout, CheckableImageView checkableImageView, ShortVideoContext shortVideoContext) {
            this.f106342c = effectStickerManager;
            this.f106341b = appCompatActivity;
            this.f106344e = frameLayout;
            this.f106345f = checkableImageView;
            this.f106344e.setOnClickListener(this);
            this.f106340a = str;
            this.f106343d = shortVideoContext;
            C42111b.f109618a.mo103541a(false);
            C42111b.f109618a.mo103546b(false);
            if (C6399b.m19944t() && TextUtils.equals(this.f106340a, "livestreaming")) {
                this.f106341b.getResources().getColor(R.color.a76);
                this.f106341b.getResources().getColor(R.color.az3);
            }
            if (C40881d.m130626a(this.f106340a)) {
                this.f106341b.getResources().getColor(R.color.a76);
                this.f106341b.getResources().getColor(R.color.az3);
            }
            this.f106346g = C0727a.m3116g(this.f106341b.getResources().getDrawable(R.drawable.aiw));
            this.f106347h = C0727a.m3116g(this.f106341b.getResources().getDrawable(R.drawable.aiu));
            mo101162a();
            this.f106345f.setOnStateChangeListener(new C33833a() {

                /* renamed from: a */
                public Effect f106349a;

                /* renamed from: c */
                private Effect f106351c;

                /* renamed from: a */
                public final void mo61810a() {
                    if (this.f106349a != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f106349a.getEffectId());
                        C40890a.m130663c(this.f106349a);
                        if (C40890a.this.mo101167b(this.f106349a)) {
                            ((FavoriteStickerViewModel) C0069x.m159a((FragmentActivity) C40890a.this.f106341b).mo147a(FavoriteStickerViewModel.class)).mo101299b(this.f106349a);
                            C40890a.this.f106342c.f104787e.mo70633a(C40890a.this.f106340a, (List<String>) arrayList, Boolean.valueOf(false), (C43766p) new C43766p() {
                                /* renamed from: a */
                                public final void mo101169a(C43726c cVar) {
                                    ((FavoriteStickerViewModel) C0069x.m159a((FragmentActivity) C40890a.this.f106341b).mo147a(FavoriteStickerViewModel.class)).mo101298a(C408911.this.f106349a);
                                }

                                /* renamed from: a */
                                public final void mo101170a(List<String> list) {
                                    C35574k.m114859a().mo70081O().mo90370a(C408911.this.f106349a.getId(), false);
                                }
                            });
                            return;
                        }
                        if (C40890a.this.f106343d != null) {
                            C42962b.f111525a.mo104671a("prop_save", C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59973a("enter_method", "click_main_panel").mo59973a("creation_id", C40890a.this.f106343d.f99787w).mo59973a("shoot_way", C40890a.this.f106343d.f99788x).mo59970a("draft_id", C40890a.this.f106343d.f99790z).mo59973a("prop_id", this.f106349a.getEffectId()).f60753a);
                            if (this.f106351c != null) {
                                C42962b.f111525a.mo104671a("prop_save", C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59973a("enter_method", "click_banner").mo59973a("creation_id", C40890a.this.f106343d.f99787w).mo59973a("shoot_way", C40890a.this.f106343d.f99788x).mo59970a("draft_id", C40890a.this.f106343d.f99790z).mo59973a("parent_pop_id", this.f106351c.getParentId()).mo59973a("prop_id", this.f106351c.getEffectId()).f60753a);
                            }
                        }
                        ((FavoriteStickerViewModel) C0069x.m159a((FragmentActivity) C40890a.this.f106341b).mo147a(FavoriteStickerViewModel.class)).mo101298a(this.f106349a);
                        C40890a.this.f106342c.f104787e.mo70633a(C40890a.this.f106340a, (List<String>) arrayList, Boolean.valueOf(true), (C43766p) new C43766p() {
                            /* renamed from: a */
                            public final void mo101169a(C43726c cVar) {
                                ((FavoriteStickerViewModel) C0069x.m159a((FragmentActivity) C40890a.this.f106341b).mo147a(FavoriteStickerViewModel.class)).mo101299b(C408911.this.f106349a);
                            }

                            /* renamed from: a */
                            public final void mo101170a(List<String> list) {
                                C35574k.m114859a().mo70081O().mo90370a(C408911.this.f106349a.getId(), true);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo61811a(int i) {
                    if (i == 0) {
                        this.f106351c = C40890a.this.f106342c.f104790h;
                        this.f106349a = C40890a.this.f106342c.f104783a;
                    }
                    if (i == 1) {
                        C40890a.this.mo101166b(true ^ C40890a.this.mo101167b(C40890a.this.f106342c.f104783a));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    void mo101162a();

    /* renamed from: a */
    void mo101163a(Effect effect);

    /* renamed from: a */
    void mo101164a(boolean z);
}
