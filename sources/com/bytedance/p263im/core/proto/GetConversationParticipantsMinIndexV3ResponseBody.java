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

/* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody */
public final class GetConversationParticipantsMinIndexV3ResponseBody extends Message<GetConversationParticipantsMinIndexV3ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> ADAPTER = new ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ParticipantMinIndex#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<ParticipantMinIndex> indexes;

    /* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationParticipantsMinIndexV3ResponseBody, Builder> {
        public List<ParticipantMinIndex> indexes = Internal.newMutableList();

        public final GetConversationParticipantsMinIndexV3ResponseBody build() {
            return new GetConversationParticipantsMinIndexV3ResponseBody(this.indexes, super.buildUnknownFields());
        }

        public final Builder indexes(List<ParticipantMinIndex> list) {
            Internal.checkElementsNotNull(list);
            this.indexes = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody$ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody */
    static final class ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody extends ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> {
        public ProtoAdapter_GetConversationParticipantsMinIndexV3ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsMinIndexV3ResponseBody.class);
        }

        public final int encodedSize(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            return ParticipantMinIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsMinIndexV3ResponseBody.indexes) + getConversationParticipantsMinIndexV3ResponseBody.unknownFields().size();
        }

        public final GetConversationParticipantsMinIndexV3ResponseBody redact(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            Builder newBuilder = getConversationParticipantsMinIndexV3ResponseBody.newBuilder();
            Internal.redactElements(newBuilder.indexes, ParticipantMinIndex.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationParticipantsMinIndexV3ResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.indexes.add(ParticipantMinIndex.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) throws IOException {
            ParticipantMinIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationParticipantsMinIndexV3ResponseBody.indexes);
            protoWriter.writeBytes(getConversationParticipantsMinIndexV3ResponseBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "GetConversationParticipantsMinIndexV3ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationParticipantsMinIndexV3ResponseBody)) {
            return false;
        }
        GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody = (GetConversationParticipantsMinIndexV3ResponseBody) obj;
        if (!unknownFields().equals(getConversationParticipantsMinIndexV3ResponseBody.unknownFields()) || !this.indexes.equals(getConversationParticipantsMinIndexV3ResponseBody.indexes)) {
            return false;
        }
        return true;
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.indexes = Internal.immutableCopyOf("indexes", list);
    }
}
