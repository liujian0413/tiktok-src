package com.p280ss.android.ugc.aweme.discover.adapter;

import android.os.Build.VERSION;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CoverViewHolder */
public class CoverViewHolder extends AbsAwemeViewHolder {
    int mHeight;
    int mWidth;

    /* renamed from: a */
    public final int[] mo61580a() {
        return C43012cg.m136513a(C34943c.f91127w);
    }

    public final void bB_() {
        if (this.f67534h != null) {
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (mo66486a(video, "CoverViewHolder")) {
                    this.f67536j = true;
                    return;
                }
                mo66485a(video.getCover(), "CoverViewHolder");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67946a(C23685d dVar, View view) {
        if (dVar != null) {
            dVar.mo61615a(view, (Aweme) this.f67534h, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66491a(Aweme aweme, int i) {
        if (aweme != null) {
            super.mo66491a(aweme, i);
            this.f67534h = aweme;
            m84282a(this.f67535i, this.mWidth, this.mHeight);
            bB_();
        }
    }

    public CoverViewHolder(View view, C23685d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.fo);
        this.f67535i.setOnClickListener(new C26484d(this, dVar));
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            this.f67535i.setAnimationListener(this.f67532g);
        }
        if (C6399b.m19944t()) {
            if (VERSION.SDK_INT >= 23) {
                this.f67535i.setForeground(this.f67535i.getContext().getDrawable(R.drawable.nd));
                return;
            }
            C34626j.m111876a(this.f67535i);
        }
    }
}
