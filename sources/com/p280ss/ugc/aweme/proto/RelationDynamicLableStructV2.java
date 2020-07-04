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

/* renamed from: com.ss.ugc.aweme.proto.RelationDynamicLableStructV2 */
public final class RelationDynamicLableStructV2 extends Message<RelationDynamicLableStructV2, Builder> {
    public static final ProtoAdapter<RelationDynamicLableStructV2> ADAPTER = new ProtoAdapter_RelationDynamicLableStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String label_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String user_id;

    /* renamed from: com.ss.ugc.aweme.proto.RelationDynamicLableStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RelationDynamicLableStructV2, Builder> {
        public Integer count;
        public String label_info;
        public String nickname;
        public Integer type;
        public String user_id;

        public final RelationDynamicLableStructV2 build() {
            RelationDynamicLableStructV2 relationDynamicLableStructV2 = new RelationDynamicLableStructV2(this.nickname, this.label_info, this.count, this.user_id, this.type, super.buildUnknownFields());
            return relationDynamicLableStructV2;
        }

        public final Builder count(Integer num) {
            this.count = num;
            return this;
        }

        public final Builder label_info(String str) {
            this.label_info = str;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_id(String str) {
            this.user_id = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RelationDynamicLableStructV2$ProtoAdapter_RelationDynamicLableStructV2 */
    static final class ProtoAdapter_RelationDynamicLableStructV2 extends ProtoAdapter<RelationDynamicLableStructV2> {
        public ProtoAdapter_RelationDynamicLableStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelationDynamicLableStructV2.class);
        }

        public final int encodedSize(RelationDynamicLableStructV2 relationDynamicLableStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, relationDynamicLableStructV2.nickname) + ProtoAdapter.STRING.encodedSizeWithTag(2, relationDynamicLableStructV2.label_info) + ProtoAdapter.INT32.encodedSizeWithTag(3, relationDynamicLableStructV2.count) + ProtoAdapter.STRING.encodedSizeWithTag(4, relationDynamicLableStructV2.user_id) + ProtoAdapter.INT32.encodedSizeWithTag(5, relationDynamicLableStructV2.type) + relationDynamicLableStructV2.unknownFields().size();
        }

        public final RelationDynamicLableStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.nickname((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.label_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.user_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RelationDynamicLableStructV2 relationDynamicLableStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, relationDynamicLableStructV2.nickname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, relationDynamicLableStructV2.label_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, relationDynamicLableStructV2.count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, relationDynamicLableStructV2.user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, relationDynamicLableStructV2.type);
            protoWriter.writeBytes(relationDynamicLableStructV2.unknownFields());
        }
    }

    public RelationDynamicLableStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.nickname = this.nickname;
        builder.label_info = this.label_info;
        builder.count = this.count;
        builder.user_id = this.user_id;
        builder.type = this.type;
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
        if (this.nickname != null) {
            i = this.nickname.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.label_info != null) {
            i2 = this.label_info.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.count != null) {
            i3 = this.count.hashCode();
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
        if (this.type != null) {
            i6 = this.type.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.label_info != null) {
            sb.append(", label_info=");
            sb.append(this.label_info);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "RelationDynamicLableStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationDynamicLableStructV2)) {
            return false;
        }
        RelationDynamicLableStructV2 relationDynamicLableStructV2 = (RelationDynamicLableStructV2) obj;
        if (!unknownFields().equals(relationDynamicLableStructV2.unknownFields()) || !Internal.equals(this.nickname, relationDynamicLableStructV2.nickname) || !Internal.equals(this.label_info, relationDynamicLableStructV2.label_info) || !Internal.equals(this.count, relationDynamicLableStructV2.count) || !Internal.equals(this.user_id, relationDynamicLableStructV2.user_id) || !Internal.equals(this.type, relationDynamicLableStructV2.type)) {
            return false;
        }
        return true;
    }

    public RelationDynamicLableStructV2(String str, String str2, Integer num, String str3, Integer num2) {
        this(str, str2, num, str3, num2, ByteString.EMPTY);
    }

    public RelationDynamicLableStructV2(String str, String str2, Integer num, String str3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.nickname = str;
        this.label_info = str2;
        this.count = num;
        this.user_id = str3;
        this.type = num2;
    }
}
