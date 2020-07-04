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

/* renamed from: com.ss.ugc.aweme.proto.LongVideoStructV2 */
public final class LongVideoStructV2 extends Message<LongVideoStructV2, Builder> {
    public static final ProtoAdapter<LongVideoStructV2> ADAPTER = new ProtoAdapter_LongVideoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer long_video_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double trailer_start_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoStructV2#ADAPTER", tag = 1)
    public VideoStructV2 video;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoControlV2#ADAPTER", tag = 4)
    public VideoControlV2 video_control;

    /* renamed from: com.ss.ugc.aweme.proto.LongVideoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LongVideoStructV2, Builder> {
        public Integer long_video_type;
        public Double trailer_start_time;
        public VideoStructV2 video;
        public VideoControlV2 video_control;

        public final LongVideoStructV2 build() {
            LongVideoStructV2 longVideoStructV2 = new LongVideoStructV2(this.video, this.long_video_type, this.trailer_start_time, this.video_control, super.buildUnknownFields());
            return longVideoStructV2;
        }

        public final Builder long_video_type(Integer num) {
            this.long_video_type = num;
            return this;
        }

        public final Builder trailer_start_time(Double d) {
            this.trailer_start_time = d;
            return this;
        }

        public final Builder video(VideoStructV2 videoStructV2) {
            this.video = videoStructV2;
            return this;
        }

        public final Builder video_control(VideoControlV2 videoControlV2) {
            this.video_control = videoControlV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LongVideoStructV2$ProtoAdapter_LongVideoStructV2 */
    static final class ProtoAdapter_LongVideoStructV2 extends ProtoAdapter<LongVideoStructV2> {
        public ProtoAdapter_LongVideoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LongVideoStructV2.class);
        }

        public final int encodedSize(LongVideoStructV2 longVideoStructV2) {
            return VideoStructV2.ADAPTER.encodedSizeWithTag(1, longVideoStructV2.video) + ProtoAdapter.INT32.encodedSizeWithTag(2, longVideoStructV2.long_video_type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, longVideoStructV2.trailer_start_time) + VideoControlV2.ADAPTER.encodedSizeWithTag(4, longVideoStructV2.video_control) + longVideoStructV2.unknownFields().size();
        }

        public final LongVideoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.video((VideoStructV2) VideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.long_video_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.trailer_start_time((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 4:
                            builder.video_control((VideoControlV2) VideoControlV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, LongVideoStructV2 longVideoStructV2) throws IOException {
            VideoStructV2.ADAPTER.encodeWithTag(protoWriter, 1, longVideoStructV2.video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, longVideoStructV2.long_video_type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, longVideoStructV2.trailer_start_time);
            VideoControlV2.ADAPTER.encodeWithTag(protoWriter, 4, longVideoStructV2.video_control);
            protoWriter.writeBytes(longVideoStructV2.unknownFields());
        }
    }

    public LongVideoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.video = this.video;
        builder.long_video_type = this.long_video_type;
        builder.trailer_start_time = this.trailer_start_time;
        builder.video_control = this.video_control;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.video != null) {
            i = this.video.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.long_video_type != null) {
            i2 = this.long_video_type.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.trailer_start_time != null) {
            i3 = this.trailer_start_time.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.video_control != null) {
            i5 = this.video_control.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.long_video_type != null) {
            sb.append(", long_video_type=");
            sb.append(this.long_video_type);
        }
        if (this.trailer_start_time != null) {
            sb.append(", trailer_start_time=");
            sb.append(this.trailer_start_time);
        }
        if (this.video_control != null) {
            sb.append(", video_control=");
            sb.append(this.video_control);
        }
        StringBuilder replace = sb.replace(0, 2, "LongVideoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongVideoStructV2)) {
            return false;
        }
        LongVideoStructV2 longVideoStructV2 = (LongVideoStructV2) obj;
        if (!unknownFields().equals(longVideoStructV2.unknownFields()) || !Internal.equals(this.video, longVideoStructV2.video) || !Internal.equals(this.long_video_type, longVideoStructV2.long_video_type) || !Internal.equals(this.trailer_start_time, longVideoStructV2.trailer_start_time) || !Internal.equals(this.video_control, longVideoStructV2.video_control)) {
            return false;
        }
        return true;
    }

    public LongVideoStructV2(VideoStructV2 videoStructV2, Integer num, Double d, VideoControlV2 videoControlV2) {
        this(videoStructV2, num, d, videoControlV2, ByteString.EMPTY);
    }

    public LongVideoStructV2(VideoStructV2 videoStructV2, Integer num, Double d, VideoControlV2 videoControlV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video = videoStructV2;
        this.long_video_type = num;
        this.trailer_start_time = d;
        this.video_control = videoControlV2;
    }
}
