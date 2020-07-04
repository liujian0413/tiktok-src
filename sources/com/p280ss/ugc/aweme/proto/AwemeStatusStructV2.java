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

/* renamed from: com.ss.ugc.aweme.proto.AwemeStatusStructV2 */
public final class AwemeStatusStructV2 extends Message<AwemeStatusStructV2, Builder> {
    public static final ProtoAdapter<AwemeStatusStructV2> ADAPTER = new ProtoAdapter_AwemeStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean allow_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean allow_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer download_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public Boolean in_reviewing;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean is_delete;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public Boolean is_private;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 12)
    public Boolean is_prohibited;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer private_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public Integer reviewed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 11)
    public Boolean self_see;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public Boolean with_fusion_goods;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public Boolean with_goods;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeStatusStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeStatusStructV2, Builder> {
        public Boolean allow_comment;
        public Boolean allow_share;
        public String aweme_id;
        public Integer download_status;
        public Boolean in_reviewing;
        public Boolean is_delete;
        public Boolean is_private;
        public Boolean is_prohibited;
        public Integer private_status;
        public Integer reviewed;
        public Boolean self_see;
        public Boolean with_fusion_goods;
        public Boolean with_goods;

        public final AwemeStatusStructV2 build() {
            AwemeStatusStructV2 awemeStatusStructV2 = new AwemeStatusStructV2(this.aweme_id, this.is_delete, this.allow_share, this.allow_comment, this.is_private, this.with_goods, this.private_status, this.with_fusion_goods, this.in_reviewing, this.reviewed, this.self_see, this.is_prohibited, this.download_status, super.buildUnknownFields());
            return awemeStatusStructV2;
        }

        public final Builder allow_comment(Boolean bool) {
            this.allow_comment = bool;
            return this;
        }

        public final Builder allow_share(Boolean bool) {
            this.allow_share = bool;
            return this;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder download_status(Integer num) {
            this.download_status = num;
            return this;
        }

        public final Builder in_reviewing(Boolean bool) {
            this.in_reviewing = bool;
            return this;
        }

        public final Builder is_delete(Boolean bool) {
            this.is_delete = bool;
            return this;
        }

        public final Builder is_private(Boolean bool) {
            this.is_private = bool;
            return this;
        }

        public final Builder is_prohibited(Boolean bool) {
            this.is_prohibited = bool;
            return this;
        }

        public final Builder private_status(Integer num) {
            this.private_status = num;
            return this;
        }

        public final Builder reviewed(Integer num) {
            this.reviewed = num;
            return this;
        }

        public final Builder self_see(Boolean bool) {
            this.self_see = bool;
            return this;
        }

        public final Builder with_fusion_goods(Boolean bool) {
            this.with_fusion_goods = bool;
            return this;
        }

        public final Builder with_goods(Boolean bool) {
            this.with_goods = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeStatusStructV2$ProtoAdapter_AwemeStatusStructV2 */
    static final class ProtoAdapter_AwemeStatusStructV2 extends ProtoAdapter<AwemeStatusStructV2> {
        public ProtoAdapter_AwemeStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStatusStructV2.class);
        }

        public final AwemeStatusStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.is_delete((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.allow_share((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.allow_comment((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.is_private((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.with_goods((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 7:
                            builder.private_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.with_fusion_goods((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 9:
                            builder.in_reviewing((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 10:
                            builder.reviewed((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.self_see((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 12:
                            builder.is_prohibited((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 13:
                            builder.download_status((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final int encodedSize(AwemeStatusStructV2 awemeStatusStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStatusStructV2.aweme_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeStatusStructV2.is_delete) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeStatusStructV2.allow_share) + ProtoAdapter.BOOL.encodedSizeWithTag(4, awemeStatusStructV2.allow_comment) + ProtoAdapter.BOOL.encodedSizeWithTag(5, awemeStatusStructV2.is_private) + ProtoAdapter.BOOL.encodedSizeWithTag(6, awemeStatusStructV2.with_goods) + ProtoAdapter.INT32.encodedSizeWithTag(7, awemeStatusStructV2.private_status) + ProtoAdapter.BOOL.encodedSizeWithTag(8, awemeStatusStructV2.with_fusion_goods) + ProtoAdapter.BOOL.encodedSizeWithTag(9, awemeStatusStructV2.in_reviewing) + ProtoAdapter.INT32.encodedSizeWithTag(10, awemeStatusStructV2.reviewed) + ProtoAdapter.BOOL.encodedSizeWithTag(11, awemeStatusStructV2.self_see) + ProtoAdapter.BOOL.encodedSizeWithTag(12, awemeStatusStructV2.is_prohibited) + ProtoAdapter.INT32.encodedSizeWithTag(13, awemeStatusStructV2.download_status) + awemeStatusStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AwemeStatusStructV2 awemeStatusStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStatusStructV2.aweme_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeStatusStructV2.is_delete);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeStatusStructV2.allow_share);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, awemeStatusStructV2.allow_comment);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, awemeStatusStructV2.is_private);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, awemeStatusStructV2.with_goods);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, awemeStatusStructV2.private_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, awemeStatusStructV2.with_fusion_goods);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, awemeStatusStructV2.in_reviewing);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, awemeStatusStructV2.reviewed);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, awemeStatusStructV2.self_see);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, awemeStatusStructV2.is_prohibited);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, awemeStatusStructV2.download_status);
            protoWriter.writeBytes(awemeStatusStructV2.unknownFields());
        }
    }

    public AwemeStatusStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.is_delete = this.is_delete;
        builder.allow_share = this.allow_share;
        builder.allow_comment = this.allow_comment;
        builder.is_private = this.is_private;
        builder.with_goods = this.with_goods;
        builder.private_status = this.private_status;
        builder.with_fusion_goods = this.with_fusion_goods;
        builder.in_reviewing = this.in_reviewing;
        builder.reviewed = this.reviewed;
        builder.self_see = this.self_see;
        builder.is_prohibited = this.is_prohibited;
        builder.download_status = this.download_status;
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
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i14 = 0;
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 37;
        if (this.is_delete != null) {
            i2 = this.is_delete.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 37;
        if (this.allow_share != null) {
            i3 = this.allow_share.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 37;
        if (this.allow_comment != null) {
            i4 = this.allow_comment.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 37;
        if (this.is_private != null) {
            i5 = this.is_private.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 37;
        if (this.with_goods != null) {
            i6 = this.with_goods.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 37;
        if (this.private_status != null) {
            i7 = this.private_status.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 37;
        if (this.with_fusion_goods != null) {
            i8 = this.with_fusion_goods.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 37;
        if (this.in_reviewing != null) {
            i9 = this.in_reviewing.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 37;
        if (this.reviewed != null) {
            i10 = this.reviewed.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 37;
        if (this.self_see != null) {
            i11 = this.self_see.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 37;
        if (this.is_prohibited != null) {
            i12 = this.is_prohibited.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 37;
        if (this.download_status != null) {
            i14 = this.download_status.hashCode();
        }
        int i27 = i26 + i14;
        this.hashCode = i27;
        return i27;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.is_delete != null) {
            sb.append(", is_delete=");
            sb.append(this.is_delete);
        }
        if (this.allow_share != null) {
            sb.append(", allow_share=");
            sb.append(this.allow_share);
        }
        if (this.allow_comment != null) {
            sb.append(", allow_comment=");
            sb.append(this.allow_comment);
        }
        if (this.is_private != null) {
            sb.append(", is_private=");
            sb.append(this.is_private);
        }
        if (this.with_goods != null) {
            sb.append(", with_goods=");
            sb.append(this.with_goods);
        }
        if (this.private_status != null) {
            sb.append(", private_status=");
            sb.append(this.private_status);
        }
        if (this.with_fusion_goods != null) {
            sb.append(", with_fusion_goods=");
            sb.append(this.with_fusion_goods);
        }
        if (this.in_reviewing != null) {
            sb.append(", in_reviewing=");
            sb.append(this.in_reviewing);
        }
        if (this.reviewed != null) {
            sb.append(", reviewed=");
            sb.append(this.reviewed);
        }
        if (this.self_see != null) {
            sb.append(", self_see=");
            sb.append(this.self_see);
        }
        if (this.is_prohibited != null) {
            sb.append(", is_prohibited=");
            sb.append(this.is_prohibited);
        }
        if (this.download_status != null) {
            sb.append(", download_status=");
            sb.append(this.download_status);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeStatusStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStatusStructV2)) {
            return false;
        }
        AwemeStatusStructV2 awemeStatusStructV2 = (AwemeStatusStructV2) obj;
        if (!unknownFields().equals(awemeStatusStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStatusStructV2.aweme_id) || !Internal.equals(this.is_delete, awemeStatusStructV2.is_delete) || !Internal.equals(this.allow_share, awemeStatusStructV2.allow_share) || !Internal.equals(this.allow_comment, awemeStatusStructV2.allow_comment) || !Internal.equals(this.is_private, awemeStatusStructV2.is_private) || !Internal.equals(this.with_goods, awemeStatusStructV2.with_goods) || !Internal.equals(this.private_status, awemeStatusStructV2.private_status) || !Internal.equals(this.with_fusion_goods, awemeStatusStructV2.with_fusion_goods) || !Internal.equals(this.in_reviewing, awemeStatusStructV2.in_reviewing) || !Internal.equals(this.reviewed, awemeStatusStructV2.reviewed) || !Internal.equals(this.self_see, awemeStatusStructV2.self_see) || !Internal.equals(this.is_prohibited, awemeStatusStructV2.is_prohibited) || !Internal.equals(this.download_status, awemeStatusStructV2.download_status)) {
            return false;
        }
        return true;
    }

    public AwemeStatusStructV2(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Boolean bool6, Boolean bool7, Integer num2, Boolean bool8, Boolean bool9, Integer num3) {
        this(str, bool, bool2, bool3, bool4, bool5, num, bool6, bool7, num2, bool8, bool9, num3, ByteString.EMPTY);
    }

    public AwemeStatusStructV2(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Boolean bool6, Boolean bool7, Integer num2, Boolean bool8, Boolean bool9, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.is_delete = bool;
        this.allow_share = bool2;
        this.allow_comment = bool3;
        this.is_private = bool4;
        this.with_goods = bool5;
        this.private_status = num;
        this.with_fusion_goods = bool6;
        this.in_reviewing = bool7;
        this.reviewed = num2;
        this.self_see = bool8;
        this.is_prohibited = bool9;
        this.download_status = num3;
    }
}
