package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C25539a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction */
public class DownloadAdCardAction extends AbsAdCardAction {

    /* renamed from: h */
    private boolean f67288h;

    /* renamed from: b */
    public final void mo60992b() {
        if (this.f67288h) {
            super.mo60992b();
        }
    }

    @C7709l
    public void onEvent(C25539a aVar) {
        if (this.f67267c.getAwemeRawAd() != null && !this.f67267c.getAwemeRawAd().isCardOnceClick()) {
            this.f67288h = false;
            this.f67267c.getAwemeRawAd().setCardOnceClick(true);
            this.f67269e.mo60134a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
        }
    }

    public DownloadAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
        this.f67288h = true;
        this.f67263a = R.drawable.aoc;
    }
}
