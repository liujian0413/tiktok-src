package com.p280ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.LocationCellBViewHolder */
public class LocationCellBViewHolder extends AbsCellViewHolder {

    /* renamed from: b */
    private String f73999b;

    /* renamed from: c */
    private boolean f74000c;
    SmartAvatarImageView mAvHeadView;
    TextView mTvLocation;
    TextView mTvName;
    TagLayout tagLayout;
    TextView txtDistance;

    public final void bB_() {
        mo67071k();
    }

    /* renamed from: m */
    public final boolean mo67073m() {
        return this.f74000c;
    }

    /* renamed from: n */
    public final void mo67074n() {
    }

    /* renamed from: l */
    public final String mo67072l() {
        if (this.f67534h != null) {
            return ((Aweme) this.f67534h).getAid();
        }
        return "";
    }

    /* renamed from: c */
    public final void mo67069c() {
        if (this.f67534h != null) {
            mo67071k();
            C12133n.m35299a(C23400r.m76741a(((Aweme) this.f67534h).getAuthor().getAvatarThumb())).mo29853b(C43012cg.m136513a(100)).mo29852b(true).mo29845a("AbsCellViewHolder").mo29844a((C12128i) this.mAvHeadView).mo29848a();
            this.tagLayout.setEventType(this.f73999b);
            if (((Aweme) this.f67534h).getVideoLabels() != null) {
                this.tagLayout.mo61048a((Aweme) this.f67534h, ((Aweme) this.f67534h).getVideoLabels(), new C23440a(7, 16));
            }
            this.mTvName.setVisibility(0);
            this.mTvName.setText(((Aweme) this.f67534h).getAuthor().getNickname());
            PoiStruct poiStruct = ((Aweme) this.f67534h).getPoiStruct();
            if (poiStruct == null) {
                if (TextUtils.isEmpty(((Aweme) this.f67534h).getDistance())) {
                    this.txtDistance.setVisibility(8);
                } else {
                    this.txtDistance.setVisibility(0);
                    this.txtDistance.setText(((Aweme) this.f67534h).getDistance());
                }
                this.mTvLocation.setVisibility(8);
                return;
            }
            this.txtDistance.setVisibility(8);
            this.mTvLocation.setVisibility(0);
            this.mTvLocation.setText(poiStruct.poiName);
        }
    }

    /* renamed from: d */
    public final void mo67070d(boolean z) {
        this.f74000c = true;
    }

    /* renamed from: a */
    public final void mo67064a(float f) {
        if (this.mTvName.getAlpha() != f) {
            float max = Math.max(0.0f, Math.min(f, 1.0f));
            this.mAvHeadView.setAlpha(max);
            this.mTvLocation.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.txtDistance.setAlpha(max);
            this.tagLayout.setAlpha(max);
        }
    }

    /* renamed from: a */
    public final void mo71601a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        if (aweme != null) {
            this.f67534h = aweme;
            this.f74000c = z;
            if (this.f74000c) {
                mo67069c();
            }
        }
    }

    public LocationCellBViewHolder(View view, String str, C23685d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f67536j = true;
        this.f73999b = str;
        view.setOnClickListener(new C28137ai(this, view, dVar));
        this.f67535i.setAnimationListener(this.f67532g);
        m91710a(this.f67535i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71600a(View view, C23685d dVar, View view2) {
        if (((Aweme) this.f67534h).getStatus() == null || !((Aweme) this.f67534h).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo61615a(view, (Aweme) this.f67534h, this.f73999b);
            }
            return;
        }
        C10761a.m31409e(view.getContext(), (int) R.string.fo2).mo25750a();
    }
}
