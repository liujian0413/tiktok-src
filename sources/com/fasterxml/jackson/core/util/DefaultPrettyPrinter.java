package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.C14669e;
import com.fasterxml.jackson.core.C14670f;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p737io.SerializedString;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

public class DefaultPrettyPrinter implements C14669e, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    private static final long serialVersionUID = -5512586643324525213L;
    protected C14679a _arrayIndenter;
    protected transient int _nesting;
    protected C14679a _objectIndenter;
    protected final C14670f _rootSeparator;
    protected boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter implements C14679a, Serializable {
        public static FixedSpaceIndenter instance = new FixedSpaceIndenter();
        private static final long serialVersionUID = 1;

        public boolean isInline() {
            return true;
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException, JsonGenerationException {
            jsonGenerator.mo37099a(' ');
        }
    }

    public static class Lf2SpacesIndenter implements C14679a, Serializable {
        static final char[] SPACES;
        static final String SYSTEM_LINE_SEPARATOR;
        public static Lf2SpacesIndenter instance = new Lf2SpacesIndenter();
        private static final long serialVersionUID = 1;

        public boolean isInline() {
            return false;
        }

        static {
            String str;
            try {
                str = System.getProperty("line.separator");
            } catch (Throwable unused) {
                str = null;
            }
            if (str == null) {
                str = "\n";
            }
            SYSTEM_LINE_SEPARATOR = str;
            char[] cArr = new char[64];
            SPACES = cArr;
            Arrays.fill(cArr, ' ');
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException, JsonGenerationException {
            jsonGenerator.mo37100a(SYSTEM_LINE_SEPARATOR);
            if (i > 0) {
                int i2 = i + i;
                while (i2 > 64) {
                    jsonGenerator.mo37101a(SPACES, 0, 64);
                    i2 -= SPACES.length;
                }
                jsonGenerator.mo37101a(SPACES, 0, i2);
            }
        }
    }

    public static class NopIndenter implements C14679a, Serializable {
        public static NopIndenter instance = new NopIndenter();
        private static final long serialVersionUID = 1;

        public boolean isInline() {
            return true;
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) {
        }
    }

    /* renamed from: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$a */
    public interface C14679a {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException, JsonGenerationException;
    }

    public DefaultPrettyPrinter() {
        this((C14670f) DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter createInstance() {
        return new DefaultPrettyPrinter(this);
    }

    public void spacesInObjectEntries(boolean z) {
        this._spacesInObjectEntries = z;
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void indentArraysWith(C14679a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._arrayIndenter = aVar;
    }

    public void indentObjectsWith(C14679a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._objectIndenter = aVar;
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        jsonGenerator.mo37099a(',');
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        jsonGenerator.mo37099a(',');
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.mo37100a(" : ");
        } else {
            jsonGenerator.mo37099a(':');
        }
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        if (this._rootSeparator != null) {
            jsonGenerator.mo37102b(this._rootSeparator);
        }
    }

    public DefaultPrettyPrinter(C14670f fVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = Lf2SpacesIndenter.instance;
        this._spacesInObjectEntries = true;
        this._rootSeparator = fVar;
    }

    public DefaultPrettyPrinter withRootSeparator(C14670f fVar) {
        if (this._rootSeparator == fVar || (fVar != null && fVar.equals(this._rootSeparator))) {
            return this;
        }
        return new DefaultPrettyPrinter(this, fVar);
    }

    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.mo37099a('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException, JsonGenerationException {
        jsonGenerator.mo37099a('{');
        if (!this._objectIndenter.isInline()) {
            this._nesting++;
        }
    }

    public DefaultPrettyPrinter(String str) {
        C14670f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = new SerializedString(str);
        }
        this(fVar);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, C14670f fVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = Lf2SpacesIndenter.instance;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._rootSeparator = fVar;
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException, JsonGenerationException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo37099a(' ');
        }
        jsonGenerator.mo37099a(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException, JsonGenerationException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo37099a(' ');
        }
        jsonGenerator.mo37099a('}');
    }
}
