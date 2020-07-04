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

/* renamed from: com.bytedance.im.core.proto.ConversationsListRequestBody */
public final class ConversationsListRequestBody extends Message<ConversationsListRequestBody, Builder> {
    public static final ProtoAdapter<ConversationsListRequestBody> ADAPTER = new ProtoAdapter_ConversationsListRequestBody();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final ConversationsListPolicy DEFAULT_POLICY = ConversationsListPolicy.ALL;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long cursor;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationsListPolicy#ADAPTER", tag = 2)
    public final ConversationsListPolicy policy;

    /* renamed from: com.bytedance.im.core.proto.ConversationsListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationsListRequestBody, Builder> {
        public Long cursor;
        public ConversationsListPolicy policy;

        public final ConversationsListRequestBody build() {
            return new ConversationsListRequestBody(this.cursor, this.policy, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder policy(ConversationsListPolicy conversationsListPolicy) {
            this.policy = conversationsListPolicy;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationsListRequestBody$ProtoAdapter_ConversationsListRequestBody */
    static final class ProtoAdapter_ConversationsListRequestBody extends ProtoAdapter<ConversationsListRequestBody> {
        public ProtoAdapter_ConversationsListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationsListRequestBody.class);
        }

        public final ConversationsListRequestBody redact(ConversationsListRequestBody conversationsListRequestBody) {
            Builder newBuilder = conversationsListRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationsListRequestBody conversationsListRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsListRequestBody.cursor) + ConversationsListPolicy.ADAPTER.encodedSizeWithTag(2, conversationsListRequestBody.policy) + conversationsListRequestBody.unknownFields().size();
        }

        public final ConversationsListRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.policy((ConversationsListPolicy) ConversationsListPolicy.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationsListRequestBody conversationsListRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsListRequestBody.cursor);
            ConversationsListPolicy.ADAPTER.encodeWithTag(protoWriter, 2, conversationsListRequestBody.policy);
            protoWriter.writeBytes(conversationsListRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.policy = this.policy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.cursor != null) {
            i = this.cursor.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.policy != null) {
            i3 = this.policy.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.policy != null) {
            sb.append(", policy=");
            sb.append(this.policy);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationsListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationsListRequestBody)) {
            return false;
        }
        ConversationsListRequestBody conversationsListRequestBody = (ConversationsListRequestBody) obj;
        if (!unknownFields().equals(conversationsListRequestBody.unknownFields()) || !Internal.equals(this.cursor, conversationsListRequestBody.cursor) || !Internal.equals(this.policy, conversationsListRequestBody.policy)) {
            return false;
        }
        return true;
    }

    public ConversationsListRequestBody(Long l, ConversationsListPolicy conversationsListPolicy) {
        this(l, conversationsListPolicy, ByteString.EMPTY);
    }

    public ConversationsListRequestBody(Long l, ConversationsListPolicy conversationsListPolicy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.policy = conversationsListPolicy;
    }
}
