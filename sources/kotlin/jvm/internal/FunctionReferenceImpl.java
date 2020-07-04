package kotlin.jvm.internal;

import kotlin.reflect.C7585d;

public class FunctionReferenceImpl extends FunctionReference {
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

    public FunctionReferenceImpl(int i, C7585d dVar, String str, String str2) {
        super(i);
        this.owner = dVar;
        this.name = str;
        this.signature = str2;
    }
}
