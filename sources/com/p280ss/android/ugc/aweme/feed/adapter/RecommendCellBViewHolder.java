package com.p280ss.android.ugc.aweme.feed.adapter;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParamProvider.C37387a;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.RecommendCellBViewHolder */
public class RecommendCellBViewHolder extends AbsCellViewHolder implements OnClickListener {
    SmartCircleImageView authorAvatar;

    /* renamed from: b */
    TextView f74009b;

    /* renamed from: c */
    TextView f74010c;

    /* renamed from: d */
    public boolean f74011d;

    /* renamed from: e */
    public boolean f74012e;

    /* renamed from: f */
    private String f74013f;

    /* renamed from: l */
    private boolean f74014l;

    /* renamed from: m */
    private C23685d f74015m;
    LinearLayout mBottomDesc;
    ImageView mMixIcon;
    TagLayout tagLayout;
    TextView txtAuthorName;
    TextView txtDesc;
    TextView txtLikeCount;

    public final void bB_() {
        mo67071k();
    }

    /* renamed from: m */
    public final boolean mo67073m() {
        return this.f74014l;
    }

    /* renamed from: n */
    public final void mo67074n() {
        m91936r();
    }

    /* renamed from: a */
    public final int[] mo61580a() {
        return C43012cg.m136513a(201);
    }

    /* renamed from: l */
    public final String mo67072l() {
        if (this.f67534h != null) {
            return ((Aweme) this.f67534h).getAid();
        }
        return "";
    }

    /* renamed from: g */
    public final boolean mo66498g() {
        if (!this.f74011d || !C6399b.m19944t()) {
            return super.mo66498g();
        }
        return false;
    }

    /* renamed from: r */
    private void m91936r() {
        if (this.f67534h != null && ((Aweme) this.f67534h).getStatistics() != null) {
            this.txtLikeCount.setText(C36735h.m118415a(((Aweme) this.f67534h).getStatistics().getDiggCount()));
        }
    }

    /* renamed from: p */
    private void m91934p() {
        boolean z;
        if (this.f73928a != null) {
            if ((!C6399b.m19944t() || !this.f74011d) && (!this.f74011d || C6399b.m19944t() || C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) != 5)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Drawable drawable = this.f73928a.getResources().getDrawable(R.drawable.a_x);
                drawable.setBounds(0, (int) C9738o.m28708b(this.f73928a, 0.5f), (int) C9738o.m28708b(this.f73928a, 15.0f), (int) C9738o.m28708b(this.f73928a, 15.5f));
                this.txtLikeCount.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }

    /* renamed from: s */
    private void m91937s() {
        if (this.mBottomDesc != null && !C6399b.m19944t()) {
            if (!C6903bc.m21497p().mo86709b() || !((Aweme) this.f67534h).isMixAweme()) {
                switch (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0)) {
                    case 4:
                        this.mBottomDesc.setVisibility(8);
                        return;
                    case 5:
                        this.txtDesc.setVisibility(8);
                        return;
                    default:
                        return;
                }
            } else if (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 4) {
                this.mBottomDesc.setVisibility(0);
            }
        }
    }

    /* renamed from: o */
    public final void mo71605o() {
        String str;
        String str2;
        if (this.f74011d) {
            SearchResultParam a = C37387a.m119990a(this.itemView.getContext());
            String str3 = "search_result_show_video";
            C22984d a2 = C22984d.m75611a();
            String str4 = "enter_from";
            if (this.f74012e) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            C22984d a3 = a2.mo59973a(str4, str);
            String str5 = "search_keyword";
            if (a == null) {
                str2 = "";
            } else {
                str2 = a.getKeyword();
            }
            C6907h.m21524a(str3, (Map) a3.mo59973a(str5, str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(((Aweme) this.f67534h).getRequestId())).mo59973a("group_id", C33230ac.m107238m((Aweme) this.f67534h)).f60753a);
        }
    }

