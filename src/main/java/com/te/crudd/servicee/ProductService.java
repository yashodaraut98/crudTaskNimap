package com.te.crudd.servicee;

import java.util.List;

import com.te.crudd.dto.Product;

public interface ProductService {

Product save(Product pro);
List<Product> getProd();
//Product getById(int p_id);
Product updateProd(Product prod,int p_id);
void deleteProd(int p_id);

}
