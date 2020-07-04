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

/* renamed from: com.bytedance.im.core.proto.MessagePropertyContent */
public final class MessagePropertyContent extends Message<MessagePropertyContent, Builder> {
    public static final ProtoAdapter<MessagePropertyContent> ADAPTER = new ProtoAdapter_MessagePropertyContent();
    public static final Long DEFAULT_INDEX_IN_MESSAGE = Long.valueOf(0);
    public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long index_in_message;
    @WireField(adapter = "com.bytedance.im.core.proto.ReactionContent#ADAPTER", tag = 3)
    public final ReactionContent reaction_content;
    @WireField(adapter = "com.bytedance.im.core.proto.SyncContent#ADAPTER", tag = 2)
    public final SyncContent sync_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer type;

    /* renamed from: com.bytedance.im.core.proto.MessagePropertyContent$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagePropertyContent, Builder> {
        public Long index_in_message;
        public ReactionContent reaction_content;
        public SyncContent sync_content;
        public Integer type;

        public final MessagePropertyContent build() {
            MessagePropertyContent messagePropertyContent = new MessagePropertyContent(this.type, this.sync_content, this.reaction_content, this.index_in_message, super.buildUnknownFields());
            return messagePropertyContent;
        }

        public final Builder index_in_message(Long l) {
            this.index_in_message = l;
            return this;
        }

        public final Builder reaction_content(ReactionContent reactionContent) {
            this.reaction_content = reactionContent;
            return this;
        }

        public final Builder sync_content(SyncContent syncContent) {
            this.sync_content = syncContent;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagePropertyContent$ProtoAdapter_MessagePropertyContent */
    static final class ProtoAdapter_MessagePropertyContent extends ProtoAdapter<MessagePropertyContent> {
        public ProtoAdapter_MessagePropertyContent() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagePropertyContent.class);
        }

        public final int encodedSize(MessagePropertyContent messagePropertyContent) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, messagePropertyContent.type) + SyncContent.ADAPTER.encodedSizeWithTag(2, messagePropertyContent.sync_content) + ReactionContent.ADAPTER.encodedSizeWithTag(3, messagePropertyContent.reaction_content) + ProtoAdapter.INT64.encodedSizeWithTag(4, messagePropertyContent.index_in_message) + messagePropertyContent.unknownFields().size();
        }

        public final MessagePropertyContent redact(MessagePropertyContent messagePropertyContent) {
            Builder newBuilder = messagePropertyContent.newBuilder();
            if (newBuilder.sync_content != null) {
                newBuilder.sync_content = (SyncContent) SyncContent.ADAPTER.redact(newBuilder.sync_content);
            }
            if (newBuilder.reaction_content != null) {
                newBuilder.reaction_content = (ReactionContent) ReactionContent.ADAPTER.redact(newBuilder.reaction_content);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MessagePropertyContent decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.sync_content((SyncContent) SyncContent.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.reaction_content((ReactionContent) ReactionContent.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.index_in_message((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessagePropertyContent messagePropertyContent) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, messagePropertyContent.type);
            SyncContent.ADAPTER.encodeWithTag(protoWriter, 2, messagePropertyContent.sync_content);
            ReactionContent.ADAPTER.encodeWithTag(protoWriter, 3, messagePropertyContent.reaction_content);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messagePropertyContent.index_in_message);
            protoWriter.writeBytes(messagePropertyContent.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.sync_content = this.sync_content;
        builder.reaction_content = this.reaction_content;
        builder.index_in_message = this.index_in_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.sync_content != null) {
            i2 = this.sync_content.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.reaction_content != null) {
            i3 = this.reaction_content.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.index_in_message != null) {
            i5 = this.index_in_message.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.sync_content != null) {
            sb.append(", sync_content=");
            sb.append(this.sync_content);
        }
        if (this.reaction_content != null) {
            sb.append(", reaction_content=");
            sb.append(this.reaction_content);
        }
        if (this.index_in_message != null) {
            sb.append(", index_in_message=");
            sb.append(this.index_in_message);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagePropertyContent{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessagePropertyContent)) {
            return false;
        }
        MessagePropertyContent messagePropertyContent = (MessagePropertyContent) obj;
        if (!unknownFields().equals(messagePropertyContent.unknownFields()) || !Internal.equals(this.type, messagePropertyContent.type) || !Internal.equals(this.sync_content, messagePropertyContent.sync_content) || !Internal.equals(this.reaction_content, messagePropertyContent.reaction_content) || !Internal.equals(this.index_in_message, messagePropertyContent.index_in_message)) {
            return false;
        }
        return true;
    }

    public MessagePropertyContent(Integer num, SyncContent syncContent, ReactionContent reactionContent, Long l) {
        this(num, syncContent, reactionContent, l, ByteString.EMPTY);
    }

    public MessagePropertyContent(Integer num, SyncContent syncContent, ReactionContent reactionContent, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.sync_content = syncContent;
        this.reaction_content = reactionContent;
        this.index_in_message = l;
    }
}
