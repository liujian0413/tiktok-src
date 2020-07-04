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

/* renamed from: com.ss.ugc.aweme.proto.CommerceInfoStructV2 */
public final class CommerceInfoStructV2 extends Message<CommerceInfoStructV2, Builder> {
    public static final ProtoAdapter<CommerceInfoStructV2> ADAPTER = new ProtoAdapter_CommerceInfoStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", label = Label.REPEATED, tag = 3)
    public List<ChallengeStructV2> challenge_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 head_image_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.OfflineInfoStructV2#ADAPTER", label = Label.REPEATED, tag = 2)
    public List<OfflineInfoStructV2> offline_info_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String quick_shop_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String quick_shop_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String site_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.SmartPhoneSettingsStructV2#ADAPTER", tag = 4)
    public SmartPhoneSettingsStructV2 smart_phone;

    /* renamed from: com.ss.ugc.aweme.proto.CommerceInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommerceInfoStructV2, Builder> {
        public List<ChallengeStructV2> challenge_list = Internal.newMutableList();
        public UrlStructV2 head_image_url;
        public List<OfflineInfoStructV2> offline_info_list = Internal.newMutableList();
        public String quick_shop_name;
        public String quick_shop_url;
        public String site_id;
        public SmartPhoneSettingsStructV2 smart_phone;

        public final CommerceInfoStructV2 build() {
            CommerceInfoStructV2 commerceInfoStructV2 = new CommerceInfoStructV2(this.head_image_url, this.offline_info_list, this.challenge_list, this.smart_phone, this.quick_shop_url, this.quick_shop_name, this.site_id, super.buildUnknownFields());
            return commerceInfoStructV2;
        }

        public final Builder head_image_url(UrlStructV2 urlStructV2) {
            this.head_image_url = urlStructV2;
            return this;
        }

        public final Builder quick_shop_name(String str) {
            this.quick_shop_name = str;
            return this;
        }

        public final Builder quick_shop_url(String str) {
            this.quick_shop_url = str;
            return this;
        }

        public final Builder site_id(String str) {
            this.site_id = str;
            return this;
        }

        public final Builder smart_phone(SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2) {
            this.smart_phone = smartPhoneSettingsStructV2;
            return this;
        }

        public final Builder challenge_list(List<ChallengeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.challenge_list = list;
            return this;
        }

        public final Builder offline_info_list(List<OfflineInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.offline_info_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommerceInfoStructV2$ProtoAdapter_CommerceInfoStructV2 */
    static final class ProtoAdapter_CommerceInfoStructV2 extends ProtoAdapter<CommerceInfoStructV2> {
        public ProtoAdapter_CommerceInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceInfoStructV2.class);
        }

        public final int encodedSize(CommerceInfoStructV2 commerceInfoStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, commerceInfoStructV2.head_image_url) + OfflineInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(2, commerceInfoStructV2.offline_info_list) + ChallengeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(3, commerceInfoStructV2.challenge_list) + SmartPhoneSettingsStructV2.ADAPTER.encodedSizeWithTag(4, commerceInfoStructV2.smart_phone) + ProtoAdapter.STRING.encodedSizeWithTag(5, commerceInfoStructV2.quick_shop_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, commerceInfoStructV2.quick_shop_name) + ProtoAdapter.STRING.encodedSizeWithTag(7, commerceInfoStructV2.site_id) + commerceInfoStructV2.unknownFields().size();
        }

        public final CommerceInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.head_image_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.offline_info_list.add(OfflineInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.challenge_list.add(ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.smart_phone((SmartPhoneSettingsStructV2) SmartPhoneSettingsStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.quick_shop_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.quick_shop_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.site_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommerceInfoStructV2 commerceInfoStructV2) throws IOException {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, commerceInfoStructV2.head_image_url);
            OfflineInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, commerceInfoStructV2.offline_info_list);
            ChallengeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, commerceInfoStructV2.challenge_list);
            SmartPhoneSettingsStructV2.ADAPTER.encodeWithTag(protoWriter, 4, commerceInfoStructV2.smart_phone);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, commerceInfoStructV2.quick_shop_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, commerceInfoStructV2.quick_shop_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, commerceInfoStructV2.site_id);
            protoWriter.writeBytes(commerceInfoStructV2.unknownFields());
        }
    }

    public CommerceInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.head_image_url = this.head_image_url;
        builder.offline_info_list = Internal.copyOf("offline_info_list", this.offline_info_list);
        builder.challenge_list = Internal.copyOf("challenge_list", this.challenge_list);
        builder.smart_phone = this.smart_phone;
        builder.quick_shop_url = this.quick_shop_url;
        builder.quick_shop_name = this.quick_shop_name;
        builder.site_id = this.site_id;
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
        if (this.head_image_url != null) {
            i = this.head_image_url.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((hashCode + i) * 37) + this.offline_info_list.hashCode()) * 37) + this.challenge_list.hashCode()) * 37;
        if (this.smart_phone != null) {
            i2 = this.smart_phone.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode2 + i2) * 37;
        if (this.quick_shop_url != null) {
            i3 = this.quick_shop_url.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.quick_shop_name != null) {
            i4 = this.quick_shop_name.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        if (this.site_id != null) {
            i6 = this.site_id.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_image_url != null) {
            sb.append(", head_image_url=");
            sb.append(this.head_image_url);
        }
        if (!this.offline_info_list.isEmpty()) {
            sb.append(", offline_info_list=");
            sb.append(this.offline_info_list);
        }
        if (!this.challenge_list.isEmpty()) {
            sb.append(", challenge_list=");
            sb.append(this.challenge_list);
        }
        if (this.smart_phone != null) {
            sb.append(", smart_phone=");
            sb.append(this.smart_phone);
        }
        if (this.quick_shop_url != null) {
            sb.append(", quick_shop_url=");
            sb.append(this.quick_shop_url);
        }
        if (this.quick_shop_name != null) {
            sb.append(", quick_shop_name=");
            sb.append(this.quick_shop_name);
        }
        if (this.site_id != null) {
            sb.append(", site_id=");
            sb.append(this.site_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceInfoStructV2)) {
            return false;
        }
        CommerceInfoStructV2 commerceInfoStructV2 = (CommerceInfoStructV2) obj;
        if (!unknownFields().equals(commerceInfoStructV2.unknownFields()) || !Internal.equals(this.head_image_url, commerceInfoStructV2.head_image_url) || !this.offline_info_list.equals(commerceInfoStructV2.offline_info_list) || !this.challenge_list.equals(commerceInfoStructV2.challenge_list) || !Internal.equals(this.smart_phone, commerceInfoStructV2.smart_phone) || !Internal.equals(this.quick_shop_url, commerceInfoStructV2.quick_shop_url) || !Internal.equals(this.quick_shop_name, commerceInfoStructV2.quick_shop_name) || !Internal.equals(this.site_id, commerceInfoStructV2.site_id)) {
            return false;
        }
        return true;
    }

    public CommerceInfoStructV2(UrlStructV2 urlStructV2, List<OfflineInfoStructV2> list, List<ChallengeStructV2> list2, SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2, String str, String str2, String str3) {
        this(urlStructV2, list, list2, smartPhoneSettingsStructV2, str, str2, str3, ByteString.EMPTY);
    }

    public CommerceInfoStructV2(UrlStructV2 urlStructV2, List<OfflineInfoStructV2> list, List<ChallengeStructV2> list2, SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.head_image_url = urlStructV2;
        this.offline_info_list = Internal.immutableCopyOf("offline_info_list", list);
        this.challenge_list = Internal.immutableCopyOf("challenge_list", list2);
        this.smart_phone = smartPhoneSettingsStructV2;
        this.quick_shop_url = str;
        this.quick_shop_name = str2;
        this.site_id = str3;
    }
}
