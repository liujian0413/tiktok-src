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

/* renamed from: com.ss.ugc.aweme.proto.OriginalMusicianStructV2 */
public final class OriginalMusicianStructV2 extends Message<OriginalMusicianStructV2, Builder> {
    public static final ProtoAdapter<OriginalMusicianStructV2> ADAPTER = new ProtoAdapter_OriginalMusicianStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer music_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 music_cover_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 music_qrcode_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer music_used_count;

    /* renamed from: com.ss.ugc.aweme.proto.OriginalMusicianStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<OriginalMusicianStructV2, Builder> {
        public Integer digg_count;
        public Integer music_count;
        public UrlStructV2 music_cover_url;
        public UrlStructV2 music_qrcode_url;
        public Integer music_used_count;

        public final OriginalMusicianStructV2 build() {
            OriginalMusicianStructV2 originalMusicianStructV2 = new OriginalMusicianStructV2(this.music_count, this.music_used_count, this.music_qrcode_url, this.music_cover_url, this.digg_count, super.buildUnknownFields());
            return originalMusicianStructV2;
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
            return this;
        }

        public final Builder music_count(Integer num) {
            this.music_count = num;
            return this;
        }

        public final Builder music_cover_url(UrlStructV2 urlStructV2) {
            this.music_cover_url = urlStructV2;
            return this;
        }

        public final Builder music_qrcode_url(UrlStructV2 urlStructV2) {
            this.music_qrcode_url = urlStructV2;
            return this;
        }

        public final Builder music_used_count(Integer num) {
            this.music_used_count = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.OriginalMusicianStructV2$ProtoAdapter_OriginalMusicianStructV2 */
    static final class ProtoAdapter_OriginalMusicianStructV2 extends ProtoAdapter<OriginalMusicianStructV2> {
        public ProtoAdapter_OriginalMusicianStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, OriginalMusicianStructV2.class);
        }

        public final int encodedSize(OriginalMusicianStructV2 originalMusicianStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, originalMusicianStructV2.music_count) + ProtoAdapter.INT32.encodedSizeWithTag(2, originalMusicianStructV2.music_used_count) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, originalMusicianStructV2.music_qrcode_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, originalMusicianStructV2.music_cover_url) + ProtoAdapter.INT32.encodedSizeWithTag(5, originalMusicianStructV2.digg_count) + originalMusicianStructV2.unknownFields().size();
        }

        public final OriginalMusicianStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.music_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.music_used_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.music_qrcode_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.music_cover_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.digg_count((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, OriginalMusicianStructV2 originalMusicianStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, originalMusicianStructV2.music_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, originalMusicianStructV2.music_used_count);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, originalMusicianStructV2.music_qrcode_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, originalMusicianStructV2.music_cover_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, originalMusicianStructV2.digg_count);
            protoWriter.writeBytes(originalMusicianStructV2.unknownFields());
        }
    }

    public OriginalMusicianStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.music_count = this.music_count;
        builder.music_used_count = this.music_used_count;
        builder.music_qrcode_url = this.music_qrcode_url;
        builder.music_cover_url = this.music_cover_url;
        builder.digg_count = this.digg_count;
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
        if (this.music_count != null) {
            i = this.music_count.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.music_used_count != null) {
            i2 = this.music_used_count.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.music_qrcode_url != null) {
            i3 = this.music_qrcode_url.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.music_cover_url != null) {
            i4 = this.music_cover_url.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.digg_count != null) {
            i6 = this.digg_count.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.music_count != null) {
            sb.append(", music_count=");
            sb.append(this.music_count);
        }
        if (this.music_used_count != null) {
            sb.append(", music_used_count=");
            sb.append(this.music_used_count);
        }
        if (this.music_qrcode_url != null) {
            sb.append(", music_qrcode_url=");
            sb.append(this.music_qrcode_url);
        }
        if (this.music_cover_url != null) {
            sb.append(", music_cover_url=");
            sb.append(this.music_cover_url);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        StringBuilder replace = sb.replace(0, 2, "OriginalMusicianStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OriginalMusicianStructV2)) {
            return false;
        }
        OriginalMusicianStructV2 originalMusicianStructV2 = (OriginalMusicianStructV2) obj;
        if (!unknownFields().equals(originalMusicianStructV2.unknownFields()) || !Internal.equals(this.music_count, originalMusicianStructV2.music_count) || !Internal.equals(this.music_used_count, originalMusicianStructV2.music_used_count) || !Internal.equals(this.music_qrcode_url, originalMusicianStructV2.music_qrcode_url) || !Internal.equals(this.music_cover_url, originalMusicianStructV2.music_cover_url) || !Internal.equals(this.digg_count, originalMusicianStructV2.digg_count)) {
            return false;
        }
        return true;
    }

    public OriginalMusicianStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3) {
        this(num, num2, urlStructV2, urlStructV22, num3, ByteString.EMPTY);
    }

    public OriginalMusicianStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.music_count = num;
        this.music_used_count = num2;
        this.music_qrcode_url = urlStructV2;
        this.music_cover_url = urlStructV22;
        this.digg_count = num3;
    }
}