    /* renamed from: q */
    private void m91935q() {
        int i;
        if (!C25329c.m83221d((Aweme) this.f67534h)) {
            if (this.f74010c != null) {
                this.f74010c.setVisibility(8);
            }
            if (this.f74009b != null) {
                this.f74009b.setVisibility(8);
            }
            return;
        }
        AwemeRawAd awemeRawAd = ((Aweme) this.f67534h).getAwemeRawAd();
        if (this.f74010c == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.dbx);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.a_h);
                this.f74010c = (TextView) viewStub.inflate();
            }
        }
        if (this.f74010c != null) {
            if (awemeRawAd.getLabel() == null || TextUtils.isEmpty(awemeRawAd.getLabel().getLabelName())) {
                this.f74010c.setText(R.string.ee);
            } else {
                this.f74010c.setText(awemeRawAd.getLabel().getLabelName());
            }
            TextView textView = this.f74010c;
            if (C25329c.m83224g((Aweme) this.f67534h)) {
                i = 8;
            } else {
                i = 0;
            }
            C9738o.m28712b((View) textView, i);
        }
        if (!TextUtils.isEmpty(awemeRawAd.getTopTitle())) {
            if (this.f74009b == null) {
                ViewStub viewStub2 = (ViewStub) this.itemView.findViewById(R.id.dby);
                if (viewStub2 != null) {
                    viewStub2.setLayoutResource(R.layout.aa3);
                    this.f74009b = (TextView) viewStub2.inflate();
                    this.f74009b.setTextSize(2, 12.0f);
                    this.f74009b.setTextColor(this.f73928a.getResources().getColor(R.color.azd));
                }
            }
            if (this.f74009b != null) {
                this.f74009b.setText(awemeRawAd.getTopTitle());
                this.f74009b.setVisibility(0);
            }
        }
        if (C25329c.m83224g((Aweme) this.f67534h)) {
            C9738o.m28712b((View) this.f74009b, 8);
        }
    }

    /* renamed from: c */
    public final void mo67069c() {
        if (this.f67534h != null) {
            if (this.f74011d && !C6399b.m19944t()) {
                C37656k.m120484a(this.itemView.getContext(), false);
            }
            m91935q();
            mo67071k();
            if (TextUtils.isEmpty(((Aweme) this.f67534h).getDesc())) {
                this.txtDesc.setText("");
                if (this.f74011d) {
                    m91937s();
                } else {
                    this.txtDesc.setVisibility(8);
                }
            } else {
                if (this.mBottomDesc != null) {
                    this.mBottomDesc.setVisibility(0);
                }
                this.txtDesc.setVisibility(0);
                if (TextUtils.equals(this.f74013f, "search_result") && !C6399b.m19944t() && !((Aweme) this.f67534h).isHashTag()) {
                    ((Aweme) this.f67534h).convertChallengeToHashTag();
                }
                if (((Aweme) this.f67534h).getPosition() == null || (this.f74011d && C6399b.m19944t())) {
                    this.txtDesc.setText(((Aweme) this.f67534h).getDesc());
                } else {
                    this.txtDesc.setText(C23472a.m77059a(this.f73928a, ((Aweme) this.f67534h).getDesc(), ((Aweme) this.f67534h).getPosition()));
                }
            }
            C6903bc.m21497p().mo86706a(this.f73928a, (Aweme) this.f67534h, this.txtDesc);
            User author = ((Aweme) this.f67534h).getAuthor();
            if (author != null) {
                if (!this.f74011d) {
                    this.txtAuthorName.setText(author.getNickname());
                } else if (C43122ff.m136755C(author)) {
                    this.txtAuthorName.setText(author.getUniqueId());
                } else {
                    this.txtAuthorName.setText(author.getNickname());
                }
                C12133n.m35299a(C23400r.m76741a(author.getAvatarThumb())).mo29853b(C43012cg.m136513a(100)).mo29845a("AbsCellViewHolder").mo29844a((C12128i) this.authorAvatar).mo29848a();
            }
            if (!((Aweme) this.f67534h).isAwemeFromXiGua()) {
                this.txtLikeCount.setVisibility(0);
                m91936r();
            } else {
                this.txtLikeCount.setVisibility(8);
            }
            this.tagLayout.setEventType(this.f74013f);
            if (((Aweme) this.f67534h).getVideoLabels() != null) {
                this.tagLayout.mo61048a((Aweme) this.f67534h, ((Aweme) this.f67534h).getVideoLabels(), new C23440a(7, 16));
            }
            C6903bc.m21497p().mo86705a(this.f73928a, (Aweme) this.f67534h, this.mMixIcon, this.f74013f, 0);
            if (VERSION.SDK_INT >= 21 && this.f74011d && C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 5) {
                this.itemView.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C23486n.m77122a(2.0d));
                    }
                });
                this.itemView.setClipToOutline(true);
            }
        }
    }

    /* renamed from: d */
    public final void mo67070d(boolean z) {
        this.f74014l = true;
    }

    /* renamed from: a */
    public final void mo67064a(float f) {
        if (this.txtDesc.getAlpha() != f && !this.f74011d) {
            this.txtDesc.setAlpha(f);
            this.txtAuthorName.setAlpha(f);
            this.txtLikeCount.setAlpha(f);
            this.authorAvatar.setAlpha(f);
            this.tagLayout.setAlpha(f);
        }
    }

    /* renamed from: a */
    private void m91933a(View view) {
        String str;
        if (C25329c.m83221d((Aweme) this.f67534h)) {
            AwemeRawAd awemeRawAd = ((Aweme) this.f67534h).getAwemeRawAd();
            int id = view.getId();
            if (id == R.id.a7e) {
                str = "title";
            } else if (id == R.id.hv) {
                str = "photo";
            } else if (id == R.id.hx) {
                str = "name";
            } else if (id == R.id.blt) {
                str = "like";
            } else {
                str = "image";
            }
            C24671f.m80851a().mo64663a(this.f73928a, awemeRawAd.getCreativeIdStr(), str, awemeRawAd.getLogExtra());
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (((Aweme) this.f67534h).getStatus() == null || !((Aweme) this.f67534h).getStatus().isDelete()) {
            if (this.f74015m != null) {
                this.f74015m.mo61615a(this.itemView, (Aweme) this.f67534h, this.f74013f);
            }
            m91933a(view);
            return;
        }
        C10761a.m31409e(this.itemView.getContext(), (int) R.string.fo2).mo25750a();
    }

    public RecommendCellBViewHolder(View view, String str, C23685d dVar) {
        this(view, str, dVar, false);
    }

    /* renamed from: a */
    public final void mo71604a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        if (aweme != null) {
            this.f67534h = aweme;
            this.f74014l = z;
            float f = 0.75f;
            if (TextUtils.isEmpty(((Aweme) this.f67534h).getDesc()) && (!C6903bc.m21497p().mo86709b() || !((Aweme) this.f67534h).isMixAweme())) {
                switch (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0)) {
                    case 4:
                        f = 0.59f;
                        break;
                    case 5:
                        f = 0.63f;
                        break;
                }
            }
            if (!this.f74011d || !(C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 4 || C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 5)) {
                m91710a(this.f67535i);
            } else {
                m91711a(this.f67535i, f);
            }
            if (this.f74014l) {
                mo67069c();
            }
        }
    }

    public RecommendCellBViewHolder(View view, String str, C23685d dVar, boolean z) {
        super(view);
        this.f74011d = z;
        ButterKnife.bind((Object) this, view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f67536j = true;
        this.f74013f = str;
        this.f74015m = dVar;
        view.setOnClickListener(this);
        this.f67535i.setAnimationListener(this.f67532g);
        m91934p();
    }
}
