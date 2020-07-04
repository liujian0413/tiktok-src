package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryListActivity_ViewBinding */
public class CountryListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CountryListActivity f58407a;

    public void unbind() {
        CountryListActivity countryListActivity = this.f58407a;
        if (countryListActivity != null) {
            this.f58407a = null;
            countryListActivity.etSearch = null;
            countryListActivity.txtSearch = null;
            countryListActivity.back = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CountryListActivity_ViewBinding(CountryListActivity countryListActivity, View view) {
        this.f58407a = countryListActivity;
        countryListActivity.etSearch = (EditText) Utils.findRequiredViewAsType(view, R.id.d0q, "field 'etSearch'", EditText.class);
        countryListActivity.txtSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.d1i, "field 'txtSearch'", TextView.class);
        countryListActivity.back = (ImageView) Utils.findRequiredViewAsType(view, R.id.jo, "field 'back'", ImageView.class);
    }
}
