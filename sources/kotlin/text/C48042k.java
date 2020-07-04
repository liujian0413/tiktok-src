package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C47896a;
import kotlin.collections.C47905d;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7549c;
import kotlin.sequences.C7605h;

/* renamed from: kotlin.text.k */
final class C48042k implements C7631j {

    /* renamed from: a */
    private final C48040h f122889a = new C48044b(this);

    /* renamed from: b */
    private List<String> f122890b;

    /* renamed from: c */
    private final Matcher f122891c;

    /* renamed from: d */
    private final CharSequence f122892d;

    /* renamed from: kotlin.text.k$a */
    public static final class C48043a extends C47905d<String> {

        /* renamed from: b */
        final /* synthetic */ C48042k f122893b;

        /* renamed from: a */
        public final int mo120039a() {
            return this.f122893b.mo120239f().groupCount() + 1;
        }

        C48043a(C48042k kVar) {
            this.f122893b = kVar;
        }

        /* renamed from: a */
        private int m148986a(String str) {
            return super.indexOf(str);
        }

        /* renamed from: b */
        private int m148988b(String str) {
            return super.lastIndexOf(str);
        }

        /* renamed from: c */
        private boolean m148989c(String str) {
            return super.contains(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String get(int i) {
            String group = this.f122893b.mo120239f().group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m148989c((String) obj);
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m148986a((String) obj);
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m148988b((String) obj);
        }
    }

    /* renamed from: kotlin.text.k$b */
    public static final class C48044b extends C47896a<C48039g> implements C48041i {

        /* renamed from: a */
        final /* synthetic */ C48042k f122894a;

        /* renamed from: kotlin.text.k$b$a */
        static final class C48045a extends Lambda implements C7562b<Integer, C48039g> {

            /* renamed from: a */
            final /* synthetic */ C48044b f122895a;

            C48045a(C48044b bVar) {
                this.f122895a = bVar;
                super(1);
            }

            /* renamed from: a */
            private C48039g m148994a(int i) {
                return this.f122895a.mo120238a(i);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m148994a(((Number) obj).intValue());
            }
        }

        public final boolean isEmpty() {
            return false;
        }

        /* renamed from: a */
        public final int mo120039a() {
            return this.f122894a.mo120239f().groupCount() + 1;
        }

        public final Iterator<C48039g> iterator() {
            return C7605h.m23659d(C7525m.m23526p(C7525m.m23462a((Collection<?>) this)), new C48045a(this)).mo19416a();
        }

        C48044b(C48042k kVar) {
            this.f122894a = kVar;
        }

        /* renamed from: a */
        private boolean m148991a(C48039g gVar) {
            return super.contains(gVar);
        }

        public final boolean contains(Object obj) {
            boolean z;
            if (obj != null) {
                z = obj instanceof C48039g;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            return m148991a((C48039g) obj);
        }

        /* renamed from: a */
        public final C48039g mo120238a(int i) {
            C7549c a = C7632l.m23689a(this.f122894a.mo120239f(), i);
            if (a.mo19435b().intValue() < 0) {
                return null;
            }
            String group = this.f122894a.mo120239f().group(i);
            C7573i.m23582a((Object) group, "matchResult.group(index)");
            return new C48039g(group, a);
        }
    }

    /* renamed from: c */
    public final C48040h mo19512c() {
        return this.f122889a;
    }

    /* renamed from: f */
    public final MatchResult mo120239f() {
        return this.f122891c;
    }

    /* renamed from: a */
    public final C7549c mo19510a() {
        return C7632l.m23688a(mo120239f());
    }

    /* renamed from: b */
    public final String mo19511b() {
        String group = mo120239f().group();
        C7573i.m23582a((Object) group, "matchResult.group()");
        return group;
    }

    /* renamed from: d */
    public final List<String> mo19513d() {
        if (this.f122890b == null) {
            this.f122890b = new C48043a(this);
        }
        List<String> list = this.f122890b;
        if (list == null) {
            C7573i.m23580a();
        }
        return list;
    }

    /* renamed from: e */
    public final C7631j mo19514e() {
        int i;
        int end = mo120239f().end();
        if (mo120239f().end() == mo120239f().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f122892d.length()) {
            return null;
        }
        Matcher matcher = this.f122891c.pattern().matcher(this.f122892d);
        C7573i.m23582a((Object) matcher, "matcher.pattern().matcher(input)");
        return C7632l.m23690a(matcher, i2, this.f122892d);
    }

    public C48042k(Matcher matcher, CharSequence charSequence) {
        C7573i.m23587b(matcher, "matcher");
        C7573i.m23587b(charSequence, "input");
        this.f122891c = matcher;
        this.f122892d = charSequence;
    }
}
