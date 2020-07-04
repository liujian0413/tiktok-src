package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29368c;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29875f;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29892k;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.MomentForwardFeedViewHolder */
public class MomentForwardFeedViewHolder extends BaseForwardViewHolder implements C29875f {

    /* renamed from: S */
    View f89351S;

    /* renamed from: T */
    View f89352T;

    /* renamed from: U */
    View f89353U;

    /* renamed from: V */
    ImageView f89354V;

    /* renamed from: W */
    RemoteImageView f89355W;

    /* renamed from: X */
    DmtTextView f89356X;

    /* renamed from: Y */
    View f89357Y;

    /* renamed from: Z */
    MentionTextView f89358Z;

    /* renamed from: aa */
    View f89359aa;

    /* renamed from: ab */
    DmtTextView f89360ab;

    /* renamed from: ac */
    ViewStub f89361ac;

    /* renamed from: a */
    public final void mo75899a(int i) {
    }

    /* renamed from: a */
    public final void mo75900a(C39330h hVar) {
    }

    /* renamed from: b */
    public final void mo75902b(boolean z) {
    }

    /* renamed from: k */
    public final void mo58065k() {
    }

    /* renamed from: n */
    public final KeepSurfaceTextureView mo76057n() {
        return null;
    }

    /* renamed from: o */
    public final View mo76058o() {
        return this.f89355W;
    }

    /* renamed from: p */
    public final int[] mo76059p() {
        return new int[0];
    }

    /* renamed from: q */
    public final void mo76060q() {
    }

    /* renamed from: s */
    public final boolean mo76041s() {
        return true;
    }

    public final void aW_() {
        super.aW_();
        mo75895l();
    }

    /* renamed from: j */
    public final void mo58064j() {
        super.mo58064j();
        mo75893h();
    }

    /* renamed from: u */
    public final void mo76045u() {
        super.mo76045u();
        mo75901a(true);
    }

    /* renamed from: N */
    private void m110806N() {
        this.f89360ab.getPaint().setFakeBoldText(true);
        this.f89360ab.setText(mo76010I());
        C27608b.m90502a((TextView) this.f89360ab);
    }

    /* renamed from: O */
    private void m110807O() {
        if (this.f78552F.getForwardItem().getVideo() != null) {
            C23323e.m76506a(this.f89355W, this.f78552F.getForwardItem().getVideo().getOriginCover(), this.f89355W.getWidth(), this.f89355W.getHeight());
        }
        this.f89354V.setVisibility(0);
    }

    /* renamed from: B */
    public final void mo76006B() {
        if (this.f78552F.getForwardItem() != null && this.f78552F.getForwardItem().getAuthor() != null) {
            m110806N();
            mo76028b(this.f89358Z, this.f78552F.getForwardItem());
        }
    }

