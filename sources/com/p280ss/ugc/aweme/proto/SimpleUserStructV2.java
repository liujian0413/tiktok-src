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

/* renamed from: com.ss.ugc.aweme.proto.SimpleUserStructV2 */
public final class SimpleUserStructV2 extends Message<SimpleUserStructV2, Builder> {
    public static final ProtoAdapter<SimpleUserStructV2> ADAPTER = new ProtoAdapter_SimpleUserStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 8)
    public UrlStructV2 avatar_larger;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer follow_status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.HitTaskInfoV2#ADAPTER", tag = 9)
    public HitTaskInfoV2 hit_task_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String signature;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String unique_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer user_rate;

    /* renamed from: com.ss.ugc.aweme.proto.SimpleUserStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SimpleUserStructV2, Builder> {
        public UrlStructV2 avatar_larger;
        public UrlStructV2 avatar_thumb;
        public Integer follow_status;
        public HitTaskInfoV2 hit_task_info;
        public String nickname;
        public String sec_uid;
        public String signature;
        public Integer status;
        public String uid;
        public String unique_id;
        public Integer user_rate;

        public final SimpleUserStructV2 build() {
            SimpleUserStructV2 simpleUserStructV2 = new SimpleUserStructV2(this.uid, this.nickname, this.signature, this.avatar_thumb, this.follow_status, this.status, this.user_rate, this.avatar_larger, this.hit_task_info, this.unique_id, this.sec_uid, super.buildUnknownFields());
            return simpleUserStructV2;
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

        public final Builder hit_task_info(HitTaskInfoV2 hitTaskInfoV2) {
            this.hit_task_info = hitTaskInfoV2;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder signature(String str) {
            this.signature = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }

        public final Builder unique_id(String str) {
            this.unique_id = str;
            return this;
        }

        public final Builder user_rate(Integer num) {
            this.user_rate = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.SimpleUserStructV2$ProtoAdapter_SimpleUserStructV2 */
    static final class ProtoAdapter_SimpleUserStructV2 extends ProtoAdapter<SimpleUserStructV2> {
        public ProtoAdapter_SimpleUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, SimpleUserStructV2.class);
        }

        public final int encodedSize(SimpleUserStructV2 simpleUserStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, simpleUserStructV2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, simpleUserStructV2.nickname) + ProtoAdapter.STRING.encodedSizeWithTag(3, simpleUserStructV2.signature) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, simpleUserStructV2.avatar_thumb) + ProtoAdapter.INT32.encodedSizeWithTag(5, simpleUserStructV2.follow_status) + ProtoAdapter.INT32.encodedSizeWithTag(6, simpleUserStructV2.status) + ProtoAdapter.INT32.encodedSizeWithTag(7, simpleUserStructV2.user_rate) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, simpleUserStructV2.avatar_larger) + HitTaskInfoV2.ADAPTER.encodedSizeWithTag(9, simpleUserStructV2.hit_task_info) + ProtoAdapter.STRING.encodedSizeWithTag(10, simpleUserStructV2.unique_id) + ProtoAdapter.STRING.encodedSizeWithTag(11, simpleUserStructV2.sec_uid) + simpleUserStructV2.unknownFields().size();
        }

        public final SimpleUserStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.nickname((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.signature((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.avatar_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.follow_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.user_rate((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.avatar_larger((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.hit_task_info((HitTaskInfoV2) HitTaskInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.unique_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
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

        public final void encode(ProtoWriter protoWriter, SimpleUserStructV2 simpleUserStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, simpleUserStructV2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, simpleUserStructV2.nickname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, simpleUserStructV2.signature);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, simpleUserStructV2.avatar_thumb);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, simpleUserStructV2.follow_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, simpleUserStructV2.status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, simpleUserStructV2.user_rate);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, simpleUserStructV2.avatar_larger);
            HitTaskInfoV2.ADAPTER.encodeWithTag(protoWriter, 9, simpleUserStructV2.hit_task_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, simpleUserStructV2.unique_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, simpleUserStructV2.sec_uid);
            protoWriter.writeBytes(simpleUserStructV2.unknownFields());
        }
    }

    public SimpleUserStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.nickname = this.nickname;
        builder.signature = this.signature;
        builder.avatar_thumb = this.avatar_thumb;
        builder.follow_status = this.follow_status;
        builder.status = this.status;
        builder.user_rate = this.user_rate;
        builder.avatar_larger = this.avatar_larger;
        builder.hit_task_info = this.hit_task_info;
        builder.unique_id = this.unique_id;
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
        int i8;
        int i9;
        int i10;
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i12 = 0;
        if (this.uid != null) {
            i = this.uid.hashCode();
        } else {
            i = 0;
        }
        int i13 = (hashCode + i) * 37;
        if (this.nickname != null) {
            i2 = this.nickname.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (i13 + i2) * 37;
        if (this.signature != null) {
            i3 = this.signature.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        if (this.avatar_thumb != null) {
            i4 = this.avatar_thumb.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        if (this.follow_status != null) {
            i5 = this.follow_status.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        if (this.status != null) {
            i6 = this.status.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        if (this.user_rate != null) {
            i7 = this.user_rate.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        if (this.avatar_larger != null) {
            i8 = this.avatar_larger.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        if (this.hit_task_info != null) {
            i9 = this.hit_task_info.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        if (this.unique_id != null) {
            i10 = this.unique_id.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        if (this.sec_uid != null) {
            i12 = this.sec_uid.hashCode();
        }
        int i23 = i22 + i12;
        this.hashCode = i23;
        return i23;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.signature != null) {
            sb.append(", signature=");
            sb.append(this.signature);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatar_thumb);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=");
            sb.append(this.follow_status);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.user_rate != null) {
            sb.append(", user_rate=");
            sb.append(this.user_rate);
        }
        if (this.avatar_larger != null) {
            sb.append(", avatar_larger=");
            sb.append(this.avatar_larger);
        }
        if (this.hit_task_info != null) {
            sb.append(", hit_task_info=");
            sb.append(this.hit_task_info);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        StringBuilder replace = sb.replace(0, 2, "SimpleUserStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimpleUserStructV2)) {
            return false;
        }
        SimpleUserStructV2 simpleUserStructV2 = (SimpleUserStructV2) obj;
        if (!unknownFields().equals(simpleUserStructV2.unknownFields()) || !Internal.equals(this.uid, simpleUserStructV2.uid) || !Internal.equals(this.nickname, simpleUserStructV2.nickname) || !Internal.equals(this.signature, simpleUserStructV2.signature) || !Internal.equals(this.avatar_thumb, simpleUserStructV2.avatar_thumb) || !Internal.equals(this.follow_status, simpleUserStructV2.follow_status) || !Internal.equals(this.status, simpleUserStructV2.status) || !Internal.equals(this.user_rate, simpleUserStructV2.user_rate) || !Internal.equals(this.avatar_larger, simpleUserStructV2.avatar_larger) || !Internal.equals(this.hit_task_info, simpleUserStructV2.hit_task_info) || !Internal.equals(this.unique_id, simpleUserStructV2.unique_id) || !Internal.equals(this.sec_uid, simpleUserStructV2.sec_uid)) {
            return false;
        }
        return true;
    }

    public SimpleUserStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, Integer num, Integer num2, Integer num3, UrlStructV2 urlStructV22, HitTaskInfoV2 hitTaskInfoV2, String str4, String str5) {
        this(str, str2, str3, urlStructV2, num, num2, num3, urlStructV22, hitTaskInfoV2, str4, str5, ByteString.EMPTY);
    }

    public SimpleUserStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, Integer num, Integer num2, Integer num3, UrlStructV2 urlStructV22, HitTaskInfoV2 hitTaskInfoV2, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = str;
        this.nickname = str2;
        this.signature = str3;
        this.avatar_thumb = urlStructV2;
        this.follow_status = num;
        this.status = num2;
        this.user_rate = num3;
        this.avatar_larger = urlStructV22;
        this.hit_task_info = hitTaskInfoV2;
        this.unique_id = str4;
        this.sec_uid = str5;
    }
}
