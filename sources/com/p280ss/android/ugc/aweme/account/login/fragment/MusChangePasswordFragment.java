package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.p647b.C12722f;
import com.bytedance.sdk.account.p645a.p649d.C12735g;
import com.p280ss.android.ugc.aweme.account.login.C21638v;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21270a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusChangePasswordFragment */
public class MusChangePasswordFragment extends BaseMusLoginFragment implements C21270a {

    /* renamed from: w */
    private static final boolean f57566w = C7163a.m22363a();

    /* renamed from: A */
    private View f57567A;

    /* renamed from: B */
    private String f57568B = "";

    /* renamed from: C */
    private int f57569C;

    /* renamed from: D */
    private int f57570D;

    /* renamed from: E */
    private int f57571E;

    /* renamed from: n */
    public EditText f57572n;

    /* renamed from: o */
    public ImageView f57573o;

    /* renamed from: p */
    public EditText f57574p;

    /* renamed from: q */
    public ImageView f57575q;

    /* renamed from: r */
    public EditText f57576r;

    /* renamed from: s */
    public ImageView f57577s;

    /* renamed from: t */
    public LoginButton f57578t;

    /* renamed from: u */
    public View f57579u;

    /* renamed from: v */
    public TextView f57580v;

    /* renamed from: x */
    private TextView f57581x;

    /* renamed from: y */
    private View f57582y;

