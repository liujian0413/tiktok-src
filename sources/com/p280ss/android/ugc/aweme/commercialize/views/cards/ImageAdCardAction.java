package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25340d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.miniapp.utils.C33419c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction */
public class ImageAdCardAction extends AbsAdCardAction {
    /* renamed from: a */
    public final void mo60991a() {
        super.mo60991a();
        mo66288a(new C25257a().mo65856a("click").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        if (!C25371n.m83468b(this.f67266b, this.f67267c) && !C33419c.m108078a(this.f67266b, this.f67267c) && !C25371n.m83447a(this.f67266b, this.f67267c, 33)) {
            if (!C25352e.m83215a(this.f67267c) || TextUtils.isEmpty(C25352e.m83303N(this.f67267c))) {
                C25371n.m83474c(this.f67266b, this.f67267c);
            } else {
                C25340d.m83268a(this.f67266b);
            }
        }
    }

    public ImageAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
        this.f67263a = R.drawable.aob;
        this.f67270f = true;
    }
}
