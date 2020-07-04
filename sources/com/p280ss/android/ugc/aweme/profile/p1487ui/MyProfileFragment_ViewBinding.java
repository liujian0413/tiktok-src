package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MyProfileFragment_ViewBinding */
public class MyProfileFragment_ViewBinding extends BaseDTProfileFragment_ViewBinding {

    /* renamed from: a */
    private MyProfileFragment f94961a;

    /* renamed from: b */
    private View f94962b;

    public void unbind() {
        MyProfileFragment myProfileFragment = this.f94961a;
        if (myProfileFragment != null) {
            this.f94961a = null;
            myProfileFragment.ivBindPhone = null;
            myProfileFragment.mMoreView = null;
            myProfileFragment.mYellowPoint = null;
            this.f94962b.setOnClickListener(null);
            this.f94962b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MyProfileFragment_ViewBinding(final MyProfileFragment myProfileFragment, View view) {
        super(myProfileFragment, view);
        this.f94961a = myProfileFragment;
        myProfileFragment.ivBindPhone = (ImageView) Utils.findRequiredViewAsType(view, R.id.b7g, "field 'ivBindPhone'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bzz, "field 'mMoreView' and method 'onMore'");
        myProfileFragment.mMoreView = (RelativeLayout) Utils.castView(findRequiredView, R.id.bzz, "field 'mMoreView'", RelativeLayout.class);
        this.f94962b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                myProfileFragment.onMore(view);
            }
        });
        myProfileFragment.mYellowPoint = Utils.findRequiredView(view, R.id.ei1, "field 'mYellowPoint'");
    }
}
