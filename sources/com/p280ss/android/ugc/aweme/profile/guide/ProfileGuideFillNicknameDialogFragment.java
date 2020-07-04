package com.p280ss.android.ugc.aweme.profile.guide;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment */
public final class ProfileGuideFillNicknameDialogFragment extends ProfileGuideBottomSheetDialogFragment implements TextWatcher, OnGlobalLayoutListener, C36046t {

    /* renamed from: e */
    public static final C35804a f93844e = new C35804a(null);

    /* renamed from: d */
    public EditText f93845d;

    /* renamed from: f */
    private final int f93846f = C23486n.m77122a(229.0d);

    /* renamed from: g */
    private final String f93847g = "guide_profile_name";

    /* renamed from: h */
    private DmtTextView f93848h;

    /* renamed from: i */
    private View f93849i;

    /* renamed from: j */
    private DmtStatusView f93850j;

    /* renamed from: k */
    private View f93851k;

    /* renamed from: l */
    private final Rect f93852l = new Rect();

    /* renamed from: m */
    private final int f93853m = C23486n.m77122a(80.0d);

    /* renamed from: n */
    private final C36011ai f93854n;

    /* renamed from: o */
    private final String f93855o;

    /* renamed from: p */
    private HashMap f93856p;

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment$a */
    public static final class C35804a {
        private C35804a() {
        }

        /* renamed from: a */
        private static ProfileGuideFillNicknameDialogFragment m115622a() {
            return new ProfileGuideFillNicknameDialogFragment();
        }

