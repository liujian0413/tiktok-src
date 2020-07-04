package com.p280ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.BorderLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.RecommendCellCViewHolder */
public class RecommendCellCViewHolder extends AbsCellViewHolder {

    /* renamed from: b */
    private String f74030b;
    BorderLayout borderLayout;

    /* renamed from: c */
    private boolean f74031c;
    TagLayout tagLayout;
    TextView txtCommentCount;
    TextView txtDesc;
    TextView txtLikeCount;

    public final void bB_() {
        mo67071k();
    }

    /* renamed from: m */
    public final boolean mo67073m() {
        return this.f74031c;
    }

    /* renamed from: n */
    public final void mo67074n() {
        m91949p();
    }

    /* renamed from: l */
    public final String mo67072l() {
        if (this.f67534h != null) {
            return ((Aweme) this.f67534h).getAid();
        }
        return "";
    }

    /* renamed from: o */
    private void m91948o() {
        if (this.f73928a != null) {
            Drawable drawable = this.f73928a.getResources().getDrawable(R.drawable.a_x);
            drawable.setBounds(0, (int) C9738o.m28708b(this.f73928a, 0.5f), (int) C9738o.m28708b(this.f73928a, 15.0f), (int) C9738o.m28708b(this.f73928a, 15.5f));
            this.txtLikeCount.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* renamed from: p */
    private void m91949p() {
        if (this.f67534h != null && ((Aweme) this.f67534h).getStatistics() != null) {
            this.txtCommentCount.setText(C36735h.m118415a(((Aweme) this.f67534h).getStatistics().getCommentCount()));
            this.txtLikeCount.setText(C36735h.m118415a(((Aweme) this.f67534h).getStatistics().getDiggCount()));
        }
    }

    /* renamed from: c */
    public final void mo67069c() {
        if (this.f67534h != null) {
            mo67071k();
            if (TextUtils.isEmpty(((Aweme) this.f67534h).getDesc())) {
                this.txtDesc.setVisibility(8);
            } else {
                this.txtDesc.setVisibility(0);
                this.txtDesc.setText(((Aweme) this.f67534h).getDesc());
            }
            User author = ((Aweme) this.f67534h).getAuthor();
            if (!author.isLive() || !C41983b.m133444a()) {
                this.borderLayout.setVisibility(8);
            } else {
                this.borderLayout.setVisibility(0);
                int color = this.borderLayout.getResources().getColor(R.color.a79);
                this.borderLayout.mo60910a(color, color);
                this.borderLayout.setSelected(true);
                C41989d.m133493c(this.f73928a, 0, author.getRequestId(), author.getUid(), author.roomId);
            }
            m91949p();
            this.tagLayout.setEventType(this.f74030b);
            if (((Aweme) this.f67534h).getVideoLabels() != null) {
                this.tagLayout.mo61048a((Aweme) this.f67534h, ((Aweme) this.f67534h).getVideoLabels(), new C23440a(7, 16));
            }
        }
    }

    /* renamed from: d */
    public final void mo67070d(boolean z) {
        this.f74031c = true;
    }

    /* renamed from: a */
    public final void mo67064a(float f) {
        if (this.txtDesc.getAlpha() != f) {
            this.txtDesc.setAlpha(f);
            this.txtLikeCount.setAlpha(f);
            this.txtCommentCount.setAlpha(f);
            this.tagLayout.setAlpha(f);
        }
    }

    public RecommendCellCViewHolder(View view, String str, C23685d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f67536j = true;
        this.f74030b = str;
        view.setOnClickListener(new C28142an(this, view, dVar));
        this.f67535i.setAnimationListener(this.f67532g);
        m91710a(this.f67535i);
        m91948o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71608a(View view, C23685d dVar, View view2) {
        if (((Aweme) this.f67534h).getStatus() == null || !((Aweme) this.f67534h).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo61615a(view, (Aweme) this.f67534h, this.f74030b);
            }
            return;
        }
        C10761a.m31409e(view.getContext(), (int) R.string.fo2).mo25750a();
    }

    /* renamed from: a */
    public final void mo71609a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        if (aweme != null) {
            this.f67534h = aweme;
            this.f74031c = z;
            if (this.f74031c) {
                mo67069c();
            }
        }
    }
}
