package p973;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.opensdk.core.base.p628ui.widget.BaseDialogFragment;
import com.bytedance.opensdk.core.base.p628ui.widget.BaseDialogFragment.C12318a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: LoadingDialogFragment */
public final class LoadingDialogFragment extends BaseDialogFragment {

    /* renamed from: a */
    public static final C21788a f58297a = new C21788a(null);

    /* renamed from: c */
    private final int f58298c = R.drawable.o8;

    /* renamed from: d */
    private HashMap f58299d;

    /* renamed from: LoadingDialogFragment$a */
    public static final class C21788a {
        private C21788a() {
        }

        public /* synthetic */ C21788a(C7571f fVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static LoadingDialogFragment m72835a(String str) {
            LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("hint", str);
            loadingDialogFragment.setArguments(bundle);
            return loadingDialogFragment;
        }
    }

    /* renamed from: a */
    public final int mo30149a() {
        return this.f58298c;
    }

    /* renamed from: a */
    public final View mo30150a(int i) {
        if (this.f58299d == null) {
            this.f58299d = new HashMap();
        }
        View view = (View) this.f58299d.get(Integer.valueOf(R.id.a8f));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.a8f);
            this.f58299d.put(Integer.valueOf(R.id.a8f), view);
        }
        return view;
    }

    /* renamed from: b */
    public final void mo30152b() {
        if (this.f58299d != null) {
            this.f58299d.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo30152b();
    }

    public LoadingDialogFragment() {
        super(false, false, 3, null);
    }

    public final void dismissAllowingStateLoss() {
        try {
            C0612l lVar = this.mFragmentManager;
            if (lVar != null) {
                lVar.mo2654b();
            }
        } catch (Exception unused) {
        }
        if (isAdded()) {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: a */
    private void m72828a(String str) {
        boolean z;
        if (isAdded()) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TextView textView = (TextView) mo30150a((int) R.id.a8f);
                if (textView != null) {
                    textView.setVisibility(8);
                }
                return;
            }
            TextView textView2 = (TextView) mo30150a((int) R.id.a8f);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) mo30150a((int) R.id.a8f);
            if (textView3 != null) {
                textView3.setText(charSequence);
            }
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putString("hint", str);
            }
        }
    }

    /* renamed from: a */
    public final void mo58122a(C0608j jVar) {
        if (jVar != null) {
            try {
                jVar.mo2654b();
            } catch (Exception unused) {
            }
        }
        if (!isAdded()) {
            C12318a.m35781a(this, jVar, "LoadingDialog");
        }
    }

    /* renamed from: a */
    public final View mo30151a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.s1, viewGroup, false);
        C7573i.m23582a((Object) inflate, "layoutInflater.inflate(R…oading, container, false)");
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("hint");
        } else {
            str = null;
        }
        m72828a(str);
    }
}
