package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusMyProfileFragment_ViewBinding */
public class MusMyProfileFragment_ViewBinding extends MusAbsProfileFragment_ViewBinding {

    /* renamed from: a */
    private MusMyProfileFragment f94809a;

    /* renamed from: b */
    private View f94810b;

    /* renamed from: c */
    private View f94811c;

    public void unbind() {
        if (this.f94809a != null) {
            this.f94809a = null;
            this.f94810b.setOnClickListener(null);
            this.f94810b = null;
            this.f94811c.setOnClickListener(null);
            this.f94811c = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusMyProfileFragment_ViewBinding(final MusMyProfileFragment musMyProfileFragment, View view) {
        super(musMyProfileFragment, view);
        this.f94809a = musMyProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.e7, "method 'addFriends'");
        this.f94810b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musMyProfileFragment.addFriends(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bzz, "method 'onMore'");
        this.f94811c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musMyProfileFragment.onMore(view);
            }
        });
    }
}
