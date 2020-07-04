package com.p280ss.android.ugc.aweme.account.p982ui;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.account.login.p974ui.CheckButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerifyIDCardFragment_ViewBinding */
public class VerifyIDCardFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VerifyIDCardFragment f59565a;

    /* renamed from: b */
    private View f59566b;

    /* renamed from: c */
    private View f59567c;

    public void unbind() {
        VerifyIDCardFragment verifyIDCardFragment = this.f59565a;
        if (verifyIDCardFragment != null) {
            this.f59565a = null;
            verifyIDCardFragment.mSubTitle = null;
            verifyIDCardFragment.mIdCardEditText = null;
            verifyIDCardFragment.mDoneBtn = null;
            verifyIDCardFragment.mStatusView = null;
            this.f59566b.setOnClickListener(null);
            this.f59566b = null;
            this.f59567c.setOnClickListener(null);
            this.f59567c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerifyIDCardFragment_ViewBinding(final VerifyIDCardFragment verifyIDCardFragment, View view) {
        this.f59565a = verifyIDCardFragment;
        verifyIDCardFragment.mSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.dd3, "field 'mSubTitle'", TextView.class);
        verifyIDCardFragment.mIdCardEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.abx, "field 'mIdCardEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.q2, "field 'mDoneBtn' and method 'onClick'");
        verifyIDCardFragment.mDoneBtn = (CheckButton) Utils.castView(findRequiredView, R.id.q2, "field 'mDoneBtn'", CheckButton.class);
        this.f59566b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                verifyIDCardFragment.onClick(view);
            }
        });
        verifyIDCardFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.jo, "method 'onClick'");
        this.f59567c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                verifyIDCardFragment.onClick(view);
            }
        });
    }
}