    /* renamed from: z */
    private TextView f57583z;

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57572n);
    }

    public void onStart() {
        super.onStart();
        this.f57572n.postDelayed(new Runnable() {
            public final void run() {
                MusChangePasswordFragment.this.mo57500a((View) MusChangePasswordFragment.this.f57572n);
            }
        }, 500);
    }

    /* renamed from: a */
    public final void mo57575a() {
        mo57577c(false);
        if (getContext() != null) {
            C10761a.m31384a(getContext(), (int) R.string.cer, 0).mo25750a();
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: b */
    private void m71982b(String str) {
        mo57577c(true);
        this.f57580v.setText(str);
    }

    /* renamed from: a */
    public final void mo57248a(String str) {
        this.f57568B = str;
        if (!TextUtils.isEmpty(this.f57568B)) {
            this.f57578t.performClick();
        }
    }

    /* renamed from: c */
    public final void mo57577c(boolean z) {
        if (z) {
            this.f57579u.setVisibility(0);
        } else {
            this.f57579u.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57578d(View view) {
        if (!TextUtils.equals(this.f57574p.getText().toString(), this.f57576r.getText().toString())) {
            mo57577c(true);
            this.f57580v.setText(getResources().getString(R.string.cg8));
            return;
        }
        this.f57578t.mo57356Z_();
        mo57509e().mo57214a(this.f57572n.getText().toString(), this.f57574p.getText().toString(), this.f57568B, (C12722f) new C12722f() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12735g gVar) {
                if (MusChangePasswordFragment.this.isViewValid() && MusChangePasswordFragment.this.getContext() != null) {
                    MusChangePasswordFragment.this.f57578t.mo57357a();
                    MusChangePasswordFragment.this.mo57575a();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12735g gVar, int i) {
                if (MusChangePasswordFragment.this.isViewValid() && MusChangePasswordFragment.this.getContext() != null) {
                    MusChangePasswordFragment.this.f57578t.mo57357a();
                    if (i > 0) {
                        MusChangePasswordFragment.this.mo57576a(gVar);
                    } else {
                        MusChangePasswordFragment.this.f57578t.clearAnimation();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57576a(C12735g gVar) {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        if (gVar != null) {
            int i = gVar.f33702b;
            if (gVar.f33705e != null) {
                jSONObject = gVar.f33705e.optJSONObject("data");
            } else {
                jSONObject = null;
            }
            if (i == 3 || i == 1009) {
                m71982b(getString(R.string.ceo));
            } else if (i == 1051) {
                m71982b(getString(R.string.csj));
            } else if (i == 1056) {
                C10761a.m31396b(getContext(), gVar.f33703c, 0).mo25750a();
            } else if (i == 2002) {
                if (jSONObject != null) {
                    str = jSONObject.optString("shark_ticket");
                } else {
                    str = "";
                }
                String str5 = gVar.f33703c;
                if (jSONObject != null) {
                    str2 = jSONObject.optString("mobile");
                } else {
                    str2 = "";
                }
                MusChangePassSendCodeFragment a = MusChangePassSendCodeFragment.m71974a(str, str5, str2, this.f57572n.getText().toString(), this.f57574p.getText().toString());
                a.mo57501a((C21524n) getActivity());
                a.f57564z = this;
                mo57503b(a, false);
            } else if (i != 2005) {
                if (TextUtils.isEmpty(gVar.f33703c)) {
                    str4 = getString(R.string.dxi);
                } else {
                    str4 = gVar.f33703c;
                }
                C10761a.m31396b(getContext(), str4, 0).mo25750a();
            } else {
                if (jSONObject != null) {
                    str3 = jSONObject.optString("platform");
                } else {
                    str3 = "";
                }
                MusPasswordVerifyThirdFragment a2 = MusPasswordVerifyThirdFragment.m72101a(str3, this.f57572n.getText().toString(), this.f57574p.getText().toString());
                a2.f57719u = new C21531u(this);
                mo57503b(a2, false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57505b(boolean z) {
        if (this.f57571E == 0) {
            this.f57571E = (this.f57583z.getBottom() - this.f57406e.getBottom()) + this.f57569C;
        }
        if (this.f57570D == 0) {
            this.f57570D = this.f57583z.getTop() - this.f57406e.getBottom();
        }
        if (!z) {
            this.f57581x.animate().alpha(0.0f).setDuration(110).start();
            this.f57582y.animate().alpha(0.0f).setDuration(110).start();
            this.f57583z.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57567A.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57578t.getTop() - this.f57567A.getBottom() <= f57404i) {
            this.f57581x.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57582y.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57583z.animate().translationY((float) (-this.f57570D)).alpha(0.0f).setDuration(220).start();
            this.f57567A.animate().translationY((float) (-this.f57571E)).setDuration(220).start();
        }
    }

    /* renamed from: e */
    private void m71983e(View view) {
        this.f57572n = (EditText) view.findViewById(R.id.agb);
        this.f57573o = (ImageView) view.findViewById(R.id.wu);
        this.f57574p = (EditText) view.findViewById(R.id.aga);
        this.f57575q = (ImageView) view.findViewById(R.id.wt);
        this.f57576r = (EditText) view.findViewById(R.id.agk);
        this.f57577s = (ImageView) view.findViewById(R.id.wz);
        this.f57578t = (LoginButton) view.findViewById(R.id.py);
        this.f57580v = (TextView) view.findViewById(R.id.eho);
        this.f57579u = view.findViewById(R.id.ehp);
        this.f57581x = (TextView) view.findViewById(R.id.dmu);
        this.f57582y = view.findViewById(R.id.dmv);
        this.f57583z = (TextView) view.findViewById(R.id.e3f);
        this.f57567A = view.findViewById(R.id.a24);
        this.f57578t.setLoadingBackground(R.drawable.bba);
        this.f57578t.setLoginBackgroundRes(R.drawable.bav);
        this.f57578t.setAutoMirrored(false);
        this.f57573o.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusChangePasswordFragment.this.f57572n.setText("");
                MusChangePasswordFragment.this.f57573o.setVisibility(8);
            }
        });
        this.f57575q.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusChangePasswordFragment.this.f57574p.setText("");
                MusChangePasswordFragment.this.f57575q.setVisibility(8);
            }
        });
        this.f57577s.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusChangePasswordFragment.this.f57576r.setText("");
                MusChangePasswordFragment.this.f57577s.setVisibility(8);
            }
        });
        this.f57572n.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                ImageView imageView = MusChangePasswordFragment.this.f57573o;
                if (!z || TextUtils.isEmpty(MusChangePasswordFragment.this.f57572n.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57572n.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                int i;
                super.afterTextChanged(editable);
                ImageView imageView = MusChangePasswordFragment.this.f57573o;
                if (!TextUtils.isEmpty(MusChangePasswordFragment.this.f57572n.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(MusChangePasswordFragment.this.f57572n.getText()) && TextUtils.isEmpty(MusChangePasswordFragment.this.f57574p.getText()) && TextUtils.isEmpty(MusChangePasswordFragment.this.f57576r.getText())) {
                    MusChangePasswordFragment.this.f57579u.setVisibility(8);
                }
            }
        });
        this.f57574p.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                ImageView imageView = MusChangePasswordFragment.this.f57575q;
                if (!z || TextUtils.isEmpty(MusChangePasswordFragment.this.f57574p.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57574p.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(final Editable editable) {
                int i;
                super.afterTextChanged(editable);
                MusChangePasswordFragment.this.f57574p.removeCallbacks(null);
                MusChangePasswordFragment.this.f57574p.postDelayed(new Runnable() {
                    public final void run() {
                        if (editable.toString().length() > 0 && editable.toString().length() <= 5) {
                            MusChangePasswordFragment.this.f57578t.setEnabled(false);
                        } else if (editable.toString().length() > 20) {
                            MusChangePasswordFragment.this.mo57577c(true);
                            MusChangePasswordFragment.this.f57580v.setText(MusChangePasswordFragment.this.getResources().getString(R.string.cet));
                            MusChangePasswordFragment.this.f57578t.setEnabled(false);
                        } else if (TextUtils.isEmpty(editable.toString()) || C21638v.m72447a(editable.toString())) {
                            MusChangePasswordFragment.this.mo57577c(false);
                            MusChangePasswordFragment.this.f57578t.setEnabled(true);
                        } else {
                            MusChangePasswordFragment.this.mo57577c(true);
                            MusChangePasswordFragment.this.f57580v.setText(MusChangePasswordFragment.this.getResources().getString(R.string.ceq));
                            MusChangePasswordFragment.this.f57578t.setEnabled(false);
                        }
                    }
                }, 200);
                ImageView imageView = MusChangePasswordFragment.this.f57575q;
                if (!TextUtils.isEmpty(MusChangePasswordFragment.this.f57574p.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(MusChangePasswordFragment.this.f57572n.getText()) && TextUtils.isEmpty(MusChangePasswordFragment.this.f57574p.getText()) && TextUtils.isEmpty(MusChangePasswordFragment.this.f57576r.getText())) {
                    MusChangePasswordFragment.this.f57579u.setVisibility(8);
                }
            }
        });
        this.f57576r.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                ImageView imageView = MusChangePasswordFragment.this.f57577s;
                if (!z || TextUtils.isEmpty(MusChangePasswordFragment.this.f57576r.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57576r.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                int i;
                super.afterTextChanged(editable);
                ImageView imageView = MusChangePasswordFragment.this.f57577s;
                if (!TextUtils.isEmpty(MusChangePasswordFragment.this.f57576r.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(MusChangePasswordFragment.this.f57572n.getText()) && TextUtils.isEmpty(MusChangePasswordFragment.this.f57574p.getText()) && TextUtils.isEmpty(MusChangePasswordFragment.this.f57576r.getText())) {
                    MusChangePasswordFragment.this.f57579u.setVisibility(8);
                }
            }
        });
        this.f57578t.setOnClickListener(new C21530t(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m71983e(view);
        this.f57569C = (int) C9738o.m28708b(getContext(), 35.0f);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aea, viewGroup, false);
    }
}
