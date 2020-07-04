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

/* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsRequestBody */
public final class MgetConversationParticipantsRequestBody extends Message<MgetConversationParticipantsRequestBody, Builder> {
    public static final ProtoAdapter<MgetConversationParticipantsRequestBody> ADAPTER = new ProtoAdapter_MgetConversationParticipantsRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 4)
    public final List<Long> participants;

    /* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MgetConversationParticipantsRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();

        public final MgetConversationParticipantsRequestBody build() {
            MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody = new MgetConversationParticipantsRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.participants, super.buildUnknownFields());
            return mgetConversationParticipantsRequestBody;
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

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsRequestBody$ProtoAdapter_MgetConversationParticipantsRequestBody */
    static final class ProtoAdapter_MgetConversationParticipantsRequestBody extends ProtoAdapter<MgetConversationParticipantsRequestBody> {
        public ProtoAdapter_MgetConversationParticipantsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MgetConversationParticipantsRequestBody.class);
        }

        public final MgetConversationParticipantsRequestBody redact(MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) {
            Builder newBuilder = mgetConversationParticipantsRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mgetConversationParticipantsRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, mgetConversationParticipantsRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, mgetConversationParticipantsRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, mgetConversationParticipantsRequestBody.participants) + mgetConversationParticipantsRequestBody.unknownFields().size();
        }

        public final MgetConversationParticipantsRequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mgetConversationParticipantsRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mgetConversationParticipantsRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, mgetConversationParticipantsRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, mgetConversationParticipantsRequestBody.participants);
            protoWriter.writeBytes(mgetConversationParticipantsRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
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
        int hashCode2 = ((i6 + i4) * 37) + this.participants.hashCode();
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
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "MgetConversationParticipantsRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MgetConversationParticipantsRequestBody)) {
            return false;
        }
        MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody = (MgetConversationParticipantsRequestBody) obj;
        if (!unknownFields().equals(mgetConversationParticipantsRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, mgetConversationParticipantsRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, mgetConversationParticipantsRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, mgetConversationParticipantsRequestBody.conversation_type) || !this.participants.equals(mgetConversationParticipantsRequestBody.participants)) {
            return false;
        }
        return true;
    }

    public MgetConversationParticipantsRequestBody(String str, Long l, Integer num, List<Long> list) {
        this(str, l, num, list, ByteString.EMPTY);
    }

    public MgetConversationParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
