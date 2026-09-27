package com.hybris.training.customer.converters;

import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.util.Assert;

public class ExtAddressCustomerPopulator implements Populator<CustomerModel, CustomerData>
{
    private Converter<AddressModel, AddressData> addressConverter;
    @Override
    public void populate(final CustomerModel source, final CustomerData target) throws ConversionException
    {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");
        target.setNickname(source.getNickname());
        if (source.getWorkOfficeAddress() != null)
        {
            target.setWorkOfficeAddress(getAddressConverter().convert(source.getWorkOfficeAddress()));
        }
    }
    protected Converter<AddressModel, AddressData> getAddressConverter()
    {
        return addressConverter;
    }

    public void setAddressConverter(final Converter<AddressModel, AddressData> addressConverter)
    {
        this.addressConverter = addressConverter;
    }
}
