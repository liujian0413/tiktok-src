package com.p280ss.android.ugc.aweme.longvideo;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24641b;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24664i;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28466r;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28473w;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b.C32721a;
import com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.DiggView */
public final class DiggView implements C0042h, OnClickListener, C28466r {

    /* renamed from: a */
    public FragmentActivity f85199a;

    /* renamed from: b */
    public final ArrayList<C32699a> f85200b = new ArrayList<>();

    /* renamed from: c */
    public final LongVideoDiggAnimationView f85201c;

    /* renamed from: d */
    public final TextView f85202d;

    /* renamed from: e */
    public final String f85203e;

    /* renamed from: f */
    private Aweme f85204f;

    /* renamed from: g */
    private C28473w f85205g;

    /* renamed from: h */
    private int f85206h;

    /* renamed from: i */
    private int f85207i;

    /* renamed from: j */
    private int f85208j;

    /* renamed from: k */
    private CommerceLikeLayout f85209k;

    /* renamed from: l */
    private String f85210l;

    /* renamed from: m */
    private CommerceEggLayout f85211m;

    /* renamed from: n */
    private C24641b f85212n;

    /* renamed from: o */
    private C24638b f85213o;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.DiggView$a */
    public interface C32699a {
        /* renamed from: a */
        void mo84155a();
    }

    /* renamed from: a */
    public final void mo72204a(Exception exc) {
        C22814a.m75244a((Context) this.f85199a, (Throwable) exc);
        m105822a(m105823a(Integer.valueOf(this.f85208j)));
    }

    /* renamed from: c */
    private void m105824c() {
        this.f85211m = null;
        this.f85212n = null;
        this.f85213o = null;
    }

    /* renamed from: b */
    public final void mo84151b() {
        onClick(this.f85201c);
    }

    /* renamed from: d */
    private static void m105825d() {
        C42961az.m136380a(new C32716a());
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C28473w wVar = this.f85205g;
        if (wVar != null) {
            wVar.mo66535W_();
        }
        C28473w wVar2 = this.f85205g;
        if (wVar2 != null) {
            wVar2.mo59134U_();
        }
        this.f85200b.clear();
        m105824c();
    }

    /* renamed from: a */
    public final void mo84147a() {
        if (!this.f85201c.isSelected()) {
            m105820a((View) null);
        }
    }

