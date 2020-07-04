package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ContactsActivity_ViewBinding */
public class ContactsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactsActivity f79105a;

    /* renamed from: b */
    private View f79106b;

    /* renamed from: c */
    private View f79107c;

    public void unbind() {
        ContactsActivity contactsActivity = this.f79105a;
        if (contactsActivity != null) {
            this.f79105a = null;
            contactsActivity.mListView = null;
            contactsActivity.mTitleBar = null;
            contactsActivity.mStatusView = null;
            contactsActivity.mRefreshLayout = null;
            contactsActivity.ivBindPhone = null;
            contactsActivity.enterBindRl = null;
            this.f79106b.setOnClickListener(null);
            this.f79106b = null;
            this.f79107c.setOnClickListener(null);
            this.f79107c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactsActivity_ViewBinding(final ContactsActivity contactsActivity, View view) {
        this.f79105a = contactsActivity;
        contactsActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", RecyclerView.class);
        contactsActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        contactsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        contactsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.xc, "field 'ivBindPhone' and method 'closeBindPhoneHint'");
        contactsActivity.ivBindPhone = (ImageView) Utils.castView(findRequiredView, R.id.xc, "field 'ivBindPhone'", ImageView.class);
        this.f79106b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                contactsActivity.closeBindPhoneHint();
            }
        });
        contactsActivity.enterBindRl = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.af2, "field 'enterBindRl'", RelativeLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.af3, "method 'enterBindPhone'");
        this.f79107c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                contactsActivity.enterBindPhone();
            }
        });
    }
}
