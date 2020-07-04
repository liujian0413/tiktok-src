package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.C7583b;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7603n;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements Serializable, C7583b {
    public static final Object NO_RECEIVER = C7564a.f20888a;
    protected final Object receiver;
    private transient C7583b reflected;

    /* renamed from: kotlin.jvm.internal.CallableReference$a */
    static class C7564a implements Serializable {

        /* renamed from: a */
        public static final C7564a f20888a = new C7564a();

        private C7564a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f20888a;
        }
    }

    /* access modifiers changed from: protected */
    public abstract C7583b computeReflected();

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public C7585d getOwner() {
        throw new AbstractMethodError();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public C7583b compute() {
        C7583b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C7583b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C7583b getReflected() {
        C7583b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public C7603n getReturnType() {
        return getReflected().getReturnType();
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected CallableReference(Object obj) {
        this.receiver = obj;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }
}
