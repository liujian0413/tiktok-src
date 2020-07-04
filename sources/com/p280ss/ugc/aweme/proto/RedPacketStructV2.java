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

/* renamed from: com.ss.ugc.aweme.proto.RedPacketStructV2 */
final class RedPacketStructV2 extends Message<RedPacketStructV2, Builder> {
    public static final ProtoAdapter<RedPacketStructV2> ADAPTER = new ProtoAdapter_RedPacketStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 8)
    public UrlStructV2 default_voice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long seckill_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String star_name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 11)
    public UrlStructV2 tag_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long till_seckill_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String timestamp_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 7)
    public UrlStructV2 voice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public Integer voice_end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer voice_start;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String words;

    /* renamed from: com.ss.ugc.aweme.proto.RedPacketStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RedPacketStructV2, Builder> {
        public UrlStructV2 default_voice;
        public Long seckill_time;
        public String star_name;
        public UrlStructV2 tag_icon;
        public Long till_seckill_time;
        public String timestamp_info;
        public Integer type;
        public UrlStructV2 voice;
        public Integer voice_end;
        public Integer voice_start;
        public String words;

        public final RedPacketStructV2 build() {
            RedPacketStructV2 redPacketStructV2 = new RedPacketStructV2(this.type, this.till_seckill_time, this.seckill_time, this.star_name, this.words, this.timestamp_info, this.voice, this.default_voice, this.voice_start, this.voice_end, this.tag_icon, super.buildUnknownFields());
            return redPacketStructV2;
        }

        public final Builder default_voice(UrlStructV2 urlStructV2) {
            this.default_voice = urlStructV2;
            return this;
        }

        public final Builder seckill_time(Long l) {
            this.seckill_time = l;
            return this;
        }

        public final Builder star_name(String str) {
            this.star_name = str;
            return this;
        }

        public final Builder tag_icon(UrlStructV2 urlStructV2) {
            this.tag_icon = urlStructV2;
            return this;
        }

        public final Builder till_seckill_time(Long l) {
            this.till_seckill_time = l;
            return this;
        }

        public final Builder timestamp_info(String str) {
            this.timestamp_info = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder voice(UrlStructV2 urlStructV2) {
            this.voice = urlStructV2;
            return this;
        }

        public final Builder voice_end(Integer num) {
            this.voice_end = num;
            return this;
        }

        public final Builder voice_start(Integer num) {
            this.voice_start = num;
            return this;
        }

        public final Builder words(String str) {
            this.words = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RedPacketStructV2$ProtoAdapter_RedPacketStructV2 */
    static final class ProtoAdapter_RedPacketStructV2 extends ProtoAdapter<RedPacketStructV2> {
        public ProtoAdapter_RedPacketStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RedPacketStructV2.class);
        }

        public final int encodedSize(RedPacketStructV2 redPacketStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, redPacketStructV2.type) + ProtoAdapter.INT64.encodedSizeWithTag(2, redPacketStructV2.till_seckill_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, redPacketStructV2.seckill_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, redPacketStructV2.star_name) + ProtoAdapter.STRING.encodedSizeWithTag(5, redPacketStructV2.words) + ProtoAdapter.STRING.encodedSizeWithTag(6, redPacketStructV2.timestamp_info) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, redPacketStructV2.voice) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, redPacketStructV2.default_voice) + ProtoAdapter.INT32.encodedSizeWithTag(9, redPacketStructV2.voice_start) + ProtoAdapter.INT32.encodedSizeWithTag(10, redPacketStructV2.voice_end) + UrlStructV2.ADAPTER.encodedSizeWithTag(11, redPacketStructV2.tag_icon) + redPacketStructV2.unknownFields().size();
        }

        public final RedPacketStructV2 decode(ProtoReader protoReader) throws IOException {
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
                            builder.till_seckill_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.seckill_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.star_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.words((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.timestamp_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.voice((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.default_voice((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.voice_start((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.voice_end((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.tag_icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RedPacketStructV2 redPacketStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, redPacketStructV2.type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, redPacketStructV2.till_seckill_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, redPacketStructV2.seckill_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, redPacketStructV2.star_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, redPacketStructV2.words);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, redPacketStructV2.timestamp_info);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, redPacketStructV2.voice);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, redPacketStructV2.default_voice);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, redPacketStructV2.voice_start);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, redPacketStructV2.voice_end);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 11, redPacketStructV2.tag_icon);
            protoWriter.writeBytes(redPacketStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.till_seckill_time = this.till_seckill_time;
        builder.seckill_time = this.seckill_time;
        builder.star_name = this.star_name;
        builder.words = this.words;
        builder.timestamp_info = this.timestamp_info;
        builder.voice = this.voice;
        builder.default_voice = this.default_voice;
        builder.voice_start = this.voice_start;
        builder.voice_end = this.voice_end;
        builder.tag_icon = this.tag_icon;
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
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i13 = (hashCode + i) * 37;
        if (this.till_seckill_time != null) {
            i2 = this.till_seckill_time.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (i13 + i2) * 37;
        if (this.seckill_time != null) {
            i3 = this.seckill_time.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        if (this.star_name != null) {
            i4 = this.star_name.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        if (this.words != null) {
            i5 = this.words.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        if (this.timestamp_info != null) {
            i6 = this.timestamp_info.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        if (this.voice != null) {
            i7 = this.voice.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        if (this.default_voice != null) {
            i8 = this.default_voice.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        if (this.voice_start != null) {
            i9 = this.voice_start.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        if (this.voice_end != null) {
            i10 = this.voice_end.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        if (this.tag_icon != null) {
            i12 = this.tag_icon.hashCode();
        }
        int i23 = i22 + i12;
        this.hashCode = i23;
        return i23;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.till_seckill_time != null) {
            sb.append(", till_seckill_time=");
            sb.append(this.till_seckill_time);
        }
        if (this.seckill_time != null) {
            sb.append(", seckill_time=");
            sb.append(this.seckill_time);
        }
        if (this.star_name != null) {
            sb.append(", star_name=");
            sb.append(this.star_name);
        }
        if (this.words != null) {
            sb.append(", words=");
            sb.append(this.words);
        }
        if (this.timestamp_info != null) {
            sb.append(", timestamp_info=");
            sb.append(this.timestamp_info);
        }
        if (this.voice != null) {
            sb.append(", voice=");
            sb.append(this.voice);
        }
        if (this.default_voice != null) {
            sb.append(", default_voice=");
            sb.append(this.default_voice);
        }
        if (this.voice_start != null) {
            sb.append(", voice_start=");
            sb.append(this.voice_start);
        }
        if (this.voice_end != null) {
            sb.append(", voice_end=");
            sb.append(this.voice_end);
        }
        if (this.tag_icon != null) {
            sb.append(", tag_icon=");
            sb.append(this.tag_icon);
        }
        StringBuilder replace = sb.replace(0, 2, "RedPacketStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPacketStructV2)) {
            return false;
        }
        RedPacketStructV2 redPacketStructV2 = (RedPacketStructV2) obj;
        if (!unknownFields().equals(redPacketStructV2.unknownFields()) || !Internal.equals(this.type, redPacketStructV2.type) || !Internal.equals(this.till_seckill_time, redPacketStructV2.till_seckill_time) || !Internal.equals(this.seckill_time, redPacketStructV2.seckill_time) || !Internal.equals(this.star_name, redPacketStructV2.star_name) || !Internal.equals(this.words, redPacketStructV2.words) || !Internal.equals(this.timestamp_info, redPacketStructV2.timestamp_info) || !Internal.equals(this.voice, redPacketStructV2.voice) || !Internal.equals(this.default_voice, redPacketStructV2.default_voice) || !Internal.equals(this.voice_start, redPacketStructV2.voice_start) || !Internal.equals(this.voice_end, redPacketStructV2.voice_end) || !Internal.equals(this.tag_icon, redPacketStructV2.tag_icon)) {
            return false;
        }
        return true;
    }

    public RedPacketStructV2(Integer num, Long l, Long l2, String str, String str2, String str3, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num2, Integer num3, UrlStructV2 urlStructV23) {
        this(num, l, l2, str, str2, str3, urlStructV2, urlStructV22, num2, num3, urlStructV23, ByteString.EMPTY);
    }

    public RedPacketStructV2(Integer num, Long l, Long l2, String str, String str2, String str3, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num2, Integer num3, UrlStructV2 urlStructV23, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.till_seckill_time = l;
        this.seckill_time = l2;
        this.star_name = str;
        this.words = str2;
        this.timestamp_info = str3;
        this.voice = urlStructV2;
        this.default_voice = urlStructV22;
        this.voice_start = num2;
        this.voice_end = num3;
        this.tag_icon = urlStructV23;
    }
}
