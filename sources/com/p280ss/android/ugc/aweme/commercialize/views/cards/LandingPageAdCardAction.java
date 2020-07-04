package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.miniapp.utils.C33419c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction */
public class LandingPageAdCardAction extends AbsHalfWebPageAction {

    /* renamed from: a */
    public static final String f67290a = "LandingPageAdCardAction";

    /* renamed from: f */
    public final void mo66294f() {
        super.mo66294f();
        if (this.f67267c.getAwemeRawAd() != null && !this.f67267c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo66288a(new C25257a().mo65856a("click").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        }
    }

    /* renamed from: a */
    public final void mo60991a() {
        super.mo60991a();
        mo66288a(new C25257a().mo65856a("otherclick").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        if (!C25371n.m83468b(this.f67266b, this.f67267c) && !C33419c.m108078a(this.f67266b, this.f67267c)) {
            if (!C25371n.m83447a(this.f67266b, this.f67267c, 33)) {
                C25371n.m83474c(this.f67266b, this.f67267c);
            } else {
                return;
            }
        }
        if (this.f67267c.getAwemeRawAd() != null && this.f67267c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo66288a(new C25257a().mo65856a("click").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        }
    }

    public LandingPageAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
        this.f67270f = true;
    }
}
