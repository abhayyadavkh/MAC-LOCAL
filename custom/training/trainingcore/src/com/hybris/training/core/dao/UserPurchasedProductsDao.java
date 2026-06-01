package com.hybris.training.core.dao;

import com.hybris.training.core.model.UserPurchasedProductsModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface UserPurchasedProductsDao {
    /**
     * Gets the user purchased product list.
     *
     * @param productModel
     *           the product model
     * @param b2bCustomerModel
     * @return the user purchased product list
     */
    List<UserPurchasedProductsModel> getUserPurchasedProductList(final ProductModel productModel, final CustomerModel b2bCustomerModel);


    /**
     * Show user purchased product list.
     *ß
     * @param b2bCustomerModel
     *           the b 2 b customer model
     * @return the list
     */
    List<UserPurchasedProductsModel> showUserPurchasedProductList(final CustomerModel b2bCustomerModel);


    /**
     * Gets the orders.
     *
     * @return the orders
     */
    List<OrderModel> getOrders();

}
