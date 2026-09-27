//package com.hybris.training.customer.converters;
//
//import de.hybris.platform.commercefacades.user.data.AddressData;
//import de.hybris.platform.commercefacades.user.data.CustomerData;
//import de.hybris.platform.converters.Populator;
//import de.hybris.platform.core.model.user.AddressModel;
//import de.hybris.platform.core.model.user.CustomerModel;
//import de.hybris.platform.servicelayer.dto.converter.ConversionException;
//import de.hybris.platform.servicelayer.dto.converter.Converter;
//import org.springframework.util.Assert;
//
//public class ExtAddressCustomerReverseConverter  implements Populator<CustomerData, CustomerModel> {
//        private Converter<AddressData, AddressModel> addressReverseConverter;
//        @Override
//        public void populate(final CustomerData source, final CustomerModel target) throws ConversionException
//        {
//            Assert.notNull(source, "Parameter source cannot be null.");
//            Assert.notNull(target, "Parameter target cannot be null.");
//            target.setNickname(source.getNickname());
//            if (source.getWorkOfficeAddress() != null)
//            {
//                target.setWorkOfficeAddress(getAddressReverseConverter().convert(source.getWorkOfficeAddress()));
//            }
//        }
//        protected Converter<AddressData, AddressModel> getAddressReverseConverter()
//        {
//            return addressReverseConverter;
//        }
//
//        public void setAddressConverter(final Converter<AddressData, AddressModel> addressReverseConverter)
//        {
//            this.addressReverseConverter = addressReverseConverter;
//        }
//    }
