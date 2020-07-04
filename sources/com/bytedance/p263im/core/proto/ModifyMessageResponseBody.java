package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ModifyMessageResponseBody */
public final class ModifyMessageResponseBody extends Message<ModifyMessageResponseBody, Builder> {
    public static final ProtoAdapter<ModifyMessageResponseBody> ADAPTER = new ProtoAdapter_ModifyMessageResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessageResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyMessageResponseBody, Builder> {
        public final ModifyMessageResponseBody build() {
            return new ModifyMessageResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessageResponseBody$ProtoAdapter_ModifyMessageResponseBody */
    static final class ProtoAdapter_ModifyMessageResponseBody extends ProtoAdapter<ModifyMessageResponseBody> {
        public ProtoAdapter_ModifyMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessageResponseBody.class);
        }

        public final int encodedSize(ModifyMessageResponseBody modifyMessageResponseBody) {
            return modifyMessageResponseBody.unknownFields().size();
        }

        public final ModifyMessageResponseBody redact(ModifyMessageResponseBody modifyMessageResponseBody) {
            Builder newBuilder = modifyMessageResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ModifyMessageResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyMessageResponseBody modifyMessageResponseBody) throws IOException {
            protoWriter.writeBytes(modifyMessageResponseBody.unknownFields());
        }
    }

    public ModifyMessageResponseBody() {
        this(ByteString.EMPTY);
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "ModifyMessageResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof ModifyMessageResponseBody;
    }

    public ModifyMessageResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
