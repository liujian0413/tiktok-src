package com.p280ss.android.ugc.aweme.account.login;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.base.widget.DividerView;
import com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel;
import com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel.Orientation;
import com.p280ss.android.ugc.aweme.account.base.widget.recyclerview.MultiTypeAdapter;
import com.p280ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable.ScrollableLinearLayoutManager;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.view.LoginItemMoreView;
import com.p280ss.android.ugc.aweme.account.login.view.LoginItemView;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a.C22164a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22172c;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.account.p951l.C21242e;
import com.p280ss.android.ugc.aweme.account.util.ThirdLoginSetting;
import com.p280ss.android.ugc.aweme.account.views.C22365c;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23363c;
import com.p280ss.android.ugc.aweme.base.p1056b.C23275a;
import com.p280ss.android.ugc.aweme.base.p1056b.C23277b;
import com.p280ss.android.ugc.aweme.base.p1056b.C23278c;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.main.p1385g.C33023i;
import com.p280ss.android.ugc.aweme.main.p1385g.C33026l;
import com.p280ss.android.ugc.aweme.main.p1385g.C33029o;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.a */
public abstract class C21261a extends C22365c implements C21172b, C23278c {

    /* renamed from: B */
    private static int f57143B = 3;

    /* renamed from: h */
    public static final int f57144h = C23481i.m77094e(R.dimen.ii);

    /* renamed from: i */
    public static final int f57145i = C23481i.m77094e(R.dimen.ih);

    /* renamed from: A */
    public String f57146A;

    /* renamed from: C */
    private Dialog f57147C;

    /* renamed from: D */
    private boolean f57148D;

    /* renamed from: E */
    private TextView f57149E;

    /* renamed from: F */
    private boolean f57150F;

    /* renamed from: G */
    private Dialog f57151G;

    /* renamed from: a */
    protected Activity f57152a;

    /* renamed from: b */
    protected Bundle f57153b;

    /* renamed from: c */
    protected String f57154c;

    /* renamed from: d */
    protected String f57155d;

    /* renamed from: e */
    protected String f57156e;

    /* renamed from: f */
    public int f57157f;

    /* renamed from: g */
    protected boolean f57158g;

    /* renamed from: j */
    public final DividerViewModel f57159j;

    /* renamed from: k */
    public View f57160k;

    /* renamed from: l */
    public TextView f57161l;

    /* renamed from: m */
    public LinearLayout f57162m;

    /* renamed from: n */
    public ScrollableLinearLayoutManager f57163n;

    /* renamed from: o */
    public DividerViewModel f57164o;

    /* renamed from: p */
    public DividerViewModel f57165p;

    /* renamed from: q */
    public C23363c f57166q;

    /* renamed from: r */
    public DividerViewModel f57167r;

    /* renamed from: s */
    protected C22172c f57168s;

    /* renamed from: t */
    protected View f57169t;

    /* renamed from: u */
    public RecyclerView f57170u;

    /* renamed from: v */
    public View f57171v;

    /* renamed from: w */
    protected TextView f57172w;

    /* renamed from: x */
    protected TextView f57173x;

    /* renamed from: y */
    public List<C23360e> f57174y;

    /* renamed from: z */
    public C1262a f57175z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Dialog mo57228a(Activity activity);

