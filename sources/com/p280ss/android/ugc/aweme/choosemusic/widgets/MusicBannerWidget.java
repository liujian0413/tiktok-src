package com.p280ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.choosemusic.view.BannerView;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget */
public class MusicBannerWidget extends Widget implements C0053p<C23083a> {

    /* renamed from: a */
    BannerView f63465a;

    /* renamed from: i */
    private int f63466i;

    public void onCreate() {
        this.f60922e.mo60132a("data_banner", (C0053p<C23083a>) this);
        this.f63466i = ((Integer) this.f60922e.mo60135a("key_choose_music_type")).intValue();
        super.onCreate();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (!(this.f63465a == null || aVar == null)) {
            m78773a((List) aVar.mo60161a());
        }
    }

    /* renamed from: a */
    private void m78773a(List<Banner> list) {
        if (list == null || list.size() <= 0) {
            this.f60921d.setVisibility(8);
            return;
        }
        this.f60921d.setVisibility(0);
        this.f63465a.mo62110a(list, true);
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        super.mo60146a(view);
        this.f63465a = new BannerView(view, this.f63466i);
        m78773a((List) this.f60922e.mo60135a("data_banner"));
    }
}
