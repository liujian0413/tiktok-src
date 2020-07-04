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

/* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody */
public final class GetConversationParticipantsReadIndexV3RequestBody extends Message<GetConversationParticipantsReadIndexV3RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationParticipantsReadIndexV3RequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        public final GetConversationParticipantsReadIndexV3RequestBody build() {
            return new GetConversationParticipantsReadIndexV3RequestBody(this.conversation_short_id, this.conversation_type, this.conversation_id, super.buildUnknownFields());
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

    /* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody$ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody */
    static final class ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody extends ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> {
        public ProtoAdapter_GetConversationParticipantsReadIndexV3RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsReadIndexV3RequestBody.class);
        }

        public final GetConversationParticipantsReadIndexV3RequestBody redact(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            Builder newBuilder = getConversationParticipantsReadIndexV3RequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsReadIndexV3RequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsReadIndexV3RequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsReadIndexV3RequestBody.conversation_id) + getConversationParticipantsReadIndexV3RequestBody.unknownFields().size();
        }

        public final GetConversationParticipantsReadIndexV3RequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3RequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsReadIndexV3RequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsReadIndexV3RequestBody.conversation_id);
            protoWriter.writeBytes(getConversationParticipantsReadIndexV3RequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_id = this.conversation_id;
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
        if (this.conversation_short_id != null) {
            i = this.conversation_short_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.conversation_id != null) {
            i4 = this.conversation_id.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationParticipantsReadIndexV3RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationParticipantsReadIndexV3RequestBody)) {
            return false;
        }
        GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody = (GetConversationParticipantsReadIndexV3RequestBody) obj;
        if (!unknownFields().equals(getConversationParticipantsReadIndexV3RequestBody.unknownFields()) || !Internal.equals(this.conversation_short_id, getConversationParticipantsReadIndexV3RequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, getConversationParticipantsReadIndexV3RequestBody.conversation_type) || !Internal.equals(this.conversation_id, getConversationParticipantsReadIndexV3RequestBody.conversation_id)) {
            return false;
        }
        return true;
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l, Integer num, String str) {
        this(l, num, str, ByteString.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
    }
}
