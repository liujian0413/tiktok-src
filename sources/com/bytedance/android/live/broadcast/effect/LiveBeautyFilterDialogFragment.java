package com.bytedance.android.live.broadcast.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.beauty.PreViewBeautyFragment;
import com.bytedance.android.live.broadcast.effect.beauty.PreViewBeautyFragment.C2591a;
import com.bytedance.android.live.broadcast.effect.beauty.PreViewFilterFragment;
import com.bytedance.android.live.broadcast.effect.beauty.PreViewFilterFragment.C2592a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
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

public final class LiveBeautyFilterDialogFragment extends LiveDialogFragment {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f8248a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveBeautyFilterDialogFragment.class), "beautyFragment", "getBeautyFragment()Lcom/bytedance/android/live/broadcast/effect/beauty/PreViewBeautyFragment;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveBeautyFilterDialogFragment.class), "filterFragment", "getFilterFragment()Lcom/bytedance/android/live/broadcast/effect/beauty/PreViewFilterFragment;"))};

    /* renamed from: c */
    public static final C2570a f8249c = new C2570a(null);

    /* renamed from: b */
    public C2585a f8250b;

    /* renamed from: d */
    private final C7541d f8251d = C7546e.m23569a(C2571b.f8256a);

    /* renamed from: e */
    private final C7541d f8252e = C7546e.m23569a(new C2572c(this));

    /* renamed from: f */
    private OnDismissListener f8253f;

    /* renamed from: g */
    private BeautyFilterContentType f8254g;

    /* renamed from: h */
    private HashMap f8255h;

    public enum BeautyFilterContentType {
        BEAUTY,
        FILTER
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBeautyFilterDialogFragment$a */
    public static final class C2570a {
        private C2570a() {
        }

        public /* synthetic */ C2570a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LiveBeautyFilterDialogFragment m10567a(C2585a aVar) {
            C7573i.m23587b(aVar, "onItemClickListener");
            LiveBeautyFilterDialogFragment liveBeautyFilterDialogFragment = new LiveBeautyFilterDialogFragment();
            liveBeautyFilterDialogFragment.f8250b = aVar;
            return liveBeautyFilterDialogFragment;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBeautyFilterDialogFragment$b */
    static final class C2571b extends Lambda implements C7561a<PreViewBeautyFragment> {

        /* renamed from: a */
        public static final C2571b f8256a = new C2571b();

        C2571b() {
            super(0);
        }

        /* renamed from: a */
        private static PreViewBeautyFragment m10568a() {
            return C2591a.m10656a();
        }

        public final /* synthetic */ Object invoke() {
            return m10568a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBeautyFilterDialogFragment$c */
    static final class C2572c extends Lambda implements C7561a<PreViewFilterFragment> {

        /* renamed from: a */
        final /* synthetic */ LiveBeautyFilterDialogFragment f8257a;

        C2572c(LiveBeautyFilterDialogFragment liveBeautyFilterDialogFragment) {
            this.f8257a = liveBeautyFilterDialogFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public PreViewFilterFragment invoke() {
            return C2592a.m10659a(new C2585a(this) {

                /* renamed from: a */
                final /* synthetic */ C2572c f8258a;

                {
                    this.f8258a = r1;
                }

                /* renamed from: a */
                public final void mo8810a(int i) {
                    this.f8258a.f8257a.mo9180b();
                    C2585a aVar = this.f8258a.f8257a.f8250b;
                    if (aVar != null) {
                        aVar.mo8810a(i);
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBeautyFilterDialogFragment$d */
    static final class C2574d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveBeautyFilterDialogFragment f8259a;

        C2574d(LiveBeautyFilterDialogFragment liveBeautyFilterDialogFragment) {
            this.f8259a = liveBeautyFilterDialogFragment;
        }

        public final void onClick(View view) {
            this.f8259a.mo9179a(BeautyFilterContentType.BEAUTY);
            this.f8259a.mo9177a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBeautyFilterDialogFragment$e */
    static final class C2575e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveBeautyFilterDialogFragment f8260a;

        C2575e(LiveBeautyFilterDialogFragment liveBeautyFilterDialogFragment) {
            this.f8260a = liveBeautyFilterDialogFragment;
        }

        public final void onClick(View view) {
            this.f8260a.mo9179a(BeautyFilterContentType.FILTER);
            this.f8260a.mo9177a();
        }
    }

    /* renamed from: a */
    private View m10557a(int i) {
        if (this.f8255h == null) {
            this.f8255h = new HashMap();
        }
        View view = (View) this.f8255h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8255h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public static final LiveBeautyFilterDialogFragment m10558a(C2585a aVar) {
        return C2570a.m10567a(aVar);
    }

    /* renamed from: c */
    private final PreViewBeautyFragment m10559c() {
        return (PreViewBeautyFragment) this.f8251d.getValue();
    }

    /* renamed from: d */
    private final PreViewFilterFragment m10560d() {
        return (PreViewFilterFragment) this.f8252e.getValue();
    }

    /* renamed from: f */
    private void m10562f() {
        if (this.f8255h != null) {
            this.f8255h.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m10562f();
    }

    /* renamed from: e */
    private final void m10561e() {
        ((ConstraintLayout) m10557a((int) R.id.p8)).setOnClickListener(new C2574d(this));
        ((ConstraintLayout) m10557a((int) R.id.pc)).setOnClickListener(new C2575e(this));
        BeautyFilterContentType beautyFilterContentType = this.f8254g;
        this.f8254g = null;
        if (beautyFilterContentType == null) {
            beautyFilterContentType = BeautyFilterContentType.BEAUTY;
        }
        mo9179a(beautyFilterContentType);
        mo9177a();
        mo9180b();
    }

    /* renamed from: b */
    public final void mo9180b() {
        if (C2624k.m10736a().mo9270c()) {
            View a = m10557a((int) R.id.ak_);
            C7573i.m23582a((Object) a, "filter_dot");
            a.setVisibility(0);
            return;
        }
        View a2 = m10557a((int) R.id.ak_);
        C7573i.m23582a((Object) a2, "filter_dot");
        a2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo9177a() {
        BeautyFilterContentType beautyFilterContentType = this.f8254g;
        if (beautyFilterContentType != null) {
            switch (C2614c.f8390b[beautyFilterContentType.ordinal()]) {
                case 1:
                    TextView textView = (TextView) m10557a((int) R.id.dqw);
                    C7573i.m23582a((Object) textView, "tv_beauty");
                    textView.setAlpha(1.0f);
                    View a = m10557a((int) R.id.b6i);
                    C7573i.m23582a((Object) a, "iv_beauty_indicator");
                    a.setVisibility(0);
                    TextView textView2 = (TextView) m10557a((int) R.id.dui);
                    C7573i.m23582a((Object) textView2, "tv_filter");
                    textView2.setAlpha(0.5f);
                    View a2 = m10557a((int) R.id.b9c);
                    C7573i.m23582a((Object) a2, "iv_filter_indicator");
                    a2.setVisibility(8);
                    return;
                case 2:
                    TextView textView3 = (TextView) m10557a((int) R.id.dqw);
                    C7573i.m23582a((Object) textView3, "tv_beauty");
                    textView3.setAlpha(0.5f);
                    View a3 = m10557a((int) R.id.b6i);
                    C7573i.m23582a((Object) a3, "iv_beauty_indicator");
                    a3.setVisibility(8);
                    TextView textView4 = (TextView) m10557a((int) R.id.dui);
                    C7573i.m23582a((Object) textView4, "tv_filter");
                    textView4.setAlpha(1.0f);
                    View a4 = m10557a((int) R.id.b9c);
                    C7573i.m23582a((Object) a4, "iv_filter_indicator");
                    a4.setVisibility(0);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo9178a(OnDismissListener onDismissListener) {
        C7573i.m23587b(onDismissListener, "onDismissListener");
        this.f8253f = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        OnDismissListener onDismissListener = this.f8253f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, C3358ac.m12510a(222.0f));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z4);
        setCancelable(true);
        C2624k.m10736a().mo9267b();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo9179a(BeautyFilterContentType beautyFilterContentType) {
        if (this.f8254g != beautyFilterContentType) {
            C0633q a = getChildFragmentManager().mo2645a();
            C7573i.m23582a((Object) a, "childFragmentManager.beginTransaction()");
            switch (C2614c.f8389a[beautyFilterContentType.ordinal()]) {
                case 1:
                    Fragment a2 = getChildFragmentManager().mo2644a("PreViewFilterFragment");
                    if (a2 != null) {
                        a.mo2601b(a2);
                    }
                    Fragment a3 = getChildFragmentManager().mo2644a("PreViewBeautyFragment");
                    if (a3 != null) {
                        a.mo2605c(a3);
                        break;
                    } else {
                        a.mo2586a(R.id.a24, m10559c(), "PreViewBeautyFragment");
                        break;
                    }
                case 2:
                    Fragment a4 = getChildFragmentManager().mo2644a("PreViewBeautyFragment");
                    if (a4 != null) {
                        a.mo2601b(a4);
                    }
                    Fragment a5 = getChildFragmentManager().mo2644a("PreViewFilterFragment");
                    if (a5 != null) {
                        a.mo2605c(a5);
                        break;
                    } else {
                        a.mo2586a(R.id.a24, m10560d(), "PreViewFilterFragment");
                        break;
                    }
            }
            a.mo2610f();
            this.f8254g = beautyFilterContentType;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m10561e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.amp, viewGroup, false);
    }
}
