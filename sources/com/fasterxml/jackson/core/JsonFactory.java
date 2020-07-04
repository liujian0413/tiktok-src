package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.C14671a;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p735b.C14651a;
import com.fasterxml.jackson.core.p735b.C14653b;
import com.fasterxml.jackson.core.p735b.C14657f;
import com.fasterxml.jackson.core.p735b.C14658g;
import com.fasterxml.jackson.core.p735b.C14660i;
import com.fasterxml.jackson.core.p736c.C14662a;
import com.fasterxml.jackson.core.p736c.C14665b;
import com.fasterxml.jackson.core.p737io.C14674c;
import com.fasterxml.jackson.core.p737io.C14678g;
import com.fasterxml.jackson.core.p737io.CharacterEscapes;
import com.fasterxml.jackson.core.p737io.InputDecorator;
import com.fasterxml.jackson.core.p737io.OutputDecorator;
import com.fasterxml.jackson.core.p737io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;

public class JsonFactory implements Serializable {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonParser.Feature.collectDefaults();
    private static final C14670f DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef = new ThreadLocal<>();
    private static final long serialVersionUID = 8726401676402117450L;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected C14668d _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient C14662a _rootByteSymbols;
    protected final transient C14665b _rootCharSymbols;
    protected C14670f _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true);
        
        private final boolean _defaultState;

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final int getMask() {
            return 1 << ordinal();
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

        public final boolean enabledIn(int i) {
            if ((i & getMask()) != 0) {
                return true;
            }
            return false;
        }

        private Feature(boolean z) {
            this._defaultState = z;
        }
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public C14668d getCodec() {
        return this._objectCodec;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public JsonFactory() {
        this(null);
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new JsonFactory(this._objectCodec);
    }

    public Version version() {
        return C14653b.f37835a.f37985b;
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(null);
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return "JSON";
        }
        return null;
    }

    public String getRootValueSeparator() {
        if (this._rootValueSeparator == null) {
            return null;
        }
        return this._rootValueSeparator.getValue();
    }

    public BufferRecycler _getBufferRecycler() {
        BufferRecycler bufferRecycler;
        SoftReference softReference = (SoftReference) _recyclerRef.get();
        if (softReference == null) {
            bufferRecycler = null;
        } else {
            bufferRecycler = (BufferRecycler) softReference.get();
        }
        if (bufferRecycler != null) {
            return bufferRecycler;
        }
        BufferRecycler bufferRecycler2 = new BufferRecycler();
        _recyclerRef.set(new SoftReference(bufferRecycler2));
        return bufferRecycler2;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(C14668d dVar) {
        this._objectCodec = dVar;
        return this;
    }

    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createJsonGenerator(outputStream, JsonEncoding.UTF8);
    }

    public JsonParser createParser(File file) throws IOException, JsonParseException {
        return createJsonParser(file);
    }

    /* access modifiers changed from: protected */
    public MatchStrength hasJSONFormat(C14671a aVar) throws IOException {
        return C14651a.m42369a(aVar);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createJsonGenerator(outputStream);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException, JsonParseException {
        return createJsonParser(inputStream);
    }

    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (feature.getMask() ^ -1) & this._factoryFeatures;
        return this;
    }

    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public MatchStrength hasFormat(C14671a aVar) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(aVar);
        }
        return null;
    }

    public final boolean isEnabled(Feature feature) {
        if ((feature.getMask() & this._factoryFeatures) != 0) {
            return true;
        }
        return false;
    }

    public JsonFactory setRootValueSeparator(String str) {
        C14670f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = new SerializedString(str);
        }
        this._rootValueSeparator = fVar;
        return this;
    }

    public boolean canUseSchema(C14650b bVar) {
        String formatName = getFormatName();
        if (formatName == null || !formatName.equals(bVar.mo37143a())) {
            return false;
        }
        return true;
    }

    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        C14674c _createContext = _createContext(writer, false);
        if (this._outputDecorator != null) {
            writer = this._outputDecorator.decorate(_createContext, writer);
        }
        return _createGenerator(writer, _createContext);
    }

    public JsonParser createJsonParser(File file) throws IOException, JsonParseException {
        C14674c _createContext = _createContext(file, true);
        InputStream fileInputStream = new FileInputStream(file);
        if (this._inputDecorator != null) {
            fileInputStream = this._inputDecorator.decorate(_createContext, fileInputStream);
        }
        return _createParser(fileInputStream, _createContext);
    }

    public JsonParser createParser(Reader reader) throws IOException, JsonParseException {
        return createJsonParser(reader);
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        if ((feature.getMask() & this._generatorFeatures) != 0) {
            return true;
        }
        return false;
    }

    public JsonFactory(C14668d dVar) {
        this._rootCharSymbols = C14665b.m42423a();
        this._rootByteSymbols = C14662a.m42417a();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = dVar;
    }

    /* access modifiers changed from: protected */
    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            StringBuilder sb = new StringBuilder("Failed copy(): ");
            sb.append(getClass().getName());
            sb.append(" (version: ");
            sb.append(version());
            sb.append(") does not override copy(); it has to");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public InputStream _optimizedStreamFromURL(URL url) throws IOException {
        if ("file".equals(url.getProtocol())) {
            String host = url.getHost();
            if (host == null || host.length() == 0) {
                if (url.getPath().indexOf(37) < 0) {
                    return new FileInputStream(url.getPath());
                }
                return new FileInputStream(url.getPath());
            }
        }
        return url.openStream();
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        return createJsonGenerator(writer);
    }

    public JsonParser createJsonParser(InputStream inputStream) throws IOException, JsonParseException {
        C14674c _createContext = _createContext(inputStream, false);
        if (this._inputDecorator != null) {
            inputStream = this._inputDecorator.decorate(_createContext, inputStream);
        }
        return _createParser(inputStream, _createContext);
    }

    public JsonParser createParser(String str) throws IOException, JsonParseException {
        return createJsonParser(str);
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = (feature.getMask() ^ -1) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        if ((feature.getMask() & this._parserFeatures) != 0) {
            return true;
        }
        return false;
    }

    public JsonParser createJsonParser(Reader reader) throws IOException, JsonParseException {
        C14674c _createContext = _createContext(reader, false);
        if (this._inputDecorator != null) {
            reader = this._inputDecorator.decorate(_createContext, reader);
        }
        return _createParser(reader, _createContext);
    }

    public JsonParser createParser(URL url) throws IOException, JsonParseException {
        return createJsonParser(url);
    }

    public JsonParser createJsonParser(String str) throws IOException, JsonParseException {
        Reader stringReader = new StringReader(str);
        C14674c _createContext = _createContext(stringReader, true);
        if (this._inputDecorator != null) {
            stringReader = this._inputDecorator.decorate(_createContext, stringReader);
        }
        return _createParser(stringReader, _createContext);
    }

    public JsonParser createParser(byte[] bArr) throws IOException, JsonParseException {
        return createJsonParser(bArr);
    }

    public JsonParser createJsonParser(URL url) throws IOException, JsonParseException {
        C14674c _createContext = _createContext(url, true);
        InputStream _optimizedStreamFromURL = _optimizedStreamFromURL(url);
        if (this._inputDecorator != null) {
            _optimizedStreamFromURL = this._inputDecorator.decorate(_createContext, _optimizedStreamFromURL);
        }
        return _createParser(_optimizedStreamFromURL, _createContext);
    }

    public JsonParser createJsonParser(byte[] bArr) throws IOException, JsonParseException {
        C14674c _createContext = _createContext(bArr, true);
        if (this._inputDecorator != null) {
            InputStream decorate = this._inputDecorator.decorate(_createContext, bArr, 0, bArr.length);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, 0, bArr.length, _createContext);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createGenerator(Writer writer, C14674c cVar) throws IOException {
        return _createJsonGenerator(writer, cVar);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(InputStream inputStream, C14674c cVar) throws IOException, JsonParseException {
        return _createJsonParser(inputStream, cVar);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createUTF8Generator(OutputStream outputStream, C14674c cVar) throws IOException {
        return _createUTF8JsonGenerator(outputStream, cVar);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        return createJsonGenerator(file, jsonEncoding);
    }

    /* access modifiers changed from: protected */
    public C14674c _createContext(Object obj, boolean z) {
        return new C14674c(_getBufferRecycler(), obj, z);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(Reader reader, C14674c cVar) throws IOException, JsonParseException {
        return _createJsonParser(reader, cVar);
    }

    public final JsonFactory configure(Feature feature, boolean z) {
        if (z) {
            return enable(feature);
        }
        return disable(feature);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createJsonGenerator(Writer writer, C14674c cVar) throws IOException {
        C14660i iVar = new C14660i(cVar, this._generatorFeatures, this._objectCodec, writer);
        if (this._characterEscapes != null) {
            iVar.mo37098a(this._characterEscapes);
        }
        C14670f fVar = this._rootValueSeparator;
        if (fVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            iVar.mo37097a(fVar);
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createJsonParser(InputStream inputStream, C14674c cVar) throws IOException, JsonParseException {
        return new C14651a(cVar, inputStream).mo37144a(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createUTF8JsonGenerator(OutputStream outputStream, C14674c cVar) throws IOException {
        C14658g gVar = new C14658g(cVar, this._generatorFeatures, this._objectCodec, outputStream);
        if (this._characterEscapes != null) {
            gVar.mo37098a(this._characterEscapes);
        }
        C14670f fVar = this._rootValueSeparator;
        if (fVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            gVar.mo37097a(fVar);
        }
        return gVar;
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonGenerator.Feature feature, boolean z) {
        if (z) {
            return enable(feature);
        }
        return disable(feature);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createJsonGenerator(outputStream, jsonEncoding);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createJsonParser(Reader reader, C14674c cVar) throws IOException, JsonParseException {
        C14657f fVar = new C14657f(cVar, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.mo37158a(isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES)));
        return fVar;
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonParser.Feature feature, boolean z) {
        if (z) {
            return enable(feature);
        }
        return disable(feature);
    }

    public JsonGenerator createJsonGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        C14674c _createContext = _createContext(fileOutputStream, true);
        _createContext.f37934b = jsonEncoding;
        if (jsonEncoding == JsonEncoding.UTF8) {
            if (this._outputDecorator != null) {
                fileOutputStream = this._outputDecorator.decorate(_createContext, fileOutputStream);
            }
            return _createUTF8JsonGenerator(fileOutputStream, _createContext);
        }
        Writer _createWriter = _createWriter(fileOutputStream, jsonEncoding, _createContext);
        if (this._outputDecorator != null) {
            _createWriter = this._outputDecorator.decorate(_createContext, _createWriter);
        }
        return _createGenerator(_createWriter, _createContext);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        C14674c _createContext = _createContext(outputStream, false);
        _createContext.f37934b = jsonEncoding;
        if (jsonEncoding == JsonEncoding.UTF8) {
            if (this._outputDecorator != null) {
                outputStream = this._outputDecorator.decorate(_createContext, outputStream);
            }
            return _createUTF8JsonGenerator(outputStream, _createContext);
        }
        Writer _createWriter = _createWriter(outputStream, jsonEncoding, _createContext);
        if (this._outputDecorator != null) {
            _createWriter = this._outputDecorator.decorate(_createContext, _createWriter);
        }
        return _createGenerator(_createWriter, _createContext);
    }

    /* access modifiers changed from: protected */
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, C14674c cVar) throws IOException {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new C14678g(cVar, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        return createJsonParser(bArr, i, i2);
    }

    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        C14674c _createContext = _createContext(bArr, true);
        if (this._inputDecorator != null) {
            InputStream decorate = this._inputDecorator.decorate(_createContext, bArr, i, i2);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, i, i2, _createContext);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(byte[] bArr, int i, int i2, C14674c cVar) throws IOException, JsonParseException {
        return _createJsonParser(bArr, i, i2, cVar);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createJsonParser(byte[] bArr, int i, int i2, C14674c cVar) throws IOException, JsonParseException {
        return new C14651a(cVar, bArr, i, i2).mo37144a(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }
}
