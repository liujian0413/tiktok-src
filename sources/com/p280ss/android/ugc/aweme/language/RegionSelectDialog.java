package com.p280ss.android.ugc.aweme.language;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.language.RegionApi.C32310a;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1870h.C47588a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog */
public final class RegionSelectDialog extends AlertDialog {

    /* renamed from: b */
    public AutoRTLImageView f84392b;

    /* renamed from: c */
    public DmtTextView f84393c;

    /* renamed from: d */
    public RecyclerView f84394d;

    /* renamed from: e */
    public DmtStatusView f84395e;

    /* renamed from: f */
    public View f84396f;

    /* renamed from: g */
    public int f84397g;

    /* renamed from: h */
    public C32322c f84398h;

    /* renamed from: i */
    public C32329j f84399i;

    /* renamed from: j */
    public C32329j f84400j;

    /* renamed from: k */
    public C48006q<? super C32329j, ? super C32329j, ? super C32329j, C7581n> f84401k;

    /* renamed from: l */
    public C32329j f84402l;

    /* renamed from: m */
    private final C47562b f84403m = new C47562b();

    /* renamed from: n */
    private final List<C32329j> f84404n;

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog$a */
    static final class C32311a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RegionSelectDialog f84405a;

        C32311a(RegionSelectDialog regionSelectDialog) {
            this.f84405a = regionSelectDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            switch (this.f84405a.f84397g) {
                case 0:
                    this.f84405a.dismiss();
                    return;
                case 1:
                    this.f84405a.mo83523e();
                    return;
                case 2:
                    this.f84405a.mo83517a(false);
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog$b */
    static final class C32312b extends Lambda implements C7562b<C32329j, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RegionSelectDialog f84406a;

        C32312b(RegionSelectDialog regionSelectDialog) {
            this.f84406a = regionSelectDialog;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m104863a((C32329j) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104863a(C32329j jVar) {
            C32329j jVar2;
            C7573i.m23587b(jVar, "selectedModel");
            this.f84406a.f84400j = jVar;
            if (this.f84406a.f84401k != null) {
                if (this.f84406a.f84399i == null || (this.f84406a.f84400j instanceof C32323d)) {
                    jVar2 = null;
                } else {
                    jVar2 = this.f84406a.f84400j;
                }
                C48006q d = this.f84406a.mo83521d();
                C32329j jVar3 = this.f84406a.f84402l;
                if (jVar3 == null) {
                    C7573i.m23580a();
                }
                d.invoke(jVar3, this.f84406a.f84399i, jVar2);
            }
            this.f84406a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog$c */
    static final class C32313c extends Lambda implements C7562b<C32329j, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RegionSelectDialog f84407a;

        C32313c(RegionSelectDialog regionSelectDialog) {
            this.f84407a = regionSelectDialog;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m104864a((C32329j) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104864a(C32329j jVar) {
            String str;
            C7573i.m23587b(jVar, "selectedModel");
            C32329j jVar2 = this.f84407a.f84402l;
            String str2 = null;
            if (jVar2 != null) {
                str = jVar2.f84437b;
            } else {
                str = null;
            }
            if (!C7634n.m23717a(str, jVar.f84437b, true)) {
                this.f84407a.f84399i = null;
                this.f84407a.f84400j = null;
            }
            C32329j jVar3 = this.f84407a.f84402l;
            if (jVar3 != null) {
                str2 = jVar3.f84437b;
            }
            boolean z = !C7634n.m23717a(str2, jVar.f84437b, true);
            this.f84407a.f84402l = jVar;
            this.f84407a.mo83517a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog$d */
    static final class C32314d<T> implements C7326g<C32322c> {

        /* renamed from: a */
        final /* synthetic */ RegionSelectDialog f84408a;

        /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog$d$a */
        static final class C32315a extends Lambda implements C7562b<C32329j, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C32314d f84409a;

            /* renamed from: b */
            final /* synthetic */ C32322c f84410b;

            C32315a(C32314d dVar, C32322c cVar) {
                this.f84409a = dVar;
                this.f84410b = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m104866a((C32329j) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m104866a(C32329j jVar) {
                String str;
                C7573i.m23587b(jVar, "selectedModel");
                if (jVar instanceof C32323d) {
                    if (this.f84409a.f84408a.f84401k != null) {
                        C48006q d = this.f84409a.f84408a.mo83521d();
                        C32329j jVar2 = this.f84409a.f84408a.f84402l;
                        if (jVar2 == null) {
                            C7573i.m23580a();
                        }
                        d.invoke(jVar2, null, null);
                    }
                    this.f84409a.f84408a.dismiss();
                    return;
                }
                String str2 = jVar.f84437b;
                C32329j jVar3 = this.f84409a.f84408a.f84399i;
                if (jVar3 != null) {
                    str = jVar3.f84437b;
                } else {
                    str = null;
                }
                if (!C7634n.m23717a(str2, str, true)) {
                    this.f84409a.f84408a.f84400j = null;
                }
                this.f84409a.f84408a.f84399i = jVar;
                this.f84409a.f84408a.mo83524f();
            }
        }

        C32314d(RegionSelectDialog regionSelectDialog) {
            this.f84408a = regionSelectDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C32322c cVar) {
            this.f84408a.f84397g = 1;
            this.f84408a.mo83516a().setText("选择省份");
            this.f84408a.f84398h = cVar;
            RegionSelectAdapter regionSelectAdapter = new RegionSelectAdapter();
            Collection a = C7525m.m23457a(new C32323d());
            Iterable<C32324f> iterable = cVar.f84424a;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (C32324f fVar : iterable) {
                arrayList.add(new C32329j(fVar.f84426b, String.valueOf(fVar.f84427c)));
            }
            regionSelectAdapter.mo83515a(C7525m.m23506c(a, (Iterable<? extends T>) (List) arrayList));
            regionSelectAdapter.f84391c = this.f84408a.f84399i;
            regionSelectAdapter.f84390b = new C32315a(this, cVar);
            this.f84408a.mo83519c().setAdapter(regionSelectAdapter);
            C1273i layoutManager = this.f84408a.mo83519c().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5437e(C7525m.m23487a(regionSelectAdapter.f84389a, this.f84408a.f84399i));
            }
            this.f84408a.mo83518b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectDialog$e */
    static final class C32316e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ RegionSelectDialog f84411a;

        /* renamed from: b */
        final /* synthetic */ C32329j f84412b;

        C32316e(RegionSelectDialog regionSelectDialog, C32329j jVar) {
            this.f84411a = regionSelectDialog;
            this.f84412b = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            Context context = this.f84411a.getContext();
            StringBuilder sb = new StringBuilder("Choosing city for ");
            sb.append(this.f84412b.f84437b);
            sb.append(" is not supported");
            C10761a.m31410e(context, sb.toString()).mo25750a();
            if (this.f84411a.f84401k != null) {
                C48006q d = this.f84411a.mo83521d();
                C32329j jVar = this.f84411a.f84402l;
                if (jVar == null) {
                    C7573i.m23580a();
                }
                d.invoke(jVar, null, null);
            }
            this.f84411a.dismiss();
        }
    }

    /* renamed from: a */
    public final DmtTextView mo83516a() {
        DmtTextView dmtTextView = this.f84393c;
        if (dmtTextView == null) {
            C7573i.m23583a("title");
        }
        return dmtTextView;
    }

    /* renamed from: c */
    public final RecyclerView mo83519c() {
        RecyclerView recyclerView = this.f84394d;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        return recyclerView;
    }

    public final void cancel() {
        this.f84403m.dispose();
        super.cancel();
    }

    /* renamed from: d */
    public final C48006q<C32329j, C32329j, C32329j, C7581n> mo83521d() {
        C48006q<? super C32329j, ? super C32329j, ? super C32329j, C7581n> qVar = this.f84401k;
        if (qVar == null) {
            C7573i.m23583a("selectionResultCallBack");
        }
        return qVar;
    }

    public final void dismiss() {
        this.f84403m.dispose();
        super.dismiss();
    }

    /* renamed from: e */
    public final void mo83523e() {
        this.f84397g = 0;
        DmtTextView dmtTextView = this.f84393c;
        if (dmtTextView == null) {
            C7573i.m23583a("title");
        }
        dmtTextView.setText("选择国家和地区");
        RegionSelectAdapter regionSelectAdapter = new RegionSelectAdapter();
        regionSelectAdapter.mo83515a(this.f84404n);
        regionSelectAdapter.f84391c = this.f84402l;
        regionSelectAdapter.f84390b = new C32313c(this);
        RecyclerView recyclerView = this.f84394d;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        recyclerView.setAdapter(regionSelectAdapter);
        RecyclerView recyclerView2 = this.f84394d;
        if (recyclerView2 == null) {
            C7573i.m23583a("list");
        }
        C1273i layoutManager = recyclerView2.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo5437e(C7525m.m23487a(regionSelectAdapter.f84389a, this.f84402l));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83524f() {
        /*
            r8 = this;
            r0 = 1
            r8.mo83518b(r0)
            r1 = 2
            r8.f84397g = r1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r8.f84393c
            if (r1 != 0) goto L_0x0010
            java.lang.String r2 = "title"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0010:
            java.lang.String r2 = "选择城市"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.ss.android.ugc.aweme.language.RegionSelectAdapter r1 = new com.ss.android.ugc.aweme.language.RegionSelectAdapter
            r1.<init>()
            com.ss.android.ugc.aweme.language.d r2 = new com.ss.android.ugc.aweme.language.d
            r2.<init>()
            java.util.List r2 = kotlin.collections.C7525m.m23457a(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            com.ss.android.ugc.aweme.language.c r3 = r8.f84398h
            if (r3 == 0) goto L_0x0094
            java.util.List<com.ss.android.ugc.aweme.language.f> r3 = r3.f84424a
            if (r3 == 0) goto L_0x0094
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0035:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.ss.android.ugc.aweme.language.f r6 = (com.p280ss.android.ugc.aweme.language.C32324f) r6
            int r6 = r6.f84427c
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.ss.android.ugc.aweme.language.j r7 = r8.f84399i
            if (r7 == 0) goto L_0x004f
            java.lang.String r5 = r7.f84437b
        L_0x004f:
            boolean r5 = kotlin.text.C7634n.m23717a(r6, r5, r0)
            if (r5 == 0) goto L_0x0035
            goto L_0x0057
        L_0x0056:
            r4 = r5
        L_0x0057:
            com.ss.android.ugc.aweme.language.f r4 = (com.p280ss.android.ugc.aweme.language.C32324f) r4
            if (r4 == 0) goto L_0x0094
            java.util.List<com.ss.android.ugc.aweme.language.b> r0 = r4.f84425a
            if (r0 == 0) goto L_0x0094
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C7525m.m23469a(r0, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r0 = r0.iterator()
        L_0x0072:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008f
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.language.b r4 = (com.p280ss.android.ugc.aweme.language.C32321b) r4
            com.ss.android.ugc.aweme.language.j r5 = new com.ss.android.ugc.aweme.language.j
            java.lang.String r6 = r4.f84422a
            int r4 = r4.f84423b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5.<init>(r6, r4)
            r3.add(r5)
            goto L_0x0072
        L_0x008f:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            goto L_0x009b
        L_0x0094:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
        L_0x009b:
            java.util.List r0 = kotlin.collections.C7525m.m23506c(r2, r3)
            r1.mo83515a(r0)
            com.ss.android.ugc.aweme.language.j r0 = r8.f84400j
            r1.f84391c = r0
            com.ss.android.ugc.aweme.language.RegionSelectDialog$b r0 = new com.ss.android.ugc.aweme.language.RegionSelectDialog$b
            r0.<init>(r8)
            kotlin.jvm.a.b r0 = (kotlin.jvm.p357a.C7562b) r0
            r1.f84390b = r0
            android.support.v7.widget.RecyclerView r0 = r8.f84394d
            if (r0 != 0) goto L_0x00b8
            java.lang.String r2 = "list"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00b8:
            r2 = r1
            android.support.v7.widget.RecyclerView$a r2 = (android.support.p029v7.widget.RecyclerView.C1262a) r2
            r0.setAdapter(r2)
            android.support.v7.widget.RecyclerView r0 = r8.f84394d
            if (r0 != 0) goto L_0x00c7
            java.lang.String r2 = "list"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00c7:
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x00d8
            java.util.List<? extends com.ss.android.ugc.aweme.language.j> r1 = r1.f84389a
            com.ss.android.ugc.aweme.language.j r2 = r8.f84400j
            int r1 = kotlin.collections.C7525m.m23487a(r1, r2)
            r0.mo5437e(r1)
        L_0x00d8:
            r0 = 0
            r8.mo83518b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.language.RegionSelectDialog.mo83524f():void");
    }

    /* renamed from: a */
    public final void mo83517a(boolean z) {
        C7492s sVar;
        C32329j jVar = this.f84402l;
        if (jVar != null) {
            mo83518b(true);
            C32322c cVar = this.f84398h;
            if (cVar == null || z) {
                sVar = C32310a.m104852a(jVar.f84437b);
            } else {
                sVar = C7492s.m23301b(cVar);
            }
            C7321c a = sVar.mo19280a((C7326g<? super T>) new C32314d<Object>(this), (C7326g<? super Throwable>) new C32316e<Object>(this, jVar));
            C7573i.m23582a((Object) a, "if (data == null || chan…     dismiss()\n        })");
            C47588a.m148384a(a, this.f84403m);
        }
    }

    /* renamed from: b */
    public final void mo83518b(boolean z) {
        if (z) {
            View view = this.f84396f;
            if (view == null) {
                C7573i.m23583a("maskView");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.f84395e;
            if (dmtStatusView == null) {
                C7573i.m23583a("loadingView");
            }
            dmtStatusView.mo25942f();
            return;
        }
        View view2 = this.f84396f;
        if (view2 == null) {
            C7573i.m23583a("maskView");
        }
        view2.setVisibility(8);
        DmtStatusView dmtStatusView2 = this.f84395e;
        if (dmtStatusView2 == null) {
            C7573i.m23583a("loadingView");
        }
        dmtStatusView2.mo25938c(true);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView((int) R.layout.ahm);
        View findViewById = findViewById(R.id.jo);
        if (findViewById == null) {
            C7573i.m23580a();
        }
        this.f84392b = (AutoRTLImageView) findViewById;
        View findViewById2 = findViewById(R.id.title);
        if (findViewById2 == null) {
            C7573i.m23580a();
        }
        this.f84393c = (DmtTextView) findViewById2;
        View findViewById3 = findViewById(R.id.bn1);
        if (findViewById3 == null) {
            C7573i.m23580a();
        }
        this.f84394d = (RecyclerView) findViewById3;
        View findViewById4 = findViewById(R.id.bu9);
        if (findViewById4 == null) {
            C7573i.m23580a();
        }
        this.f84395e = (DmtStatusView) findViewById4;
        View findViewById5 = findViewById(R.id.x4);
        if (findViewById5 == null) {
            C7573i.m23580a();
        }
        this.f84396f = findViewById5;
        RecyclerView recyclerView = this.f84394d;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AutoRTLImageView autoRTLImageView = this.f84392b;
        if (autoRTLImageView == null) {
            C7573i.m23583a("mBackBtn");
        }
        autoRTLImageView.setOnClickListener(new C32311a(this));
        Map b = C32326h.m104878b();
        String str4 = null;
        if (b != null) {
            str = (String) b.get("province_name");
        } else {
            str = null;
        }
        if (b != null) {
            str2 = (String) b.get("province_id");
        } else {
            str2 = null;
        }
        if (!(str == null || str2 == null)) {
            this.f84399i = new C32329j(str, str2);
        }
        if (b != null) {
            str3 = (String) b.get("city_name");
        } else {
            str3 = null;
        }
        if (b != null) {
            str4 = (String) b.get("city_id");
        }
        if (!(str3 == null || str4 == null)) {
            this.f84400j = new C32329j(str3, str4);
        }
        DmtStatusView dmtStatusView = this.f84395e;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(getContext()));
        mo83523e();
    }

    public RegionSelectDialog(Context context, List<? extends C32329j> list, C32329j jVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "regionList");
        super(context);
        this.f84404n = list;
        this.f84402l = jVar;
    }
}
