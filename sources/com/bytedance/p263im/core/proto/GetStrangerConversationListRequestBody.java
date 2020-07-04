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

/* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListRequestBody */
public final class GetStrangerConversationListRequestBody extends Message<GetStrangerConversationListRequestBody, Builder> {
    public static final ProtoAdapter<GetStrangerConversationListRequestBody> ADAPTER = new ProtoAdapter_GetStrangerConversationListRequestBody();
    public static final Long DEFAULT_COUNT = Long.valueOf(50);
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final Boolean DEFAULT_SHOW_TOTAL_UNREAD = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean show_total_unread;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetStrangerConversationListRequestBody, Builder> {
        public Long count;
        public Long cursor;
        public Boolean show_total_unread;

        public final GetStrangerConversationListRequestBody build() {
            return new GetStrangerConversationListRequestBody(this.cursor, this.count, this.show_total_unread, super.buildUnknownFields());
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder show_total_unread(Boolean bool) {
            this.show_total_unread = bool;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$ProtoAdapter_GetStrangerConversationListRequestBody */
    static final class ProtoAdapter_GetStrangerConversationListRequestBody extends ProtoAdapter<GetStrangerConversationListRequestBody> {
        public ProtoAdapter_GetStrangerConversationListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerConversationListRequestBody.class);
        }

        public final GetStrangerConversationListRequestBody redact(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            Builder newBuilder = getStrangerConversationListRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerConversationListRequestBody.cursor) + ProtoAdapter.INT64.encodedSizeWithTag(2, getStrangerConversationListRequestBody.count) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getStrangerConversationListRequestBody.show_total_unread) + getStrangerConversationListRequestBody.unknownFields().size();
        }

        public final GetStrangerConversationListRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.count((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.show_total_unread((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerConversationListRequestBody.cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getStrangerConversationListRequestBody.count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getStrangerConversationListRequestBody.show_total_unread);
            protoWriter.writeBytes(getStrangerConversationListRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.count = this.count;
        builder.show_total_unread = this.show_total_unread;
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
        if (this.cursor != null) {
            i = this.cursor.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.count != null) {
            i2 = this.count.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.show_total_unread != null) {
            i4 = this.show_total_unread.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.show_total_unread != null) {
            sb.append(", show_total_unread=");
            sb.append(this.show_total_unread);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStrangerConversationListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStrangerConversationListRequestBody)) {
            return false;
        }
        GetStrangerConversationListRequestBody getStrangerConversationListRequestBody = (GetStrangerConversationListRequestBody) obj;
        if (!unknownFields().equals(getStrangerConversationListRequestBody.unknownFields()) || !Internal.equals(this.cursor, getStrangerConversationListRequestBody.cursor) || !Internal.equals(this.count, getStrangerConversationListRequestBody.count) || !Internal.equals(this.show_total_unread, getStrangerConversationListRequestBody.show_total_unread)) {
            return false;
        }
        return true;
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool) {
        this(l, l2, bool, ByteString.EMPTY);
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.count = l2;
        this.show_total_unread = bool;
    }
}
