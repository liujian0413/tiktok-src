package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24565f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction */
public class CouponAdCardAction extends AbsAdCardAction {
    /* renamed from: f */
    public final void mo66294f() {
        super.mo66294f();
        CardStruct w = C25329c.m83240w(this.f67267c);
        if (w != null && w.getCardStyle() != 2) {
            this.f67268d.mo66306e().setBackgroundResource(R.drawable.h3);
        }
    }

    /* renamed from: a */
    public final void mo60991a() {
        super.mo60991a();
        mo66288a(new C25257a().mo65856a("click").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        C42961az.m136380a(new C24565f(this.f67267c, 17));
    }

    public CouponAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
        this.f67263a = R.drawable.aoc;
        this.f67270f = true;
    }
}
