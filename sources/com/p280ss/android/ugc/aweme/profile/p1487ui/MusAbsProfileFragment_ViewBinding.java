package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment_ViewBinding */
public class MusAbsProfileFragment_ViewBinding extends BaseProfileFragment_ViewBinding {

    /* renamed from: a */
    private MusAbsProfileFragment f94765a;

    /* renamed from: b */
    private View f94766b;

    public void unbind() {
        if (this.f94765a != null) {
            this.f94765a = null;
            this.f94766b.setOnClickListener(null);
            this.f94766b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusAbsProfileFragment_ViewBinding(final MusAbsProfileFragment musAbsProfileFragment, View view) {
        super(musAbsProfileFragment, view);
        this.f94765a = musAbsProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.bzz, "method 'onMore'");
        this.f94766b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musAbsProfileFragment.onMore(view);
            }
        });
    }
}
