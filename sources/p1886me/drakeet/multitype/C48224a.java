package p1886me.drakeet.multitype;

/* renamed from: me.drakeet.multitype.a */
final class C48224a extends RuntimeException {
    C48224a(Class<?> cls) {
        super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
