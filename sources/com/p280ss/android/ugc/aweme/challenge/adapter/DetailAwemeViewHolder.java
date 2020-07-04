package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder */
public class DetailAwemeViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a */
    protected Context f62390a;

    /* renamed from: b */
    protected String f62391b;

    /* renamed from: c */
    protected RemoteImageView f62392c;

    /* renamed from: d */
    protected TextView f62393d;

    /* renamed from: e */
    protected TextView f62394e;

    /* renamed from: f */
    protected TextView f62395f;

    /* renamed from: l */
    private DmtTextView f62396l;

    /* renamed from: a */
    public final int[] mo61580a() {
        return C43012cg.m136513a(C34943c.f91127w);
    }

    public final void bB_() {
        if (this.f67534h != null) {
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (mo66486a(video, "DetailAwemeViewHolder")) {
                    this.f67536j = true;
                    return;
                }
                mo66485a(video.getCover(), "DetailAwemeViewHolder");
            }
        }
    }

    /* renamed from: c */
    public final void mo61582c() {
        if (this.f67534h != null) {
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (mo66486a(video, "DetailAwemeViewHolder")) {
                    this.f67536j = true;
                    return;
                }
                mo66485a(video.getCover(), "DetailAwemeViewHolder");
            }
        }
    }

    /* renamed from: a */
    public final void mo61578a(Aweme aweme) {
        this.f62396l.setVisibility(0);
        if (aweme.getStatistics() != null) {
            String a = C36735h.m118415a(aweme.getStatistics().getDiggCount());
            this.f62396l.setText(a);
            this.f62396l.setContentDescription(this.f62390a.getString(R.string.d6h, new Object[]{a}));
        }
    }

    /* renamed from: a */
    private void m77587a(View view, int i) {
        view.setContentDescription(this.f62390a.getString(R.string.fo3, new Object[]{Integer.valueOf(i + 1)}));
    }

    /* renamed from: a */
    protected static void m77588a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) C23486n.m77122a(12.0d));
        textView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setBackground(C23487o.m77131a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) C23486n.m77122a(2.0d)));
        textView.setSingleLine();
    }

    public DetailAwemeViewHolder(View view, String str, final C23685d dVar) {
        super(view);
        this.f62390a = view.getContext();
        this.f62391b = str;
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f62392c = (RemoteImageView) view.findViewById(R.id.b8c);
        this.f62394e = (TextView) view.findViewById(R.id.bcc);
        this.f62395f = (TextView) view.findViewById(R.id.bcf);
        this.f62393d = (TextView) view.findViewById(R.id.bcz);
        this.f62396l = (DmtTextView) view.findViewById(R.id.blt);
        this.f62396l.setVisibility(8);
        this.f67535i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (((Aweme) DetailAwemeViewHolder.this.f67534h).getStatus() == null || !((Aweme) DetailAwemeViewHolder.this.f67534h).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.mo61615a(view, (Aweme) DetailAwemeViewHolder.this.f67534h, DetailAwemeViewHolder.this.f62391b);
                    }
                    return;
                }
                C10761a.m31409e(DetailAwemeViewHolder.this.f62390a, (int) R.string.fo2).mo25750a();
            }
        });
        this.f67535i.setAnimationListener(this.f67532g);
    }

    /* renamed from: a */
    public void mo61579a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        m77587a((View) this.f67535i, i);
        if (aweme != null) {
            this.f67534h = aweme;
            if (z) {
                mo61582c();
            }
            this.f62392c.setVisibility(4);
            this.f62393d.setVisibility(8);
            this.f62394e.setVisibility(8);
            this.f62395f.setVisibility(8);
        }
    }
}
