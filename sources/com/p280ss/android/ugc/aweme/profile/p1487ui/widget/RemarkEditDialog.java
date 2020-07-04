package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p280ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog */
public class RemarkEditDialog extends AppCompatDialog {

    /* renamed from: a */
    public Context f96231a;

    /* renamed from: b */
    public EditText f96232b;

    /* renamed from: c */
    public Button f96233c;

    /* renamed from: d */
    public ImageButton f96234d;

    /* renamed from: e */
    public C36675j f96235e;

    /* renamed from: f */
    public User f96236f;

    /* renamed from: g */
    public String f96237g = "";

    /* renamed from: h */
    public int f96238h;

    /* renamed from: i */
    private View f96239i;

    /* renamed from: j */
    private DmtTextView f96240j;

    /* renamed from: k */
    private DmtTextView f96241k;

    /* renamed from: l */
    private Button f96242l;

    public void cancel() {
        m118264c();
        super.cancel();
    }

    public void dismiss() {
        m118264c();
        super.dismiss();
    }

    /* renamed from: a */
    private void m118262a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f96232b, 1);
        }
    }

    /* renamed from: c */
    private void m118264c() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f96232b.getWindowToken(), 0);
        }
    }

    public RemarkEditDialog(Context context) {
        super(context);
        this.f96231a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92974a(C1592h hVar) throws Exception {
        if (this.f96232b != null) {
            this.f96232b.requestFocus();
            m118262a();
        }
        return null;
    }

    /* renamed from: a */
    private void m118263a(String str) {
        if (this.f96236f != null && this.f96231a != null) {
            ((RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RemarkApi.class)).commitRemarkName(str, this.f96236f.getUid(), this.f96236f.getSecUid()).mo6876a((C1591g<TResult, TContinuationResult>) new C36680o<TResult,TContinuationResult>(this, str), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92978b(View view) {
        if (this.f96238h == 1) {
            C6907h.m21524a("remark_toast", (Map) C22984d.m75611a().mo59973a("action_type", "confirm").f60753a);
        }
        m118263a(this.f96232b.getText().toString());
        dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92979c(View view) {
        if (this.f96238h == 1) {
            C6907h.m21524a("remark_toast", (Map) C22984d.m75611a().mo59973a("action_type", "cancel").f60753a);
        }
        dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92976a(DialogInterface dialogInterface) {
        if (this.f96238h == 1) {
            C6907h.m21524a("remark_toast", (Map) C22984d.m75611a().mo59973a("action_type", "show").f60753a);
        }
        C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C36681p<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92977a(View view) {
        if (this.f96232b != null) {
            this.f96232b.setText("");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f96239i = LayoutInflater.from(this.f96231a).inflate(R.layout.l4, null);
        setContentView(this.f96239i);
        this.f96240j = (DmtTextView) this.f96239i.findViewById(R.id.e0k);
        this.f96232b = (EditText) this.f96239i.findViewById(R.id.agl);
        this.f96241k = (DmtTextView) this.f96239i.findViewById(R.id.e0j);
        this.f96242l = (Button) this.f96239i.findViewById(R.id.crh);
        this.f96233c = (Button) this.f96239i.findViewById(R.id.cri);
        this.f96234d = (ImageButton) this.f96239i.findViewById(R.id.pw);
        this.f96242l.setOnClickListener(new C36676k(this));
        int i = 0;
        if (this.f96238h == 1) {
            this.f96240j.setText(R.string.ayz);
            this.f96241k.setText(R.string.ayx);
            this.f96241k.setVisibility(0);
        } else {
            this.f96240j.setText(R.string.ayy);
            this.f96241k.setVisibility(8);
        }
        if (this.f96236f != null && TextUtils.isEmpty(this.f96237g)) {
            if (!TextUtils.isEmpty(this.f96236f.getRemarkName())) {
                this.f96237g = this.f96236f.getRemarkName();
            } else {
                this.f96237g = this.f96236f.getNickname();
            }
        }
        this.f96232b.setText(this.f96237g);
        this.f96232b.setSelection(this.f96232b.getText().length());
        this.f96233c.setOnClickListener(new C36677l(this));
        this.f96232b.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (Character.codePointCount(editable, 0, editable.length()) > 20) {
                    C10761a.m31403c(RemarkEditDialog.this.f96231a, RemarkEditDialog.this.f96231a.getString(R.string.ru)).mo25750a();
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    String obj = editable.toString();
                    if (selectionEnd == 0) {
                        str = "";
                    } else {
                        str = obj.substring(0, selectionEnd);
                    }
                    if (selectionEnd == obj.length()) {
                        str2 = "";
                    } else {
                        str2 = obj.substring(selectionEnd);
                    }
                    int codePointCount = Character.codePointCount(str2, 0, str2.length());
                    StringBuilder sb = new StringBuilder();
                    int i = 20 - codePointCount;
                    for (int i2 = 0; i2 < i; i2++) {
                        sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                    }
                    sb.append(str2);
                    RemarkEditDialog.this.f96232b.setText(sb.toString());
                    Selection.setSelection(RemarkEditDialog.this.f96232b.getText(), Math.min(RemarkEditDialog.this.f96232b.length() - str2.length(), RemarkEditDialog.this.f96232b.length()));
                }
                if (TextUtils.isEmpty(editable)) {
                    RemarkEditDialog.this.f96234d.setVisibility(4);
                } else {
                    RemarkEditDialog.this.f96234d.setVisibility(0);
                }
                if (RemarkEditDialog.this.f96238h == 1) {
                    if (editable.toString().trim().length() > 0) {
                        RemarkEditDialog.this.f96233c.setEnabled(true);
                        RemarkEditDialog.this.f96233c.setAlpha(1.0f);
                        return;
                    }
                    RemarkEditDialog.this.f96233c.setEnabled(false);
                    RemarkEditDialog.this.f96233c.setAlpha(0.34f);
                }
            }
        });
        ImageButton imageButton = this.f96234d;
        if (this.f96232b.getText().length() <= 0) {
            i = 4;
        }
        imageButton.setVisibility(i);
        this.f96234d.setOnClickListener(new C36678m(this));
        setOnShowListener(new C36679n(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92975a(String str, C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            C10761a.m31399c(this.f96231a, (int) R.string.dic).mo25750a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) hVar.mo6890e();
            if (commitRemarkNameResponse.isOK()) {
                this.f96236f.setRemarkName(str);
                if (this.f96235e != null) {
                    this.f96235e.mo71634a();
                }
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                C10761a.m31399c(this.f96231a, (int) R.string.dea).mo25750a();
            } else {
                C10761a.m31403c(this.f96231a, commitRemarkNameResponse.statusMsg).mo25750a();
            }
        }
        return null;
    }
}
