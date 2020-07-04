package p346io.reactivex.internal.p352a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.p361a.C48294d;
import p346io.reactivex.C47869r;
import p346io.reactivex.exceptions.OnErrorNotImplementedException;
import p346io.reactivex.p348d.C47573k;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.a.a */
public final class C7342a {

    /* renamed from: a */
    static final C7327h<Object, Object> f20427a = new C7354l();

    /* renamed from: b */
    public static final Runnable f20428b = new C7350h();

    /* renamed from: c */
    public static final C7323a f20429c = new C7347e();

    /* renamed from: d */
    static final C7326g<Object> f20430d = new C7348f();

    /* renamed from: e */
    public static final C7326g<Throwable> f20431e = new C7351i();

    /* renamed from: f */
    public static final C7326g<Throwable> f20432f = new C7362t();

    /* renamed from: g */
    public static final C47573k f20433g = new C7349g();

    /* renamed from: h */
    static final C7328l<Object> f20434h = new C7363u();

    /* renamed from: i */
    static final C7328l<Object> f20435i = new C7352j();

    /* renamed from: j */
    static final Callable<Object> f20436j = new C7361s();

    /* renamed from: k */
    static final Comparator<Object> f20437k = new C7357o();

    /* renamed from: l */
    public static final C7326g<C48294d> f20438l = new C7356n();

    /* renamed from: io.reactivex.internal.a.a$a */
    static final class C7343a<T1, T2, R> implements C7327h<Object[], R> {

        /* renamed from: a */
        final C7324c<? super T1, ? super T2, ? extends R> f20439a;

