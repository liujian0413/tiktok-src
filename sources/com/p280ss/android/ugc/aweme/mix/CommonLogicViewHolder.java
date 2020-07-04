package com.p280ss.android.ugc.aweme.mix;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p280ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.CommonLogicViewHolder */
public abstract class CommonLogicViewHolder extends JediSimpleViewHolder<Aweme> {

    /* renamed from: f */
    public final DmtTextView f87421f = ((DmtTextView) mo85800a((int) R.id.bzb));

    /* renamed from: g */
    public final int f87422g;

    /* renamed from: j */
    public final int f87423j;

    /* renamed from: k */
    public final View f87424k;

    /* renamed from: l */
    public final C23685d f87425l;

    /* renamed from: m */
    private final RemoteImageView f87426m = ((RemoteImageView) mo85800a((int) R.id.a4l));

    /* renamed from: n */
    private final DmtTextView f87427n = ((DmtTextView) mo85800a((int) R.id.bzd));

    /* renamed from: o */
    private final DmtTextView f87428o = ((DmtTextView) mo85800a((int) R.id.bzf));

    /* renamed from: com.ss.android.ugc.aweme.mix.CommonLogicViewHolder$a */
    static final class C33476a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonLogicViewHolder f87429a;

        /* renamed from: b */
        final /* synthetic */ Aweme f87430b;

        C33476a(CommonLogicViewHolder commonLogicViewHolder, Aweme aweme) {
            this.f87429a = commonLogicViewHolder;
            this.f87430b = aweme;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(this.f87429a.f87424k)) {
                this.f87429a.f87425l.mo61615a(this.f87429a.f87424k, this.f87430b, null);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo85801a(DmtTextView dmtTextView);

    /* renamed from: b */
    public abstract void mo85803b(DmtTextView dmtTextView);

    /* renamed from: q */
    public abstract void mo69905q();

    /* renamed from: p */
    public void mo62390p() {
        mo85801a(this.f87421f);
    }

    /* renamed from: a */
    public final <T extends View> T mo85800a(int i) {
        T findViewById = this.f87424k.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(Aweme aweme) {
        C7573i.m23587b(aweme, "item");
        this.f87424k.setOnClickListener(new C33476a(this, aweme));
        RemoteImageView remoteImageView = this.f87426m;
        Video video = aweme.getVideo();
        C7573i.m23582a((Object) video, "item.video");
        C23323e.m76524b(remoteImageView, video.getCover());
        DmtTextView dmtTextView = this.f87427n;
        Video video2 = aweme.getVideo();
        C7573i.m23582a((Object) video2, "item.video");
        dmtTextView.setText(C33564r.m108441a((long) video2.getDuration()));
        DmtTextView dmtTextView2 = this.f87428o;
        Context context = this.f87424k.getContext();
        AwemeStatistics statistics = aweme.getStatistics();
        C7573i.m23582a((Object) statistics, "item.statistics");
        int i = 0;
        dmtTextView2.setText(context.getString(R.string.cuq, new Object[]{C30537o.m99738a((long) statistics.getPlayCount())}));
        m108230a(this.f87421f, aweme);
        MixStruct mixInfo = aweme.getMixInfo();
        if (mixInfo != null) {
            MixStatusStruct mixStatusStruct = mixInfo.status;
            if (mixStatusStruct != null) {
                i = mixStatusStruct.getViewedInMix();
            }
        }
        if (i != 0) {
            mo85803b(this.f87421f);
        } else {
            mo85801a(this.f87421f);
        }
    }

    /* renamed from: a */
    private void m108230a(DmtTextView dmtTextView, Aweme aweme) {
        C7573i.m23587b(dmtTextView, "descView");
        C7573i.m23587b(aweme, "item");
        dmtTextView.setText(aweme.getDesc());
        C28504t.m93694b(this.f87424k.getContext(), aweme, (TextView) dmtTextView);
    }

    public CommonLogicViewHolder(View view, C23685d dVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(dVar, "onItemClickListener");
        super(view);
        this.f87424k = view;
        this.f87425l = dVar;
        Context context = this.f87424k.getContext();
        C7573i.m23582a((Object) context, "view.context");
        this.f87422g = context.getResources().getColor(R.color.aza);
        Context context2 = this.f87424k.getContext();
        C7573i.m23582a((Object) context2, "view.context");
        this.f87423j = context2.getResources().getColor(R.color.azf);
    }

    /* renamed from: a */
    public final void mo85802a(Aweme aweme, long j) {
        mo69905q();
        if (aweme != null) {
            MixStruct mixInfo = aweme.getMixInfo();
            if (mixInfo != null) {
                MixStatisStruct mixStatisStruct = mixInfo.statis;
                if (mixStatisStruct != null && mixStatisStruct.currentEpisode == j) {
                    mo62390p();
                }
            }
        }
    }
}
