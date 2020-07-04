package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
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
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.profile.C36107z;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.util.C36766w;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43097ei;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment */
public final class ProfileEditBioUrlFragment extends ProfileEditInputFragment implements C36046t {

    /* renamed from: h */
    public static final C36229a f95033h = new C36229a(null);

    /* renamed from: b */
    public String f95034b = "";

    /* renamed from: c */
    public boolean f95035c;

    /* renamed from: d */
    public int f95036d;

    /* renamed from: e */
    public boolean f95037e;

    /* renamed from: f */
    public C36011ai f95038f;

    /* renamed from: g */
    public C36107z f95039g;

    /* renamed from: k */
    private String f95040k = "";

    /* renamed from: l */
    private C36230b f95041l;

    /* renamed from: m */
    private HashMap f95042m;
    public ImageView mClearAllBtn;
    public DmtStatusView mDmtStatusView;
    public EditText mEditContentInput;
    public TextView mEditLengthHint;
    public TextView mIdEditHintText;
    public TextView mTvContentName;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$a */
    public static final class C36229a {
        private C36229a() {
        }

        public /* synthetic */ C36229a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileEditBioUrlFragment m117114a(String str, boolean z, String str2, int i, boolean z2) {
            C7573i.m23587b(str, "contentValue");
            C7573i.m23587b(str2, "editHint");
            ProfileEditBioUrlFragment profileEditBioUrlFragment = new ProfileEditBioUrlFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_value", str);
            bundle.putBoolean("is_edit_enabled", z);
            bundle.putString("edit_hint", str2);
            bundle.putInt("content_max_length", i);
            bundle.putBoolean("is_enable_null", z2);
            profileEditBioUrlFragment.setArguments(bundle);
            return profileEditBioUrlFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$b */
    public interface C36230b {
        /* renamed from: a */
        void mo92230a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$c */
    public static final class C36231c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioUrlFragment f95043a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C36231c(ProfileEditBioUrlFragment profileEditBioUrlFragment) {
            this.f95043a = profileEditBioUrlFragment;
        }

        public final void afterTextChanged(Editable editable) {
            C7573i.m23587b(editable, "s");
            if (this.f95043a.f95035c) {
                if (editable.length() <= 0 && !this.f95043a.f95037e) {
                    this.f95043a.mo92283i();
                } else if (!TextUtils.equals(editable.toString(), this.f95043a.f95034b)) {
                    this.f95043a.mo92282h();
                } else {
                    this.f95043a.mo92283i();
                }
                if (editable.length() > 0) {
                    this.f95043a.mo92227f().setVisibility(0);
                    return;
                }
                this.f95043a.mo92227f().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            if (this.f95043a.f95036d != 0) {
                if (ProfileEditBioUrlFragment.m117188a(this.f95043a.mo92226c(), this.f95043a.f95036d)) {
                    this.f95043a.mo92228g().setTextColor(this.f95043a.getResources().getColor(R.color.pm));
                } else {
                    this.f95043a.mo92228g().setTextColor(this.f95043a.getResources().getColor(R.color.a53));
                }
                this.f95043a.mo92228g().setText(this.f95043a.getString(R.string.a0c, Integer.valueOf(this.f95043a.mo92226c().length()), Integer.valueOf(this.f95043a.f95036d)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$d */
    static final class C36232d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioUrlFragment f95044a;

        C36232d(ProfileEditBioUrlFragment profileEditBioUrlFragment) {
            this.f95044a = profileEditBioUrlFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f95044a.mo92214d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$e */
    static final class C36233e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioUrlFragment f95045a;

        C36233e(ProfileEditBioUrlFragment profileEditBioUrlFragment) {
            this.f95045a = profileEditBioUrlFragment;
        }

        public final void onClick(View view) {
            Map map;
            ClickInstrumentation.onClick(view);
            C36766w.m118505a("save_profile", "click_save");
            String a = ProfileEditBioUrlFragment.m117100a(this.f95045a.mo92226c().getText().toString());
            int length = a.length() - 1;
            if (length >= 0 && a.charAt(length) == 10) {
                if (a != null) {
                    a = a.substring(0, length);
                    C7573i.m23582a((Object) a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            CharSequence charSequence = a;
            if (!TextUtils.equals(charSequence, this.f95045a.f95034b)) {
                KeyboardUtils.m77057c(this.f95045a.mo92226c());
                this.f95045a.mo92226c().setText(charSequence);
                C36107z zVar = this.f95045a.f95039g;
                if (zVar != null) {
                    zVar.f94408n = a;
                }
                C36011ai aiVar = this.f95045a.f95038f;
                if (aiVar != null) {
                    C36107z zVar2 = this.f95045a.f95039g;
                    if (zVar2 != null) {
                        map = zVar2.mo91866a();
                    } else {
                        map = null;
                    }
                    aiVar.mo91643a(map);
                }
                DmtStatusView b = this.f95045a.mo92225b();
                if (b != null) {
                    b.mo25942f();
                }
            } else {
                this.f95045a.mo92214d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$f */
    static final class C36234f implements OnEditorActionListener {

        /* renamed from: a */
        public static final C36234f f95046a = new C36234f();

        C36234f() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final ProfileEditBioUrlFragment m117099a(String str, boolean z, String str2, int i, boolean z2) {
        return C36229a.m117114a(str, true, str2, 0, true);
    }

    /* renamed from: a */
    public final void mo92207a() {
        if (this.f95042m != null) {
            this.f95042m.clear();
        }
    }

    /* renamed from: b */
    public final DmtStatusView mo92225b() {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        return dmtStatusView;
    }

    /* renamed from: c */
    public final EditText mo92226c() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: f */
    public final ImageView mo92227f() {
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C7573i.m23583a("mClearAllBtn");
        }
        return imageView;
    }

    /* renamed from: g */
    public final TextView mo92228g() {
        TextView textView = this.mEditLengthHint;
        if (textView == null) {
            C7573i.m23583a("mEditLengthHint");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo92215e() {
        C36230b bVar = this.f95041l;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C7573i.m23583a("mEditContentInput");
            }
            bVar.mo92230a(editText.getText().toString());
        }
    }

    public final void onClear() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText.setText("");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C36011ai aiVar = this.f95038f;
        if (aiVar != null) {
            aiVar.f94200a = null;
        }
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        mo92207a();
    }

    /* renamed from: j */
    private final void m117101j() {
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
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            activity.finish();
        } else if (getDialog() != null) {
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
    public static String m117100a(String str) {
        while (true) {
            CharSequence charSequence = str;
            if (!C7634n.m23776c(charSequence, (CharSequence) "\n\n", false)) {
                return str;
            }
            str = new Regex("\n\n").replace(charSequence, "\n");
        }
    }

    /* renamed from: a */
    public final void mo92224a(C36230b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f95041l = bVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            String string = arguments.getString("content_value");
            C7573i.m23582a((Object) string, "arguments!!.getString(CONTENT_VALUE)");
            this.f95034b = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            this.f95035c = arguments2.getBoolean("is_edit_enabled");
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C7573i.m23580a();
            }
            String string2 = arguments3.getString("edit_hint");
            C7573i.m23582a((Object) string2, "arguments!!.getString(CONTENT_EDIT_HINT)");
            this.f95040k = string2;
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C7573i.m23580a();
            }
            this.f95036d = arguments4.getInt("content_max_length");
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                C7573i.m23580a();
            }
            this.f95037e = arguments5.getBoolean("is_enable_null");
        }
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
        if (z) {
            C10761a.m31384a((Context) AwemeApplication.m21341a(), (int) R.string.cz, 1).mo25750a();
            C42961az.m136380a(new C23285d());
        }
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.mo25939d();
        }
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            activity.finish();
            return;
        }
        mo92215e();
        dismiss();
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 2097) {
            new C10741a(getActivity()).mo25649a((int) R.string.bzo).mo25657b((int) R.string.bzm).mo25650a((int) R.string.bzn, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str)) {
            C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
            if (z && getActivity() != null) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                activity.finish();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Integer num;
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.q6, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        if (C6399b.m19946v()) {
            C43097ei eiVar = C43097ei.f111719a;
            Activity activity = getActivity();
            Dialog dialog = getDialog();
            C7573i.m23582a((Object) dialog, "dialog");
            eiVar.mo104758a(activity, dialog.getWindow(), true);
        }
        this.f95130i = (TextTitleBar) inflate.findViewById(R.id.djz);
        TextTitleBar textTitleBar = this.f95130i;
        if (textTitleBar != null) {
            textTitleBar.setTitle((CharSequence) getString(R.string.ays));
        }
        this.f95038f = new C36011ai();
        C36011ai aiVar = this.f95038f;
        if (aiVar != null) {
            aiVar.f94200a = this;
        }
        this.f95039g = new C36107z();
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a((Context) getActivity()));
        }
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C7573i.m23583a("mTvContentName");
        }
        textView.setText(getString(R.string.ays));
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
        editText.addTextChangedListener(new C36231c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText2.setText(this.f95034b);
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
                startText.setOnClickListener(new C36232d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f95130i;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C36233e(this));
            }
        }
        if (!this.f95035c) {
            m117101j();
            ImageView imageView2 = this.mClearAllBtn;
            if (imageView2 == null) {
                C7573i.m23583a("mClearAllBtn");
            }
            imageView2.setVisibility(8);
        }
        mo92283i();
        if (TextUtils.isEmpty(this.f95040k)) {
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
            textView3.setText(this.f95040k);
        }
        if (this.f95036d > 0) {
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
            if (TextUtils.isEmpty(this.f95034b)) {
                i = 0;
            } else {
                String str = this.f95034b;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                } else {
                    num = null;
                }
                i = num.intValue();
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.f95036d);
            textView5.setText(getString(R.string.a0c, objArr));
        }
        EditText editText8 = this.mEditContentInput;
        if (editText8 == null) {
            C7573i.m23583a("mEditContentInput");
        }
        editText8.setOnEditorActionListener(C36234f.f95046a);
        return inflate;
    }
}
