package com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.b.b.a */
public final class C27507a {
    /* renamed from: c */
    public static final boolean m90163c(Emoji emoji) {
        C7573i.m23587b(emoji, "$this$isOriginAnimate");
        return m90161a(emoji, emoji.getAnimateType());
    }

    /* renamed from: d */
    public static final boolean m90164d(Emoji emoji) {
        C7573i.m23587b(emoji, "$this$isThumbnailAnimate");
        return m90161a(emoji, emoji.getStaticType());
    }

    /* renamed from: a */
    public static final String m90160a(Emoji emoji) {
        C7573i.m23587b(emoji, "$this$getEnDisplayName");
        if (emoji.getDisplayNameLangs() != null) {
            return (String) emoji.getDisplayNameLangs().get(Locale.ENGLISH.getLanguage());
        }
        return "";
    }

    /* renamed from: e */
    private static final String m90165e(Emoji emoji) {
        Locale f = m90166f(emoji);
        if (f == null) {
            return "";
        }
        String language = f.getLanguage();
        C7573i.m23582a((Object) language, "locale!!.getLanguage()");
        return language;
    }

    /* renamed from: f */
    private static final Locale m90166f(Emoji emoji) {
        if (VERSION.SDK_INT >= 24) {
            return C6399b.m19921a().getResources().getConfiguration().getLocales().get(0);
        }
        return C6399b.m19921a().getResources().getConfiguration().locale;
    }

    /* renamed from: b */
    public static final String m90162b(Emoji emoji) {
        C7573i.m23587b(emoji, "$this$getRealDisplayName");
        if (emoji.getStickerType() == 2) {
            return "";
        }
        if (TextUtils.equals(Locale.ENGLISH.getLanguage(), m90165e(emoji))) {
            String a = m90160a(emoji);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
        } else if (TextUtils.isEmpty(emoji.getDisplayName())) {
            return m90160a(emoji);
        }
        return emoji.getDisplayName();
    }

    /* renamed from: a */
    private static final boolean m90161a(Emoji emoji, String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str != null) {
                String lowerCase = str.toLowerCase();
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (!C7573i.m23585a((Object) lowerCase, (Object) "gif")) {
                    if (str != null) {
                        String lowerCase2 = str.toLowerCase();
                        C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                        if (C7573i.m23585a((Object) lowerCase2, (Object) "webp")) {
                            return true;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return false;
    }
}
