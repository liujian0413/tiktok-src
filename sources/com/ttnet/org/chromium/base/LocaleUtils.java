package com.ttnet.org.chromium.base;

import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Locale.Builder;

public class LocaleUtils {
    private LocaleUtils() {
    }

    public static String getDefaultLocaleString() {
        return toLanguageTag(Locale.getDefault());
    }

    private static String getDefaultCountryCode() {
        CommandLine instance = CommandLine.getInstance();
        if (instance.hasSwitch("default-country-code")) {
            return instance.getSwitchValue("default-country-code");
        }
        return Locale.getDefault().getCountry();
    }

    public static String getDefaultLocaleListString() {
        if (VERSION.SDK_INT >= 24) {
            return toLanguageTags(LocaleList.getDefault());
        }
        return getDefaultLocaleString();
    }

    public static String toLanguage(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public static Locale forLanguageTag(String str) {
        if (VERSION.SDK_INT >= 21) {
            return getUpdatedLocaleForAndroid(Locale.forLanguageTag(str));
        }
        return forLanguageTagCompat(str);
    }

    public static boolean isLanguageSupported(String str) {
        for (String language : BuildConfig.COMPRESSED_LOCALES) {
            if (toLanguage(language).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getUpdatedLanguageForAndroid(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 101385(0x18c09, float:1.4207E-40)
            if (r0 == r1) goto L_0x0019
            r1 = 115947(0x1c4eb, float:1.62476E-40)
            if (r0 == r1) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "und"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0023
            r0 = 0
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "fil"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = -1
        L_0x0024:
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.String r2 = "tl"
            return r2
        L_0x002b:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.LocaleUtils.getUpdatedLanguageForAndroid(java.lang.String):java.lang.String");
    }

    public static Locale getUpdatedLocaleForAndroid(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(language);
        if (updatedLanguageForAndroid.equals(language)) {
            return locale;
        }
        return new Builder().setLocale(locale).setLanguage(updatedLanguageForAndroid).build();
    }

    public static Locale getUpdatedLocaleForChromium(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(language);
        if (updatedLanguageForChromium.equals(language)) {
            return locale;
        }
        return new Builder().setLocale(locale).setLanguage(updatedLanguageForChromium).build();
    }

    public static String toLanguageTags(LocaleList localeList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(toLanguageTag(getUpdatedLocaleForChromium(localeList.get(i))));
        }
        return TextUtils.join(",", arrayList);
    }

    public static Locale forLanguageTagCompat(String str) {
        String[] split = str.split("-");
        if (split.length == 0) {
            return new Locale("");
        }
        String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(split[0]);
        if (updatedLanguageForAndroid.length() != 2 && updatedLanguageForAndroid.length() != 3) {
            return new Locale("");
        }
        if (split.length == 1) {
            return new Locale(updatedLanguageForAndroid);
        }
        String str2 = split[1];
        if (str2.length() == 2 || str2.length() == 3) {
            return new Locale(updatedLanguageForAndroid, str2);
        }
        return new Locale(updatedLanguageForAndroid);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getUpdatedLanguageForChromium(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 3365(0xd25, float:4.715E-42)
            if (r0 == r1) goto L_0x0033
            r1 = 3374(0xd2e, float:4.728E-42)
            if (r0 == r1) goto L_0x0029
            r1 = 3391(0xd3f, float:4.752E-42)
            if (r0 == r1) goto L_0x001f
            r1 = 3704(0xe78, float:5.19E-42)
            if (r0 == r1) goto L_0x0015
            goto L_0x003d
        L_0x0015:
            java.lang.String r0 = "tl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 3
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "ji"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x0029:
            java.lang.String r0 = "iw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 0
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "in"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 2
            goto L_0x003e
        L_0x003d:
            r0 = -1
        L_0x003e:
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            return r2
        L_0x0042:
            java.lang.String r2 = "fil"
            return r2
        L_0x0045:
            java.lang.String r2 = "id"
            return r2
        L_0x0048:
            java.lang.String r2 = "yi"
            return r2
        L_0x004b:
            java.lang.String r2 = "he"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.LocaleUtils.getUpdatedLanguageForChromium(java.lang.String):java.lang.String");
    }

    public static String toLanguageTag(Locale locale) {
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(locale.getLanguage());
        String country = locale.getCountry();
        if (updatedLanguageForChromium.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return updatedLanguageForChromium;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(updatedLanguageForChromium);
        sb.append("-");
        sb.append(country);
        return sb.toString();
    }
}
