package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.p356e.C7551d;
import kotlin.reflect.C7595j;

public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    public static final C48036a Companion = null;
    public static final C7541d directionalityMap$delegate = null;
    private final int value;

    /* renamed from: kotlin.text.CharDirectionality$a */
    public static final class C48036a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f122878a = null;

        static {
            f122878a = new C7595j[]{C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C48036a.class), "directionalityMap", "getDirectionalityMap()Ljava/util/Map;"))};
        }

        private C48036a() {
        }

        public /* synthetic */ C48036a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: kotlin.text.CharDirectionality$b */
    static final class C48037b extends Lambda implements C7561a<Map<Integer, ? extends CharDirectionality>> {

        /* renamed from: a */
        public static final C48037b f122879a = null;

        static {
            f122879a = new C48037b();
        }

        C48037b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m148978a();
        }

        /* renamed from: a */
        private static Map<Integer, CharDirectionality> m148978a() {
            CharDirectionality[] values = CharDirectionality.values();
            Map<Integer, CharDirectionality> linkedHashMap = new LinkedHashMap<>(C7551d.m23566c(C7507ae.m23386a(values.length), 16));
            for (CharDirectionality charDirectionality : values) {
                linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
            }
            return linkedHashMap;
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new C48036a(null);
        directionalityMap$delegate = C7546e.m23569a(C48037b.f122879a);
    }

    private CharDirectionality(int i) {
        this.value = i;
    }
}
