package com.dynamodb.model;

import java.util.Date;
import java.util.Objects;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedTimestamp;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ProductInfo")
public class Product {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String productId;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private Long price;

    @DynamoDBAttribute
    private String description;

    @DynamoDBAttribute
    @DynamoDBAutoGeneratedTimestamp(strategy = DynamoDBAutoGenerateStrategy.CREATE)
    private Date createdTimestamp;

    @DynamoDBAttribute
    @DynamoDBAutoGeneratedTimestamp(strategy = DynamoDBAutoGenerateStrategy.ALWAYS)
    private Date updatedTimestamp;

    public String getProductId() {
	return productId;
    }

    public void setProductId(String productId) {
	this.productId = productId;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Long getPrice() {
	return price;
    }

    public void setPrice(Long price) {
	this.price = price;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Date getCreatedTimestamp() {
	return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
	this.createdTimestamp = createdTimestamp;
    }

    public Date getUpdatedTimestamp() {
	return updatedTimestamp;
    }

    public void setUpdatedTimestamp(Date updatedTimestamp) {
	this.updatedTimestamp = updatedTimestamp;
    }

    @Override
    public int hashCode() {
	return Objects.hash(productId);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Product other = (Product) obj;
	return Objects.equals(productId, other.productId);
    }

    @Override
    public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", description="
		+ description + ", createdTimestamp=" + createdTimestamp + ", updatedTimestamp=" + updatedTimestamp
		+ "]";
    }

}
