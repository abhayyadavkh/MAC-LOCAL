package com.hybris.training.core.dao.iml;

import com.hybris.training.core.dao.UserPurchasedProductsDao;
import com.hybris.training.core.model.UserPurchasedProductsModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public class UserPurchasedProductsDaoImpl implements UserPurchasedProductsDao {
    @Override
    public List<UserPurchasedProductsModel> getUserPurchasedProductList(ProductModel productModel, CustomerModel b2bCustomerModel) {
        return List.of();
    }

    @Override
    public List<UserPurchasedProductsModel> showUserPurchasedProductList(CustomerModel b2bCustomerModel) {
        return List.of();
    }

    @Override
    public List<OrderModel> getOrders() {
        return List.of();
    }
}
