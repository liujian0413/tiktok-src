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

/* renamed from: com.bytedance.im.core.proto.MarkConversationReadNotify */
public final class MarkConversationReadNotify extends Message<MarkConversationReadNotify, Builder> {
    public static final ProtoAdapter<MarkConversationReadNotify> ADAPTER = new ProtoAdapter_MarkConversationReadNotify();
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_READ_INDEX = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long read_index;

    /* renamed from: com.bytedance.im.core.proto.MarkConversationReadNotify$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MarkConversationReadNotify, Builder> {
        public String conversation_id;
        public Integer conversation_type;
        public Long read_index;

        public final MarkConversationReadNotify build() {
            return new MarkConversationReadNotify(this.conversation_id, this.conversation_type, this.read_index, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder read_index(Long l) {
            this.read_index = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkConversationReadNotify$ProtoAdapter_MarkConversationReadNotify */
    static final class ProtoAdapter_MarkConversationReadNotify extends ProtoAdapter<MarkConversationReadNotify> {
        public ProtoAdapter_MarkConversationReadNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkConversationReadNotify.class);
        }

        public final MarkConversationReadNotify redact(MarkConversationReadNotify markConversationReadNotify) {
            Builder newBuilder = markConversationReadNotify.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MarkConversationReadNotify markConversationReadNotify) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markConversationReadNotify.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markConversationReadNotify.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, markConversationReadNotify.read_index) + markConversationReadNotify.unknownFields().size();
        }

        public final MarkConversationReadNotify decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.read_index((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MarkConversationReadNotify markConversationReadNotify) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markConversationReadNotify.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markConversationReadNotify.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, markConversationReadNotify.read_index);
            protoWriter.writeBytes(markConversationReadNotify.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.read_index = this.read_index;
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
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.read_index != null) {
            i4 = this.read_index.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        StringBuilder replace = sb.replace(0, 2, "MarkConversationReadNotify{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarkConversationReadNotify)) {
            return false;
        }
        MarkConversationReadNotify markConversationReadNotify = (MarkConversationReadNotify) obj;
        if (!unknownFields().equals(markConversationReadNotify.unknownFields()) || !Internal.equals(this.conversation_id, markConversationReadNotify.conversation_id) || !Internal.equals(this.conversation_type, markConversationReadNotify.conversation_type) || !Internal.equals(this.read_index, markConversationReadNotify.read_index)) {
            return false;
        }
        return true;
    }

    public MarkConversationReadNotify(String str, Integer num, Long l) {
        this(str, num, l, ByteString.EMPTY);
    }

    public MarkConversationReadNotify(String str, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.read_index = l;
    }
}
