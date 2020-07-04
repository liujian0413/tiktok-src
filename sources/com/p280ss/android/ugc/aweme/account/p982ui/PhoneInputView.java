package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a.C21567a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountryListActivity;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21171a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.account.ui.PhoneInputView */
public final class PhoneInputView extends LinearLayout implements C21171a {

    /* renamed from: a */
    public static final C22268a f59484a = new C22268a(null);

    /* renamed from: b */
    private static final Regex f59485b = new Regex("\\D+");

    /* renamed from: c */
    private static final C21566a f59486c;

    /* renamed from: d */
    private HashMap f59487d;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.PhoneInputView$a */
    public static final class C22268a {
        private C22268a() {
        }

        public /* synthetic */ C22268a(C7571f fVar) {
            this();
        }
    }

    public PhoneInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m73823a(int i) {
        if (this.f59487d == null) {
            this.f59487d = new HashMap();
        }
        View view = (View) this.f59487d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f59487d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getCountryCode() {
        try {
            return Integer.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final EditText getEditText() {
        return ((InputWithIndicator) m73823a((int) R.id.a3t)).getEditText();
    }

    public final String getFullPhoneNumber() {
        String a = PhoneNumberUtil.m73058a(getPhoneNumberObject());
        C7573i.m23582a((Object) a, "PhoneNumberUtil.formatNu…r(getPhoneNumberObject())");
        return a;
    }

    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) m73823a((int) R.id.a3t);
        C7573i.m23582a((Object) inputWithIndicator, "country_code_phone_input");
        return inputWithIndicator;
    }

    public final long getPhoneNumber() {
        try {
            return Long.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getPhoneNumberString() {
        return ((InputWithIndicator) m73823a((int) R.id.a3t)).getText();
    }

    public final PhoneNumber getPhoneNumberObject() {
        PhoneNumber create = PhoneNumber.create(getCountryCode(), getPhoneNumber());
        C7573i.m23582a((Object) create, "PhoneNumberUtil.PhoneNum…Code(), getPhoneNumber())");
        return create;
    }

    static {
        C21566a aVar;
        if (C7163a.m22363a()) {
            aVar = C21567a.m72292b();
        } else {
            aVar = C21567a.m72291a();
        }
        f59486c = aVar;
    }

    public final String getCountryCodeString() {
        DmtTextView dmtTextView = (DmtTextView) m73823a((int) R.id.a3p);
        C7573i.m23582a((Object) dmtTextView, "country_code_dd_number");
        CharSequence text = dmtTextView.getText();
        if (text != null) {
            String replace = f59485b.replace(text, "");
            if (replace != null) {
                return replace;
            }
        }
        return "";
    }

    public final String getCountryName() {
        DmtTextView dmtTextView = (DmtTextView) m73823a((int) R.id.a3o);
        C7573i.m23582a((Object) dmtTextView, "country_code_dd_name");
        CharSequence text = dmtTextView.getText();
        if (text != null) {
            String obj = text.toString();
            if (obj != null) {
                if (obj != null) {
                    String obj2 = C7634n.m23762b(obj).toString();
                    if (obj2 != null) {
                        return obj2;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo58693a() {
        boolean z;
        boolean z2;
        Object systemService = getContext().getSystemService("phone");
        if (systemService != null) {
            String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
            CharSequence charSequence = simCountryIso;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Locale locale = Locale.getDefault();
                C7573i.m23582a((Object) locale, "Locale.getDefault()");
                simCountryIso = locale.getCountry();
            }
            CharSequence charSequence2 = simCountryIso;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setCountry(f59486c);
                return;
            }
            for (C21566a aVar : C21567a.m72293c()) {
                if (C7634n.m23717a(aVar.f57900c, simCountryIso, true)) {
                    setCountry(aVar);
                    z3 = true;
                }
            }
            if (!z3) {
                setCountry(f59486c);
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    /* renamed from: a */
    public final void mo57095a(C21566a aVar) {
        setCountry(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        if (r0 == null) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCountry(com.p280ss.android.ugc.aweme.account.login.model.C21566a r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0006
            java.lang.String r0 = r2.f57901d
            if (r0 != 0) goto L_0x0008
        L_0x0006:
            java.lang.String r0 = ""
        L_0x0008:
            r1.setCountryCode(r0)
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = r2.f57900c
            if (r2 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r2 = ""
        L_0x0013:
            r1.setCountryName(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.p982ui.PhoneInputView.setCountry(com.ss.android.ugc.aweme.account.login.model.a):void");
    }

    public final void setCountryCode(String str) {
        C7573i.m23587b(str, "code");
        DmtTextView dmtTextView = (DmtTextView) m73823a((int) R.id.a3p);
        C7573i.m23582a((Object) dmtTextView, "country_code_dd_number");
        dmtTextView.setText(str);
    }

    public final void setCountryName(String str) {
        C7573i.m23587b(str, "name");
        DmtTextView dmtTextView = (DmtTextView) m73823a((int) R.id.a3o);
        C7573i.m23582a((Object) dmtTextView, "country_code_dd_name");
        dmtTextView.setText(str);
    }

    public final void setPhoneNumber(String str) {
        C7573i.m23587b(str, "number");
        ((InputWithIndicator) m73823a((int) R.id.a3t)).setText(str);
    }

    public PhoneInputView(final Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.b3q, this);
        C10789c.m31502a((LinearLayout) m73823a((int) R.id.cb3));
        C21170a.m71338a((C21171a) this);
        ((LinearLayout) m73823a((int) R.id.cb3)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                context.startActivity(new Intent(context, MusCountryListActivity.class));
            }
        });
    }

    public /* synthetic */ PhoneInputView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
