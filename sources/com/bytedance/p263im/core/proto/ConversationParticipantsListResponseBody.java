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

/* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListResponseBody */
public final class ConversationParticipantsListResponseBody extends Message<ConversationParticipantsListResponseBody, Builder> {
    public static final ProtoAdapter<ConversationParticipantsListResponseBody> ADAPTER = new ProtoAdapter_ConversationParticipantsListResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ParticipantsPage#ADAPTER", tag = 1)
    public final ParticipantsPage participants_page;

    /* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationParticipantsListResponseBody, Builder> {
        public ParticipantsPage participants_page;

        public final ConversationParticipantsListResponseBody build() {
            return new ConversationParticipantsListResponseBody(this.participants_page, super.buildUnknownFields());
        }

        public final Builder participants_page(ParticipantsPage participantsPage) {
            this.participants_page = participantsPage;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListResponseBody$ProtoAdapter_ConversationParticipantsListResponseBody */
    static final class ProtoAdapter_ConversationParticipantsListResponseBody extends ProtoAdapter<ConversationParticipantsListResponseBody> {
        public ProtoAdapter_ConversationParticipantsListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantsListResponseBody.class);
        }

        public final int encodedSize(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            return ParticipantsPage.ADAPTER.encodedSizeWithTag(1, conversationParticipantsListResponseBody.participants_page) + conversationParticipantsListResponseBody.unknownFields().size();
        }

        public final ConversationParticipantsListResponseBody redact(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            Builder newBuilder = conversationParticipantsListResponseBody.newBuilder();
            if (newBuilder.participants_page != null) {
                newBuilder.participants_page = (ParticipantsPage) ParticipantsPage.ADAPTER.redact(newBuilder.participants_page);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ConversationParticipantsListResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.participants_page((ParticipantsPage) ParticipantsPage.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) throws IOException {
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 1, conversationParticipantsListResponseBody.participants_page);
            protoWriter.writeBytes(conversationParticipantsListResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.participants_page != null) {
            i = this.participants_page.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.participants_page = this.participants_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.participants_page != null) {
            sb.append(", participants_page=");
            sb.append(this.participants_page);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationParticipantsListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage) {
        this(participantsPage, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationParticipantsListResponseBody)) {
            return false;
        }
        ConversationParticipantsListResponseBody conversationParticipantsListResponseBody = (ConversationParticipantsListResponseBody) obj;
        if (!unknownFields().equals(conversationParticipantsListResponseBody.unknownFields()) || !Internal.equals(this.participants_page, conversationParticipantsListResponseBody.participants_page)) {
            return false;
        }
        return true;
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participants_page = participantsPage;
    }
}
