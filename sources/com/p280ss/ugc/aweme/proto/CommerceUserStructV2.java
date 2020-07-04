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

/* renamed from: com.ss.ugc.aweme.proto.CommerceUserStructV2 */
public final class CommerceUserStructV2 extends Message<CommerceUserStructV2, Builder> {
    public static final ProtoAdapter<CommerceUserStructV2> ADAPTER = new ProtoAdapter_CommerceUserStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer ad_influencer_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean has_ads_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LinkUserInfoStructV2#ADAPTER", tag = 4)
    public LinkUserInfoStructV2 link_user_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean show_star_atlas_cooperation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer star_atlas;

    /* renamed from: com.ss.ugc.aweme.proto.CommerceUserStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommerceUserStructV2, Builder> {
        public Integer ad_influencer_type;
        public Boolean has_ads_entry;
        public LinkUserInfoStructV2 link_user_info;
        public Boolean show_star_atlas_cooperation;
        public Integer star_atlas;

        public final CommerceUserStructV2 build() {
            CommerceUserStructV2 commerceUserStructV2 = new CommerceUserStructV2(this.star_atlas, this.show_star_atlas_cooperation, this.has_ads_entry, this.link_user_info, this.ad_influencer_type, super.buildUnknownFields());
            return commerceUserStructV2;
        }

        public final Builder ad_influencer_type(Integer num) {
            this.ad_influencer_type = num;
            return this;
        }

        public final Builder has_ads_entry(Boolean bool) {
            this.has_ads_entry = bool;
            return this;
        }

        public final Builder link_user_info(LinkUserInfoStructV2 linkUserInfoStructV2) {
            this.link_user_info = linkUserInfoStructV2;
            return this;
        }

        public final Builder show_star_atlas_cooperation(Boolean bool) {
            this.show_star_atlas_cooperation = bool;
            return this;
        }

        public final Builder star_atlas(Integer num) {
            this.star_atlas = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommerceUserStructV2$ProtoAdapter_CommerceUserStructV2 */
    static final class ProtoAdapter_CommerceUserStructV2 extends ProtoAdapter<CommerceUserStructV2> {
        public ProtoAdapter_CommerceUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceUserStructV2.class);
        }

        public final int encodedSize(CommerceUserStructV2 commerceUserStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commerceUserStructV2.star_atlas) + ProtoAdapter.BOOL.encodedSizeWithTag(2, commerceUserStructV2.show_star_atlas_cooperation) + ProtoAdapter.BOOL.encodedSizeWithTag(3, commerceUserStructV2.has_ads_entry) + LinkUserInfoStructV2.ADAPTER.encodedSizeWithTag(4, commerceUserStructV2.link_user_info) + ProtoAdapter.INT32.encodedSizeWithTag(5, commerceUserStructV2.ad_influencer_type) + commerceUserStructV2.unknownFields().size();
        }

        public final CommerceUserStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.star_atlas((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.show_star_atlas_cooperation((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.has_ads_entry((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.link_user_info((LinkUserInfoStructV2) LinkUserInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.ad_influencer_type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommerceUserStructV2 commerceUserStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commerceUserStructV2.star_atlas);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, commerceUserStructV2.show_star_atlas_cooperation);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, commerceUserStructV2.has_ads_entry);
            LinkUserInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 4, commerceUserStructV2.link_user_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, commerceUserStructV2.ad_influencer_type);
            protoWriter.writeBytes(commerceUserStructV2.unknownFields());
        }
    }

    public CommerceUserStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.star_atlas = this.star_atlas;
        builder.show_star_atlas_cooperation = this.show_star_atlas_cooperation;
        builder.has_ads_entry = this.has_ads_entry;
        builder.link_user_info = this.link_user_info;
        builder.ad_influencer_type = this.ad_influencer_type;
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
        if (this.star_atlas != null) {
            i = this.star_atlas.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.show_star_atlas_cooperation != null) {
            i2 = this.show_star_atlas_cooperation.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.has_ads_entry != null) {
            i3 = this.has_ads_entry.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.link_user_info != null) {
            i4 = this.link_user_info.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.ad_influencer_type != null) {
            i6 = this.ad_influencer_type.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.star_atlas != null) {
            sb.append(", star_atlas=");
            sb.append(this.star_atlas);
        }
        if (this.show_star_atlas_cooperation != null) {
            sb.append(", show_star_atlas_cooperation=");
            sb.append(this.show_star_atlas_cooperation);
        }
        if (this.has_ads_entry != null) {
            sb.append(", has_ads_entry=");
            sb.append(this.has_ads_entry);
        }
        if (this.link_user_info != null) {
            sb.append(", link_user_info=");
            sb.append(this.link_user_info);
        }
        if (this.ad_influencer_type != null) {
            sb.append(", ad_influencer_type=");
            sb.append(this.ad_influencer_type);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceUserStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceUserStructV2)) {
            return false;
        }
        CommerceUserStructV2 commerceUserStructV2 = (CommerceUserStructV2) obj;
        if (!unknownFields().equals(commerceUserStructV2.unknownFields()) || !Internal.equals(this.star_atlas, commerceUserStructV2.star_atlas) || !Internal.equals(this.show_star_atlas_cooperation, commerceUserStructV2.show_star_atlas_cooperation) || !Internal.equals(this.has_ads_entry, commerceUserStructV2.has_ads_entry) || !Internal.equals(this.link_user_info, commerceUserStructV2.link_user_info) || !Internal.equals(this.ad_influencer_type, commerceUserStructV2.ad_influencer_type)) {
            return false;
        }
        return true;
    }

    public CommerceUserStructV2(Integer num, Boolean bool, Boolean bool2, LinkUserInfoStructV2 linkUserInfoStructV2, Integer num2) {
        this(num, bool, bool2, linkUserInfoStructV2, num2, ByteString.EMPTY);
    }

    public CommerceUserStructV2(Integer num, Boolean bool, Boolean bool2, LinkUserInfoStructV2 linkUserInfoStructV2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.star_atlas = num;
        this.show_star_atlas_cooperation = bool;
        this.has_ads_entry = bool2;
        this.link_user_info = linkUserInfoStructV2;
        this.ad_influencer_type = num2;
    }
}
