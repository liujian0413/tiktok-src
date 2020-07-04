package com.ttnet.org.chromium.base1;

import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Map;

public class LocaleUtils {
    private static final Map<String, String> LANGUAGE_MAP_FOR_ANDROID;
    private static final Map<String, String> LANGUAGE_MAP_FOR_CHROMIUM;

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

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("iw", "he");
        hashMap.put("ji", "yi");
        hashMap.put("in", "id");
        hashMap.put("tl", "fil");
        LANGUAGE_MAP_FOR_CHROMIUM = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("und", "");
        hashMap2.put("fil", "tl");
        LANGUAGE_MAP_FOR_ANDROID = Collections.unmodifiableMap(hashMap2);
    }

    public static String getUpdatedLanguageForAndroid(String str) {
        String str2 = (String) LANGUAGE_MAP_FOR_ANDROID.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    public static String getUpdatedLanguageForChromium(String str) {
        String str2 = (String) LANGUAGE_MAP_FOR_CHROMIUM.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    public static Locale forLanguageTag(String str) {
        if (VERSION.SDK_INT >= 21) {
            return getUpdatedLocaleForAndroid(Locale.forLanguageTag(str));
        }
        return forLanguageTagCompat(str);
    }

    public static Locale getUpdatedLocaleForAndroid(Locale locale) {
        String str = (String) LANGUAGE_MAP_FOR_ANDROID.get(locale.getLanguage());
        if (str == null) {
            return locale;
        }
        return new Builder().setLocale(locale).setLanguage(str).build();
    }

    public static Locale getUpdatedLocaleForChromium(Locale locale) {
        String str = (String) LANGUAGE_MAP_FOR_CHROMIUM.get(locale.getLanguage());
        if (str == null) {
            return locale;
        }
        return new Builder().setLocale(locale).setLanguage(str).build();
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
        if ((updatedLanguageForAndroid.length() != 2 && updatedLanguageForAndroid.length() != 3) || updatedLanguageForAndroid.equals("und")) {
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
