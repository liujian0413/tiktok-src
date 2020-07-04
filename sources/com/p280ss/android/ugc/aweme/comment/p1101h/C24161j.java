package com.p280ss.android.ugc.aweme.comment.p1101h;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.comment.h.j */
public final class C24161j {

    /* renamed from: a */
    private static final Pattern f63833a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    private static final Pattern f63834b = Pattern.compile("<no_trans>(.+?)</no_trans>");

    /* renamed from: b */
    public static String m79370b(String str) {
        Matcher matcher = f63834b.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            sb.replace(matcher.start() - i, matcher.end() - i, matcher.group(1));
            i += 21;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m79369a(String str) {
        Matcher matcher = f63833a.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start() + i;
            int end = matcher.end() + i;
            if (C27606a.m90489b(C6399b.m19921a()).mo70934a(matcher.group())) {
                sb.insert(start, "<no_trans>");
                sb.insert(end + 10, "</no_trans>");
                i += 21;
            }
        }
        return sb.toString();
    }
}
