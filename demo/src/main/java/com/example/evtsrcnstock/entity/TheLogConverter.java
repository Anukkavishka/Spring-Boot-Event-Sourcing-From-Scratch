package com.example.evtsrcnstock.entity;

public class TheLogConverter {

    public static CategoryLog categoryLogConverter(Category category){
        CategoryLog categoryLog=new CategoryLog();
        categoryLog.setCategoryId(category.getCategoryId());
        categoryLog.setCategoryName(category.getCategoryName());
        categoryLog.setCreatedDate(category.getCreatedDate());
        categoryLog.setCreatedUser(category.getCreatedUser());
        categoryLog.setModifiedDate(category.getModifiedDate());
        categoryLog.setModifiedUser(category.getModifiedUser());
        categoryLog.setVersion(category.getVersion());
        categoryLog.setTenancyId(category.getTenancyId());
        return categoryLog;
    }


    public static ProductLog productLogConverter(Product product){
        ProductLog productLog=new ProductLog();
        productLog.setProductId(product.getProductId());
        productLog.setCategoryid(product.getProductId());
        productLog.setCreatedDate(product.getCreatedDate());
        productLog.setCreatedUser(product.getCreatedUser());
        productLog.setModifiedDate(product.getModifiedDate());
        productLog.setModifiedUser(product.getModifiedUser());
        productLog.setProductIsService(product.isProductIsService());
        productLog.setProductName(product.getProductName());
        productLog.setProductBuyingPrice(product.getProductBuyingPrice());
        productLog.setProductSellingPrice(product.getProductSellingPrice());
        productLog.setVersion(product.getVersion());
        productLog.setTenancyId(product.getTenancyId());
        return productLog;
    }

    public static StockLog stockLogConverter(Stock stock){
        StockLog stockLog=new StockLog();
        stockLog.setStockId(stock.getStockId());
         stockLog.setProductId(stock.getProductId());
        stockLog.setQuantity(stock.getQuantity());
        return stockLog;
    }



}
