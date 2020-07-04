package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.VideoStructV2 */
public final class VideoStructV2 extends Message<VideoStructV2, Builder> {
    public static final ProtoAdapter<VideoStructV2> ADAPTER = new ProtoAdapter_VideoStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.BitRateStructV2#ADAPTER", label = Label.REPEATED, tag = 11)
    public List<BitRateStructV2> bit_rate;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 20)
    public UrlStructV2 caption_download_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 21)
    public Long cdn_url_expired;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 8)
    public UrlStructV2 download_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 14)
    public UrlStructV2 download_suffix_logo_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer duration;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 5)
    public UrlStructV2 dynamic_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 15)
    public Boolean has_download_suffix_logo_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public Boolean has_watermark;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer is_h265;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 22)
    public Integer is_long_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 24)
    public Integer need_set_token;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 12)
    public UrlStructV2 new_download_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 6)
    public UrlStructV2 origin_cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 play_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 play_addr_265;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 18)
    public UrlStructV2 play_addr_h264;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 10)
    public UrlStructV2 play_addr_lowbr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String ratio;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 19)
    public UrlStructV2 ui_alike_download_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 23)
    public String video_model;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer width;

    /* renamed from: com.ss.ugc.aweme.proto.VideoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VideoStructV2, Builder> {
        public List<BitRateStructV2> bit_rate = Internal.newMutableList();
        public UrlStructV2 caption_download_addr;
        public Long cdn_url_expired;
        public UrlStructV2 cover;
        public UrlStructV2 download_addr;
        public UrlStructV2 download_suffix_logo_addr;
        public Integer duration;
        public UrlStructV2 dynamic_cover;
        public Boolean has_download_suffix_logo_addr;
        public Boolean has_watermark;
        public Integer height;
        public Integer is_h265;
        public Integer is_long_video;
        public Integer need_set_token;
        public UrlStructV2 new_download_addr;
        public UrlStructV2 origin_cover;
        public UrlStructV2 play_addr;
        public UrlStructV2 play_addr_265;
        public UrlStructV2 play_addr_h264;
        public UrlStructV2 play_addr_lowbr;
        public String ratio;
        public UrlStructV2 ui_alike_download_addr;
        public String video_model;
        public Integer width;

        public final VideoStructV2 build() {
            VideoStructV2 videoStructV2 = new VideoStructV2(this.play_addr, this.cover, this.height, this.width, this.dynamic_cover, this.origin_cover, this.ratio, this.download_addr, this.has_watermark, this.play_addr_lowbr, this.bit_rate, this.new_download_addr, this.duration, this.download_suffix_logo_addr, this.has_download_suffix_logo_addr, this.play_addr_265, this.is_h265, this.play_addr_h264, this.ui_alike_download_addr, this.caption_download_addr, this.cdn_url_expired, this.is_long_video, this.video_model, this.need_set_token, super.buildUnknownFields());
            return videoStructV2;
        }

        public final Builder caption_download_addr(UrlStructV2 urlStructV2) {
            this.caption_download_addr = urlStructV2;
            return this;
        }

        public final Builder cdn_url_expired(Long l) {
            this.cdn_url_expired = l;
            return this;
        }

        public final Builder cover(UrlStructV2 urlStructV2) {
            this.cover = urlStructV2;
            return this;
        }

        public final Builder download_addr(UrlStructV2 urlStructV2) {
            this.download_addr = urlStructV2;
            return this;
        }

        public final Builder download_suffix_logo_addr(UrlStructV2 urlStructV2) {
            this.download_suffix_logo_addr = urlStructV2;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }

        public final Builder has_download_suffix_logo_addr(Boolean bool) {
            this.has_download_suffix_logo_addr = bool;
            return this;
        }

        public final Builder has_watermark(Boolean bool) {
            this.has_watermark = bool;
            return this;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder is_h265(Integer num) {
            this.is_h265 = num;
            return this;
        }

        public final Builder is_long_video(Integer num) {
            this.is_long_video = num;
            return this;
        }

        public final Builder need_set_token(Integer num) {
            this.need_set_token = num;
            return this;
        }

        public final Builder new_download_addr(UrlStructV2 urlStructV2) {
            this.new_download_addr = urlStructV2;
            return this;
        }

        public final Builder origin_cover(UrlStructV2 urlStructV2) {
            this.origin_cover = urlStructV2;
            return this;
        }

        public final Builder play_addr(UrlStructV2 urlStructV2) {
            this.play_addr = urlStructV2;
            return this;
        }

        public final Builder play_addr_265(UrlStructV2 urlStructV2) {
            this.play_addr_265 = urlStructV2;
            return this;
        }

        public final Builder play_addr_h264(UrlStructV2 urlStructV2) {
            this.play_addr_h264 = urlStructV2;
            return this;
        }

        public final Builder play_addr_lowbr(UrlStructV2 urlStructV2) {
            this.play_addr_lowbr = urlStructV2;
            return this;
        }

        public final Builder ratio(String str) {
            this.ratio = str;
            return this;
        }

        public final Builder ui_alike_download_addr(UrlStructV2 urlStructV2) {
            this.ui_alike_download_addr = urlStructV2;
            return this;
        }

        public final Builder video_model(String str) {
            this.video_model = str;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }

        public final Builder bit_rate(List<BitRateStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.bit_rate = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoStructV2$ProtoAdapter_VideoStructV2 */
    static final class ProtoAdapter_VideoStructV2 extends ProtoAdapter<VideoStructV2> {
        public ProtoAdapter_VideoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoStructV2.class);
        }

        public final VideoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.play_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.height((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.width((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.dynamic_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.origin_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.ratio((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.download_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.has_watermark((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 10:
                            builder.play_addr_lowbr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.bit_rate.add(BitRateStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.new_download_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.download_suffix_logo_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.has_download_suffix_logo_addr((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 16:
                            builder.play_addr_265((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.is_h265((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.play_addr_h264((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.ui_alike_download_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            builder.caption_download_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            builder.cdn_url_expired((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 22:
                            builder.is_long_video((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 23:
                            builder.video_model((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24:
                            builder.need_set_token((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final int encodedSize(VideoStructV2 videoStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, videoStructV2.play_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, videoStructV2.cover) + ProtoAdapter.INT32.encodedSizeWithTag(3, videoStructV2.height) + ProtoAdapter.INT32.encodedSizeWithTag(4, videoStructV2.width) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, videoStructV2.dynamic_cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, videoStructV2.origin_cover) + ProtoAdapter.STRING.encodedSizeWithTag(7, videoStructV2.ratio) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, videoStructV2.download_addr) + ProtoAdapter.BOOL.encodedSizeWithTag(9, videoStructV2.has_watermark) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, videoStructV2.play_addr_lowbr) + BitRateStructV2.ADAPTER.asRepeated().encodedSizeWithTag(11, videoStructV2.bit_rate) + UrlStructV2.ADAPTER.encodedSizeWithTag(12, videoStructV2.new_download_addr) + ProtoAdapter.INT32.encodedSizeWithTag(13, videoStructV2.duration) + UrlStructV2.ADAPTER.encodedSizeWithTag(14, videoStructV2.download_suffix_logo_addr) + ProtoAdapter.BOOL.encodedSizeWithTag(15, videoStructV2.has_download_suffix_logo_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, videoStructV2.play_addr_265) + ProtoAdapter.INT32.encodedSizeWithTag(17, videoStructV2.is_h265) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, videoStructV2.play_addr_h264) + UrlStructV2.ADAPTER.encodedSizeWithTag(19, videoStructV2.ui_alike_download_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(20, videoStructV2.caption_download_addr) + ProtoAdapter.INT64.encodedSizeWithTag(21, videoStructV2.cdn_url_expired) + ProtoAdapter.INT32.encodedSizeWithTag(22, videoStructV2.is_long_video) + ProtoAdapter.STRING.encodedSizeWithTag(23, videoStructV2.video_model) + ProtoAdapter.INT32.encodedSizeWithTag(24, videoStructV2.need_set_token) + videoStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VideoStructV2 videoStructV2) throws IOException {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, videoStructV2.play_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, videoStructV2.cover);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, videoStructV2.height);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, videoStructV2.width);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, videoStructV2.dynamic_cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, videoStructV2.origin_cover);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoStructV2.ratio);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, videoStructV2.download_addr);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoStructV2.has_watermark);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, videoStructV2.play_addr_lowbr);
            BitRateStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, videoStructV2.bit_rate);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 12, videoStructV2.new_download_addr);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, videoStructV2.duration);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 14, videoStructV2.download_suffix_logo_addr);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, videoStructV2.has_download_suffix_logo_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, videoStructV2.play_addr_265);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, videoStructV2.is_h265);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, videoStructV2.play_addr_h264);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 19, videoStructV2.ui_alike_download_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 20, videoStructV2.caption_download_addr);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, videoStructV2.cdn_url_expired);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, videoStructV2.is_long_video);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, videoStructV2.video_model);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, videoStructV2.need_set_token);
            protoWriter.writeBytes(videoStructV2.unknownFields());
        }
    }

    public VideoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.play_addr = this.play_addr;
        builder.cover = this.cover;
        builder.height = this.height;
        builder.width = this.width;
        builder.dynamic_cover = this.dynamic_cover;
        builder.origin_cover = this.origin_cover;
        builder.ratio = this.ratio;
        builder.download_addr = this.download_addr;
        builder.has_watermark = this.has_watermark;
        builder.play_addr_lowbr = this.play_addr_lowbr;
        builder.bit_rate = Internal.copyOf("bit_rate", this.bit_rate);
        builder.new_download_addr = this.new_download_addr;
        builder.duration = this.duration;
        builder.download_suffix_logo_addr = this.download_suffix_logo_addr;
        builder.has_download_suffix_logo_addr = this.has_download_suffix_logo_addr;
        builder.play_addr_265 = this.play_addr_265;
        builder.is_h265 = this.is_h265;
        builder.play_addr_h264 = this.play_addr_h264;
        builder.ui_alike_download_addr = this.ui_alike_download_addr;
        builder.caption_download_addr = this.caption_download_addr;
        builder.cdn_url_expired = this.cdn_url_expired;
        builder.is_long_video = this.is_long_video;
        builder.video_model = this.video_model;
        builder.need_set_token = this.need_set_token;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = this.hashCode;
        if (i23 != 0) {
            return i23;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i24 = 0;
        if (this.play_addr != null) {
            i = this.play_addr.hashCode();
        } else {
            i = 0;
        }
        int i25 = (hashCode + i) * 37;
        if (this.cover != null) {
            i2 = this.cover.hashCode();
        } else {
            i2 = 0;
        }
        int i26 = (i25 + i2) * 37;
        if (this.height != null) {
            i3 = this.height.hashCode();
        } else {
            i3 = 0;
        }
        int i27 = (i26 + i3) * 37;
        if (this.width != null) {
            i4 = this.width.hashCode();
        } else {
            i4 = 0;
        }
        int i28 = (i27 + i4) * 37;
        if (this.dynamic_cover != null) {
            i5 = this.dynamic_cover.hashCode();
        } else {
            i5 = 0;
        }
        int i29 = (i28 + i5) * 37;
        if (this.origin_cover != null) {
            i6 = this.origin_cover.hashCode();
        } else {
            i6 = 0;
        }
        int i30 = (i29 + i6) * 37;
        if (this.ratio != null) {
            i7 = this.ratio.hashCode();
        } else {
            i7 = 0;
        }
        int i31 = (i30 + i7) * 37;
        if (this.download_addr != null) {
            i8 = this.download_addr.hashCode();
        } else {
            i8 = 0;
        }
        int i32 = (i31 + i8) * 37;
        if (this.has_watermark != null) {
            i9 = this.has_watermark.hashCode();
        } else {
            i9 = 0;
        }
        int i33 = (i32 + i9) * 37;
        if (this.play_addr_lowbr != null) {
            i10 = this.play_addr_lowbr.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((i33 + i10) * 37) + this.bit_rate.hashCode()) * 37;
        if (this.new_download_addr != null) {
            i11 = this.new_download_addr.hashCode();
        } else {
            i11 = 0;
        }
        int i34 = (hashCode2 + i11) * 37;
        if (this.duration != null) {
            i12 = this.duration.hashCode();
        } else {
            i12 = 0;
        }
        int i35 = (i34 + i12) * 37;
        if (this.download_suffix_logo_addr != null) {
            i13 = this.download_suffix_logo_addr.hashCode();
        } else {
            i13 = 0;
        }
        int i36 = (i35 + i13) * 37;
        if (this.has_download_suffix_logo_addr != null) {
            i14 = this.has_download_suffix_logo_addr.hashCode();
        } else {
            i14 = 0;
        }
        int i37 = (i36 + i14) * 37;
        if (this.play_addr_265 != null) {
            i15 = this.play_addr_265.hashCode();
        } else {
            i15 = 0;
        }
        int i38 = (i37 + i15) * 37;
        if (this.is_h265 != null) {
            i16 = this.is_h265.hashCode();
        } else {
            i16 = 0;
        }
        int i39 = (i38 + i16) * 37;
        if (this.play_addr_h264 != null) {
            i17 = this.play_addr_h264.hashCode();
        } else {
            i17 = 0;
        }
        int i40 = (i39 + i17) * 37;
        if (this.ui_alike_download_addr != null) {
            i18 = this.ui_alike_download_addr.hashCode();
        } else {
            i18 = 0;
        }
        int i41 = (i40 + i18) * 37;
        if (this.caption_download_addr != null) {
            i19 = this.caption_download_addr.hashCode();
        } else {
            i19 = 0;
        }
        int i42 = (i41 + i19) * 37;
        if (this.cdn_url_expired != null) {
            i20 = this.cdn_url_expired.hashCode();
        } else {
            i20 = 0;
        }
        int i43 = (i42 + i20) * 37;
        if (this.is_long_video != null) {
            i21 = this.is_long_video.hashCode();
        } else {
            i21 = 0;
        }
        int i44 = (i43 + i21) * 37;
        if (this.video_model != null) {
            i22 = this.video_model.hashCode();
        } else {
            i22 = 0;
        }
        int i45 = (i44 + i22) * 37;
        if (this.need_set_token != null) {
            i24 = this.need_set_token.hashCode();
        }
        int i46 = i45 + i24;
        this.hashCode = i46;
        return i46;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.play_addr != null) {
            sb.append(", play_addr=");
            sb.append(this.play_addr);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=");
            sb.append(this.dynamic_cover);
        }
        if (this.origin_cover != null) {
            sb.append(", origin_cover=");
            sb.append(this.origin_cover);
        }
        if (this.ratio != null) {
            sb.append(", ratio=");
            sb.append(this.ratio);
        }
        if (this.download_addr != null) {
            sb.append(", download_addr=");
            sb.append(this.download_addr);
        }
        if (this.has_watermark != null) {
            sb.append(", has_watermark=");
            sb.append(this.has_watermark);
        }
        if (this.play_addr_lowbr != null) {
            sb.append(", play_addr_lowbr=");
            sb.append(this.play_addr_lowbr);
        }
        if (!this.bit_rate.isEmpty()) {
            sb.append(", bit_rate=");
            sb.append(this.bit_rate);
        }
        if (this.new_download_addr != null) {
            sb.append(", new_download_addr=");
            sb.append(this.new_download_addr);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.download_suffix_logo_addr != null) {
            sb.append(", download_suffix_logo_addr=");
            sb.append(this.download_suffix_logo_addr);
        }
        if (this.has_download_suffix_logo_addr != null) {
            sb.append(", has_download_suffix_logo_addr=");
            sb.append(this.has_download_suffix_logo_addr);
        }
        if (this.play_addr_265 != null) {
            sb.append(", play_addr_265=");
            sb.append(this.play_addr_265);
        }
        if (this.is_h265 != null) {
            sb.append(", is_h265=");
            sb.append(this.is_h265);
        }
        if (this.play_addr_h264 != null) {
            sb.append(", play_addr_h264=");
            sb.append(this.play_addr_h264);
        }
        if (this.ui_alike_download_addr != null) {
            sb.append(", ui_alike_download_addr=");
            sb.append(this.ui_alike_download_addr);
        }
        if (this.caption_download_addr != null) {
            sb.append(", caption_download_addr=");
            sb.append(this.caption_download_addr);
        }
        if (this.cdn_url_expired != null) {
            sb.append(", cdn_url_expired=");
            sb.append(this.cdn_url_expired);
        }
        if (this.is_long_video != null) {
            sb.append(", is_long_video=");
            sb.append(this.is_long_video);
        }
        if (this.video_model != null) {
            sb.append(", video_model=");
            sb.append(this.video_model);
        }
        if (this.need_set_token != null) {
            sb.append(", need_set_token=");
            sb.append(this.need_set_token);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoStructV2)) {
            return false;
        }
        VideoStructV2 videoStructV2 = (VideoStructV2) obj;
        if (!unknownFields().equals(videoStructV2.unknownFields()) || !Internal.equals(this.play_addr, videoStructV2.play_addr) || !Internal.equals(this.cover, videoStructV2.cover) || !Internal.equals(this.height, videoStructV2.height) || !Internal.equals(this.width, videoStructV2.width) || !Internal.equals(this.dynamic_cover, videoStructV2.dynamic_cover) || !Internal.equals(this.origin_cover, videoStructV2.origin_cover) || !Internal.equals(this.ratio, videoStructV2.ratio) || !Internal.equals(this.download_addr, videoStructV2.download_addr) || !Internal.equals(this.has_watermark, videoStructV2.has_watermark) || !Internal.equals(this.play_addr_lowbr, videoStructV2.play_addr_lowbr) || !this.bit_rate.equals(videoStructV2.bit_rate) || !Internal.equals(this.new_download_addr, videoStructV2.new_download_addr) || !Internal.equals(this.duration, videoStructV2.duration) || !Internal.equals(this.download_suffix_logo_addr, videoStructV2.download_suffix_logo_addr) || !Internal.equals(this.has_download_suffix_logo_addr, videoStructV2.has_download_suffix_logo_addr) || !Internal.equals(this.play_addr_265, videoStructV2.play_addr_265) || !Internal.equals(this.is_h265, videoStructV2.is_h265) || !Internal.equals(this.play_addr_h264, videoStructV2.play_addr_h264) || !Internal.equals(this.ui_alike_download_addr, videoStructV2.ui_alike_download_addr) || !Internal.equals(this.caption_download_addr, videoStructV2.caption_download_addr) || !Internal.equals(this.cdn_url_expired, videoStructV2.cdn_url_expired) || !Internal.equals(this.is_long_video, videoStructV2.is_long_video) || !Internal.equals(this.video_model, videoStructV2.video_model) || !Internal.equals(this.need_set_token, videoStructV2.need_set_token)) {
            return false;
        }
        return true;
    }

    public VideoStructV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num, Integer num2, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, String str, UrlStructV2 urlStructV25, Boolean bool, UrlStructV2 urlStructV26, List<BitRateStructV2> list, UrlStructV2 urlStructV27, Integer num3, UrlStructV2 urlStructV28, Boolean bool2, UrlStructV2 urlStructV29, Integer num4, UrlStructV2 urlStructV210, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, Long l, Integer num5, String str2, Integer num6) {
        this(urlStructV2, urlStructV22, num, num2, urlStructV23, urlStructV24, str, urlStructV25, bool, urlStructV26, list, urlStructV27, num3, urlStructV28, bool2, urlStructV29, num4, urlStructV210, urlStructV211, urlStructV212, l, num5, str2, num6, ByteString.EMPTY);
    }

    public VideoStructV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num, Integer num2, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, String str, UrlStructV2 urlStructV25, Boolean bool, UrlStructV2 urlStructV26, List<BitRateStructV2> list, UrlStructV2 urlStructV27, Integer num3, UrlStructV2 urlStructV28, Boolean bool2, UrlStructV2 urlStructV29, Integer num4, UrlStructV2 urlStructV210, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, Long l, Integer num5, String str2, Integer num6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.play_addr = urlStructV2;
        this.cover = urlStructV22;
        this.height = num;
        this.width = num2;
        this.dynamic_cover = urlStructV23;
        this.origin_cover = urlStructV24;
        this.ratio = str;
        this.download_addr = urlStructV25;
        this.has_watermark = bool;
        this.play_addr_lowbr = urlStructV26;
        List<BitRateStructV2> list2 = list;
        this.bit_rate = Internal.immutableCopyOf("bit_rate", list);
        this.new_download_addr = urlStructV27;
        this.duration = num3;
        this.download_suffix_logo_addr = urlStructV28;
        this.has_download_suffix_logo_addr = bool2;
        this.play_addr_265 = urlStructV29;
        this.is_h265 = num4;
        this.play_addr_h264 = urlStructV210;
        this.ui_alike_download_addr = urlStructV211;
        this.caption_download_addr = urlStructV212;
        this.cdn_url_expired = l;
        this.is_long_video = num5;
        this.video_model = str2;
        this.need_set_token = num6;
    }
}
