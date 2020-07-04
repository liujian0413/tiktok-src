package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.SummonFriendsFragment_ViewBinding */
public class SummonFriendsFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SummonFriendsFragment f79359a;

    /* renamed from: b */
    private View f79360b;

    /* renamed from: c */
    private View f79361c;

    /* renamed from: d */
    private View f79362d;

    /* renamed from: e */
    private TextWatcher f79363e;

    public void unbind() {
        SummonFriendsFragment summonFriendsFragment = this.f79359a;
        if (summonFriendsFragment != null) {
            this.f79359a = null;
            summonFriendsFragment.mSendView = null;
            summonFriendsFragment.mTitleView = null;
            summonFriendsFragment.mIvSearchBar = null;
            summonFriendsFragment.mBackView = null;
            summonFriendsFragment.mEditView = null;
            summonFriendsFragment.mBtnClear = null;
            summonFriendsFragment.mListView = null;
            summonFriendsFragment.mStatusView = null;
            this.f79360b.setOnClickListener(null);
            this.f79360b = null;
            this.f79361c.setOnClickListener(null);
            this.f79361c = null;
            ((TextView) this.f79362d).removeTextChangedListener(this.f79363e);
            this.f79363e = null;
            this.f79362d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SummonFriendsFragment_ViewBinding(final SummonFriendsFragment summonFriendsFragment, View view) {
        this.f79359a = summonFriendsFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.e1h, "field 'mSendView' and method 'click'");
        summonFriendsFragment.mSendView = (TextView) Utils.castView(findRequiredView, R.id.e1h, "field 'mSendView'", TextView.class);
        this.f79360b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                summonFriendsFragment.click(view);
            }
        });
        summonFriendsFragment.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        summonFriendsFragment.mIvSearchBar = (ImageView) Utils.findRequiredViewAsType(view, R.id.bbw, "field 'mIvSearchBar'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.jo, "field 'mBackView' and method 'click'");
        summonFriendsFragment.mBackView = (ImageView) Utils.castView(findRequiredView2, R.id.jo, "field 'mBackView'", ImageView.class);
        this.f79361c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                summonFriendsFragment.click(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.agn, "field 'mEditView' and method 'onTextChange'");
        summonFriendsFragment.mEditView = (EditText) Utils.castView(findRequiredView3, R.id.agn, "field 'mEditView'", EditText.class);
        this.f79362d = findRequiredView3;
        this.f79363e = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                summonFriendsFragment.onTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView3).addTextChangedListener(this.f79363e);
        summonFriendsFragment.mBtnClear = Utils.findRequiredView(view, R.id.pw, "field 'mBtnClear'");
        summonFriendsFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bng, "field 'mListView'", RecyclerView.class);
        summonFriendsFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        summonFriendsFragment.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