    /* renamed from: a */
    private static boolean m105823a(Integer num) {
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo84152b(C32699a aVar) {
        C7573i.m23587b(aVar, "diggCallback");
        this.f85200b.remove(aVar);
    }

    /* renamed from: a */
    private void m105822a(boolean z) {
        if (this.f85204f != null) {
            this.f85201c.setSelected(z);
            TextView textView = this.f85202d;
            if (textView != null) {
                if (z) {
                    if (!m105823a(Integer.valueOf(this.f85207i))) {
                        textView.setText(C30537o.m99738a((long) (this.f85206h + 1)));
                    }
                } else if (m105823a(Integer.valueOf(this.f85207i))) {
                    textView.setText(C30537o.m99738a((long) (this.f85206h - 1)));
                }
                textView.setText(C30537o.m99738a((long) this.f85206h));
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        m105825d();
        if (!this.f85201c.isSelected()) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() && this.f85204f != null) {
                if (C24664i.m80832a()) {
                    CommerceEggLayout commerceEggLayout = this.f85211m;
                    if (commerceEggLayout != null) {
                        commerceEggLayout.mo64484a(this.f85212n, this.f85213o, 1, true);
                    }
                } else {
                    CommerceLikeLayout commerceLikeLayout = this.f85209k;
                    if (commerceLikeLayout != null) {
                        String str2 = this.f85210l;
                        if (str2 == null) {
                            C7573i.m23583a("enterFrom");
                        }
                        Aweme aweme = this.f85204f;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        commerceLikeLayout.mo66138a(str2, str);
                    }
                }
            }
        }
        m105820a(view);
    }

    /* renamed from: a */
    private final void m105820a(View view) {
        int i;
        String str;
        String str2;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            if (TextUtils.equals(this.f85203e, "homepage_hot")) {
                i = R.string.c6v;
            } else {
                i = R.string.bz5;
            }
            FragmentActivity fragmentActivity = this.f85199a;
            String str3 = null;
            if (fragmentActivity != null) {
                str = fragmentActivity.getString(i);
            } else {
                str = null;
            }
            Activity activity = this.f85199a;
            String str4 = this.f85203e;
            String str5 = "click_like";
            C42914ab a2 = C42914ab.m136242a().mo104633a("login_title", str);
            String str6 = "group_id";
            Aweme aweme = this.f85204f;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C42914ab a3 = a2.mo104633a(str6, str2);
            String str7 = "log_pb";
            Aweme aweme2 = this.f85204f;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            }
            C32656f.m105743a(activity, str4, str5, a3.mo104633a(str7, C33230ac.m107234j(str3)).f111445a);
            return;
        }
        this.f85201c.mo84256a(view);
        if (this.f85201c.isSelected()) {
            m105821a(C32721a.m105924a(this.f85204f), 0);
            m105822a(false);
            Iterator it = this.f85200b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        m105821a(C32721a.m105924a(this.f85204f), 1);
        m105822a(true);
        for (C32699a a4 : this.f85200b) {
            a4.mo84155a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r1 == null) goto L_0x000a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72203a(android.support.p022v4.util.C0902i<java.lang.String, java.lang.Integer> r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.event.an r0 = new com.ss.android.ugc.aweme.feed.event.an
            if (r4 == 0) goto L_0x000a
            F r1 = r4.f3154a
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r1 = ""
        L_0x000c:
            r2 = 13
            r0.<init>(r2, r1)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r0)
            com.ss.android.ugc.aweme.longvideo.b.b$a r0 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b.f85295a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f85204f
            java.lang.String r0 = r0.mo84197b(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            if (r4 == 0) goto L_0x0026
            F r2 = r4.f3154a
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x0036
            S r0 = r4.f3155b
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0036:
            boolean r0 = m105823a(r1)
            r3.m105822a(r0)
        L_0x003d:
            if (r4 == 0) goto L_0x004a
            S r4 = r4.f3155b
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x004a
            int r4 = r4.intValue()
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            r3.f85208j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.DiggView.mo72203a(android.support.v4.util.i):void");
    }

    /* renamed from: a */
    public final void mo84150a(C32699a aVar) {
        C7573i.m23587b(aVar, "diggCallback");
        if (!this.f85200b.contains(aVar)) {
            this.f85200b.add(aVar);
        }
    }

    /* renamed from: a */
    private final void m105821a(String str, int i) {
        C28473w wVar = this.f85205g;
        if (wVar != null) {
            wVar.mo56976a(str, Integer.valueOf(i), this.f85203e);
        }
    }

    /* renamed from: a */
    public final void mo84149a(CommerceEggLayout commerceEggLayout, C24641b bVar, C24638b bVar2) {
        this.f85211m = commerceEggLayout;
        this.f85212n = bVar;
        this.f85213o = bVar2;
    }

    public DiggView(LongVideoDiggAnimationView longVideoDiggAnimationView, TextView textView, String str) {
        C7573i.m23587b(longVideoDiggAnimationView, "diggAnimationView");
        C7573i.m23587b(str, "mEventType");
        this.f85201c = longVideoDiggAnimationView;
        this.f85202d = textView;
        this.f85203e = str;
    }

    /* renamed from: a */
    public final void mo84148a(FragmentActivity fragmentActivity, Aweme aweme, CommerceLikeLayout commerceLikeLayout, String str) {
        int i;
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "enterFrom");
        this.f85199a = fragmentActivity;
        fragmentActivity.getLifecycle().mo55a(this);
        this.f85204f = aweme;
        this.f85210l = str;
        this.f85209k = commerceLikeLayout;
        this.f85201c.setImageResource(R.drawable.bg_like);
        Aweme aweme2 = this.f85204f;
        int i2 = 0;
        if (aweme2 != null) {
            i = aweme2.getUserDigg();
        } else {
            i = 0;
        }
        this.f85207i = i;
        this.f85208j = this.f85207i;
        this.f85201c.setSelected(m105823a(Integer.valueOf(this.f85207i)));
        this.f85201c.setOnClickListener(this);
        Aweme aweme3 = this.f85204f;
        if (aweme3 != null) {
            AwemeStatistics statistics = aweme3.getStatistics();
            if (statistics != null) {
                i2 = statistics.getDiggCount();
            }
        }
        this.f85206h = i2;
        TextView textView = this.f85202d;
        if (textView != null) {
            textView.setText(C30537o.m99738a((long) this.f85206h));
        }
        this.f85205g = new C28473w();
        C28473w wVar = this.f85205g;
        if (wVar != null) {
            wVar.mo66536a(new C28471v());
        }
        C28473w wVar2 = this.f85205g;
        if (wVar2 != null) {
            wVar2.mo66537a(this);
        }
    }
}