    /* renamed from: E */
    public final void mo76008E() {
        if (!C28482e.m93615h(this.f78552F) || !C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false)) {
            C23487o.m77140a((View) this.f78592r, 8);
        } else {
            C23487o.m77140a((View) this.f78592r, 0);
        }
    }

    /* renamed from: J */
    public final void mo76011J() {
        if (VERSION.SDK_INT >= 21) {
            this.f89351S.setOutlineProvider(new C43070ds((int) C9738o.m28708b(mo75888b(), 2.0f)));
            this.f89351S.setClipToOutline(true);
            this.f89355W.setOutlineProvider(new C43070ds((int) C9738o.m28708b(mo75888b(), 2.0f)));
            this.f89355W.setClipToOutline(true);
        }
    }

    /* renamed from: P */
    private void m110808P() {
        List imageInfos = this.f78552F.getForwardItem().getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                if (imageInfo.getLabelLarge() != null) {
                    C6307b.m19566a((Collection<T>) imageInfo.getLabelLarge().getUrlList());
                }
                C23323e.m76506a(this.f89355W, imageInfo.getLabelLarge(), this.f89355W.getWidth(), this.f89355W.getHeight());
            }
        }
        this.f89354V.setVisibility(8);
    }

    /* renamed from: D */
    public final void mo75228D() {
        if (C43168s.m136911c(this.f78552F)) {
            this.f89357Y.setVisibility(0);
            this.f89356X.setVisibility(0);
            this.f89356X.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ase, 0, 0, 0);
            this.f89356X.setText(mo75888b().getString(R.string.b_h));
        } else if (!C21740a.m72687c(this.f78552F) || !C43168s.m136912d(this.f78552F)) {
            this.f89357Y.setVisibility(8);
            this.f89356X.setVisibility(8);
        } else {
            this.f89357Y.setVisibility(0);
            this.f89356X.setVisibility(0);
            this.f89356X.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aym, 0, 0, 0);
            this.f89356X.setText(mo75888b().getString(R.string.e6w));
        }
    }

    /* renamed from: I */
    public final String mo76010I() {
        String str;
        if (this.f78552F.getForwardItem() == null || this.f78552F.getForwardItem().getAuthor() == null) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f78552F.getForwardItem().getAuthor().getRemarkName())) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.f78552F.getForwardItem().getAuthor().getRemarkName());
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("@");
            sb2.append(this.f78552F.getForwardItem().getAuthor().getNickname());
            str = sb2.toString();
        }
        return str;
    }

    /* renamed from: y */
    public final void mo76049y() {
        int i;
        if (this.f78552F != null && this.f78552F.getForwardItem() != null) {
            Aweme forwardItem = this.f78552F.getForwardItem();
            int i2 = 0;
            if (forwardItem.getVideo() != null) {
                i2 = forwardItem.getVideo().getWidth();
                i = forwardItem.getVideo().getHeight();
            } else {
                if (forwardItem.isImage() && forwardItem.getImageInfos() != null) {
                    List imageInfos = forwardItem.getImageInfos();
                    if (imageInfos != null && !imageInfos.isEmpty()) {
                        ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                        if (imageInfo != null) {
                            i2 = imageInfo.getWidth();
                            i = imageInfo.getHeight();
                        }
                    }
                }
                i = 0;
            }
            m110811a(i2, i);
        }
    }

    /* renamed from: Q */
    private void m110809Q() {
        if (this.f78552F != null && this.f78552F.getForwardItem() != null) {
            C7195s a = C7195s.m22438a();
            Activity activity = (Activity) mo75888b();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f78552F.getForwardItem().getAuthorUid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f78552F.getForwardItem().getAuthor().getSecUid()).mo18694a("profile_from", "video_at").mo18694a("video_id", this.f78552F.getForwardItem().getAid()).mo18693a("profile_enterprise_type", this.f78552F.getForwardItem().getEnterpriseType()).mo18695a());
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(2);
            textExtraStruct.setUserId(this.f78552F.getForwardItem().getAuthorUid());
            C34138b.m109965a(mo75888b(), textExtraStruct, this.f78552F, "homepage_follow");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo87018g(View view) {
        m110809Q();
    }

    /* renamed from: a */
    private C29892k m110810a(C29376j jVar) {
        return new C29892k(this, jVar) {
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo87016e(View view) {
        this.f78560N.mo75886g();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void mo87017f(View view) {
        if (!C27326a.m89578a(view) && (this.f78560N instanceof C29892k)) {
            if (this.f78552F.getForwardItem().isImage()) {
                ((C29892k) this.f78560N).mo75935m();
                return;
            }
            ((C29892k) this.f78560N).mo75931l();
        }
    }

    /* renamed from: a */
    public final void mo75901a(boolean z) {
        if (this.f78552F != null && this.f78552F.getForwardItem() != null) {
            this.f89359aa.setBackground(null);
            this.f89351S.setBackgroundColor(mo75888b().getResources().getColor(R.color.a45));
            if (this.f78552F.getForwardItem().isImage()) {
                m110808P();
            } else {
                m110807O();
            }
        }
    }

    /* renamed from: b */
    public final void mo76026b(View view) {
        View findViewById = view.findViewById(R.id.bqy);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + C9738o.m28708b(mo75888b(), 50.0f));
        layoutParams.topMargin = -((int) C9738o.m28708b(mo75888b(), 20.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public final void mo76029c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a8q);
        mo76018a(viewStub.inflate(), 4.0f, 3.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76018a(viewStub2.inflate(), 0.0f, 8.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a8o);
        mo76017a(viewStub3.inflate(), 4.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6q);
        mo76017a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        mo76017a(viewStub5.inflate(), 16.0f);
    }

    /* renamed from: a */
    public final void mo76016a(View view) {
        super.mo76016a(view);
        this.f89351S = view.findViewById(R.id.cwp);
        this.f89352T = view.findViewById(R.id.bkm);
        this.f89353U = view.findViewById(R.id.amd);
        this.f89354V = (ImageView) view.findViewById(R.id.bb4);
        this.f89355W = (RemoteImageView) view.findViewById(R.id.b7x);
        this.f89356X = (DmtTextView) view.findViewById(R.id.dv2);
        this.f89357Y = view.findViewById(R.id.a4i);
        this.f89358Z = (MentionTextView) view.findViewById(R.id.dz3);
        this.f89359aa = view.findViewById(R.id.biq);
        this.f89360ab = (DmtTextView) view.findViewById(R.id.dyk);
        this.f89361ac = (ViewStub) view.findViewById(R.id.dc3);
        if (this.f89360ab != null) {
            this.f89360ab.setOnClickListener(new C34286o(this));
        }
        if (this.f89352T != null) {
            this.f89352T.setOnClickListener(new C34287p(this));
        }
        if (this.f89351S != null) {
            this.f89351S.setOnClickListener(new C34288q(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo87015c(View view, TextExtraStruct textExtraStruct) {
        if (this.f78550D != null) {
            this.f78550D.mo58082a(view, textExtraStruct, this.itemView, this.f78552F);
        }
    }

    /* renamed from: a */
    private void m110811a(int i, int i2) {
        int i3;
        int i4;
        float b = C9738o.m28708b(mo75888b(), 220.0f);
        float b2 = C9738o.m28708b(mo75888b(), 250.0f);
        float f = (float) i2;
        float f2 = b / f;
        float f3 = (float) i;
        float f4 = b2 / f3;
        if (f2 <= f4) {
            float f5 = f3 * f2;
            float f6 = f * f2;
            float f7 = b * 0.75f;
            if (f5 < f7) {
                f5 = f7;
            }
            if (f5 > b2) {
                f5 = b2;
            }
            i4 = (int) f5;
            i3 = (int) f6;
        } else {
            float f8 = f3 * f4;
            float f9 = f * f4;
            if (f9 > b) {
                f9 = b;
            }
            i4 = (int) f8;
            i3 = (int) f9;
        }
        ViewGroup.LayoutParams layoutParams = this.f89352T.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i3;
    }

    /* renamed from: b */
    public final void mo76028b(MentionTextView mentionTextView, Aweme aweme) {
        if (aweme != null) {
            if (TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView.setVisibility(8);
                return;
            }
            if (!C6399b.m19944t() && !aweme.isHashTag()) {
                C21740a.m72693i(aweme);
            }
            mentionTextView.setText(C1642a.m8034a("%s", new Object[]{aweme.getDesc()}));
            mentionTextView.setVisibility(0);
            C27608b.m90502a((TextView) mentionTextView);
            mentionTextView.setSpanSize(C9738o.m28690a(mo75888b(), 15.0f));
            mentionTextView.setSpanStyle(1);
            mentionTextView.setOnSpanClickListener(new C34289r(this));
            mentionTextView.mo105184a(C29368c.m96459a(this.f78552F), (C43346d) new C41656f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public MomentForwardFeedViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        super(followFeedLayout, bVar, eVar, aVar);
        this.f78560N = m110810a(jVar);
        ((LinearLayout) this.f78573a).setGravity(48);
        this.f78597w.setDisplayType(C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8));
    }
}
