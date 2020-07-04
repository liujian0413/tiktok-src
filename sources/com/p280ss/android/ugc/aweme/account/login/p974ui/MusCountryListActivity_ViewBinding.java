package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity_ViewBinding */
public class MusCountryListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusCountryListActivity f58471a;

    public void unbind() {
        MusCountryListActivity musCountryListActivity = this.f58471a;
        if (musCountryListActivity != null) {
            this.f58471a = null;
            musCountryListActivity.etSearch = null;
            musCountryListActivity.txtSearch = null;
            musCountryListActivity.back = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusCountryListActivity_ViewBinding(MusCountryListActivity musCountryListActivity, View view) {
        this.f58471a = musCountryListActivity;
        musCountryListActivity.etSearch = (EditText) Utils.findRequiredViewAsType(view, R.id.d0q, "field 'etSearch'", EditText.class);
        musCountryListActivity.txtSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.d1i, "field 'txtSearch'", TextView.class);
        musCountryListActivity.back = (ImageView) Utils.findRequiredViewAsType(view, R.id.jo, "field 'back'", ImageView.class);
    }
}
