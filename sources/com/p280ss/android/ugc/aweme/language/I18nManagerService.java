package com.p280ss.android.ugc.aweme.language;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.language.I18nManagerService */
public interface I18nManagerService {
    String getAppLanguage();

    String getAppLogRegion();

    Locale getCountryLocale();

    C7120e getCurrentI18nItem(Context context);

    List<C7120e> getI18nItems();

    String getLanguage(Locale locale);

    Locale getLocale(String str);

    Map<String, C7120e> getLocaleMap();

    String getRegion();

    String getSysLanguage();

    String getSysRegion();

    void installCommonParams();

    boolean isArabicLang(Context context);

    boolean isIndonesiaByMcc();

    boolean isKorean();
}
