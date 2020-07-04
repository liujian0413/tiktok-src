package com.p280ss.android.ugc.aweme.commercialize;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity_ViewBinding */
public class PoiCouponInputActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCouponInputActivity f64662a;

    /* renamed from: b */
    private View f64663b;

    /* renamed from: c */
    private TextWatcher f64664c;

    /* renamed from: d */
    private View f64665d;

    /* renamed from: e */
    private View f64666e;

    public void unbind() {
        PoiCouponInputActivity poiCouponInputActivity = this.f64662a;
        if (poiCouponInputActivity != null) {
            this.f64662a = null;
            poiCouponInputActivity.titleBar = null;
            poiCouponInputActivity.input = null;
            poiCouponInputActivity.clear = null;
            poiCouponInputActivity.confirm = null;
            ((TextView) this.f64663b).removeTextChangedListener(this.f64664c);
            this.f64664c = null;
            this.f64663b = null;
            this.f64665d.setOnClickListener(null);
            this.f64665d = null;
            this.f64666e.setOnClickListener(null);
            this.f64666e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCouponInputActivity_ViewBinding(final PoiCouponInputActivity poiCouponInputActivity, View view) {
        this.f64662a = poiCouponInputActivity;
        poiCouponInputActivity.titleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'titleBar'", TextTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b19, "field 'input' and method 'onInputChanged'");
        poiCouponInputActivity.input = (EditText) Utils.castView(findRequiredView, R.id.b19, "field 'input'", EditText.class);
        this.f64663b = findRequiredView;
        this.f64664c = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                poiCouponInputActivity.onInputChanged();
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f64664c);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.wh, "field 'clear' and method 'onClearClicked'");
        poiCouponInputActivity.clear = findRequiredView2;
        this.f64665d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiCouponInputActivity.onClearClicked();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.a10, "field 'confirm' and method 'onConfirmClicked'");
        poiCouponInputActivity.confirm = (ImageView) Utils.castView(findRequiredView3, R.id.a10, "field 'confirm'", ImageView.class);
        this.f64666e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiCouponInputActivity.onConfirmClicked();
            }
        });
    }
}
