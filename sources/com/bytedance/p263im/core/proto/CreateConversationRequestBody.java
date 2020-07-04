package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.CreateConversationRequestBody */
public final class CreateConversationRequestBody extends Message<CreateConversationRequestBody, Builder> {
    public static final ProtoAdapter<CreateConversationRequestBody> ADAPTER = new ProtoAdapter_CreateConversationRequestBody();
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 2)
    public final List<Long> participants;

    /* renamed from: com.bytedance.im.core.proto.CreateConversationRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CreateConversationRequestBody, Builder> {
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();

        public final CreateConversationRequestBody build() {
            return new CreateConversationRequestBody(this.conversation_type, this.participants, super.buildUnknownFields());
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.CreateConversationRequestBody$ProtoAdapter_CreateConversationRequestBody */
    static final class ProtoAdapter_CreateConversationRequestBody extends ProtoAdapter<CreateConversationRequestBody> {
        public ProtoAdapter_CreateConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateConversationRequestBody.class);
        }

        public final CreateConversationRequestBody redact(CreateConversationRequestBody createConversationRequestBody) {
            Builder newBuilder = createConversationRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(CreateConversationRequestBody createConversationRequestBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, createConversationRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, createConversationRequestBody.participants) + createConversationRequestBody.unknownFields().size();
        }

        public final CreateConversationRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CreateConversationRequestBody createConversationRequestBody) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, createConversationRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, createConversationRequestBody.participants);
            protoWriter.writeBytes(createConversationRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
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
        if (this.conversation_type != null) {
            i = this.conversation_type.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = ((hashCode + i) * 37) + this.participants.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateConversationRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateConversationRequestBody)) {
            return false;
        }
        CreateConversationRequestBody createConversationRequestBody = (CreateConversationRequestBody) obj;
        if (!unknownFields().equals(createConversationRequestBody.unknownFields()) || !Internal.equals(this.conversation_type, createConversationRequestBody.conversation_type) || !this.participants.equals(createConversationRequestBody.participants)) {
            return false;
        }
        return true;
    }

    public CreateConversationRequestBody(Integer num, List<Long> list) {
        this(num, list, ByteString.EMPTY);
    }

    public CreateConversationRequestBody(Integer num, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
