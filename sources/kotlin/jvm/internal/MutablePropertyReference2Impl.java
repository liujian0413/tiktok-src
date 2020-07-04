package kotlin.jvm.internal;

import kotlin.reflect.C7585d;

public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
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

    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    public MutablePropertyReference2Impl(C7585d dVar, String str, String str2) {
        this.owner = dVar;
        this.name = str;
        this.signature = str2;
    }

    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }
}
