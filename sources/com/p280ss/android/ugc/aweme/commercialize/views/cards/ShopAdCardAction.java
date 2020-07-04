package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.miniapp.utils.C33419c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction */
public class ShopAdCardAction extends AbsAdCardAction {

    /* renamed from: h */
    private int f67293h;

    /* renamed from: a */
    public final void mo60991a() {
        super.mo60991a();
        if (this.f67293h == 0) {
            mo66288a(new C25257a().mo65856a("click").mo65858b("card").mo65855a(this.f67267c).mo65857a());
            if (!C25371n.m83468b(this.f67266b, this.f67267c) && !C33419c.m108078a(this.f67266b, this.f67267c) && !C25371n.m83447a(this.f67266b, this.f67267c, 2)) {
                C25371n.m83474c(this.f67266b, this.f67267c);
            }
        }
    }

    public ShopAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        boolean z;
        super(context, aweme, nVar);
        if (C25352e.m83240w(aweme) != null) {
            this.f67293h = C25352e.m83240w(aweme).getCardStyle();
        }
        if (this.f67293h == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f67270f = z;
        this.f67263a = R.drawable.aoc;
    }
}
