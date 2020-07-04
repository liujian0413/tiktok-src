package com.p280ss.android.ugc.aweme.account.login.utils;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.common.base.C17456r;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil */
public class PhoneNumberUtil {

    /* renamed from: a */
    private static final boolean f58587a = C7163a.m22363a();

    /* renamed from: b */
    private static int f58588b = 86;

    /* renamed from: c */
    private static volatile PhoneNumberUtil f58589c = null;

    /* renamed from: d */
    private List<C21566a> f58590d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$PhoneNumber */
    public static class PhoneNumber implements Serializable {
        @C6593c(mo15949a = "countryCode_")
        private int countryCode_ = 86;
        @C6593c(mo15949a = "countryIso_")
        private String countryIso_ = Locale.CHINA.getCountry();
        @C6593c(mo15949a = "nationalNumber_")
        private long nationalNumber_ = 0;
        @C6593c(mo15949a = "rawInput_")
        private String rawInput_ = "";

        public int getCountryCode() {
            return this.countryCode_;
        }

        public String getCountryIso() {
            return this.countryIso_;
        }

        public long getNationalNumber() {
            return this.nationalNumber_;
        }

        public String getRawInput() {
            return this.rawInput_;
        }

        public PhoneNumber setCountryCode(int i) {
            this.countryCode_ = i;
            return this;
        }

        public void setCountryIso(String str) {
            this.countryIso_ = str;
        }

        public PhoneNumber setNationalNumber(long j) {
            this.nationalNumber_ = j;
            return this;
        }

        public PhoneNumber setRawInput(String str) {
            this.rawInput_ = str;
            return this;
        }

        public static PhoneNumber create(int i, long j) {
            return new PhoneNumber().setCountryCode(i).setNationalNumber(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$a */
    public static class C21885a implements TextWatcher {

        /* renamed from: a */
        private boolean f58591a;

        /* renamed from: b */
        private boolean f58592b;

        /* renamed from: c */
        private int f58593c;

        /* renamed from: a */
        private void m73064a() {
            this.f58592b = true;
        }

        public final synchronized void afterTextChanged(Editable editable) {
            boolean z = false;
            if (this.f58592b) {
                if (editable.length() != 0) {
                    z = true;
                }
                this.f58592b = z;
            } else if (!this.f58591a) {
                String a = m73063a(editable, Selection.getSelectionEnd(editable));
                this.f58591a = true;
                editable.replace(0, editable.length(), a, 0, a.length());
                if (a.equals(editable.toString())) {
                    Selection.setSelection(editable, this.f58593c);
                }
                this.f58591a = false;
            }
        }

        /* renamed from: a */
        private String m73063a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                int digit = Character.digit(charSequence.charAt(i3), 10);
                if (digit != -1) {
                    sb.append(digit);
                    if ((sb.length() + 1) % 4 == 0) {
                        sb.append(' ');
                        if (i3 < i) {
                            i2--;
                        }
                    }
                } else if (i3 < i) {
                    i2++;
                }
            }
            this.f58593c = i - i2;
            return sb.toString();
        }

        /* renamed from: a */
        private static boolean m73065a(CharSequence charSequence, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                    return true;
                }
            }
            return false;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f58591a && !this.f58592b && i2 > 0 && m73065a(charSequence, i, i2)) {
                m73064a();
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f58591a && !this.f58592b && i3 > 0 && m73065a(charSequence, i, i3)) {
                m73064a();
            }
        }
    }

    /* renamed from: a */
    public static PhoneNumberUtil m73057a(Context context) {
        if (f58589c == null) {
            synchronized (PhoneNumberUtil.class) {
                if (f58589c == null) {
                    PhoneNumberUtil phoneNumberUtil = new PhoneNumberUtil();
                    f58589c = phoneNumberUtil;
                    phoneNumberUtil.f58590d = C21566a.m72288b();
                }
            }
        }
        return f58589c;
    }

    /* renamed from: a */
    public static String m73058a(PhoneNumber phoneNumber) {
        if (phoneNumber == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("+");
        sb.append(phoneNumber.getCountryCode());
        sb.append(" ");
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m73060b(PhoneNumber phoneNumber) {
        if (phoneNumber.getCountryCode() == 86) {
            if (String.valueOf(phoneNumber.getNationalNumber()).length() == 11) {
                return true;
            }
            return false;
        } else if (phoneNumber.getCountryCode() == 0 || phoneNumber.getNationalNumber() < 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static String m73059a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length < 4) {
            return str;
        }
        int max = Math.max(length - 7, 2);
        int min = Math.min(max + 4, length - 1);
        return new StringBuilder(str).replace(max, min, C17456r.m58012a("*", min - max)).toString();
    }

    /* renamed from: b */
    public static boolean m73061b(String str, String str2) {
        int i = 0;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        long j = 0;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        if (str2 != null) {
            j = Long.parseLong(str2);
        }
        return m73060b(new PhoneNumber().setCountryCode(i).setNationalNumber(j));
    }

    /* renamed from: a */
    public final int mo58312a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        for (C21566a aVar : this.f58590d) {
            if (TextUtils.equals(aVar.f57900c, str)) {
                return aVar.mo57751a();
            }
        }
        return f58588b;
    }
}
