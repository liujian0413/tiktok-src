package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockSelectTimeFragmentV2_ViewBinding */
public class TimeLockSelectTimeFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TimeLockSelectTimeFragmentV2 f60299a;

    /* renamed from: b */
    private View f60300b;

    public void unbind() {
        TimeLockSelectTimeFragmentV2 timeLockSelectTimeFragmentV2 = this.f60299a;
        if (timeLockSelectTimeFragmentV2 != null) {
            this.f60299a = null;
            timeLockSelectTimeFragmentV2.mTitle = null;
            timeLockSelectTimeFragmentV2.mContainerLayout = null;
            this.f60300b.setOnClickListener(null);
            this.f60300b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TimeLockSelectTimeFragmentV2_ViewBinding(final TimeLockSelectTimeFragmentV2 timeLockSelectTimeFragmentV2, View view) {
        this.f60299a = timeLockSelectTimeFragmentV2;
        timeLockSelectTimeFragmentV2.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        timeLockSelectTimeFragmentV2.mContainerLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.a19, "field 'mContainerLayout'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'back'");
        this.f60300b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                timeLockSelectTimeFragmentV2.back();
            }
        });
    }
}
