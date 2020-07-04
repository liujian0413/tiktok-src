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

/* renamed from: com.ss.ugc.aweme.proto.PreloadStructV2 */
public final class PreloadStructV2 extends Message<PreloadStructV2, Builder> {
    public static final ProtoAdapter<PreloadStructV2> ADAPTER = new ProtoAdapter_PreloadStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 7)
    public Double comment_median_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double comment_pro;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 5)
    public Double comment_thres;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer model_v2;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer profile;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 8)
    public Double profile_median_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 4)
    public Double profile_pro;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 6)
    public Double profile_thres;

    /* renamed from: com.ss.ugc.aweme.proto.PreloadStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PreloadStructV2, Builder> {
        public Integer comment;
        public Double comment_median_time;
        public Double comment_pro;
        public Double comment_thres;
        public Integer model_v2;
        public Integer profile;
        public Double profile_median_time;
        public Double profile_pro;
        public Double profile_thres;

        public final PreloadStructV2 build() {
            PreloadStructV2 preloadStructV2 = new PreloadStructV2(this.comment, this.profile, this.comment_pro, this.profile_pro, this.comment_thres, this.profile_thres, this.comment_median_time, this.profile_median_time, this.model_v2, super.buildUnknownFields());
            return preloadStructV2;
        }

        public final Builder comment(Integer num) {
            this.comment = num;
            return this;
        }

        public final Builder comment_median_time(Double d) {
            this.comment_median_time = d;
            return this;
        }

        public final Builder comment_pro(Double d) {
            this.comment_pro = d;
            return this;
        }

        public final Builder comment_thres(Double d) {
            this.comment_thres = d;
            return this;
        }

        public final Builder model_v2(Integer num) {
            this.model_v2 = num;
            return this;
        }

        public final Builder profile(Integer num) {
            this.profile = num;
            return this;
        }

        public final Builder profile_median_time(Double d) {
            this.profile_median_time = d;
            return this;
        }

        public final Builder profile_pro(Double d) {
            this.profile_pro = d;
            return this;
        }

        public final Builder profile_thres(Double d) {
            this.profile_thres = d;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PreloadStructV2$ProtoAdapter_PreloadStructV2 */
    static final class ProtoAdapter_PreloadStructV2 extends ProtoAdapter<PreloadStructV2> {
        public ProtoAdapter_PreloadStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PreloadStructV2.class);
        }

        public final int encodedSize(PreloadStructV2 preloadStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, preloadStructV2.comment) + ProtoAdapter.INT32.encodedSizeWithTag(2, preloadStructV2.profile) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, preloadStructV2.comment_pro) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, preloadStructV2.profile_pro) + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, preloadStructV2.comment_thres) + ProtoAdapter.DOUBLE.encodedSizeWithTag(6, preloadStructV2.profile_thres) + ProtoAdapter.DOUBLE.encodedSizeWithTag(7, preloadStructV2.comment_median_time) + ProtoAdapter.DOUBLE.encodedSizeWithTag(8, preloadStructV2.profile_median_time) + ProtoAdapter.INT32.encodedSizeWithTag(9, preloadStructV2.model_v2) + preloadStructV2.unknownFields().size();
        }

        public final PreloadStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.comment((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.profile((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.comment_pro((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 4:
                            builder.profile_pro((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 5:
                            builder.comment_thres((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 6:
                            builder.profile_thres((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 7:
                            builder.comment_median_time((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 8:
                            builder.profile_median_time((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 9:
                            builder.model_v2((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PreloadStructV2 preloadStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, preloadStructV2.comment);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, preloadStructV2.profile);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, preloadStructV2.comment_pro);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, preloadStructV2.profile_pro);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 5, preloadStructV2.comment_thres);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, preloadStructV2.profile_thres);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 7, preloadStructV2.comment_median_time);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 8, preloadStructV2.profile_median_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, preloadStructV2.model_v2);
            protoWriter.writeBytes(preloadStructV2.unknownFields());
        }
    }

    public PreloadStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.comment = this.comment;
        builder.profile = this.profile;
        builder.comment_pro = this.comment_pro;
        builder.profile_pro = this.profile_pro;
        builder.comment_thres = this.comment_thres;
        builder.profile_thres = this.profile_thres;
        builder.comment_median_time = this.comment_median_time;
        builder.profile_median_time = this.profile_median_time;
        builder.model_v2 = this.model_v2;
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
        if (this.comment != null) {
            i = this.comment.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.profile != null) {
            i2 = this.profile.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        if (this.comment_pro != null) {
            i3 = this.comment_pro.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        if (this.profile_pro != null) {
            i4 = this.profile_pro.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.comment_thres != null) {
            i5 = this.comment_thres.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        if (this.profile_thres != null) {
            i6 = this.profile_thres.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        if (this.comment_median_time != null) {
            i7 = this.comment_median_time.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        if (this.profile_median_time != null) {
            i8 = this.profile_median_time.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        if (this.model_v2 != null) {
            i10 = this.model_v2.hashCode();
        }
        int i19 = i18 + i10;
        this.hashCode = i19;
        return i19;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.profile != null) {
            sb.append(", profile=");
            sb.append(this.profile);
        }
        if (this.comment_pro != null) {
            sb.append(", comment_pro=");
            sb.append(this.comment_pro);
        }
        if (this.profile_pro != null) {
            sb.append(", profile_pro=");
            sb.append(this.profile_pro);
        }
        if (this.comment_thres != null) {
            sb.append(", comment_thres=");
            sb.append(this.comment_thres);
        }
        if (this.profile_thres != null) {
            sb.append(", profile_thres=");
            sb.append(this.profile_thres);
        }
        if (this.comment_median_time != null) {
            sb.append(", comment_median_time=");
            sb.append(this.comment_median_time);
        }
        if (this.profile_median_time != null) {
            sb.append(", profile_median_time=");
            sb.append(this.profile_median_time);
        }
        if (this.model_v2 != null) {
            sb.append(", model_v2=");
            sb.append(this.model_v2);
        }
        StringBuilder replace = sb.replace(0, 2, "PreloadStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreloadStructV2)) {
            return false;
        }
        PreloadStructV2 preloadStructV2 = (PreloadStructV2) obj;
        if (!unknownFields().equals(preloadStructV2.unknownFields()) || !Internal.equals(this.comment, preloadStructV2.comment) || !Internal.equals(this.profile, preloadStructV2.profile) || !Internal.equals(this.comment_pro, preloadStructV2.comment_pro) || !Internal.equals(this.profile_pro, preloadStructV2.profile_pro) || !Internal.equals(this.comment_thres, preloadStructV2.comment_thres) || !Internal.equals(this.profile_thres, preloadStructV2.profile_thres) || !Internal.equals(this.comment_median_time, preloadStructV2.comment_median_time) || !Internal.equals(this.profile_median_time, preloadStructV2.profile_median_time) || !Internal.equals(this.model_v2, preloadStructV2.model_v2)) {
            return false;
        }
        return true;
    }

    public PreloadStructV2(Integer num, Integer num2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num3) {
        this(num, num2, d, d2, d3, d4, d5, d6, num3, ByteString.EMPTY);
    }

    public PreloadStructV2(Integer num, Integer num2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = num;
        this.profile = num2;
        this.comment_pro = d;
        this.profile_pro = d2;
        this.comment_thres = d3;
        this.profile_thres = d4;
        this.comment_median_time = d5;
        this.profile_median_time = d6;
        this.model_v2 = num3;
    }
}
