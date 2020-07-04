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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HonorLevel */
public final class HonorLevel extends Message<HonorLevel, Builder> {
    public static final DefaultValueProtoAdapter<HonorLevel> ADAPTER = new ProtoAdapter_HonorLevel();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String schema;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HonorLevel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HonorLevel, Builder> {
        public String schema;

        public final HonorLevel build() {
            return new HonorLevel(this.schema, super.buildUnknownFields());
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HonorLevel$ProtoAdapter_HonorLevel */
    static final class ProtoAdapter_HonorLevel extends DefaultValueProtoAdapter<HonorLevel> {
        public final HonorLevel redact(HonorLevel honorLevel) {
            return honorLevel;
        }

        public ProtoAdapter_HonorLevel() {
            super(FieldEncoding.LENGTH_DELIMITED, HonorLevel.class);
        }

        public final HonorLevel decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (HonorLevel) null);
        }

        public final int encodedSize(HonorLevel honorLevel) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, honorLevel.schema) + honorLevel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, HonorLevel honorLevel) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, honorLevel.schema);
            protoWriter.writeBytes(honorLevel.unknownFields());
        }

        public final HonorLevel decode(ProtoReader protoReader, HonorLevel honorLevel) throws IOException {
            Builder builder;
            HonorLevel honorLevel2 = (HonorLevel) C10938a.m32097a().mo26425a(HonorLevel.class, honorLevel);
            if (honorLevel2 != null) {
                builder = honorLevel2.newBuilder();
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
                        if (honorLevel2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getSchema() throws NullValueException {
        if (this.schema != null) {
            return this.schema;
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
        if (this.schema != null) {
            i = this.schema.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        StringBuilder replace = sb.replace(0, 2, "HonorLevel{");
        replace.append('}');
        return replace.toString();
    }

    public HonorLevel(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HonorLevel)) {
            return false;
        }
        HonorLevel honorLevel = (HonorLevel) obj;
        if (!unknownFields().equals(honorLevel.unknownFields()) || !Internal.equals(this.schema, honorLevel.schema)) {
            return false;
        }
        return true;
    }

    public HonorLevel(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
    }
}
