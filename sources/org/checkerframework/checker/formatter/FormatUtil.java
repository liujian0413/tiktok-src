package org.checkerframework.checker.formatter;

import com.C1642a;
import java.util.IllegalFormatConversionException;
import java.util.MissingFormatArgumentException;
import java.util.regex.Pattern;
import org.checkerframework.checker.formatter.qual.ConversionCategory;

public final class FormatUtil {

    /* renamed from: a */
    private static Pattern f123358a = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");

    public static class ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException {
        private static final long serialVersionUID = 17000126;
        private final int expected;
        private final int found;

        public int getExpected() {
            return this.expected;
        }

        public int getFound() {
            return this.found;
        }

        public String getMessage() {
            return C1642a.m8034a("Expected %d arguments but found %d.", new Object[]{Integer.valueOf(this.expected), Integer.valueOf(this.found)});
        }

        public ExcessiveOrMissingFormatArgumentException(int i, int i2) {
            super("-");
            this.expected = i;
            this.found = i2;
        }
    }

    public static class IllegalFormatConversionCategoryException extends IllegalFormatConversionException {
        private static final long serialVersionUID = 17000126;
        private final ConversionCategory expected;
        private final ConversionCategory found;

        public ConversionCategory getExpected() {
            return this.expected;
        }

        public ConversionCategory getFound() {
            return this.found;
        }

        public String getMessage() {
            return C1642a.m8034a("Expected category %s but found %s.", new Object[]{this.expected, this.found});
        }

        public IllegalFormatConversionCategoryException(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
            char c;
            Class<Object> cls;
            if (conversionCategory.chars.length() == 0) {
                c = '-';
            } else {
                c = conversionCategory.chars.charAt(0);
            }
            if (conversionCategory2.types == null) {
                cls = Object.class;
            } else {
                cls = conversionCategory2.types[0];
            }
            super(c, cls);
            this.expected = conversionCategory;
            this.found = conversionCategory2;
        }
    }
}
