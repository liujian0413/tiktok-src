package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p280ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileMoreActivity.C36272a;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MultilineInputFragment */
public class MultilineInputFragment extends AmeBaseFragment implements C36272a {

    /* renamed from: e */
    public int f94688e;

    /* renamed from: f */
    private Dialog f94689f;

    /* renamed from: g */
    private boolean f94690g;

    /* renamed from: h */
    private String f94691h;

    /* renamed from: i */
    private RemarkApi f94692i;

    /* renamed from: j */
    private String f94693j;

    /* renamed from: k */
    private String f94694k;

    /* renamed from: l */
    private User f94695l;

    /* renamed from: m */
    private boolean f94696m;
    ImageView mClearAllBtn;
    EditText mInput;
    TextView mLengthHint;
    RelativeLayout mPopRemarkname;
    ButtonTitleBar mTitleBar;
    DmtTextView mTvContactname;
    DmtTextView mTvSetting;

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.mInput);
    }

    public void onStart() {
        super.onStart();
        this.mInput.requestFocus();
        KeyboardUtils.m77055a(this.mInput);
    }

    /* renamed from: d */
    public final void mo92039d() {
        this.mTitleBar.getEndBtn().setAlpha(1.0f);
        this.mTitleBar.getEndBtn().setClickable(true);
    }

    /* renamed from: e */
    public final void mo92040e() {
        this.mTitleBar.getEndBtn().setAlpha(0.34f);
        this.mTitleBar.getEndBtn().setClickable(false);
    }

    /* renamed from: f */
    public final boolean mo92041f() {
        String obj = this.mInput.getText().toString();
        if (TextUtils.equals(obj, this.f94691h) || (obj.length() != 0 && obj.trim().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo92036a() {
        if (!mo92041f() || this.f94690g || this.f94689f != null) {
            return true;
        }
        this.f94689f = new C10741a(getContext()).mo25650a((int) R.string.di_, (OnClickListener) new C36354av(this)).mo25658b((int) R.string.bbe, (OnClickListener) new C36355aw(this)).mo25657b((int) R.string.dim).mo25656a().mo25637a();
        return false;
    }

    /* renamed from: a */
    private void m116674a(String str) {
        C6907h.m21524a("edit_remarks", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("account_type", "click").mo59973a("to_user_id", this.f94695l.getUid()).f60753a);
        if (this.f94692i == null) {
            this.f94692i = (RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RemarkApi.class);
        }
        this.f94692i.commitRemarkName(str, this.f94693j, this.f94695l.getSecUid()).mo6876a((C1591g<TResult, TContinuationResult>) new C36356ax<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    private void m116675a(boolean z) {
        if (z) {
            if (this.f94696m) {
                m116674a(this.mInput.getText().toString());
            } else {
                C23352a.m76612a().mo60650a("aweme.main.profile.multi_line_input.remark_name").postValue(this.mInput.getText().toString());
            }
        }
        mo92040e();
        if (getActivity() != null && !this.f94696m) {
            getActivity().onBackPressed();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo92037b(C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            return null;
        }
        CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) hVar.mo6890e();
        if (commitRemarkNameResponse.isOK()) {
            this.f94694k = commitRemarkNameResponse.remarkName;
            if (TextUtils.isEmpty(this.f94694k)) {
                return null;
            }
            C6907h.m21524a("edit_name_notice", (Map) new C22984d().mo59973a("action_type", "show").f60753a);
            this.mLengthHint.animate().alpha(0.0f).setDuration(150);
            this.mPopRemarkname.animate().alpha(1.0f).setDuration(50).setStartDelay(150);
            this.mTvSetting.setClickable(true);
            if (this.f94694k.length() > 13) {
                String substring = this.f94694k.substring(0, 13);
                this.mTvContactname.setText(C1642a.m8034a(getString(R.string.dmb), new Object[]{substring, "...\""}));
            } else {
                this.mTvContactname.setText(C1642a.m8034a(getString(R.string.dmb), new Object[]{this.f94694k, "\""}));
            }
        }
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.jo) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view.getId() == R.id.ct5) {
            this.f94690g = true;
            m116675a(true);
        } else if (view.getId() == R.id.b7d) {
            this.mInput.setText("");
        } else if (view.getId() == R.id.e1r && !TextUtils.isEmpty(this.f94694k)) {
            if (Character.codePointCount(this.f94694k, 0, this.f94694k.length()) > this.f94688e) {
                this.f94694k = this.f94694k.substring(this.f94694k.offsetByCodePoints(0, 0), this.f94694k.offsetByCodePoints(0, this.f94688e));
            }
            this.mInput.setText(this.f94694k);
            C6907h.m21524a("edit_name_notice", (Map) new C22984d().mo59973a("action_type", "click").f60753a);
            this.mPopRemarkname.animate().alpha(0.0f).setDuration(50);
            this.mTvSetting.setClickable(false);
            this.mLengthHint.animate().alpha(1.0f).setDuration(50).setStartDelay(50);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92034a(C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.dic).mo25750a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) hVar.mo6890e();
            if (commitRemarkNameResponse.isOK()) {
                this.f94695l.setRemarkName(((CommitRemarkNameResponse) hVar.mo6890e()).remarkName);
                C30553b.m99810g().updateIMUser(C30553b.m99780a(this.f94695l));
                C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f94695l);
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.dea).mo25750a();
            } else {
                C10761a.m31403c(C6399b.m19921a(), commitRemarkNameResponse.statusMsg).mo25750a();
            }
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92035a(DialogInterface dialogInterface, int i) {
        m116675a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92038b(DialogInterface dialogInterface, int i) {
        m116675a(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTitleBar.setTitle(getArguments().getInt("titleId"));
        ((TextView) view.findViewById(R.id.b21)).setText(getArguments().getInt("inputTypeNameId"));
        this.mInput.setHint(getArguments().getInt("inputHintId"));
        this.mInput.setOnEditorActionListener(C36352at.f95495a);
        this.mPopRemarkname.setAlpha(0.0f);
        this.mTvSetting.setClickable(false);
        this.mInput.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (MultilineInputFragment.this.isViewValid() && MultilineInputFragment.this.getActivity() != null) {
                    int codePointCount = Character.codePointCount(editable, 0, editable.length());
                    if (codePointCount > MultilineInputFragment.this.f94688e) {
                        C10761a.m31403c((Context) MultilineInputFragment.this.getActivity(), MultilineInputFragment.this.getString(R.string.c8q, String.valueOf(MultilineInputFragment.this.f94688e))).mo25750a();
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
                        int codePointCount2 = Character.codePointCount(str2, 0, str2.length());
                        StringBuilder sb = new StringBuilder();
                        int i = MultilineInputFragment.this.f94688e - codePointCount2;
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                        }
                        sb.append(str2);
                        MultilineInputFragment.this.mInput.setText(sb.toString());
                        Selection.setSelection(MultilineInputFragment.this.mInput.getText(), Math.min(MultilineInputFragment.this.mInput.length() - str2.length(), MultilineInputFragment.this.mInput.length()));
                        MultilineInputFragment.this.mLengthHint.setText(MultilineInputFragment.this.getString(R.string.a0c, Integer.valueOf(Character.codePointCount(MultilineInputFragment.this.mInput.getText(), 0, MultilineInputFragment.this.mInput.length())), Integer.valueOf(MultilineInputFragment.this.f94688e)));
                    } else {
                        MultilineInputFragment.this.mLengthHint.setText(MultilineInputFragment.this.getString(R.string.a0c, Integer.valueOf(codePointCount), Integer.valueOf(MultilineInputFragment.this.f94688e)));
                    }
                    if (!MultilineInputFragment.this.mo92041f()) {
                        MultilineInputFragment.this.mo92040e();
                    } else {
                        MultilineInputFragment.this.mo92039d();
                    }
                    if (editable.length() > 0) {
                        MultilineInputFragment.this.mClearAllBtn.setVisibility(0);
                    } else {
                        MultilineInputFragment.this.mClearAllBtn.setVisibility(8);
                    }
                }
            }
        });
        if (Character.codePointCount(this.f94691h, 0, this.f94691h.length()) > this.f94688e) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f94688e; i++) {
                sb.append(Character.toChars(Character.codePointAt(this.f94691h, sb.length())));
            }
            this.mInput.setText(sb.toString());
        } else {
            this.mInput.setText(this.f94691h);
        }
        if (TextUtils.isEmpty(this.mInput.getText()) && C43152a.m136870a((Activity) getActivity(), "android.permission.READ_CONTACTS")) {
            if (this.f94692i == null) {
                this.f94692i = (RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RemarkApi.class);
            }
            this.f94692i.getContackBookRemarkName(this.f94693j, C43077dz.m136657a().mo104733b(this.f94693j)).mo6876a((C1591g<TResult, TContinuationResult>) new C36353au<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m116676a(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.p2, viewGroup, false);
        this.f94695l = (User) getArguments().getSerializable("user");
        this.f94696m = getArguments().getBoolean("need_commit_remark_immediate", false);
        this.f94688e = getArguments().getInt("inputMaxLength", 0);
        this.f94691h = getArguments().getString("defaultInputText", "");
        if (this.f94691h == null) {
            str = "";
        } else {
            str = this.f94691h;
        }
        this.f94691h = str;
        this.f94693j = getArguments().getString("userId");
        return inflate;
    }

    /* renamed from: a */
    public static MultilineInputFragment m116672a(int i, int i2, int i3, int i4, String str, String str2) {
        return m116673a(R.string.ayy, R.string.de_, R.string.cv6, 20, str, str2, new Bundle());
    }

    /* renamed from: a */
    public static MultilineInputFragment m116673a(int i, int i2, int i3, int i4, String str, String str2, Bundle bundle) {
        bundle.putInt("titleId", i);
        bundle.putInt("inputTypeNameId", i2);
        bundle.putInt("inputHintId", i3);
        bundle.putInt("inputMaxLength", i4);
        bundle.putString("defaultInputText", str);
        bundle.putString("userId", str2);
        MultilineInputFragment multilineInputFragment = new MultilineInputFragment();
        multilineInputFragment.setArguments(bundle);
        return multilineInputFragment;
    }
}