        C7343a(C7324c<? super T1, ? super T2, ? extends R> cVar) {
            this.f20439a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f20439a.apply(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.internal.a.a$b */
    static final class C7344b<T> implements Callable<List<T>> {

        /* renamed from: a */
        final int f20440a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<T> call() throws Exception {
            return new ArrayList(this.f20440a);
        }

        C7344b(int i) {
            this.f20440a = i;
        }
    }

    /* renamed from: io.reactivex.internal.a.a$c */
    static final class C7345c<T, U> implements C7327h<T, U> {

        /* renamed from: a */
        final Class<U> f20441a;

        C7345c(Class<U> cls) {
            this.f20441a = cls;
        }

        public final U apply(T t) throws Exception {
            return this.f20441a.cast(t);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$d */
    static final class C7346d<T, U> implements C7328l<T> {

        /* renamed from: a */
        final Class<U> f20442a;

        C7346d(Class<U> cls) {
            this.f20442a = cls;
        }

        /* renamed from: a */
        public final boolean mo9283a(T t) throws Exception {
            return this.f20442a.isInstance(t);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$e */
    static final class C7347e implements C7323a {
        C7347e() {
        }

        /* renamed from: a */
        public final void mo8975a() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.internal.a.a$f */
    static final class C7348f implements C7326g<Object> {
        C7348f() {
        }

        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.internal.a.a$g */
    static final class C7349g implements C47573k {
        C7349g() {
        }
    }

    /* renamed from: io.reactivex.internal.a.a$h */
    static final class C7350h implements Runnable {
        C7350h() {
        }

        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.internal.a.a$i */
    static final class C7351i implements C7326g<Throwable> {
        C7351i() {
        }

        /* renamed from: a */
        private static void m23069a(Throwable th) {
            C7332a.m23029a(th);
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            m23069a((Throwable) obj);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$j */
    static final class C7352j implements C7328l<Object> {
        C7352j() {
        }

        /* renamed from: a */
        public final boolean mo9283a(Object obj) {
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.a.a$k */
    enum C7353k implements Callable<Set<Object>> {
        INSTANCE;

        /* renamed from: a */
        private static Set<Object> m23071a() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: io.reactivex.internal.a.a$l */
    static final class C7354l implements C7327h<Object, Object> {
        C7354l() {
        }

        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: io.reactivex.internal.a.a$m */
    static final class C7355m<T, U> implements C7327h<T, U>, Callable<U> {

        /* renamed from: a */
        final U f20445a;

        public final U call() throws Exception {
            return this.f20445a;
        }

        public final U apply(T t) throws Exception {
            return this.f20445a;
        }

        C7355m(U u) {
            this.f20445a = u;
        }
    }

    /* renamed from: io.reactivex.internal.a.a$n */
    static final class C7356n implements C7326g<C48294d> {
        C7356n() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            m23072a((C48294d) obj);
        }

        /* renamed from: a */
        private static void m23072a(C48294d dVar) throws Exception {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$o */
    static final class C7357o implements Comparator<Object> {
        C7357o() {
        }

        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.internal.a.a$p */
    static final class C7358p<T> implements C7323a {

        /* renamed from: a */
        final C7326g<? super C47869r<T>> f20446a;

        /* renamed from: a */
        public final void mo8975a() throws Exception {
            this.f20446a.accept(C47869r.m148777a());
        }

        C7358p(C7326g<? super C47869r<T>> gVar) {
            this.f20446a = gVar;
        }
    }

    /* renamed from: io.reactivex.internal.a.a$q */
    static final class C7359q<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final C7326g<? super C47869r<T>> f20447a;

        C7359q(C7326g<? super C47869r<T>> gVar) {
            this.f20447a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f20447a.accept(C47869r.m148779a(th));
        }
    }

    /* renamed from: io.reactivex.internal.a.a$r */
    static final class C7360r<T> implements C7326g<T> {

        /* renamed from: a */
        final C7326g<? super C47869r<T>> f20448a;

        C7360r(C7326g<? super C47869r<T>> gVar) {
            this.f20448a = gVar;
        }

        public final void accept(T t) throws Exception {
            this.f20448a.accept(C47869r.m148778a(t));
        }
    }

    /* renamed from: io.reactivex.internal.a.a$s */
    static final class C7361s implements Callable<Object> {
        C7361s() {
        }

        public final Object call() {
            return null;
        }
    }

    /* renamed from: io.reactivex.internal.a.a$t */
    static final class C7362t implements C7326g<Throwable> {
        C7362t() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            m23075a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m23075a(Throwable th) {
            C7332a.m23029a((Throwable) new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: io.reactivex.internal.a.a$u */
    static final class C7363u implements C7328l<Object> {
        C7363u() {
        }

        /* renamed from: a */
        public final boolean mo9283a(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> C7327h<T, T> m23053a() {
        return f20427a;
    }

    /* renamed from: b */
    public static <T> C7326g<T> m23058b() {
        return f20430d;
    }

    /* renamed from: c */
    public static <T> C7328l<T> m23063c() {
        return f20434h;
    }

    /* renamed from: d */
    public static <T> Callable<Set<T>> m23064d() {
        return C7353k.INSTANCE;
    }

    /* renamed from: a */
    public static <T> C7326g<T> m23052a(C7326g<? super C47869r<T>> gVar) {
        return new C7360r(gVar);
    }

    /* renamed from: b */
    public static <T> C7326g<Throwable> m23059b(C7326g<? super C47869r<T>> gVar) {
        return new C7359q(gVar);
    }

    /* renamed from: c */
    public static <T> C7323a m23062c(C7326g<? super C47869r<T>> gVar) {
        return new C7358p(gVar);
    }

    /* renamed from: a */
    public static <T1, T2, R> C7327h<Object[], R> m23054a(C7324c<? super T1, ? super T2, ? extends R> cVar) {
        C7364b.m23081a(cVar, "f is null");
        return new C7343a(cVar);
    }

    /* renamed from: b */
    public static <T, U> C7327h<T, U> m23060b(U u) {
        return new C7355m(u);
    }

    /* renamed from: a */
    public static <T, U> C7327h<T, U> m23055a(Class<U> cls) {
        return new C7345c(cls);
    }

    /* renamed from: b */
    public static <T, U> C7328l<T> m23061b(Class<U> cls) {
        return new C7346d(cls);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m23056a(int i) {
        return new C7344b(i);
    }

    /* renamed from: a */
    public static <T> Callable<T> m23057a(T t) {
        return new C7355m(t);
    }
}
