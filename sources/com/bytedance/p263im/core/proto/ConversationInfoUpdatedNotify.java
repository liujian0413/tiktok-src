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

/* renamed from: com.bytedance.im.core.proto.ConversationInfoUpdatedNotify */
public final class ConversationInfoUpdatedNotify extends Message<ConversationInfoUpdatedNotify, Builder> {
    public static final ProtoAdapter<ConversationInfoUpdatedNotify> ADAPTER = new ProtoAdapter_ConversationInfoUpdatedNotify();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfo#ADAPTER", tag = 1)
    public final ConversationInfo conversation;

    /* renamed from: com.bytedance.im.core.proto.ConversationInfoUpdatedNotify$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationInfoUpdatedNotify, Builder> {
        public ConversationInfo conversation;

        public final ConversationInfoUpdatedNotify build() {
            return new ConversationInfoUpdatedNotify(this.conversation, super.buildUnknownFields());
        }

        public final Builder conversation(ConversationInfo conversationInfo) {
            this.conversation = conversationInfo;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationInfoUpdatedNotify$ProtoAdapter_ConversationInfoUpdatedNotify */
    static final class ProtoAdapter_ConversationInfoUpdatedNotify extends ProtoAdapter<ConversationInfoUpdatedNotify> {
        public ProtoAdapter_ConversationInfoUpdatedNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationInfoUpdatedNotify.class);
        }

        public final int encodedSize(ConversationInfoUpdatedNotify conversationInfoUpdatedNotify) {
            return ConversationInfo.ADAPTER.encodedSizeWithTag(1, conversationInfoUpdatedNotify.conversation) + conversationInfoUpdatedNotify.unknownFields().size();
        }

        public final ConversationInfoUpdatedNotify redact(ConversationInfoUpdatedNotify conversationInfoUpdatedNotify) {
            Builder newBuilder = conversationInfoUpdatedNotify.newBuilder();
            if (newBuilder.conversation != null) {
                newBuilder.conversation = (ConversationInfo) ConversationInfo.ADAPTER.redact(newBuilder.conversation);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ConversationInfoUpdatedNotify decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation((ConversationInfo) ConversationInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationInfoUpdatedNotify conversationInfoUpdatedNotify) throws IOException {
            ConversationInfo.ADAPTER.encodeWithTag(protoWriter, 1, conversationInfoUpdatedNotify.conversation);
            protoWriter.writeBytes(conversationInfoUpdatedNotify.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.conversation != null) {
            i = this.conversation.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation = this.conversation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationInfoUpdatedNotify{");
        replace.append('}');
        return replace.toString();
    }

    public ConversationInfoUpdatedNotify(ConversationInfo conversationInfo) {
        this(conversationInfo, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationInfoUpdatedNotify)) {
            return false;
        }
        ConversationInfoUpdatedNotify conversationInfoUpdatedNotify = (ConversationInfoUpdatedNotify) obj;
        if (!unknownFields().equals(conversationInfoUpdatedNotify.unknownFields()) || !Internal.equals(this.conversation, conversationInfoUpdatedNotify.conversation)) {
            return false;
        }
        return true;
    }

    public ConversationInfoUpdatedNotify(ConversationInfo conversationInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation = conversationInfo;
    }
}
