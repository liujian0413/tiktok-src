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

/* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUser */
public final class InboxMessagesPerUser extends Message<InboxMessagesPerUser, Builder> {
    public static final ProtoAdapter<InboxMessagesPerUser> ADAPTER = new ProtoAdapter_InboxMessagesPerUser();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer inbox_type;

    /* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUser$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<InboxMessagesPerUser, Builder> {
        public Long cursor;
        public Integer inbox_type;

        public final InboxMessagesPerUser build() {
            return new InboxMessagesPerUser(this.inbox_type, this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUser$ProtoAdapter_InboxMessagesPerUser */
    static final class ProtoAdapter_InboxMessagesPerUser extends ProtoAdapter<InboxMessagesPerUser> {
        public ProtoAdapter_InboxMessagesPerUser() {
            super(FieldEncoding.LENGTH_DELIMITED, InboxMessagesPerUser.class);
        }

        public final InboxMessagesPerUser redact(InboxMessagesPerUser inboxMessagesPerUser) {
            Builder newBuilder = inboxMessagesPerUser.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(InboxMessagesPerUser inboxMessagesPerUser) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUser.inbox_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, inboxMessagesPerUser.cursor) + inboxMessagesPerUser.unknownFields().size();
        }

        public final InboxMessagesPerUser decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, InboxMessagesPerUser inboxMessagesPerUser) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUser.inbox_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, inboxMessagesPerUser.cursor);
            protoWriter.writeBytes(inboxMessagesPerUser.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.inbox_type = this.inbox_type;
        builder.cursor = this.cursor;
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
        int i3 = 0;
        if (this.inbox_type != null) {
            i = this.inbox_type.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.cursor != null) {
            i3 = this.cursor.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "InboxMessagesPerUser{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InboxMessagesPerUser)) {
            return false;
        }
        InboxMessagesPerUser inboxMessagesPerUser = (InboxMessagesPerUser) obj;
        if (!unknownFields().equals(inboxMessagesPerUser.unknownFields()) || !Internal.equals(this.inbox_type, inboxMessagesPerUser.inbox_type) || !Internal.equals(this.cursor, inboxMessagesPerUser.cursor)) {
            return false;
        }
        return true;
    }

    public InboxMessagesPerUser(Integer num, Long l) {
        this(num, l, ByteString.EMPTY);
    }

    public InboxMessagesPerUser(Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.cursor = l;
    }
}
