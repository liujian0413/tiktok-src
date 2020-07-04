package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.AddChallengeFragment_ViewBinding */
public class AddChallengeFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddChallengeFragment f62477a;

    /* renamed from: b */
    private View f62478b;

    /* renamed from: c */
    private View f62479c;

    /* renamed from: d */
    private TextWatcher f62480d;

    public void unbind() {
        AddChallengeFragment addChallengeFragment = this.f62477a;
        if (addChallengeFragment != null) {
            this.f62477a = null;
            addChallengeFragment.mSendView = null;
            addChallengeFragment.mLabelView = null;
            addChallengeFragment.mEditView = null;
            addChallengeFragment.mListView = null;
            addChallengeFragment.mLoadingView = null;
            addChallengeFragment.mHideChallengeLayout = null;
            addChallengeFragment.mTitleBar = null;
            this.f62478b.setOnClickListener(null);
            this.f62478b = null;
            ((TextView) this.f62479c).removeTextChangedListener(this.f62480d);
            this.f62480d = null;
            this.f62479c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddChallengeFragment_ViewBinding(final AddChallengeFragment addChallengeFragment, View view) {
        this.f62477a = addChallengeFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.d1i, "field 'mSendView' and method 'click'");
        addChallengeFragment.mSendView = (TextView) Utils.castView(findRequiredView, R.id.d1i, "field 'mSendView'", TextView.class);
        this.f62478b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addChallengeFragment.click(view);
            }
        });
        addChallengeFragment.mLabelView = Utils.findRequiredView(view, R.id.awf, "field 'mLabelView'");
        View findRequiredView2 = Utils.findRequiredView(view, R.id.d0q, "field 'mEditView' and method 'onTextChange'");
        addChallengeFragment.mEditView = (EditText) Utils.castView(findRequiredView2, R.id.d0q, "field 'mEditView'", EditText.class);
        this.f62479c = findRequiredView2;
        this.f62480d = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                addChallengeFragment.onTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f62480d);
        addChallengeFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bng, "field 'mListView'", RecyclerView.class);
        addChallengeFragment.mLoadingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.btc, "field 'mLoadingView'", ImageView.class);
        addChallengeFragment.mHideChallengeLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b3k, "field 'mHideChallengeLayout'", LinearLayout.class);
        addChallengeFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", ButtonTitleBar.class);
        addChallengeFragment.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
