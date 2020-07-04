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

/* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListRequestBody */
public final class ConversationParticipantsListRequestBody extends Message<ConversationParticipantsListRequestBody, Builder> {
    public static final ProtoAdapter<ConversationParticipantsListRequestBody> ADAPTER = new ProtoAdapter_ConversationParticipantsListRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final Integer DEFAULT_LIMIT = Integer.valueOf(100);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer limit;

    /* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationParticipantsListRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long cursor;
        public Integer limit;

        public final ConversationParticipantsListRequestBody build() {
            ConversationParticipantsListRequestBody conversationParticipantsListRequestBody = new ConversationParticipantsListRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.cursor, this.limit, super.buildUnknownFields());
            return conversationParticipantsListRequestBody;
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

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$ProtoAdapter_ConversationParticipantsListRequestBody */
    static final class ProtoAdapter_ConversationParticipantsListRequestBody extends ProtoAdapter<ConversationParticipantsListRequestBody> {
        public ProtoAdapter_ConversationParticipantsListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantsListRequestBody.class);
        }

        public final ConversationParticipantsListRequestBody redact(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            Builder newBuilder = conversationParticipantsListRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantsListRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationParticipantsListRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationParticipantsListRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationParticipantsListRequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(5, conversationParticipantsListRequestBody.limit) + conversationParticipantsListRequestBody.unknownFields().size();
        }

        public final ConversationParticipantsListRequestBody decode(ProtoReader protoReader) throws IOException {
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
                        case 4:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.limit((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantsListRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationParticipantsListRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationParticipantsListRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationParticipantsListRequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, conversationParticipantsListRequestBody.limit);
            protoWriter.writeBytes(conversationParticipantsListRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.conversation_type != null) {
            i3 = this.conversation_type.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.cursor != null) {
            i4 = this.cursor.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.limit != null) {
            i6 = this.limit.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
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
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationParticipantsListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationParticipantsListRequestBody)) {
            return false;
        }
        ConversationParticipantsListRequestBody conversationParticipantsListRequestBody = (ConversationParticipantsListRequestBody) obj;
        if (!unknownFields().equals(conversationParticipantsListRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, conversationParticipantsListRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, conversationParticipantsListRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, conversationParticipantsListRequestBody.conversation_type) || !Internal.equals(this.cursor, conversationParticipantsListRequestBody.cursor) || !Internal.equals(this.limit, conversationParticipantsListRequestBody.limit)) {
            return false;
        }
        return true;
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2) {
        this(str, l, num, l2, num2, ByteString.EMPTY);
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.cursor = l2;
        this.limit = num2;
    }
}
