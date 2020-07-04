package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.profile.util.C36766w;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43097ei;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment */
public final class ProfileEditContentFragment extends ProfileEditInputFragment {

    /* renamed from: f */
    public static final C36236a f95051f = new C36236a(null);

    /* renamed from: b */
    public String f95052b = "";

    /* renamed from: c */
    public boolean f95053c;

    /* renamed from: d */
    public int f95054d;

    /* renamed from: e */
    public boolean f95055e;

    /* renamed from: g */
    private String f95056g = "";

    /* renamed from: h */
    private String f95057h = "";

    /* renamed from: k */
    private C36237b f95058k;

    /* renamed from: l */
    private HashMap f95059l;
    public ImageView mClearAllBtn;
    public EditText mEditContentInput;
    public TextView mEditLengthHint;
    public TextView mIdEditHintText;
    public TextView mTvContentName;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$a */
    public static final class C36236a {
        private C36236a() {
        }

        public /* synthetic */ C36236a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileEditContentFragment m117125a(String str, String str2, boolean z, String str3, int i, boolean z2) {
            C7573i.m23587b(str, "contentName");
            C7573i.m23587b(str2, "contentValue");
            C7573i.m23587b(str3, "editHint");
            ProfileEditContentFragment profileEditContentFragment = new ProfileEditContentFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            bundle.putBoolean("is_edit_enabled", z);
            bundle.putString("edit_hint", str3);
            bundle.putInt("content_max_length", i);
            bundle.putBoolean("is_enable_null", z2);
            profileEditContentFragment.setArguments(bundle);
            return profileEditContentFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$b */
    public interface C36237b {
        /* renamed from: a */
        void mo92242a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$c */
    public static final class C36238c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ProfileEditContentFragment f95060a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C36238c(ProfileEditContentFragment profileEditContentFragment) {
            this.f95060a = profileEditContentFragment;
        }

        public final void afterTextChanged(Editable editable) {
            C7573i.m23587b(editable, "s");
            if (this.f95060a.f95053c) {
                if (editable.length() <= 0 && !this.f95060a.f95055e) {
                    this.f95060a.mo92283i();
                } else if (!TextUtils.equals(editable.toString(), this.f95060a.f95052b)) {
                    this.f95060a.mo92282h();
                } else {
                    this.f95060a.mo92283i();
                }
                if (editable.length() > 0) {
                    this.f95060a.mo92239c().setVisibility(0);
                    return;
                }
                this.f95060a.mo92239c().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            if (this.f95060a.f95054d != 0) {
                if (ProfileEditContentFragment.m117188a(this.f95060a.mo92238b(), this.f95060a.f95054d)) {
                    C10761a.m31409e((Context) this.f95060a.getActivity(), (int) R.string.ru).mo25750a();
                    this.f95060a.mo92240f().setTextColor(this.f95060a.getResources().getColor(R.color.pm));
                } else {
                    this.f95060a.mo92240f().setTextColor(this.f95060a.getResources().getColor(R.color.a53));
                }
                this.f95060a.mo92240f().setText(this.f95060a.getString(R.string.a0c, Integer.valueOf(this.f95060a.mo92238b().length()), Integer.valueOf(this.f95060a.f95054d)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$d */
    static final class C36239d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditContentFragment f95061a;

        C36239d(ProfileEditContentFragment profileEditContentFragment) {
            this.f95061a = profileEditContentFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f95061a.mo92214d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$e */
    static final class C36240e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditContentFragment f95062a;

        C36240e(ProfileEditContentFragment profileEditContentFragment) {
            this.f95062a = profileEditContentFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m77057c(this.f95062a.mo92238b());
            C36766w.m118505a("save_profile", "click_save");
            this.f95062a.mo92215e();
            this.f95062a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$f */
    static final class C36241f implements OnEditorActionListener {

        /* renamed from: a */
        public static final C36241f f95063a = new C36241f();

        C36241f() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final ProfileEditContentFragment m117116a(String str, String str2, boolean z, String str3, int i, boolean z2) {
        return C36236a.m117125a(str, str2, true, str3, i, z2);
    }

    /* renamed from: a */
    public final void mo92207a() {
        if (this.f95059l != null) {
            this.f95059l.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92207a();
    }

    /* renamed from: b */
    public final EditText mo92238b() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final ImageView mo92239c() {
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C7573i.m23583a("mClearAllBtn");
        }
        return imageView;
    }

    /* renamed from: f */
    public final TextView mo92240f() {
        TextView textView = this.mEditLengthHint;
        if (textView == null) {
            C7573i.m23583a("mEditLengthHint");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo92215e() {
        C36237b bVar = this.f95058k;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C7573i.m23583a("mEditContentInput");
            }
            bVar.mo92242a(editText.getText().toString());
        }
    }

    public final void onClear() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText.setText("");
    }

    /* renamed from: g */
    private final void m117117g() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText.setEnabled(false);
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText2.setFocusable(false);
        EditText editText3 = this.mEditContentInput;
        if (editText3 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText3.setFocusableInTouchMode(false);
    }

    /* renamed from: d */
    public final boolean mo92214d() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        KeyboardUtils.m77057c(editText);
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            C7573i.m23582a((Object) dialog, "dialog");
            if (dialog.isShowing() && isResumed()) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo92237a(C36237b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f95058k = bVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            String string = arguments.getString("content_name");
            C7573i.m23582a((Object) string, "arguments!!.getString(CONTENT_NAME)");
            this.f95056g = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            String string2 = arguments2.getString("content_value");
            C7573i.m23582a((Object) string2, "arguments!!.getString(CONTENT_VALUE)");
            this.f95052b = string2;
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C7573i.m23580a();
            }
            this.f95053c = arguments3.getBoolean("is_edit_enabled");
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C7573i.m23580a();
            }
            String string3 = arguments4.getString("edit_hint");
            C7573i.m23582a((Object) string3, "arguments!!.getString(CONTENT_EDIT_HINT)");
            this.f95057h = string3;
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                C7573i.m23580a();
            }
            this.f95054d = arguments5.getInt("content_max_length");
            Bundle arguments6 = getArguments();
            if (arguments6 == null) {
                C7573i.m23580a();
            }
            this.f95055e = arguments6.getBoolean("is_enable_null");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Integer num;
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.q6, viewGroup, false);
        if (C6399b.m19946v() || C7212bb.m22493a()) {
            C43097ei eiVar = C43097ei.f111719a;
            Activity activity = getActivity();
            Dialog dialog = getDialog();
            C7573i.m23582a((Object) dialog, "dialog");
            eiVar.mo104758a(activity, dialog.getWindow(), true);
        }
        this.f95130i = (TextTitleBar) inflate.findViewById(R.id.djz);
        TextTitleBar textTitleBar = this.f95130i;
        if (textTitleBar != null) {
            textTitleBar.setTitle((CharSequence) this.f95056g);
        }
        ButterKnife.bind((Object) this, inflate);
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C7573i.m23583a("mTvContentName");
        }
        textView.setText(this.f95056g);
        if (C6399b.m19946v()) {
            ImageView imageView = this.mClearAllBtn;
            if (imageView == null) {
                C7573i.m23583a("mClearAllBtn");
            }
            imageView.setImageResource(R.drawable.cmt);
        }
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText.addTextChangedListener(new C36238c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText2.setText(this.f95052b);
        EditText editText3 = this.mEditContentInput;
        if (editText3 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        EditText editText4 = this.mEditContentInput;
        if (editText4 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.mEditContentInput;
        if (editText5 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.mEditContentInput;
        if (editText6 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.mEditContentInput;
        if (editText7 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText7.requestFocus();
        TextTitleBar textTitleBar2 = this.f95130i;
        if (textTitleBar2 != null) {
            DmtTextView startText = textTitleBar2.getStartText();
            if (startText != null) {
                startText.setOnClickListener(new C36239d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f95130i;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C36240e(this));
            }
        }
        if (!this.f95053c) {
            m117117g();
            ImageView imageView2 = this.mClearAllBtn;
            if (imageView2 == null) {
                C7573i.m23583a("mClearAllBtn");
            }
            imageView2.setVisibility(8);
        }
        mo92283i();
        if (TextUtils.isEmpty(this.f95057h)) {
            TextView textView2 = this.mIdEditHintText;
            if (textView2 == null) {
                C7573i.m23583a("mIdEditHintText");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.mIdEditHintText;
            if (textView3 == null) {
                C7573i.m23583a("mIdEditHintText");
            }
            textView3.setText(this.f95057h);
        }
        if (this.f95054d > 0) {
            TextView textView4 = this.mEditLengthHint;
            if (textView4 == null) {
                C7573i.m23583a("mEditLengthHint");
            }
            textView4.setVisibility(0);
            TextView textView5 = this.mEditLengthHint;
            if (textView5 == null) {
                C7573i.m23583a("mEditLengthHint");
            }
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(this.f95052b)) {
                i = 0;
            } else {
                String str = this.f95052b;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                } else {
                    num = null;
                }
                i = num.intValue();
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.f95054d);
            textView5.setText(getString(R.string.a0c, objArr));
        }
        EditText editText8 = this.mEditContentInput;
        if (editText8 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText8.setOnEditorActionListener(C36241f.f95063a);
        return inflate;
    }
}
