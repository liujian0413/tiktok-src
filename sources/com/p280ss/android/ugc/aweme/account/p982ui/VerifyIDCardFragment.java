package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p280ss.android.ugc.aweme.account.api.p936a.C21107a;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21111a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.BaseFragment;
import com.p280ss.android.ugc.aweme.account.login.p974ui.CheckButton;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerifyIDCardFragment */
public class VerifyIDCardFragment extends BaseFragment {

    /* renamed from: e */
    public String f59560e;

    /* renamed from: l */
    private String f59561l;
    @BindView(2131492929)
    protected CheckButton mDoneBtn;
    @BindView(2131493047)
    protected EditText mIdCardEditText;
    @BindView(2131493491)
    protected DmtStatusView mStatusView;
    @BindView(2131493494)
    protected TextView mSubTitle;

    /* renamed from: g */
    public final CommonPresent mo58129g() {
        return null;
    }

    /* renamed from: d */
    private void m73902d() {
        this.mStatusView.mo25942f();
        AccountApiInModule.m71177a(C21671bd.m72536d(), this.f59561l, (C18245g<C21107a>) new C18245g<C21107a>() {
            public final void onFailure(Throwable th) {
                if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                    C10761a.m31399c((Context) VerifyIDCardFragment.this.getActivity(), (int) R.string.cjs).mo25750a();
                    if (VerifyIDCardFragment.this.getActivity() != null) {
                        VerifyIDCardFragment.this.mStatusView.mo25944h();
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C21107a aVar) {
                if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                    if (TextUtils.equals(aVar.f56681a, "success")) {
                        VerifyIDCardFragment.this.f59560e = aVar.f56682b.f56685c;
                        String a = C1642a.m8034a(VerifyIDCardFragment.this.getString(R.string.fne), new Object[]{VerifyIDCardFragment.this.f59560e});
                        int indexOf = a.indexOf(VerifyIDCardFragment.this.f59560e);
                        Spannable newSpannable = Factory.getInstance().newSpannable(a);
                        newSpannable.setSpan(new ForegroundColorSpan(VerifyIDCardFragment.this.getResources().getColor(R.color.a4r)), indexOf, VerifyIDCardFragment.this.f59560e.length() + indexOf, 17);
                        VerifyIDCardFragment.this.mSubTitle.setText(newSpannable);
                        VerifyIDCardFragment.this.mStatusView.setVisibility(8);
                        return;
                    }
                    if (10003 == aVar.f56682b.f56683a) {
                        Intent intent = new Intent();
                        intent.putExtra("error_code", aVar.f56682b.f56683a);
                        VerifyIDCardFragment.this.getActivity().setResult(0, intent);
                        VerifyIDCardFragment.this.getActivity().finish();
                    } else {
                        C10761a.m31403c((Context) VerifyIDCardFragment.this.getActivity(), C22338o.m73946a(Integer.valueOf(aVar.f56682b.f56683a), aVar.f56682b.f56684b)).mo25750a();
                    }
                    if (VerifyIDCardFragment.this.getActivity() != null) {
                        VerifyIDCardFragment.this.mStatusView.mo25944h();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private View m73900a() {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(R.string.c48);
        dmtTextView.setOnClickListener(new C22315n(this));
        return dmtTextView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo58738c(View view) {
        m73902d();
    }

    /* renamed from: a */
    public static VerifyIDCardFragment m73901a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("shark_ticket", str);
        VerifyIDCardFragment verifyIDCardFragment = new VerifyIDCardFragment();
        verifyIDCardFragment.setArguments(bundle);
        return verifyIDCardFragment;
    }

    @OnClick({2131492909, 2131492929})
    public void onClick(View view) {
        if (isViewValid()) {
            if (view.getId() == R.id.jo) {
                KeyboardUtils.m77057c(this.mIdCardEditText);
                getActivity().finish();
                return;
            }
            if (view.getId() == R.id.q2) {
                AccountApiInModule.m71178a(C21671bd.m72536d(), this.mIdCardEditText.getText().toString(), this.f59561l, new C21111a() {
                    /* renamed from: a */
                    public final void mo56962a(JSONObject jSONObject) {
                        if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            VerifyIDCardFragment.this.getActivity().setResult(-1);
                            VerifyIDCardFragment.this.getActivity().finish();
                        }
                    }

                    public final void onFailure(Throwable th) {
                        if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            C10761a.m31399c((Context) VerifyIDCardFragment.this.getActivity(), (int) R.string.cjs).mo25750a();
                            if (VerifyIDCardFragment.this.getActivity() != null) {
                                VerifyIDCardFragment.this.mStatusView.mo25944h();
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo56963b(JSONObject jSONObject) {
                        if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            int optInt = optJSONObject.optInt("error_code");
                            String optString = optJSONObject.optString("description");
                            if (10003 == optInt) {
                                Intent intent = new Intent();
                                intent.putExtra("error_code", optInt);
                                VerifyIDCardFragment.this.getActivity().setResult(0, intent);
                                return;
                            }
                            if (!TextUtils.isEmpty(optString)) {
                                C10761a.m31403c((Context) VerifyIDCardFragment.this.getActivity(), optString).mo25750a();
                            }
                        }
                    }
                });
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.f59561l = getArguments().getString("shark_ticket");
        }
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25966c(m73900a()));
        this.mIdCardEditText.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 6) {
                    VerifyIDCardFragment.this.mDoneBtn.setEnabled(true);
                } else {
                    VerifyIDCardFragment.this.mDoneBtn.setEnabled(false);
                }
            }
        });
        m73902d();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b1s, viewGroup, false);
    }
}
