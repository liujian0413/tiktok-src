package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.C36107z;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.presenter.C36050x;
import com.p280ss.android.ugc.aweme.profile.util.C36762t;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateUserInfoDialog */
public abstract class UpdateUserInfoDialog extends AppCompatDialog implements C36046t {

    /* renamed from: a */
    private boolean f95269a;

    /* renamed from: c */
    C36107z f95270c;

    /* renamed from: d */
    protected C36011ai f95271d;

    /* renamed from: e */
    protected User f95272e;
    ImageView mClose;
    TextView mConfirmUpdate;
    EditText mNickNameEditText;

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo92351d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo92352e();

    /* renamed from: f */
    private void mo92353f() {
        this.f95271d = new C36011ai();
        this.f95271d.f94200a = this;
    }

    /* renamed from: i */
    private static void m117337i() {
        new C36050x().mo56976a(new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo92344a() {
        this.f95272e = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        this.f95270c = new C36107z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo92350c() {
        this.mConfirmUpdate.setOnClickListener(new C36453eh(this));
        this.mClose.setOnClickListener(new C36454ei(this));
        m117336h();
    }

    /* renamed from: g */
    static String m117335g() {
        String string = C6399b.m19921a().getString(R.string.dkx);
        String str = (String) SharePrefCache.inst().getUpdateUserTipContent().mo59877d();
        if (TextUtils.isEmpty(str)) {
            str = C23481i.m77091b(R.string.anh);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(string);
        return sb.toString();
    }

    /* renamed from: h */
    private void m117336h() {
        String t = C43122ff.m136789t(this.f95272e);
        this.mNickNameEditText.setText(t);
        if (!TextUtils.isEmpty(t)) {
            this.mNickNameEditText.setSelection(t.length());
        }
        this.mNickNameEditText.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                UpdateUserInfoDialog.m117332a(UpdateUserInfoDialog.this.mNickNameEditText, 20);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92356c(View view) {
        mo92351d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo92352e());
        ButterKnife.bind((Dialog) this);
        mo92344a();
        mo92350c();
        mo92353f();
    }

    /* renamed from: b */
    static boolean m117333b(String str) {
        if (!C36762t.m118498a(str)) {
            C10761a.m31409e(C6399b.m19921a(), (int) R.string.clp).mo25750a();
            return true;
        } else if (str.length() <= 20) {
            return false;
        } else {
            C10761a.m31403c(C6399b.m19921a(), C6399b.m19921a().getString(R.string.c8q, new Object[]{"20"})).mo25750a();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92355b(View view) {
        dismiss();
        if (this.f95269a) {
            SharePrefCache.inst().getLastCloseUpdateDialogTime().mo59871a(Long.valueOf(System.currentTimeMillis()));
        } else {
            SharePrefCache.inst().getLastCloseFeedUpdateDialogTime().mo59871a(Long.valueOf(System.currentTimeMillis()));
        }
    }

    UpdateUserInfoDialog(Context context, boolean z) {
        super(context);
        this.f95269a = z;
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        C10761a.m31409e(C6399b.m19921a(), (int) R.string.fk2).mo25750a();
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        dismiss();
        C10761a.m31409e(C6399b.m19921a(), (int) R.string.fk3).mo25750a();
        m117337i();
    }

    /* renamed from: a */
    public static void m117332a(EditText editText, int i) {
        Editable text = editText.getText();
        if (text.length() > 20) {
            C10761a.m31403c(C6399b.m19921a(), C6399b.m19921a().getString(R.string.c8q, new Object[]{"20"})).mo25750a();
            int selectionEnd = Selection.getSelectionEnd(text);
            editText.setText(text.toString().substring(0, 20));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        C10761a.m31410e(C6399b.m19921a(), str).mo25750a();
    }
}
