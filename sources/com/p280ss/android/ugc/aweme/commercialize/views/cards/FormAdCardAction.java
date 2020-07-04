package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24566g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C25539a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction */
public class FormAdCardAction extends AbsAdCardAction {

    /* renamed from: h */
    private boolean f67289h;

    /* renamed from: b */
    public final void mo60992b() {
        if (!this.f67289h && !this.f67271g) {
            super.mo60992b();
        }
    }

    /* renamed from: g */
    public final void mo66295g() {
        super.mo66295g();
        this.f67268d.mo66301a("javascript:window.dialogPopUp()");
    }

    /* renamed from: h */
    public final void mo66296h() {
        super.mo66296h();
        if (!this.f67289h) {
            C24976t.m82126am(this.f67266b, this.f67267c);
        }
    }

    /* renamed from: a */
    public final void mo60991a() {
        super.mo60991a();
        mo66288a(new C25257a().mo65856a("click").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        if (C25371n.m83444a(this.f67266b, 33)) {
            this.f67289h = false;
            mo60992b();
            return;
        }
        C42961az.m136380a(new C24566g(this.f67267c, 2));
    }

    @C7709l
    public void onEvent(C25539a aVar) {
        this.f67289h = false;
        this.f67269e.mo60134a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) null);
    }

    /* renamed from: b */
    public final void mo66290b(String str) {
        super.mo66290b(str);
        C24976t.m82127an(this.f67266b, this.f67267c);
    }

    public FormAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
        this.f67270f = true;
    }
}
