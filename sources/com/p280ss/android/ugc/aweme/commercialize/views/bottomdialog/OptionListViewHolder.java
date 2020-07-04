package com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.commercialize.model.C25003l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListViewHolder */
public final class OptionListViewHolder extends C1293v {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f67254a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(OptionListViewHolder.class), "singleLineContainer", "getSingleLineContainer()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(OptionListViewHolder.class), "multipleLineContainer", "getMultipleLineContainer()Landroid/widget/LinearLayout;"))};

    /* renamed from: b */
    public static final C25534a f67255b = new C25534a(null);

    /* renamed from: c */
    private final C7541d f67256c;

    /* renamed from: d */
    private final C7541d f67257d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListViewHolder$a */
    public static final class C25534a {
        private C25534a() {
        }

        public /* synthetic */ C25534a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static OptionListViewHolder m83932a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a09, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…st_picker, parent, false)");
            return new OptionListViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListViewHolder$b */
    static final class C25535b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionListAdapter f67258a;

        /* renamed from: b */
        final /* synthetic */ int f67259b;

        C25535b(OptionListAdapter optionListAdapter, int i) {
            this.f67258a = optionListAdapter;
            this.f67259b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67258a.mo66269a(this.f67259b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListViewHolder$c */
    static final class C25536c extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ View f67260a;

        C25536c(View view) {
            this.f67260a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f67260a.findViewById(R.id.c0o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListViewHolder$d */
    static final class C25537d extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f67261a;

        C25537d(View view) {
            this.f67261a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f67261a.findViewById(R.id.d75);
        }
    }

    /* renamed from: a */
    private final FrameLayout m83929a() {
        return (FrameLayout) this.f67256c.getValue();
    }

    /* renamed from: b */
    private final LinearLayout m83930b() {
        return (LinearLayout) this.f67257d.getValue();
    }

    public OptionListViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f67256c = C7546e.m23569a(new C25537d(view));
        this.f67257d = C7546e.m23569a(new C25536c(view));
    }

    /* renamed from: a */
    public final void mo66278a(OptionListAdapter optionListAdapter, int i, boolean z) {
        boolean z2;
        String str;
        C7573i.m23587b(optionListAdapter, "adapter");
        C25003l lVar = (C25003l) optionListAdapter.f67233c.get(i);
        int i2 = 0;
        if (i == optionListAdapter.f67231a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            FrameLayout a = m83929a();
            if (a != null) {
                a.setVisibility(0);
                DmtTextView dmtTextView = (DmtTextView) a.findViewById(R.id.d76);
                if (dmtTextView != null) {
                    dmtTextView.setText(lVar.f65930a);
                }
                ImageView imageView = (ImageView) a.findViewById(R.id.d74);
                if (imageView != null) {
                    if (!z2) {
                        i2 = 4;
                    }
                    imageView.setVisibility(i2);
                }
            }
            LinearLayout b = m83930b();
            if (b != null) {
                b.setVisibility(8);
            }
        } else {
            FrameLayout a2 = m83929a();
            if (a2 != null) {
                a2.setVisibility(8);
            }
            LinearLayout b2 = m83930b();
            if (b2 != null) {
                b2.setVisibility(0);
                DmtTextView dmtTextView2 = (DmtTextView) b2.findViewById(R.id.c0p);
                if (dmtTextView2 != null) {
                    dmtTextView2.setText(lVar.f65930a);
                    if (z2) {
                        str = "#fe2c55";
                    } else {
                        str = "#e6161823";
                    }
                    dmtTextView2.setTextColor(Color.parseColor(str));
                }
            }
        }
        this.itemView.setOnClickListener(new C25535b(optionListAdapter, i));
    }
}
