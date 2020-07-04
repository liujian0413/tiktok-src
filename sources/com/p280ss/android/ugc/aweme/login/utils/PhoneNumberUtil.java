package com.p280ss.android.ugc.aweme.login.utils;

import android.os.Build.VERSION;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.login.utils.PhoneNumberUtil */
public final class PhoneNumberUtil {

    /* renamed from: com.ss.android.ugc.aweme.login.utils.PhoneNumberUtil$PhoneNumber */
    public static class PhoneNumber implements Serializable {
        private int countryCode = 0;
        private String countryIso = Locale.CHINA.getCountry();
        private long nationalNumber = 0;
        private String rawInput = "";

        public int getCountryCode() {
            return this.countryCode;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public long getNationalNumber() {
            return this.nationalNumber;
        }

        public String getRawInput() {
            return this.rawInput;
        }

        public PhoneNumber setCountryCode(int i) {
            this.countryCode = i;
            return this;
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public PhoneNumber setNationalNumber(long j) {
            this.nationalNumber = j;
            return this;
        }

        public PhoneNumber setRawInput(String str) {
            this.rawInput = str;
            return this;
        }
    }

    /* renamed from: a */
    public static String m105814a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = Pattern.compile("\\+[0-9]{1,3}[ \\-]").matcher(str);
        if (matcher.find()) {
            return matcher.replaceFirst("");
        }
        return str;
    }

    /* renamed from: b */
    public static String m105815b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        Matcher matcher = Pattern.compile("\\+[0-9]{1,3}[ \\-]").matcher(trim);
        if (matcher.find()) {
            String group = matcher.group(0);
            StringBuilder sb = new StringBuilder();
            sb.append(group);
            sb.append(m105816c(trim.substring(trim.indexOf(group) + group.length())));
            str2 = sb.toString();
        } else {
            str2 = m105816c(trim);
        }
        return str2;
    }

    /* renamed from: c */
    private static String m105816c(String str) {
        if (VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.normalizeNumber(str);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (sb.length() == 0 && charAt == '+') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
