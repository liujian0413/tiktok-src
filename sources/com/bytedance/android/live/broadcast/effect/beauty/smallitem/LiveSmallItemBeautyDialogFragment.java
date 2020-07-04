package com.bytedance.android.live.broadcast.effect.beauty.smallitem;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment.C2600a;
import com.bytedance.android.live.broadcast.effect.p136b.C2589a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
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

public final class LiveSmallItemBeautyDialogFragment extends LiveDialogFragment {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f8349a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveSmallItemBeautyDialogFragment.class), "layoutHeight", "getLayoutHeight()I"))};

    /* renamed from: c */
    public static final C2598a f8350c = new C2598a(null);

    /* renamed from: b */
    public boolean f8351b;

    /* renamed from: d */
    private OnDismissListener f8352d;

    /* renamed from: e */
    private final C7541d f8353e = C7546e.m23569a(new C2599b(this));

    /* renamed from: f */
    private HashMap f8354f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment$a */
    public static final class C2598a {
        private C2598a() {
        }

        public /* synthetic */ C2598a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LiveSmallItemBeautyDialogFragment m10672a(boolean z) {
            LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment = new LiveSmallItemBeautyDialogFragment();
            liveSmallItemBeautyDialogFragment.f8351b = z;
            return liveSmallItemBeautyDialogFragment;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment$b */
    static final class C2599b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyDialogFragment f8355a;

        C2599b(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            this.f8355a = liveSmallItemBeautyDialogFragment;
            super(0);
        }

        /* renamed from: a */
        private int m10673a() {
            float f;
            if (this.f8355a.f8351b) {
                f = 220.0f;
            } else {
                f = 238.0f;
            }
            return C3358ac.m12510a(f);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m10673a());
        }
    }

    /* renamed from: a */
    private final int m10667a() {
        return ((Number) this.f8353e.getValue()).intValue();
    }

    /* renamed from: a */
    public static final LiveSmallItemBeautyDialogFragment m10668a(boolean z) {
        return C2598a.m10672a(z);
    }

    /* renamed from: c */
    private void m10670c() {
        if (this.f8354f != null) {
            this.f8354f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m10670c();
    }

    /* renamed from: b */
    private final void m10669b() {
        View view;
        AdjustPercentBar adjustPercentBar = null;
        if (this.f8351b) {
            LiveSmallItemBeautyFragment a = C2600a.m10686a(LiveSmallItemBeautyFragment.f8357h, null, 1, null);
            getChildFragmentManager().mo2645a().mo2585a((int) R.id.d85, (Fragment) a).mo2610f();
            View view2 = getView();
            if (view2 != null) {
                ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.d86);
                if (viewGroup != null) {
                    viewGroup.addView(a.mo9228c());
                }
            }
            View view3 = getView();
            if (view3 != null) {
                ViewGroup viewGroup2 = (ViewGroup) view3.findViewById(R.id.d87);
                if (viewGroup2 != null) {
                    viewGroup2.addView(a.mo9227b());
                }
            }
            return;
        }
        View view4 = getView();
        if (view4 != null) {
            view = view4.findViewById(R.id.d86);
        } else {
            view = null;
        }
        View view5 = getView();
        if (view5 != null) {
            adjustPercentBar = (AdjustPercentBar) view5.findViewById(R.id.d87);
        }
        C2589a aVar = new C2589a(view, adjustPercentBar, 0, 0, 12, null);
        getChildFragmentManager().mo2645a().mo2585a((int) R.id.d85, (Fragment) C2600a.m10685a(aVar)).mo2610f();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z4);
        setCancelable(true);
    }

    /* renamed from: a */
    public final void mo9224a(OnDismissListener onDismissListener) {
        C7573i.m23587b(onDismissListener, "onDismissListener");
        this.f8352d = onDismissListener;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, m10667a());
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f8352d != null) {
            OnDismissListener onDismissListener = this.f8352d;
            if (onDismissListener == null) {
                C7573i.m23580a();
            }
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, m10667a());
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
        }
        return onCreateDialog;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m10669b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C7573i.m23587b(layoutInflater, "inflater");
        if (this.f8351b) {
            i = R.layout.amu;
        } else {
            i = R.layout.amq;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }
}
