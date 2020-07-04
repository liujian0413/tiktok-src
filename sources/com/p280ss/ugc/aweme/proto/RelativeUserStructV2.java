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

/* renamed from: com.ss.ugc.aweme.proto.RelativeUserStructV2 */
public final class RelativeUserStructV2 extends Message<RelativeUserStructV2, Builder> {
    public static final ProtoAdapter<RelativeUserStructV2> ADAPTER = new ProtoAdapter_RelativeUserStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 avatar;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 5)
    public UrlStructV2 avatar_larger;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 6)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer follow_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String remark_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long uid;

    /* renamed from: com.ss.ugc.aweme.proto.RelativeUserStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RelativeUserStructV2, Builder> {
        public UrlStructV2 avatar;
        public UrlStructV2 avatar_larger;
        public UrlStructV2 avatar_thumb;
        public Integer follow_status;
        public String nickname;
        public String remark_name;
        public String sec_uid;
        public Long uid;

        public final RelativeUserStructV2 build() {
            RelativeUserStructV2 relativeUserStructV2 = new RelativeUserStructV2(this.uid, this.avatar, this.nickname, this.remark_name, this.avatar_larger, this.avatar_thumb, this.follow_status, this.sec_uid, super.buildUnknownFields());
            return relativeUserStructV2;
        }

        public final Builder avatar(UrlStructV2 urlStructV2) {
            this.avatar = urlStructV2;
            return this;
        }

        public final Builder avatar_larger(UrlStructV2 urlStructV2) {
            this.avatar_larger = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder follow_status(Integer num) {
            this.follow_status = num;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder remark_name(String str) {
            this.remark_name = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder uid(Long l) {
            this.uid = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RelativeUserStructV2$ProtoAdapter_RelativeUserStructV2 */
    static final class ProtoAdapter_RelativeUserStructV2 extends ProtoAdapter<RelativeUserStructV2> {
        public ProtoAdapter_RelativeUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelativeUserStructV2.class);
        }

        public final int encodedSize(RelativeUserStructV2 relativeUserStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, relativeUserStructV2.uid) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, relativeUserStructV2.avatar) + ProtoAdapter.STRING.encodedSizeWithTag(3, relativeUserStructV2.nickname) + ProtoAdapter.STRING.encodedSizeWithTag(4, relativeUserStructV2.remark_name) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, relativeUserStructV2.avatar_larger) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, relativeUserStructV2.avatar_thumb) + ProtoAdapter.INT32.encodedSizeWithTag(7, relativeUserStructV2.follow_status) + ProtoAdapter.STRING.encodedSizeWithTag(8, relativeUserStructV2.sec_uid) + relativeUserStructV2.unknownFields().size();
        }

        public final RelativeUserStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.avatar((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.nickname((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.remark_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.avatar_larger((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.avatar_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.follow_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RelativeUserStructV2 relativeUserStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, relativeUserStructV2.uid);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, relativeUserStructV2.avatar);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, relativeUserStructV2.nickname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, relativeUserStructV2.remark_name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, relativeUserStructV2.avatar_larger);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, relativeUserStructV2.avatar_thumb);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, relativeUserStructV2.follow_status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, relativeUserStructV2.sec_uid);
            protoWriter.writeBytes(relativeUserStructV2.unknownFields());
        }
    }

    public RelativeUserStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.avatar = this.avatar;
        builder.nickname = this.nickname;
        builder.remark_name = this.remark_name;
        builder.avatar_larger = this.avatar_larger;
        builder.avatar_thumb = this.avatar_thumb;
        builder.follow_status = this.follow_status;
        builder.sec_uid = this.sec_uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.uid != null) {
            i = this.uid.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.avatar != null) {
            i2 = this.avatar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.nickname != null) {
            i3 = this.nickname.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.remark_name != null) {
            i4 = this.remark_name.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.avatar_larger != null) {
            i5 = this.avatar_larger.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.avatar_thumb != null) {
            i6 = this.avatar_thumb.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.follow_status != null) {
            i7 = this.follow_status.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.sec_uid != null) {
            i9 = this.sec_uid.hashCode();
        }
        int i17 = i16 + i9;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.remark_name != null) {
            sb.append(", remark_name=");
            sb.append(this.remark_name);
        }
        if (this.avatar_larger != null) {
            sb.append(", avatar_larger=");
            sb.append(this.avatar_larger);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatar_thumb);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=");
            sb.append(this.follow_status);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        StringBuilder replace = sb.replace(0, 2, "RelativeUserStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelativeUserStructV2)) {
            return false;
        }
        RelativeUserStructV2 relativeUserStructV2 = (RelativeUserStructV2) obj;
        if (!unknownFields().equals(relativeUserStructV2.unknownFields()) || !Internal.equals(this.uid, relativeUserStructV2.uid) || !Internal.equals(this.avatar, relativeUserStructV2.avatar) || !Internal.equals(this.nickname, relativeUserStructV2.nickname) || !Internal.equals(this.remark_name, relativeUserStructV2.remark_name) || !Internal.equals(this.avatar_larger, relativeUserStructV2.avatar_larger) || !Internal.equals(this.avatar_thumb, relativeUserStructV2.avatar_thumb) || !Internal.equals(this.follow_status, relativeUserStructV2.follow_status) || !Internal.equals(this.sec_uid, relativeUserStructV2.sec_uid)) {
            return false;
        }
        return true;
    }

    public RelativeUserStructV2(Long l, UrlStructV2 urlStructV2, String str, String str2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, Integer num, String str3) {
        this(l, urlStructV2, str, str2, urlStructV22, urlStructV23, num, str3, ByteString.EMPTY);
    }

    public RelativeUserStructV2(Long l, UrlStructV2 urlStructV2, String str, String str2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, Integer num, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.avatar = urlStructV2;
        this.nickname = str;
        this.remark_name = str2;
        this.avatar_larger = urlStructV22;
        this.avatar_thumb = urlStructV23;
        this.follow_status = num;
        this.sec_uid = str3;
    }
}
