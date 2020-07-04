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

/* renamed from: com.ss.ugc.aweme.proto.VideoControlV2 */
public final class VideoControlV2 extends Message<VideoControlV2, Builder> {
    public static final ProtoAdapter<VideoControlV2> ADAPTER = new ProtoAdapter_VideoControlV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean allow_download;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public Boolean allow_duet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public Boolean allow_dynamic_wallpaper;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public Boolean allow_react;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer draft_progress_bar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer prevent_download_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer share_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer show_progress_bar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer timer_status;

    /* renamed from: com.ss.ugc.aweme.proto.VideoControlV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VideoControlV2, Builder> {
        public Boolean allow_download;
        public Boolean allow_duet;
        public Boolean allow_dynamic_wallpaper;
        public Boolean allow_react;
        public Integer draft_progress_bar;
        public Integer prevent_download_type;
        public Integer share_type;
        public Integer show_progress_bar;
        public Integer timer_status;

        public final VideoControlV2 build() {
            VideoControlV2 videoControlV2 = new VideoControlV2(this.allow_download, this.share_type, this.show_progress_bar, this.draft_progress_bar, this.allow_duet, this.allow_react, this.prevent_download_type, this.allow_dynamic_wallpaper, this.timer_status, super.buildUnknownFields());
            return videoControlV2;
        }

        public final Builder allow_download(Boolean bool) {
            this.allow_download = bool;
            return this;
        }

        public final Builder allow_duet(Boolean bool) {
            this.allow_duet = bool;
            return this;
        }

        public final Builder allow_dynamic_wallpaper(Boolean bool) {
            this.allow_dynamic_wallpaper = bool;
            return this;
        }

        public final Builder allow_react(Boolean bool) {
            this.allow_react = bool;
            return this;
        }

        public final Builder draft_progress_bar(Integer num) {
            this.draft_progress_bar = num;
            return this;
        }

        public final Builder prevent_download_type(Integer num) {
            this.prevent_download_type = num;
            return this;
        }

        public final Builder share_type(Integer num) {
            this.share_type = num;
            return this;
        }

        public final Builder show_progress_bar(Integer num) {
            this.show_progress_bar = num;
            return this;
        }

        public final Builder timer_status(Integer num) {
            this.timer_status = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoControlV2$ProtoAdapter_VideoControlV2 */
    static final class ProtoAdapter_VideoControlV2 extends ProtoAdapter<VideoControlV2> {
        public ProtoAdapter_VideoControlV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoControlV2.class);
        }

        public final int encodedSize(VideoControlV2 videoControlV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, videoControlV2.allow_download) + ProtoAdapter.INT32.encodedSizeWithTag(2, videoControlV2.share_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, videoControlV2.show_progress_bar) + ProtoAdapter.INT32.encodedSizeWithTag(4, videoControlV2.draft_progress_bar) + ProtoAdapter.BOOL.encodedSizeWithTag(5, videoControlV2.allow_duet) + ProtoAdapter.BOOL.encodedSizeWithTag(6, videoControlV2.allow_react) + ProtoAdapter.INT32.encodedSizeWithTag(7, videoControlV2.prevent_download_type) + ProtoAdapter.BOOL.encodedSizeWithTag(8, videoControlV2.allow_dynamic_wallpaper) + ProtoAdapter.INT32.encodedSizeWithTag(9, videoControlV2.timer_status) + videoControlV2.unknownFields().size();
        }

        public final VideoControlV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.allow_download((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.share_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.show_progress_bar((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.draft_progress_bar((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.allow_duet((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.allow_react((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 7:
                            builder.prevent_download_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.allow_dynamic_wallpaper((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 9:
                            builder.timer_status((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VideoControlV2 videoControlV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoControlV2.allow_download);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, videoControlV2.share_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, videoControlV2.show_progress_bar);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, videoControlV2.draft_progress_bar);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, videoControlV2.allow_duet);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, videoControlV2.allow_react);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, videoControlV2.prevent_download_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoControlV2.allow_dynamic_wallpaper);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, videoControlV2.timer_status);
            protoWriter.writeBytes(videoControlV2.unknownFields());
        }
    }

    public VideoControlV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.allow_download = this.allow_download;
        builder.share_type = this.share_type;
        builder.show_progress_bar = this.show_progress_bar;
        builder.draft_progress_bar = this.draft_progress_bar;
        builder.allow_duet = this.allow_duet;
        builder.allow_react = this.allow_react;
        builder.prevent_download_type = this.prevent_download_type;
        builder.allow_dynamic_wallpaper = this.allow_dynamic_wallpaper;
        builder.timer_status = this.timer_status;
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
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i10 = 0;
        if (this.allow_download != null) {
            i = this.allow_download.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.share_type != null) {
            i2 = this.share_type.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        if (this.show_progress_bar != null) {
            i3 = this.show_progress_bar.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        if (this.draft_progress_bar != null) {
            i4 = this.draft_progress_bar.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.allow_duet != null) {
            i5 = this.allow_duet.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        if (this.allow_react != null) {
            i6 = this.allow_react.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        if (this.prevent_download_type != null) {
            i7 = this.prevent_download_type.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        if (this.allow_dynamic_wallpaper != null) {
            i8 = this.allow_dynamic_wallpaper.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        if (this.timer_status != null) {
            i10 = this.timer_status.hashCode();
        }
        int i19 = i18 + i10;
        this.hashCode = i19;
        return i19;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.allow_download != null) {
            sb.append(", allow_download=");
            sb.append(this.allow_download);
        }
        if (this.share_type != null) {
            sb.append(", share_type=");
            sb.append(this.share_type);
        }
        if (this.show_progress_bar != null) {
            sb.append(", show_progress_bar=");
            sb.append(this.show_progress_bar);
        }
        if (this.draft_progress_bar != null) {
            sb.append(", draft_progress_bar=");
            sb.append(this.draft_progress_bar);
        }
        if (this.allow_duet != null) {
            sb.append(", allow_duet=");
            sb.append(this.allow_duet);
        }
        if (this.allow_react != null) {
            sb.append(", allow_react=");
            sb.append(this.allow_react);
        }
        if (this.prevent_download_type != null) {
            sb.append(", prevent_download_type=");
            sb.append(this.prevent_download_type);
        }
        if (this.allow_dynamic_wallpaper != null) {
            sb.append(", allow_dynamic_wallpaper=");
            sb.append(this.allow_dynamic_wallpaper);
        }
        if (this.timer_status != null) {
            sb.append(", timer_status=");
            sb.append(this.timer_status);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoControlV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoControlV2)) {
            return false;
        }
        VideoControlV2 videoControlV2 = (VideoControlV2) obj;
        if (!unknownFields().equals(videoControlV2.unknownFields()) || !Internal.equals(this.allow_download, videoControlV2.allow_download) || !Internal.equals(this.share_type, videoControlV2.share_type) || !Internal.equals(this.show_progress_bar, videoControlV2.show_progress_bar) || !Internal.equals(this.draft_progress_bar, videoControlV2.draft_progress_bar) || !Internal.equals(this.allow_duet, videoControlV2.allow_duet) || !Internal.equals(this.allow_react, videoControlV2.allow_react) || !Internal.equals(this.prevent_download_type, videoControlV2.prevent_download_type) || !Internal.equals(this.allow_dynamic_wallpaper, videoControlV2.allow_dynamic_wallpaper) || !Internal.equals(this.timer_status, videoControlV2.timer_status)) {
            return false;
        }
        return true;
    }

    public VideoControlV2(Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Integer num4, Boolean bool4, Integer num5) {
        this(bool, num, num2, num3, bool2, bool3, num4, bool4, num5, ByteString.EMPTY);
    }

    public VideoControlV2(Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Integer num4, Boolean bool4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.allow_download = bool;
        this.share_type = num;
        this.show_progress_bar = num2;
        this.draft_progress_bar = num3;
        this.allow_duet = bool2;
        this.allow_react = bool3;
        this.prevent_download_type = num4;
        this.allow_dynamic_wallpaper = bool4;
        this.timer_status = num5;
    }
}
