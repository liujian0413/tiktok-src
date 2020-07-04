package com.p280ss.android.ugc.aweme.base.p308ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23442a;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23443b;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23446c;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23447d;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23448e;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23449f;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23450g;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23451h;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23452i;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23455k;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23457m;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23458n;
import com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23459o;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24706aa;
import com.p280ss.android.ugc.aweme.commercialize.link.C24792i;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28796an;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33297a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.p1004an.p1005a.C22497a;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.p280ss.android.ugc.aweme.utils.C43099ek;
import com.p280ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 */
public class FeedTagLayout2 extends AbstractFeedTagLayout implements OnClickListener {

    /* renamed from: n */
    public LinearLayout f61687n;

    /* renamed from: o */
    public C23443b f61688o;

    /* renamed from: p */
    public C28343z<C28318an> f61689p;

    /* renamed from: q */
    private boolean f61690q;

    /* renamed from: r */
    private DataCenter f61691r;

    /* renamed from: s */
    private String f61692s;

    /* renamed from: t */
    private String f61693t;

    /* renamed from: u */
    private String f61694u;

    /* renamed from: g */
    private void m76818g() {
        if (!this.f61690q) {
            mo60852a();
        }
    }

    /* renamed from: c */
    public final void mo60929c() {
        if (this.f61688o != null) {
            this.f61688o.mo61055c();
        }
    }

    /* renamed from: d */
    public final void mo60930d() {
        setVisibility(8);
        this.f61614k = false;
    }

    /* renamed from: e */
    public final void mo60931e() {
        if (this.f61688o != null && (this.f61688o instanceof C23453j)) {
            ((C23453j) this.f61688o).mo61061e();
        }
    }

