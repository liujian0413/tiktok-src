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

/* renamed from: com.ss.ugc.aweme.proto.VideoTextStructV2 */
public final class VideoTextStructV2 extends Message<VideoTextStructV2, Builder> {
    public static final ProtoAdapter<VideoTextStructV2> ADAPTER = new ProtoAdapter_VideoTextStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String color_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;

    /* renamed from: com.ss.ugc.aweme.proto.VideoTextStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VideoTextStructV2, Builder> {
        public String color;
        public String color_text;
        public String text;
        public Integer type;

        public final VideoTextStructV2 build() {
            VideoTextStructV2 videoTextStructV2 = new VideoTextStructV2(this.text, this.color, this.color_text, this.type, super.buildUnknownFields());
            return videoTextStructV2;
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder color_text(String str) {
            this.color_text = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoTextStructV2$ProtoAdapter_VideoTextStructV2 */
    static final class ProtoAdapter_VideoTextStructV2 extends ProtoAdapter<VideoTextStructV2> {
        public ProtoAdapter_VideoTextStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoTextStructV2.class);
        }

        public final int encodedSize(VideoTextStructV2 videoTextStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoTextStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoTextStructV2.color) + ProtoAdapter.STRING.encodedSizeWithTag(3, videoTextStructV2.color_text) + ProtoAdapter.INT32.encodedSizeWithTag(4, videoTextStructV2.type) + videoTextStructV2.unknownFields().size();
        }

        public final VideoTextStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.color((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.color_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
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

        public final void encode(ProtoWriter protoWriter, VideoTextStructV2 videoTextStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoTextStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoTextStructV2.color);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoTextStructV2.color_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, videoTextStructV2.type);
            protoWriter.writeBytes(videoTextStructV2.unknownFields());
        }
    }

    public VideoTextStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.color = this.color;
        builder.color_text = this.color_text;
        builder.type = this.type;
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
        if (this.text != null) {
            i = this.text.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.color != null) {
            i2 = this.color.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.color_text != null) {
            i3 = this.color_text.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.type != null) {
            i5 = this.type.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.color_text != null) {
            sb.append(", color_text=");
            sb.append(this.color_text);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoTextStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoTextStructV2)) {
            return false;
        }
        VideoTextStructV2 videoTextStructV2 = (VideoTextStructV2) obj;
        if (!unknownFields().equals(videoTextStructV2.unknownFields()) || !Internal.equals(this.text, videoTextStructV2.text) || !Internal.equals(this.color, videoTextStructV2.color) || !Internal.equals(this.color_text, videoTextStructV2.color_text) || !Internal.equals(this.type, videoTextStructV2.type)) {
            return false;
        }
        return true;
    }

    public VideoTextStructV2(String str, String str2, String str3, Integer num) {
        this(str, str2, str3, num, ByteString.EMPTY);
    }

    public VideoTextStructV2(String str, String str2, String str3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.color = str2;
        this.color_text = str3;
        this.type = num;
    }
}
