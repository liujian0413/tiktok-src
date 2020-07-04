package com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.model.C25003l;
import com.p280ss.android.ugc.aweme.commercialize.model.C25004m;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListAdapter.C25522a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog */
public final class OptionListPickerDialog extends AdBottomDialog {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f67235a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(OptionListPickerDialog.class), "mListContainer", "getMListContainer()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(OptionListPickerDialog.class), "mConfirmView", "getMConfirmView()Lcom/ss/android/ugc/aweme/commercialize/views/bottomdialog/AdBottomDialogConfirmView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(OptionListPickerDialog.class), "mCancelView", "getMCancelView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: f */
    public static final C25525b f67236f = new C25525b(null);

    /* renamed from: b */
    public final List<RecyclerView> f67237b = new ArrayList();

    /* renamed from: c */
    public final List<OptionListAdapter> f67238c = new ArrayList();

    /* renamed from: d */
    public C25524a f67239d;

    /* renamed from: e */
    public final C25004m f67240e;

    /* renamed from: g */
    private final C7541d f67241g = C7546e.m23569a(new C25533j(this));

    /* renamed from: h */
    private final C7541d f67242h = C7546e.m23569a(new C25532i(this));

    /* renamed from: i */
    private final C7541d f67243i = C7546e.m23569a(new C25531h(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$a */
    public interface C25524a {
        /* renamed from: a */
        void mo66051a();

        /* renamed from: a */
        void mo66052a(List<Integer> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$b */
    public static final class C25525b {
        private C25525b() {
        }

        public /* synthetic */ C25525b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$c */
    public static final class C25526c implements C25522a {

        /* renamed from: a */
        final /* synthetic */ OptionListAdapter f67244a;

        /* renamed from: b */
        final /* synthetic */ OptionListPickerDialog f67245b;

        /* renamed from: c */
        final /* synthetic */ int f67246c;

        /* renamed from: a */
        public final void mo66270a(int i) {
            if (this.f67246c != this.f67245b.f67238c.size() - 1 || i == -1) {
                AdBottomDialogConfirmView c = this.f67245b.mo66271c();
                if (c != null) {
                    c.setClickable(false);
                }
                int i2 = this.f67245b.f67240e.f65933b;
                for (int i3 = this.f67246c + 1; i3 < i2; i3++) {
                    OptionListAdapter optionListAdapter = (OptionListAdapter) this.f67245b.f67238c.get(i3);
                    optionListAdapter.mo66268a();
                    if (i3 != this.f67246c + 1 || i == -1) {
                        ((RecyclerView) this.f67245b.f67237b.get(i3)).setVisibility(4);
                    } else {
                        List<C25003l> list = optionListAdapter.f67233c;
                        List<C25003l> list2 = ((C25003l) this.f67244a.f67233c.get(i)).f65931b;
                        if (list2 == null) {
                            list2 = C7525m.m23461a();
                        }
                        list.addAll(list2);
                        ((RecyclerView) this.f67245b.f67237b.get(i3)).setVisibility(0);
                    }
                    optionListAdapter.notifyDataSetChanged();
                }
                return;
            }
            AdBottomDialogConfirmView c2 = this.f67245b.mo66271c();
            if (c2 != null) {
                c2.setClickable(true);
            }
        }

        C25526c(OptionListAdapter optionListAdapter, OptionListPickerDialog optionListPickerDialog, int i) {
            this.f67244a = optionListAdapter;
            this.f67245b = optionListPickerDialog;
            this.f67246c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$d */
    static final class C25527d implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67247a;

        C25527d(OptionListPickerDialog optionListPickerDialog) {
            this.f67247a = optionListPickerDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f67247a.mo66272d();
            this.f67247a.mo66273e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$e */
    static final class C25528e implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67248a;

        C25528e(OptionListPickerDialog optionListPickerDialog) {
            this.f67248a = optionListPickerDialog;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C25524a aVar = this.f67248a.f67239d;
            if (aVar != null) {
                aVar.mo66051a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$f */
    static final class C25529f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67249a;

        C25529f(OptionListPickerDialog optionListPickerDialog) {
            this.f67249a = optionListPickerDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Iterable<OptionListAdapter> iterable = this.f67249a.f67238c;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (OptionListAdapter optionListAdapter : iterable) {
                arrayList.add(Integer.valueOf(optionListAdapter.f67231a));
            }
            List h = C7525m.m23516h((Iterable<? extends T>) (List) arrayList);
            C25524a aVar = this.f67249a.f67239d;
            if (aVar != null) {
                aVar.mo66052a(h);
            }
            this.f67249a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$g */
    static final class C25530g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67250a;

        C25530g(OptionListPickerDialog optionListPickerDialog) {
            this.f67250a = optionListPickerDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25524a aVar = this.f67250a.f67239d;
            if (aVar != null) {
                aVar.mo66051a();
            }
            this.f67250a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$h */
    static final class C25531h extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67251a;

        C25531h(OptionListPickerDialog optionListPickerDialog) {
            this.f67251a = optionListPickerDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f67251a.findViewById(R.id.sp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$i */
    static final class C25532i extends Lambda implements C7561a<AdBottomDialogConfirmView> {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67252a;

        C25532i(OptionListPickerDialog optionListPickerDialog) {
            this.f67252a = optionListPickerDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AdBottomDialogConfirmView invoke() {
            return (AdBottomDialogConfirmView) this.f67252a.findViewById(R.id.a10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog$j */
    static final class C25533j extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ OptionListPickerDialog f67253a;

        C25533j(OptionListPickerDialog optionListPickerDialog) {
            this.f67253a = optionListPickerDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f67253a.findViewById(R.id.c9_);
        }
    }

    /* renamed from: f */
    private final LinearLayout m83914f() {
        return (LinearLayout) this.f67241g.getValue();
    }

    /* renamed from: g */
    private final DmtTextView m83915g() {
        return (DmtTextView) this.f67243i.getValue();
    }

    /* renamed from: a */
    public final int mo66262a() {
        return R.layout.kw;
    }

    /* renamed from: c */
    public final AdBottomDialogConfirmView mo66271c() {
        return (AdBottomDialogConfirmView) this.f67242h.getValue();
    }

    /* renamed from: j */
    private final void m83918j() {
        setOnShowListener(new C25527d(this));
        setOnCancelListener(new C25528e(this));
    }

    /* renamed from: h */
    private final void m83916h() {
        AdBottomDialogConfirmView c = mo66271c();
        if (c != null) {
            c.setOnClickListener(new C25529f(this));
            c.setClickable(false);
        }
        DmtTextView g = m83915g();
        if (g != null) {
            g.setOnClickListener(new C25530g(this));
        }
    }

    /* renamed from: d */
    public final void mo66272d() {
        OptionListAdapter optionListAdapter = (OptionListAdapter) this.f67238c.get(0);
        optionListAdapter.f67233c.addAll(this.f67240e.f65934c);
        optionListAdapter.notifyDataSetChanged();
        ((RecyclerView) this.f67237b.get(0)).setVisibility(0);
    }

    /* renamed from: e */
    public final void mo66273e() {
        List<Integer> list = this.f67240e.f65935d;
        if (list != null && (!list.isEmpty())) {
            int min = Math.min(list.size(), this.f67238c.size());
            for (int i = 0; i < min; i++) {
                if (((Number) list.get(i)).intValue() >= 0 && ((Number) list.get(i)).intValue() < ((OptionListAdapter) this.f67238c.get(i)).f67233c.size()) {
                    ((OptionListAdapter) this.f67238c.get(i)).mo66269a(((Number) list.get(i)).intValue());
                    ((RecyclerView) this.f67237b.get(i)).mo5541b(((Number) list.get(i)).intValue());
                }
            }
        }
    }

    /* renamed from: i */
    private final void m83917i() {
        int i = this.f67240e.f65933b;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                View view = new View(getContext());
                view.setBackgroundColor(Color.parseColor("#1e000000"));
                view.setLayoutParams(new LayoutParams(C23486n.m77122a(0.5d), -1));
                LinearLayout f = m83914f();
                if (f != null) {
                    f.addView(view);
                }
            }
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setVisibility(4);
            recyclerView.setLayoutParams(new LayoutParams(0, -1, 1.0f));
            List arrayList = new ArrayList();
            boolean z = true;
            if (this.f67240e.f65933b != 1) {
                z = false;
            }
            OptionListAdapter optionListAdapter = new OptionListAdapter(arrayList, z);
            optionListAdapter.f67232b = new C25526c(optionListAdapter, this, i2);
            recyclerView.setAdapter(optionListAdapter);
            LinearLayout f2 = m83914f();
            if (f2 != null) {
                f2.addView(recyclerView);
            }
            this.f67237b.add(recyclerView);
            this.f67238c.add(optionListAdapter);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m83916h();
        m83917i();
        m83918j();
    }

    public OptionListPickerDialog(Context context, C25004m mVar) {
        C7573i.m23587b(mVar, "params");
        super(context);
        this.f67240e = mVar;
    }
}
