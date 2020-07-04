package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CreateChallengeDialogFragment_ViewBinding */
public class CreateChallengeDialogFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateChallengeDialogFragment f62566a;

    /* renamed from: b */
    private View f62567b;

    /* renamed from: c */
    private TextWatcher f62568c;

    /* renamed from: d */
    private View f62569d;

    /* renamed from: e */
    private TextWatcher f62570e;

    /* renamed from: f */
    private View f62571f;

    /* renamed from: g */
    private View f62572g;

    /* renamed from: h */
    private View f62573h;

    public void unbind() {
        CreateChallengeDialogFragment createChallengeDialogFragment = this.f62566a;
        if (createChallengeDialogFragment != null) {
            this.f62566a = null;
            createChallengeDialogFragment.mTitleView = null;
            createChallengeDialogFragment.mEditTitleView = null;
            createChallengeDialogFragment.mEditDescView = null;
            createChallengeDialogFragment.mCountView = null;
            createChallengeDialogFragment.mConfirmView = null;
            createChallengeDialogFragment.mDeleteView = null;
            ((TextView) this.f62567b).removeTextChangedListener(this.f62568c);
            this.f62568c = null;
            this.f62567b = null;
            ((TextView) this.f62569d).removeTextChangedListener(this.f62570e);
            this.f62570e = null;
            this.f62569d = null;
            this.f62571f.setOnClickListener(null);
            this.f62571f = null;
            this.f62572g.setOnClickListener(null);
            this.f62572g = null;
            this.f62573h.setOnClickListener(null);
            this.f62573h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CreateChallengeDialogFragment_ViewBinding(final CreateChallengeDialogFragment createChallengeDialogFragment, View view) {
        this.f62566a = createChallengeDialogFragment;
        createChallengeDialogFragment.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.un, "field 'mEditTitleView' and method 'onTitleTextChange'");
        createChallengeDialogFragment.mEditTitleView = (EditText) Utils.castView(findRequiredView, R.id.un, "field 'mEditTitleView'", EditText.class);
        this.f62567b = findRequiredView;
        this.f62568c = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                createChallengeDialogFragment.onTitleTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f62568c);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ue, "field 'mEditDescView' and method 'onDescTextChange'");
        createChallengeDialogFragment.mEditDescView = (EditText) Utils.castView(findRequiredView2, R.id.ue, "field 'mEditDescView'", EditText.class);
        this.f62569d = findRequiredView2;
        this.f62570e = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                createChallengeDialogFragment.onDescTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f62570e);
        createChallengeDialogFragment.mCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.a3d, "field 'mCountView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.a11, "field 'mConfirmView' and method 'click'");
        createChallengeDialogFragment.mConfirmView = (TextView) Utils.castView(findRequiredView3, R.id.a11, "field 'mConfirmView'", TextView.class);
        this.f62571f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                createChallengeDialogFragment.click(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.dhh, "field 'mDeleteView' and method 'click'");
        createChallengeDialogFragment.mDeleteView = findRequiredView4;
        this.f62572g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                createChallengeDialogFragment.click(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.jo, "method 'click' and method 'back'");
        this.f62573h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                createChallengeDialogFragment.click(view);
                createChallengeDialogFragment.back();
            }
        });
    }
}
