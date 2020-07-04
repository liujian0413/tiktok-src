package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p737io.CharacterEscapes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class JsonGenerator implements Closeable, Flushable {

    /* renamed from: a */
    protected C14669e f37796a;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        FLUSH_PASSED_TO_STREAM(true),
        ESCAPE_NON_ASCII(false);
        
        private final boolean _defaultState;
        private final int _mask;

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final int getMask() {
            return this._mask;
        }

        public static int collectDefaults() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        private Feature(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }
    }

    protected JsonGenerator() {
    }

    /* renamed from: a */
    public JsonGenerator mo37096a(int i) {
        return this;
    }

    /* renamed from: a */
    public JsonGenerator mo37098a(CharacterEscapes characterEscapes) {
        return this;
    }

    /* renamed from: a */
    public abstract void mo37099a(char c) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo37100a(String str) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public abstract void mo37101a(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: a */
    public JsonGenerator mo37097a(C14670f fVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo37102b(C14670f fVar) throws IOException, JsonGenerationException {
        mo37100a(fVar.getValue());
    }
}
