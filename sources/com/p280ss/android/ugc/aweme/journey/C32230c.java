package com.p280ss.android.ugc.aweme.journey;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;
import kotlin.p1884io.C47991m;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.aweme.journey.c */
public final class C32230c {
    /* renamed from: a */
    public static final List<C32246j> m104534a(Context context) {
        Throwable th;
        C7573i.m23587b(context, "context");
        if (C7163a.m22363a()) {
            C10761a.m31396b(context, "使用了兜底数据", 1).mo25750a();
        }
        InputStream open = context.getAssets().open("interest_default_data.json");
        C7573i.m23582a((Object) open, "assetInputString");
        Closeable bufferedReader = new BufferedReader(new InputStreamReader(open, C48038d.f122880a), VideoCacheReadBuffersizeExperiment.DEFAULT);
        List<C32246j> list = null;
        try {
            String b = C47991m.m148954b((BufferedReader) bufferedReader);
            C47973b.m148917a(bufferedReader, null);
            C32245i iVar = (C32245i) C42996by.m136484a(b, C32245i.class);
            if (iVar != null) {
                list = iVar.f84275a;
            }
            if (list == null || list.isEmpty()) {
                list = new LinkedList<>();
            }
            for (C32246j jVar : list) {
                String a = m104533a(jVar.f84277a, context);
                if (!TextUtils.isEmpty(a)) {
                    jVar.f84278b = a;
                }
            }
            return list;
        } catch (Throwable th2) {
            C47973b.m148917a(bufferedReader, th);
            throw th2;
        }
    }

    /* renamed from: a */
    private static String m104533a(String str, Context context) {
        C7573i.m23587b(str, "s");
        C7573i.m23587b(context, "context");
        switch (str.hashCode()) {
            case -1811893345:
                if (str.equals("Sports")) {
                    String string = context.getString(R.string.cl5);
                    C7573i.m23582a((Object) string, "context.getString(R.stri…new_user_interest_sports)");
                    return string;
                }
                break;
            case -1781830854:
                if (str.equals("Travel")) {
                    String string2 = context.getString(R.string.cl9);
                    C7573i.m23582a((Object) string2, "context.getString(R.stri…new_user_interest_travel)");
                    return string2;
                }
                break;
            case -1082679165:
                if (str.equals("Oddly Satisfying")) {
                    String string3 = context.getString(R.string.cl1);
                    C7573i.m23582a((Object) string3, "context.getString(R.stri…interest_oddlysatisfying)");
                    return string3;
                }
                break;
            case -752113842:
                if (str.equals("Life Hacks")) {
                    String string4 = context.getString(R.string.cke);
                    C7573i.m23582a((Object) string4, "context.getString(R.stri…r_interest_diy_lifehacks)");
                    return string4;
                }
                break;
            case -720253902:
                if (str.equals("Science & Education")) {
                    String string5 = context.getString(R.string.cl4);
                    C7573i.m23582a((Object) string5, "context.getString(R.stri…terest_science_education)");
                    return string5;
                }
                break;
            case 66115:
                if (str.equals("Art")) {
                    String string6 = context.getString(R.string.ck7);
                    C7573i.m23582a((Object) string6, "context.getString(R.string.new_user_interest_art)");
                    return string6;
                }
                break;
            case 67700:
                if (str.equals("DIY")) {
                    String string7 = context.getString(R.string.cl_);
                    C7573i.m23582a((Object) string7, "context.getString(R.stri…new_user_interest_us_diy)");
                    return string7;
                }
                break;
            case 2052559:
                if (str.equals("Auto")) {
                    String string8 = context.getString(R.string.ck8);
                    C7573i.m23582a((Object) string8, "context.getString(R.string.new_user_interest_auto)");
                    return string8;
                }
                break;
            case 2195582:
                if (str.equals("Food")) {
                    String string9 = context.getString(R.string.ckk);
                    C7573i.m23582a((Object) string9, "context.getString(R.string.new_user_interest_food)");
                    return string9;
                }
                break;
            case 65798035:
                if (str.equals("Dance")) {
                    String string10 = context.getString(R.string.ckc);
                    C7573i.m23582a((Object) string10, "context.getString(R.stri….new_user_interest_dance)");
                    return string10;
                }
                break;
            case 74710533:
                if (str.equals("Music")) {
                    String string11 = context.getString(R.string.clb);
                    C7573i.m23582a((Object) string11, "context.getString(R.stri…w_user_interest_us_music)");
                    return string11;
                }
                break;
            case 123562007:
                if (str.equals("Outdoors")) {
                    String string12 = context.getString(R.string.cl2);
                    C7573i.m23582a((Object) string12, "context.getString(R.stri…w_user_interest_outdoors)");
                    return string12;
                }
                break;
            case 587876755:
                if (str.equals("Beauty & Style")) {
                    String string13 = context.getString(R.string.ck9);
                    C7573i.m23582a((Object) string13, "context.getString(R.stri…er_interest_beauty_style)");
                    return string13;
                }
                break;
            case 807717335:
                if (str.equals("Animals")) {
                    String string14 = context.getString(R.string.ck6);
                    C7573i.m23582a((Object) string14, "context.getString(R.stri…ew_user_interest_animals)");
                    return string14;
                }
                break;
            case 2024011449:
                if (str.equals("Comedy")) {
                    String string15 = context.getString(R.string.cka);
                    C7573i.m23582a((Object) string15, "context.getString(R.stri…new_user_interest_comedy)");
                    return string15;
                }
                break;
            case 2096998767:
                if (str.equals("Fandom")) {
                    String string16 = context.getString(R.string.ckh);
                    C7573i.m23582a((Object) string16, "context.getString(R.stri…new_user_interest_fandom)");
                    return string16;
                }
                break;
            case 2125602895:
                if (str.equals("Gaming")) {
                    String string17 = context.getString(R.string.ckl);
                    C7573i.m23582a((Object) string17, "context.getString(R.stri…new_user_interest_gaming)");
                    return string17;
                }
                break;
        }
        return "";
    }
}
