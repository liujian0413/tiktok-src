package com.bytedance.p263im.core.proto;

import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody */
public final class ConversationsPerUserByFavoriteV2RequestBody extends Message<ConversationsPerUserByFavoriteV2RequestBody, Builder> {
    public static final ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> ADAPTER = new ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final Integer DEFAULT_LIMIT = Integer.valueOf(VETransitionFilterParam.TransitionDuration_DEFAULT);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer limit;

    /* renamed from: com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationsPerUserByFavoriteV2RequestBody, Builder> {
        public Long cursor;
        public Integer limit;

        public final ConversationsPerUserByFavoriteV2RequestBody build() {
            return new ConversationsPerUserByFavoriteV2RequestBody(this.cursor, this.limit, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody$ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody */
    static final class ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody extends ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> {
        public ProtoAdapter_ConversationsPerUserByFavoriteV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationsPerUserByFavoriteV2RequestBody.class);
        }

        public final ConversationsPerUserByFavoriteV2RequestBody redact(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            Builder newBuilder = conversationsPerUserByFavoriteV2RequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByFavoriteV2RequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByFavoriteV2RequestBody.limit) + conversationsPerUserByFavoriteV2RequestBody.unknownFields().size();
        }

        public final ConversationsPerUserByFavoriteV2RequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.limit((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByFavoriteV2RequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByFavoriteV2RequestBody.limit);
            protoWriter.writeBytes(conversationsPerUserByFavoriteV2RequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
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
        if (this.cursor != null) {
            i = this.cursor.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.limit != null) {
            i3 = this.limit.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationsPerUserByFavoriteV2RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationsPerUserByFavoriteV2RequestBody)) {
            return false;
        }
        ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody = (ConversationsPerUserByFavoriteV2RequestBody) obj;
        if (!unknownFields().equals(conversationsPerUserByFavoriteV2RequestBody.unknownFields()) || !Internal.equals(this.cursor, conversationsPerUserByFavoriteV2RequestBody.cursor) || !Internal.equals(this.limit, conversationsPerUserByFavoriteV2RequestBody.limit)) {
            return false;
        }
        return true;
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.limit = num;
    }
}
