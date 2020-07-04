package com.p280ss.android.ugc.aweme.main.story.live.p1388a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.a.b */
public final class C33094b implements C33093a {

    /* renamed from: a */
    public List<AvatarWithBorderView> f86097a;

    /* renamed from: b */
    public int f86098b;

    /* renamed from: c */
    public List<UrlModel> f86099c = new ArrayList();

    /* renamed from: d */
    public boolean f86100d;

    /* renamed from: e */
    private ValueAnimator f86101e;

    /* renamed from: b */
    public final void mo64474b() {
        if (this.f86101e != null) {
            this.f86101e.cancel();
            this.f86101e = null;
        }
        this.f86100d = false;
    }

    /* renamed from: c */
    public final void mo64476c() {
        if (this.f86101e != null) {
            this.f86101e.cancel();
        }
    }

    /* renamed from: a */
    public final void mo64470a() {
        if (this.f86097a != null && this.f86099c != null && this.f86099c.size() != 0 && !this.f86100d) {
            if (this.f86101e != null) {
                this.f86101e.start();
                return;
            }
            this.f86098b = 0;
            this.f86101e = ValueAnimator.ofInt(new int[]{0, 2500});
            this.f86101e.setRepeatCount(-1);
            this.f86101e.setRepeatMode(1);
            this.f86101e.setDuration(2500);
            this.f86101e.start();
            this.f86101e.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 510) {
                        float f = (((float) intValue) * 1.0f) / 500.0f;
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        ((AvatarWithBorderView) C33094b.this.f86097a.get(0)).setAlpha(f);
                        ((AvatarWithBorderView) C33094b.this.f86097a.get(0)).setScaleX(f);
                        ((AvatarWithBorderView) C33094b.this.f86097a.get(0)).setScaleY(f);
                        ((AvatarWithBorderView) C33094b.this.f86097a.get(1)).setTranslationX(C9738o.m28708b(C6399b.m19921a(), 21.0f) * f);
                        ((AvatarWithBorderView) C33094b.this.f86097a.get(2)).setTranslationX(C9738o.m28708b(C6399b.m19921a(), 21.0f) * f);
                        ((AvatarWithBorderView) C33094b.this.f86097a.get(3)).setAlpha(1.0f - f);
                    }
                }
            });
            this.f86101e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    C33094b.this.f86100d = false;
                }

                public final void onAnimationStart(Animator animator) {
                    C33094b.this.f86100d = true;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C33094b.this.f86098b = (C33094b.this.f86098b + 1) % C33094b.this.f86099c.size();
                    for (int i = 0; i < C33094b.this.f86097a.size(); i++) {
                        C23323e.m76524b((AvatarWithBorderView) C33094b.this.f86097a.get(3 - i), (UrlModel) C33094b.this.f86099c.get((C33094b.this.f86098b + i) % C33094b.this.f86099c.size()));
                    }
                }
            });
            this.f86100d = true;
        }
    }

    /* renamed from: a */
    public final void mo84814a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f86099c.addAll(list);
            for (int i = 0; i < this.f86097a.size(); i++) {
                C23323e.m76524b((RemoteImageView) this.f86097a.get(i), (UrlModel) this.f86099c.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo64472a(AbsLiveStoryItemView absLiveStoryItemView) {
        View rootView = absLiveStoryItemView.getRootView();
        ArrayList<AvatarWithBorderView> arrayList = new ArrayList<>();
        arrayList.add(rootView.findViewById(R.id.b3s));
        arrayList.add(rootView.findViewById(R.id.b3t));
        arrayList.add(rootView.findViewById(R.id.b3u));
        arrayList.add(rootView.findViewById(R.id.b3v));
        for (AvatarWithBorderView borderColor : arrayList) {
            borderColor.setBorderColor(R.color.a79);
        }
        this.f86097a = arrayList;
    }
}
