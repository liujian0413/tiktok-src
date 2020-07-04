package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.commercialize.log.C24943am;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction */
public abstract class AbsHalfWebPageAction implements C0042h, C0053p<C23083a>, C25571p {

    /* renamed from: b */
    protected Context f67266b;

    /* renamed from: c */
    protected Aweme f67267c;

    /* renamed from: d */
    protected C25568n f67268d;

    /* renamed from: e */
    protected DataCenter f67269e = new DataCenter();

    /* renamed from: f */
    protected boolean f67270f = false;

    /* renamed from: g */
    public boolean f67271g = false;

    /* renamed from: a */
    public void mo60991a() {
        mo66291c("click");
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        mo66291c("onCreate");
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        mo66291c("onResume");
    }

    /* renamed from: e */
    public final void mo66293e() {
        this.f67269e.mo60131a((C0053p<C23083a>) this);
        if (C42961az.m136384e(this)) {
            C42961az.m136383d(this);
        }
    }

    /* renamed from: g */
    public void mo66295g() {
        mo66291c("expand");
        this.f67271g = true;
    }

    /* renamed from: h */
    public void mo66296h() {
        mo66291c("collapse");
        this.f67271g = false;
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        mo66291c("onDestroy");
        this.f67268d.mo66298a().getLifecycle().mo56b(this);
    }

    /* renamed from: b */
    public void mo60992b() {
        mo66291c("close");
        mo66288a(new C25257a().mo65856a("close").mo65858b("card").mo65855a(this.f67267c).mo65857a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo66292d() {
        if (this.f67269e != null) {
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_SHOW", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_HIDE", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_EXPAND", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (C0053p<C23083a>) this);
            this.f67269e.mo60132a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: f */
    public void mo66294f() {
        mo66291c("show");
        mo66288a(new C25257a().mo65856a("othershow").mo65858b("card").mo65855a(this.f67267c).mo65857a());
        if (this.f67270f) {
            this.f67268d.mo66302a(false);
        }
    }

    /* renamed from: b */
    public void mo66290b(String str) {
        mo66291c("expand fail");
    }

    /* renamed from: a */
    public final void mo66286a(DataCenter dataCenter) {
        this.f67269e = dataCenter;
        mo66292d();
    }

    /* renamed from: d */
    private void m83938d(String str) {
        StringBuilder sb = new StringBuilder("show cancel: ");
        sb.append(str);
        mo66291c(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66288a(C25256b bVar) {
        StringBuilder sb = new StringBuilder("sendLog: ");
        sb.append(bVar.toString());
        mo66291c(sb.toString());
        C24976t.m82040a(this.f67266b, bVar);
        if (TextUtils.equals(bVar.f66594b, "click")) {
            C24943am.f65779a.mo65218b(bVar.f66593a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo66291c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        sb.append(hashCode());
        sb.append(" ");
        sb.append(str);
    }

    /* renamed from: a */
    public void mo66289a(String str) {
        StringBuilder sb = new StringBuilder("show fail: ");
        sb.append(str);
        mo66291c(sb.toString());
        mo66288a(new C25257a().mo65856a("othershow_fail").mo65858b("card").mo65859c(str).mo65855a(this.f67267c).mo65857a());
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1528248849:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1501644853:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_CLICK_COVER")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1393672249:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL")) {
                        c = 2;
                        break;
                    }
                    break;
                case -201580690:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL")) {
                        c = 6;
                        break;
                    }
                    break;
                case 995285931:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_FAIL")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1538688450:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_COLLAPSE")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2116917719:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_HIDE")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2117244818:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo66294f();
                    return;
                case 1:
                    mo66289a((String) aVar.mo60161a());
                    return;
                case 2:
                    m83938d((String) aVar.mo60161a());
                    return;
                case 3:
                    mo60991a();
                    return;
                case 4:
                    mo60992b();
                    return;
                case 5:
                    mo66295g();
                    return;
                case 6:
                    mo66290b((String) aVar.mo60161a());
                    return;
                case 7:
                    mo66296h();
                    break;
            }
        }
    }

    public AbsHalfWebPageAction(Context context, Aweme aweme, C25568n nVar) {
        this.f67266b = context;
        this.f67267c = aweme;
        this.f67268d = nVar;
        this.f67268d.mo66298a().getLifecycle().mo55a(this);
    }
}
