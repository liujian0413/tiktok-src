package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.TokenInfo */
public final class TokenInfo extends Message<TokenInfo, Builder> {
    public static final ProtoAdapter<TokenInfo> ADAPTER = new ProtoAdapter_TokenInfo();
    public static final Integer DEFAULT_APP_ID = Integer.valueOf(0);
    public static final Integer DEFAULT_MARK_ID = Integer.valueOf(0);
    public static final Long DEFAULT_TIMESTAMP = Long.valueOf(0);
    public static final TokenType DEFAULT_TYPE = TokenType.DEFAULT_TOKEN;
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer app_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer mark_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long timestamp;
    @WireField(adapter = "com.bytedance.im.core.proto.TokenType#ADAPTER", tag = 2)
    public final TokenType type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.TokenInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<TokenInfo, Builder> {
        public Integer app_id;
        public Integer mark_id;
        public Long timestamp;
        public TokenType type;
        public Long user_id;

        public final TokenInfo build() {
            TokenInfo tokenInfo = new TokenInfo(this.mark_id, this.type, this.app_id, this.user_id, this.timestamp, super.buildUnknownFields());
            return tokenInfo;
        }

        public final Builder app_id(Integer num) {
            this.app_id = num;
            return this;
        }

        public final Builder mark_id(Integer num) {
            this.mark_id = num;
            return this;
        }

        public final Builder timestamp(Long l) {
            this.timestamp = l;
            return this;
        }

        public final Builder type(TokenType tokenType) {
            this.type = tokenType;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.TokenInfo$ProtoAdapter_TokenInfo */
    static final class ProtoAdapter_TokenInfo extends ProtoAdapter<TokenInfo> {
        public ProtoAdapter_TokenInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, TokenInfo.class);
        }

        public final TokenInfo redact(TokenInfo tokenInfo) {
            Builder newBuilder = tokenInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(TokenInfo tokenInfo) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, tokenInfo.mark_id) + TokenType.ADAPTER.encodedSizeWithTag(2, tokenInfo.type) + ProtoAdapter.INT32.encodedSizeWithTag(3, tokenInfo.app_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, tokenInfo.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, tokenInfo.timestamp) + tokenInfo.unknownFields().size();
        }

        public final TokenInfo decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mark_id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.type((TokenType) TokenType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            builder.app_id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.timestamp((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, TokenInfo tokenInfo) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, tokenInfo.mark_id);
            TokenType.ADAPTER.encodeWithTag(protoWriter, 2, tokenInfo.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, tokenInfo.app_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, tokenInfo.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, tokenInfo.timestamp);
            protoWriter.writeBytes(tokenInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.mark_id = this.mark_id;
        builder.type = this.type;
        builder.app_id = this.app_id;
        builder.user_id = this.user_id;
        builder.timestamp = this.timestamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.mark_id != null) {
            i = this.mark_id.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.type != null) {
            i2 = this.type.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.app_id != null) {
            i3 = this.app_id.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.user_id != null) {
            i4 = this.user_id.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.timestamp != null) {
            i6 = this.timestamp.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mark_id != null) {
            sb.append(", mark_id=");
            sb.append(this.mark_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "TokenInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) obj;
        if (!unknownFields().equals(tokenInfo.unknownFields()) || !Internal.equals(this.mark_id, tokenInfo.mark_id) || !Internal.equals(this.type, tokenInfo.type) || !Internal.equals(this.app_id, tokenInfo.app_id) || !Internal.equals(this.user_id, tokenInfo.user_id) || !Internal.equals(this.timestamp, tokenInfo.timestamp)) {
            return false;
        }
        return true;
    }

    public TokenInfo(Integer num, TokenType tokenType, Integer num2, Long l, Long l2) {
        this(num, tokenType, num2, l, l2, ByteString.EMPTY);
    }

    public TokenInfo(Integer num, TokenType tokenType, Integer num2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mark_id = num;
        this.type = tokenType;
        this.app_id = num2;
        this.user_id = l;
        this.timestamp = l2;
    }
}
