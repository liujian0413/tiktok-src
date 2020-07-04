package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody */
public final class ModifyMessagePropertyResponseBody extends Message<ModifyMessagePropertyResponseBody, Builder> {
    public static final ProtoAdapter<ModifyMessagePropertyResponseBody> ADAPTER = new ProtoAdapter_ModifyMessagePropertyResponseBody();
    public static final ModifyMessagePropertyStatus DEFAULT_STATUS = ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ModifyMessagePropertyStatus#ADAPTER", tag = 1)
    public final ModifyMessagePropertyStatus status;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyMessagePropertyResponseBody, Builder> {
        public ModifyMessagePropertyStatus status;

        public final ModifyMessagePropertyResponseBody build() {
            return new ModifyMessagePropertyResponseBody(this.status, super.buildUnknownFields());
        }

        public final Builder status(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
            this.status = modifyMessagePropertyStatus;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$ProtoAdapter_ModifyMessagePropertyResponseBody */
    static final class ProtoAdapter_ModifyMessagePropertyResponseBody extends ProtoAdapter<ModifyMessagePropertyResponseBody> {
        public ProtoAdapter_ModifyMessagePropertyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyResponseBody.class);
        }

        public final ModifyMessagePropertyResponseBody redact(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            Builder newBuilder = modifyMessagePropertyResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            return ModifyMessagePropertyStatus.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyResponseBody.status) + modifyMessagePropertyResponseBody.unknownFields().size();
        }

        public final ModifyMessagePropertyResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.status((ModifyMessagePropertyStatus) ModifyMessagePropertyStatus.ADAPTER.decode(protoReader));
                    } catch (EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) throws IOException {
            ModifyMessagePropertyStatus.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyResponseBody.status);
            protoWriter.writeBytes(modifyMessagePropertyResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.status != null) {
            i = this.status.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyMessagePropertyResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        this(modifyMessagePropertyStatus, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModifyMessagePropertyResponseBody)) {
            return false;
        }
        ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody = (ModifyMessagePropertyResponseBody) obj;
        if (!unknownFields().equals(modifyMessagePropertyResponseBody.unknownFields()) || !Internal.equals(this.status, modifyMessagePropertyResponseBody.status)) {
            return false;
        }
        return true;
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = modifyMessagePropertyStatus;
    }
}
