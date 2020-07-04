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

/* renamed from: com.ss.ugc.aweme.proto.ActivityStructV2 */
final class ActivityStructV2 extends Message<ActivityStructV2, Builder> {
    public static final ProtoAdapter<ActivityStructV2> ADAPTER = new ProtoAdapter_ActivityStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer digg_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 music_cover_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 music_qrcode_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer use_music_count;

    /* renamed from: com.ss.ugc.aweme.proto.ActivityStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ActivityStructV2, Builder> {
        public Integer digg_count;
        public UrlStructV2 music_cover_url;
        public UrlStructV2 music_qrcode_url;
        public Integer use_music_count;

        public final ActivityStructV2 build() {
            ActivityStructV2 activityStructV2 = new ActivityStructV2(this.use_music_count, this.digg_count, this.music_cover_url, this.music_qrcode_url, super.buildUnknownFields());
            return activityStructV2;
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
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

        public final Builder use_music_count(Integer num) {
            this.use_music_count = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ActivityStructV2$ProtoAdapter_ActivityStructV2 */
    static final class ProtoAdapter_ActivityStructV2 extends ProtoAdapter<ActivityStructV2> {
        public ProtoAdapter_ActivityStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ActivityStructV2.class);
        }

        public final int encodedSize(ActivityStructV2 activityStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, activityStructV2.use_music_count) + ProtoAdapter.INT32.encodedSizeWithTag(2, activityStructV2.digg_count) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, activityStructV2.music_cover_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, activityStructV2.music_qrcode_url) + activityStructV2.unknownFields().size();
        }

        public final ActivityStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.use_music_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.digg_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.music_cover_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.music_qrcode_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ActivityStructV2 activityStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, activityStructV2.use_music_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, activityStructV2.digg_count);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, activityStructV2.music_cover_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, activityStructV2.music_qrcode_url);
            protoWriter.writeBytes(activityStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.use_music_count = this.use_music_count;
        builder.digg_count = this.digg_count;
        builder.music_cover_url = this.music_cover_url;
        builder.music_qrcode_url = this.music_qrcode_url;
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
        if (this.use_music_count != null) {
            i = this.use_music_count.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.digg_count != null) {
            i2 = this.digg_count.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.music_cover_url != null) {
            i3 = this.music_cover_url.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.music_qrcode_url != null) {
            i5 = this.music_qrcode_url.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.use_music_count != null) {
            sb.append(", use_music_count=");
            sb.append(this.use_music_count);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.music_cover_url != null) {
            sb.append(", music_cover_url=");
            sb.append(this.music_cover_url);
        }
        if (this.music_qrcode_url != null) {
            sb.append(", music_qrcode_url=");
            sb.append(this.music_qrcode_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ActivityStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityStructV2)) {
            return false;
        }
        ActivityStructV2 activityStructV2 = (ActivityStructV2) obj;
        if (!unknownFields().equals(activityStructV2.unknownFields()) || !Internal.equals(this.use_music_count, activityStructV2.use_music_count) || !Internal.equals(this.digg_count, activityStructV2.digg_count) || !Internal.equals(this.music_cover_url, activityStructV2.music_cover_url) || !Internal.equals(this.music_qrcode_url, activityStructV2.music_qrcode_url)) {
            return false;
        }
        return true;
    }

    public ActivityStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22) {
        this(num, num2, urlStructV2, urlStructV22, ByteString.EMPTY);
    }

    public ActivityStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, ByteString byteString) {
        super(ADAPTER, byteString);
        this.use_music_count = num;
        this.digg_count = num2;
        this.music_cover_url = urlStructV2;
        this.music_qrcode_url = urlStructV22;
    }
}
