package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString */
public final class JsonStubWillConvertToString extends Message<JsonStubWillConvertToString, Builder> {
    public static final DefaultValueProtoAdapter<JsonStubWillConvertToString> ADAPTER = new ProtoAdapter_JsonStubWillConvertToString();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String jsonobj_convert_string;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<JsonStubWillConvertToString, Builder> {
        public String jsonobj_convert_string;

        public final JsonStubWillConvertToString build() {
            return new JsonStubWillConvertToString(this.jsonobj_convert_string, super.buildUnknownFields());
        }

        public final Builder jsonobj_convert_string(String str) {
            this.jsonobj_convert_string = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString$ProtoAdapter_JsonStubWillConvertToString */
    static final class ProtoAdapter_JsonStubWillConvertToString extends DefaultValueProtoAdapter<JsonStubWillConvertToString> {
        public final JsonStubWillConvertToString redact(JsonStubWillConvertToString jsonStubWillConvertToString) {
            return jsonStubWillConvertToString;
        }

        public ProtoAdapter_JsonStubWillConvertToString() {
            super(FieldEncoding.LENGTH_DELIMITED, JsonStubWillConvertToString.class);
        }

        public final JsonStubWillConvertToString decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (JsonStubWillConvertToString) null);
        }

        public final int encodedSize(JsonStubWillConvertToString jsonStubWillConvertToString) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, jsonStubWillConvertToString.jsonobj_convert_string) + jsonStubWillConvertToString.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, JsonStubWillConvertToString jsonStubWillConvertToString) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, jsonStubWillConvertToString.jsonobj_convert_string);
            protoWriter.writeBytes(jsonStubWillConvertToString.unknownFields());
        }

        public final JsonStubWillConvertToString decode(ProtoReader protoReader, JsonStubWillConvertToString jsonStubWillConvertToString) throws IOException {
            Builder builder;
            JsonStubWillConvertToString jsonStubWillConvertToString2 = (JsonStubWillConvertToString) C10938a.m32097a().mo26425a(JsonStubWillConvertToString.class, jsonStubWillConvertToString);
            if (jsonStubWillConvertToString2 != null) {
                builder = jsonStubWillConvertToString2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (jsonStubWillConvertToString2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.jsonobj_convert_string((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getJsonobjConvertString() throws NullValueException {
        if (this.jsonobj_convert_string != null) {
            return this.jsonobj_convert_string;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.jsonobj_convert_string != null) {
            i = this.jsonobj_convert_string.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.jsonobj_convert_string = this.jsonobj_convert_string;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.jsonobj_convert_string != null) {
            sb.append(", jsonobj_convert_string=");
            sb.append(this.jsonobj_convert_string);
        }
        StringBuilder replace = sb.replace(0, 2, "JsonStubWillConvertToString{");
        replace.append('}');
        return replace.toString();
    }

    public JsonStubWillConvertToString(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JsonStubWillConvertToString)) {
            return false;
        }
        JsonStubWillConvertToString jsonStubWillConvertToString = (JsonStubWillConvertToString) obj;
        if (!unknownFields().equals(jsonStubWillConvertToString.unknownFields()) || !Internal.equals(this.jsonobj_convert_string, jsonStubWillConvertToString.jsonobj_convert_string)) {
            return false;
        }
        return true;
    }

    public JsonStubWillConvertToString(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.jsonobj_convert_string = str;
    }
}
