package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
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
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.profile.util.C36766w;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43004cb;
import com.p280ss.android.ugc.aweme.utils.C43097ei;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment */
public final class ProfileEditUsernameFragment extends ProfileEditInputFragment {

    /* renamed from: g */
    public static final C36262a f95132g = new C36262a(null);

    /* renamed from: b */
    public String f95133b = "";

    /* renamed from: c */
    public boolean f95134c;

    /* renamed from: d */
    public String f95135d = "";

    /* renamed from: e */
    public int f95136e;

    /* renamed from: f */
    public boolean f95137f;

    /* renamed from: h */
    private String f95138h = "";

    /* renamed from: k */
    private String f95139k = "";

    /* renamed from: l */
    private C36263b f95140l;

    /* renamed from: m */
    private HashMap f95141m;
    public ImageView mClearAllBtn;
    public EditText mEditContentInput;
    public TextView mIdEditHintText;
    public TextView mTvContentName;
    public TextView mUserLinkHint;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$a */
    public static final class C36262a {
        private C36262a() {
        }

        public /* synthetic */ C36262a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileEditUsernameFragment m117206a(String str, String str2, boolean z, String str3, int i, boolean z2, String str4) {
            C7573i.m23587b(str, "contentName");
            C7573i.m23587b(str2, "contentValue");
            C7573i.m23587b(str3, "editHint");
            C7573i.m23587b(str4, "enterFrom");
            ProfileEditUsernameFragment profileEditUsernameFragment = new ProfileEditUsernameFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            bundle.putString("enter_from", str4);
            bundle.putBoolean("is_edit_enabled", z);
            bundle.putString("edit_hint", str3);
            bundle.putInt("content_max_length", i);
            bundle.putBoolean("is_enable_null", z2);
            profileEditUsernameFragment.setArguments(bundle);
            return profileEditUsernameFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$b */
    public interface C36263b {
        /* renamed from: a */
        void mo92291a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$c */
    public static final class C36264c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f95142a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C36264c(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f95142a = profileEditUsernameFragment;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C7573i.m23587b(editable, "s");
            if (this.f95142a.f95134c) {
                CharSequence charSequence = editable;
                boolean z2 = true;
                if (charSequence.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !this.f95142a.f95137f) {
                    this.f95142a.mo92283i();
                } else if (!TextUtils.equals(editable.toString(), this.f95142a.f95133b)) {
                    this.f95142a.mo92282h();
                } else {
                    this.f95142a.mo92283i();
                }
                if (charSequence.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    this.f95142a.mo92288c().setVisibility(0);
                    return;
                }
                this.f95142a.mo92288c().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            if (ProfileEditUsernameFragment.m117188a(this.f95142a.mo92287b(), this.f95142a.f95136e)) {
                C10761a.m31410e(C6399b.m19921a(), this.f95142a.getResources().getString(R.string.dn3)).mo25750a();
            }
            this.f95142a.mo92289f().setText("www.tiktok.com/");
            this.f95142a.mo92289f().append(this.f95142a.mo92285a(this.f95142a.mo92287b().getText().toString()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$d */
    static final class C36265d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f95143a;

        C36265d(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f95143a = profileEditUsernameFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f95143a.mo92214d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$e */
    static final class C36266e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f95144a;

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$e$a */
        static final class C36268a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C36266e f95146a;

            C36268a(C36266e eVar) {
                this.f95146a = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C36766w.m118504a(1, this.f95146a.f95144a.f95135d, "button");
                this.f95146a.f95144a.mo92215e();
                this.f95146a.f95144a.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$e$b */
        static final class C36269b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C36266e f95147a;

            C36269b(C36266e eVar) {
                this.f95147a = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C36766w.m118504a(0, this.f95147a.f95144a.f95135d, "button");
                dialogInterface.dismiss();
            }
        }

        C36266e(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f95144a = profileEditUsernameFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C43004cb.m136502a(this.f95144a.mo92287b().getText().toString(), C6399b.m19921a())) {
                KeyboardUtils.m77057c(this.f95144a.mo92287b());
                C36766w.m118505a("save_profile", "click_save");
                new C10741a(this.f95144a.getActivity()).mo25653a(this.f95144a.getResources().getString(R.string.dmy)).mo25657b((int) R.string.dmw).mo25650a((int) R.string.dmx, (DialogInterface.OnClickListener) new C36268a(this)).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) new C36269b(this)).mo25656a().mo25637a().setOnCancelListener(new OnCancelListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36266e f95145a;

                    {
                        this.f95145a = r1;
                    }

                    public final void onCancel(DialogInterface dialogInterface) {
                        C36766w.m118504a(0, this.f95145a.f95144a.f95135d, "blank");
                    }
                });
                return;
            }
            C36766w.m118506b(0, this.f95144a.f95135d, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$f */
    static final class C36270f implements OnEditorActionListener {

        /* renamed from: a */
        public static final C36270f f95148a = new C36270f();

        C36270f() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final ProfileEditUsernameFragment m117194a(String str, String str2, boolean z, String str3, int i, boolean z2, String str4) {
        return C36262a.m117206a(str, str2, z, str3, 24, false, str4);
    }

    /* renamed from: a */
    public final void mo92207a() {
        if (this.f95141m != null) {
            this.f95141m.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92207a();
    }

    /* renamed from: b */
    public final EditText mo92287b() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final ImageView mo92288c() {
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C7573i.m23583a("mClearAllBtn");
        }
        return imageView;
    }

    /* renamed from: f */
    public final TextView mo92289f() {
        TextView textView = this.mUserLinkHint;
        if (textView == null) {
            C7573i.m23583a("mUserLinkHint");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo92215e() {
        C36263b bVar = this.f95140l;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C7573i.m23583a("mEditContentInput");
            }
            bVar.mo92291a(editText.getText().toString());
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
    private final void m117195g() {
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

    /* renamed from: h */
    public final void mo92282h() {
        TextTitleBar textTitleBar = this.f95130i;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(1.0f);
            }
        }
        TextTitleBar textTitleBar2 = this.f95130i;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setTextColor(getResources().getColor(R.color.lo));
            }
        }
        TextTitleBar textTitleBar3 = this.f95130i;
        if (textTitleBar3 != null) {
            DmtTextView endText3 = textTitleBar3.getEndText();
            if (endText3 != null) {
                endText3.setClickable(true);
            }
        }
    }

    /* renamed from: i */
    public final void mo92283i() {
        TextTitleBar textTitleBar = this.f95130i;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(0.34f);
            }
        }
        TextTitleBar textTitleBar2 = this.f95130i;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setTextColor(getResources().getColor(R.color.ab5));
            }
        }
        TextTitleBar textTitleBar3 = this.f95130i;
        if (textTitleBar3 != null) {
            DmtTextView endText3 = textTitleBar3.getEndText();
            if (endText3 != null) {
                endText3.setClickable(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo92286a(C36263b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f95140l = bVar;
    }

    /* renamed from: a */
    public final SpannableString mo92285a(String str) {
        C7573i.m23587b(str, "name");
        if (C7573i.m23585a((Object) str, (Object) "")) {
            str = "username";
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(str);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ab0)), 0, str.length() + 1, 33);
        return spannableString;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("content_name");
            C7573i.m23582a((Object) string, "it.getString(CONTENT_NAME)");
            this.f95138h = string;
            String string2 = arguments.getString("content_value");
            C7573i.m23582a((Object) string2, "it.getString(CONTENT_VALUE)");
            this.f95133b = string2;
            this.f95134c = arguments.getBoolean("is_edit_enabled");
            String string3 = arguments.getString("edit_hint");
            C7573i.m23582a((Object) string3, "it.getString(CONTENT_EDIT_HINT)");
            this.f95139k = string3;
            this.f95136e = arguments.getInt("content_max_length");
            this.f95137f = arguments.getBoolean("is_enable_null");
            String string4 = arguments.getString("enter_from");
            C7573i.m23582a((Object) string4, "it.getString(ENTER_FROM)");
            this.f95135d = string4;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.q7, viewGroup, false);
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
            textTitleBar.setTitle((CharSequence) this.f95138h);
        }
        ButterKnife.bind((Object) this, inflate);
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C7573i.m23583a("mTvContentName");
        }
        textView.setText(this.f95138h);
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
        editText.addTextChangedListener(new C36264c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText2.setText(this.f95133b);
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
                startText.setOnClickListener(new C36265d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f95130i;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C36266e(this));
            }
        }
        if (!this.f95134c) {
            m117195g();
            ImageView imageView2 = this.mClearAllBtn;
            if (imageView2 == null) {
                C7573i.m23583a("mClearAllBtn");
            }
            imageView2.setVisibility(8);
        }
        mo92283i();
        if (TextUtils.isEmpty(this.f95139k)) {
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
            textView3.setText(this.f95139k);
        }
        EditText editText8 = this.mEditContentInput;
        if (editText8 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText8.setOnEditorActionListener(C36270f.f95148a);
        return inflate;
    }
}
