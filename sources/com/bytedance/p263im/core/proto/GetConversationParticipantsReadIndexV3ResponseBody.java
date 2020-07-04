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

/* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody */
public final class GetConversationParticipantsReadIndexV3ResponseBody extends Message<GetConversationParticipantsReadIndexV3ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ParticipantReadIndex#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<ParticipantReadIndex> indexes;

    /* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationParticipantsReadIndexV3ResponseBody, Builder> {
        public List<ParticipantReadIndex> indexes = Internal.newMutableList();

        public final GetConversationParticipantsReadIndexV3ResponseBody build() {
            return new GetConversationParticipantsReadIndexV3ResponseBody(this.indexes, super.buildUnknownFields());
        }

        public final Builder indexes(List<ParticipantReadIndex> list) {
            Internal.checkElementsNotNull(list);
            this.indexes = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody$ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody */
    static final class ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody extends ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> {
        public ProtoAdapter_GetConversationParticipantsReadIndexV3ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsReadIndexV3ResponseBody.class);
        }

        public final int encodedSize(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            return ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsReadIndexV3ResponseBody.indexes) + getConversationParticipantsReadIndexV3ResponseBody.unknownFields().size();
        }

        public final GetConversationParticipantsReadIndexV3ResponseBody redact(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            Builder newBuilder = getConversationParticipantsReadIndexV3ResponseBody.newBuilder();
            Internal.redactElements(newBuilder.indexes, ParticipantReadIndex.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationParticipantsReadIndexV3ResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.indexes.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) throws IOException {
            ParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3ResponseBody.indexes);
            protoWriter.writeBytes(getConversationParticipantsReadIndexV3ResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.indexes.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.indexes = Internal.copyOf("indexes", this.indexes);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.indexes.isEmpty()) {
            sb.append(", indexes=");
            sb.append(this.indexes);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationParticipantsReadIndexV3ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationParticipantsReadIndexV3ResponseBody)) {
            return false;
        }
        GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody = (GetConversationParticipantsReadIndexV3ResponseBody) obj;
        if (!unknownFields().equals(getConversationParticipantsReadIndexV3ResponseBody.unknownFields()) || !this.indexes.equals(getConversationParticipantsReadIndexV3ResponseBody.indexes)) {
            return false;
        }
        return true;
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.indexes = Internal.immutableCopyOf("indexes", list);
    }
}
