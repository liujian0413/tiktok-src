package com.bytedance.opensdk.core.base.p628ui.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.base.ui.widget.BaseDialogFragment */
public abstract class BaseDialogFragment extends DialogFragment {

    /* renamed from: b */
    public static final C12318a f32693b = new C12318a(null);

    /* renamed from: a */
    private final int f32694a;

    /* renamed from: c */
    private boolean f32695c;

    /* renamed from: d */
    private boolean f32696d;

    /* renamed from: e */
    private HashMap f32697e;

    /* renamed from: com.bytedance.opensdk.core.base.ui.widget.BaseDialogFragment$a */
    public static final class C12318a {
        private C12318a() {
        }

        public /* synthetic */ C12318a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m35781a(BaseDialogFragment baseDialogFragment, C0608j jVar, String str) {
            C7573i.m23587b(baseDialogFragment, "dialogFragment");
            C7573i.m23587b(str, "tag");
            try {
                baseDialogFragment.show(jVar, str);
            } catch (Exception unused) {
            }
        }
    }

    public BaseDialogFragment() {
        this(false, false, 3, null);
    }

    /* renamed from: a */
    public int mo30149a() {
        return this.f32694a;
    }

    /* renamed from: a */
    public View mo30150a(int i) {
        if (this.f32697e == null) {
            this.f32697e = new HashMap();
        }
        View view = (View) this.f32697e.get(Integer.valueOf(R.id.a8f));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.a8f);
            this.f32697e.put(Integer.valueOf(R.id.a8f), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract View mo30151a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: b */
    public void mo30152b() {
        if (this.f32697e != null) {
            this.f32697e.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo30152b();
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        dialog.setCancelable(this.f32695c);
        dialog.setCanceledOnTouchOutside(this.f32696d);
        Window window = dialog.getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f32695c = bundle.getBoolean("riki_", this.f32695c);
            this.f32696d = bundle.getBoolean("riki_", this.f32696d);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("riki_", this.f32695c);
        bundle.putBoolean("pudge_", this.f32696d);
    }

    public void show(C0608j jVar, String str) {
        try {
            super.show(jVar, str);
        } catch (Exception unused) {
        }
    }

    private BaseDialogFragment(boolean z, boolean z2) {
        this.f32695c = z;
        this.f32696d = z2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        getDialog().requestWindowFeature(1);
        if (mo30149a() != 0) {
            Dialog dialog = getDialog();
            C7573i.m23582a((Object) dialog, "dialog");
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(mo30149a());
            }
        }
        return mo30151a(layoutInflater, viewGroup);
    }

    public /* synthetic */ BaseDialogFragment(boolean z, boolean z2, int i, C7571f fVar) {
        this(false, false);
    }
}
