package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody */
public final class GetConversationCoreInfoRequestBody extends Message<GetConversationCoreInfoRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationCoreInfoRequestBody> ADAPTER = new ProtoAdapter_GetConversationCoreInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationCoreInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        public final GetConversationCoreInfoRequestBody build() {
            return new GetConversationCoreInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody$ProtoAdapter_GetConversationCoreInfoRequestBody */
    static final class ProtoAdapter_GetConversationCoreInfoRequestBody extends ProtoAdapter<GetConversationCoreInfoRequestBody> {
        public ProtoAdapter_GetConversationCoreInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationCoreInfoRequestBody.class);
        }

        public final GetConversationCoreInfoRequestBody redact(GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) {
            Builder newBuilder = getConversationCoreInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getConversationCoreInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationCoreInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, getConversationCoreInfoRequestBody.conversation_type) + getConversationCoreInfoRequestBody.unknownFields().size();
        }

        public final GetConversationCoreInfoRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
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

        public final void encode(ProtoWriter protoWriter, GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConversationCoreInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationCoreInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getConversationCoreInfoRequestBody.conversation_type);
            protoWriter.writeBytes(getConversationCoreInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.conversation_type != null) {
            i4 = this.conversation_type.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationCoreInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationCoreInfoRequestBody)) {
            return false;
        }
        GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody = (GetConversationCoreInfoRequestBody) obj;
        if (!unknownFields().equals(getConversationCoreInfoRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, getConversationCoreInfoRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, getConversationCoreInfoRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, getConversationCoreInfoRequestBody.conversation_type)) {
            return false;
        }
        return true;
    }

    public GetConversationCoreInfoRequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public GetConversationCoreInfoRequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
