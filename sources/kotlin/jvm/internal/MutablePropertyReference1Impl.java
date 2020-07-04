package kotlin.jvm.internal;

import kotlin.reflect.C7585d;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
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

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public MutablePropertyReference1Impl(C7585d dVar, String str, String str2) {
        this.owner = dVar;
        this.name = str;
        this.signature = str2;
    }
}
