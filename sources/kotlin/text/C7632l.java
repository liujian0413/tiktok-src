package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.p356e.C7549c;
import kotlin.p356e.C7551d;

/* renamed from: kotlin.text.l */
public final class C7632l {
    /* renamed from: a */
    public static final C7549c m23688a(MatchResult matchResult) {
        return C7551d.m23565b(matchResult.start(), matchResult.end());
    }

    /* renamed from: a */
    public static final int m23687a(Iterable<? extends C7630f> iterable) {
        int i = 0;
        for (C7630f value : iterable) {
            i |= value.getValue();
        }
        return i;
    }

    /* renamed from: a */
    public static final C7549c m23689a(MatchResult matchResult, int i) {
        return C7551d.m23565b(matchResult.start(i), matchResult.end(i));
    }

    /* renamed from: a */
    public static final C7631j m23691a(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C48042k(matcher, charSequence);
    }

    /* renamed from: a */
    public static final C7631j m23690a(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C48042k(matcher, charSequence);
    }
}
