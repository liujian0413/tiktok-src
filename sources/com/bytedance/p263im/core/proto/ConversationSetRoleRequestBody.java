package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationSetRoleRequestBody */
public final class ConversationSetRoleRequestBody extends Message<ConversationSetRoleRequestBody, Builder> {
    public static final ProtoAdapter<ConversationSetRoleRequestBody> ADAPTER = new ProtoAdapter_ConversationSetRoleRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", keyAdapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Map<Long, Integer> roles;

    /* renamed from: com.bytedance.im.core.proto.ConversationSetRoleRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationSetRoleRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<Long, Integer> roles = Internal.newMutableMap();

        public final ConversationSetRoleRequestBody build() {
            ConversationSetRoleRequestBody conversationSetRoleRequestBody = new ConversationSetRoleRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.roles, super.buildUnknownFields());
            return conversationSetRoleRequestBody;
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

        public final Builder roles(Map<Long, Integer> map) {
            Internal.checkElementsNotNull(map);
            this.roles = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationSetRoleRequestBody$ProtoAdapter_ConversationSetRoleRequestBody */
    static final class ProtoAdapter_ConversationSetRoleRequestBody extends ProtoAdapter<ConversationSetRoleRequestBody> {
        private final ProtoAdapter<Map<Long, Integer>> roles = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, ProtoAdapter.INT32);

        public ProtoAdapter_ConversationSetRoleRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationSetRoleRequestBody.class);
        }

        public final ConversationSetRoleRequestBody redact(ConversationSetRoleRequestBody conversationSetRoleRequestBody) {
            Builder newBuilder = conversationSetRoleRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationSetRoleRequestBody conversationSetRoleRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationSetRoleRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationSetRoleRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationSetRoleRequestBody.conversation_type) + this.roles.encodedSizeWithTag(4, conversationSetRoleRequestBody.roles) + conversationSetRoleRequestBody.unknownFields().size();
        }

        public final ConversationSetRoleRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.roles.putAll((Map) this.roles.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationSetRoleRequestBody conversationSetRoleRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationSetRoleRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationSetRoleRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationSetRoleRequestBody.conversation_type);
            this.roles.encodeWithTag(protoWriter, 4, conversationSetRoleRequestBody.roles);
            protoWriter.writeBytes(conversationSetRoleRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.roles = Internal.copyOf("roles", this.roles);
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
        int hashCode2 = ((i6 + i4) * 37) + this.roles.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
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
        if (!this.roles.isEmpty()) {
            sb.append(", roles=");
            sb.append(this.roles);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationSetRoleRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationSetRoleRequestBody)) {
            return false;
        }
        ConversationSetRoleRequestBody conversationSetRoleRequestBody = (ConversationSetRoleRequestBody) obj;
        if (!unknownFields().equals(conversationSetRoleRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, conversationSetRoleRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, conversationSetRoleRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, conversationSetRoleRequestBody.conversation_type) || !this.roles.equals(conversationSetRoleRequestBody.roles)) {
            return false;
        }
        return true;
    }

    public ConversationSetRoleRequestBody(String str, Long l, Integer num, Map<Long, Integer> map) {
        this(str, l, num, map, ByteString.EMPTY);
    }

    public ConversationSetRoleRequestBody(String str, Long l, Integer num, Map<Long, Integer> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.roles = Internal.immutableCopyOf("roles", map);
    }
}
