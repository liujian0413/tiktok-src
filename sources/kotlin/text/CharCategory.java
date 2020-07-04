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

public enum CharCategory {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");
    
    public static final C48034a Companion = null;
    public static final C7541d categoryMap$delegate = null;
    private final String code;
    private final int value;

    /* renamed from: kotlin.text.CharCategory$a */
    public static final class C48034a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f122876a = null;

        static {
            f122876a = new C7595j[]{C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C48034a.class), "categoryMap", "getCategoryMap()Ljava/util/Map;"))};
        }

        private C48034a() {
        }

        public /* synthetic */ C48034a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: kotlin.text.CharCategory$b */
    static final class C48035b extends Lambda implements C7561a<Map<Integer, ? extends CharCategory>> {

        /* renamed from: a */
        public static final C48035b f122877a = null;

        static {
            f122877a = new C48035b();
        }

        C48035b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m148977a();
        }

        /* renamed from: a */
        private static Map<Integer, CharCategory> m148977a() {
            CharCategory[] values = CharCategory.values();
            Map<Integer, CharCategory> linkedHashMap = new LinkedHashMap<>(C7551d.m23566c(C7507ae.m23386a(values.length), 16));
            for (CharCategory charCategory : values) {
                linkedHashMap.put(Integer.valueOf(charCategory.getValue()), charCategory);
            }
            return linkedHashMap;
        }
    }

    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new C48034a(null);
        categoryMap$delegate = C7546e.m23569a(C48035b.f122877a);
    }

    public final boolean contains(char c) {
        if (Character.getType(c) == this.value) {
            return true;
        }
        return false;
    }

    private CharCategory(int i, String str) {
        this.value = i;
        this.code = str;
    }
}
