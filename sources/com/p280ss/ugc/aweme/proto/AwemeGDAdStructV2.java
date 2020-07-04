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

/* renamed from: com.ss.ugc.aweme.proto.AwemeGDAdStructV2 */
final class AwemeGDAdStructV2 extends Message<AwemeGDAdStructV2, Builder> {
    public static final ProtoAdapter<AwemeGDAdStructV2> ADAPTER = new ProtoAdapter_AwemeGDAdStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long ad_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer ad_price;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 13)
    public UrlStructV2 click_track_url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long cpt_seq;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long creative_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer effective_play_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 18)
    public UrlStructV2 effective_play_track_url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 19)
    public Long group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 14)
    public Boolean is_preview;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String open_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 play_track_url_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 playover_track_url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String req_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long rit;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String title;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 12)
    public UrlStructV2 track_url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 20)
    public Integer video_transpose;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String web_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeGDAdStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeGDAdStructV2, Builder> {
        public Long ad_id;
        public Integer ad_price;
        public UrlStructV2 click_track_url_list;
        public Long cpt_seq;
        public Long creative_id;
        public Integer effective_play_time;
        public UrlStructV2 effective_play_track_url_list;
        public Long group_id;
        public Boolean is_preview;
        public String open_url;
        public UrlStructV2 play_track_url_list;
        public UrlStructV2 playover_track_url_list;
        public String req_id;
        public Long rit;
        public String source;
        public String title;
        public UrlStructV2 track_url_list;
        public Integer video_transpose;
        public String web_title;
        public String web_url;

        public final AwemeGDAdStructV2 build() {
            AwemeGDAdStructV2 awemeGDAdStructV2 = new AwemeGDAdStructV2(this.ad_id, this.cpt_seq, this.req_id, this.rit, this.ad_price, this.creative_id, this.title, this.source, this.open_url, this.web_url, this.web_title, this.track_url_list, this.click_track_url_list, this.is_preview, this.play_track_url_list, this.playover_track_url_list, this.effective_play_time, this.effective_play_track_url_list, this.group_id, this.video_transpose, super.buildUnknownFields());
            return awemeGDAdStructV2;
        }

        public final Builder ad_id(Long l) {
            this.ad_id = l;
            return this;
        }

        public final Builder ad_price(Integer num) {
            this.ad_price = num;
            return this;
        }

        public final Builder click_track_url_list(UrlStructV2 urlStructV2) {
            this.click_track_url_list = urlStructV2;
            return this;
        }

        public final Builder cpt_seq(Long l) {
            this.cpt_seq = l;
            return this;
        }

        public final Builder creative_id(Long l) {
            this.creative_id = l;
            return this;
        }

        public final Builder effective_play_time(Integer num) {
            this.effective_play_time = num;
            return this;
        }

        public final Builder effective_play_track_url_list(UrlStructV2 urlStructV2) {
            this.effective_play_track_url_list = urlStructV2;
            return this;
        }

        public final Builder group_id(Long l) {
            this.group_id = l;
            return this;
        }

        public final Builder is_preview(Boolean bool) {
            this.is_preview = bool;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder play_track_url_list(UrlStructV2 urlStructV2) {
            this.play_track_url_list = urlStructV2;
            return this;
        }

        public final Builder playover_track_url_list(UrlStructV2 urlStructV2) {
            this.playover_track_url_list = urlStructV2;
            return this;
        }

        public final Builder req_id(String str) {
            this.req_id = str;
            return this;
        }

        public final Builder rit(Long l) {
            this.rit = l;
            return this;
        }

        public final Builder source(String str) {
            this.source = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder track_url_list(UrlStructV2 urlStructV2) {
            this.track_url_list = urlStructV2;
            return this;
        }

        public final Builder video_transpose(Integer num) {
            this.video_transpose = num;
            return this;
        }

        public final Builder web_title(String str) {
            this.web_title = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeGDAdStructV2$ProtoAdapter_AwemeGDAdStructV2 */
    static final class ProtoAdapter_AwemeGDAdStructV2 extends ProtoAdapter<AwemeGDAdStructV2> {
        public ProtoAdapter_AwemeGDAdStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeGDAdStructV2.class);
        }

        public final int encodedSize(AwemeGDAdStructV2 awemeGDAdStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, awemeGDAdStructV2.ad_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, awemeGDAdStructV2.cpt_seq) + ProtoAdapter.STRING.encodedSizeWithTag(3, awemeGDAdStructV2.req_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, awemeGDAdStructV2.rit) + ProtoAdapter.INT32.encodedSizeWithTag(5, awemeGDAdStructV2.ad_price) + ProtoAdapter.INT64.encodedSizeWithTag(6, awemeGDAdStructV2.creative_id) + ProtoAdapter.STRING.encodedSizeWithTag(7, awemeGDAdStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(8, awemeGDAdStructV2.source) + ProtoAdapter.STRING.encodedSizeWithTag(9, awemeGDAdStructV2.open_url) + ProtoAdapter.STRING.encodedSizeWithTag(10, awemeGDAdStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(11, awemeGDAdStructV2.web_title) + UrlStructV2.ADAPTER.encodedSizeWithTag(12, awemeGDAdStructV2.track_url_list) + UrlStructV2.ADAPTER.encodedSizeWithTag(13, awemeGDAdStructV2.click_track_url_list) + ProtoAdapter.BOOL.encodedSizeWithTag(14, awemeGDAdStructV2.is_preview) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, awemeGDAdStructV2.play_track_url_list) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, awemeGDAdStructV2.playover_track_url_list) + ProtoAdapter.INT32.encodedSizeWithTag(17, awemeGDAdStructV2.effective_play_time) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, awemeGDAdStructV2.effective_play_track_url_list) + ProtoAdapter.INT64.encodedSizeWithTag(19, awemeGDAdStructV2.group_id) + ProtoAdapter.INT32.encodedSizeWithTag(20, awemeGDAdStructV2.video_transpose) + awemeGDAdStructV2.unknownFields().size();
        }

        public final AwemeGDAdStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ad_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.cpt_seq((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.req_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.rit((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.ad_price((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.creative_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.source((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.open_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.web_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.track_url_list((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.click_track_url_list((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            builder.is_preview((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 15:
                            builder.play_track_url_list((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.playover_track_url_list((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.effective_play_time((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.effective_play_track_url_list((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.group_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 20:
                            builder.video_transpose((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeGDAdStructV2 awemeGDAdStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, awemeGDAdStructV2.ad_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, awemeGDAdStructV2.cpt_seq);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, awemeGDAdStructV2.req_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, awemeGDAdStructV2.rit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, awemeGDAdStructV2.ad_price);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, awemeGDAdStructV2.creative_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, awemeGDAdStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, awemeGDAdStructV2.source);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, awemeGDAdStructV2.open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, awemeGDAdStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, awemeGDAdStructV2.web_title);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 12, awemeGDAdStructV2.track_url_list);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 13, awemeGDAdStructV2.click_track_url_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, awemeGDAdStructV2.is_preview);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, awemeGDAdStructV2.play_track_url_list);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, awemeGDAdStructV2.playover_track_url_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, awemeGDAdStructV2.effective_play_time);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, awemeGDAdStructV2.effective_play_track_url_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, awemeGDAdStructV2.group_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, awemeGDAdStructV2.video_transpose);
            protoWriter.writeBytes(awemeGDAdStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ad_id = this.ad_id;
        builder.cpt_seq = this.cpt_seq;
        builder.req_id = this.req_id;
        builder.rit = this.rit;
        builder.ad_price = this.ad_price;
        builder.creative_id = this.creative_id;
        builder.title = this.title;
        builder.source = this.source;
        builder.open_url = this.open_url;
        builder.web_url = this.web_url;
        builder.web_title = this.web_title;
        builder.track_url_list = this.track_url_list;
        builder.click_track_url_list = this.click_track_url_list;
        builder.is_preview = this.is_preview;
        builder.play_track_url_list = this.play_track_url_list;
        builder.playover_track_url_list = this.playover_track_url_list;
        builder.effective_play_time = this.effective_play_time;
        builder.effective_play_track_url_list = this.effective_play_track_url_list;
        builder.group_id = this.group_id;
        builder.video_transpose = this.video_transpose;
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
        int i20 = this.hashCode;
        if (i20 != 0) {
            return i20;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i21 = 0;
        if (this.ad_id != null) {
            i = this.ad_id.hashCode();
        } else {
            i = 0;
        }
        int i22 = (hashCode + i) * 37;
        if (this.cpt_seq != null) {
            i2 = this.cpt_seq.hashCode();
        } else {
            i2 = 0;
        }
        int i23 = (i22 + i2) * 37;
        if (this.req_id != null) {
            i3 = this.req_id.hashCode();
        } else {
            i3 = 0;
        }
        int i24 = (i23 + i3) * 37;
        if (this.rit != null) {
            i4 = this.rit.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 37;
        if (this.ad_price != null) {
            i5 = this.ad_price.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 37;
        if (this.creative_id != null) {
            i6 = this.creative_id.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 37;
        if (this.title != null) {
            i7 = this.title.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 37;
        if (this.source != null) {
            i8 = this.source.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (i28 + i8) * 37;
        if (this.open_url != null) {
            i9 = this.open_url.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (i29 + i9) * 37;
        if (this.web_url != null) {
            i10 = this.web_url.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 37;
        if (this.web_title != null) {
            i11 = this.web_title.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 37;
        if (this.track_url_list != null) {
            i12 = this.track_url_list.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 37;
        if (this.click_track_url_list != null) {
            i13 = this.click_track_url_list.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 37;
        if (this.is_preview != null) {
            i14 = this.is_preview.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 37;
        if (this.play_track_url_list != null) {
            i15 = this.play_track_url_list.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (i35 + i15) * 37;
        if (this.playover_track_url_list != null) {
            i16 = this.playover_track_url_list.hashCode();
        } else {
            i16 = 0;
        }
        int i37 = (i36 + i16) * 37;
        if (this.effective_play_time != null) {
            i17 = this.effective_play_time.hashCode();
        } else {
            i17 = 0;
        }
        int i38 = (i37 + i17) * 37;
        if (this.effective_play_track_url_list != null) {
            i18 = this.effective_play_track_url_list.hashCode();
        } else {
            i18 = 0;
        }
        int i39 = (i38 + i18) * 37;
        if (this.group_id != null) {
            i19 = this.group_id.hashCode();
        } else {
            i19 = 0;
        }
        int i40 = (i39 + i19) * 37;
        if (this.video_transpose != null) {
            i21 = this.video_transpose.hashCode();
        }
        int i41 = i40 + i21;
        this.hashCode = i41;
        return i41;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_id != null) {
            sb.append(", ad_id=");
            sb.append(this.ad_id);
        }
        if (this.cpt_seq != null) {
            sb.append(", cpt_seq=");
            sb.append(this.cpt_seq);
        }
        if (this.req_id != null) {
            sb.append(", req_id=");
            sb.append(this.req_id);
        }
        if (this.rit != null) {
            sb.append(", rit=");
            sb.append(this.rit);
        }
        if (this.ad_price != null) {
            sb.append(", ad_price=");
            sb.append(this.ad_price);
        }
        if (this.creative_id != null) {
            sb.append(", creative_id=");
            sb.append(this.creative_id);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        if (this.web_title != null) {
            sb.append(", web_title=");
            sb.append(this.web_title);
        }
        if (this.track_url_list != null) {
            sb.append(", track_url_list=");
            sb.append(this.track_url_list);
        }
        if (this.click_track_url_list != null) {
            sb.append(", click_track_url_list=");
            sb.append(this.click_track_url_list);
        }
        if (this.is_preview != null) {
            sb.append(", is_preview=");
            sb.append(this.is_preview);
        }
        if (this.play_track_url_list != null) {
            sb.append(", play_track_url_list=");
            sb.append(this.play_track_url_list);
        }
        if (this.playover_track_url_list != null) {
            sb.append(", playover_track_url_list=");
            sb.append(this.playover_track_url_list);
        }
        if (this.effective_play_time != null) {
            sb.append(", effective_play_time=");
            sb.append(this.effective_play_time);
        }
        if (this.effective_play_track_url_list != null) {
            sb.append(", effective_play_track_url_list=");
            sb.append(this.effective_play_track_url_list);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.video_transpose != null) {
            sb.append(", video_transpose=");
            sb.append(this.video_transpose);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeGDAdStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeGDAdStructV2)) {
            return false;
        }
        AwemeGDAdStructV2 awemeGDAdStructV2 = (AwemeGDAdStructV2) obj;
        if (!unknownFields().equals(awemeGDAdStructV2.unknownFields()) || !Internal.equals(this.ad_id, awemeGDAdStructV2.ad_id) || !Internal.equals(this.cpt_seq, awemeGDAdStructV2.cpt_seq) || !Internal.equals(this.req_id, awemeGDAdStructV2.req_id) || !Internal.equals(this.rit, awemeGDAdStructV2.rit) || !Internal.equals(this.ad_price, awemeGDAdStructV2.ad_price) || !Internal.equals(this.creative_id, awemeGDAdStructV2.creative_id) || !Internal.equals(this.title, awemeGDAdStructV2.title) || !Internal.equals(this.source, awemeGDAdStructV2.source) || !Internal.equals(this.open_url, awemeGDAdStructV2.open_url) || !Internal.equals(this.web_url, awemeGDAdStructV2.web_url) || !Internal.equals(this.web_title, awemeGDAdStructV2.web_title) || !Internal.equals(this.track_url_list, awemeGDAdStructV2.track_url_list) || !Internal.equals(this.click_track_url_list, awemeGDAdStructV2.click_track_url_list) || !Internal.equals(this.is_preview, awemeGDAdStructV2.is_preview) || !Internal.equals(this.play_track_url_list, awemeGDAdStructV2.play_track_url_list) || !Internal.equals(this.playover_track_url_list, awemeGDAdStructV2.playover_track_url_list) || !Internal.equals(this.effective_play_time, awemeGDAdStructV2.effective_play_time) || !Internal.equals(this.effective_play_track_url_list, awemeGDAdStructV2.effective_play_track_url_list) || !Internal.equals(this.group_id, awemeGDAdStructV2.group_id) || !Internal.equals(this.video_transpose, awemeGDAdStructV2.video_transpose)) {
            return false;
        }
        return true;
    }

    public AwemeGDAdStructV2(Long l, Long l2, String str, Long l3, Integer num, Long l4, String str2, String str3, String str4, String str5, String str6, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Boolean bool, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, Integer num2, UrlStructV2 urlStructV25, Long l5, Integer num3) {
        this(l, l2, str, l3, num, l4, str2, str3, str4, str5, str6, urlStructV2, urlStructV22, bool, urlStructV23, urlStructV24, num2, urlStructV25, l5, num3, ByteString.EMPTY);
    }

    public AwemeGDAdStructV2(Long l, Long l2, String str, Long l3, Integer num, Long l4, String str2, String str3, String str4, String str5, String str6, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Boolean bool, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, Integer num2, UrlStructV2 urlStructV25, Long l5, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_id = l;
        this.cpt_seq = l2;
        this.req_id = str;
        this.rit = l3;
        this.ad_price = num;
        this.creative_id = l4;
        this.title = str2;
        this.source = str3;
        this.open_url = str4;
        this.web_url = str5;
        this.web_title = str6;
        this.track_url_list = urlStructV2;
        this.click_track_url_list = urlStructV22;
        this.is_preview = bool;
        this.play_track_url_list = urlStructV23;
        this.playover_track_url_list = urlStructV24;
        this.effective_play_time = num2;
        this.effective_play_track_url_list = urlStructV25;
        this.group_id = l5;
        this.video_transpose = num3;
    }
}
