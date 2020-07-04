package com.p280ss.android.ugc.aweme.commercialize.anchor;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.commercialize.anchor.adapter.AnchorListAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel */
public final class AnchorPanel extends BottomSheetDialog {

    /* renamed from: b */
    private View f64717b;

    /* renamed from: c */
    private RecyclerView f64718c;

    /* renamed from: d */
    private View f64719d;

    /* renamed from: e */
    private AnchorListAdapter f64720e;

    /* renamed from: f */
    private final List<C24536e> f64721f;

    /* renamed from: g */
    private final C0043i f64722g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel$a */
    static final class C24520a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorPanel f64723a;

        C24520a(AnchorPanel anchorPanel) {
            this.f64723a = anchorPanel;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f64723a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel$b */
    static final class C24521b implements OnShowListener {

        /* renamed from: a */
        public static final C24521b f64724a = new C24521b();

        C24521b() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(R.id.a7r);
                if (frameLayout != null) {
                    BottomSheetBehavior a = BottomSheetBehavior.m1365a(frameLayout);
                    C7573i.m23582a((Object) a, "behavior");
                    a.mo1352a(frameLayout.getHeight());
                    a.f1341g = true;
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.BottomSheetDialog");
        }
    }

    public final void show() {
        setOnShowListener(C24521b.f64724a);
        super.show();
    }

    public final void onCreate(Bundle bundle) {
        LayoutParams layoutParams;
        super.onCreate(bundle);
        setContentView((int) R.layout.a4j);
        this.f64717b = findViewById(R.id.b7i);
        this.f64718c = (RecyclerView) findViewById(R.id.g6);
        this.f64719d = findViewById(R.id.cwi);
        RecyclerView recyclerView = this.f64718c;
        if (recyclerView != null) {
            RecyclerView recyclerView2 = this.f64718c;
            if (recyclerView2 != null) {
                layoutParams = recyclerView2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (this.f64721f.size() > 7) {
                    marginLayoutParams.height = (int) C9738o.m28708b(getContext(), 422.0f);
                } else if (this.f64721f.size() <= 4) {
                    marginLayoutParams.height = (int) C9738o.m28708b(getContext(), 250.0f);
                    recyclerView.setPadding(0, 0, 0, 0);
                } else {
                    marginLayoutParams.height = -2;
                }
                recyclerView.setLayoutParams(marginLayoutParams);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int b = C9738o.m28709b(getContext()) - C9738o.m28717e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            Window window2 = getWindow();
            if (window2 == null) {
                C7573i.m23580a();
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            Window window3 = getWindow();
            if (window3 == null) {
                C7573i.m23580a();
            }
            window3.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        RecyclerView recyclerView3 = this.f64718c;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        this.f64720e = new AnchorListAdapter(this.f64721f, this.f64722g);
        RecyclerView recyclerView4 = this.f64718c;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.f64720e);
        }
        View view = this.f64717b;
        if (view != null) {
            view.setOnClickListener(new C24520a(this));
        }
    }

    public AnchorPanel(Context context, List<C24536e> list, C0043i iVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "anchorList");
        C7573i.m23587b(iVar, "lifecycleOwner");
        super(context, R.style.t1);
        this.f64721f = list;
        this.f64722g = iVar;
    }
}
