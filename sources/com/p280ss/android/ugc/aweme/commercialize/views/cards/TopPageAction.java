package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C25539a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction */
public class TopPageAction extends AbsAdCardAction {

    /* renamed from: h */
    public C25546a f67294h;

    /* renamed from: i */
    private boolean f67295i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction$a */
    public interface C25546a {
        /* renamed from: a */
        void mo66315a(C25548b bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo66292d() {
        if (this.f67269e != null) {
            this.f67269e.mo60132a("ON_AD_TOP_WEB_PAGE_SHOW", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_TOP_WEB_PAGE_HIDE", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: b */
    public final void mo60992b() {
        mo66291c("top page close");
        this.f67271g = false;
        this.f67268d.mo66301a("javascript:window.creative_dismissModal()");
        if (this.f67295i) {
            mo66288a(new C25257a().mo65856a("close").mo65858b("coupon").mo65855a(this.f67267c).mo65857a());
        }
    }

    /* renamed from: f */
    public final void mo66294f() {
        mo66291c("top page show");
        this.f67271g = true;
        this.f67268d.mo66301a("javascript:window.creative_showModal()");
        mo66288a(new C25257a().mo65856a("othershow").mo65858b("coupon").mo65855a(this.f67267c).mo65857a());
    }

    /* renamed from: a */
    public final void mo66281a(C25548b bVar) {
        if (this.f67294h != null) {
            this.f67294h.mo66315a(bVar);
        }
    }

    @C7709l
    public void onEvent(C25539a aVar) {
        mo66291c("top page committed");
        this.f67295i = false;
        this.f67269e.mo60134a("ACTION_TOP_WEB_PAGE_HIDE", (Object) Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo66289a(String str) {
        StringBuilder sb = new StringBuilder("top page show fail: ");
        sb.append(str);
        mo66291c(sb.toString());
        mo66288a(new C25257a().mo65856a("othershow_fail").mo65858b("coupon").mo65859c(str).mo65855a(this.f67267c).mo65857a());
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1923750303) {
                if (hashCode != -200264351) {
                    if (hashCode == -199937252 && str.equals("ON_AD_TOP_WEB_PAGE_SHOW")) {
                        c = 0;
                    }
                } else if (str.equals("ON_AD_TOP_WEB_PAGE_HIDE")) {
                    c = 2;
                }
            } else if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW_FAIL")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo66294f();
                    return;
                case 1:
                    mo66289a((String) aVar.mo60161a());
                    return;
                case 2:
                    mo60992b();
                    break;
            }
        }
    }

    public TopPageAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
        this.f67295i = true;
        this.f67263a = R.drawable.ab8;
    }
}
