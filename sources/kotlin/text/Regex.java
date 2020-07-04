package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7551d;
import kotlin.reflect.C7585d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

public final class Regex implements Serializable {
    public static final C7620a Companion = new C7620a(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* renamed from: kotlin.text.Regex$a */
    public static final class C7620a {
        private C7620a() {
        }

        /* renamed from: a */
        public static int m23672a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        public /* synthetic */ C7620a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: kotlin.text.Regex$b */
    static final class C7621b implements Serializable {

        /* renamed from: a */
        public static final C7622a f20909a = new C7622a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f20910b;

        /* renamed from: c */
        private final int f20911c;

        /* renamed from: kotlin.text.Regex$b$a */
        public static final class C7622a {
            private C7622a() {
            }

            public /* synthetic */ C7622a(C7571f fVar) {
                this();
            }
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f20910b, this.f20911c);
            C7573i.m23582a((Object) compile, "Pattern.compile(pattern, flags)");
            return new Regex(compile);
        }

        public C7621b(String str, int i) {
            C7573i.m23587b(str, "pattern");
            this.f20910b = str;
            this.f20911c = i;
        }
    }

    /* renamed from: kotlin.text.Regex$c */
    static final class C7623c extends Lambda implements C7561a<C7631j> {

        /* renamed from: a */
        final /* synthetic */ Regex f20912a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f20913b;

        /* renamed from: c */
        final /* synthetic */ int f20914c;

        C7623c(Regex regex, CharSequence charSequence, int i) {
            this.f20912a = regex;
            this.f20913b = charSequence;
            this.f20914c = i;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7631j invoke() {
            return this.f20912a.find(this.f20913b, this.f20914c);
        }
    }

    /* renamed from: kotlin.text.Regex$d */
    static final /* synthetic */ class C7624d extends FunctionReference implements C7562b<C7631j, C7631j> {

        /* renamed from: a */
        public static final C7624d f20915a = new C7624d();

        C7624d() {
            super(1);
        }

        public final String getName() {
            return "next";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C7631j.class);
        }

        public final String getSignature() {
            return "next()Lkotlin/text/MatchResult;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m23674a((C7631j) obj);
        }

        /* renamed from: a */
        private static C7631j m23674a(C7631j jVar) {
            C7573i.m23587b(jVar, "p1");
            return jVar.mo19514e();
        }
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        C7573i.m23582a((Object) pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final String toString() {
        String pattern = this.nativePattern.toString();
        C7573i.m23582a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C7573i.m23582a((Object) pattern, "nativePattern.pattern()");
        return new C7621b(pattern, this.nativePattern.flags());
    }

    public final Set<RegexOption> getOptions() {
        Set<? extends RegexOption> set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(RegexOption.class);
        C7525m.m23476a((Iterable<? extends T>) allOf, (C7562b<? super T, Boolean>) new Regex$fromInt$$inlined$apply$lambda$1<Object,Boolean>(flags));
        Set<? extends RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C7573i.m23582a((Object) unmodifiableSet, "Collections.unmodifiable…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public Regex(Pattern pattern) {
        C7573i.m23587b(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final boolean matches(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public Regex(String str) {
        C7573i.m23587b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C7573i.m23582a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    public final C7631j matchEntire(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C7573i.m23582a((Object) matcher, "nativePattern.matcher(input)");
        return C7632l.m23691a(matcher, charSequence);
    }

    public final C7631j find(CharSequence charSequence, int i) {
        C7573i.m23587b(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C7573i.m23582a((Object) matcher, "nativePattern.matcher(input)");
        return C7632l.m23690a(matcher, i, charSequence);
    }

    public final C7604g<C7631j> findAll(CharSequence charSequence, int i) {
        C7573i.m23587b(charSequence, "input");
        return C7605h.m23639a((C7561a<? extends T>) new C7623c<Object>(this, charSequence, i), (C7562b<? super T, ? extends T>) C7624d.f20915a);
    }

    public final String replace(CharSequence charSequence, String str) {
        C7573i.m23587b(charSequence, "input");
        C7573i.m23587b(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C7573i.m23582a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        C7573i.m23587b(charSequence, "input");
        C7573i.m23587b(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        C7573i.m23582a((Object) replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public Regex(String str, Set<? extends RegexOption> set) {
        C7573i.m23587b(str, "pattern");
        C7573i.m23587b(set, "options");
        Pattern compile = Pattern.compile(str, C7620a.m23672a(C7632l.m23687a((Iterable<? extends C7630f>) set)));
        C7573i.m23582a((Object) compile, "Pattern.compile(pattern,…odeCase(options.toInt()))");
        this(compile);
    }

    public Regex(String str, RegexOption regexOption) {
        C7573i.m23587b(str, "pattern");
        C7573i.m23587b(regexOption, "option");
        Pattern compile = Pattern.compile(str, C7620a.m23672a(regexOption.getValue()));
        C7573i.m23582a((Object) compile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(compile);
    }

    public final String replace(CharSequence charSequence, C7562b<? super C7631j, ? extends CharSequence> bVar) {
        C7573i.m23587b(charSequence, "input");
        C7573i.m23587b(bVar, "transform");
        int i = 0;
        C7631j find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            if (find$default == null) {
                C7573i.m23580a();
            }
            sb.append(charSequence, i, find$default.mo19510a().mo19435b().intValue());
            sb.append((CharSequence) bVar.invoke(find$default));
            i = find$default.mo19510a().mo19436c().intValue() + 1;
            find$default = find$default.mo19514e();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final List<String> split(CharSequence charSequence, int i) {
        boolean z;
        C7573i.m23587b(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Matcher matcher = this.nativePattern.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return C7525m.m23457a(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0) {
                i3 = C7551d.m23567d(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i4 >= 0 && arrayList.size() == i4) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ C7631j find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ C7604g findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }
}