    /* renamed from: f */
    public final void mo60932f() {
        if (this.f61688o != null && (this.f61688o instanceof C23453j)) {
            ((C23453j) this.f61688o).mo61062f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60852a() {
        this.f61690q = true;
        try {
            addView(((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f61606c, R.layout.a6a));
        } catch (Exception unused) {
            LayoutInflater.from(this.f61606c).inflate(R.layout.a6a, this);
        }
        setOrientation(1);
        setPadding(0, 0, (int) C9738o.m28708b(this.f61606c, 100.0f), 0);
        if (VERSION.SDK_INT >= 17) {
            setPaddingRelative(0, 0, (int) C9738o.m28708b(this.f61606c, 100.0f), 0);
        }
        this.f61687n = (LinearLayout) findViewById(R.id.cfd);
        this.f61687n.setOnTouchListener(C43099ek.m136716a(0.5f, 1.0f));
        this.f61687n.setOnClickListener(this);
    }

    private int getAnchorType() {
        if (!C24792i.m81362i(this.f61607d)) {
            return 0;
        }
        if (C33297a.m107718a(this.f61607d)) {
            return 10;
        }
        if (C33297a.m107719b(this.f61607d)) {
            return 11;
        }
        if (C33297a.m107720c(this.f61607d)) {
            return 12;
        }
        if (C33297a.m107721d(this.f61607d)) {
            return 13;
        }
        if (C33297a.m107722e(this.f61607d)) {
            return 14;
        }
        if (C22497a.m74389a(this.f61607d)) {
            return 9;
        }
        if (AddWikiActivity.m138065a(this.f61607d) || AddWikiActivity.m138066b(this.f61607d) || AddWikiActivity.m138067c(this.f61607d)) {
            return 1;
        }
        if (C28796an.m94800a(this.f61607d)) {
            return 2;
        }
        if (C35452k.m114515a(this.f61610g, this.f61607d)) {
            return 4;
        }
        if (C33336b.m107788a(this.f61607d)) {
            return 7;
        }
        if (C41513aa.m132243a(this.f61607d)) {
            return 8;
        }
        if (C24792i.m81350e(this.f61607d) && mo60853b()) {
            return 3;
        }
        if (C24792i.m81356g(this.f61607d)) {
            return 5;
        }
        if (C24792i.m81359h(this.f61607d)) {
            return 6;
        }
        return 0;
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f61691r = dataCenter;
    }

    public void setOnIntervalEventListener(C28343z<C28318an> zVar) {
        this.f61689p = zVar;
    }

    public FeedTagLayout2(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60926a(C47870u uVar) throws Exception {
        uVar.mo19239a((Object) Integer.valueOf(getAnchorType()));
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f61688o != null) {
            this.f61688o.mo59066a(view);
        }
    }

    /* renamed from: a */
    private static void m76817a(String str) {
        C6869c a = C6869c.m21381a();
        a.mo16887a("aweme_id", str);
        C6877n.m21407a("poi_log", "illegal_poi", a.mo16888b());
    }

    public void setFollowPageType(String str) {
        super.setFollowPageType(str);
        if (this.f61688o != null && (this.f61688o instanceof C23453j)) {
            ((C23453j) this.f61688o).mo61059a(str);
        }
    }

    /* renamed from: a */
    public final void mo60928a(boolean z) {
        if (this.f61691r != null) {
            this.f61691r.mo60134a("show_poi_distance", (Object) Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final C23443b mo60924a(int i) {
        if (i == 10) {
            if (this.f61688o instanceof C23458n) {
                return this.f61688o;
            }
            return new C23458n(this, this.f61611h, this.f61610g);
        } else if (i == 11) {
            if (this.f61688o instanceof C23447d) {
                return this.f61688o;
            }
            return new C23447d(this, this.f61611h, this.f61610g);
        } else if (i == 12) {
            if (this.f61688o instanceof C23449f) {
                return this.f61688o;
            }
            return new C23449f(this, this.f61611h, this.f61610g);
        } else if (i == 13) {
            if (this.f61688o instanceof C23450g) {
                return this.f61688o;
            }
            return new C23450g(this, this.f61611h, this.f61610g);
        } else if (i == 14) {
            if (this.f61688o instanceof C23442a) {
                return this.f61688o;
            }
            return new C23442a(this, this.f61611h, this.f61610g);
        } else if (i == 1) {
            if (this.f61688o instanceof C23459o) {
                return this.f61688o;
            }
            return new C23459o(this, this.f61611h, this.f61610g);
        } else if (i == 2) {
            if (this.f61688o instanceof C23455k) {
                return this.f61688o;
            }
            return new C23455k(this, this.f61611h, this.f61610g);
        } else if (i == 4) {
            if (this.f61688o instanceof C23453j) {
                return this.f61688o;
            }
            this.f61688o = new C23453j(this, this.f61611h, this.f61610g);
            ((C23453j) this.f61688o).mo61060a(this.f61692s, this.f61693t, this.f61694u);
            return this.f61688o;
        } else if (i == 7) {
            if (this.f61688o instanceof C23446c) {
                return this.f61688o;
            }
            return new C23446c(this, this.f61611h, this.f61610g);
        } else if (i == 8) {
            if (this.f61688o instanceof C23448e) {
                return this.f61688o;
            }
            return new C23448e(this, this.f61611h, this.f61610g);
        } else if (i == 3) {
            if (this.f61688o instanceof C23452i) {
                return this.f61688o;
            }
            return new C23452i(this, this.f61611h, this.f61610g);
        } else if (i == 5) {
            if (this.f61688o instanceof C23451h) {
                return this.f61688o;
            }
            return new C23451h(this, this.f61611h, this.f61610g);
        } else if (i == 6) {
            if (this.f61688o instanceof C23457m) {
                return this.f61688o;
            }
            return new C23457m(this, this.f61611h, this.f61610g);
        } else if (i != 9) {
            return null;
        } else {
            if (this.f61688o instanceof C22497a) {
                return this.f61688o;
            }
            return new C22497a(this);
        }
    }

    public FeedTagLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo60927a(String str, String str2, String str3) {
        this.f61692s = str;
        this.f61693t = str2;
        this.f61694u = str3;
    }

    public FeedTagLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61606c = context;
        setOrientation(1);
    }

    /* renamed from: a */
    public final void mo60925a(Aweme aweme, Activity activity, String str, JSONObject jSONObject) {
        m76818g();
        this.f61607d = aweme;
        this.f61610g = str;
        this.f61611h = activity;
        this.f61612i = jSONObject;
        if (C6399b.m19944t() && !((IPoiService) ServiceManager.get().getService(IPoiService.class)).showPoiEntrance() && aweme.getPoiStruct() != null) {
            m76817a(aweme.getAid());
        }
        C7492s a = C7492s.m23282a((C7495v<T>) new C23463c<T>(this));
        a.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<Integer>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C7321c cVar) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(Integer num) {
                if (num.intValue() == 4) {
                    FeedTagLayout2.this.mo60928a(true);
                } else {
                    FeedTagLayout2.this.mo60928a(false);
                }
                if (num.intValue() == 0) {
                    FeedTagLayout2.this.setVisibility(8);
                    FeedTagLayout2.this.f61614k = false;
                    FeedTagLayout2.this.f61688o = null;
                    return;
                }
                FeedTagLayout2.this.f61688o = FeedTagLayout2.this.mo60924a(num.intValue());
                if (FeedTagLayout2.this.f61688o == null || C24706aa.m81052a(FeedTagLayout2.this.f61607d)) {
                    FeedTagLayout2.this.mo60930d();
                    return;
                }
                FeedTagLayout2.this.f61687n.setBackgroundResource(FeedTagLayout2.this.f61688o.mo61056d());
                FeedTagLayout2.this.setVisibility(0);
                FeedTagLayout2.this.f61614k = true;
                if (FeedTagLayout2.this.f61688o instanceof C23453j) {
                    ((C23453j) FeedTagLayout2.this.f61688o).f61887n = FeedTagLayout2.this.f61689p;
                }
                FeedTagLayout2.this.f61688o.mo59067a(FeedTagLayout2.this.f61607d, FeedTagLayout2.this.f61612i);
            }
        });
    }
}
