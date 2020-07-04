package com.p280ss.android.ugc.aweme.discover.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity_ViewBinding */
public class HotSearchAndDiscoveryActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotSearchAndDiscoveryActivity f69389a;

    /* renamed from: b */
    private View f69390b;

    /* renamed from: c */
    private View f69391c;

    /* renamed from: d */
    private TextWatcher f69392d;

    public void unbind() {
        if (this.f69389a != null) {
            this.f69389a = null;
            this.f69390b.setOnClickListener(null);
            this.f69390b = null;
            ((TextView) this.f69391c).removeTextChangedListener(this.f69392d);
            this.f69392d = null;
            this.f69391c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchAndDiscoveryActivity_ViewBinding(final HotSearchAndDiscoveryActivity hotSearchAndDiscoveryActivity, View view) {
        this.f69389a = hotSearchAndDiscoveryActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.pw, "method 'onClick'");
        this.f69390b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                hotSearchAndDiscoveryActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.agn, "method 'onTextChanged'");
        this.f69391c = findRequiredView2;
        this.f69392d = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                hotSearchAndDiscoveryActivity.onTextChanged(charSequence);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f69392d);
    }
}
