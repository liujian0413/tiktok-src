package kotlin.text;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class RegexKt$fromInt$$inlined$apply$lambda$1 extends Lambda implements C7562b<T, Boolean> {
    final /* synthetic */ int $value$inlined;

    public RegexKt$fromInt$$inlined$apply$lambda$1(int i) {
        this.$value$inlined = i;
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((T) (Enum) obj));
    }

    public final boolean invoke(T t) {
        C7630f fVar = (C7630f) t;
        if ((this.$value$inlined & fVar.getMask()) == fVar.getValue()) {
            return true;
        }
        return false;
    }
}
