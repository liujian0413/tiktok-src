package com.p280ss.android.ugc.aweme.common.adapter;

import android.view.View;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.core.p612c.C12103a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.image.C32029b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43012cg;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder */
public abstract class AbsAwemeViewHolder extends AnimatedViewHolder<Aweme> {

    /* renamed from: g */
    protected C12103a f67532g = new C12103a() {
        /* renamed from: a */
        public final void mo29800a() {
            AbsAwemeViewHolder.this.mo66488e();
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo61580a() {
        return C43012cg.m136513a(C34943c.f91127w);
    }

    /* renamed from: d */
    public final Aweme mo66487d() {
        return (Aweme) this.f67534h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo66488e() {
        if (!this.f67537k && C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            this.f67535i.mo29862c();
        }
    }

    public AbsAwemeViewHolder(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo66486a(Video video, String str) {
        return C32029b.f83787a.mo83005a(this.f67535i, video, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66485a(UrlModel urlModel, String str) {
        C12139r a = C12133n.m35299a(C23400r.m76741a(urlModel));
        int[] a2 = mo61580a();
        if (a2 != null) {
            a.mo29853b(a2);
        }
        a.mo29844a((C12128i) this.f67535i).mo29845a(str).mo29848a();
    }
}
