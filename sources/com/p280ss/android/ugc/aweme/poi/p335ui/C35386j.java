package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29351a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29895c;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter.C35008a;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.BubbleLayout;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.j */
public class C35386j<M extends C35118h> extends C29351a<M, C35390l> {

    /* renamed from: o */
    protected C35388a f92824o;

    /* renamed from: p */
    private String f92825p = "poi_page";

    /* renamed from: q */
    private BubbleLayout f92826q;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.j$a */
    public interface C35388a {
        /* renamed from: D */
        C35008a mo89714D();

        /* renamed from: E */
        C29374h mo89715E();

        /* renamed from: a */
        boolean mo89727a(PoiDetail poiDetail);

        /* renamed from: e */
        boolean mo89732e();

        /* renamed from: f */
        String mo89733f();

        /* renamed from: i */
        int mo89735i();

        /* renamed from: j */
        AbsFragment mo89736j();

        /* renamed from: k */
        void mo89737k();

        /* renamed from: q */
        void mo89744q();

        /* renamed from: r */
        void mo89745r();

        /* renamed from: v */
        String mo90106v();

        /* renamed from: w */
        int mo73844w();

        /* renamed from: x */
        String mo73845x();
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return "poi_page";
    }

    /* renamed from: l */
    public final String mo63006l() {
        return this.f92825p;
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        if (this.f67571b != null && this.f67572c != null && ((C35390l) this.f67572c).isViewValid()) {
            ((C35390l) this.f67572c).mo75153a(false);
            int i = ((C35118h) this.f67571b).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                        ((C35390l) this.f67572c).mo75163b(1);
                        return;
                    case 5:
                        ((C35390l) this.f67572c).mo75163b(5);
                        break;
                }
                return;
            }
            ((C35390l) this.f67572c).mo75133a(1);
        }
    }

    /* renamed from: a */
    public final void mo75061a(Aweme aweme, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C7195s a = C7195s.m22438a();
            FragmentActivity activity = mo75080r().getActivity();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(aweme.getAuthorUid());
            a.mo18679a((Activity) activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from", "poi_page").mo18694a("sec_user_id", str2).mo18695a());
            C6903bc.m21486e().mo75377c(aweme, "click_comment_head", str);
        }
    }

    /* renamed from: r */
    public final Fragment mo75080r() {
        return this.f92824o.mo89736j();
    }

    /* renamed from: w */
    private void mo89807w() {
        ((C35390l) this.f67572c).mo75133a(1);
    }

    /* renamed from: v */
    public PoiCouponActivityStruct mo89806v() {
        return ((C35118h) this.f67571b).mo89412d();
    }

    /* renamed from: e */
    public final String mo75068e() {
        if (this.f92824o != null) {
            return ((AbsPoiAwemeFeedFragment) this.f92824o.mo89736j()).mo73845x();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo86797t() {
        PoiQRDetailStruct c = ((C35118h) this.f67571b).mo89409c();
        if (c == null || c.getException() != null || !mo89805u()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public boolean mo89805u() {
        PoiCouponActivityStruct d = ((C35118h) this.f67571b).mo89412d();
        if (d == null || !d.isValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo56977b() {
        if (this.f67571b != null && this.f67572c != null && ((C35390l) this.f67572c).isViewValid()) {
            if (this.f92824o != null) {
                if (mo86797t()) {
                    this.f92824o.mo89737k();
                }
                if (mo75080r().getActivity() != null) {
                    mo89802a((Activity) mo75080r().getActivity());
                }
            }
            int i = ((C35118h) this.f67571b).mListQueryType;
            boolean z = false;
            if (i != 1) {
                switch (i) {
                    case 4:
                    case 5:
                        C35390l lVar = (C35390l) this.f67572c;
                        List items = ((C35118h) this.f67571b).getItems();
                        if (((C35118h) this.f67571b).isHasMore() && !((C35118h) this.f67571b).isNewDataEmpty()) {
                            z = true;
                        }
                        lVar.mo75161b(items, z);
                        break;
                }
            } else if (!((C35118h) this.f67571b).isDataEmpty()) {
                if (this.f92824o != null) {
                    this.f92824o.mo89745r();
                    List items2 = ((C35118h) this.f67571b).getItems();
                    if (!C6307b.m19566a((Collection<T>) items2)) {
                        C34145b bVar = (C34145b) items2.get(0);
                        if (bVar instanceof PoiDetail) {
                            PoiDetail poiDetail = (PoiDetail) bVar;
                            this.f92824o.mo89727a(poiDetail);
                            ((C35390l) this.f67572c).mo90111a(poiDetail);
                        }
                    }
                }
                ((C35390l) this.f67572c).mo75152a(((C35118h) this.f67571b).getItems(), ((C35118h) this.f67571b).isHasMore());
            } else if (((C35118h) this.f67571b).isHasMore()) {
                mo89807w();
            } else {
                ((C35390l) this.f67572c).mo75133a(3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo90104b(RelativeLayout relativeLayout) {
        mo90103a(relativeLayout, (View) this.f92826q);
    }

    public C35386j(C35388a aVar) {
        if (aVar != null) {
            this.f92824o = aVar;
            return;
        }
        throw new IllegalArgumentException("PoiAwemeFeedPresenter should be attached to any Fragment");
    }

    /* renamed from: a */
    public static void m114273a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    @C7709l
    public void onEvent(C29876a aVar) {
        String str;
        if (aVar != null && aVar.f78475d == 1) {
            if (aVar.f78476e == hashCode()) {
                C29895c d = C6903bc.m21485d();
                String str2 = "poi_page";
                Aweme aweme = aVar.f78474c;
                String str3 = "list";
                if (this.f77370l) {
                    str = "click_repost_button";
                } else {
                    str = "click_comment";
                }
                d.mo75951a(str2, aweme, str3, str, true);
            }
            if (this.f77367i != null) {
                this.f77367i.mo62437g();
            }
        }
    }

    /* renamed from: a */
    public static void m114274a(BubbleLayout bubbleLayout) {
        bubbleLayout.setBackgroundColor(0);
        bubbleLayout.setGravity(17);
        bubbleLayout.setNeedPath(true);
        bubbleLayout.setNeedPressFade(false);
        bubbleLayout.setAlpha(0.85f);
        bubbleLayout.mo89999a(0, (float) (bubbleLayout.getWidth() / 2));
    }

    /* renamed from: a */
    public final BubbleLayout mo90102a(RelativeLayout relativeLayout) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        this.f92826q = new BubbleLayout(mo75081s());
        this.f92826q.setVisibility(8);
        DmtTextView dmtTextView = new DmtTextView(mo75081s());
        dmtTextView.setText(mo75080r().getString(R.string.a5y));
        dmtTextView.setTextSize(14.0f);
        dmtTextView.setAlpha(0.9f);
        dmtTextView.setTextColor(mo75080r().getResources().getColor(R.color.sd));
        this.f92826q.addView(dmtTextView);
        relativeLayout.addView(this.f92826q, layoutParams);
        this.f92826q.postDelayed(new C35389k(this, relativeLayout), 3000);
        return this.f92826q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89802a(Activity activity) {
        if (((C35118h) this.f67571b).getData() != null) {
            PoiQRDetailStruct c = ((C35118h) this.f67571b).mo89409c();
            if (c != null && c.getException() != null) {
                C22814a.m75244a((Context) activity, (Throwable) c.getException());
            }
        }
    }

    /* renamed from: a */
    public final void mo75056a(View view, Aweme aweme) {
        super.mo75056a(view, aweme);
        C6903bc.m21486e().mo75373b(aweme, "poi_page", "list");
    }

    /* renamed from: a */
    public final void mo58077a(Context context, Aweme aweme) {
        if (this.f77362d != null) {
            this.f77362d.mo64356a(new C28318an(41, aweme), mo64928a(true));
        }
    }

    /* renamed from: a */
    public final void mo90103a(final RelativeLayout relativeLayout, final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(300);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                relativeLayout.removeView(view);
                Keva repo = Keva.getRepo("poi_repo");
                if (repo != null) {
                    repo.storeLong("collect_display_latest_time", System.currentTimeMillis());
                }
            }
        });
        animatorSet.start();
    }

    /* renamed from: b */
    public final void mo58086b(View view, View view2, Aweme aweme) {
        if (aweme != null) {
            ((C35390l) this.f67572c).mo75154a(true, aweme);
            if (this.f77362d != null) {
                this.f77362d.mo64358b(new C28318an(24, aweme), "click_video_tag", "video_cart_tag", this.f92825p);
                C6903bc.m21486e().mo75378d(aweme, "poi_page");
            }
        }
    }

    /* renamed from: b */
    public final void mo58087b(View view, View view2, Aweme aweme, User user) {
        if (C29363d.m96453c().mo75053b(aweme, user, mo75081s(), mo64928a(true))) {
            C6903bc.m21486e().mo75377c(aweme, "click_name", C33230ac.m107208a(user));
        }
    }

    /* renamed from: a */
    public final void mo58079a(View view, View view2, Aweme aweme, User user) {
        if (C29363d.m96453c().mo75049a(aweme, user, mo75081s(), mo64928a(true))) {
            if (C21740a.m72684a(user)) {
                C6903bc.m21486e().mo75375c(aweme);
                return;
            }
            C6903bc.m21486e().mo75377c(aweme, "click_head", C33230ac.m107208a(user));
        }
    }
}
