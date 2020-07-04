package com.p280ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40493be;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40996b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.ag */
public final class C44453ag implements C40996b {

    /* renamed from: c */
    public static final C44455a f114718c = new C44455a(null);

    /* renamed from: a */
    public Effect f114719a;

    /* renamed from: b */
    public RemoteImageView f114720b;

    /* renamed from: d */
    private RemoteImageView f114721d;

    /* renamed from: e */
    private OnClickListener f114722e;

    /* renamed from: com.ss.android.ugc.gamora.recorder.ag$a */
    public static final class C44455a {
        private C44455a() {
        }

        public /* synthetic */ C44455a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C40996b m140627a(AppCompatActivity appCompatActivity, C0043i iVar, View view, OnClickListener onClickListener) {
            C7573i.m23587b(appCompatActivity, "activity");
            C7573i.m23587b(iVar, "owner");
            C7573i.m23587b(view, "rooView");
            C7573i.m23587b(onClickListener, "clickListener");
            C44453ag agVar = new C44453ag(appCompatActivity, iVar, (ViewGroup) view.findViewById(R.id.acw), (RemoteImageView) view.findViewById(R.id.bd4), (RemoteImageView) view.findViewById(R.id.bd5), onClickListener);
            return agVar;
        }
    }

    /* renamed from: a */
    public final void mo101314a() {
        if (this.f114721d != null) {
            RemoteImageView remoteImageView = this.f114721d;
            if (remoteImageView == null) {
                C7573i.m23580a();
            }
            if (remoteImageView.getVisibility() == 0) {
                RemoteImageView remoteImageView2 = this.f114721d;
                if (remoteImageView2 == null) {
                    C7573i.m23580a();
                }
                remoteImageView2.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo101317b(Effect effect) {
        this.f114719a = effect;
    }

    /* renamed from: a */
    public final void mo101315a(Effect effect) {
        if (effect != null) {
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl != null) {
                List urlList = iconUrl.getUrlList();
                if (urlList != null && !C6311g.m19573a(urlList)) {
                    C23323e.m76514a(this.f114720b, (String) urlList.get(0));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo101316a(boolean z) {
        float f;
        RemoteImageView remoteImageView = this.f114720b;
        if (remoteImageView != null) {
            remoteImageView.setEnabled(z);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            remoteImageView.setAlpha(f);
        }
    }

    public C44453ag(AppCompatActivity appCompatActivity, C0043i iVar, ViewGroup viewGroup, RemoteImageView remoteImageView, RemoteImageView remoteImageView2, OnClickListener onClickListener) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(onClickListener, "clickListener");
        this.f114720b = remoteImageView;
        this.f114721d = remoteImageView2;
        this.f114722e = onClickListener;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f114722e);
            if (this.f114720b != null) {
                RemoteImageView remoteImageView3 = this.f114720b;
                if (remoteImageView3 == null) {
                    C7573i.m23580a();
                }
                viewGroup.setOnTouchListener(new C40493be(1.2f, 150, remoteImageView3));
            }
        }
        C0063u a = C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(CurUseStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
        ((CurUseStickerViewModel) a).mo101274a().observe(iVar, new C0053p<Effect>(this) {

            /* renamed from: a */
            final /* synthetic */ C44453ag f114723a;

            {
                this.f114723a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Effect effect) {
                if (effect != null) {
                    RemoteImageView remoteImageView = this.f114723a.f114720b;
                    UrlModel iconUrl = effect.getIconUrl();
                    C7573i.m23582a((Object) iconUrl, "effect.iconUrl");
                    C23323e.m76514a(remoteImageView, (String) iconUrl.getUrlList().get(0));
                    return;
                }
                if (this.f114723a.f114719a != null) {
                    RemoteImageView remoteImageView2 = this.f114723a.f114720b;
                    Effect effect2 = this.f114723a.f114719a;
                    if (effect2 == null) {
                        C7573i.m23580a();
                    }
                    UrlModel iconUrl2 = effect2.getIconUrl();
                    C7573i.m23582a((Object) iconUrl2, "defaultEffect!!.iconUrl");
                    C23323e.m76514a(remoteImageView2, (String) iconUrl2.getUrlList().get(0));
                }
            }
        });
    }
}
