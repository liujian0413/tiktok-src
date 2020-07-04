package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.C41067c;
import dmt.p1861av.video.C47516v;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$initView$3 */
public final class SubtitleModule$initView$3 extends C1281m {

    /* renamed from: a */
    public boolean f106938a;

    /* renamed from: b */
    public boolean f106939b;

    /* renamed from: c */
    final /* synthetic */ SubtitleModule f106940c;

    SubtitleModule$initView$3(SubtitleModule subtitleModule) {
        this.f106940c = subtitleModule;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        switch (i) {
            case 0:
                if (this.f106939b) {
                    this.f106939b = false;
                    this.f106940c.mo101465O();
                    int i2 = SubtitleModule.m131149e(this.f106940c).f106827a;
                    if (i2 != -1) {
                        SubtitleModule.m131146c(this.f106940c).mo5422a(this.f106940c.mo101494d(), new C1290s(), i2);
                        SubtitleModule.m131151f(this.f106940c).setValue(C47516v.m148298b(SubtitleModule.m131152g(this.f106940c).mo70454a((long) (((UtteranceWithWords) SubtitleModule.m131149e(this.f106940c).f106829c.get(i2)).getStartTime() + 30))));
                    }
                    if (this.f106938a) {
                        this.f106938a = false;
                        this.f106940c.mo101462L();
                        break;
                    }
                }
                break;
            case 1:
                if (this.f106940c.f106810o) {
                    this.f106938a = true;
                }
                this.f106940c.mo101463M();
                this.f106939b = true;
                this.f106940c.f106808m = new C41067c();
                SubtitleModule.m131144b(this.f106940c).post(this.f106940c.f106808m);
                return;
        }
    }
}
