package kotlin.jvm;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C7569c;
import kotlin.jvm.internal.C7573i;
import kotlin.reflect.C7584c;

/* renamed from: kotlin.jvm.a */
public final class C7560a {
    /* renamed from: a */
    public static final <T> Class<T> m23571a(C7584c<T> cVar) {
        C7573i.m23587b(cVar, "$this$java");
        Class<T> a = ((C7569c) cVar).mo19478a();
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: b */
    public static final <T> Class<T> m23572b(C7584c<T> cVar) {
        C7573i.m23587b(cVar, "$this$javaObjectType");
        Class a = ((C7569c) cVar).mo19478a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }
}