        public /* synthetic */ C35804a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo90709a(C0608j jVar) {
            C7573i.m23587b(jVar, "fragmentManager");
            Fragment a = jVar.mo2644a("ProfileGuideFillNicknameDialogFragment");
            if (!(a instanceof ProfileGuideFillNicknameDialogFragment)) {
                a = null;
            }
            ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment = (ProfileGuideFillNicknameDialogFragment) a;
            if (profileGuideFillNicknameDialogFragment == null) {
                profileGuideFillNicknameDialogFragment = m115622a();
            }
            if (!profileGuideFillNicknameDialogFragment.isAdded()) {
                jVar.mo2645a().mo2588a((Fragment) profileGuideFillNicknameDialogFragment, "ProfileGuideFillNicknameDialogFragment").mo2606d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment$b */
    static final class C35805b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillNicknameDialogFragment f93857a;

        C35805b(ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment) {
            this.f93857a = profileGuideFillNicknameDialogFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93857a.mo90705g();
            this.f93857a.mo90703e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment$c */
    static final class C35806c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillNicknameDialogFragment f93858a;

        C35806c(ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment) {
            this.f93858a = profileGuideFillNicknameDialogFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93858a.mo90704f();
            this.f93858a.dismiss(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment$d */
    static final class C35807d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillNicknameDialogFragment f93859a;

        C35807d(ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment) {
            this.f93859a = profileGuideFillNicknameDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f93859a.mo90706h();
            this.f93859a.mo90703e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment$e */
    static final class C35808e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillNicknameDialogFragment f93860a;

        C35808e(ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment) {
            this.f93860a = profileGuideFillNicknameDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ProfileGuideFillNicknameDialogFragment.m115607a(this.f93860a).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment$f */
    static final class C35809f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillNicknameDialogFragment f93861a;

        C35809f(ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment) {
            this.f93861a = profileGuideFillNicknameDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m77057c(ProfileGuideFillNicknameDialogFragment.m115607a(this.f93861a));
        }
    }

    /* renamed from: a */
    public final int mo90688a() {
        return this.f93846f;
    }

    /* renamed from: b */
    public final String mo90689b() {
        return this.f93847g;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public final void mo90692d() {
        if (this.f93856p != null) {
            this.f93856p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo90692d();
    }

    /* renamed from: f */
    public final void mo90704f() {
        C6907h.m21524a(mo90689b(), (Map) C22984d.m75611a().mo59973a("event_type", "abandon").f60753a);
    }

    /* renamed from: g */
    public final void mo90705g() {
        C6907h.m21524a(mo90689b(), (Map) C22984d.m75611a().mo59973a("event_type", "save").f60753a);
    }

    /* renamed from: h */
    public final void mo90706h() {
        C6907h.m21524a(mo90689b(), (Map) C22984d.m75611a().mo59973a("event_type", "finish").f60753a);
    }

    public final void onPause() {
        super.onPause();
        View view = this.f93851k;
        if (view == null) {
            C7573i.m23583a("mRootLayout");
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void onResume() {
        super.onResume();
        View view = this.f93851k;
        if (view == null) {
            C7573i.m23583a("mRootLayout");
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: c */
    public final void mo90691c() {
        super.mo90691c();
        View view = this.f93851k;
        if (view == null) {
            C7573i.m23583a("mRootLayout");
        }
        view.getWindowVisibleDisplayFrame(this.f93852l);
        EditText editText = this.f93845d;
        if (editText == null) {
            C7573i.m23583a("mNickname");
        }
        editText.requestFocus();
        EditText editText2 = this.f93845d;
        if (editText2 == null) {
            C7573i.m23583a("mNickname");
        }
        KeyboardUtils.m77056b(editText2);
    }

    /* renamed from: e */
    public final void mo90703e() {
        EditText editText = this.f93845d;
        if (editText == null) {
            C7573i.m23583a("mNickname");
        }
        String obj = editText.getText().toString();
        DmtStatusView dmtStatusView = this.f93850j;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView.mo25942f();
        this.f93854n.mo91646b(obj);
    }

    public final void onGlobalLayout() {
        boolean z;
        Rect rect = new Rect();
        View view = this.f93851k;
        if (view == null) {
            C7573i.m23583a("mRootLayout");
        }
        view.getWindowVisibleDisplayFrame(rect);
        if (this.f93852l.bottom - rect.bottom > this.f93853m) {
            z = true;
        } else {
            z = false;
        }
        this.f93819b = !z;
    }

    public ProfileGuideFillNicknameDialogFragment() {
        C36011ai aiVar = new C36011ai();
        aiVar.f94200a = this;
        this.f93854n = aiVar;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        this.f93855o = curUser.getNickname();
    }

    /* renamed from: i */
    private final void m115609i() {
        EditText editText = this.f93845d;
        if (editText == null) {
            C7573i.m23583a("mNickname");
        }
        Editable text = editText.getText();
        if (text.length() > 20) {
            C10761a.m31403c(getActivity(), getString(R.string.c8q, "20")).mo25750a();
            int selectionEnd = Selection.getSelectionEnd(text);
            String obj = text.toString();
            if (obj != null) {
                String substring = obj.substring(0, 20);
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                EditText editText2 = this.f93845d;
                if (editText2 == null) {
                    C7573i.m23583a("mNickname");
                }
                editText2.setText(substring);
                EditText editText3 = this.f93845d;
                if (editText3 == null) {
                    C7573i.m23583a("mNickname");
                }
                Editable text2 = editText3.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                Selection.setSelection(text2, selectionEnd);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final void dismiss() {
        DmtTextView dmtTextView = this.f93848h;
        if (dmtTextView == null) {
            C7573i.m23583a("mAction");
        }
        if (!dmtTextView.isEnabled()) {
            dismiss(true);
            return;
        }
        Dialog a = new C10741a(getContext()).mo25650a((int) R.string.di_, (OnClickListener) new C35805b(this)).mo25658b((int) R.string.bbe, (OnClickListener) new C35806c(this)).mo25657b((int) R.string.dim).mo25655a(false).mo25656a().mo25637a();
        a.setCancelable(false);
        a.setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m115607a(ProfileGuideFillNicknameDialogFragment profileGuideFillNicknameDialogFragment) {
        EditText editText = profileGuideFillNicknameDialogFragment.f93845d;
        if (editText == null) {
            C7573i.m23583a("mNickname");
        }
        return editText;
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
        if (this.f93818a) {
            DmtStatusView dmtStatusView = this.f93850j;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView.mo25939d();
        }
    }

    /* access modifiers changed from: protected */
    public final void dismiss(boolean z) {
        EditText editText = this.f93845d;
        if (editText == null) {
            C7573i.m23583a("mNickname");
        }
        KeyboardUtils.m77057c(editText);
        super.dismiss(z);
    }

    public final void afterTextChanged(Editable editable) {
        boolean z;
        CharSequence charSequence = editable;
        int i = 0;
        boolean z2 = true;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !C7573i.m23585a((Object) this.f93855o, (Object) String.valueOf(editable));
        DmtTextView dmtTextView = this.f93848h;
        if (dmtTextView == null) {
            C7573i.m23583a("mAction");
        }
        if (z || !z3) {
            z2 = false;
        }
        dmtTextView.setEnabled(z2);
        View view = this.f93849i;
        if (view == null) {
            C7573i.m23583a("mClear");
        }
        if (z) {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private final void m115608a(View view) {
        View findViewById = view.findViewById(R.id.bjh);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.layout_root)");
        this.f93851k = findViewById;
        View findViewById2 = view.findViewById(R.id.a2);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.action)");
        this.f93848h = (DmtTextView) findViewById2;
        DmtTextView dmtTextView = this.f93848h;
        if (dmtTextView == null) {
            C7573i.m23583a("mAction");
        }
        dmtTextView.setOnClickListener(new C35807d(this));
        View findViewById3 = view.findViewById(R.id.wh);
        C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.clear)");
        this.f93849i = findViewById3;
        View view2 = this.f93849i;
        if (view2 == null) {
            C7573i.m23583a("mClear");
        }
        view2.setOnClickListener(new C35808e(this));
        View findViewById4 = view.findViewById(R.id.c4a);
        C7573i.m23582a((Object) findViewById4, "rootView.findViewById(R.id.nickname)");
        this.f93845d = (EditText) findViewById4;
        EditText editText = this.f93845d;
        if (editText == null) {
            C7573i.m23583a("mNickname");
        }
        editText.addTextChangedListener(this);
        View findViewById5 = view.findViewById(R.id.bh2);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C35809f(this));
        }
        View findViewById6 = view.findViewById(R.id.dav);
        C7573i.m23582a((Object) findViewById6, "rootView.findViewById(R.id.status_view)");
        this.f93850j = (DmtStatusView) findViewById6;
        DmtStatusView dmtStatusView = this.f93850j;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(getContext()));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m115608a(view);
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        mo90690b(true);
        if (this.f93818a) {
            DmtStatusView dmtStatusView = this.f93850j;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView.mo25939d();
        }
        dismiss(false);
        if (i == 0) {
            C42961az.m136380a(new C23285d());
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        mo90690b(false);
        if (this.f93818a) {
            DmtStatusView dmtStatusView = this.f93850j;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView.mo25939d();
        }
        if (i != 116) {
            C22814a.m75245a(getContext(), exc, R.string.d80);
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        mo90690b(false);
        if (this.f93818a) {
            DmtStatusView dmtStatusView = this.f93850j;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView.mo25939d();
        }
        if (!TextUtils.isEmpty(str)) {
            Context context = getContext();
            if (context == null) {
                context = C6399b.m19921a();
            }
            C10761a.m31403c(context, str).mo25750a();
            if (z) {
                dismiss(false);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.l2, viewGroup, false);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m115609i();
    }
}
