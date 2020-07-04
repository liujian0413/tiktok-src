package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment */
public final class ProfileEditBioFragment extends ProfileEditInputFragment {

    /* renamed from: c */
    public static final C36222a f95019c = new C36222a(null);

    /* renamed from: b */
    public String f95020b = "";

    /* renamed from: d */
    private String f95021d = "";

    /* renamed from: e */
    private C36223b f95022e;

    /* renamed from: f */
    private HashMap f95023f;
    public ImageView mClearAllBtn;
    public EditText mEditContentInput;
    public TextView mEditLengthHint;
    public TextView mIdEditHintText;
    public TextView mTvContentName;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$a */
    public static final class C36222a {
        private C36222a() {
        }

        public /* synthetic */ C36222a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileEditBioFragment m117094a(String str, String str2) {
            C7573i.m23587b(str, "contentName");
            C7573i.m23587b(str2, "contentValue");
            ProfileEditBioFragment profileEditBioFragment = new ProfileEditBioFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            profileEditBioFragment.setArguments(bundle);
            return profileEditBioFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$b */
    public interface C36223b {
        /* renamed from: a */
        void mo92217a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$c */
    public static final class C36224c implements TextWatcher {

        /* renamed from: a */
        public String f95024a = "";

        /* renamed from: b */
        final /* synthetic */ ProfileEditBioFragment f95025b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C36224c(ProfileEditBioFragment profileEditBioFragment) {
            this.f95025b = profileEditBioFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C7573i.m23587b(editable, "s");
            if (this.f95025b.mo92212b().getLineCount() > 5) {
                String obj = editable.toString();
                int selectionStart = this.f95025b.mo92212b().getSelectionStart();
                if (selectionStart != this.f95025b.mo92212b().getSelectionEnd() || selectionStart >= obj.length() || selectionStart <= 0) {
                    int length = editable.length() - 1;
                    if (obj != null) {
                        str = obj.substring(0, length);
                        C7573i.m23582a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    int i = selectionStart - 1;
                    if (obj != null) {
                        String substring = obj.substring(0, i);
                        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        if (obj != null) {
                            String substring2 = obj.substring(selectionStart);
                            C7573i.m23582a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                            sb.append(substring2);
                            str = sb.toString();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                this.f95024a = str;
                this.f95025b.mo92212b().setText(str);
                this.f95025b.mo92212b().setSelection(this.f95025b.mo92212b().getText().length());
                return;
            }
            this.f95024a = editable.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            if (ProfileEditBioFragment.m117188a(this.f95025b.mo92212b(), 80)) {
                C10761a.m31409e((Context) this.f95025b.getActivity(), (int) R.string.ru).mo25750a();
                this.f95025b.mo92213c().setTextColor(this.f95025b.getResources().getColor(R.color.pm));
            } else {
                this.f95025b.mo92213c().setTextColor(this.f95025b.getResources().getColor(R.color.a53));
            }
            this.f95025b.mo92213c().setText(this.f95025b.getString(R.string.a0c, Integer.valueOf(this.f95025b.mo92212b().length()), Integer.valueOf(80)));
            if (!TextUtils.equals(charSequence.toString(), this.f95025b.f95020b)) {
                this.f95025b.mo92282h();
            } else {
                this.f95025b.mo92283i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$d */
    static final class C36225d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioFragment f95026a;

        C36225d(ProfileEditBioFragment profileEditBioFragment) {
            this.f95026a = profileEditBioFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f95026a.mo92214d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$e */
    static final class C36226e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioFragment f95027a;

        C36226e(ProfileEditBioFragment profileEditBioFragment) {
            this.f95027a = profileEditBioFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m77057c(this.f95027a.mo92212b());
            C36766w.m118505a("save_profile", "click_save");
            KeyboardUtils.m77057c(this.f95027a.mo92212b());
            this.f95027a.mo92215e();
            this.f95027a.dismiss();
        }
    }

    /* renamed from: a */
    public static final ProfileEditBioFragment m117087a(String str, String str2) {
        return C36222a.m117094a(str, str2);
    }

    /* renamed from: a */
    public final void mo92207a() {
        if (this.f95023f != null) {
            this.f95023f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92207a();
    }

    /* renamed from: b */
    public final EditText mo92212b() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final TextView mo92213c() {
        TextView textView = this.mEditLengthHint;
        if (textView == null) {
            C7573i.m23583a("mEditLengthHint");
        }
        return textView;
    }

    public final void onClear() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText.setText("");
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

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo92215e() {
        int i;
        boolean z;
        C36223b bVar = this.f95022e;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C7573i.m23583a("mEditContentInput");
            }
            CharSequence obj = editText.getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (obj.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            bVar.mo92217a(obj.subSequence(i2, length + 1).toString());
        }
    }

    /* renamed from: a */
    public final void mo92211a(C36223b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f95022e = bVar;
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
            this.f95021d = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            String string2 = arguments2.getString("content_value");
            C7573i.m23582a((Object) string2, "arguments!!.getString(CONTENT_VALUE)");
            this.f95020b = string2;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
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
            textTitleBar.setTitle((CharSequence) this.f95021d);
        }
        ButterKnife.bind((Object) this, inflate);
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C7573i.m23583a("mTvContentName");
        }
        textView.setText(this.f95021d);
        TextView textView2 = this.mEditLengthHint;
        if (textView2 == null) {
            C7573i.m23583a("mEditLengthHint");
        }
        textView2.setVisibility(0);
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C7573i.m23583a("mClearAllBtn");
        }
        imageView.setVisibility(8);
        if (C6399b.m19946v()) {
            ImageView imageView2 = this.mClearAllBtn;
            if (imageView2 == null) {
                C7573i.m23583a("mClearAllBtn");
            }
            imageView2.setImageResource(R.drawable.cmt);
        }
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText.addTextChangedListener(new C36224c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText2.setText(this.f95020b);
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
                startText.setOnClickListener(new C36225d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f95130i;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C36226e(this));
            }
        }
        mo92283i();
        return inflate;
    }
}
