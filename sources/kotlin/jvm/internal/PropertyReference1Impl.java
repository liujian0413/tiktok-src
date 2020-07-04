package kotlin.jvm.internal;

import kotlin.reflect.C7585d;

public class PropertyReference1Impl extends PropertyReference1 {
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

    public PropertyReference1Impl(C7585d dVar, String str, String str2) {
        this.owner = dVar;
        this.name = str;
        this.signature = str2;
    }
}
