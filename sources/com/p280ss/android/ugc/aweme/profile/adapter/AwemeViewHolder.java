package com.p280ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.commercialize.C24621e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24945an;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.p280ss.android.ugc.aweme.experiment.C27690d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoControl;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.experiment.C35778a;
import com.p280ss.android.ugc.aweme.profile.service.C36071g;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.profile.util.C36743n;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.AwemeViewHolder */
public class AwemeViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a */
    public String f93530a;

    /* renamed from: b */
    private Context f93531b;

    /* renamed from: c */
    private DmtTextView f93532c;

    /* renamed from: d */
    private View f93533d;

    /* renamed from: e */
    private View f93534e;

    /* renamed from: f */
    private View f93535f;

    /* renamed from: l */
    private TextView f93536l;

    /* renamed from: m */
    private ImageView f93537m;

    /* renamed from: n */
    private TextView f93538n;

    /* renamed from: o */
    private DmtTextView f93539o;

    /* renamed from: p */
    private ViewGroup f93540p;

    /* renamed from: q */
    private View f93541q;

    /* renamed from: r */
    private View f93542r;

    /* renamed from: s */
    private TextView f93543s;

    /* renamed from: t */
    private Drawable f93544t;

    /* renamed from: u */
    private Drawable f93545u;

    /* renamed from: v */
    private Drawable f93546v;

    /* renamed from: w */
    private Drawable f93547w;

    /* renamed from: x */
    private C21098ab f93548x;

    public final void bB_() {
        mo90525c();
    }

    /* renamed from: a */
    public final int[] mo61580a() {
        return C43012cg.m136513a(C34943c.f91127w);
    }

    /* renamed from: k */
    private void m115310k() {
        this.f93539o.setVisibility(8);
        this.f93540p.setVisibility(0);
        if (this.f93541q.getVisibility() == 0) {
            this.f93541q.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo90525c() {
        if (this.f67534h != null) {
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (mo66486a(video, "AwemeViewHolder")) {
                    this.f67536j = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                    this.f67535i.setImageResource(R.color.a5q);
                } else {
                    mo66485a(video.getCover(), "AwemeViewHolder");
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m115308a(Aweme aweme) {
        if (C6399b.m19944t()) {
            return false;
        }
        AwemeStatus status = aweme.getStatus();
        VideoControl videoControl = aweme.getVideoControl();
        if (status != null && status.isInReviewing()) {
            if (this.f93544t == null) {
                this.f93544t = C0683b.m2903a(this.f93531b, (int) R.drawable.axp);
            }
            m115306a(this.f93538n, this.f93544t, null, null, null);
            this.f93538n.setText(R.string.pd);
            this.f93538n.setTextColor(this.f93531b.getResources().getColor(R.color.a5e));
            this.f93538n.setTypeface(Typeface.DEFAULT);
            this.f93538n.setContentDescription(this.f93531b.getString(R.string.pd));
            return true;
        } else if (status != null && !status.isProhibited() && aweme.isPreview() && status.isSelfSee() && status.isReviewed()) {
            if (this.f93544t == null) {
                this.f93544t = C0683b.m2903a(this.f93531b, (int) R.drawable.axp);
            }
            this.f93538n.setCompoundDrawablesWithIntrinsicBounds(this.f93544t, null, null, null);
            this.f93538n.setText(R.string.pe);
            this.f93538n.setTextColor(this.f93531b.getResources().getColor(R.color.a5e));
            this.f93538n.setTypeface(Typeface.DEFAULT);
            this.f93538n.setContentDescription(this.f93531b.getString(R.string.pe));
            return true;
        } else if (videoControl == null || videoControl.timerStatus != 0) {
            return false;
        } else {
            if (this.f93544t == null) {
                this.f93544t = C0683b.m2903a(this.f93531b, (int) R.drawable.axp);
            }
            m115306a(this.f93538n, this.f93544t, null, null, null);
            this.f93538n.setText(R.string.ph);
            this.f93538n.setTextColor(this.f93531b.getResources().getColor(R.color.a5e));
            this.f93538n.setTypeface(Typeface.DEFAULT);
            this.f93538n.setContentDescription(this.f93531b.getString(R.string.ph));
            return true;
        }
    }

    /* renamed from: a */
    public final void mo90524a(String str) {
        C36071g.f94309a.mo91802a(str, ((Aweme) this.f67534h).getAid(), this.f93533d, this.f93534e, this.f93531b);
    }

    /* renamed from: a */
    public static void m115305a(Context context, Aweme aweme) {
        if (!(aweme == null || !C24945an.m81853a().f65782a || aweme.getStarRecommendTag() == null)) {
            C24621e.m80715a().getFeedRawAdLogService().mo64664a(context, "starpage_ad", "othershow", "{}", "cover_tag", aweme.getAdOrderId());
        }
    }

    public AwemeViewHolder(View view, String str, final C23685d dVar) {
        super(view);
        this.f93531b = view.getContext();
        this.f93530a = str;
        this.f93533d = view.findViewById(R.id.a19);
        this.f93534e = view.findViewById(R.id.cie);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f93538n = (TextView) view.findViewById(R.id.dzn);
        this.f93532c = (DmtTextView) view.findViewById(R.id.e3t);
        this.f93535f = view.findViewById(R.id.d_m);
        this.f93536l = (TextView) view.findViewById(R.id.d_n);
        this.f93537m = (ImageView) view.findViewById(R.id.eaw);
        this.f93539o = (DmtTextView) view.findViewById(R.id.clg);
        this.f93540p = (ViewGroup) view.findViewById(R.id.eas);
        this.f93542r = view.findViewById(R.id.d_g);
        this.f93543s = (TextView) view.findViewById(R.id.d_d);
        this.f93541q = view.findViewById(R.id.bwy);
        this.f67535i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!(AwemeViewHolder.this.f67534h == null || dVar == null)) {
                    dVar.mo61615a(view, (Aweme) AwemeViewHolder.this.f67534h, AwemeViewHolder.this.f93530a);
                }
            }
        });
        this.f67535i.setAnimationListener(this.f67532g);
    }

    /* renamed from: a */
    public static boolean m115309a(Aweme aweme, View view, TextView textView) {
        view.setVisibility(8);
        if (!C33230ac.m107241p(aweme)) {
            return false;
        }
        AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
        if (starAtlasInfo == null) {
            return false;
        }
        Context context = view.getContext();
        int reviewStatus = starAtlasInfo.getReviewStatus();
        String str = "";
        switch (reviewStatus) {
            case 1:
                str = context.getString(R.string.e0h);
                break;
            case 2:
                str = context.getString(R.string.e0q);
                break;
            case 3:
                str = context.getString(R.string.e0o);
                break;
            case 4:
                str = context.getString(R.string.e0a);
                break;
            case 6:
                str = context.getString(R.string.e09);
                break;
            case 7:
                str = context.getString(R.string.e0c);
                break;
        }
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
            return false;
        }
        C6907h.m21524a("starmap_cover_review_show", (Map) C22984d.m75611a().mo59973a("group_id", aweme.getAid()).mo59973a("enter_from", "personal_homepage").mo59973a("tag_label", C24621e.m80715a().getAdDataUtilsService().mo65849a(reviewStatus)).f60753a);
        view.setVisibility(0);
        textView.setText(str);
        return true;
    }

    /* renamed from: a */
    private void m115307a(Aweme aweme, boolean z, int i, boolean z2) {
        if (!z2 || (((!z || i != 0) && !C28482e.m93606a(aweme)) || aweme.getStatus().getPrivateStatus() == 0)) {
            this.f93537m.setVisibility(8);
        } else {
            this.f93537m.setVisibility(0);
            if (aweme.getStatus().getPrivateStatus() == 1) {
                this.f93537m.setImageResource(R.drawable.auz);
            } else if (aweme.getStatus().getPrivateStatus() == 2) {
                this.f93537m.setImageResource(R.drawable.aur);
            }
            if (C35778a.m115539a()) {
                this.f93538n.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private static void m115306a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (textView != null) {
            if (VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo90523a(Aweme aweme, int i, boolean z, String str, boolean z2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (aweme != null) {
            this.f67534h = aweme;
            m115310k();
            if (((Aweme) this.f67534h).isProhibited() && C33230ac.m107241p((Aweme) this.f67534h)) {
                this.f93539o.setVisibility(0);
                this.f93540p.setVisibility(8);
                this.f93541q.setVisibility(0);
                if (C6399b.m19945u()) {
                    if (this.f93547w == null) {
                        this.f93547w = C0683b.m2903a(this.f93531b, (int) R.drawable.afj);
                    }
                    this.f93539o.setCompoundDrawablesWithIntrinsicBounds(this.f93547w, null, null, null);
                    this.f93539o.setCompoundDrawablePadding(4);
                } else {
                    this.f93539o.setFontType(C10834d.f29332b);
                }
            }
            if (C6399b.m19945u() && ((Aweme) this.f67534h).isSelfSeeAndShouldTell() && C33230ac.m107241p((Aweme) this.f67534h)) {
                this.f93539o.setVisibility(0);
                this.f93540p.setVisibility(8);
                this.f93541q.setVisibility(0);
                if (this.f93547w == null) {
                    this.f93547w = C0683b.m2903a(this.f93531b, (int) R.drawable.afj);
                }
                this.f93539o.setCompoundDrawablesWithIntrinsicBounds(this.f93547w, null, null, null);
                this.f93539o.setCompoundDrawablePadding(4);
                this.f93539o.setText(R.string.dls);
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (aweme.getIsTop() == 1 && i2 == 0) {
                this.f93532c.setVisibility(0);
            } else {
                this.f93532c.setVisibility(8);
            }
            String starRecommendTag = aweme.getStarRecommendTag();
            if (!TextUtils.isEmpty(starRecommendTag)) {
                this.f93535f.setVisibility(0);
                this.f93536l.setText(starRecommendTag);
            }
            boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo59877d()).booleanValue();
            if (z2 && i2 == 0) {
                this.f93538n.setVisibility(0);
                if (!m115308a(aweme)) {
                    if (statistics == null) {
                        i6 = 0;
                    } else {
                        i6 = statistics.getPlayCount();
                    }
                    String a = C36735h.m118415a(i6);
                    if (this.f93545u == null) {
                        this.f93545u = C0683b.m2903a(this.f93531b, (int) R.drawable.auy);
                    }
                    m115306a(this.f93538n, this.f93545u, null, null, null);
                    this.f93538n.setText(a);
                    this.f93538n.setTextColor(this.f93531b.getResources().getColor(R.color.zg));
                    this.f93538n.setContentDescription(this.f93531b.getString(R.string.d6k, new Object[]{a}));
                }
            } else if (!z2 && i2 == 0 && C6399b.m19944t() && C27690d.m90843a() > 0) {
                this.f93538n.setVisibility(0);
                m115306a(this.f93538n, C0683b.m2903a(this.f93531b, (int) R.drawable.auy), null, null, null);
                if (statistics == null) {
                    i5 = 0;
                } else {
                    i5 = statistics.getPlayCount();
                }
                String a2 = C36735h.m118415a(i5);
                this.f93538n.setText(a2);
                this.f93538n.setContentDescription(this.f93531b.getString(R.string.d6k, new Object[]{a2}));
            } else if (C6399b.m19944t()) {
                this.f93538n.setVisibility(0);
                m115306a(this.f93538n, C0683b.m2903a(this.f93531b, (int) R.drawable.auy), null, null, null);
                if (statistics == null) {
                    i4 = 0;
                } else {
                    i4 = statistics.getPlayCount();
                }
                String a3 = C36735h.m118415a(i4);
                this.f93538n.setText(a3);
                this.f93538n.setContentDescription(this.f93531b.getString(R.string.d6k, new Object[]{a3}));
            } else {
                this.f93538n.setVisibility(0);
                if (!m115308a(aweme)) {
                    if (this.f93546v == null) {
                        this.f93546v = C0683b.m2903a(this.f93531b, (int) R.drawable.aut);
                    }
                    m115306a(this.f93538n, this.f93546v, null, null, null);
                    if (statistics == null) {
                        i3 = 0;
                    } else {
                        i3 = statistics.getDiggCount();
                    }
                    String a4 = C36735h.m118415a(i3);
                    this.f93538n.setText(a4);
                    this.f93538n.setContentDescription(this.f93531b.getString(R.string.d6h, new Object[]{a4}));
                    if (!C36743n.m118431b(i2, z2) || !aweme.isDelete()) {
                        this.f93540p.setBackground(C0683b.m2903a(this.f93531b, (int) R.drawable.l0));
                    } else {
                        this.f93540p.setBackground(null);
                    }
                }
            }
            m115307a(aweme, z2, i2, booleanValue);
            if (m115309a((Aweme) this.f67534h, this.f93542r, this.f93543s) || (C6399b.m19946v() && C32698a.m105818a(aweme))) {
                this.f93538n.setVisibility(8);
            }
            if (z) {
                mo90525c();
                if (!C24945an.m81853a().mo65226d(aweme.getAid())) {
                    C24945an.m81853a().mo65227e(aweme.getAid());
                    m115305a(this.f93531b, aweme);
                }
            }
            this.f67535i.setContentDescription(this.f93531b.getString(R.string.d6l, new Object[]{Integer.valueOf(i + 1)}));
            if (C6399b.m19944t()) {
                if (VERSION.SDK_INT >= 23) {
                    this.f67535i.setForeground(this.itemView.getContext().getDrawable(R.drawable.nd));
                } else {
                    C34626j.m111876a(this.f67535i);
                }
            }
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.amr);
            if (this.f93548x == null) {
                this.f93548x = C21780t.m72808a(false).mo57889a(this.f93531b);
                if (this.f93548x != null) {
                    frameLayout.addView(this.f93548x.mo56936a());
                }
            }
            if (!(this.f93548x == null || aweme == null)) {
                aweme.getUploadMiscInfoStruct();
                aweme.getAid();
            }
            if (VERSION.SDK_INT >= 23) {
                this.f67535i.setForeground(this.itemView.getContext().getDrawable(R.drawable.nd));
            } else {
                C34626j.m111876a(this.f67535i);
            }
        }
    }
}
