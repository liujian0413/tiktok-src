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

/* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsResponseBody */
public final class MgetConversationParticipantsResponseBody extends Message<MgetConversationParticipantsResponseBody, Builder> {
    public static final ProtoAdapter<MgetConversationParticipantsResponseBody> ADAPTER = new ProtoAdapter_MgetConversationParticipantsResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.Participant#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<Participant> participants;

    /* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MgetConversationParticipantsResponseBody, Builder> {
        public List<Participant> participants = Internal.newMutableList();

        public final MgetConversationParticipantsResponseBody build() {
            return new MgetConversationParticipantsResponseBody(this.participants, super.buildUnknownFields());
        }

        public final Builder participants(List<Participant> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsResponseBody$ProtoAdapter_MgetConversationParticipantsResponseBody */
    static final class ProtoAdapter_MgetConversationParticipantsResponseBody extends ProtoAdapter<MgetConversationParticipantsResponseBody> {
        public ProtoAdapter_MgetConversationParticipantsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MgetConversationParticipantsResponseBody.class);
        }

        public final int encodedSize(MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody) {
            return Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, mgetConversationParticipantsResponseBody.participants) + mgetConversationParticipantsResponseBody.unknownFields().size();
        }

        public final MgetConversationParticipantsResponseBody redact(MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody) {
            Builder newBuilder = mgetConversationParticipantsResponseBody.newBuilder();
            Internal.redactElements(newBuilder.participants, Participant.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MgetConversationParticipantsResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.participants.add(Participant.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody) throws IOException {
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mgetConversationParticipantsResponseBody.participants);
            protoWriter.writeBytes(mgetConversationParticipantsResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.participants.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "MgetConversationParticipantsResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public MgetConversationParticipantsResponseBody(List<Participant> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MgetConversationParticipantsResponseBody)) {
            return false;
        }
        MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody = (MgetConversationParticipantsResponseBody) obj;
        if (!unknownFields().equals(mgetConversationParticipantsResponseBody.unknownFields()) || !this.participants.equals(mgetConversationParticipantsResponseBody.participants)) {
            return false;
        }
        return true;
    }

    public MgetConversationParticipantsResponseBody(List<Participant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