    public void cancel() {
        super.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Dialog mo57240f();

    /* renamed from: k */
    private void m71597k() {
        this.f57170u.mo5561d(this.f57174y.indexOf(this.f57165p));
    }

    /* renamed from: d */
    public final void mo57237d() {
        this.f57164o.f56746c = 0;
        this.f57175z.notifyDataSetChanged();
    }

    /* renamed from: g */
    static final /* synthetic */ void m71593g() {
        if (!C21671bd.m72539g()) {
            C21671bd.m72522a(1, 3, (Object) "");
            C21671bd.m72547o();
        }
    }

    /* renamed from: j */
    private int m71596j() {
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            return decorView.getMeasuredWidth();
        }
        return C9738o.m28691a(getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57229a() {
        if (this.f57147C == null) {
            this.f57147C = mo57228a(this.f57152a);
        }
        this.f57147C.show();
    }

    /* renamed from: c */
    public final int mo57235c() {
        return ((m71596j() - (f57144h * this.f57157f)) - (f57145i * (this.f57157f - 1))) / 2;
    }

    public void show() {
        this.f57148D = false;
        try {
            if (getOwnerActivity() == null || !getOwnerActivity().isFinishing()) {
                super.show();
                C21671bd.m72523a(1, 1, "");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    private C22172c m71598l() {
        return new C22172c(new C23277b(this, C23275a.m76429a("dismiss")), C22164a.m73600a((C23278c) this, (Boolean) null), new C23277b(this, C23275a.m76430a("show", "user_agreement")));
    }

    /* renamed from: b */
    public final void mo57234b() {
        HashMap hashMap = new HashMap();
        hashMap.put(DividerViewModel.class, DividerView.class);
        hashMap.put(C22162a.class, LoginItemView.class);
        hashMap.put(C23363c.class, LoginItemMoreView.class);
        this.f57175z = new MultiTypeAdapter(getContext(), this.f57174y, hashMap);
    }

    public void dismiss() {
        this.f57148D = true;
        if (this.f57147C != null) {
            C21359d.m71809a(this.f57147C);
        }
        super.dismiss();
        C21170a.m71341b(this);
        if (this.f57158g) {
            this.f57158g = false;
            return;
        }
        C21671bd.m72523a(1, 4, "");
        new Handler().postDelayed(C21351c.f57344a, 200);
    }

    /* renamed from: e */
    public final int mo57239e() {
        int size = this.f57168s.f59227c.size();
        return Math.max(f57145i * 2, ((m71596j() - (f57144h * size)) - (f57145i * (size - 1))) / 2);
    }

    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(C9738o.m28691a(getContext()), -2);
        }
    }

    /* renamed from: h */
    private void m71594h() {
        C21170a.m71339a((C21172b) this);
        this.f57163n = new ScrollableLinearLayoutManager(getContext(), 0, false) {
            /* renamed from: a */
            public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
                C212631 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
                    /* renamed from: c */
                    public final PointF mo5861c(int i) {
                        return C21261a.this.f57163n.mo5434d(i);
                    }

                    /* renamed from: a */
                    public final float mo5464a(DisplayMetrics displayMetrics) {
                        return super.mo5464a(displayMetrics) * ((float) C21261a.this.f57157f) * 2.0f;
                    }

                    /* renamed from: a */
                    public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
                        return super.mo5466a(i, i2, i3, i4, -1);
                    }
                };
                r2.f4993g = i;
                mo5755a((C1287r) r2);
            }
        };
        this.f57170u.setLayoutManager(this.f57163n);
        C9738o.m28712b(this.f57171v, 4);
        this.f57161l.setText(((C33029o) C21671bd.m72521a(C33029o.class)).mo60028b());
        this.f57162m.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6907h.onEvent(MobClick.obtain().setEventName("click_language").setLabelName("login_page").setJsonObject(new C6909j().mo16966a("change_from", ((C33029o) C21671bd.m72521a(C33029o.class)).mo60026a()).mo16967a()));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(C21261a.this.f57162m, "alpha", new float[]{C21261a.this.f57162m.getAlpha(), 0.5f, 1.0f});
                ofFloat.setDuration(100);
                ofFloat.start();
                ((C33029o) C21671bd.m72521a(C33029o.class)).mo60027a(C21261a.this.getContext());
            }
        });
        if (((C33023i) C21671bd.m72521a(C33023i.class)).mo60021c()) {
            this.f57162m.setVisibility(0);
        } else {
            this.f57162m.setVisibility(4);
        }
        this.f57149E.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                Activity activity = C21261a.this.f57152a;
                if (activity != null && (activity instanceof Activity)) {
                    C21242e.m71499a(activity, C21261a.this.f57154c, C21261a.this.f57155d);
                }
            }
        });
    }

    /* renamed from: i */
    private void m71595i() {
        this.f57160k = this.f57169t.findViewById(R.id.e23);
        this.f57161l = (TextView) this.f57169t.findViewById(R.id.drs);
        this.f57162m = (LinearLayout) this.f57169t.findViewById(R.id.bgw);
        this.f57172w = (TextView) this.f57169t.findViewById(R.id.e4k);
        this.f57149E = (TextView) this.f57169t.findViewById(R.id.dug);
        this.f57170u = (RecyclerView) this.f57169t.findViewById(R.id.cxj);
        this.f57171v = this.f57169t.findViewById(R.id.e_e);
        this.f57173x = (TextView) this.f57169t.findViewById(R.id.bvp);
        View findViewById = this.f57169t.findViewById(R.id.brx);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C21318b(this));
        }
    }

    /* renamed from: a_ */
    public final void mo57096a_(int i) {
        if (i == 11 && !this.f57148D) {
            try {
                dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo57230a(Context context) {
        this.f57169t = LayoutInflater.from(context).inflate(R.layout.b3i, null);
        setContentView(this.f57169t);
        m71595i();
        m71594h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo57183a(com.p280ss.android.ugc.aweme.base.p1056b.C23275a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f61308a
            int r1 = r0.hashCode()
            r2 = 3529469(0x35dafd, float:4.94584E-39)
            r3 = 1
            if (r1 == r2) goto L_0x002b
            r2 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r1 == r2) goto L_0x0021
            r2 = 1671672458(0x63a3b28a, float:6.039369E21)
            if (r1 == r2) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r1 = "dismiss"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "login"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x003f;
                case 2: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x008d
        L_0x003b:
            r4.cancel()
            goto L_0x008d
        L_0x003f:
            java.lang.String r0 = "user_agreement"
            java.lang.Object r5 = r5.mo60564a()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = com.bytedance.common.utility.C6319n.m19594a(r0, r5)
            if (r5 == 0) goto L_0x008d
            android.app.Dialog r5 = r4.mo57240f()
            r4.f57151G = r5
            android.app.Dialog r5 = r4.f57151G
            r5.show()
            goto L_0x008d
        L_0x0059:
            boolean r0 = r5.mo60565b()
            if (r0 != 0) goto L_0x0060
            return r1
        L_0x0060:
            android.content.Context r0 = r4.getContext()
            boolean r0 = com.p280ss.android.ugc.aweme.account.login.C21359d.m71810a(r0)
            if (r0 != 0) goto L_0x0079
            android.content.Context r5 = r4.getContext()
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r5 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r5, r0)
            r5.mo25750a()
            return r1
        L_0x0079:
            r4.f57158g = r3
            boolean r0 = r4.isShowing()
            if (r0 == 0) goto L_0x0084
            r4.dismiss()
        L_0x0084:
            java.lang.Object r5 = r5.mo60564a()
            java.lang.String r5 = (java.lang.String) r5
            r4.mo57233a(r5)
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.C21261a.mo57183a(com.ss.android.ugc.aweme.base.b.a):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57231a(View view) {
        Intent intent;
        C6907h.m21524a("click_login", (Map) C21102b.m71165a().mo56946a("enter_method", this.f57155d).f56672a);
        C33026l lVar = (C33026l) C21671bd.m72521a(C33026l.class);
        if (lVar != null) {
            lVar.mo60022a("click_login");
            lVar.mo60023b("LOGIN");
        }
        if (C21886a.f58594a.mo58324c()) {
            intent = SignUpOrLoginActivity.m73342b(view.getContext());
        } else {
            intent = new Intent(view.getContext(), MusLoginActivity.class);
        }
        if (this.f57153b != null) {
            this.f57153b.putString("enter_type", "click_login");
            intent.putExtras(this.f57153b);
        } else {
            intent.putExtra("enter_type", "click_login");
        }
        view.getContext().startActivity(intent);
    }

    /* renamed from: a */
    public void mo57232a(C22172c cVar) {
        this.f57168s = cVar;
        this.f57160k.setOnClickListener(cVar.f59226b);
        C21278ac.m71641a(C21671bd.m72532b(), this.f57172w, cVar.f59228d, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21261a.this.mo57229a();
            }
        }, false);
        final List<C22162a> list = cVar.f59227c;
        if (list != null) {
            if (!cVar.f59225a) {
                if (C43127fh.m136806a(getContext())) {
                    Collections.reverse(list);
                }
                this.f57162m.post(new Runnable() {
                    public final void run() {
                        int c = C21261a.this.mo57235c();
                        C21261a.this.f57174y.clear();
                        C21261a.this.f57165p = new DividerViewModel(C21261a.this.mo57239e(), Orientation.HORIZONTAL, 0);
                        C21261a.this.f57164o = new DividerViewModel(c - C21261a.this.f57165p.f56746c, Orientation.HORIZONTAL, 0);
                        C21261a.this.f57174y.add(C21261a.this.f57164o);
                        C21261a.this.f57174y.add(C21261a.this.f57165p);
                        for (int i = 0; i < C21261a.this.f57157f; i++) {
                            C21261a.this.f57174y.add(list.get(i));
                            C21261a.this.f57174y.add(C21261a.this.f57159j);
                        }
                        C21261a.this.f57174y.remove(C21261a.this.f57174y.size() - 1);
                        if (C21261a.this.f57157f < list.size()) {
                            C21261a.this.f57166q = new C23363c(new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    C21261a.this.f57168s.f59225a = true;
                                    C6907h.m21524a("signup_channel_unfold", (Map) null);
                                    if (C21261a.this.f57168s != null) {
                                        C21261a.this.mo57232a(C21261a.this.f57168s);
                                    }
                                }
                            });
                            C21261a.this.f57174y.add(C21261a.this.f57166q);
                        }
                        if (C21261a.this.f57175z == null) {
                            C21261a.this.mo57234b();
                        }
                        C23487o.m77139a(C21261a.this.f57170u, C21261a.this.f57175z);
                    }
                });
            } else if (!this.f57150F) {
                C9738o.m28712b(this.f57171v, 0);
                this.f57163n.f56807a = true;
                int indexOf = this.f57174y.indexOf(this.f57166q);
                this.f57174y.remove(indexOf);
                this.f57175z.notifyItemRemoved(indexOf);
                for (int i = this.f57157f; i < list.size(); i++) {
                    this.f57174y.add(this.f57159j);
                    this.f57174y.add(list.get(i));
                }
                this.f57167r = new DividerViewModel(Math.max(mo57239e(), f57145i), Orientation.HORIZONTAL, 0);
                this.f57174y.add(this.f57167r);
                this.f57175z.notifyDataSetChanged();
                m71597k();
                this.f57170u.mo5528a((C1281m) new C1281m() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        super.onScrollStateChanged(recyclerView, i);
                        if (i == 0) {
                            C21261a.this.mo57237d();
                            C9738o.m28712b(C21261a.this.f57171v, 4);
                            C21261a.this.f57170u.mo5545b((C1281m) this);
                        }
                    }
                });
                this.f57150F = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid login view model");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57233a(String str) {
        this.f57146A = str;
        if (this.f57153b != null) {
            new C21221f().mo57145a(this.f57153b.getString("enter_from")).mo57146b(C21277ab.m71640a(str)).mo57141b();
        }
        C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", this.f57155d).mo56946a("enter_type", this.f57156e).mo56946a("enter_from", this.f57154c).mo56946a("group_id", C21220e.m71415a(this.f57153b)).mo56946a("log_pb", C21220e.m71418b(this.f57153b)).mo56946a("platform", str).f56672a);
        C33026l lVar = (C33026l) C21671bd.m72521a(C33026l.class);
        if (lVar != null) {
            StringBuilder sb = new StringBuilder("Mob.Event.LOGIN_SUBMIT_");
            sb.append(str);
            lVar.mo60022a(sb.toString());
            lVar.mo60023b("LOGIN");
        }
        Intent intent = new Intent(this.f57152a, AuthorizeActivity.class);
        if (this.f57153b != null) {
            intent.putExtras(this.f57153b);
        }
        intent.putExtra("platform", str);
        intent.putExtra("enter_from", this.f57154c);
        intent.putExtra("enter_method", this.f57155d);
        intent.putExtra("enter_type", this.f57156e);
        if (this.f57152a != null) {
            this.f57152a.startActivityForResult(intent, 1001);
        }
        m71592a(str, this.f57154c, this.f57155d);
    }

    public C21261a(Activity activity, Bundle bundle) {
        this(activity, bundle, false, true);
    }

    /* renamed from: a */
    public static void m71592a(String str, String str2, String str3) {
        C6907h.m21524a("login_choose_platform", (Map) new C21102b().mo56946a("enter_method", str3).mo56946a("enter_from", str2).mo56946a("platform", str).mo56944a("_perf_monitor", 1).f56672a);
    }

    private C21261a(Activity activity, Bundle bundle, boolean z, boolean z2) {
        super(activity, R.style.uu, false, true);
        this.f57157f = f57143B;
        this.f57159j = new DividerViewModel(f57145i, Orientation.HORIZONTAL, 0);
        this.f57174y = new ArrayList();
        this.f57152a = activity;
        this.f57153b = bundle;
        mo57230a((Context) activity);
        mo57232a(m71598l());
        if (this.f57153b != null) {
            this.f57154c = this.f57153b.getString("enter_from");
            this.f57155d = this.f57153b.getString("enter_method");
            this.f57156e = this.f57153b.getString("enter_type");
        }
        ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) C6887b.m21436b().mo16895a((Context) C21671bd.m72532b(), "i18n_third_login_strategy", ThirdLoginSetting.class);
        if (thirdLoginSetting != null && thirdLoginSetting.getDirectShowNumber() > 0) {
            this.f57157f = thirdLoginSetting.getDirectShowNumber();
        }
    }
}
