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

/* renamed from: com.ss.ugc.aweme.proto.AddressStructV2 */
public final class AddressStructV2 extends Message<AddressStructV2, Builder> {
    public static final ProtoAdapter<AddressStructV2> ADAPTER = new ProtoAdapter_AddressStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String address;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String city_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String country;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String country_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String district;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String province;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String simple_addr;

    /* renamed from: com.ss.ugc.aweme.proto.AddressStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AddressStructV2, Builder> {
        public String address;
        public String city;
        public String city_code;
        public String country;
        public String country_code;
        public String district;
        public String province;
        public String simple_addr;

        public final AddressStructV2 build() {
            AddressStructV2 addressStructV2 = new AddressStructV2(this.province, this.city, this.district, this.address, this.simple_addr, this.city_code, this.country, this.country_code, super.buildUnknownFields());
            return addressStructV2;
        }

        public final Builder address(String str) {
            this.address = str;
            return this;
        }

        public final Builder city(String str) {
            this.city = str;
            return this;
        }

        public final Builder city_code(String str) {
            this.city_code = str;
            return this;
        }

        public final Builder country(String str) {
            this.country = str;
            return this;
        }

        public final Builder country_code(String str) {
            this.country_code = str;
            return this;
        }

        public final Builder district(String str) {
            this.district = str;
            return this;
        }

        public final Builder province(String str) {
            this.province = str;
            return this;
        }

        public final Builder simple_addr(String str) {
            this.simple_addr = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AddressStructV2$ProtoAdapter_AddressStructV2 */
    static final class ProtoAdapter_AddressStructV2 extends ProtoAdapter<AddressStructV2> {
        public ProtoAdapter_AddressStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AddressStructV2.class);
        }

        public final int encodedSize(AddressStructV2 addressStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, addressStructV2.province) + ProtoAdapter.STRING.encodedSizeWithTag(2, addressStructV2.city) + ProtoAdapter.STRING.encodedSizeWithTag(3, addressStructV2.district) + ProtoAdapter.STRING.encodedSizeWithTag(4, addressStructV2.address) + ProtoAdapter.STRING.encodedSizeWithTag(5, addressStructV2.simple_addr) + ProtoAdapter.STRING.encodedSizeWithTag(6, addressStructV2.city_code) + ProtoAdapter.STRING.encodedSizeWithTag(7, addressStructV2.country) + ProtoAdapter.STRING.encodedSizeWithTag(8, addressStructV2.country_code) + addressStructV2.unknownFields().size();
        }

        public final AddressStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.province((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.city((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.district((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.address((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.simple_addr((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.city_code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.country((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.country_code((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AddressStructV2 addressStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addressStructV2.province);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, addressStructV2.city);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, addressStructV2.district);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, addressStructV2.address);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, addressStructV2.simple_addr);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, addressStructV2.city_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, addressStructV2.country);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, addressStructV2.country_code);
            protoWriter.writeBytes(addressStructV2.unknownFields());
        }
    }

    public AddressStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.province = this.province;
        builder.city = this.city;
        builder.district = this.district;
        builder.address = this.address;
        builder.simple_addr = this.simple_addr;
        builder.city_code = this.city_code;
        builder.country = this.country;
        builder.country_code = this.country_code;
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
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.province != null) {
            i = this.province.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.city != null) {
            i2 = this.city.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.district != null) {
            i3 = this.district.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.address != null) {
            i4 = this.address.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.simple_addr != null) {
            i5 = this.simple_addr.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.city_code != null) {
            i6 = this.city_code.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.country != null) {
            i7 = this.country.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.country_code != null) {
            i9 = this.country_code.hashCode();
        }
        int i17 = i16 + i9;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.province != null) {
            sb.append(", province=");
            sb.append(this.province);
        }
        if (this.city != null) {
            sb.append(", city=");
            sb.append(this.city);
        }
        if (this.district != null) {
            sb.append(", district=");
            sb.append(this.district);
        }
        if (this.address != null) {
            sb.append(", address=");
            sb.append(this.address);
        }
        if (this.simple_addr != null) {
            sb.append(", simple_addr=");
            sb.append(this.simple_addr);
        }
        if (this.city_code != null) {
            sb.append(", city_code=");
            sb.append(this.city_code);
        }
        if (this.country != null) {
            sb.append(", country=");
            sb.append(this.country);
        }
        if (this.country_code != null) {
            sb.append(", country_code=");
            sb.append(this.country_code);
        }
        StringBuilder replace = sb.replace(0, 2, "AddressStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddressStructV2)) {
            return false;
        }
        AddressStructV2 addressStructV2 = (AddressStructV2) obj;
        if (!unknownFields().equals(addressStructV2.unknownFields()) || !Internal.equals(this.province, addressStructV2.province) || !Internal.equals(this.city, addressStructV2.city) || !Internal.equals(this.district, addressStructV2.district) || !Internal.equals(this.address, addressStructV2.address) || !Internal.equals(this.simple_addr, addressStructV2.simple_addr) || !Internal.equals(this.city_code, addressStructV2.city_code) || !Internal.equals(this.country, addressStructV2.country) || !Internal.equals(this.country_code, addressStructV2.country_code)) {
            return false;
        }
        return true;
    }

    public AddressStructV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, ByteString.EMPTY);
    }

    public AddressStructV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.province = str;
        this.city = str2;
        this.district = str3;
        this.address = str4;
        this.simple_addr = str5;
        this.city_code = str6;
        this.country = str7;
        this.country_code = str8;
    }
}
