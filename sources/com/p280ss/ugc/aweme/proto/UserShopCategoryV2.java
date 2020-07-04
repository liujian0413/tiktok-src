package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.UserShopCategoryV2 */
final class UserShopCategoryV2 extends Message<UserShopCategoryV2, Builder> {
    public static final ProtoAdapter<UserShopCategoryV2> ADAPTER = new ProtoAdapter_UserShopCategoryV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)

    /* renamed from: id */
    public Long f118754id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;

    /* renamed from: com.ss.ugc.aweme.proto.UserShopCategoryV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UserShopCategoryV2, Builder> {
        public Long count;

        /* renamed from: id */
        public Long f118755id;
        public String name;

        public final UserShopCategoryV2 build() {
            return new UserShopCategoryV2(this.f118755id, this.name, this.count, super.buildUnknownFields());
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        /* renamed from: id */
        public final Builder mo113728id(Long l) {
            this.f118755id = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.UserShopCategoryV2$ProtoAdapter_UserShopCategoryV2 */
    static final class ProtoAdapter_UserShopCategoryV2 extends ProtoAdapter<UserShopCategoryV2> {
        public ProtoAdapter_UserShopCategoryV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UserShopCategoryV2.class);
        }

        public final int encodedSize(UserShopCategoryV2 userShopCategoryV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, userShopCategoryV2.f118754id) + ProtoAdapter.STRING.encodedSizeWithTag(2, userShopCategoryV2.name) + ProtoAdapter.INT64.encodedSizeWithTag(3, userShopCategoryV2.count) + userShopCategoryV2.unknownFields().size();
        }

        public final UserShopCategoryV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo113728id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.count((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UserShopCategoryV2 userShopCategoryV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, userShopCategoryV2.f118754id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userShopCategoryV2.name);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, userShopCategoryV2.count);
            protoWriter.writeBytes(userShopCategoryV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f118755id = this.f118754id;
        builder.name = this.name;
        builder.count = this.count;
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
        if (this.f118754id != null) {
            i = this.f118754id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.name != null) {
            i2 = this.name.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.count != null) {
            i4 = this.count.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f118754id != null) {
            sb.append(", id=");
            sb.append(this.f118754id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "UserShopCategoryV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserShopCategoryV2)) {
            return false;
        }
        UserShopCategoryV2 userShopCategoryV2 = (UserShopCategoryV2) obj;
        if (!unknownFields().equals(userShopCategoryV2.unknownFields()) || !Internal.equals(this.f118754id, userShopCategoryV2.f118754id) || !Internal.equals(this.name, userShopCategoryV2.name) || !Internal.equals(this.count, userShopCategoryV2.count)) {
            return false;
        }
        return true;
    }

    public UserShopCategoryV2(Long l, String str, Long l2) {
        this(l, str, l2, ByteString.EMPTY);
    }

    public UserShopCategoryV2(Long l, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f118754id = l;
        this.name = str;
        this.count = l2;
    }
}
