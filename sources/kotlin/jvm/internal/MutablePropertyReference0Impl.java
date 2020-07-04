package kotlin.jvm.internal;

import kotlin.reflect.C7585d;

public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    private final String name;
    private final C7585d owner;
    private final String signature;

    public String getName() {
        return this.name;
    }

    public C7585d getOwner() {
        return this.owner;
    }

    public String getSignature() {
        return this.signature;
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public MutablePropertyReference0Impl(C7585d dVar, String str, String str2) {
        this.owner = dVar;
        this.name = str;
        this.signature = str2;
    }
}
