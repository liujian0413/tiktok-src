package com.p280ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.experiment.C35778a;
import com.p280ss.android.ugc.aweme.profile.service.C36071g;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.profile.util.C36743n;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.ImageViewHolder */
public class ImageViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a */
    public String f93565a;

    /* renamed from: b */
    private Context f93566b;

    /* renamed from: c */
    private View f93567c;

    /* renamed from: d */
    private View f93568d;

    /* renamed from: e */
    private ImageView f93569e;

    /* renamed from: f */
    private TextView f93570f;

    /* renamed from: l */
    private DmtTextView f93571l;

    /* renamed from: m */
    private ViewGroup f93572m;

    public final void bB_() {
        m115348c();
    }

    /* renamed from: a */
    public final int[] mo61580a() {
        return C43012cg.m136513a(C34943c.f91127w);
    }

    /* renamed from: c */
    private void m115348c() {
        if (this.f67534h != null) {
            List imageInfos = ((Aweme) this.f67534h).getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    C12133n.m35299a(C23400r.m76741a(imageInfo.getLabelThumb())).mo29853b(mo61580a()).mo29844a((C12128i) this.f67535i).mo29836a(this.f67535i.getWidth(), this.f67535i.getHeight()).mo29845a("ImageViewHolder").mo29848a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90537a(String str) {
        C36071g.f94309a.mo91802a(str, ((Aweme) this.f67534h).getAid(), this.f93567c, this.f93568d, this.f93566b);
    }

    public ImageViewHolder(View view, String str, final C23685d dVar) {
        super(view);
        this.f93566b = view.getContext();
        this.f93565a = str;
        this.f93567c = view.findViewById(R.id.a19);
        this.f93568d = view.findViewById(R.id.cie);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f93570f = (TextView) view.findViewById(R.id.dzn);
        this.f93569e = (ImageView) view.findViewById(R.id.eaw);
        this.f93571l = (DmtTextView) view.findViewById(R.id.e3t);
        this.f93572m = (ViewGroup) view.findViewById(R.id.ayb);
        this.f67535i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!(ImageViewHolder.this.f67534h == null || dVar == null)) {
                    dVar.mo61615a(view, (Aweme) ImageViewHolder.this.f67534h, ImageViewHolder.this.f93565a);
                }
            }
        });
        this.f67535i.setAnimationListener(this.f67532g);
    }

    /* renamed from: a */
    private void m115347a(Aweme aweme, boolean z, int i) {
        if (!((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo59877d()).booleanValue() || (((!z || i != 0) && !C28482e.m93606a(aweme)) || aweme.getStatus().getPrivateStatus() == 0)) {
            this.f93569e.setVisibility(8);
        } else {
            this.f93569e.setVisibility(0);
            if (aweme.getStatus().getPrivateStatus() == 1) {
                this.f93569e.setImageResource(R.drawable.auz);
            } else if (aweme.getStatus().getPrivateStatus() == 2) {
                this.f93569e.setImageResource(R.drawable.aur);
            }
            if (C35778a.m115539a()) {
                this.f93570f.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo90536a(Aweme aweme, int i, boolean z, String str, boolean z2, int i2) {
        int i3;
        int i4;
        if (aweme != null) {
            this.f67534h = aweme;
            AwemeStatistics statistics = aweme.getStatistics();
            if (!z2 || i2 != 0) {
                this.f93570f.setVisibility(0);
                this.f93570f.setCompoundDrawablesWithIntrinsicBounds(C0683b.m2903a(this.f93566b, (int) R.drawable.aut), null, null, null);
                if (statistics == null) {
                    i3 = 0;
                } else {
                    i3 = statistics.getDiggCount();
                }
                String a = C36735h.m118415a(i3);
                this.f93570f.setText(a);
                this.f93570f.setContentDescription(this.f93566b.getString(R.string.d6h, new Object[]{a}));
                if (!C36743n.m118431b(i2, z2) || !aweme.isDelete()) {
                    this.f93572m.setBackground(C0683b.m2903a(this.f93566b, (int) R.drawable.l0));
                } else {
                    this.f93572m.setBackground(null);
                }
            } else {
                this.f93570f.setVisibility(0);
                AwemeStatus status = aweme.getStatus();
                if (status == null || !status.isInReviewing() || C6399b.m19944t()) {
                    if (statistics == null) {
                        i4 = 0;
                    } else {
                        i4 = statistics.getPlayCount();
                    }
                    String a2 = C36735h.m118415a(i4);
                    this.f93570f.setCompoundDrawablesWithIntrinsicBounds(C0683b.m2903a(this.f93566b, (int) R.drawable.av3), null, null, null);
                    this.f93570f.setText(a2);
                    this.f93570f.setTextColor(this.f93566b.getResources().getColor(R.color.zg));
                    this.f93570f.setTypeface(Typeface.SANS_SERIF, 2);
                    this.f93570f.setContentDescription(this.f93566b.getString(R.string.d6k, new Object[]{a2}));
                } else {
                    this.f93570f.setCompoundDrawablesWithIntrinsicBounds(C0683b.m2903a(this.f93566b, (int) R.drawable.axp), null, null, null);
                    this.f93570f.setText(R.string.pd);
                    this.f93570f.setTextColor(this.f93566b.getResources().getColor(R.color.a5e));
                    this.f93570f.setTypeface(Typeface.DEFAULT);
                    this.f93570f.setContentDescription(this.f93566b.getString(R.string.pd));
                }
            }
            m115347a(aweme, z2, i2);
            if (aweme.getIsTop() == 1) {
                this.f93571l.setVisibility(0);
            } else {
                this.f93571l.setVisibility(8);
            }
            if (z) {
                m115348c();
            }
            this.f67535i.setContentDescription(this.f93566b.getString(R.string.d6j, new Object[]{Integer.valueOf(i + 1)}));
        }
    }
}
